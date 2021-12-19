package com.appsflyer.internal;

import com.appsflyer.internal.model.event.BackgroundEvent;
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

public final class ad implements Runnable {

    /* renamed from: Ι  reason: contains not printable characters */
    private final BackgroundEvent f168;

    static {
        Covode.recordClassIndex(2711);
    }

    public final void run() {
        m125();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01dc  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection m125() {
        /*
        // Method dump skipped, instructions count: 479
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ad.m125():java.net.HttpURLConnection");
    }

    public ad(BackgroundEvent backgroundEvent) {
        this.f168 = (BackgroundEvent) backgroundEvent.weakContext();
    }

    public static URLConnection com_appsflyer_internal_ad_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
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
