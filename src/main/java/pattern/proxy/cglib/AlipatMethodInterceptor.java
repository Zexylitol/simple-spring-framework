package pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yzz
 * @create 2022-05-15 20:02
 */
public class AlipatMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforePay();
        Object res = methodProxy.invokeSuper(o, objects);
        afterPay();
        return res;
    }
    private void afterPay() {
        System.out.println("Pay to imooc");
    }

    private void beforePay() {
        System.out.println("Withdraw money from the bank");
    }
}
