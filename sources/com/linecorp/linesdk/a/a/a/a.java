package com.linecorp.linesdk.a.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.linecorp.linesdk.LineApiError;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f54946a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final e f54947b;

    /* renamed from: c  reason: collision with root package name */
    private final d f54948c;

    /* renamed from: d  reason: collision with root package name */
    private int f54949d;

    /* renamed from: e  reason: collision with root package name */
    private int f54950e;

    static {
        Covode.recordClassIndex(34510);
    }

    private a(e eVar) {
        this.f54947b = eVar;
        this.f54948c = new d("UTF-8");
        this.f54949d = 90000;
        this.f54950e = 90000;
    }

    private static HttpURLConnection a(Uri uri) {
        URLConnection a2 = a(new URL(uri.toString()));
        if (!(a2 instanceof HttpsURLConnection)) {
            throw new IllegalArgumentException("The scheme of the server url must be https.".concat(String.valueOf(uri)));
        } else if (Build.VERSION.SDK_INT >= 24) {
            return (HttpURLConnection) a2;
        } else {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a2;
            httpsURLConnection.setSSLSocketFactory(new com.linecorp.a.a.a(httpsURLConnection.getSSLSocketFactory()));
            return httpsURLConnection;
        }
    }

    private static URLConnection a(URL url) {
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
                aVar2 = new com.ss.android.ugc.aweme.net.l.a(r);
            }
            return aVar2;
        } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new b((HttpsURLConnection) openConnection);
            } else if (!(openConnection instanceof HttpURLConnection)) {
                return openConnection;
            } else {
                aVar = new com.ss.android.ugc.aweme.net.l.a((HttpURLConnection) openConnection);
            }
            return aVar;
        } else {
            throw m2.f112462e;
        }
    }

    private static byte[] a(Map<String, String> map) {
        if (map.isEmpty()) {
            return f54946a;
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        try {
            return builder.build().getEncodedQuery().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public a(Context context, String str) {
        this(new e(context, str));
    }

    private static void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private static <T> com.linecorp.linesdk.a<T> a(HttpURLConnection httpURLConnection, c<T> cVar, c<String> cVar2) {
        GZIPInputStream errorStream;
        MethodCollector.i(10237);
        if (httpURLConnection.getResponseCode() < 400) {
            errorStream = httpURLConnection.getInputStream();
        } else {
            errorStream = httpURLConnection.getErrorStream();
        }
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (list.get(i2).equalsIgnoreCase("gzip")) {
                    errorStream = new GZIPInputStream(errorStream);
                    break;
                } else {
                    i2++;
                }
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            try {
                com.linecorp.linesdk.a<T> a2 = com.linecorp.linesdk.a.a(com.linecorp.linesdk.b.SERVER_ERROR, new LineApiError(responseCode, cVar2.a(errorStream)));
                MethodCollector.o(10237);
                return a2;
            } catch (IOException e2) {
                com.linecorp.linesdk.a<T> a3 = com.linecorp.linesdk.a.a(com.linecorp.linesdk.b.INTERNAL_ERROR, new LineApiError(responseCode, e2));
                MethodCollector.o(10237);
                return a3;
            }
        } else {
            T a4 = cVar.a(errorStream);
            if (a4 == null) {
                com.linecorp.linesdk.a<T> aVar = (com.linecorp.linesdk.a<T>) com.linecorp.linesdk.a.f54938a;
                MethodCollector.o(10237);
                return aVar;
            }
            com.linecorp.linesdk.a<T> aVar2 = new com.linecorp.linesdk.a<>(com.linecorp.linesdk.b.SUCCESS, a4, LineApiError.f54929a);
            MethodCollector.o(10237);
            return aVar2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r4 == null) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.linecorp.linesdk.a<T> b(android.net.Uri r6, java.util.Map<java.lang.String, java.lang.String> r7, java.util.Map<java.lang.String, java.lang.String> r8, com.linecorp.linesdk.a.a.a.c<T> r9) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.a.a.a.a.b(android.net.Uri, java.util.Map, java.util.Map, com.linecorp.linesdk.a.a.a.c):com.linecorp.linesdk.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r6 == null) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.linecorp.linesdk.a<T> a(android.net.Uri r9, java.util.Map<java.lang.String, java.lang.String> r10, java.util.Map<java.lang.String, java.lang.String> r11, com.linecorp.linesdk.a.a.a.c<T> r12) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.a.a.a.a.a(android.net.Uri, java.util.Map, java.util.Map, com.linecorp.linesdk.a.a.a.c):com.linecorp.linesdk.a");
    }
}
