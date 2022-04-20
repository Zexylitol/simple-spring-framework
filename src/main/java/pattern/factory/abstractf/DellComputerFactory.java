package pattern.factory.abstractf;

import pattern.factory.entity.Impl.DellKeyboard;
import pattern.factory.entity.Impl.DellMouse;
import pattern.factory.entity.Keyboard;
import pattern.factory.entity.Mouse;

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
