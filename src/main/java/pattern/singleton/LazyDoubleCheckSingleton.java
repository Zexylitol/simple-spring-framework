package pattern.singleton;

import java.util.Objects;

/**
 * @author yzz
 * @create 2022-04-22 16:07
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        // 第一次检测
        if (Objects.isNull(instance)) {
            // 同步
            synchronized (LazyDoubleCheckSingleton.class) {
                if (Objects.isNull(instance)) {
                    // memory = allocate();    // 1. 分配对象内存空间
                    // instance(memory);       // 2. 初始化对象
                    // instance = memory;      // 3. 设置 instance 指向刚分配的内存地址，此时 instance != null
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
