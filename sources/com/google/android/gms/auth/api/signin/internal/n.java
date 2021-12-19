package com.google.android.gms.auth.api.signin.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;

final class n extends d {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ k f49870a;

    static {
        Covode.recordClassIndex(31128);
    }

    n(k kVar) {
        this.f49870a = kVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.q, com.google.android.gms.auth.api.signin.internal.d
    public final void b(Status status) {
        this.f49870a.a((p) status);
    }
}
