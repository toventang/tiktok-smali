package com.bytedance.cukaie.closet.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import h.f.b.l;

public abstract class a {
    private final e store;

    static {
        Covode.recordClassIndex(16755);
    }

    public final e getStore() {
        return this.store;
    }

    public a(e eVar) {
        l.c(eVar, "");
        this.store = eVar;
    }
}
