package com.ss.android.ugc.aweme.compliance.business.c;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.i;
import com.ss.android.ugc.aweme.net.monitor.k;
import com.ss.android.ugc.aweme.net.monitor.l;
import com.ss.android.ugc.aweme.net.monitor.m;
import h.a.n;
import h.m.p;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public final class c implements i, k, l, m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f76844a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f76845b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public static final a f76846c = new a((byte) 0);

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final e<Request, u<?>> b(e<Request, u<?>> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<okhttp3.Request, Response> d(e<okhttp3.Request, Response> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> e(e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> f(e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> g(e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> h(e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> i(e<HttpURLConnection, Integer> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> j(e<HttpURLConnection, Integer> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47501);
        }

        private a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
            if (com.ss.android.ugc.aweme.net.model.ScopeEnum.a.a(r0.intValue()) != false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
            if (com.ss.android.ugc.aweme.net.model.ScopeEnum.a.a(r0.intValue()) != false) goto L_0x0080;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.net.j.b a() {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.c.a.a():com.ss.android.ugc.aweme.net.j.b");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(b bVar) {
            h.f.b.l.d(bVar, "");
            try {
                JSONObject jSONObject = new JSONObject();
                String str = bVar.f76837d;
                if (str == null) {
                    str = bVar.f76836c;
                }
                Uri parse = Uri.parse(str);
                h.f.b.l.b(parse, "");
                jSONObject.put("host", parse.getHost());
                jSONObject.put("path", parse.getPath());
                jSONObject.put("url", str);
                String str2 = bVar.f76835b;
                if (str2 != null && !p.a((CharSequence) str2)) {
                    jSONObject.put("net_type", bVar.f76835b);
                }
                if (!bVar.f76838e.isEmpty()) {
                    jSONObject.put("header_list", bVar.f76838e);
                }
                if (!bVar.f76839f.isEmpty()) {
                    jSONObject.put("header", bVar.f76839f);
                }
                if (!bVar.f76840g.isEmpty()) {
                    jSONObject.put("cookie_list", bVar.f76840g);
                }
                if (!bVar.f76841h.isEmpty()) {
                    jSONObject.put("cookie", bVar.f76841h);
                }
                if (!bVar.f76843j.isEmpty()) {
                    jSONObject.put("url_query", bVar.f76843j);
                }
                if (!bVar.f76842i.isEmpty()) {
                    jSONObject.put("url_query_list", bVar.f76842i);
                }
                b.a(com.ss.android.ugc.aweme.net.model.c.HTTP_COOKIE_TOKEN_LOG.getLogType(), jSONObject);
            } catch (Exception unused) {
            }
        }

        public static boolean a(com.ss.android.ugc.aweme.net.j.b bVar, String str) {
            if (bVar != null && !TextUtils.isEmpty(str) && !com.bytedance.common.utility.collection.b.a((Collection) bVar.f112397e)) {
                List<com.ss.android.ugc.aweme.net.j.a> list = bVar.f112397e;
                try {
                    Uri parse = Uri.parse(str);
                    h.f.b.l.b(parse, "");
                    String host = parse.getHost();
                    String path = parse.getPath();
                    if (!TextUtils.isEmpty(host)) {
                        if (list == null) {
                            h.f.b.l.b();
                        }
                        Iterator<com.ss.android.ugc.aweme.net.j.a> it = list.iterator();
                        if (it.hasNext()) {
                            com.ss.android.ugc.aweme.net.j.a next = it.next();
                            Set<String> set = next.f112391a;
                            Set<String> set2 = next.f112392b;
                            if (com.bytedance.common.utility.collection.b.a((Collection) set)) {
                                if (!com.bytedance.common.utility.collection.b.a((Collection) set2)) {
                                    if (!TextUtils.isEmpty(path)) {
                                        if (set2 == null) {
                                            h.f.b.l.b();
                                        }
                                        return n.a((Iterable) set2, (Object) path);
                                    }
                                }
                                return false;
                            }
                            if (set == null) {
                                h.f.b.l.b();
                            }
                            if (n.a((Iterable) set, (Object) host)) {
                                if (TextUtils.isEmpty(path) || com.bytedance.common.utility.collection.b.a((Collection) set2)) {
                                    return true;
                                }
                                if (set2 == null) {
                                    h.f.b.l.b();
                                }
                                if (n.a((Iterable) set2, (Object) path)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(47500);
        String simpleName = c.class.getSimpleName();
        h.f.b.l.b(simpleName, "");
        f76844a = simpleName;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.m
    public final e<String, WebResourceResponse> n(e<String, WebResourceResponse> eVar) {
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (q != null && p.b((String) q, "http://", false)) {
            b bVar = new b("5", q);
            a(bVar);
            a.a(bVar);
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> k(e<HttpURLConnection, InputStream> eVar) {
        URL url;
        String url2;
        String str;
        String str2;
        Set<String> set;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (!(q == null || (url = q.getURL()) == null || (url2 = url.toString()) == null || !p.b(url2, "http://", false))) {
            JSONObject jSONObject = eVar.f112461d;
            if (jSONObject != null) {
                str = jSONObject.optString("key", "");
                str2 = jSONObject.optString("value", "");
            } else {
                str = "";
                str2 = str;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                b bVar = new b("3", url2);
                Set<String> set2 = bVar.f76838e;
                if (str == null) {
                    h.f.b.l.b();
                }
                set2.add(str);
                com.ss.android.ugc.aweme.net.j.b a2 = a.a();
                if (!(a.a(a2, bVar.f76836c) || a2 == null || (set = a2.f112396d) == null)) {
                    Locale locale = Locale.ROOT;
                    h.f.b.l.b(locale, "");
                    String lowerCase = str.toLowerCase(locale);
                    h.f.b.l.b(lowerCase, "");
                    if (set.contains(lowerCase)) {
                        eVar.a(d.DROP);
                        bVar.f76839f.add(str);
                        bVar.f76834a = true;
                    }
                }
                if (!bVar.f76834a && (h.f.b.l.a((Object) str, (Object) "Cookie") || h.f.b.l.a((Object) str, (Object) "X-SS-Cookie"))) {
                    String a3 = a(str2, bVar);
                    if (jSONObject != null) {
                        jSONObject.put(str, a3);
                    }
                }
                a.a(bVar);
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> l(e<HttpURLConnection, InputStream> eVar) {
        URL url;
        String url2;
        String str;
        String str2;
        Set<String> set;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (!(q == null || (url = q.getURL()) == null || (url2 = url.toString()) == null || !p.b(url2, "http://", false))) {
            JSONObject jSONObject = eVar.f112461d;
            if (jSONObject != null) {
                str = jSONObject.optString("key", "");
                str2 = jSONObject.optString("value", "");
            } else {
                str = "";
                str2 = str;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                b bVar = new b("3", url2);
                Set<String> set2 = bVar.f76838e;
                if (str == null) {
                    h.f.b.l.b();
                }
                set2.add(str);
                com.ss.android.ugc.aweme.net.j.b a2 = a.a();
                if (!(a.a(a2, bVar.f76836c) || a2 == null || (set = a2.f112396d) == null)) {
                    Locale locale = Locale.ROOT;
                    h.f.b.l.b(locale, "");
                    String lowerCase = str.toLowerCase(locale);
                    h.f.b.l.b(lowerCase, "");
                    if (set.contains(lowerCase)) {
                        eVar.a(d.DROP);
                        bVar.f76839f.add(str);
                        bVar.f76834a = true;
                    }
                }
                if (!bVar.f76834a && (h.f.b.l.a((Object) str, (Object) "Cookie") || h.f.b.l.a((Object) str, (Object) "X-SS-Cookie"))) {
                    String a3 = a(str2, bVar);
                    if (jSONObject != null) {
                        jSONObject.put(str, a3);
                    }
                }
                a.a(bVar);
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<URL, URLConnection> m(e<URL, URLConnection> eVar) {
        String url;
        R r;
        HttpURLConnection httpURLConnection;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (!(q == null || (url = q.toString()) == null || !p.b(url, "http://", false) || eVar.f112458a == null)) {
            b bVar = new b("3", url);
            a(bVar);
            if (bVar.f76834a) {
                URL url2 = new URL(bVar.f76837d);
                e<URL, URLConnection> m2 = com.ss.android.ugc.aweme.net.monitor.n.f112474e.m(new e<>(url2, null, null, d.CONTINUE));
                if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
                    r = m2.f112459b;
                    if (r instanceof HttpsURLConnection) {
                        httpURLConnection = new com.ss.android.ugc.aweme.net.l.b(r);
                    } else {
                        if (r instanceof HttpURLConnection) {
                            httpURLConnection = new com.ss.android.ugc.aweme.net.l.a(r);
                        }
                        eVar.f112459b = r;
                        eVar.a(d.INTERCEPT);
                    }
                } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                    r = (R) url2.openConnection();
                    if (r instanceof HttpsURLConnection) {
                        httpURLConnection = new com.ss.android.ugc.aweme.net.l.b(r);
                    } else {
                        if (r instanceof HttpURLConnection) {
                            httpURLConnection = new com.ss.android.ugc.aweme.net.l.a(r);
                        }
                        eVar.f112459b = r;
                        eVar.a(d.INTERCEPT);
                    }
                } else {
                    throw m2.f112462e;
                }
                r = (R) httpURLConnection;
                eVar.f112459b = r;
                eVar.a(d.INTERCEPT);
            }
            a.a(bVar);
        }
        return eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.net.monitor.m
    public final e<WebResourceRequest, WebResourceResponse> o(e<WebResourceRequest, WebResourceResponse> eVar) {
        Q q;
        Uri url;
        String uri;
        Set<String> set;
        h.f.b.l.d(eVar, "");
        if (!(Build.VERSION.SDK_INT < 21 || (q = eVar.f112458a) == null || (url = q.getUrl()) == null || (uri = url.toString()) == null || !p.b(uri, "http://", false))) {
            Map<String, String> requestHeaders = q.getRequestHeaders();
            b bVar = new b("5", uri);
            a(bVar);
            if (requestHeaders != null) {
                bVar.f76838e.addAll(requestHeaders.keySet());
                com.ss.android.ugc.aweme.net.j.b a2 = a.a();
                if (a2 != null && (set = a2.f112396d) != null && !set.isEmpty() && !a.a(a2, bVar.f76836c)) {
                    Set<String> keySet = requestHeaders.keySet();
                    ArrayList arrayList = new ArrayList();
                    for (T t : keySet) {
                        T t2 = t;
                        h.f.b.l.b(t2, "");
                        Locale locale = Locale.ROOT;
                        h.f.b.l.b(locale, "");
                        Objects.requireNonNull(t2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = t2.toLowerCase(locale);
                        h.f.b.l.b(lowerCase, "");
                        if (set.contains(lowerCase)) {
                            arrayList.add(t);
                        }
                    }
                    for (Object obj : arrayList) {
                        Set<String> set2 = bVar.f76838e;
                        h.f.b.l.b(obj, "");
                        set2.add(obj);
                        bVar.f76834a = true;
                    }
                }
                String str = requestHeaders.get("Cookie");
                if (str != null && !p.a((CharSequence) str)) {
                    a(str, bVar);
                }
                String str2 = requestHeaders.get("X-SS-Cookie");
                if (str2 != null && !p.a((CharSequence) str2)) {
                    a(str2, bVar);
                }
            }
        }
        return eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    private static void a(b bVar) {
        Set<String> set;
        com.ss.android.ugc.aweme.net.j.b a2 = a.a();
        if (a2 != null) {
            set = a2.f112396d;
        } else {
            set = null;
        }
        if (!TextUtils.isEmpty(bVar.f76836c)) {
            Uri parse = Uri.parse(bVar.f76836c);
            h.f.b.l.b(parse, "");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (!(queryParameterNames == null || queryParameterNames.isEmpty())) {
                bVar.f76842i.addAll(queryParameterNames);
                if (!(set == null || set.isEmpty() || a.a(a2, bVar.f76836c))) {
                    Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                    ArrayList<String> arrayList = new ArrayList();
                    for (T t : queryParameterNames) {
                        T t2 = t;
                        h.f.b.l.b(t2, "");
                        Locale locale = Locale.ROOT;
                        h.f.b.l.b(locale, "");
                        Objects.requireNonNull(t2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = t2.toLowerCase(locale);
                        h.f.b.l.b(lowerCase, "");
                        if (!set.contains(lowerCase)) {
                            arrayList.add(t);
                        }
                    }
                    for (String str : arrayList) {
                        clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (T t3 : queryParameterNames) {
                        T t4 = t3;
                        h.f.b.l.b(t4, "");
                        Locale locale2 = Locale.ROOT;
                        h.f.b.l.b(locale2, "");
                        Objects.requireNonNull(t4, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase2 = t4.toLowerCase(locale2);
                        h.f.b.l.b(lowerCase2, "");
                        if (set.contains(lowerCase2)) {
                            arrayList2.add(t3);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    if (!arrayList3.isEmpty()) {
                        for (Object obj : arrayList3) {
                            Set<String> set2 = bVar.f76843j;
                            h.f.b.l.b(obj, "");
                            set2.add(obj);
                        }
                        bVar.f76834a = true;
                    }
                    bVar.f76837d = clearQuery.build().toString();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<okhttp3.Request, Response> c(e<okhttp3.Request, Response> eVar) {
        HttpUrl url;
        String httpUrl;
        Set<String> names;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        Headers.Builder builder = null;
        if (!(q == null || (url = q.url()) == null || (httpUrl = url.toString()) == null || !p.b(httpUrl, "http://", false))) {
            com.ss.android.ugc.aweme.net.j.b a2 = a.a();
            Set<String> set = a2 != null ? a2.f112396d : null;
            b bVar = new b("4", httpUrl);
            a(bVar);
            Headers headers = q.headers();
            if (headers != null) {
                Set<String> set2 = bVar.f76838e;
                Set<String> names2 = headers.names();
                h.f.b.l.b(names2, "");
                set2.addAll(names2);
                builder = headers.newBuilder();
                if (!a.a(a2, bVar.f76836c) && set != null && !set.isEmpty() && (names = headers.names()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : names) {
                        T t2 = t;
                        h.f.b.l.b(t2, "");
                        Locale locale = Locale.ROOT;
                        h.f.b.l.b(locale, "");
                        Objects.requireNonNull(t2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = t2.toLowerCase(locale);
                        h.f.b.l.b(lowerCase, "");
                        if (set.contains(lowerCase)) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<String> arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (String str : arrayList2) {
                            Set<String> set3 = bVar.f76839f;
                            h.f.b.l.b(str, "");
                            set3.add(str);
                            if (builder != null) {
                                builder.removeAll(str);
                            }
                        }
                        bVar.f76834a = true;
                    }
                }
                String str2 = builder.get("Cookie");
                if (str2 != null && !p.a((CharSequence) str2)) {
                    builder.set("Cookie", a(str2, bVar));
                }
                String str3 = builder.get("X-SS-Cookie");
                if (str3 != null && !p.a((CharSequence) str3)) {
                    builder.set("X-SS-Cookie", a(str3, bVar));
                }
            }
            if (bVar.f76834a) {
                Request.Builder newBuilder = q.newBuilder();
                String str4 = bVar.f76837d;
                if (str4 != null) {
                    httpUrl = str4;
                }
                newBuilder.url(httpUrl);
                if (builder != null) {
                    newBuilder.headers(builder.build());
                }
                eVar.f112458a = (Q) newBuilder.build();
            }
            a.a(bVar);
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final e<com.bytedance.retrofit2.client.Request, u<?>> a(e<com.bytedance.retrofit2.client.Request, u<?>> eVar) {
        String url;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        String str = null;
        if (!(q == null || (url = q.getUrl()) == null || !p.b(url, "http://", false))) {
            com.ss.android.ugc.aweme.net.j.b a2 = a.a();
            Set<String> set = a2 != null ? a2.f112396d : null;
            b bVar = new b("2", url);
            a(bVar);
            ArrayList headers = q.getHeaders();
            if (headers != null && !headers.isEmpty()) {
                Set<String> set2 = bVar.f76838e;
                ArrayList arrayList = new ArrayList(n.a((Iterable) headers, 10));
                for (T t : headers) {
                    h.f.b.l.b(t, "");
                    arrayList.add(t.f42471a);
                }
                set2.addAll(arrayList);
                if (!a.a(a2, bVar.f76836c)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t2 : headers) {
                        T t3 = t2;
                        if (set != null) {
                            h.f.b.l.b(t3, "");
                            String str2 = t3.f42471a;
                            h.f.b.l.b(str2, "");
                            Locale locale = Locale.ROOT;
                            h.f.b.l.b(locale, "");
                            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase = str2.toLowerCase(locale);
                            h.f.b.l.b(lowerCase, "");
                            if (set.contains(lowerCase)) {
                            }
                        }
                        arrayList2.add(t2);
                    }
                    headers = arrayList2;
                    Set<com.bytedance.retrofit2.client.b> c2 = n.c((Iterable) headers, (Iterable) headers);
                    if (c2 != null && !c2.isEmpty()) {
                        for (com.bytedance.retrofit2.client.b bVar2 : c2) {
                            Set<String> set3 = bVar.f76839f;
                            h.f.b.l.b(bVar2, "");
                            String str3 = bVar2.f42471a;
                            h.f.b.l.b(str3, "");
                            set3.add(str3);
                        }
                        bVar.f76834a = true;
                    }
                }
                h.f.b.l.b(headers, "");
                Iterator<com.bytedance.retrofit2.client.b> it = headers.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.retrofit2.client.b next = it.next();
                    h.f.b.l.b(next, "");
                    if (!h.f.b.l.a((Object) next.f42471a, (Object) "Cookie")) {
                        i2++;
                    } else if (i2 >= 0) {
                        com.bytedance.retrofit2.client.b bVar3 = headers.get(i2);
                        String a3 = a(bVar3 != null ? bVar3.f42472b : null, bVar);
                        com.bytedance.retrofit2.client.b bVar4 = headers.get(i2);
                        h.f.b.l.b(bVar4, "");
                        headers.set(i2, new com.bytedance.retrofit2.client.b(bVar4.f42471a, a3));
                    }
                }
                Iterator<com.bytedance.retrofit2.client.b> it2 = headers.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.bytedance.retrofit2.client.b next2 = it2.next();
                    h.f.b.l.b(next2, "");
                    if (!h.f.b.l.a((Object) next2.f42471a, (Object) "X-SS-Cookie")) {
                        i3++;
                    } else if (i3 >= 0) {
                        com.bytedance.retrofit2.client.b bVar5 = headers.get(i3);
                        if (bVar5 != null) {
                            str = bVar5.f42472b;
                        }
                        String a4 = a(str, bVar);
                        com.bytedance.retrofit2.client.b bVar6 = headers.get(i3);
                        h.f.b.l.b(bVar6, "");
                        headers.set(i3, new com.bytedance.retrofit2.client.b(bVar6.f42471a, a4));
                    }
                }
            }
            if (bVar.f76834a) {
                Request.a newBuilder = q.newBuilder();
                String str4 = bVar.f76837d;
                if (str4 == null) {
                    str4 = bVar.f76836c;
                }
                newBuilder.a(str4);
                if (headers != null && !headers.isEmpty()) {
                    newBuilder.f42460c = headers;
                }
                eVar.f112458a = (Q) newBuilder.a();
            }
            a.a(bVar);
        }
        return eVar;
    }

    private static String a(String str, b bVar) {
        Set<String> set;
        int i2;
        boolean z;
        com.ss.android.ugc.aweme.net.j.b a2 = a.a();
        if (a2 != null) {
            set = a2.f112396d;
        } else {
            set = null;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                h.f.b.l.b();
            }
            int i3 = 0;
            Object[] array = new h.m.l(";").split(str, 0).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i4 = 0;
            while (i4 < length) {
                String str2 = strArr[i4];
                Object[] array2 = new h.m.l("=").split(str2, i3).toArray(new String[i3]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr2 = (String[]) array2;
                if (strArr2.length > 1) {
                    String str3 = strArr2[i3];
                    int length2 = str3.length() - 1;
                    int i5 = 0;
                    boolean z2 = false;
                    while (i5 <= length2) {
                        if (!z2) {
                            i2 = i5;
                        } else {
                            i2 = length2;
                        }
                        if (h.f.b.l.a(str3.charAt(i2), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2) {
                            if (!z) {
                                break;
                            }
                            length2--;
                        } else if (!z) {
                            z2 = true;
                        } else {
                            i5++;
                        }
                    }
                    String obj = str3.subSequence(i5, length2 + 1).toString();
                    bVar.f76840g.add(obj);
                    if (set != null) {
                        Locale locale = Locale.ROOT;
                        h.f.b.l.b(locale, "");
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = obj.toLowerCase(locale);
                        h.f.b.l.b(lowerCase, "");
                        if (set.contains(lowerCase) && !a.a(a2, bVar.f76836c)) {
                            bVar.f76841h.add(obj);
                            bVar.f76834a = true;
                        }
                    }
                    sb.append(str2).append(";");
                } else {
                    sb.append(str2).append(";");
                }
                i4++;
                i3 = 0;
            }
            if (!a.a(a2, bVar.f76836c)) {
                return sb.toString();
            }
        }
        return str;
    }
}
