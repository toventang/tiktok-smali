package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.a;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NotificationCountViewManager;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.c;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.api.IZeroRatingService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.cm.a;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.discover.tooltip.d;
import com.ss.android.ugc.aweme.feed.ab;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.i.t;
import com.ss.android.ugc.aweme.feed.i.y;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.feed.ui.at;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.feed.ui.z;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer;
import com.ss.android.ugc.aweme.homepage.story.container.StoryContainer$attachHost$1;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.HwWallpaperMobEventTask;
import com.ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.utils.ez;
import com.ss.android.ugc.aweme.utils.fc;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class MainPageFragment extends com.ss.android.ugc.aweme.base.ui.e implements com.bytedance.hox.a.d, FragmentTabHost.b, com.bytedance.tiktok.homepage.mainpagefragment.notification.a, com.ss.android.ugc.aweme.base.ui.g, com.ss.android.ugc.aweme.im.service.f.a.a, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final a F = new a((byte) 0);
    public com.bytedance.tiktok.homepage.mainpagefragment.notification.c A;
    public com.bytedance.tux.tooltip.a B;
    public com.bytedance.tiktok.homepage.mainpagefragment.a C;
    public com.ss.android.ugc.aweme.feed.ui.seekbar.a.e D;
    public final String E = "page_feed";
    private com.ss.android.ugc.aweme.compliance.api.c.f G;
    private View H;
    private HomePageDataViewModel I;
    private AdHomePageDataVM J;
    private com.ss.android.ugc.aweme.share.viewmodel.a K;
    private final com.ss.android.ugc.aweme.homepage.b L = new com.ss.android.ugc.aweme.homepage.b();
    private boolean M;
    private com.bytedance.tiktok.homepage.mainpagefragment.d N;
    private SocialRecFriendsConditionViewModel O;
    private b P = new b();
    private String Q = "Daily Mix";
    private final u<com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a> R = new r(this);
    private SparseArray S;

    /* renamed from: a  reason: collision with root package name */
    public View[] f109065a = new View[0];

    /* renamed from: b  reason: collision with root package name */
    public View f109066b;

    /* renamed from: c  reason: collision with root package name */
    public MainBottomTabView f109067c;

    /* renamed from: d  reason: collision with root package name */
    public ViewStub f109068d;

    /* renamed from: e  reason: collision with root package name */
    public View f109069e;

    /* renamed from: j  reason: collision with root package name */
    public TabChangeManager f109070j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f109071k;

    /* renamed from: l  reason: collision with root package name */
    public MainPageDataViewModel f109072l;

    /* renamed from: m  reason: collision with root package name */
    public ScrollSwitchStateManager f109073m;
    public DataCenter n;
    public boolean o;
    public View p;
    MainAnimViewModel q;
    public boolean r;
    public com.bytedance.tiktok.homepage.mainpagefragment.dialog.a s = new com.bytedance.tiktok.homepage.mainpagefragment.dialog.a();
    public com.bytedance.tiktok.homepage.mainpagefragment.dialog.c t;
    public FissionPopupWindowHelp u;
    public SafeInfoNoticePopupWindowHelp v;
    public com.bytedance.tiktok.homepage.mainpagefragment.dialog.d w;
    public com.bytedance.tiktok.homepage.mainpagefragment.dialog.e y;
    public com.ss.android.ugc.aweme.im.sdk.a.a.a.b.a z;

    static {
        Covode.recordClassIndex(69846);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public final View a(int i2) {
        if (this.S == null) {
            this.S = new SparseArray();
        }
        View view = (View) this.S.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.S.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public final void e() {
        SparseArray sparseArray = this.S;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(279, new org.greenrobot.eventbus.g(MainPageFragment.class, "onShoutoutsOptOut", com.ss.android.ugc.aweme.profile.b.h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(200, new org.greenrobot.eventbus.g(MainPageFragment.class, "onMusicDspTabChangeEvent", com.ss.android.ugc.aweme.dsp.a.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(232, new org.greenrobot.eventbus.g(MainPageFragment.class, "onComplianceDialogCheckEvent", com.ss.android.ugc.aweme.compliance.api.b.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(280, new org.greenrobot.eventbus.g(MainPageFragment.class, "onLiveCleanEvent", ab.class, ThreadMode.POSTING, 0, false));
        hashMap.put(281, new org.greenrobot.eventbus.g(MainPageFragment.class, "onMaintabVisibleChange", t.class, ThreadMode.POSTING, 0, false));
        hashMap.put(282, new org.greenrobot.eventbus.g(MainPageFragment.class, "onRefreshEndEvent", y.class, ThreadMode.POSTING, 0, false));
        hashMap.put(283, new org.greenrobot.eventbus.g(MainPageFragment.class, "onPermissionPopupEvent", com.ss.android.ugc.aweme.friends.c.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(284, new org.greenrobot.eventbus.g(MainPageFragment.class, "onShowSocialRecFriendsDialogEvent", com.ss.android.ugc.aweme.friends.c.d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(21, new org.greenrobot.eventbus.g(MainPageFragment.class, "onMobEnterFromEvent", com.ss.android.ugc.aweme.feed.i.p.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    final class DownloadFestivalTask implements w {
        static {
            Covode.recordClassIndex(69847);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BOOT_FINISH;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final com.ss.android.ugc.aweme.lego.ab k() {
            return com.ss.android.ugc.aweme.lego.ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DownloadFestivalTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            h.f.b.l.d(context, "");
            com.bytedance.tiktok.homepage.mainpagefragment.a aVar = MainPageFragment.this.C;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    final class InitBubbleGuideTask implements w {
        static {
            Covode.recordClassIndex(69848);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BOOT_FINISH;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final com.ss.android.ugc.aweme.lego.ab k() {
            return com.ss.android.ugc.aweme.lego.ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InitBubbleGuideTask f109076a;

            static {
                Covode.recordClassIndex(69849);
            }

            a(InitBubbleGuideTask initBubbleGuideTask) {
                this.f109076a = initBubbleGuideTask;
            }

            public final void run() {
                boolean z;
                MainPageFragment mainPageFragment = MainPageFragment.this;
                mainPageFragment.n();
                com.bytedance.tiktok.homepage.mainpagefragment.dialog.a aVar = mainPageFragment.s;
                ViewStub viewStub = mainPageFragment.f109068d;
                if (viewStub == null) {
                    h.f.b.l.b();
                }
                boolean z2 = mainPageFragment.o;
                com.bytedance.tux.tooltip.a aVar2 = mainPageFragment.B;
                androidx.fragment.app.e activity = mainPageFragment.getActivity();
                boolean z3 = com.ss.android.ugc.aweme.feed.ui.instagram.a.f94782g;
                h.f.b.l.d(viewStub, "");
                com.ss.android.ugc.aweme.port.a<Boolean> bubbleGuideShown = AVExternalServiceImpl.a().configService().avsettingsConfig().bubbleGuideShown();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                if (g2.isLogin()) {
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g3, "");
                    User curUser = g3.getCurUser();
                    h.f.b.l.b(curUser, "");
                    if (curUser.isShowImageBubble() && !bubbleGuideShown.get().booleanValue()) {
                        aVar.f44296a = new com.ss.android.ugc.aweme.main.b.b(viewStub);
                        if (z2) {
                            aVar.f44297b = true;
                        } else {
                            aVar.a();
                        }
                        bubbleGuideShown.set(true);
                        return;
                    }
                }
                if (!z2) {
                    aVar.f44300e = z3;
                    if (aVar2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (activity != null) {
                        aVar.f44299d = HomePageDataViewModel.a.a(activity);
                        AwemeChangeCallBack.a(activity, activity, new a.C1080a(Keva.getRepo("repo_story_cold_start"), aVar, activity, z, aVar2));
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public InitBubbleGuideTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            h.f.b.l.d(context, "");
            com.ss.android.b.a.a.a.b(new a(this));
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69850);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.a
    public final void c() {
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.t;
        if (cVar != null) {
            cVar.n = false;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.bytedance.ies.dmt.ui.f.a.f33482a = false;
    }

    private Fragment o() {
        TabChangeManager tabChangeManager = this.f109070j;
        if (tabChangeManager == null) {
            return null;
        }
        return tabChangeManager.b();
    }

    private String p() {
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.d dVar = this.w;
        if (dVar == null) {
            h.f.b.l.b();
        }
        return dVar.f44325b;
    }

    @Override // com.ss.android.ugc.aweme.im.service.f.a.a
    public final void k() {
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.t;
        if (cVar == null) {
            h.f.b.l.b();
        }
        cVar.a();
    }

    public final Aweme m() {
        HomePageDataViewModel homePageDataViewModel = this.I;
        if (homePageDataViewModel == null) {
            h.f.b.l.b();
        }
        return homePageDataViewModel.f99128k;
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.a
    public final void b() {
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.t;
        if (cVar != null) {
            if (cVar.f44315j) {
                com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar2 = this.t;
                if (cVar2 == null) {
                    h.f.b.l.b();
                }
                cVar2.a();
            }
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar3 = this.t;
            if (cVar3 == null) {
                h.f.b.l.b();
            }
            cVar3.n = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.f.a.a
    public final boolean h() {
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.t;
        if (cVar == null) {
            h.f.b.l.b();
        }
        if (cVar.f44315j) {
            return false;
        }
        TabChangeManager tabChangeManager = this.f109070j;
        if (tabChangeManager == null) {
            h.f.b.l.b();
        }
        if (!TextUtils.equals("USER", tabChangeManager.f109107d)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.f.a.a
    public final boolean i() {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return true;
        }
        if (!(activity instanceof MainActivity) || !((MainActivity) activity).isDestroyed()) {
            return false;
        }
        return true;
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109077a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f109078b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f109079c;

        static {
            Covode.recordClassIndex(69852);
        }

        c(MainPageFragment mainPageFragment, boolean z, String str) {
            this.f109077a = mainPageFragment;
            this.f109078b = z;
            this.f109079c = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            if (this.f109078b) {
                str = "enter_homepage_hot";
            } else {
                str = "enter_homepage_follow";
            }
            com.ss.android.ugc.aweme.metrics.l lVar = new com.ss.android.ugc.aweme.metrics.l(str);
            lVar.f109583a = "publish";
            com.ss.android.ugc.aweme.metrics.l a2 = lVar.a("publish");
            a2.f109584b = this.f109079c;
            if (this.f109077a.m() != null) {
                a2.f(this.f109077a.m());
            }
            a2.f();
            return null;
        }
    }

    public static final class l implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109088a;

        static {
            Covode.recordClassIndex(69861);
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void a() {
            if (this.f109088a.f109067c != null) {
                MainBottomTabView mainBottomTabView = this.f109088a.f109067c;
                if (mainBottomTabView == null) {
                    h.f.b.l.b();
                }
                mainBottomTabView.setAlpha(0.5f);
            }
            if (this.f109088a.f109073m != null) {
                ScrollSwitchStateManager scrollSwitchStateManager = this.f109088a.f109073m;
                if (scrollSwitchStateManager == null) {
                    h.f.b.l.b();
                }
                scrollSwitchStateManager.a(false);
            }
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void b() {
            if (this.f109088a.f109067c != null) {
                MainBottomTabView mainBottomTabView = this.f109088a.f109067c;
                if (mainBottomTabView == null) {
                    h.f.b.l.b();
                }
                mainBottomTabView.setAlpha(1.0f);
            }
            if (this.f109088a.f109073m != null) {
                ScrollSwitchStateManager scrollSwitchStateManager = this.f109088a.f109073m;
                if (scrollSwitchStateManager == null) {
                    h.f.b.l.b();
                }
                scrollSwitchStateManager.a(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(MainPageFragment mainPageFragment) {
            this.f109088a = mainPageFragment;
        }
    }

    public static final class p implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109093a;

        static {
            Covode.recordClassIndex(69865);
        }

        public final void onGlobalLayout() {
            View view = this.f109093a.f109069e;
            if (view == null) {
                h.f.b.l.b();
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f109093a.r = true;
            FissionPopupWindowHelp fissionPopupWindowHelp = this.f109093a.u;
            if (fissionPopupWindowHelp == null) {
                h.f.b.l.b();
            }
            fissionPopupWindowHelp.f44278k = this.f109093a.r;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(MainPageFragment mainPageFragment) {
            this.f109093a = mainPageFragment;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.f.a.a
    public final void f() {
        TabChangeManager tabChangeManager = this.f109070j;
        if (tabChangeManager == null) {
            h.f.b.l.b();
        }
        Fragment b2 = tabChangeManager.b();
        if (b2 != null && (b2 instanceof ae)) {
            z s2 = ((ae) b2).l();
            if (s2 instanceof af) {
                af afVar = (af) s2;
                if (afVar.n != null) {
                    afVar.n.aW();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.f.a.a
    public final String g() {
        MainActivity mainActivity;
        String enterFrom;
        if (MSAdaptionService.c().c(getContext())) {
            enterFrom = "homepage_hot";
        } else if (!(getActivity() instanceof MainActivity) || (mainActivity = (MainActivity) getActivity()) == null || (enterFrom = mainActivity.getEnterFrom()) == null) {
            return "";
        }
        return enterFrom;
    }

    @Override // com.ss.android.ugc.aweme.im.service.f.a.a
    public final String j() {
        z s2;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f109073m;
        if (scrollSwitchStateManager == null) {
            h.f.b.l.b();
        }
        Fragment b2 = scrollSwitchStateManager.b();
        if (b2 == null || !(b2 instanceof ae) || (s2 = ((ae) b2).l()) == null) {
            return null;
        }
        if (s2 instanceof com.ss.android.ugc.aweme.feed.ui.p) {
            return "homepage_follow";
        }
        if (s2 instanceof af) {
            return "homepage_hot";
        }
        return null;
    }

    static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f109095b;

        static {
            Covode.recordClassIndex(69866);
        }

        q(MainPageFragment mainPageFragment, String str) {
            this.f109094a = mainPageFragment;
            this.f109095b = str;
        }

        public final void run() {
            MainBottomTabView mainBottomTabView = this.f109094a.f109067c;
            if (mainBottomTabView == null) {
                h.f.b.l.b();
            }
            String str = this.f109095b;
            if (str == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(str, "");
            a.b.f109011a.f109002c = false;
            a.b.f109011a.f109006g = false;
            Activity a2 = com.ss.android.ugc.aweme.base.utils.o.a(mainBottomTabView.getContext());
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ScrollSwitchStateManager.a.a((androidx.fragment.app.e) a2).e(str);
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b bVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b) mainBottomTabView.get().a("PUBLISH");
            if (bVar != null) {
                bVar.j();
            }
        }
    }

    static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109097a;

        static {
            Covode.recordClassIndex(69868);
        }

        s(MainPageFragment mainPageFragment) {
            this.f109097a = mainPageFragment;
        }

        public final void run() {
            androidx.lifecycle.t<Boolean> tVar;
            MainPageFragment mainPageFragment = this.f109097a;
            androidx.fragment.app.e activity = mainPageFragment.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            if (Hox.a.a(activity).b("HOME")) {
                Bundle bundle = new Bundle();
                bundle.putString(be.f68530b, be.f68532d);
                androidx.fragment.app.e activity2 = mainPageFragment.getActivity();
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity2, "");
                Hox.a.a(activity2).a("HOME", bundle);
                MainAnimViewModel mainAnimViewModel = mainPageFragment.q;
                if (!(mainAnimViewModel == null || (tVar = mainAnimViewModel.f109063e) == null)) {
                    tVar.setValue(false);
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(be.f68530b, be.f68532d);
            androidx.fragment.app.e activity3 = this.f109097a.getActivity();
            if (activity3 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity3, "");
            Hox.a.a(activity3).b("DISCOVER", bundle2);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.a
    public final void a() {
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.t;
        if (cVar != null) {
            if (cVar.f44306a == null && cVar.o) {
                cVar.d();
            }
            try {
                com.bytedance.ies.uikit.a.b bVar = cVar.f44309d;
                if (bVar == null) {
                    h.f.b.l.a("mFragment");
                }
                if (bVar.ab_()) {
                    ScrollSwitchStateManager scrollSwitchStateManager = cVar.f44312g;
                    if (scrollSwitchStateManager == null) {
                        h.f.b.l.a("mStateManager");
                    }
                    if (!scrollSwitchStateManager.b("page_profile") && cVar.o) {
                        cVar.c();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.f.a.a
    public final void d() {
        z zVar;
        Fragment o2 = o();
        aj ajVar = null;
        if (o2 instanceof ae) {
            zVar = ((ae) o2).l();
        } else {
            zVar = null;
        }
        if (zVar instanceof at) {
            ajVar = ((at) zVar).r();
        }
        Fragment o3 = o();
        if (o3 instanceof ae) {
            z s2 = ((ae) o3).l();
            h.f.b.l.b(s2, "");
            if ((s2 instanceof af) && ajVar != null && ajVar.v() != null) {
                ajVar.v().ab();
            }
        }
    }

    public final void l() {
        androidx.lifecycle.t<Boolean> tVar;
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        if (Hox.a.a(activity).b("HOME")) {
            Bundle bundle = new Bundle();
            bundle.putString(be.f68530b, be.f68532d);
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity2, "");
            Hox.a.a(activity2).a("HOME", bundle);
            MainAnimViewModel mainAnimViewModel = this.q;
            if (mainAnimViewModel != null && (tVar = mainAnimViewModel.f109063e) != null) {
                tVar.setValue(true);
            }
        }
    }

    public final void n() {
        MainBottomTabView mainBottomTabView;
        if (!this.M) {
            this.M = true;
            Keva repo = Keva.getRepo("repo_story_cold_start");
            if (repo.getInt("key_setting", 0) == 5 && repo.getBoolean("key_new_version", false) && repo.getLong("key_tutorial_last_time", 0) == 0 && (mainBottomTabView = this.f109067c) != null && getContext() != null) {
                Context context = mainBottomTabView.getContext();
                h.f.b.l.b(context, "");
                this.B = ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(context).b(mainBottomTabView).a(com.bytedance.tux.tooltip.h.TOP).b((int) com.bytedance.common.utility.n.b(mainBottomTabView.getContext(), 10.0f))).e(R.string.g88).d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Runnable runnable;
        Handler handler;
        super.onDestroyView();
        com.ss.android.ugc.aweme.feed.ui.seekbar.a.e eVar = this.D;
        if (eVar != null) {
            eVar.b();
        }
        this.s.b();
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.t;
        if (cVar == null) {
            h.f.b.l.b();
        }
        EventBus.a().b(cVar);
        if (cVar.f44306a != null) {
            com.ss.android.ugc.aweme.notification.view.f fVar = cVar.f44306a;
            if (fVar == null) {
                h.f.b.l.b();
            }
            if (fVar.isShowing()) {
                com.ss.android.ugc.aweme.notification.view.f fVar2 = cVar.f44306a;
                if (fVar2 == null) {
                    h.f.b.l.b();
                }
                fVar2.a();
            }
        }
        SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp = this.v;
        if (safeInfoNoticePopupWindowHelp == null) {
            h.f.b.l.b();
        }
        EventBus.a().b(safeInfoNoticePopupWindowHelp);
        if (safeInfoNoticePopupWindowHelp.f44288a != null) {
            com.ss.android.ugc.aweme.account.security.d dVar = safeInfoNoticePopupWindowHelp.f44288a;
            if (dVar == null) {
                h.f.b.l.b();
            }
            try {
                dVar.dismiss();
            } catch (Exception unused) {
            }
            safeInfoNoticePopupWindowHelp.f44288a = null;
        }
        com.bytedance.tiktok.homepage.mainpagefragment.notification.c cVar2 = this.A;
        if (cVar2 == null) {
            h.f.b.l.b();
        }
        EventBus.a().b(cVar2);
        if (cVar2.f44371e != null) {
            com.ss.android.ugc.aweme.account.b.a();
            IAccountService iAccountService = com.ss.android.ugc.aweme.account.b.f62864a;
            IAccountService.b bVar = cVar2.f44371e;
            if (bVar == null) {
                h.f.b.l.b();
            }
            iAccountService.b(bVar);
        }
        if (!(cVar2.f44372f == null || (runnable = cVar2.f44374h) == null || (handler = cVar2.f44372f) == null)) {
            handler.removeCallbacks(runnable);
        }
        FissionPopupWindowHelp fissionPopupWindowHelp = this.u;
        if (fissionPopupWindowHelp == null) {
            h.f.b.l.b();
        }
        EventBus.a().b(fissionPopupWindowHelp);
        com.ss.android.ugc.aweme.im.sdk.a.a.a.b.a aVar = this.z;
        if (aVar != null) {
            EventBus.a().b(aVar);
        }
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.d dVar2 = this.w;
        if (dVar2 == null) {
            h.f.b.l.b();
        }
        EventBus.a().b(dVar2);
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.e eVar2 = this.y;
        if (eVar2 == null) {
            h.f.b.l.b();
        }
        eVar2.f44332b.a();
        com.bytedance.tiktok.homepage.mainpagefragment.d dVar3 = this.N;
        if (dVar3 == null) {
            h.f.b.l.b();
        }
        EventBus.a().b(dVar3);
        com.bytedance.tiktok.homepage.mainpagefragment.a aVar2 = this.C;
        if (aVar2 != null) {
            EventBus.a().b(aVar2);
        }
        com.ss.android.ugc.aweme.aq.b.b a2 = com.ss.android.ugc.aweme.aq.b.b.a();
        if (a2.f66972c != null) {
            a2.f66972c = null;
        }
        NotificationCountViewManager.f44360a = null;
        e();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean b2;
        boolean z2;
        boolean a2;
        com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar;
        ay ayVar;
        super.onResume();
        a.b.f109011a.a("cold_boot_mainpage_fragment_onresume", false);
        if (o() != null) {
            Fragment o2 = o();
            if (o2 == null) {
                h.f.b.l.b();
            }
            com.bytedance.ies.dmt.ui.f.a.f33482a = TextUtils.equals(o2.getTag(), "HOME");
        }
        com.bytedance.tiktok.homepage.mainpagefragment.notification.c cVar = this.A;
        if (cVar == null) {
            h.f.b.l.b();
        }
        if (cVar.f44376j) {
            b2 = com.bytedance.tiktok.homepage.mainpagefragment.notification.b.a();
        } else {
            b2 = com.ss.android.ugc.aweme.setting.services.f.f122672a.b();
        }
        SharePrefCache inst = SharePrefCache.inst();
        h.f.b.l.b(inst, "");
        com.ss.android.ugc.aweme.app.aj<Boolean> enableProfileActivityLink = inst.getEnableProfileActivityLink();
        h.f.b.l.b(enableProfileActivityLink, "");
        Boolean c2 = enableProfileActivityLink.c();
        h.f.b.l.b(c2, "");
        if (!c2.booleanValue() || ((ayVar = (ay) com.ss.android.ugc.aweme.base.b.a.c.a(cVar.f44368b.getContext(), ay.class)) != null && TextUtils.equals(ayVar.a(""), "true"))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!b2 && !z2) {
            cVar.f();
        } else if (cVar.f44368b.ab_() && (aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a(cVar.f44367a).b("USER")) != null) {
            aVar.a(false, 0);
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (g2.isLogin()) {
            if (cVar.f44376j) {
                a2 = com.bytedance.tiktok.homepage.mainpagefragment.notification.b.b();
            } else {
                a2 = com.ss.android.ugc.aweme.notification.redpoint.g.a();
            }
            if (!a2 || !cVar.f44375i) {
                cVar.e();
            } else {
                cVar.g();
            }
        }
        cVar.f44376j = false;
        TabChangeManager tabChangeManager = this.f109070j;
        if (tabChangeManager == null) {
            h.f.b.l.b();
        }
        if ((!h.f.b.l.a((Object) "HOME", (Object) tabChangeManager.f109107d)) && com.ss.android.ugc.aweme.main.h.a.a()) {
            com.ss.android.ugc.aweme.main.h.a.b(getActivity());
        }
        com.bytedance.tiktok.homepage.mainpagefragment.d dVar = this.N;
        if (dVar == null) {
            h.f.b.l.b();
        }
        if (!TextUtils.isEmpty(dVar.f44267a)) {
            if (com.ss.android.ugc.aweme.friends.service.a.f97047a.m()) {
                if (com.ss.android.ugc.aweme.friends.service.a.f97047a.e()) {
                    com.ss.android.ugc.aweme.friends.i.b.a();
                } else {
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.a(dVar.f44267a, true);
                }
            }
            dVar.f44267a = "";
        }
        a.b.f109011a.b("cold_boot_mainpage_fragment_onresume", false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109081a;

        static {
            Covode.recordClassIndex(69854);
        }

        e(MainPageFragment mainPageFragment) {
            this.f109081a = mainPageFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f109081a.l();
        }
    }

    static final class n<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f109090a;

        static {
            Covode.recordClassIndex(69863);
        }

        n(float f2) {
            this.f109090a = f2;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            View view = (View) obj;
            h.f.b.l.d(view, "");
            view.setAlpha(this.f109090a);
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109082a;

        static {
            Covode.recordClassIndex(69855);
        }

        f(MainPageFragment mainPageFragment) {
            this.f109082a = mainPageFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar = (com.ss.android.ugc.aweme.arch.widgets.base.b) obj;
            h.f.b.l.d(bVar, "");
            MainPageFragment mainPageFragment = this.f109082a;
            Object a2 = bVar.a();
            h.f.b.l.b(a2, "");
            mainPageFragment.b(((Boolean) a2).booleanValue());
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109087a;

        static {
            Covode.recordClassIndex(69860);
        }

        k(MainPageFragment mainPageFragment) {
            this.f109087a = mainPageFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar = (com.ss.android.ugc.aweme.arch.widgets.base.b) obj;
            h.f.b.l.d(bVar, "");
            com.ss.android.ugc.aweme.feed.ui.seekbar.a.e eVar = this.f109087a.D;
            if (eVar != null) {
                Boolean bool = (Boolean) bVar.a();
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                eVar.b(z);
            }
        }
    }

    static final class m<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f109089a;

        static {
            Covode.recordClassIndex(69862);
        }

        m(float f2) {
            this.f109089a = f2;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            View view = (View) obj;
            h.f.b.l.d(view, "");
            com.bytedance.ies.dmt.ui.f.d.a(view, view.getAlpha(), this.f109089a);
        }
    }

    static final class o<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f109092b;

        static {
            Covode.recordClassIndex(69864);
        }

        o(MainPageFragment mainPageFragment, androidx.fragment.app.e eVar) {
            this.f109091a = mainPageFragment;
            this.f109092b = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            by a2;
            String str = (String) obj;
            if (str != null && !this.f109091a.a(str) && (a2 = HomeTabViewModel.a.a(this.f109092b).a(str)) != null) {
                a2.h();
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onMobEnterFromEvent(com.ss.android.ugc.aweme.feed.i.p pVar) {
        h.f.b.l.d(pVar, "");
        MainPageDataViewModel mainPageDataViewModel = this.f109072l;
        if (mainPageDataViewModel == null) {
            h.f.b.l.b();
        }
        String str = pVar.f93488a;
        h.f.b.l.b(str, "");
        h.f.b.l.d(str, "");
        mainPageDataViewModel.f99135b = str;
    }

    @org.greenrobot.eventbus.r
    public final void onShoutoutsOptOut(com.ss.android.ugc.aweme.profile.b.h hVar) {
        h.f.b.l.d(hVar, "");
        Context context = getContext();
        if (context != null) {
            Intent mainActivityIntent = MainActivity.getMainActivityIntent(getContext());
            mainActivityIntent.putExtra("extra.from.shoutouts.opt.out", true);
            com.ss.android.ugc.tiktok.security.a.a.a(mainActivityIntent, context);
            context.startActivity(mainActivityIntent);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onShowSocialRecFriendsDialogEvent(com.ss.android.ugc.aweme.friends.c.d dVar) {
        h.f.b.l.d(dVar, "");
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.e eVar = this.y;
        if (eVar == null) {
            h.f.b.l.b();
        }
        int i2 = dVar.f96829a;
        h.p<Boolean, Boolean> pVar = dVar.f96830b;
        h.f.b.l.d(pVar, "");
        eVar.a(i2, pVar);
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109085a;

        static {
            Covode.recordClassIndex(69858);
        }

        i(MainPageFragment mainPageFragment) {
            this.f109085a = mainPageFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar = (com.ss.android.ugc.aweme.arch.widgets.base.b) obj;
            h.f.b.l.d(bVar, "");
            MainPageFragment mainPageFragment = this.f109085a;
            String str = (String) bVar.a();
            if (str != null) {
                MainBottomTabView mainBottomTabView = mainPageFragment.f109067c;
                if (mainBottomTabView == null) {
                    h.f.b.l.b();
                }
                mainBottomTabView.post(new q(mainPageFragment, str));
            }
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109086a;

        static {
            Covode.recordClassIndex(69859);
        }

        j(MainPageFragment mainPageFragment) {
            this.f109086a = mainPageFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar = (com.ss.android.ugc.aweme.arch.widgets.base.b) obj;
            h.f.b.l.d(bVar, "");
            MainBottomTabView mainBottomTabView = this.f109086a.f109067c;
            if (mainBottomTabView != null) {
                com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) mainBottomTabView.get().b((String) bVar.a());
                if (aVar != null) {
                    aVar.performClick();
                }
            }
        }
    }

    public final void b(boolean z2) {
        int i2;
        Resources resources;
        String.valueOf(z2);
        if (!z2) {
            i2 = R.color.lr;
        } else {
            i2 = R.color.b2;
        }
        Context context = getContext();
        if (!(context == null || (resources = context.getResources()) == null)) {
            int color = resources.getColor(i2);
            View view = this.f109066b;
            if (view != null) {
                view.setBackgroundColor(color);
            }
        }
        MainActivity mainActivity = (MainActivity) getActivity();
        if (mainActivity != null) {
            mainActivity.refreshSlideSwitchCanScrollRight();
        }
    }

    @org.greenrobot.eventbus.r
    public final void onComplianceDialogCheckEvent(com.ss.android.ugc.aweme.compliance.api.b.a aVar) {
        if (aVar != null) {
            if (aVar.f76636a) {
                com.bytedance.tiktok.homepage.mainpagefragment.dialog.d dVar = this.w;
                if (dVar == null) {
                    h.f.b.l.b();
                }
                dVar.a();
            }
            com.ss.android.ugc.aweme.feed.ui.instagram.a.f94782g = true;
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ui.a.a());
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.a aVar2 = this.s;
            if (aVar2 != null) {
                aVar2.f44300e = true;
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onMaintabVisibleChange(t tVar) {
        h.f.b.l.d(tVar, "");
        int i2 = tVar.f93492a;
        MainBottomTabView mainBottomTabView = this.f109067c;
        if (mainBottomTabView == null) {
            h.f.b.l.b();
        }
        if (i2 != mainBottomTabView.getVisibility()) {
            View view = this.f109066b;
            if (view == null) {
                h.f.b.l.b();
            }
            view.setVisibility(i2);
            MainBottomTabView mainBottomTabView2 = this.f109067c;
            if (mainBottomTabView2 == null) {
                h.f.b.l.b();
            }
            mainBottomTabView2.setVisibility(i2);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onPermissionPopupEvent(com.ss.android.ugc.aweme.friends.c.a aVar) {
        Context context;
        h.f.b.l.d(aVar, "");
        if (h.f.b.l.a((Object) aVar.f96828b, (Object) "publish") && (context = getContext()) != null) {
            com.ss.android.ugc.aweme.friends.service.a aVar2 = com.ss.android.ugc.aweme.friends.service.a.f97047a;
            String str = aVar.f96828b;
            h.f.b.l.b(context, "");
            aVar2.a(3, "homepage_follow", str, context);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onRefreshEndEvent(y yVar) {
        String str;
        h.f.b.l.d(yVar, "");
        if (ab_()) {
            if (!TextUtils.isEmpty(yVar.f93507a)) {
                str = yVar.f93507a;
            } else {
                str = "HOME";
            }
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            HomeTabViewModel a2 = HomeTabViewModel.a.a((androidx.fragment.app.e) context);
            if (str == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) a2.b(str);
            if (aVar != null && aVar.f99548a) {
                aVar.f99548a = false;
                aVar.j();
            }
        }
    }

    static final class b extends Handler {
        static {
            Covode.recordClassIndex(69851);
        }

        public final void handleMessage(Message message) {
            h.f.b.l.d(message, "");
            if (message.what == 1) {
                removeMessages(1);
                if (!com.bytedance.ies.dmt.ui.f.a.f33482a) {
                    sendMessage(Message.obtain(message));
                } else if (fe.d(com.bytedance.ies.ugc.appcontext.d.a())) {
                    IZeroRatingService f2 = ZeroRatingServiceImpl.f();
                    h.f.b.l.b(f2, "");
                    if (f2.b() && com.bytedance.ies.abmock.b.a().a("enable_zero_rating_toast", ClientExpManager.enable_zero_rating_toast()) == 1) {
                        IZeroRatingService f3 = ZeroRatingServiceImpl.f();
                        h.f.b.l.b(f3, "");
                        f3.c().a();
                        new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.c17).a();
                    }
                }
            }
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109080a;

        static {
            Covode.recordClassIndex(69853);
        }

        d(MainPageFragment mainPageFragment) {
            this.f109080a = mainPageFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar = (com.ss.android.ugc.aweme.arch.widgets.base.b) obj;
            h.f.b.l.d(bVar, "");
            Boolean bool = (Boolean) bVar.a();
            if (this.f109080a.z != null) {
                h.f.b.l.b(bool, "");
                if (bool.booleanValue()) {
                    com.ss.android.ugc.aweme.im.sdk.a.a.a.b.a aVar = this.f109080a.z;
                    if (aVar == null) {
                        h.f.b.l.b();
                    }
                    aVar.f100091a.f();
                    aVar.f100091a.a(true);
                    return;
                }
                com.ss.android.ugc.aweme.im.sdk.a.a.a.b.a aVar2 = this.f109080a.z;
                if (aVar2 == null) {
                    h.f.b.l.b();
                }
                aVar2.f100091a.a(false);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onLiveCleanEvent(ab abVar) {
        float f2;
        h.f.b.l.d(abVar, "");
        if (this.f109065a == null) {
            this.f109065a = new View[]{this.f109069e, this.f109067c};
        }
        if (!abVar.f91459a) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        if (!abVar.f91459a) {
            a(new m(f2), this.f109065a);
            if (f2 == 1.0f) {
                HomePageUIFrameServiceImpl.e().setTitleTabVisibility(true);
                return;
            }
            return;
        }
        a(new n(f2), this.f109065a);
    }

    @org.greenrobot.eventbus.r
    public final void onMusicDspTabChangeEvent(com.ss.android.ugc.aweme.dsp.a.a aVar) {
        androidx.fragment.app.e activity;
        h.f.b.l.d(aVar, "");
        if (aVar.f83237a && !h.f.b.l.a((Object) aVar.f83238b, (Object) aVar.f83239c)) {
            String str = aVar.f83239c;
            this.Q = str;
            MainBottomTabView mainBottomTabView = this.f109067c;
            if (mainBottomTabView != null) {
                mainBottomTabView.setTopTabName(str);
            }
            androidx.fragment.app.e activity2 = getActivity();
            String str2 = this.Q;
            if (TextUtils.equals(str2, "LIBRARY")) {
                com.ss.android.ugc.aweme.base.utils.o.a((Activity) activity2);
                com.ss.android.ugc.aweme.base.utils.o.b(activity2);
            } else {
                com.ss.android.ugc.aweme.base.utils.o.a((Activity) activity2);
                ez.a(activity2);
            }
            com.ss.android.ugc.aweme.t.b.f138537a = str2;
            if (h.f.b.l.a((Object) aVar.f83239c, (Object) "LIBRARY")) {
                androidx.fragment.app.e activity3 = getActivity();
                if (activity3 != null) {
                    fc.b(activity3);
                }
            } else if (h.f.b.l.a((Object) aVar.f83239c, (Object) "Daily Mix") && (activity = getActivity()) != null) {
                fc.a(activity);
            }
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109083a;

        static {
            Covode.recordClassIndex(69856);
        }

        g(MainPageFragment mainPageFragment) {
            this.f109083a = mainPageFragment;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.aweme.main.ae */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
            if ((r0 instanceof com.ss.android.ugc.aweme.feed.ui.af) == false) goto L_0x006a;
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 169
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.g.onChanged(java.lang.Object):void");
        }
    }

    static final class r<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109096a;

        static {
            Covode.recordClassIndex(69867);
        }

        r(MainPageFragment mainPageFragment) {
            this.f109096a = mainPageFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            boolean z2;
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar = (com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a) obj;
            MainPageFragment mainPageFragment = this.f109096a;
            if (aVar.f34874a != 4) {
                z = true;
            } else {
                z = false;
            }
            mainPageFragment.o = z;
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.a aVar2 = this.f109096a.s;
            if (this.f109096a.o) {
                aVar2.b();
            } else if (aVar2.f44297b) {
                aVar2.f44297b = false;
                aVar2.a();
            }
            if (this.f109096a.o) {
                com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.f109096a.t;
                if (cVar == null) {
                    h.f.b.l.b();
                }
                cVar.a();
                com.bytedance.tux.tooltip.a aVar3 = this.f109096a.B;
                if (aVar3 != null && aVar3.isShowing()) {
                    aVar3.dismiss();
                }
            }
            this.f109096a.n();
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar2 = this.f109096a.t;
            if (cVar2 == null) {
                h.f.b.l.b();
            }
            cVar2.f44317l = this.f109096a.o;
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar3 = this.f109096a.t;
            if (cVar3 == null) {
                h.f.b.l.b();
            }
            if (this.f109096a.B == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            cVar3.f44318m = !z2;
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.a(aVar.f34874a, this.f109096a.f109066b, this.f109096a.f109067c);
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        androidx.lifecycle.t<String> tVar;
        h.f.b.l.d(bundle, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        String d2 = Hox.a.a(activity).d(this.E);
        if (h.f.b.l.a((Object) bundle.getString(be.f68530b, ""), (Object) be.f68531c) || bundle.getBoolean(d2)) {
            TabAlphaController.a().a(true);
            androidx.fragment.app.e requireActivity = requireActivity();
            h.f.b.l.b(requireActivity, "");
            com.ss.android.ugc.aweme.profile.ae aeVar = com.ss.android.ugc.aweme.profile.ae.f115954a;
            androidx.fragment.app.e requireActivity2 = requireActivity();
            h.f.b.l.b(requireActivity2, "");
            aeVar.preloadProfile(requireActivity2, this.E);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.share.model.d(true));
            if (TextUtils.isEmpty(a.C1605a.f71196d)) {
                a.C1605a.f71193a = this.E;
            }
            HomePageDataViewModel homePageDataViewModel = this.I;
            if (homePageDataViewModel != null && !homePageDataViewModel.f99129l) {
                HomePageDataViewModel homePageDataViewModel2 = this.I;
                Aweme aweme = null;
                if (!(homePageDataViewModel2 == null || homePageDataViewModel2.f99128k == null || !(requireActivity instanceof MainActivity))) {
                    MainActivity mainActivity = (MainActivity) requireActivity;
                    HomePageDataViewModel homePageDataViewModel3 = this.I;
                    if (homePageDataViewModel3 != null) {
                        aweme = homePageDataViewModel3.f99128k;
                    }
                    mainActivity.flingBackToFeedChange(aweme, getContext());
                }
            }
            MainAnimViewModel mainAnimViewModel = this.q;
            if (!(mainAnimViewModel == null || (tVar = mainAnimViewModel.f109062d) == null)) {
                tVar.setValue(this.E);
            }
            com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f109084a;

        static {
            Covode.recordClassIndex(69857);
        }

        h(MainPageFragment mainPageFragment) {
            this.f109084a = mainPageFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar = (com.ss.android.ugc.aweme.arch.widgets.base.b) obj;
            String str = "";
            h.f.b.l.d(bVar, str);
            MainPageFragment mainPageFragment = this.f109084a;
            Object a2 = bVar.a();
            h.f.b.l.b(a2, str);
            Intent intent = (Intent) a2;
            h.f.b.l.d(intent, str);
            try {
                if (intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putString(be.f68530b, be.f68532d);
                    androidx.fragment.app.e activity = mainPageFragment.getActivity();
                    if (activity == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity, str);
                    Hox.a.a(activity).b("HOME", bundle);
                    mainPageFragment.b(false);
                    TabChangeManager tabChangeManager = mainPageFragment.f109070j;
                    if (tabChangeManager == null) {
                        h.f.b.l.b();
                    }
                    Fragment b2 = tabChangeManager.b();
                    if (b2 != null) {
                        ae aeVar = (ae) b2;
                        if (aeVar != null) {
                            aeVar.d(1);
                        }
                        ScrollSwitchStateManager scrollSwitchStateManager = mainPageFragment.f109073m;
                        if (scrollSwitchStateManager == null) {
                            h.f.b.l.b();
                        }
                        scrollSwitchStateManager.a(true);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainFragment");
                } else if (intent.getBooleanExtra("extra.from.shoutouts.opt.out", false)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(be.f68530b, be.f68532d);
                    bundle2.putBoolean("extra.from.shoutouts.opt.out", true);
                    androidx.fragment.app.e requireActivity = mainPageFragment.requireActivity();
                    h.f.b.l.b(requireActivity, str);
                    Hox.a.a(requireActivity).b("USER", bundle2);
                } else {
                    String a3 = MainPageFragment.a(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                    if (a3 == null) {
                        a3 = str;
                    }
                    h.f.b.l.b(a3, str);
                    if (TextUtils.isEmpty(a3)) {
                        return;
                    }
                    if (h.f.b.l.a((Object) "USER", (Object) a3)) {
                        Context context = mainPageFragment.getContext();
                        if (context != null) {
                            View b3 = HomeTabViewModel.a.a((androidx.fragment.app.e) context).b("USER");
                            if (b3 != null) {
                                b3.performClick();
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(be.f68530b, be.f68532d);
                    androidx.fragment.app.e activity2 = mainPageFragment.getActivity();
                    if (activity2 == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity2, str);
                    Hox.a.a(activity2).b(a3, bundle3);
                    if (h.f.b.l.a((Object) "HOME", (Object) a3)) {
                        int intExtra = intent.getIntExtra("tab", 1);
                        TabChangeManager tabChangeManager2 = mainPageFragment.f109070j;
                        if (tabChangeManager2 == null) {
                            h.f.b.l.b();
                        }
                        Fragment b4 = tabChangeManager2.b();
                        if (b4 != null) {
                            ae aeVar2 = (ae) b4;
                            if (aeVar2 != null) {
                                aeVar2.d(intExtra);
                            }
                            MainBottomTabView mainBottomTabView = mainPageFragment.f109067c;
                            if (mainBottomTabView == null) {
                                h.f.b.l.b();
                            }
                            if (mainBottomTabView.getVisibility() == 8) {
                                View view = mainPageFragment.f109066b;
                                if (view == null) {
                                    h.f.b.l.b();
                                }
                                view.setVisibility(0);
                                MainBottomTabView mainBottomTabView2 = mainPageFragment.f109067c;
                                if (mainBottomTabView2 == null) {
                                    h.f.b.l.b();
                                }
                                mainBottomTabView2.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainFragment");
                    }
                    if (h.f.b.l.a((Object) "NOTIFICATION", (Object) a3)) {
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        h.f.b.l.b(g2, str);
                        if (!g2.isLogin()) {
                            String g3 = mainPageFragment.g();
                            if (g3 != null) {
                                str = g3;
                            }
                            com.ss.android.ugc.aweme.login.c.a(mainPageFragment, str, "click_message");
                            return;
                        }
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.bean.n());
                    }
                    com.bytedance.tiktok.homepage.mainpagefragment.notification.c cVar = mainPageFragment.A;
                    if (cVar == null) {
                        h.f.b.l.b();
                    }
                    cVar.e();
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2.getMessage());
            }
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String c2;
        String str4;
        HomePageDataViewModel homePageDataViewModel;
        Aweme aweme;
        h.f.b.l.d(bundle, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        String d2 = Hox.a.a(activity).d(this.E);
        if (h.f.b.l.a((Object) bundle.getString(be.f68530b, ""), (Object) be.f68531c) || bundle.getBoolean(d2)) {
            TabAlphaController.a().a(false);
            com.ss.android.ugc.aweme.logger.c.f109013a = false;
            a.b.f109011a.f109002c = false;
            a.b.f109011a.f109006g = false;
            v.O().B();
            com.ss.android.ugc.aweme.video.k.a().b();
            androidx.fragment.app.e requireActivity = requireActivity();
            h.f.b.l.b(requireActivity, "");
            HomePageDataViewModel homePageDataViewModel2 = this.I;
            String str5 = null;
            if (!(homePageDataViewModel2 == null || homePageDataViewModel2.f99129l || (homePageDataViewModel = this.I) == null || homePageDataViewModel.f99128k == null || !(requireActivity instanceof MainActivity))) {
                MainActivity mainActivity = (MainActivity) requireActivity;
                HomePageDataViewModel homePageDataViewModel3 = this.I;
                if (homePageDataViewModel3 != null) {
                    aweme = homePageDataViewModel3.f99128k;
                } else {
                    aweme = null;
                }
                mainActivity.flingToIndexChange(aweme, getContext());
            }
            Aweme m2 = m();
            if (m2 != null) {
                com.ss.android.ugc.aweme.common.s sVar = new com.ss.android.ugc.aweme.common.s();
                HomePageDataViewModel homePageDataViewModel4 = this.I;
                if (homePageDataViewModel4 != null) {
                    str = homePageDataViewModel4.c();
                } else {
                    str = null;
                }
                sVar.a("enter_from", str);
                HomePageDataViewModel homePageDataViewModel5 = this.I;
                if (homePageDataViewModel5 != null && !homePageDataViewModel5.f99129l) {
                    getContext();
                    com.ss.android.ugc.aweme.common.r.a("slide_left", "left", p(), m2.getAid(), sVar.a());
                    HomePageDataViewModel homePageDataViewModel6 = this.I;
                    if (!(homePageDataViewModel6 == null || (c2 = homePageDataViewModel6.c()) == null)) {
                        com.ss.android.ugc.aweme.metrics.q qVar = (com.ss.android.ugc.aweme.metrics.q) new com.ss.android.ugc.aweme.metrics.q().o(c2).a("slide_left");
                        qVar.u = "";
                        qVar.v = "";
                        qVar.t = "";
                        com.ss.android.ugc.aweme.metrics.q c3 = qVar.c(m2, 0);
                        c3.q = p();
                        HomePageDataViewModel homePageDataViewModel7 = this.I;
                        if (homePageDataViewModel7 != null) {
                            str4 = homePageDataViewModel7.f99127j;
                        } else {
                            str4 = null;
                        }
                        c3.r = str4;
                        c3.a(getContext()).f();
                    }
                    com.ss.android.ugc.aweme.metrics.u a2 = new com.ss.android.ugc.aweme.metrics.u().a("homepage_hot");
                    a2.f109596a = u.c.ITEM;
                    a2.f109597b = u.a.ENTER_PROFILE;
                    com.ss.android.ugc.aweme.metrics.u a3 = a2.g(m2).a(m2.getAuthor());
                    User author = m2.getAuthor();
                    if (author != null) {
                        str3 = author.getRequestId();
                    } else {
                        str3 = null;
                    }
                    a3.s(str3).b();
                }
                sVar.a("group_id", m2.getAid());
                sVar.a("enter_method", "slide_left");
                HomePageDataViewModel homePageDataViewModel8 = this.I;
                if (homePageDataViewModel8 != null) {
                    str2 = homePageDataViewModel8.f99127j;
                } else {
                    str2 = null;
                }
                sVar.a("request_id", str2);
                sVar.a("enter_type", "normal_way");
                MobClick labelName = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage");
                User author2 = m2.getAuthor();
                if (author2 != null) {
                    str5 = author2.getUid();
                }
                com.ss.android.ugc.aweme.common.r.onEvent(labelName.setValue(str5).setJsonObject(sVar.a()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.f.a.a
    public final void a(boolean z2) {
        float f2;
        float f3;
        Fragment b2;
        MainBottomTabView mainBottomTabView = this.f109067c;
        if (mainBottomTabView == null) {
            h.f.b.l.b();
        }
        float alpha = mainBottomTabView.getAlpha();
        float f4 = 0.0f;
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        com.bytedance.ies.dmt.ui.f.d.a(mainBottomTabView, alpha, f2);
        View view = this.f109066b;
        if (view == null) {
            h.f.b.l.b();
        }
        float alpha2 = view.getAlpha();
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        com.bytedance.ies.dmt.ui.f.d.a(view, alpha2, f3);
        TabChangeManager tabChangeManager = this.f109070j;
        if (tabChangeManager != null && (b2 = tabChangeManager.b()) != null && (b2 instanceof ae)) {
            ViewPropertyAnimator animate = ((ae) b2).f109144k.animate();
            if (!z2) {
                f4 = 1.0f;
            }
            animate.alpha(f4).setDuration(200).start();
        }
    }

    public final boolean a(String str) {
        Context context;
        Configuration configuration;
        Context context2 = getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context2;
        if (a.C3244a.a(eVar).a("swipe_up_guide")) {
            return true;
        }
        TabChangeManager a2 = TabChangeManager.a.a(eVar);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.share.h(str, a2.f109107d));
        a.C1605a.f71193a = str;
        if (!TextUtils.equals(a2.f109107d, str)) {
            HomePageUIFrameServiceImpl.e().b();
        }
        IMSAdaptionService c2 = MSAdaptionService.c();
        Fragment b2 = a2.b();
        if (b2 != null) {
            context = b2.getContext();
        } else {
            context = null;
        }
        if (!c2.b(context)) {
            return false;
        }
        Resources resources = eVar.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            SmartRouter.buildRoute(eVar, "//duo").withParam("duo_type", "duo_bottom_click").withParam("duo_clicked_tab_name", str).open();
            return true;
        } else if (!TextUtils.equals(str, "PUBLISH")) {
            return false;
        } else {
            new com.bytedance.tux.g.b(eVar).e(R.string.bey).b();
            return true;
        }
    }

    static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
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

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FrameLayout frameLayout;
        androidx.lifecycle.t<com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a> tVar;
        androidx.lifecycle.t<Boolean> tVar2;
        androidx.lifecycle.t<Boolean> tVar3;
        androidx.lifecycle.t<Boolean> tVar4;
        View view2;
        MethodCollector.i(2840);
        h.f.b.l.d(view, "");
        a.b.f109011a.a("cold_boot_mainpage_fragment_view_created", false);
        a.b.f109011a.a("cold_boot_mainpage_fragment_super_view_created", false);
        super.onViewCreated(view, bundle);
        a.b.f109011a.b("cold_boot_mainpage_fragment_super_view_created", false);
        p.a.a().a("MainPageFragment onViewCreated");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        this.q = (MainAnimViewModel) androidx.lifecycle.ae.a(activity, (ad.b) null).a(MainAnimViewModel.class);
        this.f109069e = view;
        if (view == null) {
            h.f.b.l.b();
        }
        this.f109066b = view.findViewById(R.id.w_);
        View view3 = this.f109069e;
        if (view3 == null) {
            h.f.b.l.b();
        }
        this.f109067c = (MainBottomTabView) view3.findViewById(R.id.ck7);
        View view4 = this.f109069e;
        if (view4 == null) {
            h.f.b.l.b();
        }
        this.f109068d = (ViewStub) view4.findViewById(R.id.a0a);
        View view5 = this.f109069e;
        if (view5 != null) {
            frameLayout = (FrameLayout) view5.findViewById(R.id.d6h);
        } else {
            frameLayout = null;
        }
        this.f109071k = frameLayout;
        IPolicyNoticeService n2 = com.ss.android.ugc.aweme.compliance.api.a.n();
        View view6 = this.f109069e;
        if (view6 == null) {
            h.f.b.l.b();
        }
        View a2 = n2.a(view6);
        this.H = a2;
        FrameLayout frameLayout2 = this.f109071k;
        if (frameLayout2 != null) {
            frameLayout2.addView(a2);
        }
        View view7 = this.H;
        if (view7 != null) {
            this.G = (com.ss.android.ugc.aweme.compliance.api.c.f) view7;
            View view8 = this.f109069e;
            if (view8 == null) {
                h.f.b.l.b();
            }
            this.p = view8.findViewById(R.id.flk);
            a.b.f109011a.a("cold_boot_mainpage_fragment_init_view_model", false);
            com.ss.android.ugc.aweme.share.viewmodel.a a3 = a.C3244a.a(activity);
            this.K = a3;
            if (a3 == null) {
                h.f.b.l.b();
            }
            a3.a(new l(this));
            h.f.b.l.d(this, "");
            ac a4 = androidx.lifecycle.ae.a(this, new MainPageDataViewModel.a.C2419a()).a(MainPageDataViewModel.class);
            h.f.b.l.b(a4, "");
            MainPageDataViewModel mainPageDataViewModel = (MainPageDataViewModel) a4;
            this.f109072l = mainPageDataViewModel;
            if (mainPageDataViewModel == null) {
                h.f.b.l.b();
            }
            mainPageDataViewModel.f99134a = this.p;
            this.f109070j = TabChangeManager.a.a(activity);
            this.I = HomePageDataViewModel.a.a(activity);
            this.f109073m = ScrollSwitchStateManager.a.a(activity);
            this.J = AdHomePageDataVM.a.a(activity);
            this.O = SocialRecFriendsConditionViewModel.a.a(activity);
            this.t = new com.bytedance.tiktok.homepage.mainpagefragment.dialog.c(this);
            com.ss.android.ugc.aweme.compliance.api.c.f fVar = this.G;
            if (fVar == null) {
                h.f.b.l.b();
            }
            MainBottomTabView mainBottomTabView = this.f109067c;
            if (mainBottomTabView == null) {
                h.f.b.l.b();
            }
            TabChangeManager tabChangeManager = this.f109070j;
            if (tabChangeManager == null) {
                h.f.b.l.b();
            }
            this.v = new SafeInfoNoticePopupWindowHelp(this, this, fVar, mainBottomTabView, tabChangeManager);
            View view9 = this.f109069e;
            if (view9 == null) {
                h.f.b.l.b();
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.f109073m;
            if (scrollSwitchStateManager == null) {
                h.f.b.l.b();
            }
            this.u = new FissionPopupWindowHelp(this, this, view9, scrollSwitchStateManager);
            HomePageDataViewModel homePageDataViewModel = this.I;
            if (homePageDataViewModel == null) {
                h.f.b.l.b();
            }
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.f109073m;
            if (scrollSwitchStateManager2 == null) {
                h.f.b.l.b();
            }
            this.w = new com.bytedance.tiktok.homepage.mainpagefragment.dialog.d(this, this, homePageDataViewModel, scrollSwitchStateManager2);
            SocialRecFriendsConditionViewModel socialRecFriendsConditionViewModel = this.O;
            if (socialRecFriendsConditionViewModel == null) {
                h.f.b.l.b();
            }
            ScrollSwitchStateManager scrollSwitchStateManager3 = this.f109073m;
            if (scrollSwitchStateManager3 == null) {
                h.f.b.l.b();
            }
            this.y = new com.bytedance.tiktok.homepage.mainpagefragment.dialog.e(this, socialRecFriendsConditionViewModel, scrollSwitchStateManager3);
            this.C = new com.bytedance.tiktok.homepage.mainpagefragment.a(this, activity);
            a.b.f109011a.b("cold_boot_mainpage_fragment_init_view_model", false);
            a.b.f109011a.a("cold_boot_mainpage_fragment_proxy_onviewcreated", false);
            this.L.a(this, view);
            a.b.f109011a.b("cold_boot_mainpage_fragment_proxy_onviewcreated", false);
            a.b.f109011a.a("cold_boot_mainpage_bottom_tab_view_build_view", false);
            View view10 = this.f109069e;
            if (view10 == null) {
                h.f.b.l.b();
            }
            this.f109066b = view10.findViewById(R.id.w_);
            View view11 = this.f109069e;
            if (view11 == null) {
                h.f.b.l.b();
            }
            this.f109068d = (ViewStub) view11.findViewById(R.id.a0a);
            MainBottomTabView mainBottomTabView2 = this.f109067c;
            if (mainBottomTabView2 == null) {
                h.f.b.l.b();
            }
            mainBottomTabView2.a();
            if (c.b.f66221a.q) {
                MainBottomTabView mainBottomTabView3 = this.f109067c;
                if (mainBottomTabView3 == null) {
                    h.f.b.l.b();
                }
                Context context = getContext();
                if (context == null) {
                    h.f.b.l.b();
                }
                mainBottomTabView3.setBackgroundColor(androidx.core.content.b.c(context, R.color.a2));
                MainBottomTabView mainBottomTabView4 = this.f109067c;
                if (mainBottomTabView4 == null) {
                    h.f.b.l.b();
                }
                mainBottomTabView4.b();
            }
            TabAlphaController a5 = TabAlphaController.a();
            MainBottomTabView mainBottomTabView5 = this.f109067c;
            if (mainBottomTabView5 != null) {
                a5.f109100a = mainBottomTabView5;
            }
            a.b.f109011a.b("cold_boot_mainpage_bottom_tab_view_build_view", false);
            a.b.f109011a.a("cold_boot_mainpage_bottom_tab_build_view_to_onviewcreated_end", false);
            MainPageFragmentImpl.i().a(this);
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b bVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b) HomeTabViewModel.a.a(activity).a("PUBLISH");
            if (bVar != null && bVar.f99552a == null) {
                bVar.f99552a = HomePageUIFrameServiceImpl.e().a(bVar.f99556j, bVar.b().f82872h);
            }
            ScrollSwitchStateManager scrollSwitchStateManager4 = this.f109073m;
            if (scrollSwitchStateManager4 == null) {
                h.f.b.l.b();
            }
            o oVar = new o(this, activity);
            h.f.b.l.d(this, "");
            h.f.b.l.d(oVar, "");
            scrollSwitchStateManager4.f99145g.observe(this, oVar);
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null) {
                h.f.b.l.b();
            }
            DataCenter a6 = DataCenter.a(androidx.lifecycle.ae.a(activity2, (ad.b) null), this);
            this.n = a6;
            if (a6 == null) {
                h.f.b.l.b();
            }
            a6.a("ENTER_DISLIKE_MODE", (androidx.lifecycle.u<com.ss.android.ugc.aweme.arch.widgets.base.b>) new d(this)).a("handlePageResume", (androidx.lifecycle.u<com.ss.android.ugc.aweme.arch.widgets.base.b>) new e(this)).a("setTabBackground", (androidx.lifecycle.u<com.ss.android.ugc.aweme.arch.widgets.base.b>) new f(this)).a("changeTabAfterPublish", (androidx.lifecycle.u<com.ss.android.ugc.aweme.arch.widgets.base.b>) new g(this)).a("onNewIntent", new h(this), true).a("proformToTab", new i(this), true).a("performClickTab", new j(this), true);
            View view12 = this.f109069e;
            if (view12 == null) {
                h.f.b.l.b();
            }
            VideoSeekBarMaskView videoSeekBarMaskView = (VideoSeekBarMaskView) view12.findViewById(R.id.ck9);
            View view13 = this.f109069e;
            if (view13 == null) {
                h.f.b.l.b();
            }
            VideoSeekBar videoSeekBar = (VideoSeekBar) view13.findViewById(R.id.fh7);
            h.f.b.l.b(videoSeekBar, "");
            videoSeekBarMaskView.setSeekBarView(videoSeekBar);
            View view14 = this.f109069e;
            if (view14 == null) {
                h.f.b.l.b();
            }
            ViewGroup viewGroup = (ViewGroup) view14.findViewById(R.id.fh8);
            View view15 = this.f109069e;
            if (view15 == null) {
                h.f.b.l.b();
            }
            TuxTextView tuxTextView = (TuxTextView) view15.findViewById(R.id.ahp);
            View view16 = this.f109069e;
            if (view16 == null) {
                h.f.b.l.b();
            }
            TuxTextView tuxTextView2 = (TuxTextView) view16.findViewById(R.id.ept);
            tuxTextView.a(32.0f);
            tuxTextView2.a(32.0f);
            h.f.b.l.b(viewGroup, "");
            h.f.b.l.b(tuxTextView, "");
            h.f.b.l.b(tuxTextView2, "");
            ScrollSwitchStateManager scrollSwitchStateManager5 = this.f109073m;
            if (scrollSwitchStateManager5 == null) {
                h.f.b.l.b();
            }
            this.D = new com.ss.android.ugc.aweme.feed.ui.seekbar.a.e(new com.ss.android.ugc.aweme.feed.ui.seekbar.a.g(videoSeekBar, viewGroup, tuxTextView, tuxTextView2, scrollSwitchStateManager5));
            DataCenter dataCenter = this.n;
            if (dataCenter == null) {
                h.f.b.l.b();
            }
            dataCenter.a("ENTER_DISLIKE_MODE", (androidx.lifecycle.u<com.ss.android.ugc.aweme.arch.widgets.base.b>) new k(this));
            new f.c().b((w) new DownloadFestivalTask()).b((w) new InitBubbleGuideTask()).b((w) new HwWallpaperMobEventTask()).b((w) new MultiProcessMobEventTask()).a();
            DataCenter dataCenter2 = this.n;
            if (dataCenter2 == null) {
                h.f.b.l.b();
            }
            Boolean bool = (Boolean) dataCenter2.b("start_from_logout_or_switch", (Object) false);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if ((!g2.isLogin() || com.ss.android.ugc.aweme.compliance.api.a.o().a()) && com.ss.android.ugc.aweme.compliance.api.a.f().b() && !bool.booleanValue() && (view2 = this.f109069e) != null) {
                view2.postDelayed(new s(this), 100);
            }
            View view17 = this.f109069e;
            if (view17 == null) {
                h.f.b.l.b();
            }
            view17.getViewTreeObserver().addOnGlobalLayoutListener(new p(this));
            FissionPopupWindowHelp fissionPopupWindowHelp = this.u;
            if (fissionPopupWindowHelp == null) {
                h.f.b.l.b();
            }
            fissionPopupWindowHelp.f44273f = (FeedPanelStateViewModel) androidx.lifecycle.ae.a(fissionPopupWindowHelp.f44270c.requireActivity(), (ad.b) null).a(FeedPanelStateViewModel.class);
            FeedPanelStateViewModel feedPanelStateViewModel = fissionPopupWindowHelp.f44273f;
            if (!(feedPanelStateViewModel == null || (tVar4 = feedPanelStateViewModel.f124397c) == null)) {
                tVar4.observe(fissionPopupWindowHelp.f44270c, new FissionPopupWindowHelp.b(fissionPopupWindowHelp));
            }
            FeedPanelStateViewModel feedPanelStateViewModel2 = fissionPopupWindowHelp.f44273f;
            if (!(feedPanelStateViewModel2 == null || (tVar3 = feedPanelStateViewModel2.f124396b) == null)) {
                tVar3.observe(fissionPopupWindowHelp.f44270c, new FissionPopupWindowHelp.c(fissionPopupWindowHelp));
            }
            FeedPanelStateViewModel feedPanelStateViewModel3 = fissionPopupWindowHelp.f44273f;
            if (!(feedPanelStateViewModel3 == null || (tVar2 = feedPanelStateViewModel3.f124398d) == null)) {
                tVar2.observe(fissionPopupWindowHelp.f44270c, new FissionPopupWindowHelp.d(fissionPopupWindowHelp));
            }
            View view18 = this.f109069e;
            if (view18 instanceof ViewGroup) {
                if (view18 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.d(view18, "");
                com.ss.android.ugc.aweme.ug.guide.e.f141914a = new WeakReference<>(view18);
            }
            MainBottomTabView mainBottomTabView6 = this.f109067c;
            if (mainBottomTabView6 == null) {
                h.f.b.l.b();
            }
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = this.t;
            if (cVar == null) {
                h.f.b.l.b();
            }
            TabChangeManager tabChangeManager2 = this.f109070j;
            if (tabChangeManager2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.compliance.api.c.f fVar2 = this.G;
            if (fVar2 == null) {
                h.f.b.l.b();
            }
            ScrollSwitchStateManager scrollSwitchStateManager6 = this.f109073m;
            if (scrollSwitchStateManager6 == null) {
                h.f.b.l.b();
            }
            MainAnimViewModel mainAnimViewModel = this.q;
            if (mainAnimViewModel == null) {
                h.f.b.l.b();
            }
            com.bytedance.tiktok.homepage.mainpagefragment.notification.c cVar2 = new com.bytedance.tiktok.homepage.mainpagefragment.notification.c(activity, mainBottomTabView6, this, cVar, tabChangeManager2, fVar2, scrollSwitchStateManager6, mainAnimViewModel);
            this.A = cVar2;
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            if (g3.isLogin()) {
                cVar2.b();
            } else {
                cVar2.f44371e = new c.j(cVar2);
                com.ss.android.ugc.aweme.account.b.a();
                IAccountService iAccountService = com.ss.android.ugc.aweme.account.b.f62864a;
                IAccountService.b bVar2 = cVar2.f44371e;
                if (bVar2 == null) {
                    h.f.b.l.b();
                }
                iAccountService.a(bVar2);
            }
            HomePageDataViewModel homePageDataViewModel2 = this.I;
            if (homePageDataViewModel2 == null) {
                h.f.b.l.b();
            }
            MainPageDataViewModel mainPageDataViewModel2 = this.f109072l;
            if (mainPageDataViewModel2 == null) {
                h.f.b.l.b();
            }
            DataCenter dataCenter3 = this.n;
            if (dataCenter3 == null) {
                h.f.b.l.b();
            }
            this.z = new com.ss.android.ugc.aweme.im.sdk.a.a.a.b.a(this, homePageDataViewModel2, mainPageDataViewModel2, dataCenter3, this);
            this.N = new com.bytedance.tiktok.homepage.mainpagefragment.d();
            AdHomePageDataVM adHomePageDataVM = this.J;
            if (!(adHomePageDataVM == null || (tVar = adHomePageDataVM.f34658b) == null)) {
                tVar.observe(this, this.R);
            }
            h.f.b.l.d(this, "");
            NotificationCountViewManager.f44360a = this;
            d.a.b();
            a.b.f109011a.b("cold_boot_mainpage_fragment_view_created", false);
            a.b.f109011a.b("cold_boot_mainpage_bottom_tab_build_view_to_onviewcreated_end", false);
            if (com.ss.android.ugc.aweme.api.h.a()) {
                ZeroRatingServiceImpl.f().a(this.P);
            }
            MethodCollector.o(2840);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.interfaces.IPolicyNoticeToast");
        MethodCollector.o(2840);
        throw nullPointerException;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        h.f.b.l.d(strArr, "");
        h.f.b.l.d(iArr, "");
        com.ss.android.ugc.aweme.utils.permission.a.a(getActivity(), i2, iArr);
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        View rootView;
        MethodCollector.i(2714);
        h.f.b.l.d(layoutInflater, "");
        a.b.f109011a.b("cold_boot_resume_to_mainpage_create_view", false);
        a.b.f109011a.a("cold_boot_mainpage_fragment_create_view", false);
        MainLooperOptService b2 = MainLooperOptService.b((MainLooperOptService.a) null);
        if (b2 != null) {
            if (b2.f107701d == null && MainLooperOptService.f107697h && (rootView = viewGroup.getRootView()) != null) {
                b2.f107701d = b2.a(rootView.getParent());
                if (b2.f107701d == null) {
                    b2.f107701d = b2.b(rootView.getParent());
                }
            }
            b2.a(MainLooperOptService.a.WATCH_WINDOW_FOCUS_CHANGE);
        }
        com.ss.android.ugc.aweme.homepage.b bVar = this.L;
        h.f.b.l.d(this, "");
        h.f.b.l.d(layoutInflater, "");
        if (com.ss.android.ugc.aweme.s.e.b()) {
            i2 = R.layout.a3o;
        } else {
            i2 = R.layout.a3n;
        }
        View a2 = com.a.b.c.a((Activity) getActivity(), i2);
        h.f.b.l.b(a2, "");
        h.f.b.l.d(a2, "");
        h.f.b.l.d(this, "");
        if (com.ss.android.ugc.aweme.homepage.story.container.h.f99315c) {
            Context context = a2.getContext();
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.homepage.story.container.f fVar = new com.ss.android.ugc.aweme.homepage.story.container.f(context, (byte) 0);
            fVar.addView(a2, new StepDrawerContainer.c(0));
            h.f.b.l.d(this, "");
            fVar.f99304i = this;
            com.bytedance.ies.uikit.a.b bVar2 = fVar.f99304i;
            if (bVar2 == null) {
                h.f.b.l.a("hostFragment");
            }
            bVar2.getLifecycle().a(new StoryContainer$attachHost$1(fVar));
            a2 = fVar;
        }
        if (!com.ss.android.ugc.aweme.s.e.b()) {
            getActivity();
            if (a2 != null) {
                ViewStub viewStub = (ViewStub) ((ViewGroup) a2).findViewById(R.id.fl_);
                if (viewStub != null) {
                    viewStub.inflate();
                }
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(2714);
                throw nullPointerException;
            }
        }
        bVar.f99157a = (FragmentTabHost) a2.findViewById(R.id.ckb);
        FragmentTabHost fragmentTabHost = bVar.f99157a;
        if (fragmentTabHost != null) {
            fragmentTabHost.setHideWhenTabChanged(true);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        bVar.f99159c = ScrollSwitchStateManager.a.a(activity);
        a.b.f109011a.b("cold_boot_mainpage_fragment_create_view", false);
        MethodCollector.o(2714);
        return a2;
    }

    @Override // com.bytedance.ies.uikit.tabhost.FragmentTabHost.b
    public final void a(String str, Fragment fragment, Fragment fragment2) {
        com.ss.android.ugc.aweme.t.b.a(getActivity(), str);
        if (TextUtils.equals(str, "HOME") || (TextUtils.equals(str, "MUSIC_DSP") && h.f.b.l.a((Object) this.Q, (Object) "Daily Mix"))) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                fc.a(activity);
            }
        } else {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                fc.b(activity2);
            }
        }
        if ((fragment2 instanceof com.ss.android.ugc.aweme.newfollow.ui.c) || (fragment2 instanceof com.ss.android.ugc.aweme.profile.ui.d.b)) {
            fragment2.setUserVisibleHint(false);
        }
        if ((fragment instanceof com.ss.android.ugc.aweme.newfollow.ui.c) && fragment != null) {
            fragment.setUserVisibleHint(true);
        }
        if (fragment instanceof com.ss.android.ugc.aweme.profile.ui.v2.b) {
            SharePrefCache inst = SharePrefCache.inst();
            h.f.b.l.b(inst, "");
            com.ss.android.ugc.aweme.app.aj<Boolean> enableProfileActivityLink = inst.getEnableProfileActivityLink();
            h.f.b.l.b(enableProfileActivityLink, "");
            Boolean c2 = enableProfileActivityLink.c();
            h.f.b.l.b(c2, "");
            if (c2.booleanValue()) {
                com.bytedance.tiktok.homepage.mainpagefragment.notification.c cVar = this.A;
                if (cVar == null) {
                    h.f.b.l.b();
                }
                cVar.f();
                ay ayVar = (ay) com.ss.android.ugc.aweme.base.b.a.c.a(getContext(), ay.class);
                if (ayVar != null) {
                    ayVar.b("true");
                }
            }
        }
        if (fragment != null) {
            SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp = this.v;
            if (safeInfoNoticePopupWindowHelp == null) {
                h.f.b.l.b();
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            boolean isLogin = g2.isLogin();
            h.f.b.l.d(fragment, "");
            if (isLogin) {
                Keva repo = Keva.getRepo("account_security_keva_name");
                StringBuilder sb = new StringBuilder("prior_to_safe_info_");
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g3, "");
                if (repo.getBoolean(sb.append(g3.getCurUserId()).toString(), false) || (fragment instanceof ae)) {
                    safeInfoNoticePopupWindowHelp.a();
                    return;
                }
                Keva repo2 = Keva.getRepo("account_security_keva_name");
                StringBuilder sb2 = new StringBuilder("last_time_fetch_safe_info_");
                IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g4, "");
                long j2 = repo2.getLong(sb2.append(g4.getCurUserId()).toString(), 0);
                if (j2 == 0 || j2 < System.currentTimeMillis()) {
                    SafeInfoNoticeApi a2 = SafeInfoNoticeApi.a.a();
                    IAccountUserService g5 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g5, "");
                    a2.safeInfoNoticeMsg(g5.isChildrenMode()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new SafeInfoNoticePopupWindowHelp.a(safeInfoNoticePopupWindowHelp));
                    return;
                }
                safeInfoNoticePopupWindowHelp.a(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0164  */
    @Override // com.ss.android.ugc.aweme.base.ui.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainPageFragment.a(java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
