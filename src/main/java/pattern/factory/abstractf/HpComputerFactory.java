package pattern.factory.abstractf;

import pattern.factory.entity.Impl.HpKeyboard;
import pattern.factory.entity.Impl.HpMouse;
import pattern.factory.entity.Keyboard;
import pattern.factory.entity.Mouse;

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
