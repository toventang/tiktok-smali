package com.bytedance.f.a.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import h.f.b.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class d implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private c f28724a;

    /* renamed from: b  reason: collision with root package name */
    private e f28725b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28726c;

    static {
        Covode.recordClassIndex(16900);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_createx_editor_gesture_GestureDelegateInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_createx_editor_gesture_GestureDelegateInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public d(c cVar, e eVar) {
        this.f28724a = cVar;
        this.f28725b = eVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        e eVar;
        boolean z = false;
        if (method.getReturnType().equals(Boolean.TYPE)) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f28724a.f28721b.size()) {
                    break;
                }
                f fVar = this.f28724a.f28721b.get(i2);
                if (((Boolean) a(method, fVar, objArr)).booleanValue()) {
                    if (method.getName().equals("onDown") && (eVar = this.f28725b) != null) {
                        eVar.a(fVar);
                    }
                    if (this.f28726c) {
                        l.d("handleBoolean: methodName=" + method.getName() + ",i=" + i2 + ",size=" + this.f28724a.f28721b.size() + ",item=" + fVar, "");
                    }
                    z = true;
                } else {
                    i2++;
                }
            }
            return Boolean.valueOf(z);
        }
        int size = this.f28724a.f28721b.size();
        for (int i3 = 0; i3 < size; i3++) {
            f fVar2 = this.f28724a.f28721b.get(i3);
            a(method, fVar2, objArr);
            if (this.f28726c) {
                l.d("i=" + i3 + ",size=" + size + ",methodName=" + method.getName() + ",item=" + fVar2, "");
            }
        }
        return null;
    }
}
