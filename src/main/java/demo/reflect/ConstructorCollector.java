package demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过Class对象可以获取某个类中的:构造方法;
 *
 * 获取构造方法:
 *  1) 批量的方法:
 *      public Constructor[] getConstructors(): 获取当前运行时类中声明为public的构造器
 *      public Constructor[] getDeclaredConstructors(): 获取当前运行时类中声明的所有的构造器（包括私有、受保护、默认、公有）
 *  2) 获取单个的方法,并调用:
 *      public Constructor[] getConstructors(Class...parameterTypes): 获取单个 公有的 构造方法
 *      public Constructor[] getDeclaredConstructors(Class...parameterTypes)
 *
 * 调用构造方法:
 *  Constructor --> newInstance(Object...initargs)
 *
 * @author yzz
 * @create 2022-04-20 15:16
 */
public class ConstructorCollector {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("demo.reflect.ReflectTarget");
        System.out.println("-----------------获取所有公有构造方法----------------");
        Constructor<?>[] constructor = clazz.getConstructors();
        for (Constructor c : constructor) {
            System.out.println(c);
        }

        System.out.println("----------------获取所有的构造方法-----------------");
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }

        System.out.println("----------------获取公有的单个构造方法----------------");
        Constructor<?> constructor1 = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor1);

        System.out.println("--------------获取私有的单个构造方法--------------");
        Constructor<?> constructor2 = clazz.getDeclaredConstructor(int.class);
        System.out.println(constructor2);
        System.out.println("---------------调用私有构造方法创建实例--------------");
        // 暴力访问（忽略掉访问修饰符）
        constructor2.setAccessible(true);
        ReflectTarget instance = (ReflectTarget) constructor2.newInstance(1);
    }
}
