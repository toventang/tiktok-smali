package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;

final class ai extends av {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f50042a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ af f50043b;

    static {
        Covode.recordClassIndex(31225);
    }

    @Override // com.google.android.gms.common.api.internal.av
    public final void a() {
        this.f50043b.f50036a.b(this.f50042a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ai(af afVar, at atVar, ConnectionResult connectionResult) {
        super(atVar);
        this.f50043b = afVar;
        this.f50042a = connectionResult;
    }
}
