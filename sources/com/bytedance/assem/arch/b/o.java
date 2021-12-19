package com.bytedance.assem.arch.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o extends n {

    /* renamed from: a  reason: collision with root package name */
    public static final o f25429a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(14788);
    }

    @Override // com.bytedance.assem.arch.b.n
    public final n a(a aVar) {
        l.c(aVar, "");
        int i2 = p.f25430a[aVar.ordinal()];
        if (i2 == 1) {
            return c.f25424a;
        }
        if (i2 != 2) {
            return this;
        }
        return e.f25426a;
    }
}
