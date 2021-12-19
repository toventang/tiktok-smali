package com.ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.d;
import com.bytedance.ies.bullet.ui.common.h;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.module.ad.j;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class AdNewFakeUserProfileDetailFragmentWidget extends AbsAdProfileWidget implements h.b, au, AdFakeUserProfileNavigator.b {

    /* renamed from: j  reason: collision with root package name */
    public List<com.bytedance.ies.uikit.a.b> f75104j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.ies.bullet.ui.common.d f75105k;

    /* renamed from: l  reason: collision with root package name */
    final k f75106l = AdNewFakeUserProfileDetailFragmentWidget$lifecycleEventObserver$1.f75111a;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f75107m = i.a((h.f.a.a) new d(this));
    private final h.h n = i.a((h.f.a.a) new c(this));
    private final h.h o = i.a((h.f.a.a) new e(this));
    private ScrollView p;
    private WebView q;
    private f<com.bytedance.ies.uikit.a.b> r;
    private e s;
    private int t;
    private AwemeRawAd u;

    static {
        Covode.recordClassIndex(46316);
    }

    private final AdFakeUserProfileNavigator g() {
        return (AdFakeUserProfileNavigator) this.n.getValue();
    }

    private final ViewPager h() {
        return (ViewPager) this.o.getValue();
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        l.d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    public final DampScrollableLayout e() {
        return (DampScrollableLayout) this.f75107m.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class c extends h.f.b.m implements h.f.a.a<AdFakeUserProfileNavigator> {
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget this$0;

        static {
            Covode.recordClassIndex(46319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            super(0);
            this.this$0 = adNewFakeUserProfileDetailFragmentWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AdFakeUserProfileNavigator invoke() {
            return this.this$0.a(R.id.azs);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<DampScrollableLayout> {
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget this$0;

        static {
            Covode.recordClassIndex(46320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            super(0);
            this.this$0 = adNewFakeUserProfileDetailFragmentWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DampScrollableLayout invoke() {
            return this.this$0.a(R.id.dti);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<ViewPager> {
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget this$0;

        static {
            Covode.recordClassIndex(46321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            super(0);
            this.this$0 = adNewFakeUserProfileDetailFragmentWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewPager invoke() {
            return this.this$0.a(R.id.b9j);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator.b
    public final void a() {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", this.u).b("refer", "swipe").b();
    }

    public final String f() {
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        ag nativeSiteConfig;
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (nativeSiteConfig = awemeRawAd2.getNativeSiteConfig()) == null) {
            str = null;
        } else {
            str = nativeSiteConfig.getLynxScheme();
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
        if (!(aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null)) {
            buildUpon.appendQueryParameter("lynx_landing_page_data", com.ss.android.ugc.aweme.profile.service.a.f116616a.getAdLynxLandPageUtil().a(awemeRawAd, this.f67007b));
            l.b(awemeRawAd, "");
            buildUpon.appendQueryParameter("lynx_landing_page_title", awemeRawAd.getWebTitle());
        }
        return buildUpon.toString();
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f75110a;

        static {
            Covode.recordClassIndex(46322);
        }

        f(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            this.f75110a = adNewFakeUserProfileDetailFragmentWidget;
        }

        public final void run() {
            String str;
            IResourceLoaderService iResourceLoaderService;
            com.bytedance.ies.bullet.ui.common.d dVar = this.f75110a.f75105k;
            if (dVar != null) {
                AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget = this.f75110a;
                Bundle arguments = dVar.getArguments();
                if (arguments != null && arguments.getBoolean("is_lynx_landing_page", false)) {
                    IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                    if (f2 == null || (str = f2.g("lynx_feed")) == null) {
                        str = "";
                    }
                    if (hl.a(str) && (iResourceLoaderService = (IResourceLoaderService) e.a.a().a(IResourceLoaderService.class)) != null) {
                        GeckoConfig a2 = com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(iResourceLoaderService), str);
                        if (!l.a((Object) a2.getAccessKey(), (Object) str)) {
                            iResourceLoaderService.registerConfig(str, new GeckoConfig(str, a2.getOfflineDir(), a2.getLoaderDepender(), false, false, 24, null));
                        }
                        androidx.lifecycle.i lifecycle = dVar.getLifecycle();
                        iResourceLoaderService.registerCustomLoader(com.ss.android.ugc.aweme.bullet.a.a.class, com.bytedance.ies.bullet.service.base.e.HIGH);
                        lifecycle.b(adNewFakeUserProfileDetailFragmentWidget.f75106l);
                        lifecycle.a(adNewFakeUserProfileDetailFragmentWidget.f75106l);
                    }
                }
                String f3 = this.f75110a.f();
                List a3 = n.a("ad_commerce");
                Bundle arguments2 = dVar.getArguments();
                Context activity = dVar.getActivity();
                if (activity == null) {
                    activity = com.bytedance.ies.ugc.appcontext.d.a();
                }
                dVar.a(com.ss.android.ugc.aweme.bullet.utils.c.a(f3, a3, arguments2, new com.ss.android.ugc.aweme.bullet.module.base.g(activity)), dVar.getArguments(), this.f75110a);
                com.bytedance.ies.bullet.ui.common.b.c b2 = dVar.b();
                if (!(b2 instanceof com.ss.android.ugc.aweme.bullet.module.ad.b)) {
                    b2 = null;
                }
                com.ss.android.ugc.aweme.bullet.module.ad.b bVar = (com.ss.android.ugc.aweme.bullet.module.ad.b) b2;
                if (bVar != null) {
                    bVar.i();
                }
            }
        }
    }

    public static final class a implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f75108a;

        static {
            Covode.recordClassIndex(46317);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            this.f75108a = adNewFakeUserProfileDetailFragmentWidget;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f75108a.b(i2);
        }
    }

    public static final class b implements ScrollableLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakeUserProfileDetailFragmentWidget f75109a;

        static {
            Covode.recordClassIndex(46318);
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final boolean an_() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget) {
            this.f75109a = adNewFakeUserProfileDetailFragmentWidget;
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final void a(float f2, float f3) {
            List<com.bytedance.ies.uikit.a.b> list;
            DampScrollableLayout e2;
            if (this.f75109a.ae_() && (list = this.f75109a.f75104j) != null && !list.isEmpty() && this.f75109a.e() != null && (e2 = this.f75109a.e()) != null) {
                e2.setCanScrollUp(true);
            }
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final void b(int i2, int i3) {
            DampScrollableLayout e2;
            List<com.bytedance.ies.uikit.a.b> list = this.f75109a.f75104j;
            if (list != null && !list.isEmpty() && this.f75109a.e() != null && (e2 = this.f75109a.e()) != null) {
                e2.setCanScrollUp(true);
            }
        }
    }

    public final void b(int i2) {
        DampScrollableLayout e2;
        com.ss.android.ugc.aweme.common.widget.scrollablelayout.a helper;
        DampScrollableLayout e3;
        com.ss.android.ugc.aweme.common.widget.scrollablelayout.a helper2;
        com.ss.android.ugc.aweme.common.widget.scrollablelayout.a helper3;
        com.ss.android.ugc.aweme.common.widget.scrollablelayout.a helper4;
        if (i2 >= 0 && i2 < this.f75104j.size() && e() != null) {
            com.bytedance.ies.uikit.a.b bVar = this.f75104j.get(i2);
            int i3 = this.t;
            if (i2 != i3 && i3 >= 0 && i3 < this.f75104j.size()) {
                this.f75104j.get(this.t).setUserVisibleHint(false);
            }
            this.t = i2;
            if (bVar instanceof e) {
                DampScrollableLayout e4 = e();
                if (!(e4 == null || (helper4 = e4.getHelper()) == null)) {
                    helper4.f76605b = (a.AbstractC1744a) bVar;
                }
            } else if (bVar instanceof com.bytedance.ies.bullet.ui.common.d) {
                DampScrollableLayout e5 = e();
                if (!(e5 == null || (helper3 = e5.getHelper()) == null)) {
                    helper3.f76605b = null;
                }
                ScrollView scrollView = this.p;
                if (!(scrollView == null || (e3 = e()) == null || (helper2 = e3.getHelper()) == null)) {
                    helper2.f76604a = scrollView;
                }
                WebView webView = this.q;
                if (!(webView == null || (e2 = e()) == null || (helper = e2.getHelper()) == null)) {
                    helper.f76604a = webView;
                }
            }
            DampScrollableLayout e6 = e();
            if (e6 != null) {
                e6.setCanScrollUp(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(i iVar) {
        AwemeRawAd awemeRawAd;
        androidx.fragment.app.i childFragmentManager;
        String str;
        String str2;
        String str3;
        String str4;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        androidx.fragment.app.i childFragmentManager2;
        AwemeRawAd awemeRawAd4;
        User author;
        User author2;
        l.d(iVar, "");
        super.a(iVar);
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        Bundle bundle = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.u = awemeRawAd;
        Fragment fragment = ((AbsAdProfileWidget) this).f75064h;
        if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
            l.b(childFragmentManager, "");
            Bundle bundle2 = new Bundle();
            Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme2 == null || (author2 = aweme2.getAuthor()) == null) {
                str = null;
            } else {
                str = author2.getUid();
            }
            bundle2.putString("user_id", str);
            Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme3 == null || (author = aweme3.getAuthor()) == null) {
                str2 = null;
            } else {
                str2 = author.getSecUid();
            }
            bundle2.putString("sec_user_id", str2);
            Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme4 != null) {
                str3 = aweme4.getAid();
            } else {
                str3 = null;
            }
            bundle2.putString("aweme_id", str3);
            Aweme aweme5 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme5 == null || (awemeRawAd4 = aweme5.getAwemeRawAd()) == null) {
                str4 = null;
            } else {
                str4 = awemeRawAd4.getAdvId();
            }
            bundle2.putString("adv_id", str4);
            Aweme aweme6 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme6 != null) {
                awemeRawAd2 = aweme6.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            l.d(bundle2, "");
            e eVar = new e();
            eVar.f75160c = awemeRawAd2;
            eVar.setArguments(bundle2);
            this.s = eVar;
            this.f75104j.add(eVar);
            Aweme aweme7 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme7 != null) {
                awemeRawAd3 = aweme7.getAwemeRawAd();
            } else {
                awemeRawAd3 = null;
            }
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.f(awemeRawAd3) || !com.ss.android.ugc.aweme.commercialize.e.a.b.g(awemeRawAd3)) {
                AdFakeUserProfileNavigator g2 = g();
                if (g2 != null) {
                    g2.setVisibility(8);
                }
                ViewPager h2 = h();
                if (h2 != null) {
                    h2.setVisibility(8);
                }
                androidx.fragment.app.n a2 = childFragmentManager.a();
                l.b(a2, "");
                e eVar2 = this.s;
                if (eVar2 != null) {
                    a2.b(R.id.azu, eVar2).b();
                }
                FrameLayout frameLayout = (FrameLayout) a(R.id.azu);
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                AdFakeUserProfileNavigator g3 = g();
                if (g3 != null) {
                    g3.setVisibility(0);
                }
                ViewPager h3 = h();
                if (h3 != null) {
                    h3.setVisibility(0);
                }
                Fragment fragment2 = ((AbsAdProfileWidget) this).f75064h;
                if (fragment2 != null) {
                    bundle = fragment2.getArguments();
                }
                com.bytedance.ies.bullet.ui.common.d dVar = new com.bytedance.ies.bullet.ui.common.d();
                d.a a3 = new d.a(dVar).a(BulletService.f().a());
                Context context = this.f67007b;
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                a3.a(new BulletActivityWrapper((Activity) context)).a();
                IBulletService f2 = BulletService.f();
                Context context2 = this.f67007b;
                l.b(context2, "");
                dVar.a(f2.a(context2), 17, 0, 0, 0, 0);
                dVar.setArguments(bundle);
                String f3 = f();
                List a4 = n.a("ad_commerce");
                Context context3 = this.f67007b;
                l.b(context3, "");
                dVar.a(com.ss.android.ugc.aweme.bullet.utils.c.a(f3, a4, bundle, new com.ss.android.ugc.aweme.bullet.module.base.g(context3)), bundle, new j());
                this.f75105k = dVar;
                this.f75104j.add(0, dVar);
                Fragment fragment3 = ((AbsAdProfileWidget) this).f75064h;
                if (!(fragment3 == null || (childFragmentManager2 = fragment3.getChildFragmentManager()) == null)) {
                    l.b(childFragmentManager2, "");
                    this.r = new f<>(childFragmentManager2, this.f75104j);
                }
                ViewPager h4 = h();
                if (h4 != null) {
                    h4.setAdapter(this.r);
                }
                AdFakeUserProfileNavigator g4 = g();
                if (g4 != null) {
                    g4.a(h(), this);
                }
                ViewPager h5 = h();
                if (h5 != null) {
                    h5.addOnPageChangeListener(new a(this));
                }
            }
            DampScrollableLayout e2 = e();
            if (e2 != null) {
                e2.setOnScrollListener(new b(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(boolean z) {
        if (z) {
            this.f67009d.postDelayed(new f(this), 500);
            if (this.f75105k == null) {
                b(0);
                e eVar = this.s;
                if (eVar != null) {
                    eVar.setUserVisibleHint(true);
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        com.ss.android.ugc.aweme.common.widget.scrollablelayout.a helper;
        com.ss.android.ugc.aweme.common.widget.scrollablelayout.a helper2;
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
        if (view instanceof SSWebView) {
            DampScrollableLayout e2 = e();
            if (!(e2 == null || (helper2 = e2.getHelper()) == null)) {
                helper2.f76604a = view;
            }
            this.q = (WebView) view;
        } else if (view instanceof LynxView) {
            LynxView lynxView = (LynxView) view;
            int childCount = lynxView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (lynxView.getChildAt(i2) instanceof ScrollView) {
                    View childAt = lynxView.getChildAt(i2);
                    Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.ScrollView");
                    this.p = (ScrollView) childAt;
                    DampScrollableLayout e3 = e();
                    if (!(e3 == null || (helper = e3.getHelper()) == null)) {
                        helper.f76604a = this.p;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
