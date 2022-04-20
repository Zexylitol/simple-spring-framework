package com.uestc.pattern.factory.abstractf;

import com.uestc.pattern.factory.entity.Impl.HpKeyboard;
import com.uestc.pattern.factory.entity.Impl.HpMouse;
import com.uestc.pattern.factory.entity.Keyboard;
import com.uestc.pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-20 14:25
 */
public class HpComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
