package com.bytedance.monitor.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Method> f41404a = new HashMap();

    static {
        Covode.recordClassIndex(25374);
    }

    private static Method a(Method method) {
        if (method == null || !Modifier.isPublic(method.getModifiers()) || method.isSynthetic()) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method d2 = d(declaringClass, name, parameterTypes);
        if (d2 == null) {
            return c(declaringClass, name, parameterTypes);
        }
        return d2;
    }

    public static Object a(Class cls, String str, Object... objArr) {
        Object[] b2 = f.b(objArr);
        return a(cls, str, b2, f.a(b2));
    }

    private static Method c(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        String b2 = b(cls, str, clsArr);
        synchronized (f41404a) {
            method = f41404a.get(b2);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        Method a2 = a(cls.getMethod(str, clsArr));
        synchronized (f41404a) {
            f41404a.put(b2, a2);
        }
        return a2;
    }

    private static String b(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString()).append("#").append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.toString());
        } else {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.toString()).append("#");
            }
        }
        return sb.toString();
    }

    private static Method d(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i2 = 0; i2 < interfaces.length; i2++) {
                if (Modifier.isPublic(interfaces[i2].getModifiers())) {
                    try {
                        return interfaces[i2].getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method d2 = d(interfaces[i2], str, clsArr);
                        if (d2 != null) {
                            return d2;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method e(java.lang.Class<?> r10, java.lang.String r11, java.lang.Class<?>... r12) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.a.e.e(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private static Object a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            clsArr = f.f41406b;
        }
        Object[] b2 = f.b(objArr);
        Method e2 = e(cls, str, clsArr);
        if (e2 != null) {
            Pair<Boolean, Object> a2 = a.a(e2, new Object[]{null, b2}, 110000, "java.lang.Object", true, "com_bytedance_monitor_util_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = e2.invoke(null, b2);
            a.a(invoke, e2, new Object[]{null, b2}, "com_bytedance_monitor_util_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + cls.getName());
    }
}
