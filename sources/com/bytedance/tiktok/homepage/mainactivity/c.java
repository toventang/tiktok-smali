package com.bytedance.tiktok.homepage.mainactivity;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.commercialize.abtest.a;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.feed.bg;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.i.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.feed.ui.z;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.main.experiment.g;
import com.ss.android.ugc.aweme.main.k;
import com.ss.android.ugc.aweme.utils.ic;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f44143a;

    /* renamed from: b  reason: collision with root package name */
    public i f44144b;

    /* renamed from: c  reason: collision with root package name */
    public HomePageDataViewModel f44145c;

    /* renamed from: d  reason: collision with root package name */
    public AdHomePageDataVM f44146d;

    /* renamed from: e  reason: collision with root package name */
    public IMainAdScene f44147e;

    static {
        Covode.recordClassIndex(27052);
    }

    public final Fragment a() {
        if (TabChangeManager.a.a(this.f44143a) == null) {
            return null;
        }
        return TabChangeManager.a.a(this.f44143a).b();
    }

    public final af b() {
        Fragment a2 = a();
        if (!(a2 instanceof ae)) {
            return null;
        }
        z s = ((ae) a2).l();
        if (s instanceof af) {
            return (af) s;
        }
        return null;
    }

    public final void c() {
        if (g.a() || a.f73623a) {
            a(false);
        }
        Aweme aweme = this.f44145c.f99128k;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (!b.s(aweme) || !b.E(aweme)) {
                if (!b.E(aweme)) {
                    ((k) this.f44143a).allowSwipeLeft(true);
                } else {
                    ((k) this.f44143a).allowSwipeLeft(false);
                }
            } else if (b.F(aweme)) {
                ((k) this.f44143a).allowSwipeLeft(true);
            } else if (!b.r(aweme) && b.z(aweme)) {
                ((k) this.f44143a).allowSwipeLeft(false);
                if (g.a() || a.f73623a) {
                    a(true);
                }
            } else if (b.au(aweme).booleanValue()) {
                ((k) this.f44143a).allowSwipeLeft(false);
                if (g.a() || a.f73623a) {
                    a(true);
                }
            } else if (bs.b(aweme) || bs.c(aweme)) {
                ((k) this.f44143a).allowSwipeLeft(false);
                if (g.a() || a.f73623a) {
                    a(true);
                }
            } else if (awemeRawAd == null || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || b.r(aweme) || b.d(awemeRawAd)) {
                ((k) this.f44143a).allowSwipeLeft(false);
                if (g.a() || a.f73623a) {
                    a(true);
                }
            } else {
                ((k) this.f44143a).allowSwipeLeft(true);
            }
        }
    }

    private void a(boolean z) {
        ((k) this.f44143a).setVpEnableDispatchTouchEventCheck(z);
    }

    public static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    public c(d dVar, i iVar) {
        this.f44143a = dVar;
        this.f44144b = iVar;
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (f2 != null) {
            this.f44147e = f2.a();
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.b bVar = new com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.b();
            bVar.f34655a = dVar;
            bVar.f34651b = new com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a() {
                /* class com.bytedance.tiktok.homepage.mainactivity.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(27053);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void b() {
                    com.ss.android.ugc.trill.d.a.a();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final Fragment c() {
                    return c.this.a();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void d() {
                    c.this.c();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void f() {
                    com.ss.android.ugc.aweme.commercialize.splash.d.f75284b = System.currentTimeMillis();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final long j() {
                    return com.ss.android.ugc.aweme.commerce.a.a.d().f73308h;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final long h() {
                    return com.ss.android.ugc.aweme.commerce.a.a.d().c();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final int i() {
                    return com.ss.android.ugc.aweme.commerce.a.a.d().f73306f + 1;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final long e() {
                    if (c.this.b() != null) {
                        return c.this.b().n.aK.H();
                    }
                    return 0;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void g() {
                    ISplashAdService h2 = SplashAdServiceImpl.h();
                    if (h2 != null) {
                        h2.b(new com.ss.android.ugc.aweme.commercialize.splash.a());
                    } else {
                        com.bytedance.apm.b.a("splash_depend_init_question", 3, (JSONObject) null);
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final boolean a() {
                    if (c.this.f44144b == null || !c.this.f44144b.f44169b) {
                        return false;
                    }
                    return true;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void a(Aweme aweme) {
                    com.ss.android.ugc.d.a.c.a(new e(aweme));
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void a(Aweme aweme, Context context) {
                    aj aC;
                    af b2 = c.this.b();
                    if (b2 != null && (aC = b2.n.aC()) != null && aC.v() != null && aC.v().ad() != null) {
                        com.ss.android.ugc.aweme.commerce.a.a.d().a(aweme, context, aC.v().ad());
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void a(String str, String str2) {
                    if (TextUtils.equals("click", str)) {
                        com.ss.android.ugc.aweme.commercialize.util.g.a(str2);
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void a(boolean z, String str) {
                    if (z) {
                        a.b.f109011a.a(str, false);
                    } else {
                        a.b.f109011a.b(str, false);
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void a(String str, String str2, JSONObject jSONObject) {
                    j.a(str, str2, jSONObject);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.a
                public final void a(Context context, String str, String str2) {
                    if (!TextUtils.equals(com.bytedance.ies.abmock.b.a().a(true, "enable_send_staging_adlog", "v3"), "v1")) {
                        j.a(context, str, str2);
                    }
                }
            };
            this.f44147e.a(bVar);
        }
        IAdSceneService f3 = AdSceneServiceImpl.f();
        if (f3 != null) {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.c cVar = new com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.c();
            cVar.f34651b = new bg();
            f3.c().a(cVar);
        }
        FeedAdServiceImpl.c().b().a(dVar);
    }
}
