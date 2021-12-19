package com.ss.android.ugc.aweme.bullet.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.a.b;
import com.bytedance.ies.bullet.a.h;
import com.bytedance.ies.bullet.c.a;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.d.a;
import com.bytedance.ies.bullet.e.b;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.kit.rn.IRnKitApi;
import com.bytedance.ies.bullet.kit.web.IWebKitApi;
import com.bytedance.ies.bullet.service.base.a.e;
import com.bytedance.ies.bullet.service.base.aa;
import com.bytedance.ies.bullet.service.base.ad;
import com.bytedance.ies.bullet.service.base.ai;
import com.bytedance.ies.bullet.service.base.ak;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.b.f;
import com.bytedance.ies.bullet.service.base.k;
import com.bytedance.ies.bullet.service.base.p;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.s;
import com.bytedance.ies.bullet.service.base.v;
import com.bytedance.ies.bullet.service.base.y;
import com.bytedance.ies.bullet.service.base.z;
import com.bytedance.ies.bullet.service.c.a;
import com.bytedance.ies.bullet.service.f.f;
import com.bytedance.ies.bullet.service.popup.i;
import com.bytedance.ies.d.a.a.a;
import com.bytedance.j.a.c.b;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.canvas.LynxHelium;
import com.lynx.tasm.behavior.ui.canvas.LynxHeliumCanvas;
import com.lynx.tasm.i;
import com.lynx.tasm.j;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.ss.android.ugc.aweme.bullet.BulletEventObserver;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.f.e;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m;
import h.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

public final class BulletService implements IBulletService {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f69312a = n.b("ProximaNova-Bold", "'ProximaNova-Bold'", "\"ProximaNova-Bold\"");

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f69313b = n.b("ProximaNova-Semibold", "'ProximaNova-Semibold'", "\"ProximaNova-Semibold\"", "ProximaNova-SemiBold", "'ProximaNova-SemiBold'", "\"ProximaNova-SemiBold\"");

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f69314c = n.b("ProximaNova-Regular", "'ProximaNova-Regular'", "\"ProximaNova-Regular\"");

