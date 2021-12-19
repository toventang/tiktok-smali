package com.bytedance.sysoptimizer;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class HackHelperImpl {
    static {
        Covode.recordClassIndex(26984);
    }

    public static Constructor getConstructor(Class<?> cls, Class<?>... clsArr) {
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
        if (declaredConstructor != null && !declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    public static Field getField(Class<?> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (declaredField != null && !declaredField.isAccessible()) {
            declaredField.setAccessible(true);
        }
        return declaredField;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (declaredMethod != null && !declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod;
    }
}
