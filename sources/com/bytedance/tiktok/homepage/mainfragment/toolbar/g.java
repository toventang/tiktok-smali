package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.experiment.ax;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.utils.in;

public final class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public SingleWebView f44248a;

    /* renamed from: b  reason: collision with root package name */
    b f44249b;

    /* renamed from: c  reason: collision with root package name */
    private AnimatedImageView f44250c;

    static {
        Covode.recordClassIndex(27115);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final int c() {
        return 8388629;
    }

    private static SpecialTopicEntry g() {
        try {
            return (SpecialTopicEntry) b.a().a(true, "special_event_entrypoint", SpecialTopicEntry.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static WebViewPreloadEntry h() {
        WebViewPreloadEntry webViewPreloadEntry;
        try {
            webViewPreloadEntry = (WebViewPreloadEntry) b.a().a(true, "webview_preload_entry_ab", WebViewPreloadEntry.class);
            if (webViewPreloadEntry != null) {
                return webViewPreloadEntry;
            }
            try {
                return (WebViewPreloadEntry) SettingsManager.a().a("webview_preload_entry", WebViewPreloadEntry.class);
            } catch (Throwable unused) {
                return webViewPreloadEntry;
            }
        } catch (Throwable unused2) {
            webViewPreloadEntry = null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final boolean a() {
        SpecialTopicEntry g2 = g();
        if (g2 == null || !g2.getEnable() || TextUtils.isEmpty(g2.getLandingRoute()) || TextUtils.isEmpty(g2.getIconUrl())) {
            return false;
        }
        if (!in.d() || g2.getChildViewable()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        b bVar = this.f44249b;
        if (bVar == null || bVar.getActivity() == null || this.f44249b.getActivity().isFinishing()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!this.f44249b.getActivity().isDestroyed()) {
            return true;
        }
        return false;
    }

    public final void f() {
        SpecialTopicEntry g2 = g();
        if (this.f44250c != null && g2 != null && g2.getEnable() && !TextUtils.isEmpty(g2.getLandingRoute()) && !TextUtils.isEmpty(g2.getIconUrl())) {
            if (!in.d() || g2.getChildViewable()) {
                String g3 = this.f44249b.g();
                if (a.k().f()) {
                    r.a("topic_entrance_show", new d().a("enter_from", g3).a(StringSet.type, g2.getEventName()).a("url", g2.getLandingRoute()).f66730a);
                }
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final View b() {
        MethodCollector.i(4723);
        SpecialTopicEntry g2 = g();
        if (g2 == null) {
            MethodCollector.o(4723);
            return null;
        }
        WebViewPreloadEntry h2 = h();
        if (h2 != null && !TextUtils.isEmpty(h2.getUrl())) {
            if (h2.isBackground()) {
                f.g().a(new h(this, h2), i.f44253a);
            } else {
                new f.c().b((w) new SpecialEventIconGenerator$1(this, h2)).a();
            }
        }
        if (ax.b()) {
            AnimatedImageView animatedImageView = (AnimatedImageView) HomePageUIFrameServiceImpl.e().j(this.f44249b.getActivity());
            this.f44250c = animatedImageView;
            if (animatedImageView == null) {
                MethodCollector.o(4723);
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) animatedImageView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f44250c);
            }
        } else {
            this.f44250c = (AnimatedImageView) HomePageUIFrameServiceImpl.e().k(this.f44249b.getActivity());
        }
        e.b(this.f44250c, g2.getIconUrl(), -1, -1);
        String g3 = this.f44249b.g();
        if (a.k().f()) {
            r.a("topic_entrance_show", new d().a("enter_from", g3).a(StringSet.type, g2.getEventName()).a("url", g2.getLandingRoute()).f66730a);
        }
        AnimatedImageView animatedImageView2 = this.f44250c;
        MethodCollector.o(4723);
        return animatedImageView2;
    }

    public g(b bVar) {
        this.f44249b = bVar;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final void a(View view) {
        SpecialTopicEntry g2 = g();
        if (g2 != null) {
            SmartRouter.buildRoute(this.f44249b.getActivity(), g2.getLandingRoute()).open();
            r.a("topic_entrance_click", new d().a("enter_from", this.f44249b.g()).a(StringSet.type, g2.getEventName()).a("url", g2.getLandingRoute()).f66730a);
        }
    }

    public final void a(String str, long j2, boolean z) {
        if (this.f44249b.h() != null && e()) {
            this.f44249b.h().postDelayed(new j(this, z, str), j2);
        }
    }
}
