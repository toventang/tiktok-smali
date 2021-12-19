package com.bytedance.android.livesdkapi.m;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class f {
    static {
        Covode.recordClassIndex(13834);
    }

    /* access modifiers changed from: package-private */
    public static class a<T> implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<T> f23263a;

        static {
            Covode.recordClassIndex(13835);
        }

        a(T t) {
            this.f23263a = new WeakReference<>(t);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            T t = this.f23263a.get();
            if (t == null) {
                return null;
            }
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{t, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_livesdkapi_util_WeakReferenceWrapper$WeakInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(t, objArr);
            com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{t, objArr}, "com_bytedance_android_livesdkapi_util_WeakReferenceWrapper$WeakInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }
    }

    public static <T> T a(T t) {
        try {
            Class<?> cls = t.getClass();
            Class<?>[] interfaces = cls.getInterfaces();
            return (interfaces == null || interfaces.length <= 0) ? t : (T) Proxy.newProxyInstance(cls.getClassLoader(), interfaces, new a(t));
        } catch (Throwable unused) {
            return t;
        }
    }
}
