package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class ae extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f50637c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f50638d;

    static {
        Covode.recordClassIndex(31601);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f50638d.f50845h.setDataCollectionEnabled(this.f50637c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ae(f fVar, boolean z) {
        super(fVar);
        this.f50638d = fVar;
        this.f50637c = z;
    }
}
