package org.apache.http.impl.client;

import com.bytedance.covode.number.Covode;
import org.apache.http.HttpVersion;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.params.SyncBasicHttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.VersionInfo;

public class DefaultHttpClient extends AbstractHttpClient {
    static {
        Covode.recordClassIndex(106414);
    }

    public DefaultHttpClient() {
        super(null, null);
    }

    /* access modifiers changed from: protected */
    @Override // org.apache.http.impl.client.AbstractHttpClient
    public HttpParams createHttpParams() {
        SyncBasicHttpParams syncBasicHttpParams = new SyncBasicHttpParams();
        setDefaultHttpParams(syncBasicHttpParams);
        return syncBasicHttpParams;
    }

    public static void setDefaultHttpParams(HttpParams httpParams) {
        String str;
        HttpProtocolParams.setVersion(httpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(httpParams, HTTP.DEF_CONTENT_CHARSET.name());
        HttpConnectionParams.setTcpNoDelay(httpParams, true);
        HttpConnectionParams.setSocketBufferSize(httpParams, 8192);
        VersionInfo loadVersionInfo = VersionInfo.loadVersionInfo("org.apache.http.client", DefaultHttpClient.class.getClassLoader());
        if (loadVersionInfo != null) {
            str = loadVersionInfo.getRelease();
        } else {
            str = "UNAVAILABLE";
        }
        HttpProtocolParams.setUserAgent(httpParams, "Apache-HttpClient/" + str + " (java 1.5)");
    }

    public DefaultHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
    }
}
