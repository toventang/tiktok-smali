package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericsUtils {
    static {
        Covode.recordClassIndex(95343);
    }

    public static Class getSuperClassGenericType(Class cls) {
        return getSuperClassGenericType(cls, 0);
    }

    public static Class getSuperClassGenericType(Class cls, int i2) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        if (i2 >= actualTypeArguments.length || i2 < 0 || !(actualTypeArguments[i2] instanceof Class)) {
            return Object.class;
        }
        return (Class) actualTypeArguments[i2];
    }
}
