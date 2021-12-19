package com.benchmark.tools;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f6367a;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends T> f6368a;

        /* renamed from: b  reason: collision with root package name */
        public final T f6369b;

        static {
            Covode.recordClassIndex(3059);
        }
    }

    static {
        Covode.recordClassIndex(3058);
        HashMap hashMap = new HashMap();
        f6367a = hashMap;
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

    public static <T> T a(String str, String str2, Object... objArr) {
        Method method;
        boolean z;
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName(str);
            Class<?>[] clsArr = new Class[4];
            for (int i2 = 0; i2 < 4; i2++) {
                Object obj = objArr[i2];
                if (obj != null && (obj instanceof a)) {
                    cls = ((a) obj).f6368a;
                } else if (obj == null) {
                    cls = null;
                } else {
                    cls = obj.getClass();
                }
                clsArr[i2] = cls;
            }
            while (true) {
                Method[] declaredMethods = cls2.getDeclaredMethods();
                int length = declaredMethods.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i3];
                    if (method.getName().equals(str2)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes != null) {
                            if (parameterTypes.length == 4) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= parameterTypes.length) {
                                        z = true;
                                        break;
                                    }
                                    if (!parameterTypes[i4].isAssignableFrom(clsArr[i4])) {
                                        Map<Class<?>, Class<?>> map = f6367a;
                                        if (!map.containsKey(parameterTypes[i4])) {
                                            break;
                                        } else if (!map.get(parameterTypes[i4]).equals(map.get(clsArr[i4]))) {
                                            break;
                                        }
                                    }
                                    i4++;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            break;
                        }
                    }
                    i3++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    Object[] objArr2 = new Object[4];
                    for (int i5 = 0; i5 < 4; i5++) {
                        Object obj2 = objArr[i5];
                        if (obj2 == null || !(obj2 instanceof a)) {
                            objArr2[i5] = obj2;
                        } else {
                            objArr2[i5] = ((a) obj2).f6369b;
                        }
                    }
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{null, objArr2}, 110000, "java.lang.Object", true, "com_benchmark_tools_BTCJavaCalls_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        return (T) a2.second;
                    }
                    T t = (T) method.invoke(null, objArr2);
                    com.bytedance.helios.sdk.a.a(t, method, new Object[]{null, objArr2}, "com_benchmark_tools_BTCJavaCalls_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return t;
                } else if (cls2.getSuperclass() != null) {
                    cls2 = cls2.getSuperclass();
                } else {
                    throw new NoSuchMethodException();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
