package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AndroidCertVerifyResult {

    /* renamed from: a  reason: collision with root package name */
    private final int f155353a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f155354b;

    /* renamed from: c  reason: collision with root package name */
    private final List<X509Certificate> f155355c;

    static {
        Covode.recordClassIndex(103362);
    }

    public int getStatus() {
        return this.f155353a;
    }

    public boolean isIssuedByKnownRoot() {
        return this.f155354b;
    }

    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.f155355c.size()][];
        for (int i2 = 0; i2 < this.f155355c.size(); i2++) {
            try {
                bArr[i2] = this.f155355c.get(i2).getEncoded();
            } catch (CertificateEncodingException unused) {
                return new byte[0][];
            }
        }
        return bArr;
    }

    public AndroidCertVerifyResult(int i2) {
        this.f155353a = i2;
        this.f155355c = Collections.emptyList();
    }

    public AndroidCertVerifyResult(boolean z, List<X509Certificate> list) {
        this.f155353a = 0;
        this.f155354b = z;
        this.f155355c = new ArrayList(list);
    }
}
