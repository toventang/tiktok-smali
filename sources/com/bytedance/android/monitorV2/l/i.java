package com.bytedance.android.monitorV2.l;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.monitorV2.i.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public final class i {
    static {
        Covode.recordClassIndex(14165);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitorV2_util_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitorV2_util_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static Object a(Class<?> cls, String str, Object... objArr) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            Object[] objArr2 = new Object[0];
            try {
                Method a2 = a(cls, str, (Class<?>[]) new Class[0]);
                if (a2 == null) {
                    return null;
                }
                a2.setAccessible(true);
                if (objArr.length > 0) {
                    return a(a2, objArr[0], objArr2);
                }
                return a(a2, (Object) null, objArr2);
            } catch (Throwable th) {
                b.c("ReflectUtils", "exception in invokeMethod, pkg : " + cls.getName() + ", function : " + str + ", " + th.toString());
            }
        }
        return null;
    }

    public static Method a(Class<?> cls, String str, Class<?>[] clsArr) {
        Method method = null;
        if (cls == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            method = cls.getMethod(str, clsArr);
            return method;
        } catch (Throwable unused) {
            return method;
        }
    }
}
