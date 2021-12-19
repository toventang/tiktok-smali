package org.apache.http.conn.ssl;

import com.bytedance.covode.number.Covode;
import java.security.cert.X509Certificate;

public interface TrustStrategy {
    static {
        Covode.recordClassIndex(106410);
    }

    boolean isTrusted(X509Certificate[] x509CertificateArr, String str);
}
