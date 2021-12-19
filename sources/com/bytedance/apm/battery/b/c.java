package com.bytedance.apm.battery.b;

import android.os.IBinder;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class c implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    IBinder f24470a;

    /* renamed from: b  reason: collision with root package name */
    public IBinder f24471b;

    /* renamed from: c  reason: collision with root package name */
    d f24472c;

    /* renamed from: d  reason: collision with root package name */
    Class<?> f24473d;

    /* renamed from: e  reason: collision with root package name */
    Class<?> f24474e;

    static {
        Covode.recordClassIndex(14429);
    }

    public c(IBinder iBinder, d dVar) {
        this.f24470a = iBinder;
        this.f24472c = dVar;
        try {
            String a2 = dVar.a();
            this.f24473d = Class.forName(a2 + "$Stub");
            this.f24474e = Class.forName(a2);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if ("queryLocalInterface".equals(method.getName())) {
            return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{this.f24474e}, new a(this.f24470a, this.f24473d, this.f24472c, this.f24471b));
        }
        IBinder iBinder = this.f24470a;
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{iBinder, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_battery_hook_BinderProxyHookHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(iBinder, objArr);
        a.a(invoke, method, new Object[]{iBinder, objArr}, "com_bytedance_apm_battery_hook_BinderProxyHookHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }
}
