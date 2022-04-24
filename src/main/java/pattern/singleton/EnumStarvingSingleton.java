package pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yzz
 * @create 2022-04-22 22:01
 */
public class EnumStarvingSingleton {

    private EnumStarvingSingleton() {}

    public static EnumStarvingSingleton getInstance() {
        return ContainerHolder.HOLDER.instance;
    }

    /**
     * 枚举
     */
    private enum ContainerHolder {
        HOLDER;
        private EnumStarvingSingleton instance;
        ContainerHolder() {
            instance = new EnumStarvingSingleton();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class<ContainerHolder> clazz = ContainerHolder.class;
//        Constructor<ContainerHolder> constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        System.out.println(EnumStarvingSingleton.getInstance());
//        System.out.println(constructor.newInstance());

        Class<ContainerHolder> clazz = ContainerHolder.class;
        Constructor<ContainerHolder> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        System.out.println(EnumStarvingSingleton.getInstance());
        System.out.println(constructor.newInstance());
    }
}
