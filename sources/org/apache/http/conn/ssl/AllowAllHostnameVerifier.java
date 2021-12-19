package org.apache.http.conn.ssl;

import com.bytedance.covode.number.Covode;

public class AllowAllHostnameVerifier extends AbstractVerifier {
    static {
        Covode.recordClassIndex(106404);
    }

    public final String toString() {
        return "ALLOW_ALL";
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, String[] strArr, String[] strArr2) {
    }
}
