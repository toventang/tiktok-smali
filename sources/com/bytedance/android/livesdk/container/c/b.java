package com.bytedance.android.livesdk.container.c;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.util.e;
import com.bytedance.android.livesdk.container.util.g;
import com.bytedance.android.livesdk.container.util.h;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxShareGroupSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveImportHostLynxJsb;
import com.bytedance.android.livesdk.lynx.bridge.TTLiveLynxBridgeModule;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.m;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.ao;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.j.a.e.a;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.shadow.text.r;
import h.a.ag;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import h.v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f16756j = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public LynxView f16757f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.livesdk.lynx.a.a f16758g;

    /* renamed from: h  reason: collision with root package name */
    com.bytedance.ies.bullet.service.base.c.c f16759h;

    /* renamed from: i  reason: collision with root package name */
    public int f16760i;

    /* renamed from: k  reason: collision with root package name */
    private m f16761k;

    /* renamed from: l  reason: collision with root package name */
    private o f16762l;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.android.livesdk.lynx.bridge.c f16763m;
    private int n;

    public static final class a {
        static {
            Covode.recordClassIndex(9283);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final /* bridge */ /* synthetic */ View f() {
        return this.f16757f;
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void d() {
        this.f16757f = i();
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(9285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return this.this$0.f16752c.getUrl();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(9289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return this.this$0.f16752c.getUrl();
        }
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void c() {
        this.f16758g = new com.bytedance.android.livesdk.lynx.a.a(new f(this));
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void e() {
        com.bytedance.ies.bullet.service.base.c.c cVar = this.f16759h;
        if (cVar != null) {
            cVar.b();
        }
        super.e();
    }

    static {
        Covode.recordClassIndex(9282);
        ((com.bytedance.android.livesdk.lynx.c) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.lynx.c.class)).tryInitEnvIfNeeded();
        r.a(e.a.f16893a);
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void a() {
        c();
        this.f16750a = b();
        com.bytedance.android.livesdk.browser.jsbridge.c cVar = this.f16750a;
        if (cVar != null) {
            a(cVar);
        }
        d();
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final com.bytedance.android.livesdk.browser.jsbridge.c b() {
        com.bytedance.android.livesdk.lynx.bridge.c cVar = new com.bytedance.android.livesdk.lynx.bridge.c(this.f16751b, new c(this));
        cVar.f18766c = new C0336b(this);
        this.f16763m = cVar;
        com.bytedance.android.livesdk.browser.jsbridge.c a2 = com.bytedance.android.livesdk.browser.jsbridge.c.a(this.f16751b, cVar);
        l.b(a2, "");
        return a2;
    }

    private final LynxView i() {
        String str;
        String str2;
        Object obj;
        com.bytedance.ies.bullet.service.base.c.c cVar;
        Map<String, ? extends Object> map;
        z.e eVar = new z.e();
        com.bytedance.j.a.c cVar2 = new com.bytedance.j.a.c((byte) 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bridge", new com.bytedance.j.a.e.b(TTLiveLynxBridgeModule.class, this.f16763m));
        cVar2.n = linkedHashMap;
        cVar2.o = com.bytedance.android.livesdk.lynx.ui.b.a();
        cVar2.f38964e = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        cVar2.f38963d = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        String url = this.f16752c.getUrl();
        if (!EnableLynxShareGroupSetting.INSTANCE.getValue() || !(!p.a((CharSequence) url))) {
            com.bytedance.android.livesdk.lynx.b.a.a(url);
            str = "unspecified-" + this.f16753d;
        } else {
            Uri parse = Uri.parse(url);
            if (parse == null || (str = parse.getQueryParameter("business_type")) == null) {
                str = "unspecified-" + this.f16753d;
            }
        }
        l.b(str, "");
        View view = null;
        cVar2.f38960a = com.lynx.tasm.l.a(str, null, this.f16752c.getEnableCanvas());
        com.bytedance.android.livesdk.lynx.a.a aVar = this.f16758g;
        if (aVar != null) {
            str2 = aVar.f18754a;
        } else {
            str2 = null;
        }
        com.bytedance.j.a.e.a a2 = a.C0927a.a(str2);
        if (!TextUtils.isEmpty(this.f16752c.getInitialData())) {
            a2.a("initial_data", new JSONObject(this.f16752c.getInitialData()));
        }
        cVar2.p = a2;
        cVar2.a(new com.bytedance.android.livesdk.container.b.a(this));
        eVar.element = (T) com.bytedance.android.livesdk.lynx.b.a.a.f18759a.a(cVar2);
        cVar2.f38967h = new d(url, this, eVar);
        com.bytedance.android.livesdk.lynx.a.a aVar2 = this.f16758g;
        if (aVar2 == null || (map = aVar2.f18755b) == null) {
            obj = null;
        } else {
            obj = map.get("__globalProps");
        }
        if (!(obj instanceof Map)) {
            obj = null;
        }
        cVar2.a((Map) obj);
        m mVar = this.f16761k;
        if (mVar == null) {
            l.a("serviceContext");
        }
        mVar.a().a(com.bytedance.j.a.c.class, cVar2);
        m mVar2 = this.f16761k;
        if (mVar2 == null) {
            l.a("serviceContext");
        }
        com.bytedance.ies.bullet.service.base.a.b bVar = new com.bytedance.ies.bullet.service.base.a.b("live", mVar2);
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.ies.bullet.service.base.c.b bVar2 = (com.bytedance.ies.bullet.service.base.c.b) bVar.b_(com.bytedance.ies.bullet.service.base.c.b.class);
        if (bVar2 != null) {
            cVar = bVar2.b(bVar);
        } else {
            cVar = null;
        }
        this.f16759h = cVar;
        com.bytedance.android.livesdk.lynx.b.a.a(currentTimeMillis);
        this.f16762l = bVar;
        com.bytedance.android.livesdk.lynx.bridge.c cVar3 = this.f16763m;
        if (cVar3 != null) {
            cVar3.f18765b = this.f16759h;
        }
        com.bytedance.ies.bullet.service.base.c.c cVar4 = this.f16759h;
        if (cVar4 != null) {
            view = cVar4.a();
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
        LynxView lynxView = (LynxView) view;
        T t = eVar.element;
        if (t != null) {
            t.a(lynxView);
        }
        return lynxView;
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void a(com.bytedance.android.livesdk.browser.jsbridge.c cVar) {
        l.d(cVar, "");
        this.f16761k = new com.bytedance.ies.bullet.service.base.a.a(this.f16751b, com.bytedance.android.livesdk.container.util.d.a());
    }

    /* renamed from: com.bytedance.android.livesdk.container.c.b$b  reason: collision with other inner class name */
    static final class C0336b extends h.f.b.m implements h.f.a.b<TTLiveLynxBridgeModule, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(9284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0336b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TTLiveLynxBridgeModule tTLiveLynxBridgeModule) {
            x xVar;
            com.bytedance.android.livesdk.browser.jsbridge.c cVar;
            x xVar2;
            TTLiveLynxBridgeModule tTLiveLynxBridgeModule2 = tTLiveLynxBridgeModule;
            l.d(tTLiveLynxBridgeModule2, "");
            b bVar = this.this$0;
            Activity activity = bVar.f16751b;
            if (LiveImportHostLynxJsb.INSTANCE.getValue()) {
                com.bytedance.android.livesdk.lynx.bridge.c cVar2 = new com.bytedance.android.livesdk.lynx.bridge.c(activity, new e(bVar));
                cVar2.a(tTLiveLynxBridgeModule2);
                cVar2.f18765b = bVar.f16759h;
                k kVar = (k) com.bytedance.android.live.t.a.a(k.class);
                com.bytedance.android.livesdk.browser.jsbridge.c cVar3 = bVar.f16750a;
                if (cVar3 != null) {
                    xVar = cVar3.f14451b;
                } else {
                    xVar = null;
                }
                Object a2 = kVar.a(xVar, activity, bVar.f16759h, bVar.f16757f, cVar2);
                if (!(!(a2 instanceof x) || (cVar = bVar.f16750a) == null || (xVar2 = cVar.f14451b) == null)) {
                    xVar2.a("host", (x) a2);
                }
            }
            return h.z.f158842a;
        }
    }

    public static final class d extends com.bytedance.j.a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f16765b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f16766c;

        static {
            Covode.recordClassIndex(9286);
        }

        @Override // com.bytedance.j.a.f
        public final void a(ap apVar) {
            int i2;
            Object obj;
            Map<String, ? extends Object> map;
            com.bytedance.android.livesdk.lynx.a.a aVar;
            l.d(apVar, "");
            b bVar = this.f16765b;
            if (apVar.q == ao.GECKO) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            bVar.f16760i = i2;
            com.bytedance.android.livesdk.browser.jsbridge.c cVar = this.f16765b.f16750a;
            if (!(cVar == null || (aVar = this.f16765b.f16758g) == null)) {
                aVar.a(this.f16764a, cVar, new h.f.a.b<com.google.gson.o, h.z>(this) {
                    /* class com.bytedance.android.livesdk.container.c.b.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(9287);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(com.google.gson.o oVar) {
                        com.google.gson.o oVar2 = oVar;
                        l.d(oVar2, "");
                        oVar2.a("offline", Integer.valueOf(this.this$0.f16765b.f16760i));
                        return h.z.f158842a;
                    }
                }, new h.f.a.b<Map<String, ? extends Object>, h.z>(this) {
                    /* class com.bytedance.android.livesdk.container.c.b.d.AnonymousClass2 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(9288);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(Map<String, ? extends Object> map) {
                        Map<String, ? extends Object> map2 = map;
                        l.d(map2, "");
                        LynxView lynxView = this.this$0.f16765b.f16757f;
                        if (lynxView != null) {
                            lynxView.updateData(map2);
                        }
                        return h.z.f158842a;
                    }
                });
            }
            LynxView lynxView = this.f16765b.f16757f;
            if (lynxView != null) {
                com.bytedance.android.livesdk.lynx.a.a aVar2 = this.f16765b.f16758g;
                Object obj2 = null;
                if (aVar2 == null || (map = aVar2.f18755b) == null) {
                    obj = null;
                } else {
                    obj = map.get("__globalProps");
                }
                if (obj instanceof Map) {
                    obj2 = obj;
                }
                lynxView.setGlobalProps((Map) obj2);
            }
            com.bytedance.android.livesdk.lynx.b.a.a(this.f16765b.f16760i, this.f16765b.a(new h.p[0]));
        }

        d(String str, b bVar, z.e eVar) {
            this.f16764a = str;
            this.f16765b = bVar;
            this.f16766c = eVar;
        }
    }

    public final Map<String, Object> a(h.p<String, ? extends Object>... pVarArr) {
        l.d(pVarArr, "");
        h.p[] pVarArr2 = new h.p[5];
        boolean z = false;
        pVarArr2[0] = v.a("ts", Long.valueOf(System.currentTimeMillis()));
        if (this.n < 2) {
            z = true;
        }
        pVarArr2[1] = v.a("isFirstTime", Boolean.valueOf(z));
        pVarArr2[2] = v.a("offline", Integer.valueOf(this.f16760i));
        pVarArr2[3] = v.a("template_url", this.f16752c.getUrl());
        Uri parse = Uri.parse(this.f16752c.getUrl());
        l.b(parse, "");
        pVarArr2[4] = v.a("path", parse.getPath());
        Map<String, Object> b2 = ag.b(pVarArr2);
        ag.a(b2, pVarArr);
        return b2;
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.google.gson.o, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(9290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.google.gson.o oVar) {
            int i2;
            Configuration configuration;
            Uri uri;
            com.google.gson.o oVar2 = oVar;
            l.d(oVar2, "");
            Resources resources = this.this$0.f16751b.getResources();
            l.b(resources, "");
            if (resources.getConfiguration().orientation == 2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            oVar2.a("orientation", Integer.valueOf(i2));
            oVar2.a("initTimestamp", String.valueOf(System.currentTimeMillis()));
            Resources resources2 = this.this$0.f16751b.getResources();
            if (resources2 != null) {
                configuration = resources2.getConfiguration();
            } else {
                configuration = null;
            }
            oVar2.a("theme", h.a(configuration));
            oVar2.a("containerID", this.this$0.f16753d);
            String originUri = this.this$0.f16752c.getOriginUri();
            if (originUri == null || originUri.length() == 0) {
                uri = Uri.parse(this.this$0.f16752c.getUrl());
            } else {
                uri = Uri.parse(this.this$0.f16752c.getOriginUri());
            }
            l.b(uri, "");
            oVar2.a("queryItems", g.a(uri));
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.container.c.a
    public final void a(String str) {
        l.d(str, "");
        this.n++;
        com.bytedance.ies.bullet.service.base.c.c cVar = this.f16759h;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity, HybridConfig hybridConfig, String str, com.bytedance.android.livesdk.container.h.a aVar) {
        super(activity, hybridConfig, str, aVar);
        l.d(activity, "");
        l.d(hybridConfig, "");
        l.d(str, "");
    }
}
