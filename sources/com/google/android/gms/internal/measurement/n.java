package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class n extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f51212c;

    static {
        Covode.recordClassIndex(32005);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51212c.f50845h.resetAnalyticsData(this.f50848a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(f fVar) {
        super(fVar);
        this.f51212c = fVar;
    }
}
