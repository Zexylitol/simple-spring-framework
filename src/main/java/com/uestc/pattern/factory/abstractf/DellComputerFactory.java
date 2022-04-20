package com.uestc.pattern.factory.abstractf;

import com.uestc.pattern.factory.entity.Impl.DellKeyboard;
import com.uestc.pattern.factory.entity.Impl.DellMouse;
import com.uestc.pattern.factory.entity.Keyboard;
import com.uestc.pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-20 14:23
 */
public class DellComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
