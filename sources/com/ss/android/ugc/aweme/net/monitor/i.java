package com.ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.model.e;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public interface i extends j {
    static {
        Covode.recordClassIndex(72281);
    }

    boolean a();

    e<HttpURLConnection, InputStream> e(e<HttpURLConnection, InputStream> eVar);

    e<HttpURLConnection, InputStream> f(e<HttpURLConnection, InputStream> eVar);

    e<HttpURLConnection, InputStream> g(e<HttpURLConnection, InputStream> eVar);

    e<HttpURLConnection, InputStream> h(e<HttpURLConnection, InputStream> eVar);

    e<HttpURLConnection, Integer> i(e<HttpURLConnection, Integer> eVar);

    e<HttpURLConnection, Integer> j(e<HttpURLConnection, Integer> eVar);

    e<HttpURLConnection, InputStream> k(e<HttpURLConnection, InputStream> eVar);

    e<HttpURLConnection, InputStream> l(e<HttpURLConnection, InputStream> eVar);

    e<URL, URLConnection> m(e<URL, URLConnection> eVar);
}
