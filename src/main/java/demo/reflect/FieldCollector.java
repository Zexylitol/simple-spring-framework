package demo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取成员变量并调用:
 *
 *  1. 批量的
 *      1) Field[] getFields() ：获取所有public修饰的成员变量，包括继承字段
 *      2) Field[] getDeclaredFields(): 获取所有的成员变量，不考虑修饰符，不包括继承字段
 *  2. 获取单个的
 *      1) Field getField(String name) 获取指定名称的 public修饰的成员变量
 *      2) Field getDeclaredField(String name)
 *
 *  设置字段的值：
 *      Field --> public void set(Object obj, Object value)
 *          obj: 指明设置哪个对象的属性
 *          value: 将此属性设置为多少
 *
 * @author yzz
 * @create 2022-04-20 15:39
 */
public class FieldCollector {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("demo.reflect.ReflectTarget");
        System.out.println("-----------------获取所有公有的字段----------------");
        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("----------------获取所有的字段-----------------");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }

        System.out.println("----------------获取公有的单个字段并调用----------------");
        Field name = clazz.getField("name");
        System.out.println(name);
        ReflectTarget reflectTarget = (ReflectTarget) clazz.getConstructor().newInstance();
        name.set(reflectTarget, "reflect one");
        System.out.println(reflectTarget.name);

        System.out.println("----------------获取私有的单个字段并调用----------------");
        Field targetInfo = clazz.getDeclaredField("targetInfo");
        System.out.println(targetInfo);
        targetInfo.setAccessible(true);
        targetInfo.set(reflectTarget, "123456789");
        System.out.println(reflectTarget);
    }
}
