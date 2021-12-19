package com.ss.android.ugc.aweme.bullet.ab;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.lifecycle.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.d;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.module.base.g;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.activity.j;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.profile.experiment.f;
import com.ss.android.ugc.aweme.utils.hl;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.List;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final h f68835a = i.a((h.f.a.a) b.f68838a);

    /* renamed from: b  reason: collision with root package name */
    public static final C1557a f68836b = new C1557a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final k f68837c;

    /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$a  reason: collision with other inner class name */
    public static final class C1557a {
        static {
            Covode.recordClassIndex(42405);
        }

        private C1557a() {
        }

        public /* synthetic */ C1557a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f68838a = new b();

        static {
            Covode.recordClassIndex(42406);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a((byte) 0);
        }
    }

    private a() {
        this.f68837c = BulletFragmentABHelper$lifecycleEventObserver$1.f68834a;
    }

    public static final class c extends com.ss.android.ugc.aweme.crossplatform.platform.webview.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f68839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.uikit.a.b f68840b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SingleWebView f68841c;

        static {
            Covode.recordClassIndex(42407);
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.ab.a$c$a  reason: collision with other inner class name */
        static final class RunnableC1558a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f68842a;

            static {
                Covode.recordClassIndex(42408);
            }

            RunnableC1558a(c cVar) {
                this.f68842a = cVar;
            }

            public final void run() {
                this.f68842a.f68841c.removeOnSingleWebViewStatus(this.f68842a);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e, com.ss.android.ugc.aweme.crossplatform.platform.webview.a
        public final void a(WebView webView, String str) {
            super.a(webView, str);
            if (!(webView == null || str == null || !p.a((CharSequence) str, (CharSequence) this.f68839a, false))) {
                webView.clearHistory();
                MixActivityContainer mixActivityContainer = ((j) this.f68840b).f78546a;
                if (mixActivityContainer != null) {
                    mixActivityContainer.n.d();
                }
            }
            this.f68841c.post(new RunnableC1558a(this));
        }

        c(String str, com.bytedance.ies.uikit.a.b bVar, SingleWebView singleWebView) {
            this.f68839a = str;
            this.f68840b = bVar;
            this.f68841c = singleWebView;
        }
    }

    static {
        Covode.recordClassIndex(42404);
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.profile.experiment.f
    public final boolean d(com.bytedance.ies.uikit.a.b bVar) {
        l.d(bVar, "");
        if (bVar instanceof d) {
            return bVar.ab_();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.experiment.f
    public final boolean c(com.bytedance.ies.uikit.a.b bVar) {
        com.bytedance.ies.bullet.service.f.a.b bVar2;
        com.ss.android.ugc.aweme.bullet.business.b bVar3;
        l.d(bVar, "");
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            dVar.b();
            com.bytedance.ies.bullet.ui.common.b.c b2 = dVar.b();
            com.ss.android.ugc.aweme.bullet.module.ad.j jVar = null;
            if (!(b2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.b)) {
                b2 = null;
            }
            com.ss.android.ugc.aweme.bullet.module.base.a aVar = (com.ss.android.ugc.aweme.bullet.module.base.a) b2;
            if (aVar == null || (bVar3 = aVar.z) == null) {
                bVar2 = null;
            } else {
                bVar2 = bVar3.b();
            }
            if (bVar2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.j) {
                jVar = bVar2;
            }
            com.ss.android.ugc.aweme.bullet.module.ad.j jVar2 = jVar;
            if (jVar2 == null || !jVar2.aE) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.experiment.f
    public final void a(com.bytedance.ies.uikit.a.b bVar) {
        l.d(bVar, "");
        if (bVar instanceof j) {
            MixActivityContainer mixActivityContainer = ((j) bVar).f78546a;
            if (mixActivityContainer != null) {
                mixActivityContainer.u();
            }
        } else if (bVar instanceof d) {
            d dVar = (d) bVar;
            dVar.b();
            com.bytedance.ies.bullet.ui.common.b.c b2 = dVar.b();
            if (!(b2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.b)) {
                b2 = null;
            }
            com.ss.android.ugc.aweme.bullet.module.base.a aVar = (com.ss.android.ugc.aweme.bullet.module.base.a) b2;
            if (aVar != null) {
                SSWebView sSWebView = aVar.f69402i;
                if (sSWebView != null) {
                    sSWebView.onResume();
                }
                PlayableBusiness playableBusiness = (PlayableBusiness) aVar.z.a(PlayableBusiness.class);
                if (playableBusiness != null) {
                    playableBusiness.f69246a = false;
                    playableBusiness.a(false, true);
                }
                PreRenderWebViewBusiness a2 = PreRenderWebViewBusiness.a.a(aVar.z);
                if (a2 != null) {
                    a2.a((String) null);
                }
                Activity activity = aVar.r;
                if (activity != null) {
                    o.b(activity);
                }
            }
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "fragment onShow failed");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.experiment.f
    public final void b(com.bytedance.ies.uikit.a.b bVar) {
        l.d(bVar, "");
        if (bVar instanceof j) {
            MixActivityContainer mixActivityContainer = ((j) bVar).f78546a;
            if (mixActivityContainer != null) {
                mixActivityContainer.v();
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.bullet.module.base.a aVar = null;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            dVar.b();
            com.bytedance.ies.bullet.ui.common.b.c b2 = dVar.b();
            if (b2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.b) {
                aVar = b2;
            }
            com.ss.android.ugc.aweme.bullet.module.base.a aVar2 = aVar;
            if (aVar2 != null) {
                SSWebView sSWebView = aVar2.f69402i;
                if (sSWebView != null) {
                    sSWebView.onPause();
                }
                AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) aVar2.z.a(AdWebStatBusiness.class);
                if (adWebStatBusiness != null) {
                    adWebStatBusiness.a(true);
                }
                AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) aVar2.z.a(AdLynxStatBusiness.class);
                if (adLynxStatBusiness != null) {
                    adLynxStatBusiness.a(true);
                }
                PlayableBusiness playableBusiness = (PlayableBusiness) aVar2.z.a(PlayableBusiness.class);
                if (playableBusiness != null) {
                    playableBusiness.f69246a = true;
                    playableBusiness.a(true, false);
                }
                PreRenderWebViewBusiness a2 = PreRenderWebViewBusiness.a.a(aVar2.z);
                if (a2 != null) {
                    a2.a();
                }
                Activity activity = aVar2.r;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    Window window = activity.getWindow();
                    l.b(window, "");
                    View decorView = window.getDecorView();
                    l.b(decorView, "");
                    decorView.setSystemUiVisibility(1024);
                    return;
                }
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "fragment onHide failed");
    }

    @Override // com.ss.android.ugc.aweme.profile.experiment.f
    public final void b(com.bytedance.ies.uikit.a.b bVar, Runnable runnable) {
        l.d(bVar, "");
        l.d(runnable, "");
        if (bVar instanceof d) {
            com.bytedance.ies.bullet.ui.common.b.c b2 = ((d) bVar).b();
            if (!(b2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.b)) {
                b2 = null;
            }
            com.ss.android.ugc.aweme.bullet.module.ad.b bVar2 = (com.ss.android.ugc.aweme.bullet.module.ad.b) b2;
            if (bVar2 != null) {
                bVar2.f69356b = runnable;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.experiment.f
    public final void a(com.bytedance.ies.uikit.a.b bVar, Runnable runnable) {
        l.d(bVar, "");
        l.d(runnable, "");
        if (bVar instanceof j) {
            ((j) bVar).a(runnable);
            return;
        }
        com.ss.android.ugc.aweme.bullet.module.base.a aVar = null;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            dVar.b();
            com.bytedance.ies.bullet.ui.common.b.c b2 = dVar.b();
            if (b2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.b) {
                aVar = b2;
            }
            com.ss.android.ugc.aweme.bullet.module.base.a aVar2 = aVar;
            if (aVar2 != null) {
                l.d(runnable, "");
                aVar2.q = runnable;
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "fragment setBackListener failed");
    }

    @Override // com.ss.android.ugc.aweme.profile.experiment.f
    public final com.bytedance.ies.uikit.a.b a(Activity activity, Bundle bundle, String str) {
        boolean z;
        if (bundle != null) {
            z = bundle.getBoolean("is_lynx_landing_page", false);
        } else {
            z = false;
        }
        CommerceAdLandpageBulletConfig c2 = com.ss.android.ugc.aweme.commercialize.abtest.c.c();
        if ((c2 == null || !c2.getTotalEnable() || !c2.getAdLandpageFakeEnable()) && !z) {
            return new j();
        }
        if (activity == null) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "createBulletAdFragment failed caz activity is null");
            return new j();
        }
        d dVar = new d();
        new d.a(dVar).a(com.ss.android.ugc.aweme.bullet.b.a().a()).a(new BulletActivityWrapper(activity)).a("ad_commerce").a();
        dVar.a(BulletService.f().a(activity), 17, 0, 0, 0, 0);
        dVar.setArguments(bundle);
        if (str != null) {
            dVar.a(com.ss.android.ugc.aweme.bullet.utils.c.a(str, n.a("ad_commerce"), bundle, new g(activity)), bundle, new com.ss.android.ugc.aweme.bullet.module.ad.j());
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.profile.experiment.f
    public final void a(com.bytedance.ies.uikit.a.b bVar, String str, com.bytedance.ies.uikit.a.b bVar2) {
        IResourceLoaderService iResourceLoaderService;
        String g2;
        com.ss.android.ugc.aweme.crossplatform.view.j jVar;
        SingleWebView a2;
        String str2 = "";
        l.d(bVar, str2);
        l.d(bVar2, str2);
        if (str != null) {
            if (bVar instanceof j) {
                j jVar2 = (j) bVar;
                MixActivityContainer mixActivityContainer = jVar2.f78546a;
                if (!(mixActivityContainer == null || (jVar = (com.ss.android.ugc.aweme.crossplatform.view.j) mixActivityContainer.f78509e.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)) == null || (a2 = jVar.a()) == null)) {
                    a2.addOnSingleWebViewStatus(new c(str, bVar, a2));
                }
                MixActivityContainer mixActivityContainer2 = jVar2.f78546a;
                if (mixActivityContainer2 != null) {
                    mixActivityContainer2.b(str);
                }
            } else if (bVar instanceof d) {
                d dVar = (d) bVar;
                Bundle arguments = dVar.getArguments();
                dVar.getActivity();
                if (arguments != null && arguments.getBoolean("is_lynx_landing_page", false)) {
                    IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                    if (!(f2 == null || (g2 = f2.g("lynx_feed")) == null)) {
                        str2 = g2;
                    }
                    if (hl.a(str2) && (iResourceLoaderService = (IResourceLoaderService) e.a.a().a(IResourceLoaderService.class)) != null) {
                        GeckoConfig a3 = com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(iResourceLoaderService), str2);
                        if (!l.a((Object) a3.getAccessKey(), (Object) str2)) {
                            iResourceLoaderService.registerConfig(str2, new GeckoConfig(str2, a3.getOfflineDir(), a3.getLoaderDepender(), false, false, 24, null));
                        }
                        androidx.lifecycle.i lifecycle = dVar.getLifecycle();
                        iResourceLoaderService.registerCustomLoader(com.ss.android.ugc.aweme.bullet.a.a.class, com.bytedance.ies.bullet.service.base.e.HIGH);
                        lifecycle.b(this.f68837c);
                        lifecycle.a(this.f68837c);
                    }
                }
                List a4 = n.a("ad_commerce");
                Context activity = dVar.getActivity();
                if (activity == null) {
                    activity = com.bytedance.ies.ugc.appcontext.d.a();
                }
                dVar.a(com.ss.android.ugc.aweme.bullet.utils.c.a(str, a4, arguments, new com.ss.android.ugc.aweme.bullet.module.base.g(activity)), arguments, (h.b) bVar);
                com.bytedance.ies.bullet.ui.common.b.c b2 = dVar.b();
                if (!(b2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.b)) {
                    b2 = null;
                }
                com.ss.android.ugc.aweme.bullet.module.ad.b bVar3 = (com.ss.android.ugc.aweme.bullet.module.ad.b) b2;
                if (bVar3 != null) {
                    bVar3.i();
                }
            } else {
                com.ss.android.ugc.aweme.framework.a.a.a(3, null, "fragment loadUrl failed");
            }
        }
    }
}
