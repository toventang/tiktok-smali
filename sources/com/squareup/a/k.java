package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.j;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f57855a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f57856b;

    /* renamed from: c  reason: collision with root package name */
    public static final k f57857c = new a(false).b();

    /* renamed from: h  reason: collision with root package name */
    private static final h[] f57858h;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f57859d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f57860e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f57861f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f57862g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f57863a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f57864b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f57865c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f57866d;

        static {
            Covode.recordClassIndex(36006);
        }

        public final k b() {
            return new k(this, (byte) 0);
        }

        public final a a() {
            if (this.f57863a) {
                this.f57866d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        a(boolean z) {
            this.f57863a = z;
        }

        public a(k kVar) {
            this.f57863a = kVar.f57859d;
            this.f57864b = kVar.f57861f;
            this.f57865c = kVar.f57862g;
            this.f57866d = kVar.f57860e;
        }

        public final a a(String... strArr) {
            if (!this.f57863a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f57864b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public final a b(String... strArr) {
            if (!this.f57863a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f57865c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public final a a(aa... aaVarArr) {
            if (this.f57863a) {
                String[] strArr = new String[aaVarArr.length];
                for (int i2 = 0; i2 < aaVarArr.length; i2++) {
                    strArr[i2] = aaVarArr[i2].javaName;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    public final int hashCode() {
        if (this.f57859d) {
            return ((((Arrays.hashCode(this.f57861f) + 527) * 31) + Arrays.hashCode(this.f57862g)) * 31) + (!this.f57860e ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.f57859d) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f57861f;
        int i2 = 0;
        String str2 = "[all enabled]";
        if (strArr != null) {
            h[] hVarArr = new h[strArr.length];
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f57861f;
                if (i3 >= strArr2.length) {
                    break;
                }
                hVarArr[i3] = h.forJavaName(strArr2[i3]);
                i3++;
            }
            str = j.a(hVarArr).toString();
        } else {
            str = str2;
        }
        String[] strArr3 = this.f57862g;
        if (strArr3 != null) {
            aa[] aaVarArr = new aa[strArr3.length];
            while (true) {
                String[] strArr4 = this.f57862g;
                if (i2 >= strArr4.length) {
                    break;
                }
                aaVarArr[i2] = aa.forJavaName(strArr4[i2]);
                i2++;
            }
            str2 = j.a(aaVarArr).toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f57860e + ")";
    }

    static {
        Covode.recordClassIndex(36005);
        h[] hVarArr = {h.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, h.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, h.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, h.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, h.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, h.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, h.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, h.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, h.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, h.TLS_RSA_WITH_AES_128_GCM_SHA256, h.TLS_RSA_WITH_AES_128_CBC_SHA, h.TLS_RSA_WITH_AES_256_CBC_SHA, h.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f57858h = hVarArr;
        a aVar = new a(true);
        if (aVar.f57863a) {
            String[] strArr = new String[hVarArr.length];
            for (int i2 = 0; i2 < hVarArr.length; i2++) {
                strArr[i2] = hVarArr[i2].javaName;
            }
            k b2 = aVar.a(strArr).a(aa.TLS_1_2, aa.TLS_1_1, aa.TLS_1_0).a().b();
            f57855a = b2;
            f57856b = new a(b2).a(aa.TLS_1_0).a().b();
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    private k(a aVar) {
        this.f57859d = aVar.f57863a;
        this.f57861f = aVar.f57864b;
        this.f57862g = aVar.f57865c;
        this.f57860e = aVar.f57866d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f57859d) {
            return false;
        }
        String[] strArr = this.f57862g;
        if (strArr != null && !a(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f57861f;
        if (strArr2 == null || a(strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        boolean z = this.f57859d;
        if (z != kVar.f57859d) {
            return false;
        }
        if (!z || (Arrays.equals(this.f57861f, kVar.f57861f) && Arrays.equals(this.f57862g, kVar.f57862g) && this.f57860e == kVar.f57860e)) {
            return true;
        }
        return false;
    }

    /* synthetic */ k(a aVar, byte b2) {
        this(aVar);
    }

    private static boolean a(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                if (j.a(strArr2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
