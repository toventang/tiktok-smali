package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.r;

public final class cm implements i.b, i.c {

    /* renamed from: a  reason: collision with root package name */
    public final a<?> f50167a;

    /* renamed from: b  reason: collision with root package name */
    public co f50168b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f50169c;

    static {
        Covode.recordClassIndex(31285);
    }

    private final void a() {
        r.a(this.f50168b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void a(Bundle bundle) {
        a();
        this.f50168b.a(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void b(int i2) {
        a();
        this.f50168b.b(i2);
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
        a();
        this.f50168b.a(connectionResult, this.f50167a, this.f50169c);
    }

    public cm(a<?> aVar, boolean z) {
        this.f50167a = aVar;
        this.f50169c = z;
    }
}
