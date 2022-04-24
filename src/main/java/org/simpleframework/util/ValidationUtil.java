package org.simpleframework.util;

import java.util.Collection;
import java.util.Map;

/**
 * @author yzz
 * @create 2022-04-24 10:26
 */
public class ValidationUtil {
    /**
     * 判断 Collection 是否为 Null 或 size 为 0
     *
     * @param obj Collection
     * @return 是否为空
     */
    public static boolean isEmpty(Collection<?> obj) {
        return obj == null || obj.isEmpty();
    }

    /**
     * String 是否为 null 或 ""
     *
     * @param obj String
     * @return 是否为空
     */
    public static boolean isEmpty(String obj) {
        return (obj == null || "".equals(obj));
    }

    /**
     * Array 是否为 null 或者 size 为 0
     *
     * @param obj Array
     * @return 是否为空
     */
    public static boolean isEmpty(Object[] obj) {
        return obj == null || obj.length == 0;
    }

    /**
     * Map 是否为 null 或者 size 为 0
     *
     * @param obj Map
     * @return 是否为空
     */
    public static boolean isEmpty(Map<?, ?> obj) {
        return obj == null || obj.isEmpty();
    }
}
