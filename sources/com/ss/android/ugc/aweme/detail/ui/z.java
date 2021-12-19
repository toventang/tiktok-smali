package com.ss.android.ugc.aweme.detail.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.at.a;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.d;
import com.ss.android.ugc.aweme.base.ui.e;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.h.ab;
import com.ss.android.ugc.aweme.detail.h.ad;
import com.ss.android.ugc.aweme.detail.h.ag;
import com.ss.android.ugc.aweme.detail.h.ah;
import com.ss.android.ugc.aweme.detail.h.b;
import com.ss.android.ugc.aweme.detail.h.v;
import com.ss.android.ugc.aweme.detail.h.w;
import com.ss.android.ugc.aweme.detail.h.x;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.k;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager;
import com.ss.android.ugc.aweme.detail.ui.y;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.al;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.feed.i.m;
import com.ss.android.ugc.aweme.feed.i.p;
import com.ss.android.ugc.aweme.feed.i.q;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.feed.n.c;
import com.ss.android.ugc.aweme.feed.n.d;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.main.o;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.utils.cz;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.hb;
import com.ss.android.ugc.aweme.video.FeedPlayerManagerViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class z extends e implements u<b>, b.AbstractC1859b, am, al, com.ss.android.ugc.aweme.feed.n.b, c, d, d, i, j {
    private AnimatorSet A;
    private boolean B = true;

    /* renamed from: a  reason: collision with root package name */
    protected DmtStatusView f79986a;

    /* renamed from: b  reason: collision with root package name */
    View f79987b;

    /* renamed from: c  reason: collision with root package name */
    protected View f79988c;

    /* renamed from: d  reason: collision with root package name */
    protected TuxIconView f79989d;

    /* renamed from: e  reason: collision with root package name */
    protected FeedSwipeRefreshLayout f79990e;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.param.b f79991j = new com.ss.android.ugc.aweme.feed.param.b();

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.detail.h.b f79992k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f79993l = false;

    /* renamed from: m  reason: collision with root package name */
    boolean f79994m = true;
    boolean n;
    int o = 0;
    public aa p = null;
    private ViewStub q;
    private View r;
    private LoadMoreFrameLayout s;
    private ViewStub t;
    private View u;
    private boolean v = false;
    private o w;
    private hb y = new hb() {
        /* class com.ss.android.ugc.aweme.detail.ui.z.AnonymousClass1 */

        static {
            Covode.recordClassIndex(49776);
        }

        @Override // com.ss.android.ugc.aweme.utils.hb, com.ss.android.ugc.aweme.utils.dl
        public final void b(String str) {
            cz b2;
            super.b(str);
            VerticalViewPager verticalViewPager = z.this.f79992k.N;
            com.ss.android.ugc.aweme.feed.adapter.b bVar = z.this.f79992k.W;
            if (verticalViewPager != null && bVar != null && (b2 = da.a.b(str)) != null) {
                b2.a("next_video", a.a(bVar.c(verticalViewPager.getCurrentItem())));
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.hb, com.ss.android.ugc.aweme.utils.dl
        public final void a(String str) {
            cz b2;
            super.a(str);
            VerticalViewPager verticalViewPager = z.this.f79992k.N;
            com.ss.android.ugc.aweme.feed.adapter.b bVar = z.this.f79992k.W;
            if (verticalViewPager != null && bVar != null && (b2 = da.a.b(str)) != null) {
                int currentItem = verticalViewPager.getCurrentItem();
                b2.a("launch_vv", Integer.toString(currentItem)).a("current_video", a.a(bVar.c(currentItem)));
                if (z.this.f79991j.isStoryPage()) {
                    b2.a("enter_from", z.this.f79991j.getEventType()).a("extra_desc", "story_vertical_viewpager");
                }
            }
        }
    };
    private DataCenter z;

    static {
        Covode.recordClassIndex(49775);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(198, new g(z.class, "onFeedFetchEvent", m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(63, new g(z.class, "onDislikeAwemeEvent", f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(35, new g(z.class, "onBlockUserEvent", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(21, new g(z.class, "onMobEnterFromEvent", p.class, ThreadMode.POSTING, 0, false));
        hashMap.put(22, new g(z.class, "onMobRequestIdEvent", q.class, ThreadMode.POSTING, 0, false));
        hashMap.put(199, new g(z.class, "onDismissTitleTabEvent", com.ss.android.ugc.aweme.feed.i.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.am
    public final DmtStatusView p() {
        return this.f79986a;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.al
    public final void a() {
        d(4);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.am
    public boolean bi_() {
        return this.f79992k.S();
    }

    public final void n() {
        d(1);
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private void l() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a
    public final SparseArray<com.ss.android.ugc.b.a.a.c> G() {
        SparseArray<com.ss.android.ugc.b.a.a.c> G = super.G();
        x();
        G.append(d.a.f68100c, this.f79992k);
        return G;
    }

    /* access modifiers changed from: protected */
    public JediViewModel j() {
        JediViewModel jediViewModel = ae.f95297b;
        if (ae.f95297b == jediViewModel) {
            ae.f95297b = null;
        }
        return jediViewModel;
    }

    public final boolean o() {
        com.ss.android.ugc.aweme.detail.h.b bVar = this.f79992k;
        if (bVar == null || !bVar.bo()) {
            return false;
        }
        return true;
    }

    public final String q() {
        return ac.i(AwemeChangeCallBack.a(getActivity()));
    }

    private static boolean i() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean d2 = d();
        com.ss.android.ugc.aweme.lancet.j.f107229h = d2;
        return d2;
    }

    private void x() {
        if (this.f79992k == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                a(arguments);
            } else {
                this.f79991j.setEventType("");
            }
            this.f79992k = c();
        }
    }

    private void v() {
        Aweme y2 = this.f79992k.y();
        String from = this.f79991j.getFrom();
        if (y2 != null && from != null) {
            if (BusinessComponentServiceUtils.getMediumWebViewRefHolder().a()) {
                BusinessComponentServiceUtils.getMediumWebViewRefHolder().a(y2, "exit");
            }
            if (com.ss.android.ugc.aweme.discover.b.f80832a.b().a()) {
                com.ss.android.ugc.aweme.discover.b.f80832a.b().a(y2, "exit", from);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b.AbstractC1859b
    public final void b() {
        MethodCollector.i(5497);
        BusinessComponentServiceUtils.getBusinessBridgeService();
        this.t.setLayoutResource(R.layout.aj6);
        this.t.inflate();
        ScrollSwitchStateManager.a.a(getActivity()).a(false);
        MethodCollector.o(5497);
    }

    @Override // com.ss.android.ugc.aweme.feed.n.c
    public final boolean k() {
        aa aaVar = this.p;
        if (aaVar == null || aaVar.isLoading() || this.p.cannotLoadMore()) {
            return false;
        }
        aa aaVar2 = this.p;
        if (aaVar2 instanceof aa.b) {
            ((aa.b) aaVar2).setPreLoad(true);
        } else {
            this.f79992k.c(true);
        }
        return d(4);
    }

    @Override // com.ss.android.ugc.aweme.feed.n.b
    public final boolean m() {
        aa aaVar = this.p;
        if (aaVar == null || aaVar.isLoading() || this.p.cannotLoadLatest()) {
            return false;
        }
        aa aaVar2 = this.p;
        if (!(aaVar2 instanceof aa.a)) {
            return false;
        }
        if (aaVar2 instanceof aa.b) {
            ((aa.b) aaVar2).setPreLoad(true);
        } else {
            this.f79992k.c(true);
        }
        return d(2);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f79991j.isfollowSkyLight().booleanValue()) {
            com.ss.android.ugc.aweme.feed.helper.m.f93407a = new LinkedHashMap();
            com.ss.android.ugc.aweme.feed.helper.m.f93408b = new LinkedHashMap();
        }
        da.a.a("detail_page").c();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f79992k.r();
        aa aaVar = this.p;
        if (aaVar != null) {
            aaVar.unInit();
        }
        com.ss.android.ugc.aweme.video.o.f143498a = false;
        if (com.ss.android.ugc.aweme.video.o.c()) {
            this.f79992k.aN().C();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r() {
        getActivity();
        if (!i()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.de8).a();
            this.f79990e.setRefreshing(false);
            return;
        }
        aa aaVar = this.p;
        com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
        aaVar.request(2, bVar, bVar.getVideoType(), this.v);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            View view = this.f79988c;
            com.bytedance.ies.dmt.ui.f.d.a(view, view.getAlpha(), 1.0f);
            View view2 = this.u;
            com.bytedance.ies.dmt.ui.f.d.a(view2, view2.getAlpha(), 1.0f);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.f(activity.hashCode(), (byte) 0));
        }
    }

    private void w() {
        androidx.fragment.app.e activity;
        v();
        if (!this.f79993l) {
            if (MSAdaptionService.c().c((Context) getActivity())) {
                SmartRouter.buildRoute(getActivity(), "//duo").withParam("duo_type", "duo_back").open();
                return;
            }
            l();
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
            if (bVar != null && bVar.isFromAdsActivity() && (activity = getActivity()) != null) {
                activity.overridePendingTransition(R.anim.cg, R.anim.cg);
            }
        }
    }

    /* renamed from: g */
    public final void t() {
        if ("westwindow".equals(this.f79991j.getEventType())) {
            h.a("click");
        }
        if (AwemeChangeCallBack.a(getActivity()) != null && AwemeChangeCallBack.a(getActivity()).isAd()) {
            com.ss.android.ugc.aweme.commercialize.g.e().a(AwemeChangeCallBack.a(getActivity()), getContext(), this.f79988c);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "search_return", AwemeChangeCallBack.a(getActivity()).getAwemeRawAd()).b();
        }
        this.f79992k.G();
        w();
    }

    public com.ss.android.ugc.aweme.detail.h.b c() {
        Object obj;
        boolean z2;
        boolean z3;
        com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
        Bundle arguments = getArguments();
        String str = "";
        l.d(bVar, str);
        String eventType = bVar.getEventType();
        if (eventType != null) {
            str = eventType;
        }
        Music music = null;
        if (arguments != null) {
            obj = y.a.a(arguments, "feed_data_music");
        } else {
            obj = null;
        }
        if (obj instanceof Music) {
            music = obj;
        }
        Music music2 = music;
        if (l.a((Object) bVar.getFrom(), (Object) "from_publish_add_video")) {
            return new com.ss.android.ugc.aweme.detail.h.a(arguments);
        }
        if (l.a((Object) str, (Object) "sticker_profile_detail")) {
            return new ab(arguments);
        }
        if (y.a.a() && bVar.getShowAnswerQuestionButton() == 1) {
            return new w(arguments);
        }
        if (y.a.a() && l.a((Object) str, (Object) "single_song") && !CommerceMediaServiceImpl.f().b(music2)) {
            return new v(arguments, bVar);
        }
        if (y.a.a() && l.a((Object) str, (Object) "mv_page")) {
            return new com.ss.android.ugc.aweme.detail.h.u(arguments);
        }
        if (y.a.a() && l.a((Object) str, (Object) "prop_page")) {
            return new com.ss.android.ugc.aweme.detail.h.ac(arguments);
        }
        if (com.ss.android.ugc.aweme.story.c.b.a() == 5) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!n.b("personal_homepage", "others_homepage").contains(bVar.getEventType()) || bVar.getVideoType() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean isStoryPage = bVar.isStoryPage();
        if (z2 && (z3 || isStoryPage)) {
            return new ag(bVar);
        }
        if (bVar.isStoryPage() && com.ss.android.ugc.aweme.story.g.f137757a.a()) {
            int a2 = com.ss.android.ugc.aweme.story.c.b.a();
            if (a2 == 1) {
                return new com.ss.android.ugc.aweme.detail.h.ae(bVar);
            }
            if (a2 != 2) {
                return new ah(bVar);
            }
            return new ad(bVar);
        } else if (!l.a((Object) bVar.getFrom(), (Object) "from_chat") || !com.ss.android.ugc.aweme.im.service.c.f.b()) {
            return new com.ss.android.ugc.aweme.detail.h.b(bVar);
        } else {
            return new x(arguments, bVar);
        }
    }

    public final void b(boolean z2) {
        com.ss.android.ugc.aweme.detail.h.b bVar = this.f79992k;
        if (bVar != null) {
            bVar.f(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        this.f79990e.setEnabled(bool.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.am
    public final boolean b(int i2) {
        if (this.f79992k.W.getCount() - 1 > i2) {
            return true;
        }
        return false;
    }

    @r
    public void onFeedFetchEvent(m mVar) {
        if (TextUtils.equals(mVar.f93486a, "from_cell_recommend")) {
            d(4);
        }
    }

    private void a(Bundle bundle) {
        this.f79991j = (com.ss.android.ugc.aweme.feed.param.b) bundle.getSerializable("feed_param");
        this.v = bundle.getBoolean("extra_challenge_is_hashtag", false);
    }

    private boolean c(int i2) {
        if (i2 != 1) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f79991j.getCid()) || !TextUtils.isEmpty(this.f79991j.getLikeListIds())) {
            return true;
        }
        return false;
    }

    @r
    public void onMobEnterFromEvent(p pVar) {
        if (pVar != null && this.w != null && getActivity() != null) {
            HomePageDataViewModel.a.a(getActivity()).a(pVar.f93488a);
        }
    }

    @r
    public void onMobRequestIdEvent(q qVar) {
        if (qVar != null && this.w != null && getActivity() != null) {
            HomePageDataViewModel.a.a(getActivity()).f99127j = qVar.f93489a;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.d
    public final boolean a(Aweme aweme) {
        return a(aweme.getAid());
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        x();
        super.setUserVisibleHint(z2);
        this.f79992k.e(z2);
        if (z2) {
            this.f79992k.b(true);
            this.f79992k.u = true;
            this.f79992k.B();
            return;
        }
        this.f79992k.b(false);
        this.f79992k.u = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.n.d
    public final boolean a(String str) {
        aa aaVar = this.p;
        if (aaVar == null || !aaVar.deleteItem(str)) {
            return false;
        }
        return true;
    }

    @r
    public void onBlockUserEvent(com.ss.android.ugc.aweme.profile.b.a aVar) {
        com.ss.android.ugc.aweme.feed.param.b bVar;
        if (!((Boolean) com.ss.android.ugc.aweme.detail.c.a.f79618b.getValue()).booleanValue() || (bVar = this.f79991j) == null || !TextUtils.equals(bVar.getEventType(), "personal_homepage") || aVar == null || aVar.f116043a == null || this.f79992k.y() == null || TextUtils.equals(aVar.f116043a.getUid(), this.f79992k.y().getAuthorUid())) {
            d(1);
        }
    }

    private boolean d(int i2) {
        Aweme b2;
        com.ss.android.ugc.aweme.detail.h.b bVar;
        Aweme b3;
        com.ss.android.ugc.aweme.detail.h.b bVar2;
        aa aaVar = this.p;
        boolean z2 = false;
        if (aaVar != null && !aaVar.isLoading()) {
            if (this.f79991j.isFromChatRoomPlaying()) {
                this.f79991j.setIsFromChatRoomPlaying(false);
                FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f79990e;
                if (feedSwipeRefreshLayout != null) {
                    feedSwipeRefreshLayout.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.detail.ui.z.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(49777);
                        }

                        public final void run() {
                            z.this.k();
                        }
                    }, 200);
                }
            }
            z2 = true;
            if (!TextUtils.equals("from_local", this.f79991j.getQueryAwemeMode()) || (b3 = AwemeService.b().b(this.f79991j.getAid())) == null || (bVar2 = this.f79992k) == null) {
                if (!(!c(i2) || (b2 = AwemeService.b().b(this.f79991j.getAid())) == null || (bVar = this.f79992k) == null)) {
                    bVar.c(b2);
                }
                if (this.f79991j.isShouldQueryMyStoryFromCache()) {
                    Aweme a2 = com.ss.android.ugc.aweme.story.g.f137757a.e().a();
                    com.ss.android.ugc.aweme.detail.h.b bVar3 = this.f79992k;
                    if (bVar3 != null) {
                        bVar3.a(a2);
                        return true;
                    }
                }
                aa aaVar2 = this.p;
                com.ss.android.ugc.aweme.feed.param.b bVar4 = this.f79991j;
                aaVar2.request(i2, bVar4, bVar4.getVideoType(), this.v);
            } else {
                bVar2.a(b3);
                return true;
            }
        }
        return z2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        com.ss.android.ugc.aweme.detail.h.b bVar2;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar3 = bVar;
        if (bVar3 != null) {
            String str = bVar3.f67014a;
            str.hashCode();
            int i2 = 0;
            int i3 = -1;
            switch (str.hashCode()) {
                case -1852517575:
                    if (str.equals("feed_enter_transition_end") && (bVar2 = this.f79992k) != null) {
                        aj aC = bVar2.aC();
                        if (aC instanceof ce) {
                            ((ce) aC).i();
                            return;
                        }
                        return;
                    }
                    return;
                case -1013481626:
                    if (str.equals("onBack")) {
                        w();
                        return;
                    }
                    return;
                case 22405807:
                    if (str.equals("action_remove_recommend_user_card") && bVar3.a() != null) {
                        String str2 = (String) bVar3.a();
                        List<Aweme> e2 = this.f79992k.W.e();
                        if (e2 != null && e2.size() > 0) {
                            while (true) {
                                if (i2 < e2.size()) {
                                    if (e2.get(i2) == null || !TextUtils.equals(e2.get(i2).getAid(), str2)) {
                                        i2++;
                                    } else {
                                        i3 = i2;
                                    }
                                }
                            }
                        }
                        this.f79992k.b(i3);
                        return;
                    }
                    return;
                case 89664936:
                    if (str.equals("feed_transition_state")) {
                        b(((Boolean) bVar3.a()).booleanValue());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @r
    public void onDismissTitleTabEvent(com.ss.android.ugc.aweme.feed.i.j jVar) {
        ObjectAnimator ofFloat;
        if (this.B != jVar.f93483a && this.f79987b != null) {
            AnimatorSet animatorSet = this.A;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.A.cancel();
            }
            this.B = jVar.f93483a;
            this.A = new AnimatorSet();
            if (jVar.f93483a) {
                this.f79987b.setVisibility(0);
                if (jVar.f93484b == 0) {
                    View view = this.f79987b;
                    ofFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
                } else {
                    ofFloat = ObjectAnimator.ofFloat(this.f79987b, "alpha", 0.0f, 1.0f);
                }
            } else if (jVar.f93484b == 0) {
                View view2 = this.f79987b;
                ofFloat = ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), (float) (-this.f79987b.getHeight()));
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.f79987b, "alpha", 1.0f, 0.0f);
            }
            if (jVar.f93484b == 0) {
                this.A.setDuration(300L);
            } else {
                this.A.setDuration(150L);
            }
            this.A.play(ofFloat);
            this.A.start();
        }
    }

    public aa a(com.ss.android.ugc.aweme.common.e.a aVar) {
        com.ss.android.ugc.aweme.detail.operators.ae aeVar;
        Class<? extends BaseDetailShareVM<?, ?, ?>> second;
        com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
        JediViewModel<?> j2 = j();
        String from = bVar.getFrom();
        if (s.f79834a.size() == 0) {
            for (IDetailPageOperatorService iDetailPageOperatorService : ServiceManager.get().getServices(IDetailPageOperatorService.class)) {
                HashMap<String, com.ss.android.ugc.aweme.detail.operators.ab> a2 = iDetailPageOperatorService.a();
                if (a2 != null) {
                    s.f79834a.putAll(a2);
                }
            }
        }
        if (!TextUtils.isEmpty(from)) {
            if (s.f79834a.containsKey(from)) {
                com.ss.android.ugc.aweme.detail.operators.ab abVar = s.f79834a.get(from);
                if (abVar != null) {
                    return abVar.a(bVar, aVar, j2);
                }
            } else {
                aa a3 = BusinessComponentServiceUtils.getDetailPageOperatorProvider().a(from, bVar, aVar, j2);
                if (a3 != null) {
                    return a3;
                }
            }
        }
        if (s.f79835b.size() == 0 && ServiceManager.get().getServices(IDetailPageShareVMService.class) != null) {
            for (IDetailPageShareVMService iDetailPageShareVMService : ServiceManager.get().getServices(IDetailPageShareVMService.class)) {
                HashMap<String, com.ss.android.ugc.aweme.detail.operators.ae> a4 = iDetailPageShareVMService.a();
                if (a4 != null) {
                    s.f79835b.putAll(a4);
                }
            }
        }
        if (!TextUtils.isEmpty(from) && s.f79835b.containsKey(from) && (aeVar = s.f79835b.get(from)) != null) {
            l.d(aeVar, "");
            l.d(bVar, "");
            l.d(this, "");
            h.p<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> a5 = aeVar.a(bVar);
            if (!(a5 == null || (second = a5.getSecond()) == null)) {
                SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider();
                androidx.lifecycle.i lifecycle = getLifecycle();
                l.b(lifecycle, "");
                BaseDetailShareVM baseDetailShareVM = (BaseDetailShareVM) sharedViewModelProvider.a(lifecycle, a5.getFirst(), second);
                if (!baseDetailShareVM.f25685b) {
                    l.d(this, "");
                    if (!baseDetailShareVM.f25685b) {
                        a.C0535a.a(baseDetailShareVM, new BaseDetailShareVM.j(this), null, null, BaseDetailShareVM.k.f80020a, BaseDetailShareVM.l.f80021a);
                    }
                }
                return baseDetailShareVM;
            }
        }
        if (!TextUtils.isEmpty(bVar.getIds()) || !TextUtils.isEmpty(bVar.getPushParams())) {
            return new com.ss.android.ugc.aweme.detail.operators.e(bVar.getIds());
        }
        return new k();
    }

    @r
    public void onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.i.f fVar) {
        String str;
        if (getActivity() != null && fVar.f93479e == getActivity().hashCode() && !com.ss.android.ugc.aweme.login.b.a.a(AwemeChangeCallBack.a(getActivity())) && fVar.f93476b == 2) {
            boolean z2 = fVar.f93475a;
            ScrollSwitchStateManager.a.a(getActivity()).a(!z2);
            if (z2) {
                View view = this.f79988c;
                com.bytedance.ies.dmt.ui.f.d.a(view, view.getAlpha(), 0.0f);
                View view2 = this.u;
                com.bytedance.ies.dmt.ui.f.d.a(view2, view2.getAlpha(), 0.0f);
                if (fVar.a() && AwemeChangeCallBack.a(getActivity()) != null) {
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", AwemeChangeCallBack.a(getActivity()).getAid());
                    if (AwemeChangeCallBack.a(getActivity()).getAuthor() != null) {
                        str = AwemeChangeCallBack.a(getActivity()).getAuthor().getUid();
                    } else {
                        str = "";
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str).a("content_type", ac.g(AwemeChangeCallBack.a(getActivity()))).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(AwemeChangeCallBack.a(getActivity())))).a("enter_from", this.f79992k.aJ.getEventType()).a("enter_method", "detail");
                    h.a(a3, this.f79992k.bL());
                    if (this.f79992k.y() != null) {
                        com.ss.android.ugc.aweme.upvote.event.c.a(a3, this.f79992k.y(), this.f79992k.aJ.getEventType());
                    }
                    com.ss.android.ugc.aweme.common.r.a("click_trans_layer", a3.f66730a);
                    Dialog newOptionsDialog = BusinessComponentServiceUtils.newOptionsDialog(getContext(), this.f79992k.y(), this.f79992k.aJ.getEventType());
                    newOptionsDialog.setOnDismissListener(new ad(this));
                    newOptionsDialog.show();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean equals;
        String str;
        MethodCollector.i(6201);
        super.onViewCreated(view, bundle);
        this.f79987b = view.findViewById(R.id.b9a);
        this.q = (ViewStub) view.findViewById(R.id.b9_);
        this.f79988c = view.findViewById(R.id.qb);
        this.f79989d = (TuxIconView) view.findViewById(R.id.a7y);
        this.f79988c.setOnClickListener(new ae(this));
        this.f79989d.setOnClickListener(new af(this));
        this.s = (LoadMoreFrameLayout) view.findViewById(R.id.cic);
        this.f79990e = (FeedSwipeRefreshLayout) view.findViewById(R.id.dk8);
        this.t = (ViewStub) view.findViewById(R.id.ed7);
        this.u = view.findViewById(R.id.c0w);
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        this.w = com.ss.android.ugc.aweme.main.a.a.a(getActivity());
        this.f79986a = new DmtStatusView(getContext());
        this.s.addView(this.f79986a, new FrameLayout.LayoutParams(-1, -1));
        this.f79986a.setVisibility(8);
        if (TextUtils.equals(this.f79991j.getEventType(), "feed_low_quality") && this.f79991j.isNewLowQualityUser()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.d1b).a();
        }
        if (!TextUtils.isEmpty(this.f79991j.getDetailTitleText())) {
            View inflate = this.q.inflate();
            this.r = inflate;
            ((TuxTextView) inflate.findViewById(R.id.b99)).setText(this.f79991j.getDetailTitleText());
        }
        this.f79986a.setBuilder(DmtStatusView.a.a(getActivity()));
        this.f79986a.setBackgroundColor(0);
        ((ViewGroup.MarginLayoutParams) this.f79987b.getLayoutParams()).topMargin = com.bytedance.tux.h.e.a(getContext());
        if (this.f79992k != null) {
            int b2 = (int) com.bytedance.common.utility.n.b(getContext(), 15.0f);
            ScrollSwitchStateManager a2 = ScrollSwitchStateManager.a.a(getActivity());
            HomePageDataViewModel a3 = HomePageDataViewModel.a.a(getActivity());
            androidx.fragment.app.e activity = getActivity();
            aa aaVar = new aa(this, a2, b2);
            l.d(activity, "");
            l.d(aaVar, "");
            a2.f99144f.observe(activity, aaVar);
            a2.b(getActivity(), new ab(this, a2, a3));
            a2.c(getActivity(), new ac(this));
            getContext();
            if (!i()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.de8).a();
                new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.de8).a();
            }
        }
        this.z = DataCenter.a(androidx.lifecycle.ae.a(getActivity(), (ad.b) null), this).a("action_remove_recommend_user_card", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("onBack", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("feed_transition_state", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("feed_enter_transition_end", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.f79990e.setEnabled(false);
        com.ss.android.ugc.aweme.common.e.a aVar = ae.f95296a;
        aa a4 = a(aVar);
        this.p = a4;
        int pageType = a4.getPageType(this.f79991j.getVideoType());
        if (!this.p.init(this)) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            MethodCollector.o(6201);
            return;
        }
        aa aaVar2 = this.p;
        if (aaVar2 instanceof aa.b) {
            ((aa.b) aaVar2).bindPreLoadView(this.f79992k);
        }
        if ((this.p instanceof aa.a) && (!this.f79991j.isfollowSkyLight().booleanValue() || this.f79991j.isHasLatestFollowingUser())) {
            this.f79990e.setEnabled(true);
            DetailLoadStateManager.a.a(getActivity()).f79903a.observe(this, new ag(this));
            this.f79990e.setOnRefreshListener(new ah(this));
        }
        this.f79991j.setPageType(pageType);
        com.ss.android.ugc.aweme.video.i iVar = com.ss.android.ugc.aweme.feed.helper.h.a().f93338a;
        com.ss.android.ugc.aweme.feed.helper.h.a().f93338a = null;
        com.ss.android.ugc.aweme.video.o.f143498a = TextUtils.equals(this.f79991j.getEventType(), "similar_ads");
        if (iVar != null) {
            com.ss.android.ugc.aweme.feed.helper.h.a().f93339b = this.f79991j.getAid();
            com.ss.android.ugc.aweme.framework.a.a.b("DetailPageFragment", "use share player manager, from " + this.f79991j.getFrom());
            FeedSharePlayerViewModel.getViewModel(getActivity()).player = iVar;
            this.f79992k.a(iVar);
            com.ss.android.ugc.aweme.detail.h.b bVar = this.f79992k;
            long j2 = com.ss.android.ugc.aweme.feed.helper.h.a().f93340c;
            if (bVar.aK != null) {
                bVar.aK.b(com.ss.android.ugc.aweme.feed.helper.h.a().f93339b, j2);
            }
            com.ss.android.ugc.aweme.feed.helper.h.a().f93340c = -1;
        } else if (com.ss.android.ugc.aweme.video.o.c()) {
            com.ss.android.ugc.aweme.video.v vVar = new com.ss.android.ugc.aweme.video.v(false);
            androidx.fragment.app.e activity2 = getActivity();
            l.d(activity2, "");
            l.d(vVar, "");
            FeedPlayerManagerViewModel.a.a(activity2).f143219a = vVar;
            this.f79992k.a((com.ss.android.ugc.aweme.video.i) vVar);
        }
        this.f79992k.v = new ai(this);
        this.f79992k.a(this.f79991j);
        this.p.getViewModel();
        this.f79992k.be = this.p.getViewModel();
        com.ss.android.ugc.aweme.detail.h.b bVar2 = this.f79992k;
        Bundle arguments = getArguments();
        if (arguments == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(arguments.getString("trigger_by"), "splash");
        }
        bVar2.f79690b = equals;
        bVar2.aK.v = equals;
        this.f79992k.d("from_profile_self".equals(this.f79991j.getFrom()));
        this.f79992k.a(view, bundle);
        this.f79992k.E = this;
        this.f79992k.t = this;
        this.f79992k.a((c) this);
        this.f79992k.s = this;
        this.f79992k.as = this;
        if (TextUtils.equals(this.f79991j.getFrom(), "from_follow_page")) {
            this.f79992k.aX = "feed";
        }
        if (this.f79991j.isfollowSkyLight().booleanValue()) {
            com.ss.android.ugc.aweme.detail.h.b bVar3 = this.f79992k;
            bVar3.N.a(true, (ViewPager.f) new com.ss.android.ugc.aweme.detail.h.aj(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0322: INVOKE  
                  (wrap: com.ss.android.ugc.aweme.common.widget.VerticalViewPager : 0x0316: IGET  (r6v5 com.ss.android.ugc.aweme.common.widget.VerticalViewPager) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) com.ss.android.ugc.aweme.detail.h.b.N com.ss.android.ugc.aweme.common.widget.VerticalViewPager)
                  true
                  (wrap: androidx.viewpager.widget.ViewPager$f : ?: CAST (androidx.viewpager.widget.ViewPager$f) (wrap: com.ss.android.ugc.aweme.detail.h.aj : 0x031f: CONSTRUCTOR  (r1v39 com.ss.android.ugc.aweme.detail.h.aj) = 
                  (wrap: com.ss.android.ugc.aweme.detail.h.b$11 : 0x031c: CONSTRUCTOR  (r0v134 com.ss.android.ugc.aweme.detail.h.b$11) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) call: com.ss.android.ugc.aweme.detail.h.b.11.<init>(com.ss.android.ugc.aweme.detail.h.b):void type: CONSTRUCTOR)
                 call: com.ss.android.ugc.aweme.detail.h.aj.<init>(com.ss.android.ugc.aweme.detail.h.ai):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.a(boolean, androidx.viewpager.widget.ViewPager$f):void in method: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (androidx.viewpager.widget.ViewPager$f) (wrap: com.ss.android.ugc.aweme.detail.h.aj : 0x031f: CONSTRUCTOR  (r1v39 com.ss.android.ugc.aweme.detail.h.aj) = 
                  (wrap: com.ss.android.ugc.aweme.detail.h.b$11 : 0x031c: CONSTRUCTOR  (r0v134 com.ss.android.ugc.aweme.detail.h.b$11) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) call: com.ss.android.ugc.aweme.detail.h.b.11.<init>(com.ss.android.ugc.aweme.detail.h.b):void type: CONSTRUCTOR)
                 call: com.ss.android.ugc.aweme.detail.h.aj.<init>(com.ss.android.ugc.aweme.detail.h.ai):void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x031f: CONSTRUCTOR  (r1v39 com.ss.android.ugc.aweme.detail.h.aj) = 
                  (wrap: com.ss.android.ugc.aweme.detail.h.b$11 : 0x031c: CONSTRUCTOR  (r0v134 com.ss.android.ugc.aweme.detail.h.b$11) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) call: com.ss.android.ugc.aweme.detail.h.b.11.<init>(com.ss.android.ugc.aweme.detail.h.b):void type: CONSTRUCTOR)
                 call: com.ss.android.ugc.aweme.detail.h.aj.<init>(com.ss.android.ugc.aweme.detail.h.ai):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x031c: CONSTRUCTOR  (r0v134 com.ss.android.ugc.aweme.detail.h.b$11) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) call: com.ss.android.ugc.aweme.detail.h.b.11.<init>(com.ss.android.ugc.aweme.detail.h.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 33 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.detail.h.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 39 more
                */
            /*
            // Method dump skipped, instructions count: 1122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return com.a.b.c.a(getActivity(), R.layout.wl, viewGroup, false);
        }
    }
