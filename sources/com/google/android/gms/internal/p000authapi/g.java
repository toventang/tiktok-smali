package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.r;

/* renamed from: com.google.android.gms.internal.auth-api.g  reason: invalid package */
final /* synthetic */ class g implements o {

    /* renamed from: a  reason: collision with root package name */
    private final e f50557a;

    /* renamed from: b  reason: collision with root package name */
    private final BeginSignInRequest f50558b;

    static {
        Covode.recordClassIndex(31520);
    }

    g(e eVar, BeginSignInRequest beginSignInRequest) {
        this.f50557a = eVar;
        this.f50558b = beginSignInRequest;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void a(Object obj, Object obj2) {
        BeginSignInRequest beginSignInRequest = this.f50558b;
        ((c) ((c) obj).q()).a(new j((i) obj2), (BeginSignInRequest) r.a(beginSignInRequest));
    }
}
