package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.analytics.page.d;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.router.SmartRouter;
import com.google.c.c.ap;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.d;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.common.e.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.experiment.ec;
import com.ss.android.ugc.aweme.experiment.ed;
import com.ss.android.ugc.aweme.experiment.hi;
import com.ss.android.ugc.aweme.experiment.hj;
import com.ss.android.ugc.aweme.experiment.hk;
import com.ss.android.ugc.aweme.experiment.hl;
import com.ss.android.ugc.aweme.experiment.ho;
import com.ss.android.ugc.aweme.experiment.hp;
import com.ss.android.ugc.aweme.feed.aa;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.al;
import com.ss.android.ugc.aweme.feed.adapter.am;
import com.ss.android.ugc.aweme.feed.g.b;
import com.ss.android.ugc.aweme.feed.helper.g;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.m;
import com.ss.android.ugc.aweme.feed.i.y;
import com.ss.android.ugc.aweme.feed.i.z;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.a;
import com.ss.android.ugc.aweme.feed.n.f;
import com.ss.android.ugc.aweme.feed.q.av;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.t;
import com.ss.android.ugc.aweme.feed.u.l;
import com.ss.android.ugc.aweme.feed.ui.as;
import com.ss.android.ugc.aweme.feed.ui.instagram.a;
import com.ss.android.ugc.aweme.feed.v;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.i18n.language.a.g;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.i;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.o;
import com.ss.android.ugc.aweme.net.k.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.ft;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;

public class af extends f<l> implements d, com.bytedance.hox.a.d, aa, am, a, f<Aweme>, i, i, org.greenrobot.eventbus.i, j {
    private boolean A = false;
    private boolean B = false;
    private DataCenter C;
    private SwipeRefreshLayout.b D;
    private List<Aweme> E = null;
    private int F = 0;
    private volatile boolean G = false;
    private b H;

    /* renamed from: m  reason: collision with root package name */
    public int f94222m;
    public final av n = new av("homepage_hot");
    public v o;
    public AdHomePageDataVM p;
    com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.b q = null;
    com.ss.android.ugc.aweme.feed.p.b.a.b r = null;
    g z;

