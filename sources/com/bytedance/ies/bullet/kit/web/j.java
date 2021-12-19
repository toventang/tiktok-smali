package com.bytedance.ies.bullet.kit.web;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.r;
import com.bytedance.ies.bullet.kit.web.b.b;
import com.bytedance.ies.bullet.kit.web.b.c;
import com.bytedance.ies.bullet.kit.web.m;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.ak;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.ui.common.k;
import com.bytedance.ies.web.jsbridge2.al;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.ies.web.jsbridge2.y;
import com.bytedance.sdk.xbridge.registry.core_api.a;
import com.kakao.usermgmt.StringSet;
import h.a.ag;
import h.f.b.ab;
import h.f.b.z;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class j extends com.bytedance.ies.bullet.ui.common.c.c<SSWebView> implements c {
    public static final a F = new a((byte) 0);
    boolean A;
    long B;
    public long C;
    final Map<Uri, Long> D;
    boolean E;
    private final h.h L = h.i.a((h.f.a.a) new u(this));
    private final com.bytedance.android.monitor.webview.c M;
    private final h.h N;
    private final h.h O;
    private Map<String, String> P;
    private final b Q;
    private final Map<String, Object> R;
    private long S;

    /* renamed from: j  reason: collision with root package name */
    public a f32427j;

    /* renamed from: k  reason: collision with root package name */
    public final List<b> f32428k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public g f32429l;

    /* renamed from: m  reason: collision with root package name */
    final h.h f32430m;
    public final List<String> n;
    public final List<String> o;
    public final List<String> p;
    public final List<String> q;
    public Boolean r;
    public String s;
    public String t;
    public Boolean u;
    public Uri v;
    public com.bytedance.ies.bullet.kit.web.b.c w;
    public b.a x;
    public SSWebView y;
    public final AtomicBoolean z;

    public static final class b extends com.bytedance.ies.bullet.ui.common.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f32431a;

        static {
            Covode.recordClassIndex(19207);
        }

        public static final class a implements com.bytedance.ies.bullet.c.c.a.p {

            /* renamed from: a  reason: collision with root package name */
            public final JSONObject f32432a;

            /* renamed from: b  reason: collision with root package name */
            private final String f32433b = "pageClosed";

            static {
                Covode.recordClassIndex(19208);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final String a() {
                return this.f32433b;
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final /* bridge */ /* synthetic */ Object b() {
                return this.f32432a;
            }

            a() {
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(j jVar) {
            this.f32431a = jVar;
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
        public final boolean a(Activity activity) {
            h.f.b.l.c(activity, "");
            Iterator<T> it = this.f32431a.H.iterator();
            while (it.hasNext()) {
                SSWebView sSWebView = (SSWebView) it.next().f33078a;
                if (sSWebView.canGoBack()) {
                    if (!sSWebView.canGoBack()) {
                        return false;
                    }
                    sSWebView.goBack();
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
        public final void b(Activity activity) {
            h.f.b.l.c(activity, "");
            Iterator<T> it = this.f32431a.H.iterator();
            while (it.hasNext()) {
                ((SSWebView) it.next().f33078a).onResume();
            }
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
        public final void c(Activity activity) {
            h.f.b.l.c(activity, "");
            Iterator<T> it = this.f32431a.H.iterator();
            while (it.hasNext()) {
                ((SSWebView) it.next().f33078a).onPause();
            }
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.a, com.bytedance.ies.bullet.ui.common.c
        public final void d(Activity activity) {
            h.f.b.l.c(activity, "");
            if (this.f32431a.x()) {
                j.b.a(this.f32431a, "send pageClosed event for reused view", null, null, 6);
                this.f32431a.z.getAndSet(false);
                this.f32431a.onEvent(new a());
            }
        }
    }

    static {
        Covode.recordClassIndex(19205);
    }

    private final com.bytedance.sdk.xbridge.registry.core_api.a A() {
        return (com.bytedance.sdk.xbridge.registry.core_api.a) this.O.getValue();
    }

    public static int a(int i2) {
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 3;
            }
        }
        return i3;
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public final boolean a(Uri uri, h.f.a.b<? super Throwable, z> bVar) {
        h.f.b.l.c(uri, "");
        h.f.b.l.c(bVar, "");
        return true;
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public final void c(List<String> list, com.bytedance.ies.bullet.c.f fVar) {
        h.f.b.l.c(list, "");
        h.f.b.l.c(fVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c, com.bytedance.ies.bullet.ui.common.c.b
    public final String u() {
        return "BulletWeb";
    }

    public final com.bytedance.ies.bullet.service.base.web.i v() {
        return (com.bytedance.ies.bullet.service.base.web.i) this.L.getValue();
    }

    public final com.bytedance.ies.bullet.ui.common.b.e w() {
        return (com.bytedance.ies.bullet.ui.common.b.e) this.N.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19206);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class f implements com.bytedance.ies.bullet.c.c.a.p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f32435a;

        /* renamed from: b  reason: collision with root package name */
        private final String f32436b = "viewDisappeared";

        static {
            Covode.recordClassIndex(19212);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f32436b;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f32435a;
        }

        f() {
        }
    }

    public static final class g implements com.bytedance.ies.bullet.c.c.a.p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f32437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f32438b;

        /* renamed from: c  reason: collision with root package name */
        private final String f32439c = "pageReused";

        static {
            Covode.recordClassIndex(19213);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f32439c;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f32437a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(j jVar) {
            this.f32438b = jVar;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Uri uri = jVar.v;
            if (uri != null) {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                h.f.b.l.a((Object) queryParameterNames, "");
                for (T t : queryParameterNames) {
                    jSONObject2.put(t, uri.getQueryParameter(t));
                }
            }
            jSONObject.put("queryItems", jSONObject2);
            this.f32437a = jSONObject;
        }
    }

    public static final class h implements com.bytedance.ies.bullet.c.c.a.p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f32440a;

        /* renamed from: b  reason: collision with root package name */
        private final String f32441b = "viewAppeared";

        static {
            Covode.recordClassIndex(19214);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f32441b;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f32440a;
        }

        h() {
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.c
    public final com.bytedance.ies.bullet.kit.web.b.a m() {
        return this.w;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final Uri p_() {
        return this.v;
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.sdk.xbridge.registry.core_api.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f32434a = new d();

        static {
            Covode.recordClassIndex(19210);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.sdk.xbridge.registry.core_api.a invoke() {
            return new com.bytedance.sdk.xbridge.registry.core_api.a();
        }
    }

    static final /* synthetic */ class e extends h.f.b.i implements h.f.a.m<String, com.bytedance.ies.bullet.c.c.a.g, z> {
        static {
            Covode.recordClassIndex(19211);
        }

        e(j jVar) {
            super(2, jVar);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "onPerfDataReady";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "onPerfDataReady(Ljava/lang/String;Lcom/bytedance/ies/bullet/core/kit/bridge/BridgePerfData;)V";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(j.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, com.bytedance.ies.bullet.c.c.a.g gVar) {
            String str2 = str;
            com.bytedance.ies.bullet.c.c.a.g gVar2 = gVar;
            h.f.b.l.c(str2, "");
            h.f.b.l.c(gVar2, "");
            b.i.a((Callable) new m((j) this.receiver, gVar2, str2));
            return z.f158842a;
        }
    }

    public static final class q extends com.bytedance.ies.bullet.kit.web.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f32461a;

        static {
            Covode.recordClassIndex(19230);
        }

        public final void onHideCustomView() {
            super.onHideCustomView();
            com.bytedance.ies.bullet.ui.common.b.e w = this.f32461a.w();
            if (w != null) {
                w.r();
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.k
        public final Bitmap getDefaultVideoPoster() {
            MethodCollector.i(2791);
            if (h.f.b.l.a((Object) this.f32461a.t().V.b(), (Object) true)) {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                MethodCollector.o(2791);
                return createBitmap;
            }
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            MethodCollector.o(2791);
            return defaultVideoPoster;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(j jVar) {
            this.f32461a = jVar;
        }

        public final void onProgressChanged(WebView webView, int i2) {
            super.onProgressChanged(webView, i2);
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            com.bytedance.ies.bullet.ui.common.b.e w;
            super.onShowCustomView(view, customViewCallback);
            if (view != null && (w = this.f32461a.w()) != null) {
                w.enterFullScreen(view);
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if ((!h.f.b.l.a((Object) this.f32461a.t().R.b(), (Object) false)) && str != null) {
                j.b.a(this.f32461a, "onReceivedTitle [" + str + "] useWebTitle " + this.f32461a.t().R.b(), null, null, 6);
                k.b bVar = (k.b) this.f32461a.f32057i.c(k.b.class);
                if (bVar != null) {
                    bVar.a(str);
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r, com.bytedance.ies.bullet.c.c.i
    public final void l() {
        super.l();
        Uri uri = this.v;
        if (uri != null) {
            a(uri, true);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r, com.bytedance.ies.bullet.ui.common.c.c
    public final void r() {
        super.r();
        com.bytedance.ies.bullet.ui.common.g z2 = z();
        if (z2 != null) {
            z2.a(this.Q);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<AssetManager> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $providerFactory;

        static {
            Covode.recordClassIndex(19209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.$providerFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AssetManager invoke() {
            Context context = (Context) this.$providerFactory.c(Context.class);
            if (context != null) {
                return context.getAssets();
            }
            return null;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.service.base.web.i> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(19235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.service.base.web.i invoke() {
            com.bytedance.ies.bullet.service.base.a.c b_ = this.this$0.b_(com.bytedance.ies.bullet.service.base.web.d.class);
            if (b_ == null) {
                h.f.b.l.a();
            }
            return ((com.bytedance.ies.bullet.service.base.web.d) b_).a(new com.bytedance.ies.bullet.service.base.web.q());
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.c
    public final WebView n() {
        T t2;
        com.bytedance.ies.bullet.ui.common.c.d<? extends View> q_ = q_();
        WebView webView = null;
        if (q_ != null) {
            t2 = q_.f33078a;
        } else {
            t2 = null;
        }
        if (t2 instanceof WebView) {
            webView = t2;
        }
        return webView;
    }

    public final com.bytedance.ies.bullet.service.f.a.g t() {
        com.bytedance.ies.bullet.service.f.a.b.q o_ = o_();
        if (o_ != null) {
            return (com.bytedance.ies.bullet.service.f.a.g) o_;
        }
        h.f.b.l.a();
        throw new w("null cannot be cast to non-null type");
    }

    public final boolean x() {
        Object c2 = this.f32057i.c(com.bytedance.ies.bullet.service.base.c.class);
        if (c2 == null || c2 == com.bytedance.ies.bullet.service.base.c.NONE) {
            return false;
        }
        return true;
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.ui.common.b.e> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $providerFactory;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(19215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.this$0 = jVar;
            this.$providerFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.ui.common.b.e invoke() {
            if (h.f.b.l.a((Object) this.this$0.t().T.b(), (Object) true)) {
                return this.$providerFactory.c(com.bytedance.ies.bullet.ui.common.b.e.class);
            }
            return null;
        }
    }

    static final class m<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f32449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.c.a.g f32450b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32451c;

        static {
            Covode.recordClassIndex(19221);
        }

        m(j jVar, com.bytedance.ies.bullet.c.c.a.g gVar, String str) {
            this.f32449a = jVar;
            this.f32450b = gVar;
            this.f32451c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public com.bytedance.ies.bullet.service.base.o call() {
            com.bytedance.ies.bullet.service.base.o oVar = (com.bytedance.ies.bullet.service.base.o) this.f32449a.b_(com.bytedance.ies.bullet.service.base.o.class);
            if (oVar == null) {
                return null;
            }
            an anVar = new an("bdx_monitor_bridge_duration", null, null, 254);
            anVar.f32550c = this.f32449a.f32054f;
            anVar.f32555h = this.f32450b.b();
            JSONObject jSONObject = new JSONObject();
            try {
                h.q.m223constructorimpl(jSONObject.put("method_name", this.f32451c));
            } catch (Throwable th) {
                h.q.m223constructorimpl(h.r.a(th));
            }
            anVar.f32554g = jSONObject;
            anVar.f32553f = "web";
            anVar.f32556i = true;
            oVar.a(anVar);
            return oVar;
        }
    }

    private final void B() {
        String str;
        Map<String, Object> a2;
        if (!this.R.isEmpty()) {
            this.R.clear();
        }
        Map<String, Object> map = this.R;
        map.put("bullet_version", "2.1.4-rc.11-tiktok");
        map.put("containerID", this.f32056h.f32074a);
        for (T t2 : o()) {
            if (t2 != null) {
                Map<String, Object> a3 = t2.a(this, this.f32057i);
                if (a3 != null) {
                    map.putAll(a3);
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        com.bytedance.ies.bullet.c.c.m r_ = r_();
        if (!(r_ instanceof f)) {
            r_ = null;
        }
        f fVar = (f) r_;
        if (!(fVar == null || (a2 = fVar.a(this, this.f32057i)) == null)) {
            map.putAll(a2);
        }
        com.bytedance.ies.bullet.service.base.e.d dVar = this.f32054f;
        if (dVar == null || (str = dVar.a()) == null) {
            str = "";
        }
        map.put("resolvedUrl", str);
    }

    public static final class r extends com.bytedance.ies.bullet.kit.web.a.e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f32462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f32463b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.ui.common.c.d f32464c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.xbridge.protocol.c.g f32465d;

        static {
            Covode.recordClassIndex(19231);
        }

        static final class a<V> implements Callable<TResult> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f32466a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f32467b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f32468c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f32469d;

            static {
                Covode.recordClassIndex(19232);
            }

            a(r rVar, String str, long j2, long j3) {
                this.f32466a = rVar;
                this.f32467b = str;
                this.f32468c = j2;
                this.f32469d = j3;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Uri parse;
                Long remove;
                String str = this.f32467b;
                if (str == null || (parse = Uri.parse(str)) == null) {
                    return null;
                }
                j jVar = this.f32466a.f32463b;
                long j2 = this.f32468c;
                long j3 = this.f32469d;
                h.f.b.l.c(parse, "");
                if ((h.f.b.l.a((Object) parse.getScheme(), (Object) "http") || h.f.b.l.a((Object) parse.getScheme(), (Object) "https")) && (remove = jVar.D.remove(parse)) != null) {
                    remove.longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (jVar.A) {
                        jVar.B = currentTimeMillis;
                    }
                    jVar.A = false;
                }
                if (!jVar.E) {
                    com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) jVar.f32057i.c(com.bytedance.ies.bullet.c.i.class);
                    if (iVar != null && !iVar.a()) {
                        com.bytedance.ies.bullet.service.base.o oVar = (com.bytedance.ies.bullet.service.base.o) jVar.b_(com.bytedance.ies.bullet.service.base.o.class);
                        if (oVar != null) {
                            an anVar = new an("bdx_monitor_web_first_screen_duration", null, null, 254);
                            anVar.f32550c = jVar.f32054f;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", j2);
                            anVar.f32555h = jSONObject;
                            oVar.a(anVar);
                        }
                        com.bytedance.ies.bullet.service.base.o oVar2 = (com.bytedance.ies.bullet.service.base.o) jVar.b_(com.bytedance.ies.bullet.service.base.o.class);
                        if (oVar2 != null) {
                            an anVar2 = new an("bdx_monitor_web_timeline", null, null, 254);
                            anVar2.f32550c = jVar.f32054f;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("precreate", iVar.f32093e);
                            anVar2.f32554g = jSONObject2;
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("init_to_start_render", iVar.f32092d);
                            jSONObject3.put("webview_create", iVar.f32094f);
                            jSONObject3.put("webview_render", j3);
                            anVar2.f32555h = jSONObject3;
                            oVar2.a(anVar2);
                        }
                    }
                    jVar.E = true;
                }
                return z.f158842a;
            }
        }

        public final void onLoadResource(WebView webView, String str) {
            com.bytedance.ies.web.a.a aVar;
            super.onLoadResource(webView, str);
            com.bytedance.ies.bullet.kit.web.b.c cVar = this.f32463b.w;
            if (cVar != null && (aVar = cVar.f32417j) != null) {
                aVar.c(str);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            j.b.a(this.f32463b, "onRenderProcessGone, detail:".concat(String.valueOf(renderProcessGoneDetail)), null, null, 6);
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            return com.example.a.c.a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.o
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            webResourceRequest.getUrl();
            com.ss.android.ugc.aweme.net.model.e<WebResourceRequest, WebResourceResponse> o = com.ss.android.ugc.aweme.net.monitor.n.f112474e.o(new com.ss.android.ugc.aweme.net.model.e<>(webResourceRequest, webView, null, com.ss.android.ugc.aweme.net.model.d.CONTINUE));
            if (o.f112463f == com.ss.android.ugc.aweme.net.model.d.INTERCEPT && o.f112459b != null) {
                return o.f112459b;
            }
            if (o.f112463f != com.ss.android.ugc.aweme.net.model.d.EXCEPTION || o.f112462e == null) {
                return super.shouldInterceptRequest(o.f112460c, (WebResourceRequest) o.f112458a);
            }
            throw o.f112462e;
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.o
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.bytedance.ies.web.a.a aVar;
            com.bytedance.ies.bullet.kit.web.b.c cVar = this.f32463b.w;
            if (!(cVar == null || (aVar = cVar.f32417j) == null)) {
                Boolean valueOf = Boolean.valueOf(aVar.b(str));
                if (valueOf.booleanValue()) {
                    return valueOf.booleanValue();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            long j2;
            Long l2;
            Uri parse;
            MethodCollector.i(2310);
            super.onPageFinished(webView, str);
            j.b.a(this.f32463b, "onPageFinished on url:".concat(String.valueOf(str)), null, null, 6);
            this.f32463b.y();
            if (webView != null) {
                String str2 = this.f32463b.f32056h.f32074a;
                h.f.b.l.c(webView, "");
                if (str2 != null) {
                    String str3 = "javascript:(function () {    window.reactId = '" + str2 + "';})();";
                    String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(webView, str3);
                    if (!TextUtils.isEmpty(a2)) {
                        str3 = a2;
                    }
                    webView.loadUrl(str3);
                }
            }
            if (!this.f32462a) {
                if (!(str == null || (parse = Uri.parse(str)) == null)) {
                    this.f32464c.b(parse);
                }
                com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f32463b.f32057i.c(com.bytedance.ies.bullet.c.i.class);
                if (iVar == null || (l2 = iVar.f32090b) == null) {
                    j2 = 0;
                } else {
                    l2.longValue();
                    j2 = System.currentTimeMillis() - l2.longValue();
                }
                b.i.a((Callable) new a(this, str, j2, System.currentTimeMillis() - this.f32463b.C));
            }
            this.f32462a = false;
            MethodCollector.o(2310);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
            if (r5 != null) goto L_0x00d8;
         */
        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.o
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r13, java.lang.String r14) {
            /*
            // Method dump skipped, instructions count: 238
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.web.j.r.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
        }

        r(j jVar, com.bytedance.ies.bullet.ui.common.c.d dVar, com.bytedance.sdk.xbridge.protocol.c.g gVar) {
            this.f32463b = jVar;
            this.f32464c = dVar;
            this.f32465d = gVar;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            com.bytedance.sdk.xbridge.protocol.c.g gVar;
            super.onPageStarted(webView, str, bitmap);
            if (this.f32463b.y != null) {
                SSWebView sSWebView = this.f32463b.y;
                if (sSWebView == null) {
                    h.f.b.l.a("mWebView");
                }
                sSWebView.setPageStartUrl(str);
                if (str != null && (gVar = this.f32465d) != null) {
                    gVar.a(str);
                }
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f32462a = true;
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            j.b.a(this.f32463b, "onReceivedHttpError, request:" + webResourceRequest + ", errorResponse:" + webResourceResponse, null, null, 6);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url;
            this.f32462a = true;
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            String str = null;
            j.b.a(this.f32463b, "onReceivedSslError, error:".concat(String.valueOf(sslError)), null, null, 6);
            if (webView != null && (url = webView.getUrl()) != null) {
                com.bytedance.ies.bullet.ui.common.c.d dVar = this.f32464c;
                Uri parse = Uri.parse(url);
                h.f.b.l.a((Object) parse, "");
                if (sslError != null) {
                    str = sslError.toString();
                }
                dVar.a(parse, new l(-100, str, url));
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.o
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Boolean bool;
            CharSequence charSequence;
            Uri url;
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f32462a = true;
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            j jVar = this.f32463b;
            StringBuilder append = new StringBuilder("onReceivedError, request:").append(webResourceRequest).append(", isForMainFrame:");
            String str = null;
            if (webResourceRequest != null) {
                bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
            } else {
                bool = null;
            }
            j.b.a(jVar, append.append(bool).append(" error:").append(webResourceError).toString(), null, null, 6);
            Uri uri = this.f32463b.v;
            if (uri != null) {
                int i2 = 0;
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    com.bytedance.ies.bullet.ui.common.c.d dVar = this.f32464c;
                    if (webResourceError != null) {
                        i2 = webResourceError.getErrorCode();
                        charSequence = webResourceError.getDescription();
                    } else {
                        charSequence = null;
                    }
                    if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
                        str = url.toString();
                    }
                    dVar.a(uri, new l(i2, charSequence, str));
                }
            }
        }

        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            Uri uri;
            this.f32462a = true;
            super.onReceivedError(webView, i2, str, str2);
            j.b.a(this.f32463b, "onReceivedError, errorCode:" + i2 + ", description:" + str, null, null, 6);
            if (Build.VERSION.SDK_INT < 23 && (uri = this.f32463b.v) != null) {
                this.f32464c.a(uri, new l(i2, str, str2));
            }
        }

        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            j.b.a(this.f32463b, "onReceivedHttpAuthRequest, host:" + str + ", realm:" + str2, null, null, 6);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r, com.bytedance.ies.bullet.ui.common.c.c
    public final void q() {
        Context context;
        SSWebView a2;
        boolean z2;
        ak b2;
        JSONObject jSONObject;
        Iterator<String> keys;
        com.bytedance.android.monitor.webview.c monitorHelper;
        this.f32427j = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.p.clear();
        this.q.clear();
        this.n.clear();
        this.o.clear();
        k kVar = new k(this);
        for (T t2 : o()) {
            if ((t2 instanceof f) && t2 != null) {
                kVar.invoke(t2);
            }
        }
        com.bytedance.ies.bullet.c.c.m r_ = r_();
        if ((r_ instanceof f) && r_ != null) {
            kVar.invoke(r_);
        }
        if (this.f32052d && (context = (Context) this.f32057i.c(Context.class)) != null) {
            com.bytedance.ies.bullet.service.base.e.g gVar = new com.bytedance.ies.bullet.service.base.e.g("webviewcreate");
            WebView a3 = v().a(context).a();
            if (a3 instanceof SSWebView) {
                a2 = (SSWebView) a3;
            } else if (s() != null) {
                a2 = WebKitApi.a(context);
            } else {
                throw new w("null cannot be cast to non-null type");
            }
            com.bytedance.ies.bullet.service.base.o oVar = (com.bytedance.ies.bullet.service.base.o) b_(com.bytedance.ies.bullet.service.base.o.class);
            a2.setMonitorHelper(this.M);
            if (!(oVar == null || (b2 = oVar.b()) == null || (jSONObject = b2.f32538d) == null || (keys = jSONObject.keys()) == null)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (!(opt == null || (monitorHelper = a2.getMonitorHelper()) == null)) {
                        monitorHelper.a(a2, next, opt);
                    }
                }
            }
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - gVar.f32606a);
            com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f32057i.c(com.bytedance.ies.bullet.c.i.class);
            if (iVar != null) {
                iVar.f32094f = Long.valueOf(millis);
                iVar.f32093e = com.bytedance.webx.h.d.a.a(a2);
            }
            this.y = a2;
            com.bytedance.ies.bullet.c.e.a.b bVar = this.f32057i;
            SSWebView sSWebView = this.y;
            if (sSWebView == null) {
                h.f.b.l.a("mWebView");
            }
            bVar.a(WebView.class, sSWebView);
            SSWebView sSWebView2 = this.y;
            if (sSWebView2 == null) {
                h.f.b.l.a("mWebView");
            }
            com.bytedance.ies.bullet.kit.web.b.c a4 = c.a.a(sSWebView2);
            Boolean bool = this.r;
            boolean z3 = false;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = false;
            }
            a4.f32413f = z2;
            String str = this.s;
            if (str == null) {
                str = "ToutiaoJSBridge";
            }
            com.bytedance.ies.bullet.kit.web.b.c c2 = a4.c(str);
            String str2 = this.t;
            if (str2 == null) {
                str2 = "bytedance";
            }
            com.bytedance.ies.bullet.kit.web.b.c d2 = c2.d(str2).a(this.p).b(this.q).c(this.n).d(this.o);
            b.a aVar = this.x;
            if (aVar != null) {
                h.f.b.l.c(aVar, "");
                d2.f32416i = aVar;
            }
            Boolean bool2 = this.u;
            if (bool2 != null) {
                z3 = bool2.booleanValue();
            }
            d2.f32415h = z3;
            SSWebView sSWebView3 = this.y;
            if (sSWebView3 == null) {
                h.f.b.l.a("mWebView");
            }
            com.bytedance.ies.bullet.kit.web.b.c b3 = d2.a(a(sSWebView3)).b();
            this.f32057i.b(com.bytedance.ies.web.a.a.class, b3.f32417j);
            this.f32057i.b(y.class, b3.f32418k);
            this.w = b3;
            a.b.c();
            if (a.b.a()) {
                com.bytedance.sdk.xbridge.registry.core_api.a A2 = A();
                SSWebView sSWebView4 = this.y;
                if (sSWebView4 == null) {
                    h.f.b.l.a("mWebView");
                }
                com.bytedance.sdk.xbridge.registry.core_api.a.a(A2, sSWebView4, this.f32056h.f32074a);
                A().a("bullet_webJsBridge", new C0695j(this));
                SSWebView sSWebView5 = this.y;
                if (sSWebView5 == null) {
                    h.f.b.l.a("mWebView");
                }
                com.bytedance.sdk.xbridge.registry.core.f.a(sSWebView5, new com.bytedance.sdk.xbridge.registry.core.a());
            }
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.c
    public final void a(Map<String, String> map) {
        this.P = map;
    }

    private final com.bytedance.webx.monitor.a.a a(SSWebView sSWebView) {
        return new n(this, sSWebView, sSWebView);
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c
    public final void b(Activity activity) {
        onEvent(new f());
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$j  reason: collision with other inner class name */
    public static final class C0695j implements com.bytedance.sdk.xbridge.registry.core_api.a.c {

        /* renamed from: a  reason: collision with root package name */
        public final String f32442a = "bridgesdk";

        /* renamed from: b  reason: collision with root package name */
        public final com.bytedance.ies.web.jsbridge2.an f32443b = new com.bytedance.ies.web.jsbridge2.an();

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f32444c;

        static {
            Covode.recordClassIndex(19216);
        }

        C0695j(j jVar) {
            this.f32444c = jVar;
        }

        @Override // com.bytedance.sdk.xbridge.registry.core_api.a.c
        public final void a(Object obj, String str, String str2, String str3, final com.bytedance.sdk.xbridge.registry.core_api.a.b bVar) {
            h.f.b.l.c(str, "");
            h.f.b.l.c(str2, "");
            h.f.b.l.c(str3, "");
            h.f.b.l.c(bVar, "");
            com.bytedance.ies.web.jsbridge2.an anVar = this.f32443b;
            com.bytedance.ies.bullet.kit.web.b.c cVar = this.f32444c.w;
            if (cVar == null) {
                h.f.b.l.a();
            }
            anVar.f35625a = cVar.f32419l;
            this.f32443b.a(new com.bytedance.ies.web.jsbridge2.i(this) {
                /* class com.bytedance.ies.bullet.kit.web.j.C0695j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C0695j f32445a;

                static {
                    Covode.recordClassIndex(19217);
                }

                {
                    this.f32445a = r1;
                }

                @Override // com.bytedance.ies.web.jsbridge2.i
                public final void a(com.bytedance.ies.web.jsbridge2.w wVar, int i2) {
                    if (wVar != null) {
                        String str = wVar.f35694f;
                        h.f.b.l.a((Object) str, "");
                        if (!h.m.p.b(str, this.f32445a.f32442a, false)) {
                            return;
                        }
                        if (i2 == 1) {
                            bVar.a(com.bytedance.sdk.xbridge.registry.core_api.a.a.NO_PERMISSION);
                        } else if (i2 == 2) {
                            bVar.a(com.bytedance.sdk.xbridge.registry.core_api.a.a.NOT_FOUND);
                        }
                    }
                }
            });
            JSONObject jSONObject = new JSONObject(str3);
            jSONObject.put("__callback_id", this.f32442a + jSONObject.opt("__callback_id"));
            jSONObject.put("shouldHook", true);
            this.f32443b.a(jSONObject.toString());
            com.bytedance.ies.bullet.kit.web.b.c cVar2 = this.f32444c.w;
            if (cVar2 == null) {
                h.f.b.l.a();
            }
            com.bytedance.ies.web.a.a aVar = cVar2.f32417j;
            if (aVar != null) {
                aVar.f35521l = new com.bytedance.ies.web.a.a.a(this) {
                    /* class com.bytedance.ies.bullet.kit.web.j.C0695j.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C0695j f32447a;

                    static {
                        Covode.recordClassIndex(19218);
                    }

                    {
                        this.f32447a = r1;
                    }

                    @Override // com.bytedance.ies.web.a.a.a
                    public final com.bytedance.ies.web.a.a.b a(String str, JSONObject jSONObject, int i2) {
                        if (i2 == 1) {
                            if (str == null || !h.m.p.b(str, this.f32447a.f32442a, false)) {
                                return null;
                            }
                            com.bytedance.sdk.xbridge.registry.core_api.a.b bVar = bVar;
                            h.f.b.l.a((Object) jSONObject, "");
                            bVar.a(jSONObject);
                            String substring = str.substring(this.f32447a.f32442a.length());
                            h.f.b.l.a((Object) substring, "");
                            return new com.bytedance.ies.web.a.a.b(substring, jSONObject);
                        } else if (i2 != 2) {
                            return null;
                        } else {
                            com.bytedance.sdk.xbridge.registry.core_api.a.b bVar2 = bVar;
                            h.f.b.l.a((Object) str, "");
                            bVar2.a(str, jSONObject);
                            return null;
                        }
                    }
                };
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void onEvent(com.bytedance.ies.bullet.c.c.a.p pVar) {
        h.f.b.l.c(pVar, "");
        Object b2 = pVar.b();
        JSONObject jSONObject = null;
        if (b2 != null && (b2 instanceof JSONObject)) {
            jSONObject = (JSONObject) b2;
        }
        com.bytedance.ies.bullet.kit.web.b.c cVar = this.w;
        if (cVar != null) {
            cVar.a(pVar.a(), jSONObject);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c
    public final void a(Activity activity) {
        if (x() && this.z.compareAndSet(false, true)) {
            j.b.a(this, "send pageReused event for reused view", null, null, 6);
            onEvent(new g(this));
        }
        onEvent(new h());
    }

    static final class t extends h.f.b.m implements h.f.a.b<d, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(19234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            d dVar2 = dVar;
            h.f.b.l.c(dVar2, "");
            com.bytedance.ies.bullet.kit.web.a.e a2 = dVar2.a();
            if (a2 != null) {
                a2.a(this.this$0);
                this.this$0.v().b().a(a2);
            }
            com.bytedance.ies.bullet.kit.web.a.d b2 = dVar2.b();
            if (b2 != null) {
                b2.a(this.this$0);
                this.this$0.v().c().a(b2);
            }
            b c2 = dVar2.c();
            if (c2 != null) {
                this.this$0.f32428k.add(c2);
            }
            g d2 = dVar2.d();
            if (d2 != null) {
                this.this$0.f32429l = d2;
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public final void b(Throwable th) {
        super.b(th);
        com.bytedance.ies.bullet.ui.common.g z2 = z();
        if (z2 != null) {
            z2.b(this.Q);
        }
        this.f32057i.a(com.bytedance.ies.web.a.a.class);
        this.f32057i.a(y.class);
        com.bytedance.ies.bullet.kit.web.b.c cVar = this.w;
        if (cVar != null) {
            com.bytedance.ies.web.a.a aVar = cVar.f32417j;
            if (aVar != null) {
                aVar.a();
            }
            x xVar = cVar.f32419l;
            if (xVar != null) {
                xVar.a();
            }
        }
        this.w = null;
        Iterator<T> it = this.H.iterator();
        while (it.hasNext()) {
            SSWebView sSWebView = (SSWebView) it.next().f33078a;
            sSWebView.setWebChromeClient(null);
            com.ss.android.ugc.tiktok.security.c.b.a();
            sSWebView.setWebViewClient(com.example.a.c.a(null));
            try {
                sSWebView.destroy();
            } catch (Throwable unused) {
            }
        }
        A().c();
        v().e();
    }

    static final class k extends h.f.b.m implements h.f.a.b<f, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(19219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            com.bytedance.ies.bullet.c.c.b.b<?> value;
            f fVar2 = fVar;
            h.f.b.l.c(fVar2, "");
            if (this.this$0.f32427j == null) {
                this.this$0.f32427j = fVar2.a();
            } else {
                a a2 = fVar2.a();
                a aVar = this.this$0.f32427j;
                if (aVar != null) {
                    h.f.b.l.c(a2, "");
                    for (Map.Entry<String, com.bytedance.ies.bullet.c.c.b.b<?>> entry : a2.a().entrySet()) {
                        com.bytedance.ies.bullet.c.c.b.b<?> bVar = aVar.a().get(entry.getKey());
                        if (!(bVar == null || (value = entry.getValue()) == null)) {
                            bVar.a(value);
                        }
                    }
                }
            }
            com.bytedance.ies.bullet.kit.web.b.b b2 = fVar2.b();
            if (b2 != null) {
                Boolean a3 = b2.a();
                if (a3 != null) {
                    this.this$0.r = Boolean.valueOf(a3.booleanValue());
                }
                String b3 = b2.b();
                if (b3 != null) {
                    this.this$0.s = b3;
                }
                List<String> c2 = b2.c();
                if (c2 != null) {
                    this.this$0.p.addAll(c2);
                }
                List<String> d2 = b2.d();
                if (d2 != null) {
                    this.this$0.q.addAll(d2);
                }
                List<String> e2 = b2.e();
                if (e2 != null) {
                    this.this$0.n.addAll(e2);
                }
                List<String> f2 = b2.f();
                if (f2 != null) {
                    this.this$0.o.addAll(f2);
                }
                Boolean g2 = b2.g();
                if (g2 != null) {
                    this.this$0.u = Boolean.valueOf(g2.booleanValue());
                }
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0231  */
    @Override // com.bytedance.ies.bullet.ui.common.c.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ies.bullet.ui.common.c.d<com.bytedance.ies.bullet.kit.web.SSWebView> r10) {
        /*
        // Method dump skipped, instructions count: 706
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.web.j.a(com.bytedance.ies.bullet.ui.common.c.d):void");
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c
    public final void a(h.f.a.b<? super List<com.bytedance.ies.bullet.ui.common.c.d<SSWebView>>, z> bVar) {
        h.f.b.l.c(bVar, "");
        if (this.f32057i.c(Context.class) != null) {
            SSWebView sSWebView = this.y;
            if (sSWebView == null) {
                h.f.b.l.a("mWebView");
            }
            bVar.invoke(h.a.n.a(new com.bytedance.ies.bullet.ui.common.c.d(sSWebView)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.m<String, Map<String, String>, z> {
        final /* synthetic */ z.e $finalUri;

        static {
            Covode.recordClassIndex(19223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(z.e eVar) {
            super(2);
            this.$finalUri = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, Map<String, String> map) {
            z.e eVar = this.$finalUri;
            T t = (T) Uri.parse(str);
            h.f.b.l.a((Object) t, "");
            eVar.element = t;
            return h.z.f158842a;
        }
    }

    private static int a(Context context, float f2) {
        Resources resources = context.getResources();
        h.f.b.l.a((Object) resources, "");
        return (int) ((f2 / resources.getDisplayMetrics().density) + 0.5f);
    }

    static final class l extends h.f.b.m implements h.f.a.m<String, Map<String, String>, h.z> {
        final /* synthetic */ Uri $input$inlined;
        final /* synthetic */ boolean $isCacheView$inlined;
        final /* synthetic */ com.bytedance.ies.bullet.ui.common.c.d $it$inlined;
        final /* synthetic */ boolean $reload$inlined;
        final /* synthetic */ SSWebView $this_apply;
        final /* synthetic */ z.e $url$inlined;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(19220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SSWebView sSWebView, com.bytedance.ies.bullet.ui.common.c.d dVar, j jVar, Uri uri, boolean z, boolean z2, z.e eVar) {
            super(2);
            this.$this_apply = sSWebView;
            this.$it$inlined = dVar;
            this.this$0 = jVar;
            this.$input$inlined = uri;
            this.$reload$inlined = z;
            this.$isCacheView$inlined = z2;
            this.$url$inlined = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            z.e eVar = this.$url$inlined;
            T t = (T) Uri.parse(str2);
            h.f.b.l.a((Object) t, "");
            eVar.element = t;
            if (map2 == null || map2.isEmpty()) {
                this.$this_apply.a(str2, new com.bytedance.webx.c[0]);
            } else {
                this.$this_apply.a(str2, map2, new com.bytedance.webx.c[0]);
            }
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<String, com.bytedance.ies.bullet.c.c.a.q, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(19224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, com.bytedance.ies.bullet.c.c.a.q qVar) {
            String str2 = str;
            final com.bytedance.ies.bullet.c.c.a.q qVar2 = qVar;
            h.f.b.l.c(str2, "");
            h.f.b.l.c(qVar2, "");
            com.bytedance.ies.bullet.kit.web.b.c cVar = this.this$0.w;
            if (cVar != null) {
                AnonymousClass1 r1 = new com.bytedance.ies.web.a.d(this) {
                    /* class com.bytedance.ies.bullet.kit.web.j.p.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ p f32454a;

                    static {
                        Covode.recordClassIndex(19225);
                    }

                    {
                        this.f32454a = r1;
                    }

                    @Override // com.bytedance.ies.web.a.d
                    public final void call(final com.bytedance.ies.web.a.h hVar, JSONObject jSONObject) {
                        String str;
                        JSONObject jSONObject2;
                        com.bytedance.ies.bullet.kit.web.b.c cVar;
                        j jVar = this.f32454a.this$0;
                        StringBuilder sb = new StringBuilder("bullet web func: ");
                        com.bytedance.ies.bullet.c.c.a.k kVar = null;
                        if (hVar != null) {
                            str = hVar.f35532c;
                        } else {
                            str = null;
                        }
                        j.b.a(jVar, sb.append(str).toString(), null, null, 6);
                        SystemClock.elapsedRealtime();
                        if (hVar == null || hVar.f35533d == null) {
                            jSONObject2 = new JSONObject();
                        } else {
                            jSONObject2 = hVar.f35533d;
                        }
                        this.f32454a.this$0.printLog("call web bridge method named " + hVar.f35532c + " with params " + jSONObject2, com.bytedance.ies.bullet.service.base.a.p.D, "BridgeRegistry");
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(StringSet.type, hVar.f35530a);
                            jSONObject3.put("func", hVar.f35532c);
                            jSONObject3.put("callback_id", hVar.f35531b);
                            jSONObject3.put("version", Integer.valueOf(hVar.f35534e));
                            jSONObject3.put("needCallback", Boolean.valueOf(hVar.f35538i));
                            jSONObject3.put("permissionGroup", hVar.f35537h);
                            jSONObject2.put("jsMsg", jSONObject3);
                            jSONObject2.put("func", hVar.f35532c);
                            jSONObject2.put("permissionGroup", hVar.f35537h);
                            jSONObject2.put("res", jSONObject);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        com.bytedance.ies.bullet.c.c.a.q qVar = qVar2;
                        if (qVar == null || (qVar instanceof com.bytedance.ies.bullet.c.c.a.k)) {
                            if (qVar instanceof com.bytedance.ies.bullet.c.c.a.k) {
                                kVar = qVar;
                            }
                            com.bytedance.ies.bullet.c.c.a.k kVar2 = kVar;
                            if (kVar2 != null) {
                                h.f.b.l.a((Object) jSONObject2, "");
                                kVar2.a(jSONObject2, new k.b(this) {
                                    /* class com.bytedance.ies.bullet.kit.web.j.p.AnonymousClass1.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f32456a;

                                    static {
                                        Covode.recordClassIndex(19226);
                                    }

                                    @Override // com.bytedance.ies.bullet.c.c.a.k.b
                                    public final void a(JSONObject jSONObject) {
                                        h.f.b.l.c(jSONObject, "");
                                        com.bytedance.ies.bullet.c.c.a.q qVar = qVar2;
                                        if (qVar != null) {
                                            com.bytedance.ies.bullet.c.c.a.k kVar = (com.bytedance.ies.bullet.c.c.a.k) qVar;
                                            com.bytedance.ies.bullet.kit.web.b.c cVar = this.f32456a.f32454a.this$0.w;
                                            if (cVar != null) {
                                                cVar.a(kVar, hVar.f35531b, jSONObject);
                                            }
                                            this.f32456a.f32454a.this$0.printLog("complete web bridge named " + hVar.f35532c + " success with result " + jSONObject, com.bytedance.ies.bullet.service.base.a.p.D, "BridgeRegistry");
                                            return;
                                        }
                                        throw new w("null cannot be cast to non-null type");
                                    }

                                    {
                                        this.f32456a = r1;
                                    }

                                    @Override // com.bytedance.ies.bullet.c.c.a.k.b
                                    public final void a(int i2, String str) {
                                        com.bytedance.ies.bullet.kit.web.b.c cVar;
                                        h.f.b.l.c(str, "");
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("code", i2);
                                            jSONObject.put("msg", str);
                                            com.bytedance.ies.bullet.c.c.a.q qVar = qVar2;
                                            if (qVar != null) {
                                                com.bytedance.ies.bullet.c.c.a.k kVar = (com.bytedance.ies.bullet.c.c.a.k) qVar;
                                                if (!(kVar == null || (cVar = this.f32456a.f32454a.this$0.w) == null)) {
                                                    cVar.a(kVar, hVar.f35531b, jSONObject);
                                                }
                                                this.f32456a.f32454a.this$0.printLog("complete web bridge named " + hVar.f35532c + " failure with status[" + i2 + ", " + str + ']', com.bytedance.ies.bullet.service.base.a.p.D, "BridgeRegistry");
                                                return;
                                            }
                                            throw new w("null cannot be cast to non-null type");
                                        } catch (JSONException e2) {
                                            e2.printStackTrace();
                                        }
                                    }

                                    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object */
                                    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.Object */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.bytedance.ies.bullet.c.c.a.k.b
                                    public final void a(int i2, String str, JSONObject jSONObject) {
                                        String str2;
                                        String str3;
                                        com.bytedance.ies.bullet.kit.web.b.c cVar;
                                        h.f.b.l.c(str, "");
                                        h.f.b.l.c(jSONObject, "");
                                        try {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("code", i2);
                                            jSONObject2.put("msg", str);
                                            jSONObject2.put("data", jSONObject);
                                            com.bytedance.ies.bullet.c.c.a.q qVar = qVar2;
                                            if (qVar != null) {
                                                com.bytedance.ies.bullet.c.c.a.k kVar = (com.bytedance.ies.bullet.c.c.a.k) qVar;
                                                if (!(kVar == null || (cVar = this.f32456a.f32454a.this$0.w) == null)) {
                                                    cVar.a(kVar, hVar.f35531b, jSONObject2);
                                                }
                                                try {
                                                    if (str.length() <= 0 || str == null || (str + " with [" + jSONObject + ']') == null) {
                                                        str3 = jSONObject.toString();
                                                        h.f.b.l.a((Object) str3, "");
                                                    }
                                                    str2 = h.q.m223constructorimpl(str3);
                                                } catch (Throwable th) {
                                                    str2 = h.q.m223constructorimpl(h.r.a(th));
                                                }
                                                if (!h.q.m228isFailureimpl(str2)) {
                                                    str = str2;
                                                }
                                                this.f32456a.f32454a.this$0.printLog("complete web bridge named " + hVar.f35532c + " failure with status[" + i2 + ", " + str + ']', com.bytedance.ies.bullet.service.base.a.p.D, "BridgeRegistry");
                                                return;
                                            }
                                            throw new w("null cannot be cast to non-null type");
                                        } catch (JSONException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                });
                            }
                        } else {
                            final com.bytedance.ies.bullet.c.c.a.r rVar = (com.bytedance.ies.bullet.c.c.a.r) qVar;
                            final h.f.a.m<Object, Class<?>, Object> a2 = com.bytedance.ies.bullet.c.c.a.a.a(JSONObject.class, Map.class);
                            final h.f.a.m<Object, Class<?>, Object> a3 = com.bytedance.ies.bullet.c.c.a.a.a(Map.class, JSONObject.class);
                            if (rVar != null) {
                                new h.f.a.b<Object, Object>() {
                                    /* class com.bytedance.ies.bullet.kit.web.j.p.AnonymousClass1.AnonymousClass2 */

                                    static {
                                        Covode.recordClassIndex(19227);
                                    }

                                    @Override // h.f.a.b
                                    public final Object invoke(Object obj) {
                                        h.f.b.l.c(obj, "");
                                        h.f.a.m mVar = a2;
                                        if (mVar != null) {
                                            Class<?> e2 = rVar.e();
                                            if (e2 == null) {
                                                e2 = Object.class;
                                            }
                                            Object invoke = mVar.invoke(obj, e2);
                                            if (invoke != null) {
                                                return invoke;
                                            }
                                        }
                                        return ag.a();
                                    }
                                };
                                new h.f.a.b<Object, Object>() {
                                    /* class com.bytedance.ies.bullet.kit.web.j.p.AnonymousClass1.AnonymousClass3 */

                                    static {
                                        Covode.recordClassIndex(19228);
                                    }

                                    @Override // h.f.a.b
                                    public final Object invoke(Object obj) {
                                        h.f.b.l.c(obj, "");
                                        h.f.a.m mVar = a3;
                                        if (mVar != null) {
                                            Class<?> e2 = rVar.e();
                                            if (e2 == null) {
                                                e2 = Object.class;
                                            }
                                            Object invoke = mVar.invoke(obj, e2);
                                            if (invoke != null) {
                                                return invoke;
                                            }
                                        }
                                        return ag.a();
                                    }
                                };
                            }
                            try {
                                h.f.b.l.a((Object) jSONObject2, "");
                                com.bytedance.ies.bullet.c.c.a.f.a(rVar, jSONObject2, new r.a<JSONObject>(this) {
                                    /* class com.bytedance.ies.bullet.kit.web.j.p.AnonymousClass1.AnonymousClass4 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f32458a;

                                    static {
                                        Covode.recordClassIndex(19229);
                                    }

                                    {
                                        this.f32458a = r1;
                                    }
                                });
                            } catch (Throwable th) {
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("code", 0);
                                    jSONObject4.put("msg", th.toString());
                                    if (!(rVar == null || (cVar = this.f32454a.this$0.w) == null)) {
                                        cVar.a(rVar, hVar.f35531b, jSONObject4);
                                    }
                                    this.f32454a.this$0.printLog("complete web bridge named " + hVar.f35532c + " failure with status[0, " + th.toString() + ']', com.bytedance.ies.bullet.service.base.a.p.D, "BridgeRegistry");
                                } catch (JSONException e3) {
                                    e3.printStackTrace();
                                }
                            }
                        }
                        hVar.f35538i = qVar2.aY_();
                    }
                };
                if (cVar.f32418k != null) {
                    y yVar = cVar.f32418k;
                    if (yVar == null) {
                        h.f.b.l.a();
                    }
                    yVar.a(str2, r1);
                } else {
                    com.bytedance.ies.web.a.a aVar = cVar.f32417j;
                    if (aVar != null) {
                        aVar.a(str2, r1);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<String, com.bytedance.ies.bullet.c.c.a.q, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(19233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, com.bytedance.ies.bullet.c.c.a.q qVar) {
            com.bytedance.ies.bullet.c.c.a.q qVar2 = qVar;
            h.f.b.l.c(str, "");
            h.f.b.l.c(qVar2, "");
            int i2 = k.f32470a[qVar2.b().ordinal()];
            if (i2 == 1) {
                List<String> list = this.this$0.n;
                if ((true ^ this.this$0.n.contains(str)) && list != null) {
                    list.add(str);
                }
            } else if (i2 == 2) {
                List<String> list2 = this.this$0.o;
                if ((true ^ this.this$0.o.contains(str)) && list2 != null) {
                    list2.add(str);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.c.c
    public final void a(com.bytedance.ies.bullet.ui.common.c.d<SSWebView> dVar, Uri uri) {
        h.f.b.l.c(dVar, "");
        h.f.b.l.c(uri, "");
        this.A = true;
        this.S = System.currentTimeMillis();
        super.a(dVar, uri);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: java.util.List<com.bytedance.ies.bullet.kit.web.b> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.c.c.r
    public final void b(List<String> list, com.bytedance.ies.bullet.c.f fVar) {
        h.f.b.l.c(list, "");
        h.f.b.l.c(fVar, "");
        super.b(list, fVar);
        v().b().f32654a.clear();
        v().c().f32641a.clear();
        this.f32428k.clear();
        t tVar = new t(this);
        Object c2 = this.f32057i.c(b.class);
        if (c2 != null) {
            this.f32428k.add(c2);
        }
        com.bytedance.ies.bullet.kit.web.a.e eVar = (com.bytedance.ies.bullet.kit.web.a.e) this.f32057i.c(com.bytedance.ies.bullet.kit.web.a.e.class);
        if (eVar != null) {
            eVar.a(this);
            v().b().a(eVar);
        }
        v().b().a(new i(this.M));
        v().c().a(new h(this.M));
        for (T t2 : p()) {
            if ((t2 instanceof d) && t2 != null) {
                tVar.invoke(t2);
            }
        }
        com.bytedance.ies.bullet.c.c.e s_ = s_();
        if ((s_ instanceof d) && s_ != null) {
            tVar.invoke(s_);
        }
        com.bytedance.ies.bullet.c.c.a.m mVar = this.f32051c;
        if (mVar != null) {
            mVar.a(new s(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: android.net.Uri */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.c.c.r
    public final void a(Uri uri, boolean z2) {
        h.f.a.r<WebView, String, Map<String, String>, h.f.a.m<? super String, ? super Map<String, String>, h.z>, h.z> a2;
        Long b2;
        Context context;
        boolean z3 = z2;
        MethodCollector.i(3785);
        h.f.b.l.c(uri, "");
        Map<String, String> map = null;
        j.b.a(this, "start to load url: ".concat(String.valueOf(uri)), null, null, 6);
        z.e eVar = new z.e();
        eVar.element = uri;
        if (h.f.b.l.a((Object) t().x.b(), (Object) true)) {
            T t2 = (T) uri.buildUpon().appendQueryParameter("container_id", this.f32056h.f32074a).build();
            h.f.b.l.a((Object) t2, "");
            eVar.element = t2;
        }
        if (h.f.b.l.a((Object) t().X.b(), (Object) "true") && (context = (Context) this.f32057i.c(Context.class)) != null) {
            T t3 = (T) eVar.element.buildUpon().appendQueryParameter("status_bar_height", String.valueOf(a(context, ((float) com.bytedance.ies.bullet.ui.common.d.d.a(context)) + 0.0f))).build();
            h.f.b.l.a((Object) t3, "");
            eVar.element = t3;
        }
        Uri uri2 = this.v;
        if (uri2 == null || (!h.f.b.l.a(uri2, uri))) {
            B();
            if (!this.R.isEmpty()) {
                com.bytedance.ies.bullet.service.base.web.b d2 = v().d();
                d2.a(this.R);
                if (this.y != null) {
                    SSWebView sSWebView = this.y;
                    if (sSWebView == null) {
                        h.f.b.l.a("mWebView");
                    }
                    d2.a(sSWebView);
                }
            }
        }
        com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f32057i.c(com.bytedance.ies.bullet.c.i.class);
        if (!(iVar == null || iVar.f32092d != null || iVar.f32090b == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = iVar.f32090b;
            if (l2 == null) {
                h.f.b.l.a();
            }
            iVar.f32092d = Long.valueOf(currentTimeMillis - l2.longValue());
        }
        this.C = System.currentTimeMillis();
        if (h.f.b.l.a((Object) t().H.b(), (Object) true) && (b2 = t().I.b()) != null) {
            long longValue = b2.longValue();
            if (longValue > 0) {
                Thread.sleep(longValue);
            }
        }
        boolean x2 = x();
        for (T t4 : this.H) {
            t4.a(uri);
            SSWebView sSWebView2 = (SSWebView) t4.f33078a;
            if (z3 || x2) {
                eVar.element = (T) a(t4, eVar.element, z2, x2);
            } else {
                g gVar = this.f32429l;
                if (gVar != null && (a2 = gVar.a()) != null) {
                    Map<String, String> map2 = this.P;
                    if (map2 != null) {
                        map = ag.d(map2);
                    }
                    a2.a(sSWebView2, String.valueOf(eVar.element), map, new l(sSWebView2, t4, this, uri, z2, false, eVar));
                } else if (this.P != null) {
                    String valueOf = String.valueOf(eVar.element);
                    Map<String, String> map3 = this.P;
                    if (map3 == null) {
                        h.f.b.l.a();
                    }
                    sSWebView2.loadUrl(valueOf, map3);
                } else {
                    sSWebView2.loadUrl(String.valueOf(eVar.element));
                }
            }
            z3 = z2;
            map = null;
        }
        this.v = eVar.element;
        MethodCollector.o(3785);
    }

    public static final class n extends com.bytedance.webx.monitor.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f32452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SSWebView f32453b;

        static {
            Covode.recordClassIndex(19222);
        }

        @Override // com.bytedance.webx.monitor.a.a, com.bytedance.ies.web.jsbridge2.q
        public final void a(String str) {
        }

        @Override // com.bytedance.webx.monitor.a.a, com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, al alVar) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(j jVar, SSWebView sSWebView, WebView webView) {
            super(webView);
            this.f32452a = jVar;
            this.f32453b = sSWebView;
        }

        @Override // com.bytedance.webx.monitor.a.a, com.bytedance.ies.web.jsbridge2.q
        public final void b(String str, String str2, int i2) {
            this.f32452a.printLog("complete web bridge named " + str2 + " failure with status [" + j.a(i2) + ']', com.bytedance.ies.bullet.service.base.a.p.D, "BridgeRegistry");
            super.b(str, str2, i2);
        }

        @Override // com.bytedance.webx.monitor.a.a, com.bytedance.ies.web.jsbridge2.q
        public final void a(String str, String str2, int i2, String str3, al alVar) {
            this.f32452a.printLog("complete web bridge named " + str2 + " failure with status [" + j.a(i2) + ", " + str3 + ']', com.bytedance.ies.bullet.service.base.a.p.D, "BridgeRegistry");
            super.a(str, str2, i2, str3, alVar);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.r
    public final void c(Uri uri, h.f.a.b<? super Uri, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        h.f.b.l.c(uri, "");
        h.f.b.l.c(bVar, "");
        h.f.b.l.c(bVar2, "");
        bVar.invoke(uri);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: android.net.Uri */
    /* JADX WARN: Multi-variable type inference failed */
    private final Uri a(com.bytedance.ies.bullet.ui.common.c.d<SSWebView> dVar, Uri uri, boolean z2, boolean z3) {
        T t2;
        h.f.a.r<WebView, String, Map<String, String>, h.f.a.m<? super String, ? super Map<String, String>, h.z>, h.z> rVar;
        if (z2) {
            j.b.a(this, "start to reload webview", null, null, 6);
            l();
            return uri;
        }
        if (z3) {
            j.b.a(this, "start to reload cached view", null, null, 6);
            g gVar = this.f32429l;
            if (gVar != null) {
                rVar = gVar.a();
            } else {
                rVar = null;
            }
            if (rVar == null) {
                t2 = uri;
            } else {
                z.e eVar = new z.e();
                eVar.element = uri;
                SSWebView sSWebView = this.y;
                if (sSWebView == null) {
                    h.f.b.l.a("mWebView");
                }
                rVar.a(sSWebView, String.valueOf(uri), null, new o(eVar));
                t2 = eVar.element;
            }
            this.v = t2;
            r();
            SSWebView sSWebView2 = this.y;
            if (sSWebView2 == null) {
                h.f.b.l.a("mWebView");
            }
            sSWebView2.onResume();
            y();
        } else {
            t2 = uri;
        }
        dVar.b(uri);
        return t2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(WebKitApi webKitApi, com.bytedance.ies.bullet.c.c.z zVar, List<String> list, com.bytedance.ies.bullet.c.f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(webKitApi, zVar, list, fVar, bVar);
        String str;
        h.f.b.l.c(webKitApi, "");
        h.f.b.l.c(zVar, "");
        h.f.b.l.c(list, "");
        h.f.b.l.c(fVar, "");
        h.f.b.l.c(bVar, "");
        com.bytedance.ies.bullet.service.base.o oVar = (com.bytedance.ies.bullet.service.base.o) b_(com.bytedance.ies.bullet.service.base.o.class);
        com.bytedance.android.monitor.webview.c cVar = null;
        String str2 = null;
        if (oVar != null) {
            com.bytedance.android.monitor.webview.c a2 = com.bytedance.android.monitor.webview.i.a();
            c.a d2 = a2.d();
            d2.a(new m.a(oVar));
            ak b2 = oVar.b();
            if (b2 != null) {
                str = b2.f32536b;
            } else {
                str = null;
            }
            d2.b(str);
            ak b3 = oVar.b();
            d2.a(b3 != null ? b3.f32535a : str2);
            d2.b();
            d2.a();
            d2.a(SSWebView.class.getName());
            d2.d();
            d2.c();
            a2.a(d2);
            cVar = a2;
        }
        this.M = cVar;
        this.f32430m = h.i.a((h.f.a.a) new c(bVar));
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.z = new AtomicBoolean(false);
        this.N = h.i.a((h.f.a.a) new i(this, bVar));
        this.O = h.i.a((h.f.a.a) d.f32434a);
        this.Q = new b(this);
        this.R = new LinkedHashMap();
        this.A = true;
        this.D = new LinkedHashMap();
    }
}
