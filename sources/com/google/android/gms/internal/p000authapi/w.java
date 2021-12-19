package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;

/* renamed from: com.google.android.gms.internal.auth-api.w  reason: invalid package */
final class w extends s {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ t f50578a;

    static {
        Covode.recordClassIndex(31536);
    }

    w(t tVar) {
        this.f50578a = tVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.s, com.google.android.gms.internal.p000authapi.ab
    public final void a(Status status) {
        this.f50578a.a((p) r.a(status));
    }

    @Override // com.google.android.gms.internal.p000authapi.s, com.google.android.gms.internal.p000authapi.ab
    public final void a(Status status, Credential credential) {
        this.f50578a.a((p) new r(status, credential));
    }
}
