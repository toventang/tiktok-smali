package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;

final class ah extends av {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ c.AbstractC1210c f50041a;

    static {
        Covode.recordClassIndex(31224);
    }

    @Override // com.google.android.gms.common.api.internal.av
    public final void a() {
        this.f50041a.a(new ConnectionResult(16, null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ah(at atVar, c.AbstractC1210c cVar) {
        super(atVar);
        this.f50041a = cVar;
    }
}
