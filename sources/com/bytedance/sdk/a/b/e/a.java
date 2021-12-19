package com.bytedance.sdk.a.b.e;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

public final class a {
    static {
        Covode.recordClassIndex(26455);
    }

    public static int a(com.bytedance.sdk.a.b.a.a aVar, Throwable th) {
        int i2;
        if (th instanceof ConnectTimeoutException) {
            return -13;
        }
        if (th instanceof SocketTimeoutException) {
            i2 = -14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    return -21;
                }
                if (!(th instanceof IOException)) {
                    if (th instanceof SSLHandshakeException) {
                        return -21;
                    }
                    if (th instanceof UnknownHostException) {
                        return -16;
                    }
                    return -1;
                }
            }
            i2 = -15;
        }
        if (aVar == null || aVar.a()) {
            return i2;
        }
        return -12;
    }
}
