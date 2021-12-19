package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class q extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f51280c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51281d;

    static {
        Covode.recordClassIndex(32065);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51281d.f50845h.setMinimumSessionDuration(this.f51280c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(f fVar, long j2) {
        super(fVar);
        this.f51281d = fVar;
        this.f51280c = j2;
    }
}
