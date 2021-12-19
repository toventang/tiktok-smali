package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.analytics.page.d;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.d;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.challenge.d.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.ec;
import com.ss.android.ugc.aweme.experiment.ed;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.al;
import com.ss.android.ugc.aweme.feed.adapter.am;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.api.h;
import com.ss.android.ugc.aweme.feed.api.k;
import com.ss.android.ugc.aweme.feed.g.b;
import com.ss.android.ugc.aweme.feed.guide.e;
import com.ss.android.ugc.aweme.feed.guide.f;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.y;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.g;
import com.ss.android.ugc.aweme.feed.n.q;
import com.ss.android.ugc.aweme.feed.q.u;
import com.ss.android.ugc.aweme.feed.u.s;
import com.ss.android.ugc.aweme.feed.u.x;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.e;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.aw;
import com.ss.android.ugc.aweme.main.i;
import com.ss.android.ugc.aweme.main.l;
import com.ss.android.ugc.aweme.metrics.o;
import com.ss.android.ugc.aweme.newfollow.c.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.ss.android.ugc.aweme.utils.ft;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;

public class p extends f implements d, com.bytedance.hox.a.d, am, f, g, q, au, i, com.ss.android.ugc.aweme.service.b, org.greenrobot.eventbus.i, j {
    private int A = -1;
    private boolean B = true;
    private LiveSkyLightTouchEventFrameLayout C;
    private FrameLayout D;
    private TextView E;
    private boolean F = false;
    private MineUserStoryFetcher G = new MineUserStoryFetcher((byte) 0);
    private b H;
    private boolean I = false;

    /* renamed from: m  reason: collision with root package name */
    e f94968m;
    FrameLayout n;
    ap o;
    boolean p = false;
    public u q = new u("homepage_follow");
    com.ss.android.ugc.aweme.feed.p.b.a.b r = null;
    private f.a.b.a z = new f.a.b.a();

