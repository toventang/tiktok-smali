package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class i extends k {

    /* renamed from: a  reason: collision with root package name */
    private final Fingerprint f57264a;

    static {
        Covode.recordClassIndex(35795);
    }

    @Override // okhttp3.Interceptor, com.snapchat.kit.sdk.core.networking.k
    public final /* bridge */ /* synthetic */ Response intercept(Interceptor.Chain chain) {
        return super.intercept(chain);
    }

    /* access modifiers changed from: protected */
    @Override // com.snapchat.kit.sdk.core.networking.k
    public final Request.Builder a(Interceptor.Chain chain) {
        Request.Builder a2 = super.a(chain);
        String encryptedFingerprint = this.f57264a.getEncryptedFingerprint();
        if (encryptedFingerprint != null) {
            a2.header("X-Snap-SDK-Client-Auth-Token", encryptedFingerprint);
        }
        return a2;
    }

    i(String str, Fingerprint fingerprint) {
        super(str);
        this.f57264a = fingerprint;
    }
}
