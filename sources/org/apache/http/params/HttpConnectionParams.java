package org.apache.http.params;

import com.bytedance.covode.number.Covode;

public final class HttpConnectionParams {
    static {
        Covode.recordClassIndex(106429);
    }

    public static void setSocketBufferSize(HttpParams httpParams, int i2) {
        if (httpParams != null) {
            httpParams.setIntParameter("http.socket.buffer-size", i2);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setStaleCheckingEnabled(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter("http.connection.stalecheck", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setTcpNoDelay(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter("http.tcp.nodelay", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
