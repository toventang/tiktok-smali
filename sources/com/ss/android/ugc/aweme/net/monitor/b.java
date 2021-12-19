package com.ss.android.ugc.aweme.net.monitor;

import b.i;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.net.model.c;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public final class b implements h, i, k {
    static {
        Covode.recordClassIndex(72274);
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<Request, Response> c(e<Request, Response> eVar) {
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> f(e<HttpURLConnection, InputStream> eVar) {
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> g(e<HttpURLConnection, InputStream> eVar) {
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> h(e<HttpURLConnection, InputStream> eVar) {
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> i(e<HttpURLConnection, Integer> eVar) {
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> j(e<HttpURLConnection, Integer> eVar) {
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<URL, URLConnection> m(e<URL, URLConnection> eVar) {
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> e(e<HttpURLConnection, InputStream> eVar) {
        Q q = eVar.f112458a;
        if (!n.a.a((HttpURLConnection) q)) {
            a(q.getURL(), null, q.getContentType());
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<Request, Response> d(e<Request, Response> eVar) {
        Request request;
        boolean z;
        R r = eVar.f112459b;
        if (!(r == null || (request = r.request()) == null)) {
            try {
                HttpUrl url = request.url();
                if (url != null) {
                    String host = url.host();
                    String encodedPath = url.encodedPath();
                    boolean isHttps = url.isHttps();
                    if (request.header("cookie") != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a(host, encodedPath, z, isHttps, r.header("content-type"), "4");
                }
            } catch (Exception unused) {
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> k(e<HttpURLConnection, InputStream> eVar) {
        String str;
        Q q = eVar.f112458a;
        JSONObject jSONObject = eVar.f112461d;
        if (jSONObject != null) {
            str = jSONObject.optString("key", "");
            jSONObject.optString("value", "");
        } else {
            str = "";
        }
        if (!n.a.a((HttpURLConnection) q)) {
            a(q.getURL(), str, "");
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> l(e<HttpURLConnection, InputStream> eVar) {
        String str;
        Q q = eVar.f112458a;
        JSONObject jSONObject = eVar.f112461d;
        if (jSONObject != null) {
            str = jSONObject.optString("key", "");
            jSONObject.optString("value", "");
        } else {
            str = "";
        }
        if (!n.a.a((HttpURLConnection) q)) {
            a(q.getURL(), str, "");
        }
        return eVar;
    }

    private static void a(URL url, String str, String str2) {
        if (url != null) {
            try {
                a(url.getHost(), url.getPath(), "cookie".equalsIgnoreCase(str), "https".equals(url.getProtocol()), str2, "3");
            } catch (Exception unused) {
            }
        }
    }

    private static void a(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        i.b(new c(str3, str, str2, z2, str4, z), g.c());
    }

    private static void a(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", str);
            jSONObject.put("uri", str2);
            jSONObject.put("cookie", String.valueOf(z));
            jSONObject.put("item_type", str3);
            jSONObject.put("data_protocol", String.valueOf(z2));
            jSONObject.put("netClientType", str4);
            com.bytedance.apm.b.a(c.NATIVE_NETWORK_API_LOG.getLogType(), jSONObject);
        } catch (Exception unused) {
        }
    }

    static final /* synthetic */ Object a(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        boolean z3;
        if (str.contains("video") || str.contains(DataType.AUDIO) || str.contains("image")) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str5 = str2 + str3;
        if (!z) {
            if (z3 && !z2) {
                return null;
            }
            a(str2, str5, z2, str, false, str4);
            return null;
        } else if ((z3 || str3 == null || str3.contains("v1/play")) && (!z2 || !z3)) {
            return null;
        } else {
            a(str2, str5, z2, str, z, str4);
            return null;
        }
    }
}
