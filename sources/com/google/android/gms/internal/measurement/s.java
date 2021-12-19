package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class s extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51283c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51284d;

    static {
        Covode.recordClassIndex(32067);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51284d.f50845h.beginAdUnitExposure(this.f51283c, this.f50849b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(f fVar, String str) {
        super(fVar);
        this.f51284d = fVar;
        this.f51283c = str;
    }
}
