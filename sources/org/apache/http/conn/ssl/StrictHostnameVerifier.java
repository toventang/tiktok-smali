package org.apache.http.conn.ssl;

import com.bytedance.covode.number.Covode;

public class StrictHostnameVerifier extends AbstractVerifier {
    static {
        Covode.recordClassIndex(106408);
    }

    public final String toString() {
        return "STRICT";
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, String[] strArr, String[] strArr2) {
        verify(str, strArr, strArr2, true);
    }
}
