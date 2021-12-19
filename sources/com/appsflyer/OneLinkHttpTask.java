package com.appsflyer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.l.a;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public abstract class OneLinkHttpTask implements Runnable {
    private AppsFlyerLibCore afLib;
    private HttpsUrlConnectionProvider connectionProvider;
    public String oneLinkId;

    static {
        Covode.recordClassIndex(2694);
    }

    /* access modifiers changed from: protected */
    public abstract String getOneLinkUrl();

    /* access modifiers changed from: protected */
    public abstract void handleResponse(String str);

    /* access modifiers changed from: protected */
    public abstract void initRequest(HttpsURLConnection httpsURLConnection);

    /* access modifiers changed from: protected */
    public abstract void onErrorResponse();

    public void run() {
        doRequest();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doRequest() {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.OneLinkHttpTask.doRequest():void");
    }

    public void setConnProvider(HttpsUrlConnectionProvider httpsUrlConnectionProvider) {
        this.connectionProvider = httpsUrlConnectionProvider;
    }

    public OneLinkHttpTask(AppsFlyerLibCore appsFlyerLibCore) {
        this.afLib = appsFlyerLibCore;
    }

    public static class HttpsUrlConnectionProvider {
        static {
            Covode.recordClassIndex(2695);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final HttpsURLConnection m113(String str) {
            return (HttpsURLConnection) com_appsflyer_OneLinkHttpTask$HttpsUrlConnectionProvider_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(str));
        }

        public static URLConnection com_appsflyer_OneLinkHttpTask$HttpsUrlConnectionProvider_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
            URLConnection aVar;
            URLConnection aVar2;
            e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
            if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
                R r = m2.f112459b;
                if (r instanceof HttpsURLConnection) {
                    aVar2 = new b(r);
                } else if (!(r instanceof HttpURLConnection)) {
                    return r;
                } else {
                    aVar2 = new a(r);
                }
                return aVar2;
            } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                URLConnection openConnection = url.openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    aVar = new b((HttpsURLConnection) openConnection);
                } else if (!(openConnection instanceof HttpURLConnection)) {
                    return openConnection;
                } else {
                    aVar = new a((HttpURLConnection) openConnection);
                }
                return aVar;
            } else {
                throw m2.f112462e;
            }
        }
    }
}
