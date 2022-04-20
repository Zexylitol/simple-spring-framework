package pattern.factory.entity.Impl;

import pattern.factory.entity.Mouse;

/**
 * @author yzz
 * @create 2022-04-19 20:57
 */
public class IBMMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("I'am IBMMouse");
    }
}
