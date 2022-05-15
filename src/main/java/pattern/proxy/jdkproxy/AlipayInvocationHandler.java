package pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yzz
 * @create 2022-05-15 19:33
 */
public class AlipayInvocationHandler implements InvocationHandler {

    private Object targetObject;

    public AlipayInvocationHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforePay();
        Object res = method.invoke(targetObject, args);
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
