package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class hb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f51744a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51745b;

    static {
        Covode.recordClassIndex(32277);
    }

    public final void run() {
        gk.a(this.f51745b, this.f51744a);
    }

    hb(gk gkVar, boolean z) {
        this.f51745b = gkVar;
        this.f51744a = z;
    }
}
