package com.ss.android.ugc.aweme.feed.q;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.g.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.kakao.usermgmt.StringSet;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.at.a;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager;
import com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel;
import com.ss.android.ugc.aweme.experiment.ao;
import com.ss.android.ugc.aweme.experiment.ap;
import com.ss.android.ugc.aweme.experiment.by;
import com.ss.android.ugc.aweme.experiment.ct;
import com.ss.android.ugc.aweme.experiment.gl;
import com.ss.android.ugc.aweme.feed.adapter.ai;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.al;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.adapter.z;
import com.ss.android.ugc.aweme.feed.cache.b;
import com.ss.android.ugc.aweme.feed.experiment.ah;
import com.ss.android.ugc.aweme.feed.experiment.s;
import com.ss.android.ugc.aweme.feed.guide.h;
import com.ss.android.ugc.aweme.feed.i.af;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.d;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.feed.i.u;
import com.ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.n.h;
import com.ss.android.ugc.aweme.feed.u.x;
import com.ss.android.ugc.aweme.feed.ui.av;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.a;
import com.ss.android.ugc.aweme.feed.x.aa;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.aw;
import com.ss.android.ugc.aweme.main.ax;
import com.ss.android.ugc.aweme.main.guide.c;
import com.ss.android.ugc.aweme.main.l;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.newfollow.c.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.j.j;
import com.ss.android.ugc.aweme.utils.cz;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hb;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.aweme.video.k;
import com.ss.android.ugc.aweme.video.simpreloader.m;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public class w extends a implements b, h, x, av, av {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f93817d = true;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f93818e;
    private boolean A = false;
    private boolean B = true;
    private final List<e<Aweme, Integer>> C = new ArrayList();
    private boolean D = false;
    private boolean E = false;
    private int F = 0;
    private boolean G = false;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f93819a;

    /* renamed from: b  reason: collision with root package name */
    private ViewStub f93820b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.feed.ui.b f93821c;

    /* renamed from: f  reason: collision with root package name */
    public int f93822f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f93823g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f93824h = -1;

    /* renamed from: i  reason: collision with root package name */
    public PopupWindow f93825i;

    /* renamed from: j  reason: collision with root package name */
    public int f93826j = 0;

    /* renamed from: k  reason: collision with root package name */
    DataSetObserver f93827k = new DataSetObserver() {
        /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass1 */

        static {
            Covode.recordClassIndex(59691);
        }

        public final void onChanged() {
            w.this.f93822f++;
            UgAllServiceImpl.c();
        }
    };

    /* renamed from: l  reason: collision with root package name */
    public hb f93828l = new hb() {
        /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass8 */

        static {
            Covode.recordClassIndex(59702);
        }

        @Override // com.ss.android.ugc.aweme.utils.hb, com.ss.android.ugc.aweme.utils.dl
        public final void a(String str) {
            super.a(str);
            cz b2 = da.a.b(str);
            if (b2 != null) {
                int currentItem = w.this.N.getCurrentItem();
                b2.a("launch_vv", Integer.toString(currentItem)).a("current_video", a.a(w.this.W.c(currentItem)));
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.hb, com.ss.android.ugc.aweme.utils.dl
        public final void b(String str) {
            super.b(str);
            cz b2 = da.a.b(str);
            if (b2 != null) {
                b2.a("next_video", a.a(w.this.W.c(w.this.N.getCurrentItem())));
            }
        }
    };

    /* renamed from: m  reason: collision with root package name */
    int f93829m = -1;
    protected ISmartFeedLoadMoreService.a n = new x(this);
    String o = null;
    int p = 0;
    boolean q = false;
    private boolean r;
    private c s;
    private boolean t;
    private com.ss.android.ugc.aweme.ug.guide.h u;
    private Handler v = new Handler(Looper.getMainLooper());
    private String w = "";
    private av.a x;
    private AtomicBoolean y = new AtomicBoolean(false);
    private boolean z = false;

    @Override // com.ss.android.ugc.aweme.feed.q.am, com.ss.android.ugc.aweme.feed.q.a
    public final boolean F() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void c(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(235, new g(w.class, "onDeleteAwemeEvent", com.ss.android.ugc.aweme.feed.i.e.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(63, new g(w.class, "onDislikeAwemeEvent", f.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(236, new g(w.class, "onVideoCleanModeEvent", com.ss.android.ugc.aweme.feed.ui.seekbar.c.b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(237, new g(w.class, "onInterceptedResumePlayOnResume", com.ss.android.ugc.aweme.ecommerce.a.a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(238, new g(w.class, "onVPAOptOutEvent", af.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(6, new g(w.class, "onVideoPlayerEvent", j.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(239, new g(w.class, "OnDeleteTopViewAwemeEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.b.a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(240, new g(w.class, "onRefreshEvent", com.ss.android.ugc.aweme.ug.guide.c.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(241, new g(w.class, "onCommentDialogEvent", d.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(242, new g(w.class, "onBackupUpdateEvent", com.ss.android.ugc.aweme.feed.i.a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final ViewGroup N() {
        return this.f93819a;
    }

    public final void a(al alVar) {
        if (this.M != null) {
            this.M.setLoadMoreListener(alVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e1, code lost:
        if ((false | r5) != false) goto L_0x01d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 484
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.q.w.a(java.util.List, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Aweme aweme) {
        String aid = aweme.getAid();
        if (!TextUtils.isEmpty(aid)) {
            if (this.br != null) {
                com.ss.android.ugc.aweme.feed.t.a aVar = this.br;
                if (aVar.f93902a != null) {
                    aVar.f93902a.clearFlag();
                }
            }
            m(aid);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2, int i2) {
        if (this.ar != null) {
            SmartFeedLoadMoreService.getDebug();
            if (z2) {
                a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass12 */

                    static {
                        Covode.recordClassIndex(59694);
                    }

                    public final void run() {
                        w.this.ar.k();
                    }
                }, (long) i2);
            }
        }
    }

    public final void a(Exception exc) {
        if (bD()) {
            this.aF.setRefreshing(false);
            if (this.W.getCount() == 0) {
                DmtStatusView n2 = n(true);
                if (n2 != null) {
                    n2.setVisibility(0);
                    n2.h();
                    return;
                }
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.cyr).a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.i.ag r12) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.q.w.a(com.ss.android.ugc.aweme.feed.i.ag):void");
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.W.e()) && !TextUtils.isEmpty(str) && this.W.a(str)) {
            a(this.aY);
            bs();
            C();
            g(this.N.getCurrentItem());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.h
    public final void a(List<? extends Aweme> list, int i2, int i3, final h.a aVar) {
        Fragment az_ = az_();
        if (az_ instanceof h) {
            ((h) az_).a(list, i2, i3, new h.a() {
                /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(59697);
                }

                @Override // com.ss.android.ugc.aweme.feed.n.h.a
                public final void a(String str, Exception exc) {
                    h.a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(str, exc);
                    }
                }
            });
        } else {
            aVar.a("unsupported", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.av
    public final void a(av.a aVar) {
        av.a aVar2;
        this.x = aVar;
        if (this.y.get() && (aVar2 = this.x) != null) {
            aVar2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void p() {
        this.U.setViewPager(this.N);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void y() {
        a(0, 1200);
    }

    static {
        Covode.recordClassIndex(59690);
    }

    private androidx.fragment.app.e K() {
        if (this.bv instanceof androidx.fragment.app.e) {
            return (androidx.fragment.app.e) this.bv;
        }
        return null;
    }

    private void d() {
        if (aI()) {
            b.a.a(this.aX).c();
        }
    }

    private int j() {
        "homepage_hot".equals(this.aJ.getEventType());
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void B() {
        if (!k()) {
            super.B();
        }
    }

    public final void aO_() {
        if (bD()) {
            this.M.a();
        }
    }

    public final void bh_() {
        if (bD()) {
            boolean z2 = this.r;
        }
    }

    /* access modifiers changed from: protected */
    public final void l() {
        DmtStatusView n2 = n(true);
        if (n2 != null) {
            n2.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.av
    public final void t() {
        a(new ag(37));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.av
    public final void v() {
        a(new ag(28));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.av
    public final void w() {
        if (this.aK != null) {
            this.aK.F();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.c, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public final void J() {
        super.J();
        com.ss.android.ugc.aweme.feed.ui.b bVar = this.f93821c;
        if (bVar != null && bVar.f94301b) {
            this.f93821c.e();
        }
        a(0, 0);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void bk() {
        if (this.bv != null && c() && bU()) {
            super.bk();
        }
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        Activity activity = this.bv;
        if (!(activity instanceof com.ss.android.ugc.aweme.main.j) || !((com.ss.android.ugc.aweme.main.j) activity).isUnderMainTab()) {
            return false;
        }
        return true;
    }

    public void f() {
        if (bD()) {
            G();
            this.aF.setRefreshing(false);
            if (!this.A) {
                l();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public final void r() {
        this.W.unregisterDataSetObserver(this.f93827k);
        com.ss.android.ugc.aweme.commercialize.g.i().c();
        super.r();
        m.a.a().e(this.aa);
    }

    private void C() {
        if (this.W.getCount() == j()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.m("from_full_recommend"));
        }
        this.N.post(new ab(this));
    }

    private void D() {
        MethodCollector.i(9847);
        ViewStub viewStub = this.f93820b;
        if (viewStub != null) {
            viewStub.inflate();
            this.f93820b = null;
            ViewGroup viewGroup = (ViewGroup) this.f93819a.findViewById(R.id.ir);
            if (viewGroup != null) {
                this.f93821c = new com.ss.android.ugc.aweme.feed.ui.b(viewGroup);
            }
        }
        MethodCollector.o(9847);
    }

    private void G() {
        this.t = false;
        com.ss.android.ugc.aweme.feed.ui.b bVar = this.f93821c;
        if (bVar != null && bVar.f94301b && "homepage_hot".equals(this.aJ.getEventType()) && this.aJ.getPageType() == 0) {
            this.f93821c.b();
            bF();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    public void H() {
        String aid;
        super.H();
        Aweme aD = aD();
        c cVar = this.s;
        if (cVar != null) {
            boolean z2 = true;
            if (aD == null || aD.getAuthor() == null || !(aD.getAuthor().getFollowStatus() == 1 || aD.getAuthor().getFollowStatus() == 2)) {
                z2 = false;
            }
            cVar.f109268b = z2;
        }
        if (aD == null) {
            aid = "";
        } else {
            aid = aD.getAid();
        }
        dv.f126642a = aid;
        this.F = this.Y;
    }

    public final void m() {
        Aweme c2;
        com.ss.android.ugc.aweme.ug.guide.h hVar;
        if (this.N != null && this.W != null && (c2 = this.W.c(this.N.getCurrentItem())) != null && c2.getUserDigg() == 1 && (hVar = this.u) != null) {
            hVar.a(this.bv, c2);
        }
    }

    public final void o() {
        if (this.bl != 4) {
            this.t = true;
            G();
            return;
        }
        if (this.f93821c == null) {
            D();
        }
        if (this.f93821c != null) {
            au();
            aX();
            this.f93821c.a();
            this.t = false;
            bF();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.feed.e.j
    public final boolean E() {
        ai bi = bi();
        if (bi == null || bi.ad() == null) {
            return false;
        }
        Aweme aD = aD();
        if (gl.b() && com.ss.android.ugc.aweme.ug.guide.g.a(aD)) {
            bi.M();
            s(aD);
            return true;
        } else if (this.ba || !gl.c() || !com.ss.android.ugc.aweme.ug.guide.g.b(aD)) {
            return false;
        } else {
            this.f93825i = com.ss.android.ugc.aweme.ug.guide.g.a(this.bv, bi.ad().findViewById(R.id.e11), new aj(this));
            com.ss.android.ugc.aweme.ug.guide.g.a(new ak(this));
            com.ss.android.ugc.aweme.ug.guide.g.a();
            s(aD);
            return true;
        }
    }

    public final void b() {
        boolean z2;
        if (bD()) {
            com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
            if (bVar == null || bVar.getCount() != 1 || !com.ss.android.ugc.aweme.commercialize.e.a.b.B(bVar.c(0))) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.ss.android.ugc.aweme.feed.ui.b bVar2 = this.f93821c;
            if (bVar2 != null && bVar2.f94301b) {
                this.aF.setRefreshing(true);
            } else if (z2) {
                bh_();
            } else if (!this.A) {
                this.aF.setRefreshing(false);
                DmtStatusView n2 = n(true);
                if (n2 != null) {
                    n2.setVisibility(0);
                    n2.f();
                }
            } else if (this.G) {
                this.G = false;
            } else {
                this.aF.setRefreshing(true);
            }
        }
    }

    public final boolean k() {
        if ((this.bv instanceof com.ss.android.ugc.aweme.main.j) && ((com.ss.android.ugc.aweme.main.j) this.bv).isDuoDualMode()) {
            return false;
        }
        if (this.bv == null || !c() || !bU() || !ScrollSwitchStateManager.a.a((androidx.fragment.app.e) this.bv).b("page_feed")) {
            return true;
        }
        BusinessComponentServiceUtils.getBusinessBridgeService().b();
        if (!com.ss.android.ugc.aweme.feed.api.h.b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void aP() {
        int i2;
        Aweme c2;
        User author;
        String str;
        Aweme c3;
        if ((by.a() || ((Boolean) LiveOuterService.s().d().a("enable_refresh_foru_avatar_live_status", (Object) false)).booleanValue()) && this.Y <= this.W.getCount() - 2 && (c2 = this.W.c((i2 = this.Y + 2))) != null && (author = c2.getAuthor()) != null) {
            ArrayList arrayList = new ArrayList();
            for (int max = Math.max(this.Y - 5, 0); max <= i2 + 5; max++) {
                if (max != this.Y) {
                    if (max >= this.W.getCount() - 1 || (c3 = this.W.c(max)) == null) {
                        break;
                    } else if (c3.getAuthor() != null) {
                        arrayList.add(c3.getAuthor());
                    }
                }
            }
            if (author.roomId != 0) {
                if (c2.getAwemeType() != 101) {
                    str = "tiktok_video_head";
                } else if ("homepage_follow".equals(this.aJ.getEventType())) {
                    str = "tiktok_follow_below";
                } else {
                    str = "tiktok_video_feed";
                }
                BusinessComponentServiceUtils.getLiveStateManager().a(author, arrayList, new ai(this, c2, i2, author), str);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void bE() {
        MethodCollector.i(9846);
        if (!be()) {
            MethodCollector.o(9846);
        } else if (!com.ss.android.ugc.aweme.main.experiment.g.a()) {
            MethodCollector.o(9846);
        } else {
            c cVar = this.s;
            if (cVar != null && ax.a().getBoolean("shouldShowScrollToFeedFollowGuideMT", true) && cVar.f109268b && !this.aP && !this.aQ) {
                c cVar2 = this.s;
                ViewStub viewStub = (ViewStub) this.f93819a.findViewById(R.id.ed9);
                if (viewStub != null) {
                    viewStub.setOnInflateListener(new com.ss.android.ugc.aweme.main.guide.d(cVar2));
                    if (!cVar2.f109269c) {
                        cVar2.f109270d = viewStub.inflate();
                        if (cVar2.f109270d != null) {
                            cVar2.f109271e = (AnimationImageView) cVar2.f109270d.findViewById(R.id.bxd);
                            try {
                                if (gb.a(cVar2.f109270d.getContext())) {
                                    ((TextView) cVar2.f109270d.findViewById(R.id.bgb)).setText(R.string.cb8);
                                    cVar2.f109271e.setScaleX(-1.0f);
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            if (cVar2.f109271e != null && !c.f109267a) {
                                cVar2.f109271e.setRepeatCount(3);
                                cVar2.f109271e.setAnimation("right_pic.json");
                                cVar2.f109271e.setProgress(0.0f);
                                cVar2.f109271e.a();
                                c.f109267a = true;
                                ax.c();
                            }
                        }
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.guide.b(true));
                        cVar2.f109270d.postDelayed(new com.ss.android.ugc.aweme.main.guide.e(cVar2), 5200);
                    }
                }
            }
            MethodCollector.o(9846);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public void bx() {
        super.bx();
        if (this.bu) {
            if (aC() != null) {
                aC().a();
            }
            if (!(this.W == null || this.N == null)) {
                this.W.g(this.Y);
                aN().a(this.aK);
                k.a();
                Aweme c2 = this.W.c(this.N.getCurrentItem());
                if ((this.bv instanceof androidx.fragment.app.e) && bA()) {
                    u uVar = new u(c2);
                    uVar.f93494b = true;
                    com.ss.android.ugc.d.a.c.a(uVar);
                    AwemeChangeCallBack.a((androidx.fragment.app.e) this.bv, c2);
                }
                aj bf = bf();
                if (com.ss.android.ugc.aweme.video.local.f.f143475a && bf != null) {
                    bf.c(1);
                }
                aa.a(com.ss.android.ugc.aweme.feed.x.m.f(c2), "handlePageResume");
                aa.b("tryPlay", e(c2));
            }
            com.ss.android.ugc.aweme.feed.ui.b bVar = this.f93821c;
            if (bVar != null && bVar.f94301b) {
                this.f93821c.d();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.c, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public void q() {
        av.a aVar;
        l a2;
        l lVar;
        super.q();
        if (this.bu) {
            if ((this.bv instanceof androidx.fragment.app.e) && bA()) {
                try {
                    androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.bv;
                    if (!(eVar.getSupportFragmentManager() == null || (lVar = (l) TabChangeManager.a.a(eVar).a("HOME")) == null || az_() == null || !az_().equals(lVar.l()))) {
                        com.ss.android.ugc.aweme.feed.ui.b bVar = this.f93821c;
                        if (bVar != null && bVar.f94301b && ScrollSwitchStateManager.a.a((androidx.fragment.app.e) this.bv).b("page_feed")) {
                            this.f93821c.d();
                        }
                        aN().a(this.aK);
                        k.a();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            boolean b2 = ScrollSwitchStateManager.a.a((androidx.fragment.app.e) this.bv).b("page_feed");
            IMSAdaptionService c2 = MSAdaptionService.c();
            if (c2.b(this.bv) && (a2 = c2.a(this.bv)) != null && (a2.m() || a2.n())) {
                b2 = true;
            }
            if (this.z && c() && b2) {
                this.z = false;
            } else if (c() && this.W != null && this.W.getCount() > 0 && b2 && ((!f93818e || com.ss.android.ugc.aweme.share.d.c.b("download")) && !k())) {
                super.k(false);
            }
            if (this.y.get() && (aVar = this.x) != null) {
                aVar.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void s() {
        this.W.getCount();
        if (SmartFeedLoadMoreService.instance().isSmartFeedLoadMoreScene(this.aJ.getEventType()) && SmartFeedLoadMoreService.instance().needCheckLoadMore(this.Y, this.W.getCount(), this.W.c(this.Y))) {
            p a2 = p.a.a();
            if (a2.c() != 1 || a2.f104884a) {
                SmartFeedLoadMoreService.instance().startSmartFeedLoadMoreJudge(this.W.c(this.Y), this.n);
            } else {
                return;
            }
        }
        if ((this.Y >= this.W.getCount() - j() || (this.Y == this.W.getCount() - 1 && this.W.getCount() <= 3)) && this.ar != null) {
            p a3 = p.a.a();
            if (a3.c() == 1 && !a3.f104884a) {
                return;
            }
            if ((!ao.b() && !ap.b()) || this.Y != 0 || this.W.getCount() != 1 || !this.W.c(0).isFromSplitData()) {
                if (!ct.f89723a || this.Y == 0) {
                    this.ar.k();
                } else {
                    com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(59695);
                        }

                        public final void run() {
                            w.this.ar.k();
                        }
                    }, 500);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void x() {
        if (bD()) {
            aj bj = bj();
            if (bj != null) {
                bj.a(bj.b());
                if ((this.bv instanceof androidx.fragment.app.e) && bA() && this.bb) {
                    com.ss.android.ugc.d.a.c.a(new u(bj.b()));
                    AwemeChangeCallBack.a((androidx.fragment.app.e) this.bv, bj.b());
                }
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.a(bj.b(), this.aJ.getEventType(), this.aJ.getPageType(), this));
            }
            aj bf = bf();
            if (ah.a(this.aJ.getEventType()) && bf != null && bf.a() == 101) {
                if (this.aK != null) {
                    this.aK.F();
                }
                if (this.bv instanceof androidx.fragment.app.e) {
                    AwemeChangeCallBack.a((androidx.fragment.app.e) this.bv, bf.b());
                }
            }
            if (bj == null || bj.a() != 2) {
                au();
                k.a().b();
                bk();
                if (com.ss.android.ugc.aweme.video.local.f.f143475a && bj != null) {
                    bj.r();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.cache.b
    public final void a() {
        String str;
        VideoUrlModel properPlayAddr;
        if (be() && this.N != null && aG() != null && o(aG())) {
            if (this.br == null) {
                this.br = new com.ss.android.ugc.aweme.feed.t.a(R());
            }
            Aweme aD = aD();
            if (aD != null) {
                Video video = aD.getVideo();
                str = null;
                if (video != null) {
                    if (com.bytedance.ies.abmock.b.a().a(true, "bytevc1_play_addr_policy_unify", true)) {
                        properPlayAddr = com.ss.android.ugc.aweme.video.simcommon.a.a(a.C3820a.f143369a.a().getVideoPlayAddr(com.ss.android.ugc.aweme.video.simcommon.a.a(video), com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType()));
                    } else {
                        properPlayAddr = video.getProperPlayAddr();
                    }
                    if (properPlayAddr != null) {
                        str = properPlayAddr.getBitRatedRatioUri();
                    }
                }
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                this.br.a(false, str, 0, 0, this.W, aE(), true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.x
    public final void c(boolean z2) {
        this.r = z2;
    }

    @r
    public void onRefreshEvent(com.ss.android.ugc.aweme.ug.guide.c cVar) {
        this.f93829m = cVar.f141894a;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void k(boolean z2) {
        if (!k()) {
            super.k(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void m(Aweme aweme) {
        if (!k()) {
            super.m(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    @r
    public void onVideoPlayerEvent(j jVar) {
        int i2 = jVar.f128596c;
        if (i2 == 2 || i2 == 3) {
            com.ss.android.ugc.aweme.ug.guide.g.b();
        }
        super.onVideoPlayerEvent(jVar);
    }

    private void b(boolean z2) {
        FeedRefreshViewModel a2;
        if (be() && (a2 = FeedRefreshViewModel.a(this.bv)) != null) {
            a2.a().postValue(Boolean.valueOf(z2));
        }
    }

    @r
    public void OnDeleteTopViewAwemeEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.b.a aVar) {
        Aweme d2 = this.W.d(0);
        if (d2 != null && TextUtils.equals(d2.getAid(), aVar.f34738a.getAid())) {
            b(0);
            i.f34796l = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final String e(Aweme aweme) {
        if (!c() || !bU()) {
            return "23";
        }
        return super.e(aweme);
    }

    @r
    public void onInterceptedResumePlayOnResume(com.ss.android.ugc.aweme.ecommerce.a.a aVar) {
        if (this.bv != null && this.bv.hashCode() == aVar.f84195a) {
            this.z = !aVar.f84196b;
        }
    }

    private boolean b(String str) {
        aX();
        this.W.notifyDataSetChanged();
        C();
        H();
        a(str, false);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al, com.ss.android.ugc.aweme.feed.q.a
    public final void d(int i2) {
        List<Aweme> d2;
        if (this.W != null && (d2 = this.W.d()) != null && d2.size() - 1 >= i2) {
            Aweme aweme = d2.get(i2);
            if (com.ss.android.ugc.aweme.story.d.a.c(aweme) && com.ss.android.ugc.aweme.feed.x.m.a(aweme)) {
                b(i2);
                b(aweme.getAid());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a
    public final void e(boolean z2) {
        com.ss.android.ugc.aweme.feed.ui.b bVar;
        super.e(z2);
        if (z2 && (bVar = this.f93821c) != null && bVar.f94301b) {
            this.f93821c.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public void onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        super.onAwesomeSplashEvent(aVar);
        if (aVar.f34874a == 4 && this.t && "homepage_hot".equals(this.aJ.getEventType()) && this.aJ.getPageType() == 0 && com.ss.android.ugc.aweme.compliance.api.a.f().b() && com.ss.android.ugc.aweme.compliance.api.a.f().a() != null) {
            o();
        }
    }

    @r
    public void onBackupUpdateEvent(com.ss.android.ugc.aweme.feed.i.a aVar) {
        Map<String, AwemeStatisticsBackup> map = aVar.f93443a;
        if (!(!be() || map == null || map.size() == 0)) {
            ad adVar = new ad(map, aVar);
            if (this.N != null) {
                int childCount = this.N.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Object tag = this.N.getChildAt(i2).getTag(R.id.b1q);
                    if (tag != null) {
                        try {
                            adVar.accept(tag);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    @r
    public void onCommentDialogEvent(d dVar) {
        bd t2;
        boolean z2 = true;
        if (dVar.f93466a != 1) {
            z2 = false;
        }
        this.D = z2;
        g(z2);
        if (be()) {
            h(this.D);
            if (!this.D && this.q) {
                aj bf = bf();
                if (!(bf == null || (t2 = bf.t()) == null)) {
                    t2.J();
                }
                a(this.o, this.w);
                this.q = false;
                this.w = "";
            }
        }
    }

    @r
    public void onDislikeAwemeEvent(f fVar) {
        if (fVar.f93479e == this.bv.hashCode() && !this.aI.booleanValue()) {
            if (K() != null) {
                a.C3244a.a(K()).a("long_press_layer", fVar.f93475a);
            }
            a(fVar.f93475a, fVar.a());
        }
    }

    public void c(Exception exc) {
        if (bD()) {
            if (!"homepage_hot".equals(this.aJ.getEventType()) || this.aJ.getPageType() != 0 || !(exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) || ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() != 13315) {
                G();
                this.M.b();
                return;
            }
            com.ss.android.ugc.aweme.compliance.api.a.f().a(new com.ss.android.ugc.aweme.compliance.api.c.a() {
                /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(59692);
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.c.a
                public final void a() {
                    if (!com.ss.android.ugc.aweme.compliance.api.a.f().b() || com.ss.android.ugc.aweme.compliance.api.a.f().a() == null) {
                        a(0);
                        return;
                    }
                    w.this.M.d();
                    w.this.W.a(new ArrayList());
                    n.a("compliance_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/aweme/v1/algo/free/settings/").a("status", (Integer) 0).a());
                    w.this.o();
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.c.a
                public final void a(int i2) {
                    n.a("compliance_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a("error_message", Integer.valueOf(i2)).a(StringSet.type, "/aweme/v1/algo/free/settings/").a("status", (Integer) 1).a());
                    w.this.M.b();
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.v, com.ss.android.ugc.aweme.feed.q.a
    public final void d(Exception exc) {
        if (bD()) {
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.bv, (Throwable) exc, (int) R.string.b5u);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.v, com.ss.android.ugc.aweme.feed.q.a
    public final void h(String str) {
        if (bD()) {
            if (this.as == null || !this.as.a(str)) {
                if (str != null && this.W != null && this.W.d() != null) {
                    List<Aweme> d2 = this.W.d();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= d2.size()) {
                            break;
                        }
                        Aweme aweme = d2.get(i2);
                        if (!com.ss.android.ugc.aweme.story.d.a.c(aweme)) {
                            if (aweme != null && str.equals(aweme.getAid())) {
                                b(i2);
                                break;
                            }
                        } else {
                            a(i2, str);
                        }
                        i2++;
                    }
                }
                super.h(str);
            }
            b(str);
            super.h(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public void m(boolean z2) {
        super.m(z2);
        aY();
        aa.a("handlePageStop");
        bn();
        k.a().b();
        by();
        com.ss.android.ugc.aweme.feed.ui.b bVar = this.f93821c;
        if (bVar != null && bVar.f94301b) {
            this.f93821c.e();
        }
        a(0, 0);
    }

    @r
    public void onDeleteAwemeEvent(com.ss.android.ugc.aweme.feed.i.e eVar) {
        if (TextUtils.equals(this.aJ.getEventType(), eVar.f93473b)) {
            if (eVar.f93472a != null) {
                com.ss.android.ugc.aweme.framework.a.a.c(4, J, "onDeleteAwemeEvent" + eVar.f93472a.getAid());
            }
            Aweme aweme = eVar.f93472a;
            if (TextUtils.equals(eVar.f93474c, com.ss.android.ugc.aweme.feed.i.e.f93471e) && com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
                if (aweme != null) {
                    aweme = com.ss.android.ugc.aweme.story.g.f137757a.e().a(aweme.getAuthorUid());
                } else {
                    return;
                }
            }
            if (aweme != null && this.as != null && this.as.a(aweme)) {
                b(aweme.getAid());
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public void onVPAOptOutEvent(af afVar) {
        if (TextUtils.equals(this.aJ.getEventType(), "homepage_hot")) {
            boolean z2 = false;
            ArrayList arrayList = new ArrayList();
            for (int i2 = this.Y + 1; i2 < this.W.getCount(); i2++) {
                if (this.W.c(i2).getUploadMiscInfoStruct().vpaInfo.getInfoBarType() != 0) {
                    arrayList.add(this.W.c(i2).getAid());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.as != null && this.as.a(str)) {
                    z2 = true;
                }
            }
            if (z2) {
                this.W.notifyDataSetChanged();
            }
            arrayList.clear();
            if (this.W.getCount() > this.Y + 1) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ug.guide.a());
            }
        }
    }

    @r
    public void onVideoCleanModeEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.c.b bVar) {
        aj bf;
        int i2 = bVar.f95094c;
        boolean z2 = bVar.f95092a;
        if (i2 == 1) {
            aj bj = bj();
            if (bj != null && bVar.f95093b != null && bj.b() != null && bVar.f95093b.getAid().equals(bj.b().getAid())) {
                this.U.setCanTouch(!z2);
                bj.a(z2, false);
            }
        } else if (i2 == 2 && !TextUtils.isEmpty(bVar.f95093b.getAid()) && (bf = bf()) != null && bVar.f95093b != null && bf.b() != null && (bf instanceof aj)) {
            bf.a(z2, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Aweme aweme) {
        Integer insertIndex = com.ss.android.ugc.aweme.feed.api.h.a().getInsertIndex(aE(), aweme);
        if (insertIndex != null) {
            com.ss.android.ugc.aweme.framework.a.a.b(4, J, "start to insert at " + insertIndex + "thread: " + Thread.currentThread());
            try {
                a(aweme, insertIndex.intValue());
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void d(String str) {
        if (bD()) {
            if (TextUtils.equals(this.o, str)) {
                this.p++;
                if (s.b() != 0 && com.ss.android.ugc.aweme.feed.ai.a()) {
                    if (!this.E && this.p >= s.a() && !h.a.f93250a.a(str)) {
                        if (this.D) {
                            this.q = true;
                            this.w = "loop2";
                        } else {
                            a(str, "loop2");
                        }
                        if (this.p == 2) {
                            n.a("awe_share_guide_type_log", new com.ss.android.ugc.aweme.app.f.c().a("awe_share_guide_type", com.ss.android.ugc.aweme.feed.ai.c()).a());
                        }
                    } else if (this.p == 2) {
                        n.a("awe_share_guide_type_log", new com.ss.android.ugc.aweme.app.f.c().a("awe_share_guide_type", "none").a());
                    }
                }
            } else {
                this.p = 1;
                this.o = str;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r8) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.q.w.g(int):void");
    }

    public final void b(Exception exc) {
        boolean z2;
        if (bD()) {
            com.ss.android.ugc.aweme.feed.adapter.b bVar = this.W;
            if (bVar == null || bVar.getCount() != 1 || !com.ss.android.ugc.aweme.commercialize.e.a.b.B(bVar.c(0))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.feed.k.f93539m)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    jSONObject.put("URL", com.ss.android.ugc.aweme.feed.k.f93539m);
                    jSONObject.put("DNS", com.ss.android.ugc.aweme.feed.k.p.f28922j);
                    jSONObject.put("Connect", com.ss.android.ugc.aweme.feed.k.p.f28923k);
                    jSONObject.put("SSL", com.ss.android.ugc.aweme.feed.k.p.f28924l);
                    jSONObject.put("Request", com.ss.android.ugc.aweme.feed.k.p.n);
                    jSONObject.put("Response", com.ss.android.ugc.aweme.feed.k.p.o);
                    jSONObject.put("ttfbMs", com.ss.android.ugc.aweme.feed.k.p.q);
                    jSONObject.put("total", com.ss.android.ugc.aweme.feed.k.p.r);
                    jSONObject.put("extra", com.ss.android.ugc.aweme.feed.k.q);
                    jSONObject.put("exception", com.ss.android.ugc.aweme.feed.k.n);
                    jSONObject.put("requestInfo", com.ss.android.ugc.aweme.feed.k.p);
                    jSONObject.put("eTime", com.ss.android.ugc.aweme.feed.k.o);
                    Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                    if (TextUtils.isEmpty(com.ss.android.ugc.aweme.lancet.j.f107227f) || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                        com.ss.android.ugc.aweme.lancet.j.f107227f = NetworkUtils.getNetworkAccessType(a2);
                    }
                    jSONObject.put("network", com.ss.android.ugc.aweme.lancet.j.f107227f);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                n.a("feed_retry_e", jSONObject);
            }
            if (!"homepage_hot".equals(this.aJ.getEventType()) || this.aJ.getPageType() != 0 || !(exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) || ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() != 13315) {
                this.aF.setRefreshing(false);
                G();
                if (this.A || z2) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.de8).a();
                } else {
                    DmtStatusView n2 = n(true);
                    if (n2 != null) {
                        try {
                            n2.h();
                        } catch (RuntimeException e3) {
                            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e3);
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.de8).a();
                        }
                    }
                }
                if (this.aV != null && this.aV.a("swipe_up_guide")) {
                    if (this.bt != null) {
                        this.bt.c();
                    }
                    if (this.bs != null) {
                        this.bs.a();
                    }
                    this.aV.a("swipe_up_guide", false);
                }
                b(false);
                return;
            }
            com.ss.android.ugc.aweme.compliance.api.a.f().a(new com.ss.android.ugc.aweme.compliance.api.c.a() {
                /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(59703);
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.c.a
                public final void a() {
                    if (!com.ss.android.ugc.aweme.compliance.api.a.f().b() || com.ss.android.ugc.aweme.compliance.api.a.f().a() == null) {
                        a(0);
                        return;
                    }
                    w.this.aF.setRefreshing(false);
                    w.this.W.a(new ArrayList());
                    DmtStatusView n = w.this.n(false);
                    if (n != null) {
                        n.d();
                    }
                    n.a("compliance_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "/aweme/v1/algo/free/settings/").a("status", (Integer) 0).a());
                    w.this.o();
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.c.a
                public final void a(int i2) {
                    n.a("compliance_api_status", "", new com.ss.android.ugc.aweme.app.f.c().a("error_message", Integer.valueOf(i2)).a(StringSet.type, "/aweme/v1/algo/free/settings/").a("status", (Integer) 1).a());
                    w.this.f();
                }
            });
        }
    }

    @Override // com.ss.android.ugc.b.a.a.c, com.ss.android.ugc.b.a.a.b
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (this.s == null) {
            this.s = new c();
        }
        Activity activity = this.bv;
        if (activity instanceof androidx.fragment.app.e) {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            ((LiveData) FeedRefreshViewModel.a.a(eVar).f89507a.getValue()).observe(eVar, new y(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(aj ajVar) {
        super.a(ajVar);
        if (TextUtils.equals(this.aJ.getEventType(), "homepage_hot")) {
            long H = this.aK.H();
            long j2 = aN().j();
            int i2 = this.aK.p;
            int currentItem = this.N.getCurrentItem() - 1;
            if (AdShowTimeGapManager.a() && currentItem >= 0 && currentItem <= AdShowTimeGapManager.f74422f.size()) {
                if (currentItem == AdShowTimeGapManager.f74422f.size()) {
                    AdShowTimeGapManager.f74422f.add(Long.valueOf(H + (((long) i2) * j2)));
                    return;
                }
                ArrayList<Long> arrayList = AdShowTimeGapManager.f74422f;
                arrayList.set(currentItem, Long.valueOf(arrayList.get(currentItem).longValue() + H + (((long) i2) * j2)));
            }
        }
    }

    private void d(List<Aweme> list, boolean z2) {
        m.a.a().a(list, !z2, aJ());
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(int i2, Aweme aweme) {
        super.a(i2, aweme);
        if (this.as != null && aweme != null) {
            this.as.a(aweme.getAid());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(long j2, long j3) {
        ai bi = bi();
        if (!(bi == null || bi.ad() == null || j2 < 0)) {
            Handler handler = this.v;
            bi.getClass();
            handler.postDelayed(z.a(bi), j2);
        }
        PopupWindow popupWindow = this.f93825i;
        if (popupWindow != null && popupWindow.isShowing() && j3 >= 0) {
            this.v.postDelayed(new aa(this), j3);
        }
        com.ss.android.ugc.aweme.ug.guide.g.c();
    }

    public w(String str, int i2) {
        super(str, i2);
        if (be()) {
            h.f.b.l.d(this, "");
            com.ss.android.ugc.aweme.feed.cache.d.f92687c = new WeakReference<>(this);
        }
    }

    private void a(Aweme aweme, int i2) {
        try {
            b(aweme, i2);
            com.ss.android.ugc.aweme.framework.a.a.b(4, J, "insertItemAllowNextTimeOk insert success aid:" + aweme.getAid() + ",pos:" + i2);
        } catch (com.ss.android.ugc.aweme.common.e.g unused) {
            com.ss.android.ugc.aweme.framework.a.a.b(4, J, "insertItemAllowNextTimeOk insert fail,wait, aid:" + aweme.getAid() + ",pos:" + i2);
            this.C.add(new e<>(aweme, Integer.valueOf(i2)));
        }
    }

    private void a(String str, String str2) {
        String str3;
        if (com.ss.android.ugc.aweme.ug.guide.g.c(aD())) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a(com.ss.android.i.b.n, "homepage_hot").a(com.ss.android.i.b.r, str);
            if (s.b() == 1) {
                str3 = "double";
            } else {
                str3 = "triple";
            }
            com.ss.android.ugc.aweme.common.r.a("share_highlight", a2.a("repeat", str3).a("highlight_cause", str2).f66730a);
            ai bi = bi();
            if (bi != null) {
                bi.L();
            }
        }
    }

    public final void c(List<Aweme> list, boolean z2) {
        if (bD()) {
            boolean z3 = false;
            this.aF.setRefreshing(false);
            if (z2 || this.r) {
                if (this.r && !com.bytedance.common.utility.collection.b.a((Collection) list) && this.W.getCount() != list.size()) {
                    z3 = true;
                }
                this.ax = z3;
                int count = this.W.getCount();
                this.W.a(list);
                if (!this.r) {
                    this.N.post(new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(59696);
                        }

                        public final void run() {
                            if (w.this.N != null) {
                                w.this.Y = 0;
                                w.this.ab = true;
                                w.this.N.a(0, false);
                            }
                        }
                    });
                }
                int count2 = this.W.getCount();
                if (count < count2 && list != null && list.size() >= count2) {
                    d(list.subList(count, count2), true);
                }
            } else if (this.bu && this.bv != null && c()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.b40).a();
                if (this.N.getCurrentItem() > 1) {
                    this.N.a(0, false);
                } else {
                    this.N.setCurrentItemWithDefaultVelocity(0);
                }
            }
            d();
        }
    }

    public void b(List<Aweme> list, boolean z2) {
        if (!bD()) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, "FeedFetchModel", "FullFeedFragmentPanel receive onLoadMoreResult,but invalid");
            return;
        }
        G();
        this.aF.setRefreshing(false);
        this.W.f91652b = z2;
        if (z2 || this.r) {
            this.M.d();
        } else {
            this.M.c();
        }
        final Aweme c2 = this.W.c(this.N.getCurrentItem());
        if (com.ss.android.ugc.aweme.video.b.m.f143299b && f93817d) {
            f93817d = false;
        } else if (c2 != null && com.ss.android.ugc.aweme.video.b.l.f143296a) {
            com.ss.android.ugc.aweme.cw.g.a().execute(new ah(this, c2));
        }
        int count = this.W.getCount();
        final int a2 = com.ss.android.ugc.aweme.feed.x.m.a(list, c2);
        this.W.a(list);
        if (!this.C.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.C);
            this.C.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                F f2 = eVar.f2397a;
                S s2 = eVar.f2398b;
                com.ss.android.ugc.aweme.framework.a.a.b(4, J, "pendingAddAwemeList insert aid:" + f2.getAid() + ",pos:" + ((Object) s2));
                a((Aweme) f2, s2.intValue());
            }
        }
        int count2 = this.W.getCount();
        if (count < count2 && list != null && list.size() >= count2) {
            d(list.subList(count, count2), true);
        }
        if (!this.r) {
            this.N.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(59693);
                }

                public final void run() {
                    if (w.this.bv != null && !w.this.bv.isFinishing() && a2 < w.this.W.getCount() - 1 && w.this.N != null && !com.ss.android.ugc.aweme.commercialize.e.a.b.B(c2)) {
                        w.this.Y = a2 + 1;
                        w.this.ab = true;
                        w.this.N.setCurrentItemWithDefaultVelocity(w.this.Y);
                    }
                }
            });
        }
        d();
        if (com.bytedance.ies.abmock.b.a().a(true, "is_preload_process_data", false)) {
            aN().a(list);
        }
        if (be() && !com.ss.android.ugc.aweme.feed.cache.d.f92685a) {
            com.ss.android.ugc.aweme.feed.cache.d.f92685a = true;
            if (com.ss.android.ugc.aweme.feed.cache.d.f92686b) {
                com.ss.android.ugc.aweme.feed.cache.d.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.f93819a = (ViewGroup) view.findViewById(R.id.b1x);
        this.f93820b = (ViewStub) view.findViewById(R.id.is);
        this.f93819a.setOnClickListener(ae.f93753a);
        Activity activity = this.bv;
        if (activity instanceof androidx.fragment.app.e) {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            AwemeChangeCallBack.a(eVar, eVar, new AwemeChangeCallBack.a() {
                /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(59698);
                }

                @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
                public final void a(Aweme aweme) {
                    w.this.f93823g = false;
                }
            });
        }
        this.aF = new aw(this.U);
        this.N.a(new ViewPager.h() {
            /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass6 */

            /* renamed from: a  reason: collision with root package name */
            boolean f93841a;

            /* renamed from: b  reason: collision with root package name */
            int f93842b = -1;

            static {
                Covode.recordClassIndex(59699);
            }

            @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
                w.this.f93826j = i2;
                if (i2 == 1) {
                    this.f93841a = false;
                } else if (i2 == 0) {
                    w.this.m();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
                int currentItem;
                Fragment fragment;
                j jVar = new j(10);
                boolean z = true;
                jVar.f128598e = 1;
                com.ss.android.ugc.d.a.c.a(jVar);
                Aweme c2 = w.this.W.c(w.this.N.getCurrentItem());
                w wVar = w.this;
                int i3 = this.f93842b;
                Aweme aweme = null;
                if (com.ss.android.ugc.aweme.aq.a.a.a() && (fragment = wVar.bw) != null && (fragment.getParentFragment() instanceof l) && fragment.getParentFragment() != null && !com.ss.android.ugc.aweme.commercialize.e.a.b.s(c2) && com.ss.android.ugc.aweme.aq.a.a.f66966c < 6 && i2 > i3 && com.ss.android.ugc.aweme.aq.a.a.f66966c <= 6) {
                    com.ss.android.ugc.aweme.aq.a.a.f66966c++;
                }
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(c2)) {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.push.b());
                }
                w wVar2 = w.this;
                wVar2.f93824h = Math.max(wVar2.f93824h, i2);
                if (this.f93842b == i2 + 1) {
                    aj bf = w.this.bf();
                    if (w.this.aD() == null || w.this.aD().isAd()) {
                        z = false;
                    }
                    if ((bf instanceof ce) && z) {
                        a.C2284a.a(i2 + 2, ((ce) bf).ar());
                    } else if ((bf instanceof com.ss.android.ugc.aweme.feed.adapter.af) && z) {
                        a.C2284a.a(i2 + 2, ((com.ss.android.ugc.aweme.feed.adapter.af) bf).J());
                    }
                } else {
                    w wVar3 = w.this;
                    if (wVar3.N == null) {
                        currentItem = wVar3.Y;
                    } else {
                        currentItem = wVar3.N.getCurrentItem();
                    }
                    if (currentItem > 0 && wVar3.W != null) {
                        aweme = wVar3.W.c(currentItem - 1);
                    }
                    aj bh = w.this.bh();
                    if (aweme == null || aweme.isAd()) {
                        z = false;
                    }
                    if ((bh instanceof ce) && z) {
                        a.C2284a.a(i2, ((ce) bh).ar());
                    } else if ((bh instanceof com.ss.android.ugc.aweme.feed.adapter.af) && z) {
                        a.C2284a.a(i2, ((com.ss.android.ugc.aweme.feed.adapter.af) bh).J());
                    }
                }
                w.this.aK();
                this.f93842b = i2;
            }

            @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
                if (!this.f93841a) {
                    this.f93841a = true;
                }
                if (w.this.f93825i != null && w.this.f93825i.isShowing()) {
                    w.this.f93825i.dismiss();
                    w.this.f93825i = null;
                }
            }
        });
        b.i.b(new Callable<Object>() {
            /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass7 */

            static {
                Covode.recordClassIndex(59700);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cz a2 = da.a.a(w.this.aJ.getEventType());
                if (w.this.N == null) {
                    return null;
                }
                w.this.N.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.q.w.AnonymousClass7.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(59701);
                    }

                    public final void run() {
                        a2.a(w.this.f93828l).a(w.this.N);
                    }
                });
                return null;
            }
        }, b.i.f4824a);
        this.W.registerDataSetObserver(this.f93827k);
        this.M.d();
        this.M.a(this.N, this.U);
        this.M.setLabel("main_feed");
        if ("homepage_hot".equals(this.aJ.getEventType()) && this.aJ.getPageType() == 0 && com.ss.android.ugc.aweme.compliance.api.a.f().b() && com.ss.android.ugc.aweme.compliance.api.a.f().a() != null) {
            o();
        }
        androidx.fragment.app.e K = K();
        if (K == null) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) new RuntimeException("bindLiveData fail"));
        } else if (be()) {
            InterestViewModel.a.a(K).f93520a.observe(K, new af(this));
        }
        this.u = new com.ss.android.ugc.aweme.ug.guide.h(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public com.ss.android.ugc.aweme.feed.adapter.b a(Context context, LayoutInflater layoutInflater, com.ss.android.ugc.aweme.feed.i.s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, com.ss.android.ugc.aweme.feed.e.l lVar) {
        return new z(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
    }
}
