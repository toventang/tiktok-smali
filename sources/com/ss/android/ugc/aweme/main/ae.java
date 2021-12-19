package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.analytics.page.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.tiktok.homepage.mainfragment.e;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.f;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.g;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.k;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.l;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.m;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.c.h;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.activity.v;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.feed.aa;
import com.ss.android.ugc.aweme.feed.ab;
import com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FollowTab;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.feed.ui.av;
import com.ss.android.ugc.aweme.feed.ui.z;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.homepage.ui.view.FlippableViewPagerExt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.f.c;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class ae extends com.ss.android.ugc.aweme.base.f.a implements d, com.bytedance.hox.a.d, com.bytedance.tiktok.homepage.mainfragment.toolbar.b, com.ss.android.ugc.aweme.compliance.api.services.consent.a, com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b, l, i, j {
    b A = new b(this);
    protected com.ss.android.ugc.aweme.share.viewmodel.a B;
    public com.ss.android.ugc.aweme.homepage.api.data.a C;
    HomePageDataViewModel D;
    public int E = 0;
    f.a.b.b F = null;
    public com.bytedance.tiktok.homepage.mainfragment.d G;
    boolean H = false;
    af I;
    boolean J = false;
    private k K = new k(this);
    private l L = new l(this);
    private com.ss.android.ugc.aweme.homepage.ui.a M = new com.ss.android.ugc.aweme.homepage.ui.a();
    private ScrollSwitchStateManager N;
    private AdHomePageDataVM O;
    private IAccountService.b P = null;
    private String Q;
    private View[] R;
    private h S;
    private e T;
    private com.bytedance.tiktok.homepage.mainfragment.a U;
    private final u<com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a> V = new af(this);

    /* renamed from: a  reason: collision with root package name */
    ViewGroup f109138a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f109139b;

    /* renamed from: c  reason: collision with root package name */
    public FlippableViewPagerExt f109140c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d f109141d;

    /* renamed from: e  reason: collision with root package name */
    int f109142e = 1;

    /* renamed from: j  reason: collision with root package name */
    View f109143j;

    /* renamed from: k  reason: collision with root package name */
    FrameLayout f109144k;

    /* renamed from: l  reason: collision with root package name */
    View f109145l;

    /* renamed from: m  reason: collision with root package name */
    ViewStub f109146m;
    m n;
    com.bytedance.tiktok.homepage.mainfragment.toolbar.d o = new com.bytedance.tiktok.homepage.mainfragment.toolbar.d(this, this);
    com.bytedance.tiktok.homepage.mainfragment.toolbar.a p = new com.bytedance.tiktok.homepage.mainfragment.toolbar.a(this);
    g q = new g(this);
    f r = new f(this);
    com.bytedance.tiktok.homepage.mainfragment.toolbar.e s = new com.bytedance.tiktok.homepage.mainfragment.toolbar.e(this);
    View t;
    LinearLayout u;
    ImageView v;
    AnimatedImageView w;
    public com.ss.android.ugc.aweme.homepage.ui.b y;
    public boolean z = false;

    static {
        Covode.recordClassIndex(69887);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "HOME";
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return null;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(63, new org.greenrobot.eventbus.g(ae.class, "onDislikeAwemeEvent", com.ss.android.ugc.aweme.feed.i.f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(142, new org.greenrobot.eventbus.g(ae.class, "onNotificationIndicatorEvent", com.ss.android.ugc.aweme.notice.api.bean.m.class, ThreadMode.MAIN, 0, false));
        hashMap.put(280, new org.greenrobot.eventbus.g(ae.class, "onLiveCleanEvent", ab.class, ThreadMode.POSTING, 0, false));
        hashMap.put(345, new org.greenrobot.eventbus.g(ae.class, "onResumeSwipeAfterLoginEvent", com.ss.android.ugc.aweme.feed.i.ab.class, ThreadMode.MAIN, 0, false));
        hashMap.put(346, new org.greenrobot.eventbus.g(ae.class, "onFollowBubbleShowEvent", com.ss.android.ugc.aweme.follow.b.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(347, new org.greenrobot.eventbus.g(ae.class, "onTimeLineTabEvent", c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.b
    public final FrameLayout h() {
        return this.f109139b;
    }

    @Override // com.ss.android.ugc.aweme.main.l
    public final com.ss.android.ugc.aweme.homepage.api.data.a o() {
        return this.C;
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(2223327);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.a
    public final void f() {
        a(true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.a
    public final void j() {
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.main.l
    public final String p() {
        String str = this.Q;
        this.Q = "";
        return str;
    }

    private void t() {
        if (this.y != null) {
            this.q.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final boolean k() {
        com.ss.android.ugc.aweme.share.viewmodel.a aVar = this.B;
        if (aVar == null || !aVar.a("swipe_up_guide")) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final z l() {
        com.ss.android.ugc.aweme.homepage.ui.b bVar = this.y;
        if (bVar == null) {
            return null;
        }
        return (z) bVar.a();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.b
    public final Aweme e() {
        if (getActivity() == null) {
            return null;
        }
        return AwemeChangeCallBack.a(getActivity());
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.b
    public final String g() {
        FlippableViewPagerExt flippableViewPagerExt;
        int b2;
        com.ss.android.ugc.aweme.homepage.ui.b bVar = this.y;
        if (bVar == null || (flippableViewPagerExt = this.f109140c) == null || (b2 = bVar.b(flippableViewPagerExt.getCurrentItemCompat())) == 0 || b2 != 1) {
            return "homepage_hot";
        }
        return "homepage_follow";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.b
    public final SpecialTopicEntry i() {
        try {
            return (SpecialTopicEntry) com.bytedance.ies.abmock.b.a().a(true, "special_event_entrypoint", SpecialTopicEntry.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.main.l
    public final boolean m() {
        FlippableViewPagerExt flippableViewPagerExt;
        com.ss.android.ugc.aweme.homepage.ui.b bVar = this.y;
        if (bVar == null || (flippableViewPagerExt = this.f109140c) == null || bVar.b(flippableViewPagerExt.getCurrentItemCompat()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.main.l
    public final boolean n() {
        FlippableViewPagerExt flippableViewPagerExt;
        com.ss.android.ugc.aweme.homepage.ui.b bVar = this.y;
        if (bVar == null || (flippableViewPagerExt = this.f109140c) == null || bVar.b(flippableViewPagerExt.getCurrentItemCompat()) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.homepage.ui.a aVar = this.M;
        h.f.b.l.d(this, "");
        aVar.f99491b = null;
        com.bytedance.tiktok.homepage.mainfragment.a aVar2 = this.U;
        if (aVar2 != null) {
            EventBus.a().b(aVar2);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        a.C2792a.f108997a.f108996a.getResFakerService().b(this.f109138a);
    }

    @Override // com.ss.android.ugc.aweme.main.l
    public final String q() {
        FollowTab followTab;
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || (followTab = (FollowTab) HomeTabViewModel.a.a(activity).a("Following")) == null) {
            return "";
        }
        return followTab.l();
    }

    public final void r() {
        z s2 = l();
        if (s2 != null && (s2 instanceof af)) {
            s2.y = "press_back";
            s2.s();
            getContext();
            r.a("click_back_fresh", "homepage_hot", 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.P != null) {
            com.ss.android.ugc.aweme.account.b.a();
            com.ss.android.ugc.aweme.account.b.f62864a.b(this.P);
        }
        EventBus.a().b(this);
        GlobalAcViewModel.a(requireActivity());
        com.bytedance.tiktok.homepage.mainfragment.toolbar.a aVar = this.p;
        EventBus.a().b(aVar);
        if (aVar.f44210a != null) {
            aVar.f44211b.a("homepage_hot");
        }
        EventBus.a().b(this.o);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        MethodCollector.i(2973);
        super.onPause();
        g gVar = this.q;
        if (gVar.f44248a != null) {
            v a2 = v.a();
            SingleWebView singleWebView = gVar.f44248a;
            if (!TextUtils.isEmpty("/ies-cdn-alisg/tiktok_activities/covid19") && singleWebView != null) {
                synchronized (a2.f78581e) {
                    try {
                        ViewGroup viewGroup = (ViewGroup) singleWebView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(singleWebView);
                        }
                        Context context = singleWebView.getContext();
                        if (context instanceof MutableContextWrapper) {
                            ((MutableContextWrapper) context).setBaseContext(com.bytedance.ies.ugc.appcontext.d.a());
                        }
                        a2.f78579c.put("/ies-cdn-alisg/tiktok_activities/covid19", singleWebView);
                    } catch (Throwable th) {
                        MethodCollector.o(2973);
                        throw th;
                    }
                }
            }
            gVar.f44248a = null;
        }
        ServiceManager.get().getService(IFeedDebugService.class);
        this.F = t.a(t.b(com.ss.android.ugc.aweme.compliance.api.a.r()), com.bytedance.ies.ugc.appcontext.f.e(), an.f109162a).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new ao(this));
        MethodCollector.o(2973);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        FollowTab followTab;
        a.b.f109011a.a("cold_boot_main_fragment_onresume", false);
        super.onResume();
        if (this.f109141d.b() && (followTab = (FollowTab) HomeTabViewModel.a.a(getActivity()).a("Following")) != null) {
            followTab.k();
        }
        FlippableViewPagerExt flippableViewPagerExt = this.f109140c;
        if (!(flippableViewPagerExt == null || this.f109141d == null)) {
            this.f109141d.a(flippableViewPagerExt.getCurrentItemCompat(), 3);
        }
        a.C2792a.f108997a.f108996a.getResFakerService().a(this.f109138a);
        com.bytedance.tiktok.homepage.mainfragment.toolbar.a aVar = this.p;
        if (!(aVar.f44210a == null || aVar.f44212c == null)) {
            aVar.f44211b.b(aVar.f44212c.g());
        }
        ServiceManager.get().getService(IFeedDebugService.class);
        getActivity();
        this.F = t.b(com.ss.android.ugc.aweme.compliance.api.a.r()).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new am(this));
        a.b.f109011a.b("cold_boot_main_fragment_onresume", false);
    }

    static class b extends be<ae> {
        static {
            Covode.recordClassIndex(69892);
        }

        b(ae aeVar) {
            super(aeVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.main.be
        public final /* bridge */ /* synthetic */ void a(ae aeVar) {
            ae aeVar2 = aeVar;
            if (aeVar2 != null) {
                com.ss.android.b.a.a.a.a(aeVar2.A, 120000);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final void a(int i2) {
        this.f109142e = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z2) {
        super.onHiddenChanged(z2);
    }

    @org.greenrobot.eventbus.r
    public void onFollowBubbleShowEvent(com.ss.android.ugc.aweme.follow.b.a aVar) {
        this.Q = aVar.f96213a;
    }

    /* access modifiers changed from: package-private */
    public final Fragment c(int i2) {
        try {
            Fragment fragment = this.y.f99503c.get(i2);
            h.f.b.l.b(fragment, "");
            return fragment;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        com.bytedance.tiktok.homepage.mainfragment.a aVar = new com.bytedance.tiktok.homepage.mainfragment.a(this);
        this.U = aVar;
        com.ss.android.b.a.a.a.a(new com.bytedance.tiktok.homepage.mainfragment.c(aVar, activity), 3000);
    }

    @org.greenrobot.eventbus.r
    public void onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.i.f fVar) {
        HomePageDataViewModel homePageDataViewModel;
        if (fVar.f93476b == 1 && (homePageDataViewModel = this.D) != null) {
            homePageDataViewModel.a().postValue(true);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onResumeSwipeAfterLoginEvent(com.ss.android.ugc.aweme.feed.i.ab abVar) {
        if (abVar != null && this.f109140c != null && com.ss.android.ugc.aweme.main.experiment.g.b()) {
            boolean a2 = com.ss.android.ugc.aweme.main.experiment.g.a();
            this.f109140c.f99523a = a2;
            if (a2 && !com.ss.android.ugc.aweme.main.experiment.g.d()) {
                com.ss.android.ugc.aweme.main.experiment.g.e();
            }
        }
    }

    private void a(boolean z2) {
        Fragment a2 = this.y.a();
        if (a2 instanceof aa) {
            com.ss.android.ugc.aweme.feed.q.a e2 = ((aa) a2).e();
            if (e2 instanceof av) {
                av avVar = (av) e2;
                if (z2) {
                    avVar.t();
                } else {
                    avVar.v();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final void b(int i2) {
        MainActivity mainActivity;
        if ((getActivity() instanceof MainActivity) && (mainActivity = (MainActivity) getActivity()) != null && !mainActivity.isDestroyed()) {
            if (i2 != this.E) {
                com.ss.android.ugc.aweme.main.h.a.b(getActivity());
            } else {
                com.ss.android.ugc.aweme.main.h.a.a(getActivity());
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.a(EventBus.a(), this);
        this.G = new com.bytedance.tiktok.homepage.mainfragment.d();
        this.S = ProtectionServiceImpl.k().j();
        this.T = new e();
        EventBus.a(EventBus.a(), this.U);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onTimeLineTabEvent(c cVar) {
        if (ab_()) {
            this.y.f99504d = SharePrefCache.inst().getShowTimeLineTab().c().booleanValue();
            this.y.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final boolean a(String str) {
        String str2;
        if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            return false;
        }
        if (this.y.b(this.f109140c.getCurrentItemCompat()) == 0) {
            str2 = "homepage_hot";
        } else {
            str2 = "";
        }
        com.ss.android.ugc.aweme.login.c.a(this, str2, str, (Bundle) null, new com.ss.android.ugc.aweme.base.component.f() {
            /* class com.ss.android.ugc.aweme.main.ae.AnonymousClass3 */

            static {
                Covode.recordClassIndex(69890);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void b() {
                ae.this.C = null;
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void a() {
                boolean z;
                z zVar;
                if (ae.this.f109140c != null && ae.this.ab_()) {
                    int b2 = ae.this.y.b(ae.this.f109140c.getCurrentItemCompat());
                    ae aeVar = ae.this;
                    if (b2 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aeVar.z = z;
                    if (ae.this.z && (zVar = (z) ae.this.y.a()) != null) {
                        zVar.d(false);
                    }
                    int c2 = ae.this.y.c(1);
                    Bundle bundle = new Bundle();
                    bundle.putString(be.f68530b, be.f68533e);
                    Hox.a.a(ae.this.getActivity()).b("HOME", c2, bundle);
                }
                ae.this.C = null;
            }
        });
        return true;
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        com.ss.android.ugc.aweme.homepage.ui.b bVar;
        z zVar;
        String string = bundle.getString(be.f68530b, "");
        String d2 = Hox.a.a(getActivity()).d("HOME");
        String d3 = Hox.a.a(getActivity()).d(d2);
        if (string.equals(be.f68532d) || bundle.getBoolean(d2)) {
            AVExternalServiceImpl.a().publishService().uploadRecoverPopViewSetVisibility(false);
            ((MainAnimViewModel) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(MainAnimViewModel.class)).f109063e.setValue(false);
        } else if (!((!string.equals(be.f68531c) && !bundle.getBoolean(d3)) || (bVar = this.y) == null || (zVar = (z) bVar.a()) == null)) {
            zVar.y();
        }
        this.r.a(false);
    }

    public final void d(int i2) {
        int i3;
        z zVar;
        if (this.f109140c != null && this.y != null) {
            if (com.ss.android.ugc.aweme.compliance.api.a.o().a() && i2 == 0 && m()) {
                i2 = this.f109140c.getCurrentItemCompat();
            }
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 == 1) {
                i3 = 0;
            } else {
                return;
            }
            if (this.y.b(this.f109140c.getCurrentItemCompat()) != i3) {
                com.ss.android.ugc.aweme.homepage.ui.b bVar = this.y;
                if (!(bVar == null || (zVar = (z) bVar.a()) == null)) {
                    zVar.d(true);
                }
                int c2 = this.y.c(i3);
                Bundle bundle = new Bundle();
                bundle.putString(be.f68530b, be.f68533e);
                Hox.a.a(getActivity()).b("HOME", c2, bundle);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onLiveCleanEvent(ab abVar) {
        float f2;
        if (this.R == null) {
            this.R = new View[]{this.f109143j, this.f109139b, this.f109144k, this.v, this.u};
        }
        if (!abVar.f91459a) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        if (!abVar.f91459a) {
            a(new ap(f2), this.R);
            if (f2 == 1.0f) {
                HomePageUIFrameServiceImpl.e().setTitleTabVisibility(true);
                return;
            }
            return;
        }
        a(new ah(f2), this.R);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onNotificationIndicatorEvent(com.ss.android.ugc.aweme.notice.api.bean.m mVar) {
        FollowTab followTab;
        if (ab_()) {
            if ((mVar.b(38) || mVar.b(39) || mVar.b(40) || mVar.b(41)) && this.f109141d.b() && (followTab = (FollowTab) HomeTabViewModel.a.a(getActivity()).a("Following")) != null) {
                followTab.k();
            }
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        String string = bundle.getString(be.f68530b, "");
        String d2 = Hox.a.a(getActivity()).d("HOME");
        String d3 = Hox.a.a(getActivity()).d(d2);
        if (string.equals(be.f68532d) || bundle.getBoolean(d2)) {
            t();
            ((MainAnimViewModel) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(MainAnimViewModel.class)).f109063e.setValue(true);
            if (bundle.getInt(be.f68536h, -1) == 1) {
                AVExternalServiceImpl.a().publishService().uploadRecoverPopViewSetVisibility(true);
            }
        } else if (string.equals(be.f68531c) || bundle.getBoolean(d3)) {
            t();
            ((MainAnimViewModel) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(MainAnimViewModel.class)).f109063e.setValue(true);
        }
        this.r.a(true);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        ITpcConsentService f109150a;

        /* renamed from: b  reason: collision with root package name */
        boolean f109151b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<Activity> f109152c;

        static {
            Covode.recordClassIndex(69891);
        }

        public a(ITpcConsentService iTpcConsentService, Activity activity) {
            this.f109150a = iTpcConsentService;
            this.f109151b = iTpcConsentService.a((com.ss.android.ugc.aweme.compliance.api.services.consent.a) null);
            this.f109152c = new WeakReference<>(activity);
        }
    }

    private static <T extends View> void a(androidx.core.g.a<T> aVar, T[] tArr) {
        for (T t2 : tArr) {
            try {
                aVar.a(t2);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.b
    public final boolean a(boolean z2, String str) {
        z zVar;
        com.ss.android.ugc.aweme.homepage.ui.b bVar = this.y;
        if (bVar == null || this.f109140c == null || (zVar = (z) bVar.a()) == null) {
            return false;
        }
        int b2 = this.y.b(this.f109140c.getCurrentItemCompat());
        if (b2 == 0) {
            com.ss.android.common.c.c.a(getContext(), str, "homepage_hot");
        } else if (b2 == 1) {
            FollowTab followTab = (FollowTab) HomeTabViewModel.a.a(getActivity()).a("Following");
            if (followTab != null) {
                followTab.a(true);
            }
            com.ss.android.common.c.c.a(getContext(), str, "homepage_follow");
        }
        return zVar.a(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0753, code lost:
        if (r1 != false) goto L_0x02f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x06aa  */
    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 1890
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.ae.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2;
        a.b.f109011a.a("cold_boot_main_fragment_create_view", false);
        h.f.b.l.d(this, "");
        h.f.b.l.d(layoutInflater, "");
        if (com.ss.android.ugc.aweme.s.e.c()) {
            a2 = com.a.b.c.a((Activity) getActivity(), (int) R.layout.a3m);
            h.f.b.l.b(a2, "");
        } else {
            a2 = com.a.b.c.a((Activity) getActivity(), (int) R.layout.a3l);
            h.f.b.l.b(a2, "");
        }
        a.b.f109011a.b("cold_boot_main_fragment_create_view", false);
        return a2;
    }
}
