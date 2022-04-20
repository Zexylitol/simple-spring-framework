package com.uestc.pattern.factory.abstractf;

import com.uestc.pattern.factory.entity.Keyboard;
import com.uestc.pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-20 14:26
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory cf = new HpComputerFactory();
        Keyboard keyboard = cf.createKeyboard();
        Mouse mouse = cf.createMouse();
        keyboard.sayHello();
        mouse.sayHi();
    }
}
