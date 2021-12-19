package com.bytedance.assem.arch.viewModel;

import com.bytedance.covode.number.Covode;

public final class l {
    static {
        Covode.recordClassIndex(15012);
    }

    public static final <R> k<R> a() {
        k<R> kVar = new k<>();
        kVar.f25722a = true;
        return kVar;
    }

    public static final <R> k<R> b() {
        k<R> kVar = new k<>();
        kVar.a(true);
        kVar.f25722a = true;
        return kVar;
    }

    public static final <R> k<R> c() {
        k<R> kVar = new k<>();
        kVar.a(true);
        return kVar;
    }

    public static final <R> k<R> a(boolean z) {
        k<R> kVar = new k<>();
        kVar.a(!z);
        return kVar;
    }

    public static final <R> k<R> a(f<?> fVar, k<R> kVar, boolean z, boolean z2) {
        boolean uniqueOnlyDefault;
        h.f.b.l.c(fVar, "");
        h.f.b.l.c(kVar, "");
        if (!kVar.f25725d) {
            if (z) {
                uniqueOnlyDefault = false;
            } else {
                uniqueOnlyDefault = fVar.getUniqueOnlyDefault();
            }
            kVar.a(uniqueOnlyDefault);
        }
        kVar.f25727f = z2;
        return kVar;
    }
}
