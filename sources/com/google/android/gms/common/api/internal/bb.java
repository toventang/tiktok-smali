package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.f;

final class bb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f50089a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f.a f50090b;

    static {
        Covode.recordClassIndex(31245);
    }

    public final void run() {
        this.f50090b.a(this.f50089a);
    }

    bb(f.a aVar, ConnectionResult connectionResult) {
        this.f50090b = aVar;
        this.f50089a = connectionResult;
    }
}
