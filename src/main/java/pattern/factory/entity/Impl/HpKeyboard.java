package pattern.factory.entity.Impl;

import pattern.factory.entity.Keyboard;

/**
 * @author yzz
 * @create 2022-04-20 14:19
 */
public class HpKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("I'am HpKeyboard");
    }
}