    static {
        Covode.recordClassIndex(60232);
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
        return "7464";
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.f
    public final boolean e() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.f
    public final Fragment f() {
        return this;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(172, new org.greenrobot.eventbus.g(p.class, "onProfileFollow", c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new org.greenrobot.eventbus.g(p.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(173, new org.greenrobot.eventbus.g(p.class, "receiveJumpToRecord", com.ss.android.ugc.aweme.sticker.types.unlock.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(174, new org.greenrobot.eventbus.g(p.class, "onLiveRoomScrollEvent", com.ss.android.ugc.aweme.live.model.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(175, new org.greenrobot.eventbus.g(p.class, "onVideoPublishEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(35, new org.greenrobot.eventbus.g(p.class, "onBlockUserEvent", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(13, new org.greenrobot.eventbus.g(p.class, "onProfileFollowEvent", c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(176, new org.greenrobot.eventbus.g(p.class, "onRefreshFollowEvent", com.ss.android.ugc.aweme.follow.b.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(177, new org.greenrobot.eventbus.g(p.class, "onLeaveFollowFeedPage", com.ss.android.ugc.aweme.follow.b.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.main.i
    public final String w() {
        return "FeedFollowFragment";
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.au
    public final ViewGroup t() {
        return this.D;
    }

    class a extends b<s> {
        static {
            Covode.recordClassIndex(60235);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final void b() {
            ((s) this.f94972b).f94073c = true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final void a() {
            this.f94972b.a((com.ss.android.ugc.aweme.common.b) new com.ss.android.ugc.aweme.follow.presenter.a());
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final boolean d() {
            s sVar = (s) this.f94972b;
            if (sVar.f76396h == null || !((com.ss.android.ugc.aweme.common.e.a) sVar.f76396h).isDataEmpty()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final boolean e() {
            s sVar = (s) this.f94972b;
            if (sVar.f76396h == null || !((com.ss.android.ugc.aweme.follow.presenter.a) sVar.f76396h).f96239h) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final boolean c() {
            List<FollowFeed> list;
            com.ss.android.ugc.aweme.newfollow.c.b a2 = b.a.a("feed");
            s sVar = (s) this.f94972b;
            ArrayList arrayList = null;
            if (!(sVar.f76396h == null || (list = ((com.ss.android.ugc.aweme.follow.presenter.a) sVar.f76396h).f96238g) == null || list.size() == 0)) {
                arrayList = new ArrayList();
                for (FollowFeed followFeed : list) {
                    if (followFeed.getFeedType() == 65280) {
                        arrayList.add(followFeed.getAweme().getAid());
                    }
                }
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList)) {
                a2.f112577c = arrayList;
            } else if (a2.f112577c != null) {
                a2.f112577c.clear();
            }
            com.ss.android.ugc.aweme.common.e.b bVar = this.f94972b;
            com.ss.android.ugc.aweme.follow.presenter.e a3 = e.a.a(4, 2, 1, b.a.a("feed").b());
            a3.f96271a = b.a.a("feed").a();
            return bVar.a(4, a3.a());
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final void a(x xVar) {
            ((s) this.f94972b).f94072b = xVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final boolean a(Object obj) {
            com.ss.android.ugc.aweme.common.e.b bVar = this.f94972b;
            FollowFeed followFeed = new FollowFeed();
            followFeed.setFeedType(1);
            followFeed.setAweme((Aweme) obj);
            return bVar.a(followFeed, 0);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final void a(boolean z) {
            String str;
            boolean z2;
            Fragment fragment = p.this.v;
            if (fragment instanceof l) {
                str = ((l) fragment).p();
            } else {
                str = "";
            }
            s sVar = (s) this.f94972b;
            p pVar = p.this;
            if (!(pVar.getActivity() instanceof com.ss.android.ugc.aweme.main.j) || !ScrollSwitchStateManager.a.a(pVar.getActivity()).b("page_feed") || !((com.ss.android.ugc.aweme.main.j) pVar.getActivity()).isUnderMainTab()) {
                z2 = false;
            } else {
                z2 = true;
            }
            ((com.ss.android.ugc.aweme.follow.presenter.a) sVar.f76396h).f96234c = z;
            sVar.f94071a = z;
            sVar.f94074d = !z2;
            com.ss.android.ugc.aweme.common.e.b bVar = this.f94972b;
            com.ss.android.ugc.aweme.follow.presenter.e a2 = e.a.a(1, 0, 1, b.a.a("feed").b());
            a2.f96272b = str;
            bVar.a(1, a2.a());
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final boolean a(Aweme aweme) {
            s sVar = (s) this.f94972b;
            String authorUid = aweme.getAuthorUid();
            if (!TextUtils.isEmpty(authorUid) && ((com.ss.android.ugc.aweme.common.e.a) sVar.f76396h).getItems() != null) {
                for (int size = ((com.ss.android.ugc.aweme.common.e.a) sVar.f76396h).getItems().size() - 1; size >= 0; size--) {
                    Aweme aweme2 = ((com.ss.android.ugc.aweme.newfollow.b.a) ((com.ss.android.ugc.aweme.common.e.a) sVar.f76396h).getItems().get(size)).getAweme();
                    if (aweme2 != null && TextUtils.equals(authorUid, aweme2.getAuthorUid())) {
                        ((com.ss.android.ugc.aweme.common.e.a) sVar.f76396h).getItems().remove(size);
                    }
                }
            }
            return a((Object) aweme);
        }

        a(s sVar) {
            super(sVar);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.ugc.aweme.feed.ui.p.b
        public final void a(String str, String str2, String str3) {
            com.ss.android.ugc.aweme.common.e.b bVar = this.f94972b;
            com.ss.android.ugc.aweme.follow.presenter.e a2 = e.a.a(1, 0, 1, b.a.a("feed").b());
            a2.f96272b = str;
            a2.f96273c = str2;
            a2.f96274d = str3;
            bVar.a(1, a2.a());
        }
    }

    private void B() {
        if (this.f94760j != null) {
            C();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.f
    public final void g() {
        LoadMoreFrameLayout loadMoreFrameLayout = this.f94755a;
        if (loadMoreFrameLayout != null) {
            loadMoreFrameLayout.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.f
    public final void h() {
        LoadMoreFrameLayout loadMoreFrameLayout = this.f94755a;
        if (loadMoreFrameLayout != null) {
            loadMoreFrameLayout.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.g
    public final boolean i() {
        return this.H.e();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final com.ss.android.ugc.aweme.common.e.b j() {
        return this.H.f94972b;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f, com.ss.android.ugc.aweme.feed.n.c
    public final boolean k() {
        B();
        return super.k();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final void p() {
        this.q.bF();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.at
    public final aj r() {
        return this.q.aC();
    }

    private static boolean A() {
        if (com.bytedance.ies.abmock.b.a().a(true, "i18n_following_live_skylight_type", 0) != 0) {
            return true;
        }
        return false;
    }

    private int C() {
        u uVar = this.q;
        if (uVar != null) {
            return uVar.bC();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.b.a.a.a
    public final SparseArray<com.ss.android.ugc.b.a.a.c> G() {
        SparseArray<com.ss.android.ugc.b.a.a.c> G2 = super.G();
        G2.append(d.a.f68100c, this.q);
        return G2;
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(hashCode());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final boolean l() {
        this.H.b();
        return this.H.c();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.am
    public final boolean o() {
        u uVar = this.q;
        if (uVar == null || !uVar.bo()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
        this.z.dispose();
    }

    public final void q() {
        if (this.o != null) {
            ab_();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.z
    public final void s() {
        this.f94761k.setRefreshing(true);
        a(false);
    }

    private void D() {
        if (this.o != null && ab_()) {
            a(false, false);
            q();
        }
    }

    static boolean x() {
        com.ss.android.ugc.aweme.live.c d2 = LiveOuterService.s().d();
        if (d2 != null) {
            return ((Boolean) d2.a("live_skylight_frequently_refresh", (Object) false)).booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.al
    public final void a() {
        B();
        this.H.c();
        if (com.ss.android.ugc.aweme.feed.p.b.a()) {
            com.ss.android.ugc.aweme.feed.p.a.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.au
    public final void u() {
        ap apVar = this.o;
        if (apVar != null) {
            apVar.a(new ArrayList());
            D();
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                a(frameLayout, false, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.au
    public final void v() {
        ap apVar = this.o;
        if (apVar != null) {
            apVar.a(new ArrayList());
            D();
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                a(frameLayout, false, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.q
    public final void d() {
        ap apVar;
        if (A() && (apVar = this.o) != null) {
            if (apVar.f94272c.size() == 0) {
                D();
            } else if (!this.F && this.o != null && ab_() && A()) {
                a(true, false);
                q();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final void m() {
        com.ss.android.ugc.aweme.feed.guide.e a2 = BusinessComponentServiceUtils.getBusinessBridgeService().a(this, this);
        this.f94968m = a2;
        this.q.f93811a = a2;
        this.f94757c.a((int) n.b(getActivity(), 49.0f), (int) n.b(getActivity(), 113.0f));
        this.f94761k = new aw(this.f94757c);
        this.q.a((ViewPager.e) new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.feed.ui.p.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60233);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
                if (r4 == (r3.f94969a.q.W.getCount() - 1)) goto L_0x0018;
             */
            @Override // androidx.viewpager.widget.ViewPager.e
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r4) {
                /*
                    r3 = this;
                    boolean r0 = com.ss.android.ugc.aweme.feed.p.b.a()
                    if (r0 == 0) goto L_0x0033
                    r1 = 1
                    if (r4 == 0) goto L_0x0018
                    if (r4 <= 0) goto L_0x002c
                    com.ss.android.ugc.aweme.feed.ui.p r0 = com.ss.android.ugc.aweme.feed.ui.p.this     // Catch:{ Exception -> 0x002f }
                    com.ss.android.ugc.aweme.feed.q.u r0 = r0.q     // Catch:{ Exception -> 0x002f }
                    com.ss.android.ugc.aweme.feed.adapter.b r0 = r0.W     // Catch:{ Exception -> 0x002f }
                    int r0 = r0.getCount()     // Catch:{ Exception -> 0x002f }
                    int r0 = r0 - r1
                    if (r4 != r0) goto L_0x002c
                L_0x0018:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x002f }
                    boolean r0 = com.ss.android.ugc.aweme.feed.p.b.a()     // Catch:{ Exception -> 0x002f }
                    if (r0 == 0) goto L_0x002e
                    java.util.concurrent.atomic.AtomicBoolean r1 = com.ss.android.ugc.aweme.feed.p.b.f.f93677c     // Catch:{ Exception -> 0x002f }
                    boolean r0 = r2.booleanValue()     // Catch:{ Exception -> 0x002f }
                    r1.set(r0)     // Catch:{ Exception -> 0x002f }
                    goto L_0x002e
                L_0x002c:
                    r1 = 0
                    goto L_0x0018
                L_0x002e:
                    return
                L_0x002f:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0033:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.p.AnonymousClass1.onPageSelected(int):void");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.feed.ui.f, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.ui.z
    public void onDestroyView() {
        super.onDestroyView();
        this.q.r();
        ap apVar = this.o;
        if (apVar != null) {
            com.ss.android.ugc.aweme.feed.u.q qVar = apVar.f94270a;
            if (qVar == null) {
                h.f.b.l.a("mPresenter");
            }
            qVar.f94064a.dispose();
        }
        com.ss.android.ugc.aweme.feed.p.b.a.b bVar = this.r;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.feed.ui.z
    public void onResume() {
        String str;
        super.onResume();
        if (this.A == -1) {
            this.A = com.ss.android.ugc.aweme.account.b.g().getCurUser().getFollowingCount();
        }
        if (getUserVisibleHint() && isResumed() && this.v != null && !this.v.isHidden() && ft.a()) {
            com.ss.android.ugc.aweme.feed.s.a(af.FOLLOW);
            if (!this.B) {
                Fragment fragment = this.v;
                if (fragment instanceof l) {
                    str = ((l) fragment).q();
                } else {
                    str = null;
                }
                b.i.b(new w(this, str), r.a());
            }
            this.B = false;
        }
        getActivity().getWindow().setBackgroundDrawableResource(R.color.a2);
        if (this.I) {
            this.I = false;
        }
    }

    @org.greenrobot.eventbus.r
    public void receiveJumpToRecord(com.ss.android.ugc.aweme.sticker.types.unlock.b bVar) {
        this.I = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
    }

    @org.greenrobot.eventbus.r
    public void onProfileFollow(c cVar) {
        com.ss.android.ugc.aweme.feed.guide.e eVar = this.f94968m;
        if (eVar != null) {
            eVar.a(cVar);
        }
    }

    @org.greenrobot.eventbus.r
    public void onRefreshFollowEvent(com.ss.android.ugc.aweme.follow.b.c cVar) {
        a(false);
    }

    @org.greenrobot.eventbus.r
    public void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        String str = aVar.f68097a;
        if (str != null && str.contains("/aweme/v2/follow/feed/?")) {
            EventBus.a().d(aVar);
            a(false);
        }
    }

    @org.greenrobot.eventbus.r
    public void onBlockUserEvent(com.ss.android.ugc.aweme.profile.b.a aVar) {
        User user = aVar.f116043a;
        ap apVar = this.o;
        if (apVar != null && user != null && apVar.b(user.getUid()) == 0) {
            D();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.f
    public final DmtStatusView a(Context context) {
        az azVar = new az(context);
        azVar.a(t.f95120a, new u(this), new v(this));
        azVar.d(1);
        azVar.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(R.dimen.n4));
        return azVar;
    }

    @org.greenrobot.eventbus.r
    public void onLeaveFollowFeedPage(com.ss.android.ugc.aweme.follow.b.b bVar) {
        if (this.F) {
            ap apVar = this.o;
            String str = bVar.f96214a;
            h.f.b.l.d(str, "");
            for (T t : apVar.f94272c) {
                if (h.m.p.a(str, t.getUser().getUid(), true)) {
                    t.setShowBluePoint(false);
                }
            }
            apVar.a();
        }
    }

    @org.greenrobot.eventbus.r
    public void onProfileFollowEvent(c cVar) {
        if (this.o != null && cVar.f69920a == 0 && cVar.f69921b != null && (cVar.f69921b instanceof User) && this.o.b(((User) cVar.f69921b).getUid()) == 0) {
            D();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.z
    public final void d(boolean z2) {
        super.d(z2);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.c.a(2, this.q.aD(), this.q));
        com.ss.android.ugc.aweme.feed.guide.e eVar = this.f94968m;
        if (eVar != null) {
            eVar.onPause();
        }
        this.q.m(z2);
        com.ss.android.ugc.aweme.feed.p.b.f.b(false);
    }

    @org.greenrobot.eventbus.r
    public void onLiveRoomScrollEvent(com.ss.android.ugc.aweme.live.model.c cVar) {
        ap apVar = this.o;
        h.f.b.l.d(cVar, "");
        aq aqVar = apVar.f94271b;
        if (aqVar == null) {
            h.f.b.l.a("mListView");
        }
        long j2 = cVar.f108527a;
        if (j2 >= 0) {
            com.ss.android.ugc.aweme.feed.adapter.q qVar = aqVar.f94282b;
            if (qVar == null) {
                h.f.b.l.a("mAdapter");
            }
            List e2 = qVar.e();
            h.f.b.l.b(e2, "");
            int i2 = 0;
            for (Object obj : e2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                k kVar = (k) obj;
                if (!(kVar instanceof k) || kVar.getUser().roomId != j2) {
                    i2 = i3;
                } else if (i2 > 0) {
                    aqVar.a(i2 - 1);
                    return;
                } else {
                    aqVar.a(i2);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.au
    public final void a(List<k> list) {
        if (this.o != null && ab_()) {
            this.p = true;
            this.o.a(list);
            this.E.setText(com.bytedance.ies.ugc.appcontext.d.a().getResources().getQuantityString(R.plurals.f4, list.size(), Integer.valueOf(list.size())));
            a(true, false);
            q();
            a(this.n, false, true);
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        String string = bundle.getString(be.f68530b, "");
        String d2 = Hox.a.a(getActivity()).d("Following");
        String d3 = Hox.a.a(getActivity()).d(d2);
        String d4 = Hox.a.a(getActivity()).d(d3);
        if (string.equals(be.f68533e) || bundle.getBoolean(d2)) {
            this.q.e(false);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.activity.b(false));
            d(false);
        } else if (string.equals(be.f68532d) || bundle.getBoolean(d3)) {
            d(true);
        } else if (string.equals(be.f68531c) || bundle.getBoolean(d4)) {
            aj aC = this.q.aC();
            if (aC != null) {
                aC.b(1);
            }
            Aweme aweme = HomePageDataViewModel.a.a(getActivity()).f99128k;
            if (aweme != null) {
                b.a.f93183a.a(aweme.getAid());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        if (r5.e() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        if (r6.H.d() == false) goto L_0x00f6;
     */
    @Override // com.ss.android.ugc.aweme.feed.ui.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r7) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.p.c(boolean):void");
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        String string = bundle.getString(be.f68530b, "");
        String d2 = Hox.a.a(getActivity()).d("Following");
        String d3 = Hox.a.a(getActivity()).d(d2);
        String d4 = Hox.a.a(getActivity()).d(d3);
        if (string.equals(be.f68533e) || bundle.getBoolean(d2)) {
            this.q.e(true);
            if (isResumed() && this.v != null && !this.v.isHidden()) {
                com.ss.android.ugc.aweme.feed.s.a(af.FOLLOW);
                o oVar = new o();
                oVar.f109589a = "homepage_follow";
                oVar.f();
            }
            if (this.F) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.activity.b(true));
            }
            c(false);
        } else if (string.equals(be.f68532d) || bundle.getBoolean(d3)) {
            this.q.e(true);
            if (isResumed() && this.v != null && !this.v.isHidden()) {
                com.ss.android.ugc.aweme.feed.s.a(af.FOLLOW);
                o oVar2 = new o();
                oVar2.f109589a = "homepage_follow";
                oVar2.f();
            }
            if (this.F) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.activity.b(true));
            }
            c(true);
        } else if (string.equals(be.f68531c) || bundle.getBoolean(d4)) {
            this.q.e(true);
            if (isResumed() && this.v != null && !this.v.isHidden()) {
                com.ss.android.ugc.aweme.feed.s.a(af.FOLLOW);
                o oVar3 = new o();
                oVar3.f109589a = "homepage_follow";
                oVar3.f();
            }
            if (this.F) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.activity.b(true));
            }
            c(true);
            aj aC = this.q.aC();
            if (aC != null) {
                aC.b(1);
            }
            Aweme aweme = HomePageDataViewModel.a.a(getActivity()).f99128k;
            if (aweme != null) {
                b.a.f93183a.a(aweme.getAid());
            }
        }
        com.bytedance.analytics.b.a(this);
    }

    @org.greenrobot.eventbus.r
    public void onVideoPublishEvent(ag agVar) {
        Aweme a2;
        Aweme a3;
        if (agVar.f93450a != 15) {
            return;
        }
        if (ec.a() || (ec.b() && ed.a())) {
            bh.f94358b = true;
            if (agVar.f93451b instanceof Aweme) {
                Aweme aweme = (Aweme) agVar.f93451b;
                int followerCount = aweme.getAuthor().getFollowerCount();
                if (ec.b(aweme) || (ec.b() && ed.b(followerCount))) {
                    if (com.ss.android.ugc.aweme.story.d.a.c(aweme)) {
                        a3 = com.ss.android.ugc.aweme.story.d.a.i((Aweme) agVar.f93451b);
                        com.ss.android.ugc.aweme.story.g.f137757a.f().a(a3);
                    } else {
                        a3 = AwemeService.b().a(aweme);
                    }
                    if (a3 != null && !z.d(a3)) {
                        if (com.ss.android.ugc.aweme.story.d.a.c(aweme)) {
                            this.H.a(MineUserStoryFetcher.a());
                        } else {
                            this.H.a((Object) a3);
                        }
                        DmtStatusView b2 = b(true);
                        if (b2 != null) {
                            b2.d();
                        }
                        com.ss.android.ugc.aweme.feed.guide.e eVar = this.f94968m;
                        if (eVar != null) {
                            eVar.c();
                        }
                    }
                }
            } else if (agVar.f93451b instanceof List) {
                boolean z2 = false;
                for (Aweme aweme2 : ap.a((List) agVar.f93451b)) {
                    int followerCount2 = aweme2.getAuthor().getFollowerCount();
                    if (ec.b(aweme2) || (ec.b() && ed.b(followerCount2))) {
                        if (com.ss.android.ugc.aweme.story.d.a.c(aweme2)) {
                            a2 = com.ss.android.ugc.aweme.story.d.a.i(aweme2);
                            com.ss.android.ugc.aweme.story.g.f137757a.f().a(a2);
                        } else {
                            a2 = AwemeService.b().a(aweme2);
                        }
                        if (a2 != null && !z.d(a2)) {
                            if (com.ss.android.ugc.aweme.story.d.a.c(aweme2)) {
                                this.H.a(MineUserStoryFetcher.a());
                            } else {
                                this.H.a((Object) a2);
                            }
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    DmtStatusView b3 = b(true);
                    if (b3 != null) {
                        b3.d();
                    }
                    com.ss.android.ugc.aweme.feed.guide.e eVar2 = this.f94968m;
                    if (eVar2 != null) {
                        eVar2.c();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f, com.ss.android.ugc.aweme.feed.ui.z
    public final boolean a(boolean z2) {
        com.ss.android.ugc.aweme.feed.guide.e eVar = this.f94968m;
        if (eVar != null) {
            eVar.c();
        }
        ap apVar = this.o;
        if (apVar != null && this.p) {
            apVar.a("homepage_folllow_refresh");
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.o());
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            this.q.f();
            com.ss.android.ugc.d.a.c.a(new y("HOME"));
            return false;
        } else if (!super.a(z2)) {
            return false;
        } else {
            B();
            this.H.a(z2);
            this.A = com.ss.android.ugc.aweme.account.b.g().getCurUser().getFollowingCount();
            if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
                return true;
            }
            com.ss.android.ugc.aweme.feed.p.a.b();
            return true;
        }
    }

    abstract class b<T extends com.ss.android.ugc.aweme.common.e.b> {

        /* renamed from: b  reason: collision with root package name */
        public T f94972b;

        static {
            Covode.recordClassIndex(60236);
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public abstract void a(x xVar);

        /* access modifiers changed from: package-private */
        public abstract void a(String str, String str2, String str3);

        /* access modifiers changed from: package-private */
        public abstract void a(boolean z);

        /* access modifiers changed from: package-private */
        public abstract boolean a(Aweme aweme);

        /* access modifiers changed from: package-private */
        public abstract boolean a(Object obj);

        /* access modifiers changed from: package-private */
        public abstract void b();

        /* access modifiers changed from: package-private */
        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public abstract boolean d();

        /* access modifiers changed from: package-private */
        public abstract boolean e();

        b(T t) {
            this.f94972b = t;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.feed.ui.f, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.ui.z
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        MethodCollector.i(8975);
        if (this.H == null) {
            this.H = new a(new s());
        }
        this.H = this.H;
        super.onViewCreated(view, bundle);
        z();
        this.C = (LiveSkyLightTouchEventFrameLayout) view.findViewById(R.id.b52);
        this.D = (FrameLayout) view.findViewById(R.id.b6h);
        this.n = (FrameLayout) view.findViewById(R.id.b6g);
        this.E = (TextView) view.findViewById(R.id.f7i);
        this.n.setOnClickListener(new q(this));
        this.q.a(new com.ss.android.ugc.aweme.feed.param.b().setEventType("homepage_follow").setPageType(1).setPreviousPagePosition("follow_button"));
        this.q.a(view, bundle);
        this.q.a((al) this);
        this.q.f93812b = this;
        this.q.a((com.ss.android.ugc.aweme.feed.n.c) this);
        this.q.as = this;
        this.q.f93813c = this;
        this.f94760j.a_(this.q);
        this.H.a((x) this.q);
        this.f94760j.a((com.ss.android.ugc.aweme.common.e.d) this.q);
        this.H.a();
        B();
        Fragment fragment = this.v;
        String str3 = null;
        if (fragment instanceof l) {
            l lVar = (l) fragment;
            com.ss.android.ugc.aweme.homepage.api.data.a o2 = lVar.o();
            if (o2 != null) {
                str3 = o2.a();
                str = o2.b();
                str2 = o2.c();
            } else {
                String p2 = lVar.p();
                str2 = null;
                str3 = p2;
                str = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            this.H.a(str3, str, str2);
        } else {
            this.q.f();
        }
        com.ss.android.ugc.aweme.main.c.a().a(false);
        if (A()) {
            Context context = view.getContext();
            ap apVar = new ap();
            this.o = apVar;
            h.f.b.l.d(context, "");
            h.f.b.l.d(this, "");
            h.f.b.l.d(this, "");
            apVar.f94270a = new com.ss.android.ugc.aweme.feed.u.q(this);
            apVar.f94271b = new aq(context);
            t().removeAllViews();
            aq aqVar = apVar.f94271b;
            if (aqVar == null) {
                h.f.b.l.a("mListView");
            }
            ViewGroup.LayoutParams layoutParams = aqVar.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin += com.ss.android.ugc.aweme.base.utils.i.b();
                ViewGroup t = t();
                aq aqVar2 = apVar.f94271b;
                if (aqVar2 == null) {
                    h.f.b.l.a("mListView");
                }
                t.addView(aqVar2, marginLayoutParams);
                apVar.f94273d = new WeakReference<>(getActivity());
                FrameLayout frameLayout = this.D;
                FrameLayout frameLayout2 = this.n;
                h.f.b.l.d(frameLayout, "");
                h.f.b.l.d(frameLayout2, "");
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.height = com.ss.android.ugc.aweme.base.utils.n.a(173.0d) + com.ss.android.ugc.aweme.base.utils.i.b();
                    frameLayout.setLayoutParams(marginLayoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.topMargin += com.ss.android.ugc.aweme.base.utils.n.a(58.0d) + com.ss.android.ugc.aweme.base.utils.i.b();
                        frameLayout2.setLayoutParams(marginLayoutParams3);
                        this.C.setScrollPredicate(new r(this));
                        this.C.setCallBack(new s(this));
                        ap apVar2 = this.o;
                        if (apVar2 != null) {
                            apVar2.a("homepage_hot");
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        MethodCollector.o(8975);
                        throw nullPointerException;
                    }
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    MethodCollector.o(8975);
                    throw nullPointerException2;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.o(8975);
                throw nullPointerException3;
            }
        }
        if (this.r == null && com.ss.android.ugc.aweme.feed.p.b.a()) {
            this.r = h.a().newTopNoticeFeedManager(getActivity(), this.f94756b);
        }
        com.ss.android.ugc.aweme.feed.p.b.f.b(true);
        EventBus.a(EventBus.a(), this);
        MethodCollector.o(8975);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, boolean z3) {
        if (this.o != null && ab_()) {
            int b2 = ap.b();
            if (z2) {
                this.q.d();
                this.o.a(this.C, 0.0f, (float) b2, z3);
                this.C.setNeedIntercept(true);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.activity.b(true));
            } else {
                this.q.j();
                this.o.a(this.C, (float) b2, 0.0f, z3);
                this.C.setNeedIntercept(false);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.activity.b(false));
            }
            com.ss.android.ugc.aweme.main.c.a().a(z2);
            this.F = z2;
            com.ss.android.ugc.aweme.feed.aj.f91903a = z2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            this.f94968m.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.f, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.ss.android.ugc.aweme.cc.c.a("homepage_follow");
        return com.a.b.c.a((Activity) getContext(), (int) R.layout.a0g);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, boolean z2, boolean z3) {
        if (this.o != null && ab_() && view != null) {
            if (z2) {
                this.o.a(view, z3);
            } else {
                this.o.b(view, z3);
            }
        }
    }
}
