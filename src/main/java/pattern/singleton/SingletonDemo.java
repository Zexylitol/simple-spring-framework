package pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yzz
 * @create 2022-04-22 21:49
 */
public class SingletonDemo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println(StarvingSingleton.getInstance());
        System.out.println(StarvingSingleton.getInstance());

        // 通过反射破坏单例模式（序列化也可以）
        Class<?> clazz = StarvingSingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println(constructor.newInstance());

        System.out.println(LazyDoubleCheckSingleton.getInstance());
        System.out.println(LazyDoubleCheckSingleton.getInstance());

        // 通过反射破坏单例模式（序列化也可以）
        Class<?> clazz1 = LazyDoubleCheckSingleton.class;
        Constructor<?> constructor1 = clazz1.getDeclaredConstructor();
        constructor1.setAccessible(true);
        System.out.println(constructor1.newInstance());

        System.out.println(EnumStarvingSingleton.getInstance());
        Class<?> clazz2 = EnumStarvingSingleton.class;
        Constructor<?> constructor2 = clazz2.getDeclaredConstructor();
        constructor2.setAccessible(true);
        EnumStarvingSingleton enumStarvingSingleton = (EnumStarvingSingleton) constructor2.newInstance();
        System.out.println(enumStarvingSingleton.getInstance());
    }
}
