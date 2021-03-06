package pattern.factory.method;

import pattern.factory.entity.Impl.DellMouse;
import pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-19 20:51
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