    /* renamed from: d  reason: collision with root package name */
    public static final a f69315d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f69316e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f69317f = h.i.a(m.SYNCHRONIZED, new d(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f69318g = h.i.a(m.SYNCHRONIZED, new c(this));

    private final com.bytedance.ies.bullet.a.b g() {
        return (com.bytedance.ies.bullet.a.b) this.f69318g.getValue();
    }

    public final com.bytedance.ies.bullet.a.a d() {
        return (com.bytedance.ies.bullet.a.a) this.f69317f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42739);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class i extends e.a {

        /* renamed from: a  reason: collision with root package name */
        public BulletEventObserver f69351a;

        static {
            Covode.recordClassIndex(42755);
        }

        i() {
        }

        @Override // com.bytedance.ies.bullet.service.base.a.e, com.bytedance.ies.bullet.service.base.a.e.a
        public final void a(com.bytedance.ies.bullet.service.base.a.d dVar) {
            l.d(dVar, "");
            if (dVar instanceof com.bytedance.ies.bullet.service.popup.e) {
                this.f69351a = new BulletEventObserver(((com.bytedance.ies.bullet.service.popup.e) dVar).f32952a, null);
                EventBus.a(EventBus.a(), this.f69351a);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.a.e, com.bytedance.ies.bullet.service.base.a.e.a
        public final void b(com.bytedance.ies.bullet.service.base.a.d dVar) {
            l.d(dVar, "");
            if ((dVar instanceof com.bytedance.ies.bullet.service.popup.e) && this.f69351a != null) {
                EventBus.a().b(this.f69351a);
                this.f69351a = null;
            }
        }
    }

    static final class e implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletService f69335a;

        static {
            Covode.recordClassIndex(42751);
        }

        e(BulletService bulletService) {
            this.f69335a = bulletService;
        }

        @Override // com.lynx.tasm.i.a
        public final void a() {
            this.f69335a.a(ILynxKitApi.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final d.b a() {
        return g();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final com.bytedance.ies.bullet.a.a b() {
        return d();
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.a.b> {
        final /* synthetic */ BulletService this$0;

        static {
            Covode.recordClassIndex(42741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BulletService bulletService) {
            super(0);
            this.this$0 = bulletService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.a.b invoke() {
            return this.this$0.d().a("default_bid");
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.a.a> {
        final /* synthetic */ BulletService this$0;

        static {
            Covode.recordClassIndex(42742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BulletService bulletService) {
            super(0);
            this.this$0 = bulletService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.a.a invoke() {
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.Application");
            this.this$0.e();
            Keva.getRepo("__hybrid_local_test__").getBoolean("lynxDebugEnable", true);
            AnonymousClass1 r0 = new h.a(this, (Application) a2) {
                /* class com.ss.android.ugc.aweme.bullet.impl.BulletService.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f69320a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Application f69321b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ boolean f69322c = false;

                /* renamed from: d  reason: collision with root package name */
                private com.bytedance.ies.bullet.c.a.a f69323d;

                /* renamed from: e  reason: collision with root package name */
                private com.bytedance.ies.bullet.service.f.f f69324e;

                /* renamed from: f  reason: collision with root package name */
                private com.bytedance.ies.bullet.service.base.resourceloader.config.i f69325f;

                /* renamed from: g  reason: collision with root package name */
                private com.bytedance.ies.bullet.service.base.c.a f69326g;

                /* renamed from: h  reason: collision with root package name */
                private aa f69327h;

                /* renamed from: i  reason: collision with root package name */
                private ak f69328i;

                /* renamed from: j  reason: collision with root package name */
                private p f69329j;

                /* renamed from: k  reason: collision with root package name */
                private v f69330k;

                static {
                    Covode.recordClassIndex(42743);
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$b */
                public static final class b extends com.bytedance.j.a.c.a {
                    static {
                        Covode.recordClassIndex(42745);
                    }

                    b() {
                    }

                    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$b$a */
                    static final class a implements LynxHelium.ErrorHandler {

                        /* renamed from: a  reason: collision with root package name */
                        public static final a f69332a = new a();

                        static {
                            Covode.recordClassIndex(42746);
                        }

                        a() {
                        }

                        @Override // com.lynx.tasm.behavior.ui.canvas.LynxHelium.ErrorHandler
                        public final void onReceivedError(j jVar) {
                            ALog.e("LynxCanvas", jVar.toString());
                        }
                    }

                    @Override // com.bytedance.j.a.c.a
                    public final void a(Application application, com.lynx.tasm.f fVar) {
                        l.d(application, "");
                        LynxHelium.getInstance().setSmashUrlFallback("https://sf16-muse-va.ibytedtos.com/obj/developer-alisg/misc/", true);
                        LynxHelium.getInstance().init(application, fVar, a.f69332a, null);
                        LynxEnv b2 = LynxEnv.b();
                        l.b(b2, "");
                        b2.q = LynxHelium.getInstance();
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$d  reason: collision with other inner class name */
                public static final class C1565d implements aa {
                    static {
                        Covode.recordClassIndex(42748);
                    }

                    C1565d() {
                    }

                    @Override // com.bytedance.ies.bullet.service.base.aa
                    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
                        com.bytedance.apm.b.a(str, i2, jSONObject, jSONObject2);
                    }
                }

                @Override // com.bytedance.ies.bullet.a.h
                public final com.bytedance.ies.bullet.c.a.a a() {
                    return this.f69323d;
                }

                @Override // com.bytedance.ies.bullet.a.h
                public final com.bytedance.ies.bullet.service.f.f b() {
                    return this.f69324e;
                }

                @Override // com.bytedance.ies.bullet.a.h
                public final com.bytedance.ies.bullet.service.base.resourceloader.config.i c() {
                    return this.f69325f;
                }

                @Override // com.bytedance.ies.bullet.a.h
                public final aa d() {
                    return this.f69327h;
                }

                @Override // com.bytedance.ies.bullet.a.h
                public final ak e() {
                    return this.f69328i;
                }

                @Override // com.bytedance.ies.bullet.a.h
                public final com.bytedance.ies.bullet.service.base.c.a f() {
                    return this.f69326g;
                }

                @Override // com.bytedance.ies.bullet.a.h
                public final p g() {
                    return this.f69329j;
                }

                @Override // com.bytedance.ies.bullet.a.h, com.bytedance.ies.bullet.a.h.a
                public final v h() {
                    return this.f69330k;
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$c */
                public static final class c extends com.lynx.tasm.behavior.a {
                    static {
                        Covode.recordClassIndex(42747);
                    }

                    c(String str) {
                        super(str);
                    }

                    @Override // com.lynx.tasm.behavior.a
                    public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
                        return new LynxHeliumCanvas(jVar);
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$a */
                public static final class a implements com.bytedance.j.a.b.a {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f69331a;

                    static {
                        Covode.recordClassIndex(42744);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    a(AnonymousClass1 r1) {
                        this.f69331a = r1;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$e */
                static final class e extends h.f.b.m implements h.f.a.b<Context, k> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final e f69333a = new e();

                    static {
                        Covode.recordClassIndex(42749);
                    }

                    e() {
                        super(1);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ k invoke(Context context) {
                        Context context2 = context;
                        l.d(context2, "");
                        return new com.ss.android.ugc.aweme.bullet.views.b(context2, (byte) 0);
                    }
                }

                {
                    this.f69320a = r25;
                    this.f69321b = r26;
                    com.bytedance.ies.bullet.c.a.a aVar = new com.bytedance.ies.bullet.c.a.a(r26);
                    com.bytedance.ies.bullet.c.a.b bVar = new com.bytedance.ies.bullet.c.a.b();
                    bVar.f31978a = false;
                    bVar.f31979b = a.C2792a.f108997a.f108996a.shouldBulletShowDebugTagView();
                    aVar.a(bVar);
                    this.f69323d = aVar;
                    f.a aVar2 = new f.a();
                    l.c("aweme", "");
                    aVar2.f32765a = "aweme";
                    this.f69324e = aVar2.a();
                    l.b(com.ss.android.ugc.aweme.web.k.f145061a, "");
                    l.b("gecko-va.tiktokv.com", "");
                    String a2 = com.ss.android.ugc.aweme.language.d.a();
                    l.b(a2, "");
                    List c2 = n.c("ecom_prefix");
                    for (Pattern pattern : com.ss.android.ugc.aweme.web.l.b()) {
                        if (pattern != null) {
                            String pattern2 = pattern.toString();
                            l.b(pattern2, "");
                            if (pattern2.length() > 0) {
                                String pattern3 = pattern.toString();
                                l.b(pattern3, "");
                                c2.add(pattern3);
                            }
                        }
                    }
                    String valueOf = String.valueOf(com.bytedance.ies.ugc.appcontext.d.n);
                    String f2 = com.bytedance.ies.ugc.appcontext.d.f();
                    String serverDeviceId = AppLog.getServerDeviceId();
                    serverDeviceId = serverDeviceId == null ? "" : serverDeviceId;
                    com.bytedance.ies.bullet.f.a aVar3 = new com.bytedance.ies.bullet.f.a();
                    GeckoXNetImpl geckoXNetImpl = new GeckoXNetImpl(com.bytedance.ies.ugc.appcontext.d.a());
                    com.ss.android.ugc.aweme.web.k kVar = com.ss.android.ugc.aweme.web.k.f145061a;
                    l.b(kVar, "");
                    String c3 = kVar.c();
                    l.b(c3, "");
                    this.f69325f = new com.bytedance.ies.bullet.service.base.resourceloader.config.i("gecko-va.tiktokv.com", a2, c2, valueOf, f2, serverDeviceId, new GeckoConfig(c3, "offlineX", new com.bytedance.ies.bullet.g.a.b(), false, false, 24, null), null, aVar3, geckoXNetImpl, 128);
                    b.a aVar4 = new b.a(r26);
                    aVar4.f38974a = false;
                    a aVar5 = new a(this);
                    l.c(aVar5, "");
                    aVar4.f38975b.add(aVar5);
                    com.bytedance.j.a.c.e.f38996b = false;
                    b bVar2 = new b();
                    l.c(bVar2, "");
                    aVar4.f38980g = bVar2;
                    List a3 = n.a(new c("canvas"));
                    l.c(a3, "");
                    aVar4.f38978e.addAll(a3);
                    this.f69326g = aVar4.a();
                    this.f69327h = new C1565d();
                    ak.a aVar6 = new ak.a();
                    l.c("bullet", "");
                    aVar6.f32543d = "bullet";
                    this.f69328i = aVar6.a();
                    a.C0701a aVar7 = new a.C0701a();
                    l.c(BulletContainerActivity.class, "");
                    aVar7.f32656a = BulletContainerActivity.class;
                    this.f69329j = new com.bytedance.ies.bullet.service.c.a(aVar7, (byte) 0);
                    i.a aVar8 = new i.a();
                    e eVar = e.f69333a;
                    l.c(eVar, "");
                    aVar8.f33005a = eVar;
                    this.f69330k = new com.bytedance.ies.bullet.service.popup.i(aVar8, (byte) 0);
                }
            };
            l.c(r0, "");
            com.bytedance.ies.bullet.b.a aVar = new com.bytedance.ies.bullet.b.a(r0);
            AnonymousClass2 r02 = new com.bytedance.ies.bullet.a.g(this) {
                /* class com.ss.android.ugc.aweme.bullet.impl.BulletService.d.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f69334a;

                static {
                    Covode.recordClassIndex(42750);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f69334a = r1;
                }

                @Override // com.bytedance.ies.bullet.a.g
                public final void a(b.a aVar, com.bytedance.ies.bullet.c.a.a aVar2) {
                    l.d(aVar, "");
                    l.d(aVar2, "");
                    aVar.a(IRnKitApi.class, true);
                    aVar.a(IWebKitApi.class);
                    aVar.a(new com.ss.android.ugc.aweme.bullet.c());
                    com.ss.android.ugc.aweme.bullet.d dVar = new com.ss.android.ugc.aweme.bullet.d();
                    l.c(dVar, "");
                    aVar.f31945c.put("defaultPackageBundle", dVar);
                    aVar.a("ad_commerce", new com.ss.android.ugc.aweme.bullet.d.a());
                    com.ss.android.ugc.aweme.bullet.f fVar = com.ss.android.ugc.aweme.bullet.f.f69290a;
                    l.c(fVar, "");
                    a.C0669a aVar3 = aVar.f31944b;
                    l.c(fVar, "");
                    aVar3.f31969d = fVar;
                    LynxEnv b2 = LynxEnv.b();
                    l.b(b2, "");
                    b2.b(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).lynxDevToolDebugEnable());
                    com.bytedance.ies.bullet.service.base.a.l a2 = e.a.a();
                    String str = aVar2.f31975a;
                    f.a a3 = new f.a().a(com.bytedance.ies.bullet.service.base.web.d.class, new com.bytedance.ies.bullet.service.webkit.b()).a(com.bytedance.ies.bullet.service.base.web.j.class, new com.bytedance.ies.bullet.service.g.a.a()).a(com.bytedance.ies.bullet.service.base.web.e.class, new com.bytedance.ies.bullet.service.g.b.a());
                    a.C0674a aVar4 = new a.C0674a();
                    aVar4.f32103a = false;
                    a2.a(str, a3.a(com.bytedance.ies.bullet.service.base.m.class, new com.bytedance.ies.bullet.d.b(new com.bytedance.ies.bullet.d.a(aVar4))).a(s.class, new com.bytedance.ies.bullet.e.d(new com.bytedance.ies.bullet.e.b(new b.a(), (byte) 0))).a());
                }
            };
            l.c(r02, "");
            aVar.f31937a = r02;
            return aVar;
        }
    }

    public static IBulletService f() {
        MethodCollector.i(5687);
        Object a2 = com.ss.android.ugc.b.a(IBulletService.class, false);
        if (a2 != null) {
            IBulletService iBulletService = (IBulletService) a2;
            MethodCollector.o(5687);
            return iBulletService;
        }
        if (com.ss.android.ugc.b.X == null) {
            synchronized (IBulletService.class) {
                try {
                    if (com.ss.android.ugc.b.X == null) {
                        com.ss.android.ugc.b.X = new BulletService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5687);
                    throw th;
                }
            }
        }
        BulletService bulletService = (BulletService) com.ss.android.ugc.b.X;
        MethodCollector.o(5687);
        return bulletService;
    }

    public final void e() {
        MethodCollector.i(5611);
        synchronized (BulletService.class) {
            try {
                if (!this.f69316e) {
                    r.a(new b(com.ss.android.ugc.aweme.tux.a.c.a.b()));
                    this.f69316e = true;
                }
            } finally {
                MethodCollector.o(5611);
            }
        }
    }

    static {
        Covode.recordClassIndex(42738);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void c() {
        g();
        LynxEnv b2 = LynxEnv.b();
        l.b(b2, "");
        b2.s = false;
        com.lynx.tasm.b.a();
        e();
        if (com.bytedance.ies.abmock.b.a().a(true, "bullet_service_preload", true)) {
            LynxEnv.b().a();
        }
        List a2 = n.a(new com.ss.android.ugc.aweme.bullet.f.c(n.b("gecko_hybrid_prefetch_config", "fe_tiktok_ecommerce_affiliate_prefetch", "resso-tt-lynx_full_song")));
        l.d(a2, "");
        a.b a3 = a.C0726a.a();
        a3.f33158i = 32;
        com.bytedance.ies.d.a.a a4 = a3.a(new com.bytedance.ies.d.a.d(com.bytedance.ies.ugc.appcontext.d.a(), "bullet_prefetch_store")).a(new e.a(a2)).a(new e.b()).a(new e.c()).a(new com.ss.android.ugc.aweme.bullet.f.d());
        ExecutorService executorService = b.i.f4824a;
        l.b(executorService, "");
        e.a.a().a(y.class, new com.bytedance.ies.bullet.service.d.b(a4.a(executorService).a(), "__prefetch"));
        e.a.a().a(com.bytedance.ies.bullet.service.base.web.f.class, new com.bytedance.ies.bullet.service.g.c.b());
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final View a(Context context) {
        l.d(context, "");
        return new com.ss.android.ugc.aweme.bullet.views.b(context, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final String b(String str) {
        l.d(str, "");
        String a2 = com.ss.android.ugc.aweme.crossplatform.f.a.a(str);
        return a2 == null ? str : a2;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void b(Context context) {
        l.d(context, "");
        com.lynx.tasm.i.f56647a = new e(this);
    }

    private static String c(Context context) {
        Object obj;
        String str;
        String str2 = null;
        try {
            Integer a2 = com.bytedance.tux.h.d.a(context, R.attr.f159902m);
            if (a2 != null) {
                str = Integer.toHexString(a2.intValue());
            } else {
                str = null;
            }
            obj = q.m223constructorimpl(str);
        } catch (Throwable th) {
            obj = q.m223constructorimpl(h.r.a(th));
        }
        if (!q.m228isFailureimpl(obj)) {
            str2 = obj;
        }
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final Activity a(String str) {
        com.bytedance.ies.bullet.ui.common.g z;
        l.d(str, "");
        com.bytedance.ies.bullet.c.c.i a2 = g().f31941a.a(str);
        if (a2 != null) {
            if (!(a2 instanceof com.bytedance.ies.bullet.ui.common.c.c)) {
                a2 = null;
            }
            com.bytedance.ies.bullet.ui.common.c.c cVar = (com.bytedance.ies.bullet.ui.common.c.c) a2;
            if (!(cVar == null || (z = cVar.z()) == null)) {
                return z.a();
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void a(Class<?> cls) {
        T t;
        l.d(cls, "");
        Iterator<T> it = g().f31941a.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            t2.c();
        }
    }

    public static final class h implements com.bytedance.ies.bullet.service.base.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletService f69346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f69347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f69348c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f69349d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bullet.api.a f69350e = null;

        static {
            Covode.recordClassIndex(42754);
        }

        @Override // com.bytedance.ies.bullet.service.base.g
        public final Uri a(Uri uri, Bundle bundle) {
            l.d(uri, "");
            l.d(bundle, "");
            return BulletService.a(this.f69349d, uri);
        }

        h(BulletService bulletService, Bundle bundle, String str, Context context) {
            this.f69346a = bulletService;
            this.f69347b = bundle;
            this.f69348c = str;
            this.f69349d = context;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        a(context, str, null, null);
    }

    public static final class f implements ai {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletService f69336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f69337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f69338c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f69339d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bullet.api.a f69340e = null;

        static {
            Covode.recordClassIndex(42752);
        }

        @Override // com.bytedance.ies.bullet.service.base.g
        public final Uri a(Uri uri, Bundle bundle) {
            Uri a2;
            l.d(uri, "");
            l.d(bundle, "");
            Uri a3 = BulletService.a(this.f69339d, uri);
            IBulletService f2 = BulletService.f();
            String uri2 = a3.toString();
            l.b(uri2, "");
            String b2 = f2.b(uri2);
            com.ss.android.ugc.aweme.bullet.api.a aVar = this.f69340e;
            if (aVar != null && (a2 = aVar.a(b2, bundle)) != null) {
                return a2;
            }
            Uri parse = Uri.parse(b2);
            l.b(parse, "");
            return parse;
        }

        f(BulletService bulletService, Bundle bundle, String str, Context context) {
            this.f69336a = bulletService;
            this.f69337b = bundle;
            this.f69338c = str;
            this.f69339d = context;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final boolean b(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        ad adVar = (ad) e.a.a().a(ad.class);
        if (adVar != null) {
            return adVar.a(str, new com.bytedance.ies.bullet.service.base.d.a.a());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements r.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f69319a;

        static {
            Covode.recordClassIndex(42740);
        }

        b(Map map) {
            this.f69319a = map;
        }

        @Override // com.lynx.tasm.behavior.shadow.text.r.a
        public final Typeface a(String str, int i2) {
            String str2;
            if (BulletService.f69312a.contains(str)) {
                str2 = (String) this.f69319a.get("ProximaNova-Bold");
            } else if (BulletService.f69313b.contains(str)) {
                str2 = (String) this.f69319a.get("ProximaNova-Semibold");
            } else {
                if (BulletService.f69314c.contains(str)) {
                    str2 = (String) this.f69319a.get("ProximaNova-Reg");
                }
                return null;
            }
            if (str2 != null) {
                return r.a(com.bytedance.ies.ugc.appcontext.d.a().getAssets(), str2, i2, "font/");
            }
            return null;
        }
    }

    public static final class g implements z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletService f69341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f69342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f69343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f69344d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bullet.api.a f69345e = null;

        static {
            Covode.recordClassIndex(42753);
        }

        @Override // com.bytedance.ies.bullet.service.base.g
        public final Uri a(Uri uri, Bundle bundle) {
            l.d(uri, "");
            l.d(bundle, "");
            Uri a2 = BulletService.a(this.f69344d, uri);
            IBulletService f2 = BulletService.f();
            String uri2 = a2.toString();
            l.b(uri2, "");
            Uri parse = Uri.parse(f2.b(uri2));
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<Boolean> rnFallback = inst.getRnFallback();
            l.b(rnFallback, "");
            Boolean c2 = rnFallback.c();
            l.b(c2, "");
            if (c2.booleanValue()) {
                Uri build = parse.buildUpon().appendQueryParameter("force_h5", "1").build();
                l.b(build, "");
                return build;
            }
            l.b(parse, "");
            return parse;
        }

        g(BulletService bulletService, Bundle bundle, String str, Context context) {
            this.f69341a = bulletService;
            this.f69342b = bundle;
            this.f69343c = str;
            this.f69344d = context;
        }
    }

    public static Uri a(Context context, Uri uri) {
        if (!uri.isHierarchical() || !l.a((Object) uri.getQueryParameter("container_bgcolor"), (Object) "app_theme")) {
            return uri;
        }
        Uri uri2 = uri;
        String c2 = c(context);
        if (c2 != null) {
            ALog.d("BulletService", "replace app_theme with ".concat(String.valueOf(c2)));
            if (uri2.isHierarchical()) {
                Uri.Builder clearQuery = uri2.buildUpon().clearQuery();
                Set<String> queryParameterNames = uri2.getQueryParameterNames();
                l.b(queryParameterNames, "");
                for (T t : queryParameterNames) {
                    if (!l.a((Object) t, (Object) "container_bgcolor")) {
                        clearQuery.appendQueryParameter(t, uri2.getQueryParameter(t));
                    }
                }
                clearQuery.appendQueryParameter("container_bgcolor", c2);
                uri2 = clearQuery.build();
                l.b(uri2, "");
                if (uri2 == null) {
                    return uri;
                }
            }
        }
        return uri2;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void a(Context context, String str, Bundle bundle) {
        l.d(context, "");
        l.d(str, "");
        a(context, str, null, bundle);
    }

    private void b(Context context, String str, String str2, Bundle bundle) {
        Bundle bundle2;
        String str3;
        l.d(context, "");
        l.d(str, "");
        g();
        boolean z = false;
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                str3 = parse.getQueryParameter("use_spark");
            } else {
                str3 = null;
            }
            z = l.a((Object) str3, (Object) "1");
            q.m223constructorimpl(h.z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(h.r.a(th));
        }
        if (z) {
            SmartRouter.buildRoute(context, str).open();
            return;
        }
        ad adVar = (ad) e.a.a().a(ad.class);
        if (adVar != null) {
            Uri parse2 = Uri.parse(str);
            l.b(parse2, "");
            com.bytedance.ies.bullet.service.base.d.a.b bVar = new com.bytedance.ies.bullet.service.base.d.a.b();
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = bundle;
            }
            bVar.a(bundle2);
            ArrayList arrayList = new ArrayList();
            if (str2 != null) {
                arrayList.add(str2);
            }
            bVar.a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new f(this, bundle, str2, context));
            arrayList2.add(new g(this, bundle, str2, context));
            arrayList2.add(new h(this, bundle, str2, context));
            bVar.f32591d = arrayList2;
            bVar.a(new i());
            adVar.a(context, parse2, bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void a(Context context, String str, String str2, Bundle bundle) {
        l.d(context, "");
        l.d(str, "");
        b(context, str, str2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final com.ss.android.ugc.aweme.bullet.views.c a(Context context, String str, String str2, int i2, int i3) {
        l.d(context, "");
        l.d(str, "");
        l.d(context, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.bullet.views.a aVar = new com.ss.android.ugc.aweme.bullet.views.a(context, str, str2, i2);
        aVar.f69556c = i3;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            aVar.a(activity);
        }
        return aVar;
    }
}
