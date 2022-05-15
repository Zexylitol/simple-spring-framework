package pattern.proxy.impl;

import pattern.proxy.ToCPayment;

/**
 * @author yzz
 * @create 2022-05-15 19:18
 */
public class AlipayToC implements ToCPayment {
    ToCPayment toCPayment;

    public AlipayToC(ToCPayment toCPayment) {
        this.toCPayment = toCPayment;
    }

    @Override
    public void pay() {
        beforePay();
        toCPayment.pay();
        afterPay();
    }

    private void afterPay() {
        System.out.println("Pay to imooc");
    }

    private void beforePay() {
        System.out.println("Withdraw money from the bank");
    }
}
