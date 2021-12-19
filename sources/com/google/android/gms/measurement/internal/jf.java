package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class jf {

    /* renamed from: a  reason: collision with root package name */
    je f51921a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ iz f51922b;

    static {
        Covode.recordClassIndex(32335);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f51922b.c();
        if (this.f51922b.s().d(null, p.ap) && this.f51921a != null) {
            this.f51922b.f51902a.removeCallbacks(this.f51921a);
        }
        if (this.f51922b.s().d(null, p.aD)) {
            this.f51922b.r().s.a(false);
        }
    }

    jf(iz izVar) {
        this.f51922b = izVar;
    }
}
