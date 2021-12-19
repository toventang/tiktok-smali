package com.bytedance.bpea.entry.common;

import com.bytedance.bpea.basics.d;
import com.bytedance.bpea.basics.e;
import com.bytedance.bpea.basics.f;
import com.bytedance.bpea.basics.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f26667a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static e f26668b;

    private b() {
    }

    static {
        Covode.recordClassIndex(15722);
        try {
            Class<?> cls = Class.forName("com.bytedance.bpea.core.checker.CertCheckerProvider");
            Field declaredField = cls.getDeclaredField("INSTANCE");
            l.a((Object) declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField("CHECKER");
            l.a((Object) declaredField2, "");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                f26668b = (e) obj2;
                if (f26668b != null) {
                    l.c("checker working", "");
                } else {
                    l.c("checker not work", "");
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        } catch (Throwable unused) {
        }
    }

    public static h a(d dVar, f fVar) {
        l.c(fVar, "");
        e eVar = f26668b;
        if (eVar != null) {
            return eVar.a(dVar, fVar);
        }
        return null;
    }
}
