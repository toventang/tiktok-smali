package com.bytedance.sdk.xbridge.registry.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.registry.core.annotation.d;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import h.a.n;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f44051a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(26910);
    }

    public static Class<? extends XBaseParamModel> a(Class<? extends b> cls) {
        l.c(cls, "");
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        l.a((Object) declaredClasses, "");
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : declaredClasses) {
            if (cls2.getAnnotation(d.class) != null) {
                arrayList.add(cls2);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            Class<? super Object> superclass = cls.getSuperclass();
            l.a((Object) superclass, "");
            Class<?>[] declaredClasses2 = superclass.getDeclaredClasses();
            l.a((Object) declaredClasses2, "");
            ArrayList arrayList3 = new ArrayList();
            for (Class<?> cls3 : declaredClasses2) {
                if (cls3.getAnnotation(d.class) != null) {
                    arrayList3.add(cls3);
                }
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        Object g2 = n.g((List) arrayList2);
        if (g2 != null) {
            return (Class) g2;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
