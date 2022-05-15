package pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yzz
 * @create 2022-05-15 19:36
 */
public class JdkDynamicProxyUtil {
    public static <T>T newProxyInstance(T targetObject, InvocationHandler handler) {
        ClassLoader classLoader = targetObject.getClass().getClassLoader();
        Class<?>[] interfaces = targetObject.getClass().getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
