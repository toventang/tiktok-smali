package com.bytedance.sysoptimizer;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class HackHelper {
    private static Map<String, Constructor> sConstructorCache = new HashMap();
    private static Map<String, Field> sFieldCache = new HashMap();
    private static boolean sInited = false;
    private static Map<String, Method> sMethodCache = new HashMap();

    public static void init() {
        if (!sInited) {
            try {
                writeField(HackHelperImpl.class, "classLoader", (Object) null);
            } catch (Exception unused) {
            }
            sInited = true;
        }
    }

    static {
        Covode.recordClassIndex(26983);
    }

    private static <T> void checkNotNull(T t, String str) {
        if (t == null) {
            throw new IllegalArgumentException(str);
        }
    }

    private static void checkTrue(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    private static String getFieldKey(Class<?> cls, String str) {
        return cls.getName() + "#" + str;
    }

    public static Constructor getConstructor(Class<?> cls, Class<?>... clsArr) {
        Constructor constructor;
        MethodCollector.i(10439);
        checkNotNull(cls, "The class must not be null !!!");
        String methodKey = getMethodKey(cls, "clinit", clsArr);
        synchronized (sConstructorCache) {
            try {
                constructor = sConstructorCache.get(methodKey);
            } finally {
                MethodCollector.o(10439);
            }
        }
        if (constructor != null) {
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            return constructor;
        }
        try {
            Constructor constructor2 = HackHelperImpl.getConstructor(cls, clsArr);
            if (constructor2 != null) {
                synchronized (sConstructorCache) {
                    try {
                        sConstructorCache.put(methodKey, constructor2);
                    } finally {
                        MethodCollector.o(10439);
                    }
                }
            }
            return constructor2;
        } catch (Throwable unused) {
            MethodCollector.o(10439);
            return null;
        }
    }

    public static Field getField(Class<?> cls, String str) {
        Field field;
        MethodCollector.i(10125);
        checkNotNull(cls, "The class must not be null !!!");
        checkTrue(!TextUtils.isEmpty(str), "The field name must not be blank !!!");
        String fieldKey = getFieldKey(cls, str);
        synchronized (sFieldCache) {
            try {
                field = sFieldCache.get(fieldKey);
            } finally {
                MethodCollector.o(10125);
            }
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        try {
            Field field2 = HackHelperImpl.getField(cls, str);
            if (field2 != null) {
                synchronized (sFieldCache) {
                    try {
                        sFieldCache.put(fieldKey, field2);
                    } finally {
                        MethodCollector.o(10125);
                    }
                }
            }
            return field2;
        } catch (Throwable unused) {
            MethodCollector.o(10125);
            return null;
        }
    }

    private static void writeField(Object obj, String str, Object obj2) {
        checkNotNull(obj, "target object must not be null");
        Field field = getField(obj.getClass(), str);
        if (field != null) {
            writeField(field, obj, obj2);
        }
    }

    private static String getMethodKey(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName()).append("#").append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.getName());
        } else {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.getName()).append("#");
            }
        }
        return sb.toString();
    }

    private static void writeField(Field field, Object obj, Object obj2) {
        checkNotNull(field, "The field must not be null");
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        field.set(obj, obj2);
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        MethodCollector.i(10293);
        checkNotNull(cls, "The class must not be null !!!");
        checkTrue(!TextUtils.isEmpty(str), "The method name must not be blank !!!");
        String methodKey = getMethodKey(cls, str, clsArr);
        synchronized (sMethodCache) {
            try {
                method = sMethodCache.get(methodKey);
            } finally {
                MethodCollector.o(10293);
            }
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        try {
            Method method2 = HackHelperImpl.getMethod(cls, str, clsArr);
            if (method2 != null) {
                synchronized (sMethodCache) {
                    try {
                        sMethodCache.put(methodKey, method2);
                    } finally {
                        MethodCollector.o(10293);
                    }
                }
            }
            return method2;
        } catch (Throwable unused) {
            MethodCollector.o(10293);
            return null;
        }
    }
}
