package pattern.factory.method;

import pattern.factory.entity.Impl.IBMMouse;
import pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-19 20:57
 */
public class IBMMouseFactory extends HpMouseFactory {
    @Override
    public Mouse createMouse() {
        return new IBMMouse();
    }
}
