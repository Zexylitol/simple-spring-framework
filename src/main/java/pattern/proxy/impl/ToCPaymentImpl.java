package pattern.proxy.impl;

import pattern.proxy.ToCPayment;

/**
 * @author yzz
 * @create 2022-05-15 19:16
 */
public class ToCPaymentImpl implements ToCPayment {
    @Override
    public void pay() {
        System.out.println("Pay by customer");
    }
}
