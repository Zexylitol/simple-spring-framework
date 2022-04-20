package pattern.factory.method;

import pattern.factory.entity.Impl.HpMouse;
import pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-19 20:50
 */
public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
