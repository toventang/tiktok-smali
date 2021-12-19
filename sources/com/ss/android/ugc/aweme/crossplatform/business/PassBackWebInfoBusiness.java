package com.ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.u;
import com.google.gson.o;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
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

public final class PassBackWebInfoBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public AdLandingPageConfig f78623a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78624b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f78625c;

    /* renamed from: d  reason: collision with root package name */
    public int f78626d;

    /* renamed from: e  reason: collision with root package name */
    public int f78627e = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    /* renamed from: f  reason: collision with root package name */
    public String f78628f = "https://ads.tiktok.com/inspect/aegis/client/page/";

    /* renamed from: g  reason: collision with root package name */
    public String f78629g;

    /* renamed from: h  reason: collision with root package name */
    final h.h f78630h = h.i.a((h.f.a.a) i.f78643a);

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.d.b f78631m;
    private final h.h n = h.i.a((h.f.a.a) c.f78634a);
    private final h.h o = h.i.a((h.f.a.a) b.f78633a);
    private final h.h p = h.i.a((h.f.a.a) d.f78635a);

    static {
        Covode.recordClassIndex(48820);
    }

    public final Handler a() {
        return (Handler) this.n.getValue();
    }

    public final Map<String, String> b() {
        return (Map) this.o.getValue();
    }

    public final Map<String, Map<String, String>> c() {
        return (Map) this.p.getValue();
    }

    public static final class j implements com.bytedance.retrofit2.d<String> {
        static {
            Covode.recordClassIndex(48830);
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

    static final class c extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78634a = new c();

        static {
            Covode.recordClassIndex(48823);
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
        public static final d f78635a = new d();

        static {
            Covode.recordClassIndex(48824);
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
        final /* synthetic */ PassBackWebInfoBusiness f78636a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f78637b;

        static {
            Covode.recordClassIndex(48825);
        }

        e(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f78636a = passBackWebInfoBusiness;
            this.f78637b = weakReference;
        }

        public final void run() {
            this.f78636a.a(this.f78637b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PassBackWebInfoBusiness f78638a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f78639b;

        static {
            Covode.recordClassIndex(48826);
        }

        f(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f78638a = passBackWebInfoBusiness;
            this.f78639b = weakReference;
        }

        public final void run() {
            this.f78638a.a(this.f78639b);
        }
    }

    static final class b extends m implements h.f.a.a<Map<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78633a = new b();

        static {
            Covode.recordClassIndex(48822);
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

    private final void e() {
        b.i.b(new h(this), r.a());
    }

    static final class i extends m implements h.f.a.a<PassBackApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f78643a = new i();

        static {
            Covode.recordClassIndex(48829);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PassBackApi invoke() {
            return com.bytedance.ies.ugc.aweme.network.ext.a.b("https://ads.tiktok.com").a().d().a(PassBackApi.class);
        }
    }

    public final boolean d() {
        com.ss.android.ugc.aweme.crossplatform.d.b bVar;
        String str;
        if (this.f78623a == null || (bVar = this.f78631m) == null || !bVar.E) {
            return false;
        }
        if (this.f78624b && a(com.bytedance.ies.ugc.appcontext.d.a()) != NetworkUtils.h.WIFI) {
            return false;
        }
        if ((this.f78626d > 0 && com.ss.android.ugc.aweme.bullet.business.c.f69269a.get() >= this.f78626d) || (str = this.f78629g) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PassBackWebInfoBusiness f78642a;

        static {
            Covode.recordClassIndex(48828);
        }

        h(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f78642a = passBackWebInfoBusiness;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78642a.f78631m;
                if (bVar != null) {
                    long j2 = 0;
                    try {
                        String str = bVar.f78771m;
                        if (str != null) {
                            j2 = Long.parseLong(str);
                        }
                    } catch (Exception unused) {
                    }
                    jSONObject.put("cid", j2);
                }
                JSONArray jSONArray = new JSONArray();
                Set<String> keySet = this.f78642a.b().keySet();
                if (keySet != null) {
                    Iterator<T> it = keySet.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(PassBackWebInfoBusiness.b(it.next()));
                    }
                }
                jSONObject.put("url_array", jSONArray);
            } catch (Exception unused2) {
            }
            n.a("aweme_ad_pass_back_web_info_url_empty", jSONObject);
            return z.f158842a;
        }
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PassBackWebInfoBusiness f78632a;

        static {
            Covode.recordClassIndex(48821);
        }

        public a(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f78632a = passBackWebInfoBusiness;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f78632a;
            com.ss.android.ugc.aweme.crossplatform.d.b bVar = passBackWebInfoBusiness.f78631m;
            if (bVar != null && !passBackWebInfoBusiness.b().isEmpty()) {
                o oVar = new o();
                com.google.gson.i iVar = new com.google.gson.i();
                for (Map.Entry<String, String> entry : passBackWebInfoBusiness.b().entrySet()) {
                    o oVar2 = new o();
                    String b2 = PassBackWebInfoBusiness.b(entry.getKey());
                    oVar2.a("url", b2);
                    oVar2.a("html", PassBackWebInfoBusiness.b(entry.getValue()));
                    Map<String, String> map = passBackWebInfoBusiness.c().get(et.a(b2));
                    if (map == null || map.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        o oVar3 = new o();
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
                oVar.a("ad_id", Long.valueOf(bVar.f78759a));
                long j2 = 0;
                try {
                    String str = bVar.f78771m;
                    if (str != null) {
                        j2 = Long.parseLong(str);
                    }
                } catch (Exception unused) {
                }
                oVar.a("cid", Long.valueOf(j2));
                oVar.a("log_extra", bVar.f78767i);
                oVar.a("timestamp", Long.valueOf(new Date().getTime()));
                NetworkUtils.h a2 = PassBackWebInfoBusiness.a(com.bytedance.ies.ugc.appcontext.d.a());
                l.b(a2, "");
                oVar.a("network_type", Integer.valueOf(a2.getValue()));
                String a3 = com.ss.android.ugc.aweme.bullet.business.c.a(oVar, passBackWebInfoBusiness.f78629g);
                if (!TextUtils.isEmpty(a3)) {
                    o oVar4 = new o();
                    oVar4.a("content", a3);
                    oVar4.a("version", (Number) 1);
                    ((PassBackApi) passBackWebInfoBusiness.f78630h.getValue()).executePost(passBackWebInfoBusiness.f78628f, oVar4).enqueue(new j());
                    passBackWebInfoBusiness.b().clear();
                    passBackWebInfoBusiness.c().clear();
                    com.ss.android.ugc.aweme.bullet.business.c.f69269a.addAndGet(1);
                }
            }
            return z.f158842a;
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
        final /* synthetic */ PassBackWebInfoBusiness f78640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f78641b;

        static {
            Covode.recordClassIndex(48827);
        }

        g(PassBackWebInfoBusiness passBackWebInfoBusiness, String str) {
            this.f78640a = passBackWebInfoBusiness;
            this.f78641b = str;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Object obj) {
            String str = (String) obj;
            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f78640a;
            String str2 = this.f78641b;
            if (str2 == null) {
                l.b();
            }
            passBackWebInfoBusiness.a(PassBackWebInfoBusiness.a(str2), str);
        }
    }

    static NetworkUtils.h a(Context context) {
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
    public PassBackWebInfoBusiness(e eVar) {
        super(eVar);
        l.d(eVar, "");
    }

    public final void a(WeakReference<WebView> weakReference) {
        WebView webView = weakReference.get();
        if (webView != null) {
            l.b(webView, "");
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url)) {
                e();
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
            webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new g(this, url));
        }
    }

    private static void a(WebView webView, String str) {
        MethodCollector.i(12231);
        String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(12231);
    }

    public final void a(WebView webView, boolean z) {
        String url;
        if (d() && b().size() < this.f78625c && webView != null && (url = webView.getUrl()) != null && !p.a((CharSequence) url) && !l.a((Object) "about:blank", (Object) webView.getUrl())) {
            WeakReference<WebView> weakReference = new WeakReference<>(webView);
            if (z) {
                a().postDelayed(new e(this, weakReference), (long) this.f78627e);
                a().postDelayed(new f(this, weakReference), 200);
                return;
            }
            a(weakReference);
        }
    }

    public final void a(String str, String str2) {
        if (str2 != null) {
            b().put(str, p.c(str2, (CharSequence) "\""));
        }
    }
}
