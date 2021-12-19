package org.apache.http.impl.client;

import com.bytedance.covode.number.Covode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.params.HttpParams;

public abstract class AbstractHttpClient implements HttpClient {
    private ClientConnectionManager connManager;
    private HttpParams defaultParams;
    private final Log log = LogFactory.getLog(getClass());
    private HttpRequestRetryHandler retryHandler;
    private HttpRoutePlanner routePlanner;

    static {
        Covode.recordClassIndex(106413);
    }

    /* access modifiers changed from: protected */
    public abstract HttpParams createHttpParams();

    @Override // org.apache.http.client.HttpClient
    public final synchronized HttpParams getParams() {
        if (this.defaultParams == null) {
            this.defaultParams = createHttpParams();
        }
        return this.defaultParams;
    }

    public synchronized void setHttpRequestRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.retryHandler = httpRequestRetryHandler;
    }

    public synchronized void setRoutePlanner(HttpRoutePlanner httpRoutePlanner) {
        this.routePlanner = httpRoutePlanner;
    }

    protected AbstractHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.defaultParams = httpParams;
        this.connManager = clientConnectionManager;
    }
}
