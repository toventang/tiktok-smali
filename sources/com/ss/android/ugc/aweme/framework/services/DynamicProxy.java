package com.ss.android.ugc.aweme.framework.services;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    static {
        Covode.recordClassIndex(61351);
    }

    public static <T> T get(Class<?> cls) {
        if (cls == null || !cls.isInterface()) {
            return null;
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            /* class com.ss.android.ugc.aweme.framework.services.DynamicProxy.AnonymousClass1 */

            static {
                Covode.recordClassIndex(61352);
            }

            private static Object com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
                Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    return a2.second;
                }
                Object invoke = method.invoke(obj, objArr);
                a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return invoke;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke(method, this, objArr);
                }
                Class<?> returnType = method.getReturnType();
                if (returnType.isPrimitive()) {
                    return Defaults.defaultValue(returnType);
                }
                return method.getDefaultValue();
            }
        });
    }
}
