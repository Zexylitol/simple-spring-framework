package demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author yzz
 * @create 2022-04-21 11:39
 */
public class AnnotationParser {
    /**
     * 解析类上的注解
     */
    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("demo.annotation.UestcCourse");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation) annotation;
            System.out.println(courseInfoAnnotation.name() + " " +
                    courseInfoAnnotation.tag() + " " +
                    courseInfoAnnotation.profile() + " " +
                    courseInfoAnnotation.index());
        }
    }

    /**
     * 解析成员变量上的标签
     */
    public static void parseFieldAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("demo.annotation.UestcCourse");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            // 判断成员变量中是否有指定注解类型的注解
            boolean hasAnnotation = f.isAnnotationPresent(PersonInfoAnnotation.class);
            if (hasAnnotation) {
                PersonInfoAnnotation personInfoAnnotation = f.getAnnotation(PersonInfoAnnotation.class);
                System.out.println(personInfoAnnotation.name() + " " +
                        personInfoAnnotation.age() + " " +
                        personInfoAnnotation.gender() + " " +
                        Arrays.toString(personInfoAnnotation.language()));
            }
        }
    }

    /**
     * 解析方法上的注解
     */
    public static void parseMethodAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("demo.annotation.UestcCourse");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            // 判断方法上是否有指定注解类型的注解
            boolean hasAnnotation = method.isAnnotationPresent(CourseInfoAnnotation.class);
            if (hasAnnotation) {
                CourseInfoAnnotation courseInfoAnnotation = method.getAnnotation(CourseInfoAnnotation.class);
                System.out.println(courseInfoAnnotation.name() + " " +
                        courseInfoAnnotation.tag() + " " +
                        courseInfoAnnotation.profile() + " " +
                        courseInfoAnnotation.index());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        parseTypeAnnotation();
        parseFieldAnnotation();
//        parseMethodAnnotation();
    }
}
