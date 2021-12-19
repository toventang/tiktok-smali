package com.bytedance.common.utility.reflect;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f26971a;

    /* renamed from: com.bytedance.common.utility.reflect.a$a  reason: collision with other inner class name */
    public static class C0579a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends T> f26972a;

        /* renamed from: b  reason: collision with root package name */
        public final T f26973b;

        static {
            Covode.recordClassIndex(15926);
        }
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_utility_reflect_JavaCalls_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_utility_reflect_JavaCalls_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            clsArr[i2] = obj != null ? obj instanceof C0579a ? ((C0579a) obj).f26972a : obj.getClass() : null;
        }
        return clsArr;
    }

    static {
        Covode.recordClassIndex(15925);
        HashMap hashMap = new HashMap();
        f26971a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Float.class, Float.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        Class cls = Boolean.TYPE;
        hashMap.put(cls, cls);
        Class cls2 = Byte.TYPE;
        hashMap.put(cls2, cls2);
        Class cls3 = Character.TYPE;
        hashMap.put(cls3, cls3);
        Class cls4 = Short.TYPE;
        hashMap.put(cls4, cls4);
        Class cls5 = Integer.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Float.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Long.TYPE;
        hashMap.put(cls7, cls7);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    private static Object[] b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null || !(obj instanceof C0579a)) {
                objArr2[i2] = obj;
            } else {
                objArr2[i2] = ((C0579a) obj).f26973b;
            }
        }
        return objArr2;
    }

    public static <T> T a(Object obj, String str) {
        try {
            return (T) b(obj, str);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private static <T> T b(Object obj, String str) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    public static Object a(String str, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Object[] b2 = b(objArr);
            return cls.getConstructor(a(b2)).newInstance(b(b2));
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            if (clsArr2 == null || clsArr2.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr2 == null) {
            if (clsArr.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i2 = 0; i2 < clsArr.length; i2++) {
                if (!clsArr[i2].isAssignableFrom(clsArr2[i2])) {
                    Map<Class<?>, Class<?>> map = f26971a;
                    if (!map.containsKey(clsArr[i2]) || !map.get(clsArr[i2]).equals(map.get(clsArr2[i2]))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static <T> T a(Object obj, String str, Object... objArr) {
        try {
            return (T) a(a(obj.getClass(), str, a(objArr)), obj, b(objArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return (T) a(a(Class.forName(str), str2, a(objArr)), (Object) null, b(objArr));
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        while (true) {
            Method a2 = a(cls.getDeclaredMethods(), str, clsArr);
            if (a2 != null) {
                a2.setAccessible(true);
                return a2;
            } else if (cls.getSuperclass() != null) {
                cls = cls.getSuperclass();
            } else {
                throw new NoSuchMethodException();
            }
        }
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        Objects.requireNonNull(str, "Method name must not be null.");
        for (Method method : methodArr) {
            if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }
}
