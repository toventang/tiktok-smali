package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class u extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51287c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51288d;

    static {
        Covode.recordClassIndex(32069);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51288d.f50845h.endAdUnitExposure(this.f51287c, this.f50849b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(f fVar, String str) {
        super(fVar);
        this.f51288d = fVar;
        this.f51287c = str;
    }
}
