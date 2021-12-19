package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;

/* renamed from: com.google.android.gms.internal.auth-api.j  reason: invalid package */
final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f50560a;

    static {
        Covode.recordClassIndex(31523);
    }

    j(i iVar) {
        this.f50560a = iVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.a
    public final void a(Status status, BeginSignInResult beginSignInResult) {
        t.a(status, beginSignInResult, this.f50560a);
    }
}
