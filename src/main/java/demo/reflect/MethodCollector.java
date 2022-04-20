package demo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取成员方法：
 *
 *  Method[] getMethods() ： 获取所有”公有方法"(包含了父类的方法也包含Object类)
 *  Method[] getDeclaredMethods() ： 获取所有的成员方法,包括私有的(不包括继承的)
 *
 *  Method getMethod(String name, Class<?>... parameterTypes)
 *      name : 方法名
 *      Class : 形参的Class类型对象
 *  Method getDeclaredMethod(String name, Class<?>... parameterTypes)
 *
 * 调用方法:
 *  Method --> public Object invoke(Object obj, Object... args)
 *      obj: 要调用方法的对象
 *      args: 调用方法时所传递的实参
 *
 * @author yzz
 * @create 2022-04-20 16:17
 */
public class MethodCollector {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("demo.reflect.ReflectTarget");
        System.out.println("-----------------获取所有公有的方法----------------");
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println("-----------------获取所有的方法----------------");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }

        System.out.println("----------------获取公有的单个方法并调用----------------");
        Method show1 = clazz.getMethod("show1", String.class);
        System.out.println(show1);
        ReflectTarget reflectTarget = (ReflectTarget) clazz.getConstructor().newInstance();
        show1.invoke(reflectTarget, "reflect method one");

        System.out.println("----------------获取私有的单个方法并调用----------------");
        Method show4 = clazz.getDeclaredMethod("show4", int.class);
        System.out.println(show4);
        show4.setAccessible(true);
        String result = String.valueOf(show4.invoke(reflectTarget, 20));
        System.out.println("result = " +result);
    }
}
