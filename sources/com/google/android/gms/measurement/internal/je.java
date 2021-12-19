package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class je implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    long f51918a;

    /* renamed from: b  reason: collision with root package name */
    long f51919b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ jf f51920c;

    static {
        Covode.recordClassIndex(32334);
    }

    public final void run() {
        this.f51920c.f51922b.p().a(new jh(this));
    }

    je(jf jfVar, long j2, long j3) {
        this.f51920c = jfVar;
        this.f51918a = j2;
        this.f51919b = j3;
    }
}
