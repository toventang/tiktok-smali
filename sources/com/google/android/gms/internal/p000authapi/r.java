package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.b;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.r  reason: invalid package */
public final class r implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Status f50574a;

    /* renamed from: b  reason: collision with root package name */
    private final Credential f50575b;

    static {
        Covode.recordClassIndex(31531);
    }

    @Override // com.google.android.gms.common.api.p
    public final Status D_() {
        return this.f50574a;
    }

    @Override // com.google.android.gms.auth.api.credentials.b
    public final Credential a() {
        return this.f50575b;
    }

    public static r a(Status status) {
        return new r(status, null);
    }

    public r(Status status, Credential credential) {
        this.f50574a = status;
        this.f50575b = credential;
    }
}
