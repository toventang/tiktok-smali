package com.google.android.gms.ads.identifier;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* access modifiers changed from: package-private */
public final class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Map f49682a;

    static {
        Covode.recordClassIndex(31047);
    }

    a(Map map) {
        this.f49682a = map;
    }

    public final void run() {
        String str;
        R r;
        HttpURLConnection httpURLConnection;
        URLConnection uRLConnection;
        Map map = this.f49682a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String uri = buildUpon.build().toString();
        try {
            URL url = new URL(uri);
            e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
            if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
                r = m2.f112459b;
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new b(r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new com.ss.android.ugc.aweme.net.l.a(r);
                    }
                    httpURLConnection = (HttpURLConnection) r;
                    int responseCode = httpURLConnection.getResponseCode();
                    String.valueOf(uri).length();
                }
            } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                r = url.openConnection();
                if (r instanceof HttpsURLConnection) {
                    uRLConnection = new b((HttpsURLConnection) r);
                } else {
                    if (r instanceof HttpURLConnection) {
                        uRLConnection = new com.ss.android.ugc.aweme.net.l.a((HttpURLConnection) r);
                    }
                    httpURLConnection = (HttpURLConnection) r;
                    int responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 < 200 || responseCode2 >= 300) {
                        String.valueOf(uri).length();
                    }
                }
            } else {
                throw m2.f112462e;
            }
            r = uRLConnection;
            httpURLConnection = (HttpURLConnection) r;
            try {
                int responseCode22 = httpURLConnection.getResponseCode();
                String.valueOf(uri).length();
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IndexOutOfBoundsException e2) {
            str = e2.getMessage();
            String.valueOf(uri).length();
            String.valueOf(str).length();
        } catch (IOException | RuntimeException e3) {
            str = e3.getMessage();
            String.valueOf(uri).length();
            String.valueOf(str).length();
        }
    }
}
