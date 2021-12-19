package org.apache.http.conn.ssl;

import com.bytedance.covode.number.Covode;

public class SSLInitializationException extends IllegalStateException {
    private static final long serialVersionUID = -8243587425648536702L;

    static {
        Covode.recordClassIndex(106406);
    }

    public SSLInitializationException(String str, Throwable th) {
        super(str, th);
    }
}
