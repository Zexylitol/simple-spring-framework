package com.uestc.pattern.factory.entity.Impl;

import com.uestc.pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-19 20:40
 */
public class HpMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("I'am HpMouse");
    }
}
