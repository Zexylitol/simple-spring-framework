package pattern.factory.simple;

import pattern.factory.entity.Impl.DellMouse;
import pattern.factory.entity.Impl.HpMouse;
import pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-19 20:41
 */
public class MouseFactory {
    public static Mouse createMouse(int type) {
        switch (type) {
            case 0 : return new DellMouse();
            case 1 : return new HpMouse();
            default:return new DellMouse();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(1);
        mouse.sayHi();
    }
}
