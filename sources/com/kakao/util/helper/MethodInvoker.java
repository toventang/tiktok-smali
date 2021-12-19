package com.kakao.util.helper;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public final class MethodInvoker {
    static {
        Covode.recordClassIndex(34484);
    }

    private static Object com_kakao_util_helper_MethodInvoker_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_kakao_util_helper_MethodInvoker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_kakao_util_helper_MethodInvoker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private static Method findMethod(String str, Method[] methodArr) {
        for (Method method : methodArr) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static void invoke(Object obj, String str, Object... objArr) {
        Method findMethod;
        if (obj != null) {
            for (Class<?> cls = obj.getClass(); !cls.equals(Object.class); cls = cls.getSuperclass()) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                if (declaredMethods != null && (findMethod = findMethod(str, declaredMethods)) != null) {
                    com_kakao_util_helper_MethodInvoker_java_lang_reflect_Method_invoke(findMethod, obj, objArr);
                    return;
                }
            }
            return;
        }
        throw new RuntimeException("methodOwnerClass is null.");
    }
}
