package com.google.android.gms.auth.api.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;

public final class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public Status f49841a;

    /* renamed from: b  reason: collision with root package name */
    public GoogleSignInAccount f49842b;

    static {
        Covode.recordClassIndex(31105);
    }

    @Override // com.google.android.gms.common.api.p
    public final Status D_() {
        return this.f49841a;
    }

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f49842b = googleSignInAccount;
        this.f49841a = status;
    }
}
