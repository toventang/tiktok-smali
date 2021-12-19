package com.bytedance.apm.agent.instrumentation;

import com.bytedance.covode.number.Covode;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public final class HttpInstrumentation {
    static {
        Covode.recordClassIndex(14326);
    }

    public static URLConnection openConnection(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpsURLConnection) {
            return new HttpsURLConnectionExtension((HttpsURLConnection) uRLConnection);
        }
        if (uRLConnection instanceof HttpURLConnection) {
            return new HttpURLConnectionExtension((HttpURLConnection) uRLConnection);
        }
        return uRLConnection;
    }

    public static URLConnection openConnectionWithProxy(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpsURLConnection) {
            return new HttpsURLConnectionExtension((HttpsURLConnection) uRLConnection);
        }
        if (uRLConnection instanceof HttpURLConnection) {
            return new HttpURLConnectionExtension((HttpURLConnection) uRLConnection);
        }
        return uRLConnection;
    }
}
