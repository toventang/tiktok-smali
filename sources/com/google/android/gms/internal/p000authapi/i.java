package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.t;

/* renamed from: com.google.android.gms.internal.auth-api.i  reason: invalid package */
final class i extends h.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.c.i f50559a;

    static {
        Covode.recordClassIndex(31522);
    }

    i(com.google.android.gms.c.i iVar) {
        this.f50559a = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void a(Status status) {
        t.a(status, null, this.f50559a);
    }
}
