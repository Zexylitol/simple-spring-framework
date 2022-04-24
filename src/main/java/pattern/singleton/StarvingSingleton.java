package pattern.singleton;

/**
 * @author yzz
 * @create 2022-04-22 16:03
 */
public class StarvingSingleton {
    private static final StarvingSingleton starvingSingleton = new StarvingSingleton();

    /**
     * 私有构造方法（外界无法实例化该类，但不能防止反射创建新的实例）
     */
    private StarvingSingleton() {

    }
    public static StarvingSingleton getInstance() {
        return starvingSingleton;
    }

}
