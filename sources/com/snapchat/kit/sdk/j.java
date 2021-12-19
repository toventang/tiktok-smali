package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.snap.kit.sdk.model.SnapKitStorySnapView;
import com.snapchat.kit.sdk.core.config.ConfigClient;
import com.snapchat.kit.sdk.core.controller.FirebaseStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.controller.b;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.c.f;
import com.snapchat.kit.sdk.core.metrics.k;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import com.snapchat.kit.sdk.core.metrics.n;
import com.snapchat.kit.sdk.core.metrics.o;
import com.snapchat.kit.sdk.core.metrics.skate.SkateClient;
import com.snapchat.kit.sdk.core.metrics.skate.c;
import com.snapchat.kit.sdk.core.metrics.skate.d;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.FirebaseExtensionClient;
import com.snapchat.kit.sdk.core.networking.FirebaseTokenManager;
import com.snapchat.kit.sdk.core.networking.e;
import com.snapchat.kit.sdk.core.networking.g;
import com.snapchat.kit.sdk.core.networking.h;
import com.snapchat.kit.sdk.core.networking.i;
import com.snapchat.kit.sdk.core.networking.l;
import com.snapchat.kit.sdk.core.networking.m;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import com.snapchat.kit.sdk.core.security.Fingerprint_Factory;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

public final class j implements SnapKitComponent {
    private javax.a.a<Boolean> A;
    private javax.a.a<com.snapchat.kit.sdk.core.metrics.c.a> B;
    private javax.a.a<f> C;
    private javax.a.a<com.snapchat.kit.sdk.core.metrics.a.a> D;
    private javax.a.a<MetricQueue<OpMetric>> E;
    private javax.a.a<m> F;
    private n G;
    private javax.a.a<n> H;
    private javax.a.a<ConfigClient> I;
    private javax.a.a<com.snapchat.kit.sdk.core.config.f> J;
    private javax.a.a<Random> K;
    private javax.a.a<d> L;
    private javax.a.a<SkateClient> M;
    private javax.a.a<com.snapchat.kit.sdk.core.metrics.skate.a> N;
    private javax.a.a<MetricQueue<SkateEvent>> O;
    private javax.a.a<SnapKitInitType> P;
    private javax.a.a<c> Q;
    private javax.a.a<SnapKitAppLifecycleObserver> R;

    /* renamed from: a  reason: collision with root package name */
    private javax.a.a<Context> f57326a;

    /* renamed from: b  reason: collision with root package name */
    private javax.a.a<com.google.gson.f> f57327b;

    /* renamed from: c  reason: collision with root package name */
    private javax.a.a<SharedPreferences> f57328c;

    /* renamed from: d  reason: collision with root package name */
    private javax.a.a<SecureSharedPreferences> f57329d;

    /* renamed from: e  reason: collision with root package name */
    private javax.a.a<l> f57330e;

    /* renamed from: f  reason: collision with root package name */
    private javax.a.a<Handler> f57331f;

    /* renamed from: g  reason: collision with root package name */
    private javax.a.a<b> f57332g;

    /* renamed from: h  reason: collision with root package name */
    private javax.a.a<OkHttpClient> f57333h;

    /* renamed from: i  reason: collision with root package name */
    private javax.a.a<Cache> f57334i;

    /* renamed from: j  reason: collision with root package name */
    private javax.a.a<String> f57335j;

    /* renamed from: k  reason: collision with root package name */
    private javax.a.a<Fingerprint> f57336k;

    /* renamed from: l  reason: collision with root package name */
    private javax.a.a<com.snapchat.kit.sdk.core.networking.c> f57337l;

