package com.ss.android.ugc.aweme.net.monitor;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.net.j.f;
import com.ss.android.ugc.aweme.net.model.ScopeEnum;
import com.ss.android.ugc.aweme.net.model.UnexpectedConfig;
import com.ss.android.ugc.aweme.net.model.c;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import okhttp3.HttpUrl;
import okhttp3.Response;
import org.json.JSONObject;

public final class n implements f, g, h, i, k, l, m {

    /* renamed from: a  reason: collision with root package name */
    public static final h f112470a = i.a((h.f.a.a) b.f112479a);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f112471b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f112472c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f112473d;

    /* renamed from: e  reason: collision with root package name */
    public static final n f112474e = new n();

    /* renamed from: f  reason: collision with root package name */
    public static final CopyOnWriteArrayList<j> f112475f = new CopyOnWriteArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public static final a f112476g = new a((byte) 0);

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final boolean a() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72287);
        }

        private static boolean b() {
            return ((Boolean) n.f112470a.getValue()).booleanValue();
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.net.monitor.n$a$a  reason: collision with other inner class name */
        static final class C2872a implements com.bytedance.ies.abmock.i {

            /* renamed from: a  reason: collision with root package name */
            public static final C2872a f112477a = new C2872a();

            static {
                Covode.recordClassIndex(72288);
            }

            C2872a() {
            }

            @Override // com.bytedance.ies.abmock.i
            public final void a() {
                ExecutorService b2 = g.b();
                l.b(b2, "");
                b2.execute(AnonymousClass1.f112478a);
            }
        }

        public static boolean a() {
            if (n.f112472c) {
                return b();
            }
            return Keva.getRepo("keva_repo_native_network_monitor", 1).getBoolean("keva_key_native_network_monitor", true);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static List<UnexpectedConfig> a(UnexpectedConfig[] unexpectedConfigArr) {
            if (unexpectedConfigArr != null) {
                ArrayList arrayList = new ArrayList();
                for (UnexpectedConfig unexpectedConfig : unexpectedConfigArr) {
                    if (ScopeEnum.a.a(unexpectedConfig.getScope())) {
                        arrayList.add(unexpectedConfig);
                    }
                }
                List<UnexpectedConfig> k2 = h.a.n.k(arrayList);
                if (k2 != null) {
                    return k2;
                }
            }
            return z.INSTANCE;
        }

        public static void a(j jVar) {
            MethodCollector.i(2795);
            l.d(jVar, "");
            synchronized (n.f112471b) {
                try {
                    String simpleName = jVar.getClass().getSimpleName();
                    l.b(simpleName, "");
                    l.d(simpleName, "");
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = n.f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (l.a((Object) t.getClass().getSimpleName(), (Object) simpleName)) {
                            arrayList.add(t);
                        }
                    }
                    n.f112475f.removeAll(arrayList);
                    n.f112475f.add(jVar);
                } finally {
                    MethodCollector.o(2795);
                }
            }
        }

        public static boolean a(HttpURLConnection httpURLConnection) {
            if (httpURLConnection instanceof com.ss.android.ugc.aweme.net.l.a) {
                return ((com.ss.android.ugc.aweme.net.l.a) httpURLConnection).f112437a;
            }
            if (httpURLConnection instanceof com.ss.android.ugc.aweme.net.l.b) {
                return ((com.ss.android.ugc.aweme.net.l.b) httpURLConnection).f112443a;
            }
            if (httpURLConnection == null) {
                return false;
            }
            String simpleName = httpURLConnection.getClass().getSimpleName();
            l.b(simpleName, "");
            return p.a((CharSequence) simpleName, (CharSequence) "Cronet", false);
        }

        public static void a(String str, String str2, Exception exc) {
            l.d(str2, "");
            l.d(exc, "");
            try {
                JSONObject jSONObject = new JSONObject();
                if (str != null && !p.a((CharSequence) str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("exception_name", exc.getClass().getSimpleName());
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                jSONObject.put("exception_message", message);
                jSONObject.put("monitor_method", str2);
                com.bytedance.apm.b.a(c.NATIVE_NETWORK_MONITOR_EXCEPTION_LOG.getLogType(), jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f112479a = new b();

        static {
            Covode.recordClassIndex(72290);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("keva_repo_native_network_monitor", 1).getBoolean("keva_key_native_network_monitor", true));
        }
    }

    static {
        Covode.recordClassIndex(72286);
        String simpleName = n.class.getSimpleName();
        l.b(simpleName, "");
        f112473d = simpleName;
        SettingsManager.a().a(a.C2872a.f112477a);
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final e<Request, u<?>> a(e<Request, u<?>> eVar) {
        String str;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getUrl();
            }
            if (a.a() && f.a().f112404a) {
                if (f.a().f112405b) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList<l> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof l) {
                            arrayList.add(t);
                        }
                    }
                    for (l lVar : arrayList) {
                        eVar = lVar.a(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 != null) {
                str = q2.getUrl();
            } else {
                str = null;
            }
            a.a(str, "onBeforeTTNet", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final e<Request, u<?>> b(e<Request, u<?>> eVar) {
        String str;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getUrl();
            }
            if (a.a() && f.a().f112404a) {
                if (f.a().f112405b) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList<l> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof l) {
                            arrayList.add(t);
                        }
                    }
                    for (l lVar : arrayList) {
                        eVar = lVar.b(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 != null) {
                str = q2.getUrl();
            } else {
                str = null;
            }
            a.a(str, "onAfterTTNet", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<okhttp3.Request, Response> c(e<okhttp3.Request, Response> eVar) {
        String str;
        HttpUrl url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.url();
            }
            if (a.a() && f.a().f112404a) {
                if (f.a().f112406c) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList<k> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof k) {
                            arrayList.add(t);
                        }
                    }
                    for (k kVar : arrayList) {
                        eVar = kVar.c(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.url()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onBeforeOkHttp", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.m
    public final e<String, WebResourceResponse> n(e<String, WebResourceResponse> eVar) {
        l.d(eVar, "");
        try {
            if (a.a() && f.a().f112404a) {
                if (f.a().f112409f) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList<m> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof m) {
                            arrayList.add(t);
                        }
                    }
                    for (m mVar : arrayList) {
                        eVar = mVar.n(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            a.a(eVar.f112458a, "onShouldInterceptRequestUrl", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.m
    public final e<WebResourceRequest, WebResourceResponse> o(e<WebResourceRequest, WebResourceResponse> eVar) {
        String str;
        Uri url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getUrl();
            }
            if (a.a() && f.a().f112404a) {
                if (f.a().f112409f) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList<m> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof m) {
                            arrayList.add(t);
                        }
                    }
                    for (m mVar : arrayList) {
                        eVar = mVar.o(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getUrl()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onShouldInterceptRequest", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.f
    public final e<com.ss.android.ugc.aweme.net.model.a, Boolean> a_(e<com.ss.android.ugc.aweme.net.model.a, Boolean> eVar) {
        l.d(eVar, "");
        try {
            if (a.a() && f.a().f112404a) {
                if (com.ss.android.ugc.aweme.net.j.h.a().f112414a) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList<f> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof f) {
                            arrayList.add(t);
                        }
                    }
                    for (f fVar : arrayList) {
                        eVar = fVar.a_(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            Q q = eVar.f112458a;
            String str = null;
            StringBuilder append = sb.append(q != null ? q.f112449a : null).append('/');
            Q q2 = eVar.f112458a;
            StringBuilder append2 = append.append(q2 != null ? q2.f112450b : null).append('/');
            Q q3 = eVar.f112458a;
            if (q3 != null) {
                str = q3.f112450b;
            }
            a.a(append2.append(str).toString(), "onAppLog", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.g
    public final e<com.ss.android.ugc.aweme.net.model.b, Boolean> b_(e<com.ss.android.ugc.aweme.net.model.b, Boolean> eVar) {
        l.d(eVar, "");
        try {
            if (a.a() && f.a().f112404a) {
                if (com.ss.android.ugc.aweme.net.j.h.a().f112414a) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList<g> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof g) {
                            arrayList.add(t);
                        }
                    }
                    for (g gVar : arrayList) {
                        eVar = gVar.b_(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            Q q = eVar.f112458a;
            String str = null;
            StringBuilder append = sb.append(q != null ? q.f112453a : null).append('/');
            Q q2 = eVar.f112458a;
            if (q2 != null) {
                str = q2.f112454b;
            }
            a.a(append.append(str).toString(), "onCommonLog", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<okhttp3.Request, Response> d(e<okhttp3.Request, Response> eVar) {
        l.d(eVar, "");
        try {
            R r = eVar.f112459b;
            if (r == null) {
                l.b();
            }
            r.request().url();
            if (a.a() && f.a().f112404a) {
                if (f.a().f112406c) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList<k> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof k) {
                            arrayList.add(t);
                        }
                    }
                    for (k kVar : arrayList) {
                        eVar = kVar.d(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            R r2 = eVar.f112459b;
            if (r2 == null) {
                l.b();
            }
            a.a(r2.request().url().toString(), "onAfterOkHttp", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> e(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getURL();
            }
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a() || !a.a((HttpURLConnection) eVar.f112458a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.e(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onBeforeInputStream", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> f(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getURL();
            }
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a() || !a.a((HttpURLConnection) eVar.f112458a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.f(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onAfterInputStream", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> g(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getURL();
            }
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a() || !a.a((HttpURLConnection) eVar.f112458a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.g(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onBeforeErrorStream", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> h(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getURL();
            }
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a() || !a.a((HttpURLConnection) eVar.f112458a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.h(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onAfterErrorStream", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> i(e<HttpURLConnection, Integer> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getURL();
            }
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a() || !a.a((HttpURLConnection) eVar.f112458a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.i(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onBeforeResponseCode", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> j(e<HttpURLConnection, Integer> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getURL();
            }
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a() || !a.a((HttpURLConnection) eVar.f112458a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.j(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onAfterResponseCode", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> k(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getURL();
            }
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a() || !a.a((HttpURLConnection) eVar.f112458a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.k(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f != d.DROP) {
                                if (eVar.f112463f == d.EXCEPTION) {
                                }
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onSetRequestProperty", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> l(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        try {
            Q q = eVar.f112458a;
            if (q != null) {
                q.getURL();
            }
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a() || !a.a((HttpURLConnection) eVar.f112458a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.l(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f != d.DROP) {
                                if (eVar.f112463f == d.EXCEPTION) {
                                }
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q2 = eVar.f112458a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            a.a(str, "onAddRequestProperty", e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<URL, URLConnection> m(e<URL, URLConnection> eVar) {
        String str;
        l.d(eVar, "");
        try {
            if (a.a() && f.a().f112404a && f.a().f112407d) {
                if (eVar.f112458a != null) {
                    CopyOnWriteArrayList<j> copyOnWriteArrayList = f112475f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((i) obj).a()) {
                            arrayList2.add(obj);
                        }
                    }
                    for (i iVar : arrayList2) {
                        eVar = iVar.m(eVar);
                        if (eVar.f112463f != d.INTERCEPT) {
                            if (eVar.f112463f == d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e2) {
            Q q = eVar.f112458a;
            if (q != null) {
                str = q.toString();
            } else {
                str = null;
            }
            a.a(str, "onOpenConnection", e2);
        }
    }
}
