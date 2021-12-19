package okhttp3.internal.tls;

import com.bytedance.covode.number.Covode;
import java.security.cert.X509Certificate;

public interface TrustRootIndex {
    static {
        Covode.recordClassIndex(106318);
    }

    X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate);
}
