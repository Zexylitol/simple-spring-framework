package com.uestc.pattern.factory.entity.Impl;

import com.uestc.pattern.factory.entity.Keyboard;

/**
 * @author yzz
 * @create 2022-04-20 14:18
 */
public class DellKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("I'am DellKeyboard");
    }
}
