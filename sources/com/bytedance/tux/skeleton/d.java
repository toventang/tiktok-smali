package com.bytedance.tux.skeleton;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.o;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d extends o {
    static {
        Covode.recordClassIndex(27617);
    }

    d(a aVar) {
        super(aVar);
    }

    @Override // h.k.b, h.f.b.c
    public final String getName() {
        return "pulsingColor";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getPulsingColor()I";
    }

    @Override // h.f.b.c
    public final h.k.d getOwner() {
        return ab.a(a.class);
    }

    @Override // h.k.j
    public final Object get() {
        return Integer.valueOf(((a) this.receiver).getPulsingColor());
    }
}
