package pattern.proxy;

import pattern.proxy.cglib.AlipatMethodInterceptor;
import pattern.proxy.cglib.CglibUtil;
import pattern.proxy.impl.AlipayToC;
import pattern.proxy.impl.CommonPayment;
import pattern.proxy.impl.ToCPaymentImpl;
import pattern.proxy.jdkproxy.AlipayInvocationHandler;
import pattern.proxy.jdkproxy.JdkDynamicProxyUtil;

/**
 * @author yzz
 * @create 2022-05-15 19:21
 */
public class ProxyDemo {
    public static void main(String[] args) {
        // 静态代理模式
        ToCPayment toCProxy = new AlipayToC(new ToCPaymentImpl());
        toCProxy.pay();
        // JDK 动态代理
        ToCPayment toCPayment = new ToCPaymentImpl();
        AlipayInvocationHandler handler = new AlipayInvocationHandler(toCPayment);
        ToCPayment toCProxy1 = JdkDynamicProxyUtil.newProxyInstance(toCPayment, handler);
        toCProxy1.pay();
        // Cglib
        CommonPayment commonPayment = new CommonPayment();
        AlipatMethodInterceptor alipatMethodInterceptor = new AlipatMethodInterceptor();
        CommonPayment commonPaymentProxy = CglibUtil.createProxy(commonPayment, alipatMethodInterceptor);
        commonPaymentProxy.pay();
    }
}