    static {
        Covode.recordClassIndex(59863);
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
        return "2001";
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return null;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(198, new org.greenrobot.eventbus.g(af.class, "onFeedFetchEvent", m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(250, new org.greenrobot.eventbus.g(af.class, "showInsDialog", com.ss.android.ugc.aweme.feed.ui.a.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(175, new org.greenrobot.eventbus.g(af.class, "onVideoPublishEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(251, new org.greenrobot.eventbus.g(af.class, "onPlayerControllerRenderFirstFrameEvent", com.ss.android.ugc.aweme.feed.ui.seekbar.d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(12, new org.greenrobot.eventbus.g(af.class, "onAwesomeSplashEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(252, new org.greenrobot.eventbus.g(af.class, "onEvent", z.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.main.i
    public final String w() {
        return "FeedRecommendFragment";
    }

    @Override // com.ss.android.ugc.aweme.feed.aa
    public final com.ss.android.ugc.aweme.feed.q.a e() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f, com.ss.android.ugc.aweme.feed.ui.z
    public final boolean a(boolean z2) {
        if (!ab_() || this.f94760j == null) {
            return false;
        }
        boolean z3 = ((l) this.f94760j).f94047c;
        if (!super.a(z2) && !z3) {
            return false;
        }
        l lVar = (l) this.f94760j;
        ((com.ss.android.ugc.aweme.feed.u.d) lVar.f76396h).f94002a = z2;
        lVar.f94045a = z2;
        if (z3) {
            this.f94761k.setRefreshing(false);
            c.a(new y());
            return true;
        }
        h();
        if (!this.A && this.B) {
            u();
        }
        if (g()) {
            if (z2) {
                b("click");
            } else if (!TextUtils.isEmpty(this.y)) {
                b(this.y);
                if ("press_back".equals(this.y)) {
                    return ((l) this.f94760j).b(1, 0, 1, Boolean.valueOf(this.o.a()));
                }
            }
            return this.f94760j.a(1, 0, 1, Boolean.valueOf(this.o.a()));
        }
        return this.f94760j.a(2, 0, 3);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.common.e.b' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final /* synthetic */ l j() {
        return new l(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f, com.ss.android.ugc.aweme.feed.n.c
    public final boolean k() {
        h();
        return super.k();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.am
    public final boolean o() {
        return this.n.bo();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final void p() {
        this.n.bF();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.at
    public final aj r() {
        return this.n.aC();
    }

    private static boolean q() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private int t() {
        av avVar = this.n;
        if (avVar != null) {
            return avVar.bC();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.b.a.a.a
    public final SparseArray<com.ss.android.ugc.b.a.a.c> G() {
        SparseArray<com.ss.android.ugc.b.a.a.c> G2 = super.G();
        G2.append(d.a.f68100c, this.n);
        return G2;
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(hashCode());
    }

    public final void h() {
        if (this.f94760j != null) {
            ((l) this.f94760j).f94049e = t();
        }
    }

    public final boolean g() {
        if (this.f94760j.f76396h == null || this.f94760j.f76396h.mData == null || !this.f94760j.f76396h.mData.isRefreshClear()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final boolean n() {
        if (super.n()) {
            l lVar = (l) this.f94760j;
            if (lVar.f76396h == null || ((com.ss.android.ugc.aweme.feed.u.d) lVar.f76396h).f94006e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.feed.ui.z
    public void onStop() {
        super.onStop();
        UgAllServiceImpl.c().b();
        com.ss.android.ugc.aweme.at.a.c();
        com.ss.android.ugc.aweme.at.a.e();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.z
    public final void s() {
        this.f94757c.setRefreshing(true);
        a(false);
        c.a(new com.ss.android.ugc.aweme.ad.feed.c.a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final boolean l() {
        boolean z2 = true;
        ((l) this.f94760j).f94047c = true;
        com.ss.android.ugc.aweme.common.e.b bVar = this.f94760j;
        Object[] objArr = new Object[4];
        objArr[0] = 4;
        objArr[1] = Integer.valueOf(this.u);
        objArr[2] = 2;
        if (!com.ss.android.ugc.aweme.feed.background.c.a() || !com.ss.android.ugc.aweme.feed.experiment.b.b()) {
            z2 = false;
        }
        objArr[3] = Boolean.valueOf(z2);
        return bVar.a(objArr);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public void onStart() {
        super.onStart();
        e activity = getActivity();
        if (activity instanceof com.ss.android.ugc.aweme.main.j) {
            Fragment curFragment = ((com.ss.android.ugc.aweme.main.j) activity).getCurFragment();
            if ((curFragment instanceof com.ss.android.ugc.aweme.main.l) && (((com.ss.android.ugc.aweme.main.l) curFragment).l() instanceof af)) {
                g.a.f99786a.a(getActivity());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.a
    public final boolean f() {
        ((l) this.f94760j).f94047c = true;
        com.ss.android.ugc.aweme.common.e.b bVar = this.f94760j;
        Object[] objArr = new Object[5];
        boolean z2 = false;
        objArr[0] = 4;
        objArr[1] = Integer.valueOf(this.u);
        objArr[2] = 2;
        if (com.ss.android.ugc.aweme.feed.background.c.a() && com.ss.android.ugc.aweme.feed.experiment.b.b()) {
            z2 = true;
        }
        objArr[3] = Boolean.valueOf(z2);
        objArr[4] = true;
        return bVar.a(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r1.booleanValue() != false) goto L_0x001b;
     */
    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.feed.ui.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r4 = this;
            super.onPause()
            com.ss.android.ugc.aweme.feed.q.av r0 = r4.n
            boolean r0 = r0.bo()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            com.ss.android.ugc.aweme.commercialize.utils.az r1 = com.ss.android.ugc.aweme.commercialize.g.d()
            androidx.fragment.app.i r0 = r4.getFragmentManager()
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L_0x0020
        L_0x001b:
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34791g = r3
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b = r2
            return
        L_0x0020:
            androidx.fragment.app.e r1 = r4.getActivity()
            if (r1 != 0) goto L_0x003b
        L_0x0026:
            com.ss.android.ugc.aweme.feed.q.av r0 = r4.n
            com.ss.android.ugc.aweme.feed.adapter.aj r0 = r0.aC()
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.q.av r0 = r4.n
            com.ss.android.ugc.aweme.feed.adapter.aj r0 = r0.aC()
            boolean r0 = r0.R()
            if (r0 == 0) goto L_0x0058
            goto L_0x001b
        L_0x003b:
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.ss.android.ugc.aweme.comment.CommentServiceImpl.e()
            com.ss.android.ugc.aweme.comment.api.CommentViewModel r0 = r0.a(r1)
            androidx.lifecycle.LiveData r0 = r0.a()
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0026
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x001b
            goto L_0x0026
        L_0x0058:
            r3 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.af.onPause():void");
    }

    private void u() {
        com.ss.android.ugc.aweme.feed.ui.instagram.b bVar;
        if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            av avVar = this.n;
            if ((avVar == null || avVar.aD() == null || !this.n.aD().isAd()) && getActivity() != null && getUserVisibleHint() && isResumed() && !this.A) {
                com.ss.android.ugc.aweme.feed.ui.instagram.d a2 = a.C2282a.a();
                User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
                if (a2 != null && TextUtils.isEmpty(curUser.getBindPhone()) && TextUtils.isEmpty(curUser.getEmail())) {
                    if ("instagram".equals(a2.f94804a)) {
                        bVar = new com.ss.android.ugc.aweme.feed.ui.instagram.b("ins");
                    } else {
                        bVar = new com.ss.android.ugc.aweme.feed.ui.instagram.b(a2.f94804a);
                    }
                    if (new com.ss.android.ugc.aweme.feed.ui.instagram.a(a2, bVar, getActivity(), "homepage_hot", "feed_popup").a()) {
                        this.A = true;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.al
    public final void a() {
        com.ss.android.ugc.aweme.framework.a.a.a(4, "FeedFetchModel", "feedRecommendFragment called onLoadMore()");
        h();
        this.f94760j.a(4, 0, 2);
        if (com.ss.android.ugc.aweme.feed.p.b.a()) {
            com.ss.android.ugc.aweme.feed.p.a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        av avVar;
        List<Aweme> e2;
        if (getActivity() != null) {
            String a2 = a(getActivity().getIntent(), "gids");
            if (!TextUtils.isEmpty(a2) && !a2.contains(",") && (avVar = this.n) != null && (e2 = avVar.W.e()) != null) {
                for (Aweme aweme : e2) {
                    if (TextUtils.equals(aweme.getAid(), a2)) {
                        SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/".concat(String.valueOf(a2))).withParam(a(getActivity().getIntent())).open();
                        return;
                    }
                }
            }
            e activity = getActivity();
            h.f.b.l.d(activity, "");
            h.f.b.l.d(this, "");
            String a3 = as.a(activity.getIntent(), "gids");
            boolean booleanExtra = activity.getIntent().getBooleanExtra("onNewIntent", false);
            String a4 = as.a(activity.getIntent(), "push_params");
            String a5 = as.a(activity.getIntent(), "refer");
            if (!TextUtils.isEmpty(a3) && booleanExtra) {
                b.i.b(new as.b(a3, a4, a5), b.i.f4824a).b(new as.c(this), b.i.f4826c);
                activity.getIntent().removeExtra("gids");
                activity.getIntent().removeExtra("onNewIntent");
                if (this.f94757c != null) {
                    this.f94757c.setOnRefreshListener(null);
                    this.f94757c.setRefreshing(true);
                }
                c(a2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.feed.ui.f, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.ui.z
    public void onDestroyView() {
        if (this.f94760j != null) {
            com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.f94760j.f76396h;
            v vVar = this.o;
            if (!(aVar == null || vVar == null || !com.bytedance.ies.ugc.appcontext.f.f34637l)) {
                T t = aVar.mData;
                List items = aVar.getItems();
                int i2 = vVar.f95145a + 1;
                if (items != null && i2 < items.size()) {
                    if (i2 < items.size()) {
                        items.subList(0, i2).clear();
                    }
                    int intValue = ((Number) com.ss.android.ugc.aweme.s.g.f120825c.getValue()).intValue();
                    if (items.size() > 0 && items.size() > intValue) {
                        items.subList(intValue, items.size()).clear();
                    }
                    if (t != null) {
                        t.isFromUnusedFeed = true;
                        com.ss.android.ugc.aweme.feed.t.d.f93914a.a(4).a(t);
                    }
                    if (!com.ss.android.ugc.tools.utils.d.a(items) && ((!com.ss.android.ugc.aweme.s.g.a() || NetworkUtils.isWifi(com.bytedance.ies.ugc.appcontext.g.a())) && ((Boolean) com.ss.android.ugc.aweme.s.g.f120823a.getValue()).booleanValue())) {
                        for (Aweme aweme : new ArrayList(items)) {
                            com.ss.android.ugc.aweme.cw.g.a().execute(new hp(aweme));
                        }
                    }
                    ho.a(items);
                }
            }
        }
        super.onDestroyView();
        this.n.r();
        if (this.f94760j != null) {
            this.f94760j.cd_();
        }
        com.ss.android.ugc.aweme.feed.p.b.a.b bVar = this.r;
        if (bVar != null) {
            bVar.a();
        }
        t.f93900a = 0;
        b bVar2 = this.H;
        if (bVar2 != null) {
            bVar2.dispose();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.feed.ui.z
    public void onResume() {
        boolean z2;
        a.b.f109011a.a("cold_boot_feed_recommend_fragment_onresume", false);
        super.onResume();
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.b bVar = this.q;
        if (bVar != null) {
            bVar.b();
        }
        if (getUserVisibleHint() && isResumed() && this.v != null && !this.v.isHidden() && ft.a()) {
            b.i.b(new ag(this), r.a());
            s.a(com.ss.android.ugc.aweme.feed.af.FEED);
        }
        UgAllServiceImpl.c().a(getActivity(), this.n.aD());
        if (!this.A && com.ss.android.ugc.aweme.feed.ui.instagram.a.f94782g) {
            u();
        }
        getActivity();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = q();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            this.B = true;
        }
        if (MSAdaptionService.c().c(getContext())) {
            AwemeChangeCallBack.a(getActivity(), this.n.aD());
        }
        getActivity().getWindow().setBackgroundDrawableResource(R.color.a2);
        if (this.v != null && !this.v.isHidden()) {
            Aweme aD = this.n.aD();
            e requireActivity = requireActivity();
            h.f.b.l.d(requireActivity, "");
            Intent intent = requireActivity.getIntent();
            if (intent.getBooleanExtra("is_start_by_login", false) || intent.getBooleanExtra("from_new_user_journey", false) || intent.getBooleanExtra("is_start_by_switch_account", false)) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean b2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.j().b();
            if (!z2 && ((aD == null || !aD.isAd()) && !b2)) {
                com.ss.android.ugc.aweme.friends.service.a.f97047a.a(1, "homepage_hot", "auto", requireActivity);
            }
            com.ss.android.ugc.aweme.friends.service.a.f97047a.j().a();
        }
        a.b.f109011a.b("cold_boot_feed_recommend_fragment_onresume", false);
        a.b.f109011a.a("cold_boot_feed_recommend_onresume_to_focus", false);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void showInsDialog(com.ss.android.ugc.aweme.feed.ui.a.a aVar) {
        u();
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @org.greenrobot.eventbus.r
    public void onFeedFetchEvent(m mVar) {
        if (TextUtils.equals(mVar.f93486a, "from_full_recommend")) {
            l();
        }
    }

    @org.greenrobot.eventbus.r
    public void onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        if ((aVar.f34874a == 1 || aVar.f34874a == 2) && this.n.bo()) {
            this.n.bp();
        }
    }

    private void c(String str) {
        if (g.a.a(getActivity())) {
            if (this.z == null) {
                this.z = new com.ss.android.ugc.aweme.feed.helper.g();
            }
            this.z.a(str, getActivity());
            SettingServiceImpl.v().a(true, getFragmentManager());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final DmtStatusView a(Context context) {
        if (!com.ss.android.ugc.aweme.s.d.j()) {
            return DmtStatusViewInflate.a(context, new am(this));
        }
        DmtStatusViewInflate dmtStatusViewInflate = (DmtStatusViewInflate) com.ss.android.ugc.aweme.lego.f.a(new DmtStatusViewInflate());
        al alVar = new al(this);
        if (dmtStatusViewInflate.f107675a == null) {
            return DmtStatusViewInflate.a(context, alVar);
        }
        dmtStatusViewInflate.f107676b.f107677a = alVar;
        DmtStatusView dmtStatusView = dmtStatusViewInflate.f107675a;
        dmtStatusViewInflate.f107675a = null;
        dmtStatusViewInflate.f107676b = null;
        return dmtStatusView;
    }

    public final void b(String str) {
        r.a("homepage_hot_click", new com.ss.android.ugc.aweme.app.f.d().a("click_method", "refresh").a("refresh_mode", str).a("last_play_cnt", this.o.f95145a).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.z
    public final void d(boolean z2) {
        bd t;
        super.d(z2);
        c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.c.a(2, this.n.aD(), this.n));
        this.n.m(z2);
        g.a.f99786a.f99780b = false;
        aj aC = this.n.aC();
        if (!(aC == null || (t = aC.t()) == null)) {
            t.v();
        }
        com.ss.android.ugc.aweme.feed.p.b.f.a(false);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onPlayerControllerRenderFirstFrameEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.d dVar) {
        if (!this.G) {
            List<Aweme> list = this.E;
            if (list != null) {
                this.n.b(list, this.F);
                this.n.b(this.F, true);
                this.E = null;
                this.F = 0;
            } else {
                a(this.n.W.e(), true);
            }
            this.G = true;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(z zVar) {
        h();
        if (zVar.f93508a) {
            ((l) this.f94760j).f94047c = true;
            this.f94760j.a(4, 0, 2);
            return;
        }
        this.f94760j.a(1, 0, 1, false);
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        String string = bundle.getString(be.f68530b, "");
        String d2 = Hox.a.a(getActivity()).d("For You");
        String d3 = Hox.a.a(getActivity()).d(d2);
        String d4 = Hox.a.a(getActivity()).d(d3);
        if (string.equals(be.f68533e) || bundle.getBoolean(d2)) {
            this.n.e(false);
            if (isResumed()) {
                a.b.f109011a.f109002c = false;
                a.b.f109011a.f109006g = false;
                com.ss.android.ugc.aweme.logger.c.f109013a = false;
            }
            d(false);
        } else if (string.equals(be.f68532d) || bundle.getBoolean(d3)) {
            d(true);
        } else if (string.equals(be.f68531c) || bundle.getBoolean(d4)) {
            aj aC = this.n.aC();
            if (aC != null) {
                aC.b(1);
            }
            Aweme aweme = HomePageDataViewModel.a.a(getActivity()).f99128k;
            if (aweme != null) {
                b.a.f93183a.a(aweme.getAid());
            }
        }
        com.ss.android.ugc.aweme.at.a.c();
        com.ss.android.ugc.aweme.at.a.e();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.z
    public final void c(boolean z2) {
        bd t;
        e activity = getActivity();
        if (activity instanceof com.ss.android.ugc.aweme.main.j) {
            Fragment curFragment = ((com.ss.android.ugc.aweme.main.j) activity).getCurFragment();
            if ((curFragment instanceof com.ss.android.ugc.aweme.main.l) && (((com.ss.android.ugc.aweme.main.l) curFragment).l() instanceof af)) {
                g.a.f99786a.a(getActivity());
                UgAllServiceImpl.c().a(getActivity(), this.n.aD());
            }
        }
        com.ss.android.ugc.aweme.feed.p.b.f.a(true);
        if (getUserVisibleHint() && ab_()) {
            super.c(z2);
            c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.c.a(1, this.n.aD(), this.n));
            if (!z2) {
                this.n.bx();
            } else if (getActivity() != null) {
                DataCenter a2 = DataCenter.a(ae.a(getActivity(), (ad.b) null), this);
                a2.a("tryShowGuideView", (Object) null);
                if (!((Boolean) a2.b("lastTryShowGuideViewResult", (Object) false)).booleanValue()) {
                    this.n.B();
                }
            }
            z();
            getActivity().getWindow().setBackgroundDrawableResource(R.color.a2);
            aj aC = this.n.aC();
            if (!(aC == null || (t = aC.t()) == null)) {
                t.u();
                t.g();
            }
            av avVar = this.n;
            if (avVar != null) {
                com.ss.android.ugc.aweme.share.d.c.f123452d = avVar.aD();
            }
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        String string = bundle.getString(be.f68530b, "");
        String d2 = Hox.a.a(getActivity()).d("For You");
        String d3 = Hox.a.a(getActivity()).d(d2);
        String d4 = Hox.a.a(getActivity()).d(d3);
        if (string.equals(be.f68533e) || bundle.getBoolean(d2)) {
            this.n.e(true);
            if (isResumed() && this.v != null && !this.v.isHidden()) {
                o oVar = new o();
                oVar.f109589a = "homepage_hot";
                oVar.f();
                s.a(com.ss.android.ugc.aweme.feed.af.FEED);
            }
            if (!this.A && com.ss.android.ugc.aweme.feed.ui.instagram.a.f94782g) {
                u();
            }
            c(false);
        } else if (string.equals(be.f68532d) || bundle.getBoolean(d3)) {
            this.n.e(true);
            if (isResumed() && this.v != null && !this.v.isHidden()) {
                o oVar2 = new o();
                oVar2.f109589a = "homepage_hot";
                oVar2.f();
                s.a(com.ss.android.ugc.aweme.feed.af.FEED);
            }
            if (!this.A && com.ss.android.ugc.aweme.feed.ui.instagram.a.f94782g) {
                u();
            }
            c(true);
        } else if (string.equals(be.f68531c) || bundle.getBoolean(d4)) {
            this.n.e(true);
            if (isResumed() && this.v != null && !this.v.isHidden()) {
                o oVar3 = new o();
                oVar3.f109589a = "homepage_hot";
                oVar3.f();
                s.a(com.ss.android.ugc.aweme.feed.af.FEED);
            }
            if (!this.A && com.ss.android.ugc.aweme.feed.ui.instagram.a.f94782g) {
                u();
            }
            c(true);
            aj aC = this.n.aC();
            if (aC != null) {
                aC.c(1);
            }
        }
        com.bytedance.analytics.b.a(this);
    }

    @org.greenrobot.eventbus.r
    public void onVideoPublishEvent(ag agVar) {
        DmtStatusView b2;
        Aweme a2;
        Aweme a3;
        if (agVar.f93450a != 15) {
            return;
        }
        if (!(ec.a() || (ec.b() && ed.a()))) {
            return;
        }
        if (agVar.f93451b instanceof Aweme) {
            Aweme aweme = (Aweme) agVar.f93451b;
            int followerCount = aweme.getAuthor().getFollowerCount();
            if (ec.a(aweme) || (ec.b() && ed.a(followerCount))) {
                if (com.ss.android.ugc.aweme.story.d.a.c(aweme)) {
                    a3 = com.ss.android.ugc.aweme.story.d.a.i((Aweme) agVar.f93451b);
                    com.ss.android.ugc.aweme.story.g.f137757a.f().a(a3);
                } else {
                    a3 = AwemeService.b().a(aweme);
                }
                if (a3 != null && !com.ss.android.ugc.aweme.utils.z.d(a3)) {
                    if (com.ss.android.ugc.aweme.story.d.a.c(aweme)) {
                        ((l) this.f94760j).a(com.ss.android.ugc.aweme.story.g.f137757a.e().a().getAuthorUid());
                        ((l) this.f94760j).b(com.ss.android.ugc.aweme.story.g.f137757a.e().a());
                    } else {
                        ((l) this.f94760j).b(a3);
                    }
                    DmtStatusView b3 = b(true);
                    if (b3 != null) {
                        b3.d();
                    }
                }
            }
        } else if (agVar.f93451b instanceof List) {
            boolean z2 = false;
            for (Aweme aweme2 : ap.a((List) agVar.f93451b)) {
                int followerCount2 = aweme2.getAuthor().getFollowerCount();
                if (ec.a(aweme2) || (ec.b() && ed.a(followerCount2))) {
                    if (com.ss.android.ugc.aweme.story.d.a.c(aweme2)) {
                        a2 = com.ss.android.ugc.aweme.story.d.a.i(aweme2);
                        com.ss.android.ugc.aweme.story.g.f137757a.f().a(a2);
                    } else {
                        a2 = AwemeService.b().a(aweme2);
                    }
                    if (a2 != null && !com.ss.android.ugc.aweme.utils.z.d(a2)) {
                        if (com.ss.android.ugc.aweme.story.d.a.c(aweme2)) {
                            ((l) this.f94760j).a(com.ss.android.ugc.aweme.story.g.f137757a.e().a().getAuthorUid());
                            ((l) this.f94760j).b(com.ss.android.ugc.aweme.story.g.f137757a.e().a());
                        } else {
                            ((l) this.f94760j).b(a2);
                        }
                        z2 = true;
                    }
                }
            }
            if (z2 && (b2 = b(true)) != null) {
                b2.d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.f
    public final void a(h<Aweme> hVar) {
        l lVar = (l) this.f94760j;
        if (lVar.f76396h != null) {
            com.ss.android.ugc.aweme.feed.u.d dVar = (com.ss.android.ugc.aweme.feed.u.d) lVar.f76396h;
            List items = dVar.getItems();
            int i2 = hVar.f76411b;
            List<T> list = hVar.f76410a;
            if (com.bytedance.common.utility.collection.b.a((Collection) items)) {
                items = new ArrayList();
            }
            if (i2 < 0 || i2 > items.size()) {
                throw new com.ss.android.ugc.aweme.common.e.g(i2, items.size());
            }
            items.addAll(i2, list);
            if (items.size() == 1) {
                dVar.setItems(items);
            }
            com.ss.android.ugc.aweme.common.e.i iVar = new com.ss.android.ugc.aweme.common.e.i(hVar, items);
            if (!(dVar.mNotifyListeners == null || dVar.mNotifyListeners.size() == 0)) {
                for (com.ss.android.ugc.aweme.common.o oVar : dVar.mNotifyListeners) {
                    if (oVar instanceof com.ss.android.ugc.aweme.common.e.f) {
                        com.ss.android.ugc.aweme.common.e.f fVar = (com.ss.android.ugc.aweme.common.e.f) oVar;
                        if (!fVar.a(iVar)) {
                            fVar.a(iVar.f76414e, iVar.f76411b);
                        }
                    }
                }
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.detail.g.a aVar) {
        if (aVar != null) {
            av avVar = this.n;
            int aE = avVar.aE() + 1;
            List<Aweme> list = aVar.f79632a;
            if (list != null) {
                int size = list.size();
                List<Aweme> e2 = avVar.W.e();
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    int i3 = 0;
                    while (true) {
                        if (i3 > aE + 2) {
                            break;
                        }
                        if (i3 < e2.size() && list.get(i2).getAid().equals(e2.get(i3).getAid())) {
                            list.remove(i2);
                            break;
                        }
                        i3++;
                    }
                }
                if (list.size() > 0) {
                    k.a(list, aVar.f79633b, 0);
                    a(list, false);
                    if (this.G) {
                        avVar.b(list, aE);
                        avVar.b(aE, true);
                    } else {
                        this.E = list;
                        this.F = aE;
                    }
                }
            }
        }
        if (this.f94757c != null) {
            this.f94757c.setRefreshing(false);
            this.f94757c.setOnRefreshListener(this.D);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue() && this.f94760j != null) {
            com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.f94760j.f76396h;
            v vVar = this.o;
            if (!com.ss.android.ugc.aweme.feed.cache.f.f92719b && !com.ss.android.ugc.aweme.feed.cache.f.f92718a && aVar != null && vVar != null && com.ss.android.ugc.aweme.feed.experiment.o.c() && com.bytedance.ies.ugc.appcontext.f.f34637l) {
                com.ss.android.ugc.aweme.feed.cache.f.f92718a = true;
                T t = aVar.mData;
                List items = aVar.getItems();
                int i2 = vVar.f95145a + 1;
                if (items == null || i2 >= items.size()) {
                    com.ss.android.ugc.aweme.feed.cache.f.f92718a = false;
                    return;
                }
                if (i2 < items.size()) {
                    items.subList(0, i2).clear();
                }
                if (!items.isEmpty() && items.size() > 2) {
                    items.subList(2, items.size()).clear();
                }
                h.f.b.l.b(t, "");
                com.ss.android.ugc.aweme.feed.cache.f.a(t, true);
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private void a(List<Aweme> list, boolean z2) {
        av avVar;
        if (this.z != null && list != null && !list.isEmpty()) {
            Aweme aweme = null;
            Iterator<Aweme> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Aweme next = it.next();
                if (this.z.b(next)) {
                    aweme = next;
                    break;
                }
            }
            if (!this.z.a(aweme)) {
                this.z.f93331f = new ak(this);
            } else if (z2 && (avVar = this.n) != null) {
                com.ss.android.ugc.aweme.feed.helper.g.b(avVar.aC());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.feed.ui.f, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.ui.z
    public void onViewCreated(View view, Bundle bundle) {
        Message message;
        String str;
        String str2;
        String str3;
        Lock lock;
        boolean booleanValue;
        MethodCollector.i(5078);
        a.b.f109011a.a("cold_boot_feed_fragment_view_created", false);
        a.b.f109011a.a("cold_boot_feed_fragment_super_on_view_created", false);
        super.onViewCreated(view, bundle);
        a.b.f109011a.b("cold_boot_feed_fragment_super_on_view_created", false);
        a.b.f109011a.a("cold_boot_feed_fragment_init_ad", false);
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (f2 != null) {
            this.q = f2.b();
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.a aVar = new com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.a();
            h.f.b.l.d(this, "");
            aVar.f34650a = this;
            aVar.f34651b = new com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.c() {
                /* class com.ss.android.ugc.aweme.feed.ui.af.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(59864);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.c
                public final boolean a(Fragment fragment) {
                    return com.ss.android.ugc.aweme.commercialize.g.d().a(fragment);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.c
                public final void a(boolean z, String str) {
                    if (z) {
                        a.b.f109011a.a(str, false);
                    } else {
                        a.b.f109011a.b(str, false);
                    }
                }
            };
            this.q.a(aVar);
        }
        a.b.f109011a.b("cold_boot_feed_fragment_init_ad", false);
        a.b.f109011a.a("cold_boot_feed_fragment_full_feed_panel_view_create", false);
        this.n.a(view, bundle);
        a.b.f109011a.b("cold_boot_feed_fragment_full_feed_panel_view_create", false);
        a.b.f109011a.a("cold_boot_feed_fragment_init_view", false);
        p.a.a().a("onViewCreated");
        this.n.a((al) this);
        this.n.a((com.ss.android.ugc.aweme.feed.n.c) this);
        this.n.as = this;
        this.n.at = this;
        this.n.t = this;
        this.D = new SwipeRefreshLayout.b() {
            /* class com.ss.android.ugc.aweme.feed.ui.af.AnonymousClass2 */

            static {
                Covode.recordClassIndex(59865);
            }

            private static boolean b() {
                try {
                    return f.a.f68431a.c();
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
            public final void a() {
                if (!(af.this.getActivity() == null || af.this.getActivity().getWindow() == null)) {
                    af.this.getActivity().getWindow().getDecorView().setBackgroundColor(androidx.core.content.b.c(af.this.getActivity(), R.color.a2));
                }
                af.this.getActivity();
                if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                    com.ss.android.ugc.aweme.lancet.j.f107229h = b();
                }
                if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(af.this.getActivity()).a(R.string.de8).a();
                    af.this.f94761k.setRefreshing(false);
                    return;
                }
                af.this.h();
                if (af.this.g()) {
                    af.this.b("slide_down");
                    af.this.f94760j.a(1, 0, 1, Boolean.valueOf(af.this.o.a()));
                } else {
                    af.this.f94760j.a(2, 0, 3);
                }
                if (com.ss.android.ugc.aweme.feed.p.b.a()) {
                    com.ss.android.ugc.aweme.feed.p.a.b();
                }
                c.a(new com.ss.android.ugc.aweme.ug.guide.c(0));
            }
        };
        this.f94757c.setOnRefreshListener(this.D);
        this.n.a((ViewPager.e) new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.feed.ui.af.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            int f94225a = -1;

            static {
                Covode.recordClassIndex(59866);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
                if (r18 == (r17.f94226b.n.W.getCount() - 1)) goto L_0x00d7;
             */
            @Override // androidx.viewpager.widget.ViewPager.e
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(final int r18) {
                /*
                // Method dump skipped, instructions count: 243
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.af.AnonymousClass3.onPageSelected(int):void");
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
                if (af.this.n.aD() != null && com.ss.android.ugc.aweme.commercialize.e.a.b.B(af.this.n.aD()) && com.ss.android.ugc.aweme.commercialize.e.a.b.m(af.this.n.aD()).getSwipeUpType() == 5 && af.this.p.a()) {
                    af.this.p.f34659c.setValue(Float.valueOf((float) i3));
                }
                if (i2 == this.f94225a && f2 < 1.0E-10f) {
                    this.f94225a = -1;
                }
                if (af.this.o != null && f2 > 0.0f) {
                    v vVar = af.this.o;
                    int i4 = i2 + 1;
                    if (i4 > vVar.f95145a) {
                        vVar.f95145a = i4;
                    }
                }
            }
        });
        this.f94760j.a_(this.n);
        ((l) this.f94760j).f94048d = this.n;
        ((l) this.f94760j).f94046b = this.n;
        this.f94760j.a((com.ss.android.ugc.aweme.common.b) new com.ss.android.ugc.aweme.feed.u.d());
        this.f94760j.a((com.ss.android.ugc.aweme.common.e.d) this.n);
        this.o = new v(this.f94760j);
        com.ss.android.ugc.aweme.net.k.a aVar2 = a.C2871a.f112433a;
        e activity = getActivity();
        if (com.ss.android.ugc.aweme.net.k.a.f112431b == null) {
            Boolean c2 = SharePrefCache.inst().getShowVideoBitrateInfo().c();
            if (c2 == null) {
                booleanValue = false;
            } else {
                booleanValue = c2.booleanValue();
            }
            com.ss.android.ugc.aweme.net.k.a.f112431b = Boolean.valueOf(booleanValue);
        }
        if (com.ss.android.ugc.aweme.net.k.a.f112431b.booleanValue()) {
            aVar2.f112432a = new TextView(activity);
            aVar2.f112432a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            aVar2.f112432a.setPadding(10, (int) n.b(activity, 30.0f), 0, 0);
            aVar2.f112432a.setTextColor(-65536);
            ((FrameLayout) activity.findViewById(16908290)).addView(aVar2.f112432a);
        }
        h();
        a.b.f109011a.b("cold_boot_feed_fragment_init_view", false);
        a.b.f109011a.a("cold_boot_feed_recommend_fragment_send_request", false);
        a.b.f109011a.a("method_first_feed_request", false);
        if (getActivity() instanceof com.ss.android.ugc.aweme.main.j) {
            HomePageDataViewModel a2 = HomePageDataViewModel.a.a(getActivity());
            com.ss.android.ugc.aweme.homepage.api.data.a aVar3 = a2.f99120c;
            str2 = aVar3.a();
            str3 = aVar3.b();
            str = aVar3.c();
            lock = a2.f99121d;
            message = a2.f99122e;
        } else {
            message = null;
            str = null;
            str2 = null;
            str3 = null;
            lock = null;
        }
        if (!((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).a().equals("")) {
            str3 = ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).a();
        }
        h();
        this.f94760j.a(1, 0, 0, str2, str3, str, lock, message);
        if (!TextUtils.isEmpty(str2)) {
            c(str2);
        }
        a.b.f109011a.b("cold_boot_feed_recommend_fragment_send_request", false);
        a.b.f109011a.a("cold_boot_feed_recommend_startup_to_create_end", false);
        z();
        if (getActivity() instanceof com.ss.android.ugc.aweme.main.j) {
            ((com.ss.android.ugc.aweme.main.j) getActivity()).onFeedRecommendFragmentReady();
        }
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.a.b bVar = this.q;
        if (bVar != null) {
            bVar.a();
        }
        if (this.r == null && com.ss.android.ugc.aweme.feed.p.b.a()) {
            this.r = com.ss.android.ugc.aweme.feed.p.b.a.c.a(getActivity(), this.f94756b);
        }
        com.ss.android.ugc.aweme.feed.p.b.f.a(true);
        if (!t.f93901b) {
            t.f93901b = true;
            AppLog.addSessionHook(new t.a((byte) 0));
        }
        t.f93900a = SystemClock.uptimeMillis();
        this.C = DataCenter.a(ae.a(getActivity(), (ad.b) null), this);
        this.p = AdHomePageDataVM.a.a(getActivity());
        this.C.a("onNewIntent", new ah(this), true);
        e activity2 = getActivity();
        if (activity2 instanceof com.ss.android.ugc.aweme.main.j) {
            ScrollSwitchStateManager a3 = ScrollSwitchStateManager.a.a(activity2);
            a3.b(getActivity(), new ai(this, a3));
        }
        this.H = com.bytedance.ies.ugc.appcontext.f.g().d(new aj(this));
        if (this.f94762l != null) {
            if (hi.f90219a) {
                VerticalViewPager verticalViewPager = this.f94762l;
                int i2 = 5000;
                if (hj.f90220a <= 5000) {
                    if (hj.f90220a < 0) {
                        i2 = 0;
                    } else {
                        i2 = hj.f90220a;
                    }
                }
                verticalViewPager.setEndScrollDelayTime(i2);
            }
            if (hk.f90221a) {
                VerticalViewPager verticalViewPager2 = this.f94762l;
                int i3 = 100;
                if (hl.f90222a > 800) {
                    i3 = 800;
                } else if (hl.f90222a >= 100) {
                    i3 = hl.f90222a;
                }
                verticalViewPager2.setMaxSettleDuration(i3);
            }
        }
        a.b.f109011a.b("cold_boot_feed_recommend_startup_to_create_end", false);
        a.b.f109011a.b("cold_boot_feed_fragment_view_created", false);
        a.b.f109011a.a("cold_boot_feed_view_created_to_focus", false);
        MethodCollector.o(5078);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2;
        a.b.f109011a.a("cold_boot_feed_fragment_create_view", false);
        p.a.a().a("onCreateView");
        if (com.ss.android.ugc.aweme.s.e.d()) {
            a2 = com.a.b.c.a((Activity) getActivity(), (int) R.layout.s7);
        } else {
            a2 = com.a.b.c.a((Activity) getActivity(), (int) R.layout.s2);
        }
        a.b.f109011a.b("cold_boot_feed_fragment_create_view", false);
        return a2;
    }
}
