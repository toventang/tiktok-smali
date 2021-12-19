package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.security.cert.X509Certificate;

/* access modifiers changed from: package-private */
public final class bo extends bp {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f53142a;

    static {
        Covode.recordClassIndex(32823);
    }

    public bo(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f53142a = bArr;
    }

    @Override // java.security.cert.Certificate, com.google.android.play.core.b.bp
    public final byte[] getEncoded() {
        return this.f53142a;
    }
}
