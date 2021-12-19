package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class jn extends h {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ jo f51936b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ jk f51937c;

    static {
        Covode.recordClassIndex(32343);
    }

    @Override // com.google.android.gms.measurement.internal.h
    public final void a() {
        this.f51937c.e();
        this.f51937c.q().f51476k.a("Starting upload from DelayedRunnable");
        this.f51936b.i();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    jn(jk jkVar, gb gbVar, jo joVar) {
        super(gbVar);
        this.f51937c = jkVar;
        this.f51936b = joVar;
    }
}
