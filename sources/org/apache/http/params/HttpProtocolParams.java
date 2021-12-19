package org.apache.http.params;

import com.bytedance.covode.number.Covode;
import org.apache.http.ProtocolVersion;

public final class HttpProtocolParams {
    static {
        Covode.recordClassIndex(106431);
    }

    public static void setContentCharset(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter("http.protocol.content-charset", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setUserAgent(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter("http.useragent", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setVersion(HttpParams httpParams, ProtocolVersion protocolVersion) {
        if (httpParams != null) {
            httpParams.setParameter("http.protocol.version", protocolVersion);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
