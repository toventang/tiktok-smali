package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.p;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.auth-api.t  reason: invalid package */
public final class t extends x<b> {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ CredentialRequest f50576e;

    static {
        Covode.recordClassIndex(31533);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ p a(Status status) {
        return r.a(status);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p000authapi.x
    public final void a(ad adVar) {
        adVar.a(new w(this), this.f50576e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(i iVar, CredentialRequest credentialRequest) {
        super(iVar);
        this.f50576e = credentialRequest;
    }
}
