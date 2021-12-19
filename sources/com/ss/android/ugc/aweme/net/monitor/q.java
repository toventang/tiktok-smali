package com.ss.android.ugc.aweme.net.monitor;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.net.model.TypeEnum;
import com.ss.android.ugc.aweme.net.model.UnexpectedConfig;
import com.ss.android.ugc.aweme.net.model.c;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.aweme.utils.m;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.Response;
import org.json.JSONObject;

public final class q implements h, i, k, l, m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f112481a;

    /* renamed from: b  reason: collision with root package name */
    public static final e<String> f112482b = new e<>(5);

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f112483c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());

    /* renamed from: d  reason: collision with root package name */
    public static final a f112484d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final List<UnexpectedConfig> f112485e;

    /* renamed from: f  reason: collision with root package name */
    private final List<UnexpectedConfig> f112486f;

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final e<Request, u<?>> a(e<Request, u<?>> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final boolean a() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<okhttp3.Request, Response> c(e<okhttp3.Request, Response> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> e(e<HttpURLConnection, InputStream> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> g(e<HttpURLConnection, InputStream> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> h(e<HttpURLConnection, InputStream> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> i(e<HttpURLConnection, Integer> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> j(e<HttpURLConnection, Integer> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> k(e<HttpURLConnection, InputStream> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> l(e<HttpURLConnection, InputStream> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<URL, URLConnection> m(e<URL, URLConnection> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.m
    public final e<WebResourceRequest, WebResourceResponse> o(e<WebResourceRequest, WebResourceResponse> eVar) {
        l.d(eVar, "");
        return eVar;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72294);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(72293);
        String simpleName = q.class.getSimpleName();
        l.b(simpleName, "");
        f112481a = simpleName;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f112487a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f112488b;

        static {
            Covode.recordClassIndex(72295);
        }

        b(WebView webView, JSONObject jSONObject) {
            this.f112487a = webView;
            this.f112488b = jSONObject;
        }

        public final void run() {
            int i2;
            String a2;
            ArrayList arrayList = new ArrayList();
            WebBackForwardList copyBackForwardList = this.f112487a.copyBackForwardList();
            l.b(copyBackForwardList, "");
            if (copyBackForwardList.getSize() > 10) {
                i2 = copyBackForwardList.getSize() - 10;
            } else {
                i2 = 0;
            }
            int size = copyBackForwardList.getSize();
            while (i2 < size) {
                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i2);
                l.b(itemAtIndex, "");
                String url = itemAtIndex.getUrl();
                l.b(url, "");
                arrayList.add(url);
                i2++;
            }
            if (!arrayList.isEmpty() && (a2 = n.a(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 63)) != null && !p.a((CharSequence) a2)) {
                this.f112488b.put("content", a2);
            }
            com.bytedance.apm.b.a(c.UNEXPECTED_NETWORK_LOG.getLogType(), this.f112488b);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.m
    public final e<String, WebResourceResponse> n(e<String, WebResourceResponse> eVar) {
        l.d(eVar, "");
        try {
            Uri parse = Uri.parse(URLDecoder.decode(eVar.f112458a, "UTF-8"));
            l.b(parse, "");
            a(this, parse, "5", eVar.f112460c, 8);
        } catch (Exception e2) {
            n.a.a(eVar.f112458a, "UnexpectedNetworkMonitor.onShouldInterceptRequestUrl", e2);
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<okhttp3.Request, Response> d(e<okhttp3.Request, Response> eVar) {
        l.d(eVar, "");
        R r = eVar.f112459b;
        if (r == null) {
            l.b();
        }
        String uri = r.request().url().uri().toString();
        l.b(uri, "");
        Uri parse = Uri.parse(uri);
        l.b(parse, "");
        a(this, parse, "4", null, 12);
        if (!this.f112486f.isEmpty()) {
            a((q) parse, (Uri) "4", o.a((Response) eVar.f112459b), (String) null);
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    @Override // com.ss.android.ugc.aweme.net.monitor.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.net.model.e<com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.u<?>> b(com.ss.android.ugc.aweme.net.model.e<com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.u<?>> r10) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.monitor.q.b(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> f(e<HttpURLConnection, InputStream> eVar) {
        h.p pVar;
        R r;
        MethodCollector.i(3498);
        l.d(eVar, "");
        Q q = eVar.f112458a;
        if (q == null) {
            l.b();
        }
        Uri parse = Uri.parse(q.getURL().toString());
        l.b(parse, "");
        InputStream inputStream = null;
        a(this, parse, "3", null, 12);
        Q q2 = eVar.f112458a;
        String contentType = q2 != null ? q2.getContentType() : null;
        if ((!this.f112486f.isEmpty()) && o.a(contentType)) {
            R r2 = eVar.f112459b;
            if (r2 == null) {
                pVar = null;
                r = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                for (int read = r2.read(bArr); read >= 0; read = r2.read(bArr)) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                pVar = new h.p(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                r = (R) pVar.getFirst();
            }
            eVar.f112459b = r;
            if (pVar != null) {
                inputStream = (InputStream) pVar.getSecond();
            }
            a((q) parse, (Uri) "3", o.a(contentType, inputStream), (String) null);
        }
        MethodCollector.o(3498);
        return eVar;
    }

    public q(List<UnexpectedConfig> list, List<UnexpectedConfig> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f112485e = list;
        this.f112486f = list2;
        ArrayList<UnexpectedConfig> arrayList = new ArrayList();
        for (T t : list) {
            if (TypeEnum.a.a(t.getType())) {
                arrayList.add(t);
            }
        }
        for (UnexpectedConfig unexpectedConfig : arrayList) {
            unexpectedConfig.setRegex(new h.m.l(unexpectedConfig.getPattern()));
        }
        List<UnexpectedConfig> list3 = this.f112486f;
        ArrayList<UnexpectedConfig> arrayList2 = new ArrayList();
        for (T t2 : list3) {
            if (TypeEnum.a.a(t2.getType())) {
                arrayList2.add(t2);
            }
        }
        for (UnexpectedConfig unexpectedConfig2 : arrayList2) {
            unexpectedConfig2.setRegex(new h.m.l(unexpectedConfig2.getPattern()));
        }
    }

    private final void a(Uri uri, String str, WebView webView, String str2) {
        boolean a2;
        List<String> targets;
        String uri2 = uri.toString();
        l.b(uri2, "");
        List<UnexpectedConfig> list = this.f112485e;
        ArrayList<UnexpectedConfig> arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.getTargets() == null || ((targets = t2.getTargets()) != null && targets.contains(str))) {
                arrayList.add(t);
            }
        }
        for (UnexpectedConfig unexpectedConfig : arrayList) {
            int type = unexpectedConfig.getType();
            if (type == TypeEnum.START_WITH.getType()) {
                a2 = p.b(uri2, unexpectedConfig.getPattern(), false);
            } else if (type == TypeEnum.CONTAINS.getType()) {
                a2 = p.e((CharSequence) uri2, (CharSequence) unexpectedConfig.getPattern());
            } else if (type == TypeEnum.REGEX_MATCHES.getType()) {
                h.m.l regex = unexpectedConfig.getRegex();
                if (regex != null) {
                    a2 = regex.matches(uri2);
                }
            } else if (type == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType()) {
                h.m.l regex2 = unexpectedConfig.getRegex();
                if (regex2 != null) {
                    a2 = regex2.containsMatchIn(uri2);
                }
            } else if (type == TypeEnum.EQUAL.getType()) {
                a2 = l.a((Object) unexpectedConfig.getPattern(), (Object) uri2);
            }
            if (a2) {
                a(uri, unexpectedConfig, str, str2, webView, null, 32);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Uri uri, String str, String str2, String str3) {
        h.m.l regex;
        boolean containsMatchIn;
        List<String> targets;
        if (!(str2 == null || p.a((CharSequence) str2))) {
            String path = uri.getPath();
            if (path == null || !p.b(path, "/tfe/api/request_combine/v", false)) {
                String path2 = uri.getPath();
                if (path2 != null && p.b(path2, "/aweme/v", false)) {
                    String path3 = uri.getPath();
                    if (path3 == null || !p.c(path3, "/settings/", false)) {
                        String path4 = uri.getPath();
                        if (path4 != null && p.c(path4, "/abtest/param/", false)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                List<UnexpectedConfig> list = this.f112486f;
                ArrayList<UnexpectedConfig> arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    if (t2.getTargets() == null || ((targets = t2.getTargets()) != null && targets.contains(str))) {
                        arrayList.add(t);
                    }
                }
                for (UnexpectedConfig unexpectedConfig : arrayList) {
                    int type = unexpectedConfig.getType();
                    if (type == TypeEnum.START_WITH.getType()) {
                        containsMatchIn = p.b(str2, unexpectedConfig.getPattern(), false);
                    } else if (type == TypeEnum.CONTAINS.getType()) {
                        containsMatchIn = p.e((CharSequence) str2, (CharSequence) unexpectedConfig.getPattern());
                    } else if (type == TypeEnum.REGEX_MATCHES.getType()) {
                        h.m.l regex2 = unexpectedConfig.getRegex();
                        if (regex2 != null) {
                            containsMatchIn = regex2.matches(str2);
                        }
                    } else if (type == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType() && (regex = unexpectedConfig.getRegex()) != null) {
                        containsMatchIn = regex.containsMatchIn(str2);
                    }
                    if (containsMatchIn) {
                        a(uri, unexpectedConfig, str, str3, null, str2, 16);
                    }
                }
            }
        }
    }

    private static /* synthetic */ void a(q qVar, Uri uri, String str, WebView webView, int i2) {
        if ((i2 & 4) != 0) {
            webView = null;
        }
        qVar.a(uri, str, webView, (String) null);
    }

    private static void a(Uri uri, UnexpectedConfig unexpectedConfig, String str, String str2, WebView webView, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", uri.getHost());
        jSONObject.put("path", uri.getPath());
        jSONObject.put("url", uri.toString());
        jSONObject.put("configId", unexpectedConfig.getId());
        jSONObject.put("config", unexpectedConfig.toString());
        jSONObject.put("net_type", str);
        jSONObject.put("page", m.a());
        if (str2 != null && !p.a((CharSequence) str2)) {
            jSONObject.put("logid", str2);
        }
        if (str3 != null && !p.a((CharSequence) str3)) {
            jSONObject.put("response", str3);
        }
        if (webView == null) {
            if (l.a((Object) str, (Object) "2")) {
                jSONObject.put("content", h.a.n.a(f112482b, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
            }
            com.bytedance.apm.b.a(c.UNEXPECTED_NETWORK_LOG.getLogType(), jSONObject);
        } else if (Build.VERSION.SDK_INT != 23 || webView.isAttachedToWindow()) {
            webView.post(new b(webView, jSONObject));
        } else {
            com.bytedance.apm.b.a(c.UNEXPECTED_NETWORK_LOG.getLogType(), jSONObject);
        }
    }

    private static /* synthetic */ void a(Uri uri, UnexpectedConfig unexpectedConfig, String str, String str2, WebView webView, String str3, int i2) {
        String str4 = str2;
        WebView webView2 = webView;
        String str5 = null;
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        if ((i2 & 16) != 0) {
            webView2 = null;
        }
        if ((i2 & 32) == 0) {
            str5 = str3;
        }
        a(uri, unexpectedConfig, str, str4, webView2, str5);
    }
}
