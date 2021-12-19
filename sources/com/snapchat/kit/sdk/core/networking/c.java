package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.snapchat.kit.sdk.core.controller.b;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import com.snapchat.kit.sdk.m;
import okhttp3.Interceptor;
import okhttp3.Request;

public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final Fingerprint f57244a;

    static {
        Covode.recordClassIndex(35788);
    }

    /* access modifiers changed from: protected */
    @Override // com.snapchat.kit.sdk.core.networking.k, com.snapchat.kit.sdk.core.networking.g
    public final Request.Builder a(Interceptor.Chain chain) {
        Request.Builder a2 = super.a(chain);
        String encryptedFingerprint = this.f57244a.getEncryptedFingerprint();
        if (encryptedFingerprint != null) {
            a2.header("X-Snap-SDK-Client-Auth-Token", encryptedFingerprint);
        }
        return a2;
    }

    c(m mVar, b bVar, String str, Fingerprint fingerprint, f fVar) {
        super(mVar, bVar, str, fVar);
        this.f57244a = fingerprint;
    }
}
