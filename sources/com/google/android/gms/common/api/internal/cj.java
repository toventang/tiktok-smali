package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.r;

/* access modifiers changed from: package-private */
public final class cj {

    /* renamed from: a  reason: collision with root package name */
    public final int f50163a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectionResult f50164b;

    static {
        Covode.recordClassIndex(31282);
    }

    cj(ConnectionResult connectionResult, int i2) {
        r.a(connectionResult);
        this.f50164b = connectionResult;
        this.f50163a = i2;
    }
}
