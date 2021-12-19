package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.p;

/* renamed from: com.google.android.gms.internal.auth-api.v  reason: invalid package */
final class v extends x<Status> {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Credential f50577e;

    static {
        Covode.recordClassIndex(31535);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ p a(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p000authapi.x
    public final void a(ad adVar) {
        adVar.a(new y(this), new zzz(this.f50577e));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v(i iVar, Credential credential) {
        super(iVar);
        this.f50577e = credential;
    }
}
