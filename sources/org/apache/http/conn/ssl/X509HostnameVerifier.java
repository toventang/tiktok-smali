package org.apache.http.conn.ssl;

import com.bytedance.covode.number.Covode;
import javax.net.ssl.HostnameVerifier;

public interface X509HostnameVerifier extends HostnameVerifier {
    static {
        Covode.recordClassIndex(106411);
    }

    void verify(String str, String[] strArr, String[] strArr2);
}
