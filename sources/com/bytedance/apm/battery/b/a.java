package com.bytedance.apm.battery.b;

import android.os.IBinder;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class a implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public IBinder f24464a;

    /* renamed from: b  reason: collision with root package name */
    private Object f24465b;

    /* renamed from: c  reason: collision with root package name */
    private d f24466c;

    static {
        Covode.recordClassIndex(14427);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.f24464a != null && method.getName().equals("asBinder")) {
            return this.f24464a;
        }
        this.f24466c.a(method, objArr);
        Object obj2 = this.f24465b;
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj2, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_battery_hook_BinderHookHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj2, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj2, objArr}, "com_bytedance_apm_battery_hook_BinderHookHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    a(IBinder iBinder, Class<?> cls, d dVar, IBinder iBinder2) {
        try {
            this.f24465b = cls.getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder);
            this.f24466c = dVar;
            this.f24464a = iBinder2;
        } catch (Exception unused) {
        }
    }
}
