package com.uestc.pattern.factory.abstractf;

import com.uestc.pattern.factory.entity.Keyboard;
import com.uestc.pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-20 14:22
 */
public interface ComputerFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
}
