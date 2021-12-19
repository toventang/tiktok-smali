package com.bytedance.assem.arch.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends n {

    /* renamed from: a  reason: collision with root package name */
    public static final c f25424a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(14776);
    }

    @Override // com.bytedance.assem.arch.b.n
    public final n a(a aVar) {
        l.c(aVar, "");
        int i2 = d.f25425a[aVar.ordinal()];
        if (i2 == 1) {
            return this;
        }
        if (i2 == 2 || i2 == 3) {
            return z.f25504a;
        }
        if (i2 != 4) {
            return this;
        }
        return o.f25429a;
    }
}
