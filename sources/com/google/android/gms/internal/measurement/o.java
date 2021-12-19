package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class o extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f51249c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51250d;

    static {
        Covode.recordClassIndex(32032);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51250d.f50845h.setMeasurementEnabled(this.f51249c, this.f50848a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(f fVar, boolean z) {
        super(fVar);
        this.f51250d = fVar;
        this.f51249c = z;
    }
}
