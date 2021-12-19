package com.ss.android.ugc.aweme.bullet.business;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.u;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.utils.et;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class PassBackWebInfoBusiness extends BulletBusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public boolean f69223a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f69224b;

    /* renamed from: c  reason: collision with root package name */
    public int f69225c;

    /* renamed from: d  reason: collision with root package name */
    public int f69226d = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    /* renamed from: e  reason: collision with root package name */
    public String f69227e = "https://ads.tiktok.com/inspect/aegis/client/page/";

    /* renamed from: f  reason: collision with root package name */
    public String f69228f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f69229g = h.i.a((h.f.a.a) c.f69235a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f69230h = h.i.a((h.f.a.a) b.f69234a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f69231i = h.i.a((h.f.a.a) d.f69236a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f69232j = h.i.a((h.f.a.a) i.f69245a);

    static {
        Covode.recordClassIndex(42680);
    }

    private final Handler d() {
        return (Handler) this.f69229g.getValue();
    }

    private final Map<String, Map<String, String>> e() {
        return (Map) this.f69231i.getValue();
    }

    public final Map<String, String> a() {
        return (Map) this.f69230h.getValue();
    }

    public static final class j implements com.bytedance.retrofit2.d<String> {
        static {
            Covode.recordClassIndex(42690);
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, u<String> uVar) {
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<String> bVar, Throwable th) {
        }

        j() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PassBackWebInfoBusiness f69233a;

        static {
            Covode.recordClassIndex(42681);
        }

        a(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f69233a = passBackWebInfoBusiness;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f69233a.b();
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f69235a = new c();

        static {
            Covode.recordClassIndex(42683);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler();
        }
    }

    static final class d extends m implements h.f.a.a<ConcurrentHashMap<String, Map<String, ? extends String>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f69236a = new d();

        static {
            Covode.recordClassIndex(42684);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<String, Map<String, ? extends String>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PassBackWebInfoBusiness f69237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f69238b;

        static {
            Covode.recordClassIndex(42685);
        }

        e(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f69237a = passBackWebInfoBusiness;
            this.f69238b = weakReference;
        }

        public final void run() {
            this.f69237a.a(this.f69238b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PassBackWebInfoBusiness f69239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f69240b;

        static {
            Covode.recordClassIndex(42686);
        }

        f(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f69239a = passBackWebInfoBusiness;
            this.f69240b = weakReference;
        }

        public final void run() {
            this.f69239a.a(this.f69240b);
        }
    }

    static final class b extends m implements h.f.a.a<Map<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f69234a = new b();

        static {
            Covode.recordClassIndex(42682);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, String> invoke() {
            return Collections.synchronizedMap(new LinkedHashMap());
        }
    }

    static final class i extends m implements h.f.a.a<PassBackApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f69245a = new i();

        static {
            Covode.recordClassIndex(42689);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PassBackApi invoke() {
            return RetrofitFactory.a().b("https://ads.tiktok.com").a().d().a(PassBackApi.class);
        }
    }

    private final void f() {
        com.bytedance.ies.bullet.service.f.a.b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof com.ss.android.ugc.aweme.bullet.module.ad.j)) {
            bVar = null;
        }
        com.ss.android.ugc.aweme.bullet.module.ad.j jVar = (com.ss.android.ugc.aweme.bullet.module.ad.j) bVar;
        if (jVar instanceof com.ss.android.ugc.aweme.bullet.module.ad.j) {
            b.i.b(new h(this, jVar), b.i.f4824a);
        }
    }

    public final void c() {
        if (g()) {
            b.i.b(new a(this), b.i.f4824a);
        }
        d().removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PassBackWebInfoBusiness f69243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bullet.module.ad.j f69244b;

        static {
            Covode.recordClassIndex(42688);
        }

        h(PassBackWebInfoBusiness passBackWebInfoBusiness, com.ss.android.ugc.aweme.bullet.module.ad.j jVar) {
            this.f69243a = passBackWebInfoBusiness;
            this.f69244b = jVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Long g2;
            JSONObject jSONObject = new JSONObject();
            long j2 = 0;
            try {
                String b2 = this.f69244b.ao.b();
                if (!(b2 == null || (g2 = p.g(b2)) == null)) {
                    j2 = g2.longValue();
                }
            } catch (Exception unused) {
            }
            try {
                jSONObject.put("cid", j2);
                JSONArray jSONArray = new JSONArray();
                Set<String> keySet = this.f69243a.a().keySet();
                if (keySet != null) {
                    Iterator<T> it = keySet.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(PassBackWebInfoBusiness.b(it.next()));
                    }
                }
                jSONObject.put("url_array", jSONArray);
            } catch (Exception unused2) {
            }
            o.a("aweme_ad_pass_back_web_info_url_empty", jSONObject);
            return z.f158842a;
        }
    }

    private final boolean g() {
        String str;
        com.bytedance.ies.bullet.service.f.a.b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof com.ss.android.ugc.aweme.bullet.module.ad.j)) {
            bVar = null;
        }
        com.ss.android.ugc.aweme.bullet.module.ad.j jVar = (com.ss.android.ugc.aweme.bullet.module.ad.j) bVar;
        if (!(jVar instanceof com.ss.android.ugc.aweme.bullet.module.ad.j) || (!l.a(jVar.af.b(), (Object) true))) {
            return false;
        }
        if (this.f69223a && a(com.bytedance.ies.ugc.appcontext.d.a()) != NetworkUtils.h.WIFI) {
            return false;
        }
        if ((this.f69225c > 0 && c.f69269a.get() >= this.f69225c) || (str = this.f69228f) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final void b() {
        Long g2;
        com.bytedance.ies.bullet.service.f.a.b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof com.ss.android.ugc.aweme.bullet.module.ad.j)) {
            bVar = null;
        }
        com.ss.android.ugc.aweme.bullet.module.ad.j jVar = (com.ss.android.ugc.aweme.bullet.module.ad.j) bVar;
        if ((jVar instanceof com.ss.android.ugc.aweme.bullet.module.ad.j) && !a().isEmpty()) {
            com.google.gson.o oVar = new com.google.gson.o();
            com.google.gson.i iVar = new com.google.gson.i();
            for (Map.Entry<String, String> entry : a().entrySet()) {
                com.google.gson.o oVar2 = new com.google.gson.o();
                String b2 = b(entry.getKey());
                oVar2.a("url", b2);
                oVar2.a("html", b(entry.getValue()));
                Map<String, String> map = e().get(et.a(b2));
                if (map != null && !map.isEmpty()) {
                    com.google.gson.o oVar3 = new com.google.gson.o();
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        String key = entry2.getKey();
                        String value = entry2.getValue();
                        if ((!l.a((Object) key, (Object) "x-Tt-Token")) && (!l.a((Object) key, (Object) "Cookie")) && (!l.a((Object) key, (Object) "x-common-params-v2"))) {
                            oVar3.a(key, value);
                        }
                    }
                    oVar2.a("headers", oVar3);
                }
                iVar.a(oVar2);
            }
            oVar.a("pages", iVar);
            oVar.a("ad_id", (Number) jVar.Y.b());
            long j2 = 0;
            try {
                String b3 = jVar.ao.b();
                if (!(b3 == null || (g2 = p.g(b3)) == null)) {
                    j2 = g2.longValue();
                }
            } catch (Exception unused) {
            }
            oVar.a("cid", Long.valueOf(j2));
            oVar.a("log_extra", jVar.al.b());
            oVar.a("timestamp", Long.valueOf(new Date().getTime()));
            NetworkUtils.h a2 = a(com.bytedance.ies.ugc.appcontext.d.a());
            l.b(a2, "");
            oVar.a("network_type", Integer.valueOf(a2.getValue()));
            String a3 = c.a(oVar, this.f69228f);
            if (!TextUtils.isEmpty(a3)) {
                com.google.gson.o oVar4 = new com.google.gson.o();
                oVar4.a("content", a3);
                ((PassBackApi) this.f69232j.getValue()).executePost(this.f69227e, oVar4).enqueue(new j());
                a().clear();
                e().clear();
                c.f69269a.addAndGet(1);
            }
        }
    }

    public static String a(String str) {
        String encode = URLEncoder.encode(str, "UTF-8");
        l.b(encode, "");
        return encode;
    }

    public static String b(String str) {
        String decode = URLDecoder.decode(str, "UTF-8");
        l.b(decode, "");
        return decode;
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements ValueCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PassBackWebInfoBusiness f69241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69242b;

        static {
            Covode.recordClassIndex(42687);
        }

        g(PassBackWebInfoBusiness passBackWebInfoBusiness, String str) {
            this.f69241a = passBackWebInfoBusiness;
            this.f69242b = str;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Object obj) {
            String str = (String) obj;
            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f69241a;
            String str2 = this.f69242b;
            if (str2 == null) {
                l.b();
            }
            passBackWebInfoBusiness.a(PassBackWebInfoBusiness.a(str2), str);
        }
    }

    private static NetworkUtils.h a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.j.f107228g != NetworkUtils.h.NONE && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107228g;
        }
        NetworkUtils.h networkType = NetworkUtils.getNetworkType(context);
        com.ss.android.ugc.aweme.lancet.j.f107228g = networkType;
        return networkType;
    }

    private static String c(String str) {
        return "javascript:window.location.href='bytedance://adPageHtmlContent?html=' + encodeURIComponent(document.documentElement.outerHTML) + '&url=" + a(str) + "'";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassBackWebInfoBusiness(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public final void a(Uri uri) {
        if (g() && uri != null) {
            String queryParameter = uri.getQueryParameter("url");
            String queryParameter2 = uri.getQueryParameter("html");
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                if (queryParameter == null) {
                    l.b();
                }
                if (queryParameter2 == null) {
                    l.b();
                }
                a(queryParameter, queryParameter2);
            }
        }
    }

    public final void a(WeakReference<WebView> weakReference) {
        WebView webView = weakReference.get();
        if (webView != null) {
            l.b(webView, "");
            String url = webView.getUrl();
            if (url == null) {
                url = "";
            }
            l.b(url, "");
            if (TextUtils.isEmpty(url)) {
                f();
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
            webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new g(this, url));
        }
    }

    private static void a(WebView webView, String str) {
        MethodCollector.i(9191);
        String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(9191);
    }

    public final void a(WebView webView, boolean z) {
        String url;
        if (g() && a().size() < this.f69224b && webView != null && (url = webView.getUrl()) != null && !p.a((CharSequence) url) && !l.a((Object) "about:blank", (Object) webView.getUrl())) {
            WeakReference<WebView> weakReference = new WeakReference<>(webView);
            if (z) {
                d().postDelayed(new e(this, weakReference), (long) this.f69226d);
                d().postDelayed(new f(this, weakReference), 200);
                return;
            }
            a(weakReference);
        }
    }

    public final void a(String str, String str2) {
        if (str2 != null) {
            a().put(str, p.c(str2, (CharSequence) "\""));
        }
    }

    public final void a(String str, Map<String, String> map) {
        String str2;
        l.d(str, "");
        l.d(map, "");
        if (g() && a().size() < this.f69224b && !p.a((CharSequence) str) && !l.a((Object) "about:blank", (Object) str) && !p.c(str, ".js", false) && !p.c(str, ".css", false) && (str2 = map.get("Accept")) != null && p.a((CharSequence) str2, (CharSequence) "html", false)) {
            Map<String, Map<String, String>> e2 = e();
            String a2 = et.a(str);
            l.b(a2, "");
            e2.put(a2, map);
        }
    }
}
