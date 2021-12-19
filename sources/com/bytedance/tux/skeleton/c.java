package com.bytedance.tux.skeleton;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.o;
import h.k.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c extends o {
    static {
        Covode.recordClassIndex(27616);
    }

    c(a aVar) {
        super(aVar);
    }

    @Override // h.k.b, h.f.b.c
    public final String getName() {
        return "placeholderColor";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getPlaceholderColor()I";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(a.class);
    }

    @Override // h.k.j
    public final Object get() {
        return Integer.valueOf(((a) this.receiver).getPlaceholderColor());
    }
}
