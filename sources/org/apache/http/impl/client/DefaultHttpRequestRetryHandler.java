package org.apache.http.impl.client;

import com.bytedance.covode.number.Covode;
import org.apache.http.client.HttpRequestRetryHandler;

public class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {
    private final boolean requestSentRetryEnabled;
    private final int retryCount;

    static {
        Covode.recordClassIndex(106415);
    }

    public DefaultHttpRequestRetryHandler() {
        this(3, false);
    }

    public DefaultHttpRequestRetryHandler(int i2, boolean z) {
        this.retryCount = i2;
        this.requestSentRetryEnabled = z;
    }
}
