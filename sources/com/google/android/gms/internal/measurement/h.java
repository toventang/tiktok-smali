package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class h extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bundle f50964c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f50965d;

    static {
        Covode.recordClassIndex(31839);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f50965d.f50845h.setConditionalUserProperty(this.f50964c, this.f50848a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f fVar, Bundle bundle) {
        super(fVar);
        this.f50965d = fVar;
        this.f50964c = bundle;
    }
}
