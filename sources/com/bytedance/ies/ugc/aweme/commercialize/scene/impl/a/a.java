package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.k;
import com.ss.android.ugc.aweme.utils.br;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class a implements IMainAdScene, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: g  reason: collision with root package name */
    public static final C0781a f34661g = new C0781a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a f34662a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.appcompat.app.d f34663b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ies.ugc.aweme.commercialize.splash.topview.b f34664c;

    /* renamed from: d  reason: collision with root package name */
    public View f34665d;

    /* renamed from: e  reason: collision with root package name */
    public HomePageDataViewModel f34666e;

    /* renamed from: f  reason: collision with root package name */
    int f34667f = 4;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.b f34668h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.ies.ugc.aweme.rich.a.c f34669i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.ies.ugc.aweme.rich.a.a.b f34670j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f34671k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f34672l;

    /* renamed from: m  reason: collision with root package name */
    private ScrollSwitchStateManager f34673m;
    private AdHomePageDataVM n;
    private final View.OnTouchListener o = new i(this);
    private final u<Boolean> p = new j(this);

    static {
        Covode.recordClassIndex(20791);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(396, new org.greenrobot.eventbus.g(a.class, "onSplashAdEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.b.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(12, new org.greenrobot.eventbus.g(a.class, "onAwesomeSplashEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onResume() {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a$a  reason: collision with other inner class name */
    public static final class C0781a {
        static {
            Covode.recordClassIndex(20792);
        }

        private C0781a() {
        }

        public /* synthetic */ C0781a(byte b2) {
            this();
        }
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34677a;

        static {
            Covode.recordClassIndex(20797);
        }

        f(a aVar) {
            this.f34677a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            a.a(this.f34677a).b();
            return null;
        }
    }

    public static final class e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34676a;

        static {
            Covode.recordClassIndex(20796);
        }

        public final boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            a.a(this.f34676a).f();
            View view = this.f34676a.f34665d;
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f34676a = aVar;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onDestroy() {
        if (this.f34670j != null) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.b(this.f34670j);
        }
        if (this.f34669i != null) {
            com.bytedance.ies.ugc.aweme.rich.a.b.f35132a.b(this.f34669i);
        }
        EventBus.a().b(this);
        com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34796l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (((com.ss.android.ugc.aweme.main.l) r4).m() != false) goto L_0x0040;
     */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r5 = this;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a r1 = r5.f34662a
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "mainAdSceneCallBack"
            h.f.b.l.a(r0)
        L_0x0009:
            androidx.fragment.app.Fragment r4 = r1.c()
            r3 = 1
            if (r4 != 0) goto L_0x0013
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34790f = r3
            return
        L_0x0013:
            androidx.appcompat.app.d r0 = r5.f34663b
            java.lang.String r2 = "mActivity"
            if (r0 != 0) goto L_0x001c
            h.f.b.l.a(r2)
        L_0x001c:
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.main.k
            if (r0 == 0) goto L_0x0043
            androidx.appcompat.app.d r1 = r5.f34663b
            if (r1 != 0) goto L_0x0027
            h.f.b.l.a(r2)
        L_0x0027:
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService"
            java.util.Objects.requireNonNull(r1, r0)
            com.ss.android.ugc.aweme.main.k r1 = (com.ss.android.ugc.aweme.main.k) r1
            boolean r0 = r1.mainPageOnFeed()
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.main.l
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.main.l r4 = (com.ss.android.ugc.aweme.main.l) r4
            boolean r0 = r4.m()
            if (r0 == 0) goto L_0x0043
        L_0x0040:
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34790f = r3
            return
        L_0x0043:
            r3 = 0
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a.onPause():void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onCreate() {
        ISplashAdService h2;
        boolean z;
        EventBus.a(EventBus.a(), this);
        androidx.appcompat.app.d dVar = this.f34663b;
        if (dVar == null) {
            l.a("mActivity");
        }
        this.f34666e = HomePageDataViewModel.a.a(dVar);
        androidx.appcompat.app.d dVar2 = this.f34663b;
        if (dVar2 == null) {
            l.a("mActivity");
        }
        this.f34673m = ScrollSwitchStateManager.a.a(dVar2);
        androidx.appcompat.app.d dVar3 = this.f34663b;
        if (dVar3 == null) {
            l.a("mActivity");
        }
        AdHomePageDataVM a2 = AdHomePageDataVM.a.a(dVar3);
        this.n = a2;
        if (a2 == null) {
            l.a("adHomePageDataVM");
        }
        t<Boolean> tVar = a2.f34660d;
        androidx.appcompat.app.d dVar4 = this.f34663b;
        if (dVar4 == null) {
            l.a("mActivity");
        }
        tVar.observe(dVar4, this.p);
        if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b || !SplashSettingServiceImpl.g().e()) {
            androidx.appcompat.app.d dVar5 = this.f34663b;
            if (dVar5 == null) {
                l.a("mActivity");
            }
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.a(dVar5.getIntent());
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar = this.f34662a;
            if (aVar == null) {
                l.a("mainAdSceneCallBack");
            }
            aVar.a(false, "method_main_create_begin_to_splash_ad");
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar2 = this.f34662a;
            if (aVar2 == null) {
                l.a("mainAdSceneCallBack");
            }
            aVar2.a(true, "method_splash_try_show_ad_duration");
            AdHomePageDataVM adHomePageDataVM = this.n;
            if (adHomePageDataVM == null) {
                l.a("adHomePageDataVM");
            }
            adHomePageDataVM.f34657a = false;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar3 = this.f34662a;
            if (aVar3 == null) {
                l.a("mainAdSceneCallBack");
            }
            if (!aVar3.a() && ((!com.bytedance.ies.ugc.aweme.commercialize.splash.setting.g.b() || !br.a()) && (h2 = SplashAdServiceImpl.h()) != null)) {
                com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar4 = this.f34662a;
                if (aVar4 == null) {
                    l.a("mainAdSceneCallBack");
                }
                aVar4.g();
                AdHomePageDataVM adHomePageDataVM2 = this.n;
                if (adHomePageDataVM2 == null) {
                    l.a("adHomePageDataVM");
                }
                androidx.appcompat.app.d dVar6 = this.f34663b;
                if (dVar6 == null) {
                    l.a("mActivity");
                }
                if (h2.a((Context) dVar6) || !TextUtils.isEmpty(com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34792h)) {
                    z = true;
                } else {
                    z = false;
                }
                adHomePageDataVM2.f34657a = z;
            }
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar5 = this.f34662a;
            if (aVar5 == null) {
                l.a("mainAdSceneCallBack");
            }
            aVar5.a(false, "method_splash_try_show_ad_duration");
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar6 = this.f34662a;
            if (aVar6 == null) {
                l.a("mainAdSceneCallBack");
            }
            aVar6.a(true, "method_splash_ad_to_main_create_end");
        }
        b.i.b(new f(this), com.ss.android.ugc.aweme.cw.g.c());
        ScrollSwitchStateManager scrollSwitchStateManager = this.f34673m;
        if (scrollSwitchStateManager == null) {
            l.a("stateManager");
        }
        androidx.appcompat.app.d dVar7 = this.f34663b;
        if (dVar7 == null) {
            l.a("mActivity");
        }
        scrollSwitchStateManager.d(dVar7, new g(this));
        this.f34670j = new h(this);
        com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.a(this.f34670j);
        this.f34669i = new b(this);
        com.bytedance.ies.ugc.aweme.rich.a.b.f35132a.a(this.f34669i);
    }

    public static final class b implements com.bytedance.ies.ugc.aweme.rich.a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34674a;

        static {
            Covode.recordClassIndex(20793);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f34674a = aVar;
        }

        @Override // com.bytedance.ies.ugc.aweme.rich.a.c
        public final void a(AwemeRawAd awemeRawAd, a.C0791a aVar) {
            l.d(awemeRawAd, "");
            l.d(aVar, "");
            if (TextUtils.equals(aVar.f35125c, "click")) {
                com.ss.android.ugc.aweme.commercialize.util.h.a(awemeRawAd);
            }
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.b(awemeRawAd)) {
                aVar.a("anchor_id", awemeRawAd.getSplashInfo().anchorId);
            }
            if (com.ss.android.ugc.aweme.commercialize.d.a.f73755b.contains(aVar.f35125c) && com.ss.android.ugc.aweme.commercialize.d.a.f73754a.contains(aVar.f35124b)) {
                long h2 = a.a(this.f34674a).h();
                int i2 = a.a(this.f34674a).i();
                if (h2 < 0) {
                    h2 = a.a(this.f34674a).j();
                }
                if (h2 >= 0) {
                    aVar.a("duration", Long.valueOf(h2));
                    aVar.a("play_order", Integer.valueOf(i2));
                }
            }
        }
    }

    public static final class h implements com.bytedance.ies.ugc.aweme.rich.a.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34679a;

        static {
            Covode.recordClassIndex(20799);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f34679a = aVar;
        }

        @Override // com.bytedance.ies.ugc.aweme.rich.a.a.b
        public final void a(String str, String str2, String str3, JSONObject jSONObject) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(jSONObject, "");
            a.a(this.f34679a).a(str, str2, jSONObject);
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a a2 = a.a(this.f34679a);
            androidx.appcompat.app.d b2 = a.b(this.f34679a);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type android.content.Context");
            a2.a(b2, str, str2);
            a.a(this.f34679a).a(str2, str3);
        }
    }

    public static final /* synthetic */ com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a a(a aVar) {
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar2 = aVar.f34662a;
        if (aVar2 == null) {
            l.a("mainAdSceneCallBack");
        }
        return aVar2;
    }

    public static final /* synthetic */ androidx.appcompat.app.d b(a aVar) {
        androidx.appcompat.app.d dVar = aVar.f34663b;
        if (dVar == null) {
            l.a("mActivity");
        }
        return dVar;
    }

    public static final /* synthetic */ HomePageDataViewModel c(a aVar) {
        HomePageDataViewModel homePageDataViewModel = aVar.f34666e;
        if (homePageDataViewModel == null) {
            l.a("homeViewModel");
        }
        return homePageDataViewModel;
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34678a;

        static {
            Covode.recordClassIndex(20798);
        }

        g(a aVar) {
            this.f34678a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            androidx.appcompat.app.d b2 = a.b(this.f34678a);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
            if (((k) b2).mainPageOnFeed()) {
                com.bytedance.ies.ugc.aweme.commercialize.scene.impl.d.a aVar = com.bytedance.ies.ugc.aweme.commercialize.scene.impl.d.a.f34720a;
                androidx.appcompat.app.d b3 = a.b(this.f34678a);
                Objects.requireNonNull(b3, "null cannot be cast to non-null type android.content.Context");
                aVar.a(b3);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.a
    public final void a(com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.c cVar) {
        l.d(cVar, "");
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.b bVar = (com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.b) cVar;
        this.f34668h = bVar;
        if (bVar == null) {
            l.a("mainAdDepend");
        }
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.b bVar2 = bVar.f34651b;
        Objects.requireNonNull(bVar2, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdSceneCallBack");
        this.f34662a = (com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a) bVar2;
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.b bVar3 = this.f34668h;
        if (bVar3 == null) {
            l.a("mainAdDepend");
        }
        androidx.appcompat.app.d dVar = bVar3.f34655a;
        if (dVar == null) {
            l.b();
        }
        this.f34663b = dVar;
        ISplashAdService h2 = SplashAdServiceImpl.h();
        androidx.appcompat.app.d dVar2 = this.f34663b;
        if (dVar2 == null) {
            l.a("mActivity");
        }
        this.f34664c = h2.a((Activity) dVar2);
    }

    @r
    public final void onSplashAdEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.b.b bVar) {
        if (bVar != null && bVar.f34740a == 0) {
            AdHomePageDataVM adHomePageDataVM = this.n;
            if (adHomePageDataVM == null) {
                l.a("adHomePageDataVM");
            }
            adHomePageDataVM.f34657a = false;
            androidx.appcompat.app.d dVar = this.f34663b;
            if (dVar == null) {
                l.a("mActivity");
            }
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
            ((k) dVar).splashOverShowMandatoryLoginPage();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34675a;

        static {
            Covode.recordClassIndex(20795);
        }

        d(a aVar) {
            this.f34675a = aVar;
        }

        public final void onClick(View view) {
            a aVar = this.f34675a;
            if (aVar.f34667f == 2) {
                HomePageDataViewModel homePageDataViewModel = aVar.f34666e;
                if (homePageDataViewModel == null) {
                    l.a("homeViewModel");
                }
                if (homePageDataViewModel.f99128k != null) {
                    HomePageDataViewModel homePageDataViewModel2 = aVar.f34666e;
                    if (homePageDataViewModel2 == null) {
                        l.a("homeViewModel");
                    }
                    Aweme aweme = homePageDataViewModel2.f99128k;
                    if (aweme == null) {
                        l.b();
                    }
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.G(aweme)) {
                        com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar2 = aVar.f34662a;
                        if (aVar2 == null) {
                            l.a("mainAdSceneCallBack");
                        }
                        new HashMap().put("duration", String.valueOf(aVar2.e()));
                        com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a aVar3 = aVar.f34662a;
                        if (aVar3 == null) {
                            l.a("mainAdSceneCallBack");
                        }
                        aVar3.a(aweme);
                        com.ss.android.ugc.aweme.commercialize.util.b.a(System.currentTimeMillis(), "skip");
                    }
                }
            }
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34681a;

        static {
            Covode.recordClassIndex(20801);
        }

        j(a aVar) {
            this.f34681a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            boolean booleanValue = bool.booleanValue();
            androidx.appcompat.app.d b2 = a.b(this.f34681a);
            if (b2 != null) {
                if (booleanValue) {
                    if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34797m) {
                        com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34797m = true;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) b2.findViewById(16908290);
                if (viewGroup != null) {
                    viewGroup.setAlpha(1.0f);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    b2.getWindow().addFlags(Integer.MIN_VALUE);
                }
                Window window = b2.getWindow();
                l.b(window, "");
                window.getDecorView().setBackgroundResource(R.drawable.q5);
                b2.getWindow().clearFlags(1024);
                ALog.d("awesome_splash", "recoveryTheme");
            }
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.b bVar = this.f34681a.f34664c;
            if (bVar == null) {
                l.a("mSplashLoadMaskHelper");
            }
            bVar.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @org.greenrobot.eventbus.r(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a r12) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.a.a.onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a):void");
    }

    static final class c extends m implements h.f.a.m<ViewGroup, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(20794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(ViewGroup viewGroup, Boolean bool) {
            a(viewGroup, bool.booleanValue());
            return z.f158842a;
        }

        public final void a(ViewGroup viewGroup, boolean z) {
            MethodCollector.i(5676);
            l.d(viewGroup, "");
            ALog.d("AwesomeSplash", "onAwesomeSplashEvent is AwesomeSplashEvent.GONE");
            if (this.this$0.f34665d != null) {
                if (this.this$0.f34665d instanceof com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) {
                    View view = this.this$0.f34665d;
                    if (view != null) {
                        ((com.bytedance.ies.ugc.aweme.commercialize.splash.topview.c) view).a();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.ISplashMask");
                        MethodCollector.o(5676);
                        throw nullPointerException;
                    }
                }
                viewGroup.removeView(this.this$0.f34665d);
                this.this$0.f34665d = null;
                if (z) {
                    androidx.appcompat.app.d b2 = a.b(this.this$0);
                    if (b2 != null) {
                        ((k) b2).splashOverShowMandatoryLoginPage();
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
                        MethodCollector.o(5676);
                        throw nullPointerException2;
                    }
                }
                ALog.d("AwesomeSplash", "onAwesomeSplashEvent AwesomeSplashEvent.GONE && mAwesomeSplashMask != null");
            }
            MethodCollector.o(5676);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onVideoPageChangeEvent(Aweme aweme, boolean z) {
        l.d(aweme, "");
        com.bytedance.ies.ugc.aweme.commercialize.scene.impl.d.a aVar = com.bytedance.ies.ugc.aweme.commercialize.scene.impl.d.a.f34720a;
        androidx.appcompat.app.d dVar = this.f34663b;
        if (dVar == null) {
            l.a("mActivity");
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type android.content.Context");
        aVar.a(aweme, (Context) dVar, z, false);
    }

    static final class i implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34680a;

        static {
            Covode.recordClassIndex(20800);
        }

        i(a aVar) {
            this.f34680a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            float rawX;
            if (a.c(this.f34680a).f99128k == null) {
                return false;
            }
            Aweme aweme = a.c(this.f34680a).f99128k;
            if (aweme == null) {
                l.b();
            }
            l.b(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                long e2 = a.a(this.f34680a).e();
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.G(aweme)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("duration", String.valueOf(e2));
                    HashMap hashMap2 = new HashMap();
                    if (gb.a(a.b(this.f34680a).getBaseContext())) {
                        hashMap2.put("click_x", String.valueOf(((float) com.ss.android.ugc.aweme.base.utils.i.b(a.b(this.f34680a).getBaseContext())) - motionEvent.getRawX()));
                    } else {
                        hashMap2.put("click_x", String.valueOf(motionEvent.getRawX()));
                    }
                    hashMap2.put("click_y", String.valueOf(motionEvent.getRawY()));
                    String b2 = new com.google.gson.f().b(hashMap2);
                    l.b(b2, "");
                    hashMap.put("ad_extra_data", b2);
                    a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "skip", aweme.getAwemeRawAd());
                    if (gb.a(a.b(this.f34680a).getBaseContext())) {
                        rawX = ((float) com.ss.android.ugc.aweme.base.utils.i.b(a.b(this.f34680a).getBaseContext())) - motionEvent.getRawX();
                    } else {
                        rawX = motionEvent.getRawX();
                    }
                    a2.a("click_x", Float.valueOf(rawX)).a("click_y", Float.valueOf(motionEvent.getRawY())).b();
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a a3 = a.a(this.f34680a);
                    Context applicationContext = a.b(this.f34680a).getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    l.b(applicationContext, "");
                    a3.a(aweme, applicationContext);
                }
            }
            return false;
        }
    }
}
