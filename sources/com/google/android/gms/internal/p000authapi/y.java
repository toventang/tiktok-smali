package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;

/* renamed from: com.google.android.gms.internal.auth-api.y  reason: invalid package */
final class y extends s {

    /* renamed from: a  reason: collision with root package name */
    private d.b<Status> f50579a;

    static {
        Covode.recordClassIndex(31538);
    }

    y(d.b<Status> bVar) {
        this.f50579a = bVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.s, com.google.android.gms.internal.p000authapi.ab
    public final void a(Status status) {
        this.f50579a.a(status);
    }
}
