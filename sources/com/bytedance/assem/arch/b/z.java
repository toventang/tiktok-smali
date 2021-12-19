package com.bytedance.assem.arch.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class z extends n {

    /* renamed from: a  reason: collision with root package name */
    public static final z f25504a = new z();

    private z() {
    }

    static {
        Covode.recordClassIndex(14857);
    }

    @Override // com.bytedance.assem.arch.b.n
    public final n a(a aVar) {
        l.c(aVar, "");
        int i2 = aa.f25421a[aVar.ordinal()];
        if (i2 == 1) {
            return c.f25424a;
        }
        if (i2 == 2) {
            return this;
        }
        if (i2 != 3) {
            return this;
        }
        return e.f25426a;
    }
}
