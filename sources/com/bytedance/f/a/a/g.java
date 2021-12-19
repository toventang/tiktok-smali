package com.bytedance.f.a.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.h;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class g implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private i f28732a = null;

    /* renamed from: b  reason: collision with root package name */
    private h.a f28733b;

    static {
        Covode.recordClassIndex(16903);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_createx_editor_gesture_GestureInteractItemInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_createx_editor_gesture_GestureInteractItemInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    g(h.a aVar) {
        this.f28733b = aVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (method.getReturnType().equals(Boolean.TYPE)) {
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        return false;
                    }
                }
            }
            i iVar = this.f28732a;
            if (iVar != null) {
                z = ((Boolean) a(method, iVar, objArr)).booleanValue();
            } else {
                z = false;
            }
            h.a aVar = this.f28733b;
            if (aVar != null) {
                z2 = ((Boolean) a(method, aVar, objArr)).booleanValue();
            } else {
                z2 = false;
            }
            if (z || z2) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
        if (objArr != null) {
            for (Object obj3 : objArr) {
                if (obj3 == null) {
                    return null;
                }
            }
        }
        i iVar2 = this.f28732a;
        if (iVar2 != null) {
            a(method, iVar2, objArr);
        }
        h.a aVar2 = this.f28733b;
        if (aVar2 != null) {
            a(method, aVar2, objArr);
        }
        return null;
    }
}
