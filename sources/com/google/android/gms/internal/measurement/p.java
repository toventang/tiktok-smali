package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class p extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f51278c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51279d;

    static {
        Covode.recordClassIndex(32059);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51279d.f50845h.setSessionTimeoutDuration(this.f51278c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(f fVar, long j2) {
        super(fVar);
        this.f51279d = fVar;
        this.f51278c = j2;
    }
}
