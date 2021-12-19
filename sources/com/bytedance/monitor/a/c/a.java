package com.bytedance.monitor.a.c;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static a f41397a;

    static {
        Covode.recordClassIndex(25371);
    }

    a() {
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_monitor_util_unsafe_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_monitor_util_unsafe_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
