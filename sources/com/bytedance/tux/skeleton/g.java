package com.bytedance.tux.skeleton;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.o;
import h.k.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g extends o {
    static {
        Covode.recordClassIndex(27621);
    }

    g(f fVar) {
        super(fVar);
    }

    @Override // h.k.b, h.f.b.c
    public final String getName() {
        return "animator";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getAnimator()Landroid/animation/ValueAnimator;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(f.class);
    }

    @Override // h.k.j
    public final Object get() {
        return ((a) this.receiver).getAnimator();
    }
}
