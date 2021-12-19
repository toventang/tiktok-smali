package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.security.cert.Certificate;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f57873a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Certificate> f57874b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f57875c;

    static {
        Covode.recordClassIndex(36011);
    }

    public final int hashCode() {
        return ((((this.f57873a.hashCode() + 527) * 31) + this.f57874b.hashCode()) * 31) + this.f57875c.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.a.o a(javax.net.ssl.SSLSession r4) {
        /*
            java.lang.String r3 = r4.getCipherSuite()
            if (r3 == 0) goto L_0x002b
            java.security.cert.Certificate[] r0 = r4.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0011 }
            if (r0 == 0) goto L_0x0012
            java.util.List r2 = com.squareup.a.a.j.a(r0)
            goto L_0x0016
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0016:
            java.security.cert.Certificate[] r0 = r4.getLocalCertificates()
            if (r0 == 0) goto L_0x0026
            java.util.List r1 = com.squareup.a.a.j.a(r0)
        L_0x0020:
            com.squareup.a.o r0 = new com.squareup.a.o
            r0.<init>(r3, r2, r1)
            return r0
        L_0x0026:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0020
        L_0x002b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.o.a(javax.net.ssl.SSLSession):com.squareup.a.o");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f57873a.equals(oVar.f57873a) || !this.f57874b.equals(oVar.f57874b) || !this.f57875c.equals(oVar.f57875c)) {
            return false;
        }
        return true;
    }

    o(String str, List<Certificate> list, List<Certificate> list2) {
        this.f57873a = str;
        this.f57874b = list;
        this.f57875c = list2;
    }
}
