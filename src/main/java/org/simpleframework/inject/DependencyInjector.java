package org.simpleframework.inject;

import lombok.extern.slf4j.Slf4j;
import org.simpleframework.core.BeanContainer;
import org.simpleframework.inject.annotation.Autowired;
import org.simpleframework.util.ClassUtil;
import org.simpleframework.util.ValidationUtil;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.Set;

/**
 * @author yzz
 * @create 2022-04-24 20:04
 */
@Slf4j
public class DependencyInjector {
    /**
     * Bean 容器
     */
    private BeanContainer beanContainer;
    public DependencyInjector() {
        beanContainer = BeanContainer.getInstance();
    }

    /**
     * 执行IOC
     */
    public void doIoc() {
        if (ValidationUtil.isEmpty(beanContainer.getClasses())) {
            log.warn("Empty classSet in BeanContainer!");
            return ;
        }
        // 1. 遍历Bean容器中所有的Class对象
        for (Class<?> clazz : beanContainer.getClasses()) {
            // 2.遍历Class对象的所有成员变量
            Field[] fields = clazz.getDeclaredFields();
            if (ValidationUtil.isEmpty(fields)) {
                continue ;
            }
            for (Field field : fields) {
                // 3.找出被Autowired标记的成员变量
                if (field.isAnnotationPresent(Autowired.class)) {
                    Autowired autowired = field.getAnnotation(Autowired.class);
                    String autowiredValue = autowired.value();
                    // 4.获取这些成员变量的类型
                    Class<?> fieldClass = field.getType();
                    // 5.获取这些成员变量的类型在容器里对应的实例
                    Object fieldValue = getFieldInstance(fieldClass, autowiredValue);
                    if (Objects.isNull(fieldValue)) {
                        throw new RuntimeException("Unable to inject relevant type, target fieldClass is: " + fieldClass.getName());
                    }
                    // 6.通过反射将对应的成员变量实例注入到成员变量所在类的实例里
                    Object targetBean = beanContainer.getBean(clazz);
                    ClassUtil.setField(field, targetBean, fieldValue, true);
                }
            }
        }
    }

    /**
     * 根据 Class 在 beanContainer 里获取其实例或者实现类
     */
    private Object getFieldInstance(Class<?> fieldClass, String autowiredValue) {
        Object fieldValue = beanContainer.getBean(fieldClass);
        if (Objects.nonNull(fieldValue)) {
            return fieldValue;
        }
        Class<?> implementedClass = getImplementClass(fieldClass, autowiredValue);
        if (Objects.nonNull(implementedClass)) {
            return beanContainer.getBean(implementedClass);
        }
        return null;
    }

    /**
     * 获取接口的实现类
     */
    private Class<?> getImplementClass(Class<?> fieldClass, String autowiredValue) {
        Set<Class<?>> classSet = beanContainer.getClassesBySuper(fieldClass);
        if (!ValidationUtil.isEmpty(classSet)) {
            if (ValidationUtil.isEmpty(autowiredValue)) {
                if (classSet.size() == 1) {
                    return classSet.iterator().next();
                } else {
                    // 如果多于两个实现类且用户未指定其中一个实现类，则抛出异常
                    throw new RuntimeException("Multiple implemented classes for " + fieldClass.getName() + " please set @Autowred's value to pick one!");
                }
            } else {
                for (Class<?> clazz : classSet) {
                    if (autowiredValue.equals(clazz.getSimpleName())) {
                        return clazz;
                    }
                }
            }
        }
        return null;
    }
}
