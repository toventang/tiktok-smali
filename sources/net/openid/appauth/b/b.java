package net.openid.appauth.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.l.a;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import net.openid.appauth.p;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f159590a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final int f159591b = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: c  reason: collision with root package name */
    private static final int f159592c = ((int) TimeUnit.SECONDS.toMillis(10));

    private b() {
    }

    static {
        Covode.recordClassIndex(106068);
    }

    @Override // net.openid.appauth.b.a
    public final HttpURLConnection a(Uri uri) {
        R openConnection;
        URLConnection aVar;
        p.a(uri, "url must not be null");
        p.a("https".equals(uri.getScheme()), "only https connections are permitted");
        URL url = new URL(uri.toString());
        e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
        if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
            openConnection = m2.f112459b;
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new com.ss.android.ugc.aweme.net.l.b(openConnection);
            } else {
                if (openConnection instanceof HttpURLConnection) {
                    aVar = new a(openConnection);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(f159591b);
                httpURLConnection.setReadTimeout(f159592c);
                httpURLConnection.setInstanceFollowRedirects(false);
                return httpURLConnection;
            }
        } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
            openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new com.ss.android.ugc.aweme.net.l.b((HttpsURLConnection) openConnection);
            } else {
                if (openConnection instanceof HttpURLConnection) {
                    aVar = new a((HttpURLConnection) openConnection);
                }
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                httpURLConnection2.setConnectTimeout(f159591b);
                httpURLConnection2.setReadTimeout(f159592c);
                httpURLConnection2.setInstanceFollowRedirects(false);
                return httpURLConnection2;
            }
        } else {
            throw m2.f112462e;
        }
        openConnection = aVar;
        HttpURLConnection httpURLConnection22 = (HttpURLConnection) openConnection;
        httpURLConnection22.setConnectTimeout(f159591b);
        httpURLConnection22.setReadTimeout(f159592c);
        httpURLConnection22.setInstanceFollowRedirects(false);
        return httpURLConnection22;
    }
}
