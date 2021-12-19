package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class x implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ m f50441a;

    static {
        Covode.recordClassIndex(31434);
    }

    x(m mVar) {
        this.f50441a = mVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(ConnectionResult connectionResult) {
        this.f50441a.a(connectionResult);
    }
}
