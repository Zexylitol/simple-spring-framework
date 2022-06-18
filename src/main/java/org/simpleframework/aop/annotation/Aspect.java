package org.simpleframework.aop.annotation;

import java.lang.annotation.*;

/**
 * @author yzz
 * @create 2022-05-15 20:28
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    // 需要被织入横切逻辑的注解标签
    Class<? extends Annotation> value();
}
