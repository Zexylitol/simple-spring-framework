package com.uestc.pattern.factory.method;

import com.uestc.pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-19 20:53
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        MouseFactory mf = new HpMouseFactory();
        Mouse mouse = mf.createMouse();
        mouse.sayHi();

        MouseFactory mouseFactory = new IBMMouseFactory();
        Mouse mouse1 = mouseFactory.createMouse();
        mouse1.sayHi();
    }
}
