package com.bytedance.tux.skeleton;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.o;
import h.k.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b extends o {
    static {
        Covode.recordClassIndex(27615);
    }

    b(a aVar) {
        super(aVar);
    }

    @Override // h.k.b, h.f.b.c
    public final String getName() {
        return "radius";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getRadius()F";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(a.class);
    }

    @Override // h.k.j
    public final Object get() {
        return Float.valueOf(((a) this.receiver).getRadius());
    }
}