    /* renamed from: m  reason: collision with root package name */
    private javax.a.a<g> f57338m;
    private javax.a.a<i> n;
    private javax.a.a<com.snapchat.kit.sdk.core.networking.a> o;
    private javax.a.a<FirebaseExtensionClient> p;
    private javax.a.a<l> q;
    private javax.a.a<com.snapchat.kit.sdk.core.metrics.c.i> r;
    private javax.a.a<MetricsClient> s;
    private javax.a.a<com.snapchat.kit.sdk.core.metrics.b.a> t;
    private javax.a.a<com.snapchat.kit.sdk.core.metrics.c.b> u;
    private javax.a.a<ScheduledExecutorService> v;
    private javax.a.a w;
    private javax.a.a<com.snapchat.kit.sdk.core.metrics.b<ServerEvent>> x;
    private javax.a.a<com.snapchat.kit.sdk.core.metrics.c.d> y;
    private javax.a.a<KitPluginType> z;

    static {
        Covode.recordClassIndex(35846);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        n f57339a;

        static {
            Covode.recordClassIndex(35847);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final boolean sdkIsFromReactNativePlugin() {
        return this.G.f57383g;
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final MetricQueue<ServerEvent> analyticsEventQueue() {
        return this.y.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final com.snapchat.kit.sdk.core.networking.a apiFactory() {
        return this.o.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final AuthTokenManager authTokenManager() {
        return (AuthTokenManager) dagger.a.f.a(this.F.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final String clientId() {
        return (String) dagger.a.f.a(this.G.f57378b, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final Context context() {
        return this.f57326a.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final FirebaseStateController firebaseStateController() {
        return (FirebaseStateController) dagger.a.f.a(this.f57332g.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final FirebaseTokenManager firebaseTokenManager() {
        return (FirebaseTokenManager) dagger.a.f.a(this.F.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final com.google.gson.f gson() {
        return this.f57327b.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final KitPluginType kitPluginType() {
        return (KitPluginType) dagger.a.f.a(this.G.f57382f, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final LoginStateController loginStateController() {
        return (LoginStateController) dagger.a.f.a(this.f57332g.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final MetricQueue<OpMetric> operationalMetricsQueue() {
        return this.E.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final String redirectUrl() {
        return (String) dagger.a.f.a(this.G.f57379c, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final SharedPreferences sharedPreferences() {
        return this.f57328c.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final SnapKitAppLifecycleObserver snapKitAppLifecycleObserver() {
        return this.R.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final com.snapchat.kit.sdk.core.metrics.c.a kitEventBaseFactory() {
        return new com.snapchat.kit.sdk.core.metrics.c.a(clientId(), kitPluginType(), sdkIsFromReactNativePlugin());
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final MetricQueue<SnapKitStorySnapView> snapViewEventQueue() {
        com.snapchat.kit.sdk.core.metrics.b bVar = new com.snapchat.kit.sdk.core.metrics.b(this.H.get(), this.v.get(), (com.snapchat.kit.sdk.core.metrics.c) this.w.get(), 10);
        bVar.a();
        return (MetricQueue) dagger.a.f.a(bVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitComponent
    public final void inject(d dVar) {
        dVar.f57317a = this.F.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitComponent
    public final void inject(a aVar) {
        aVar.f57050a = this.F.get();
        aVar.f57051b = loginStateController();
    }

    private j(a aVar) {
        this.f57326a = dagger.a.b.a(new q(aVar.f57339a));
        this.f57327b = dagger.a.b.a(new t(aVar.f57339a));
        this.f57328c = dagger.a.b.a(new aa(aVar.f57339a));
        this.f57329d = dagger.a.b.a(new z(aVar.f57339a, this.f57327b, this.f57328c));
        this.f57330e = dagger.a.b.a(new s(aVar.f57339a, this.f57328c, this.f57327b));
        g gVar = new g(aVar.f57339a);
        this.f57331f = gVar;
        this.f57332g = dagger.a.b.a(new com.snapchat.kit.sdk.core.controller.c(gVar));
        this.f57333h = dagger.a.b.a(new w(aVar.f57339a));
        this.f57334i = dagger.a.b.a(new o(aVar.f57339a));
        this.F = new dagger.a.a();
        this.f57335j = new p(aVar.f57339a);
        dagger.a.c<Fingerprint> create = Fingerprint_Factory.create(this.f57326a);
        this.f57336k = create;
        this.f57337l = new com.snapchat.kit.sdk.core.networking.d(this.F, this.f57332g, this.f57335j, create, this.f57327b);
        this.f57338m = new h(this.F, this.f57332g, this.f57335j, this.f57327b);
        com.snapchat.kit.sdk.core.networking.j jVar = new com.snapchat.kit.sdk.core.networking.j(this.f57335j, this.f57336k);
        this.n = jVar;
        this.o = dagger.a.b.a(new e(this.f57334i, this.f57327b, this.f57337l, this.f57338m, jVar));
        javax.a.a<FirebaseExtensionClient> a2 = dagger.a.b.a(new r(aVar.f57339a, this.o));
        this.p = a2;
        this.q = dagger.a.b.a(new m(a2, this.f57327b));
        this.r = new com.snapchat.kit.sdk.core.metrics.l(this.f57328c);
        this.s = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.h(this.o));
        com.snapchat.kit.sdk.core.metrics.b.b bVar = new com.snapchat.kit.sdk.core.metrics.b.b(this.f57327b);
        this.t = bVar;
        this.u = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.c.c(this.f57328c, this.r, this.s, bVar));
        javax.a.a<ScheduledExecutorService> a3 = dagger.a.b.a(k.f57199a);
        this.v = a3;
        javax.a.a a4 = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.i(this.f57326a, a3));
        this.w = a4;
        com.snapchat.kit.sdk.core.metrics.e eVar = new com.snapchat.kit.sdk.core.metrics.e(this.u, this.v, a4);
        this.x = eVar;
        this.y = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.c.e(this.r, eVar));
        this.z = new u(aVar.f57339a);
        y yVar = new y(aVar.f57339a);
        this.A = yVar;
        com.snapchat.kit.sdk.core.metrics.c.h hVar = new com.snapchat.kit.sdk.core.metrics.c.h(this.f57335j, this.z, yVar);
        this.B = hVar;
        this.C = new com.snapchat.kit.sdk.core.metrics.c.g(hVar);
        javax.a.a<com.snapchat.kit.sdk.core.metrics.a.a> a5 = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.a.b(this.f57328c, this.s, this.t));
        this.D = a5;
        this.E = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.j(a5, this.v, this.w));
        dagger.a.a aVar2 = (dagger.a.a) this.F;
        javax.a.a<T> a6 = dagger.a.b.a(new v(aVar.f57339a, this.f57329d, this.f57330e, this.f57332g, this.f57333h, this.q, this.f57327b, this.y, this.C, this.E));
        this.F = a6;
        dagger.a.f.a(a6);
        if (aVar2.f156650a == null) {
            aVar2.f156650a = a6;
            this.G = aVar.f57339a;
            this.H = dagger.a.b.a(new o(this.f57328c, this.s, this.t, this.f57335j));
            javax.a.a<ConfigClient> a7 = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.f(this.o));
            this.I = a7;
            this.J = dagger.a.b.a(new com.snapchat.kit.sdk.core.config.g(a7, this.f57328c));
            x xVar = new x(aVar.f57339a);
            this.K = xVar;
            this.L = new com.snapchat.kit.sdk.core.metrics.skate.e(this.f57328c, xVar);
            javax.a.a<SkateClient> a8 = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.m(this.o));
            this.M = a8;
            javax.a.a<com.snapchat.kit.sdk.core.metrics.skate.a> a9 = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.skate.b(this.J, this.f57328c, this.r, a8, this.t));
            this.N = a9;
            this.O = dagger.a.b.a(new com.snapchat.kit.sdk.core.metrics.g(a9, this.v, this.w));
            this.P = new f(aVar.f57339a);
            this.Q = dagger.a.b.a(new ab(aVar.f57339a, this.J, this.L, this.O, this.F, this.P));
            this.R = dagger.a.b.a(new ac(aVar.f57339a, this.Q));
            return;
        }
        throw new IllegalStateException();
    }

    /* synthetic */ j(a aVar, byte b2) {
        this(aVar);
    }
}
