package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.c.l;
import com.ss.android.ugc.aweme.comment.g.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.experiment.gl;
import com.ss.android.ugc.aweme.experiment.q;
import com.ss.android.ugc.aweme.feed.adapter.ai;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.al;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.experiment.k;
import com.ss.android.ugc.aweme.feed.experiment.s;
import com.ss.android.ugc.aweme.feed.guide.h;
import com.ss.android.ugc.aweme.feed.helper.g;
import com.ss.android.ugc.aweme.feed.helper.m;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.d;
import com.ss.android.ugc.aweme.feed.i.e;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.feed.i.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.q.aq;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.feed.ui.seekbar.b.a;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.main.o;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.ae;
import com.ss.android.ugc.aweme.newfollow.c.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.ss.android.ugc.aweme.shortvideo.j.j;
import com.ss.android.ugc.aweme.story.e.a;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.ug.guide.h;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.w;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.aweme.video.simpreloader.m;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends com.ss.android.ugc.aweme.feed.q.a implements c, t, t {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f79689a;
    int A;
    public boolean B;
    public boolean C;
    protected int D;
    public AbstractC1859b E;
    private boolean F;
    private String G;
    private View H;
    private TuxTextView I;

    /* renamed from: b  reason: collision with root package name */
    public boolean f79690b;
    private ViewPager.e bA;
    private boolean bB;
    private com.ss.android.ugc.aweme.base.a.a bC;
    private AtomicBoolean bD;
    private boolean bE;
    private h bF;
    private Runnable bG;
    private a bH;
    private boolean bI;
    private boolean bJ;
    private boolean bK;
    private boolean bx;
    private Handler by;
    private View bz;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79691c;

    /* renamed from: d  reason: collision with root package name */
    TuxButton f79692d;

    /* renamed from: e  reason: collision with root package name */
    public PopupWindow f79693e;

    /* renamed from: f  reason: collision with root package name */
    public aa f79694f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f79695g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f79696h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f79697i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f79698j;

    /* renamed from: k  reason: collision with root package name */
    protected View f79699k;

    /* renamed from: l  reason: collision with root package name */
    protected VideoSeekBarMaskView f79700l;

    /* renamed from: m  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.comment.e.a f79701m;
    protected View n;
    protected View o;
    protected com.ss.android.ugc.aweme.tcm.api.service.a p;
    com.ss.android.ugc.aweme.feed.ui.seekbar.b.a q;
    protected com.ss.android.ugc.aweme.feed.n.c r;
    public com.ss.android.ugc.aweme.feed.n.b s;
    public al t;
    public boolean u;
    public com.ss.android.ugc.aweme.detail.b.a v;
    public HashSet<String> w;
    public HashSet<String> x;
    g y;
    public boolean z;

    /* renamed from: com.ss.android.ugc.aweme.detail.h.b$b  reason: collision with other inner class name */
    public interface AbstractC1859b {
        static {
            Covode.recordClassIndex(49543);
        }

        void b();
    }

    public void C() {
    }

    @Override // com.ss.android.ugc.aweme.feed.q.am, com.ss.android.ugc.aweme.feed.q.a
    public final boolean F() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void T() {
    }

    public void a(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.comment.g.c
    public void c() {
        this.f79697i = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public void c(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.comment.g.c
    public void d() {
        this.f79697i = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(63, new org.greenrobot.eventbus.g(b.class, "onDislikeAwemeEvent", f.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(317, new org.greenrobot.eventbus.g(b.class, "onStoryCommentEvent", l.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(5, new org.greenrobot.eventbus.g(b.class, "onCommentEvent", com.ss.android.ugc.aweme.comment.c.c.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(6, new org.greenrobot.eventbus.g(b.class, "onVideoPlayerEvent", j.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(318, new org.greenrobot.eventbus.g(b.class, "onVideoCleanModeEvent", com.ss.android.ugc.aweme.feed.ui.seekbar.b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(319, new org.greenrobot.eventbus.g(b.class, "onHideCommentInputFragmentEvent", com.ss.android.ugc.aweme.commercialize.event.f.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(320, new org.greenrobot.eventbus.g(b.class, "onDuetSettingEvent", com.ss.android.ugc.aweme.shortvideo.j.b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(321, new org.greenrobot.eventbus.g(b.class, "onAwemeDeleteEvent", e.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(322, new org.greenrobot.eventbus.g(b.class, "onShowAdLayoutEvent", com.ss.android.ugc.aweme.ad.feed.mask.b.a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(222, new org.greenrobot.eventbus.g(b.class, "onCancelVideoCoverMaskEvent", com.ss.android.ugc.aweme.feed.i.b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(237, new org.greenrobot.eventbus.g(b.class, "onInterceptedResumePlayOnResume", com.ss.android.ugc.aweme.ecommerce.a.a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(323, new org.greenrobot.eventbus.g(b.class, "onShareCompleteEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(241, new org.greenrobot.eventbus.g(b.class, "onCommentDialogEvent", d.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final boolean S() {
        return this.f79695g;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public void a(View view, Bundle bundle) {
        MethodCollector.i(5983);
        super.a(view, bundle);
        this.f79700l = (VideoSeekBarMaskView) view.findViewById(R.id.dwz);
        this.f79699k = view.findViewById(R.id.dqk);
        if (!ab()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.de8).a();
        } else {
            n(true).setBuilder(DmtStatusView.a.a(this.bv).a(R.string.h2z).b());
            this.f79699k.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(49528);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.G();
                }
            });
            m();
            ViewGroup viewGroup = (ViewGroup) this.f79699k;
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(this, "");
            Context context = viewGroup.getContext();
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.feed.ui.seekbar.b.a aVar = new com.ss.android.ugc.aweme.feed.ui.seekbar.b.a(context);
            Activity activity = this.bv;
            ScrollSwitchStateManager scrollSwitchStateManager = null;
            if (!(activity instanceof androidx.fragment.app.e)) {
                activity = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            if (eVar != null) {
                scrollSwitchStateManager = ScrollSwitchStateManager.a.a(eVar);
            }
            h.f.b.l.d(this, "");
            aVar.f95080a = this;
            VideoSeekBar videoSeekBar = (VideoSeekBar) aVar.a(R.id.fh7);
            h.f.b.l.b(videoSeekBar, "");
            RelativeLayout relativeLayout = (RelativeLayout) aVar.a(R.id.fh8);
            h.f.b.l.b(relativeLayout, "");
            TuxTextView tuxTextView = (TuxTextView) aVar.a(R.id.ahp);
            h.f.b.l.b(tuxTextView, "");
            TuxTextView tuxTextView2 = (TuxTextView) aVar.a(R.id.ept);
            h.f.b.l.b(tuxTextView2, "");
            aVar.f95081b = new com.ss.android.ugc.aweme.feed.ui.seekbar.a.e(new com.ss.android.ugc.aweme.feed.ui.seekbar.a.d(videoSeekBar, relativeLayout, tuxTextView, tuxTextView2, scrollSwitchStateManager, this));
            VerticalViewPager aQ = aQ();
            if (aQ != null) {
                aQ.a(new a.b(aVar));
            }
            viewGroup.addView(aVar);
            this.q = aVar;
            this.f79700l.setSeekBarView(aVar.getVideoSeekBar());
            this.aF = this.U;
            this.N.a(new ViewPager.h() {
                /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(49539);
                }

                @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
                public final void onPageScrollStateChanged(int i2) {
                    if (i2 == 0) {
                        b.this.L();
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
                public final void onPageSelected(int i2) {
                    j jVar = new j(10);
                    jVar.f128598e = 2;
                    com.ss.android.ugc.d.a.c.a(jVar);
                    if (!b.this.aM) {
                        String from = b.this.aJ.getFrom();
                        if (TextUtils.equals(from, "from_follow_page") || TextUtils.equals(from, "from_familiar_tab") || TextUtils.equals(from, "from_nearby") || TextUtils.equals("from_search_live", from)) {
                            com.ss.android.ugc.aweme.detail.e.a.f79626a.a(b.this.x(), b.this.aJ.getFrom(), b.this.aJ.getVideoType(), b.this.aJ.getEventType(), b.this.K(), true, -1, null);
                        }
                    }
                    if (b.this.aJ.isfollowSkyLight().booleanValue()) {
                        Aweme aD = b.this.aD();
                        if (aD != null || (aD = ((com.ss.android.ugc.aweme.feed.adapter.b) b.this.N.getAdapter()).c(i2)) != null) {
                            User author = aD.getAuthor();
                            if (author.getUniqueId() == null) {
                                b.this.f("");
                            } else {
                                b.this.f(author.getUniqueId());
                            }
                            b.this.W.f91653c = b.this.aJ.isHasLatestFollowingUser();
                            String uid = author.getUid();
                            String aid = aD.getAid();
                            b.this.B = TextUtils.equals(m.f93407a.get(uid), aid);
                            b.this.C = TextUtils.equals(m.f93408b.get(uid), aid);
                            if (!b.this.x.contains(uid)) {
                                b.this.x.add(uid);
                                List<String> uidList = b.this.aJ.getUidList();
                                List<String> blueDotList = b.this.aJ.getBlueDotList();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= uidList.size()) {
                                        break;
                                    } else if (!uidList.get(i3).equalsIgnoreCase(uid)) {
                                        i3++;
                                    } else if (blueDotList.get(i3).equalsIgnoreCase("true")) {
                                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.follow.b.b(uid));
                                    }
                                }
                            }
                            b.this.w.add(aid);
                        }
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
                public final void onPageScrolled(int i2, float f2, int i3) {
                    b.this.a(i2, f2);
                }
            });
        }
        this.bz = view;
        this.bA = new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass8 */

            static {
                Covode.recordClassIndex(49540);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
                if (i2 == 0) {
                    b.this.D();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
                if (b.this.f79701m != null) {
                    b.this.f79701m.a();
                }
                b bVar = b.this;
                Aweme y = bVar.y();
                if (bVar.f79692d != null) {
                    boolean canShare = y.canShare();
                    bVar.f79692d.setEnabled(canShare);
                    if (canShare) {
                        bVar.f79692d.getBackground().clearColorFilter();
                    } else {
                        bVar.f79692d.getBackground().setColorFilter(new PorterDuffColorFilter(-7829368, PorterDuff.Mode.MULTIPLY));
                    }
                }
                b bVar2 = b.this;
                bVar2.b(bVar2.y());
                if (!q.a() && b.this.W != null) {
                    com.ss.android.ugc.aweme.metrics.al c2 = new com.ss.android.ugc.aweme.metrics.al().a(b.this.aJ.getEventType()).c(b.this.W.c(i2), b.this.aJ.getPageType());
                    c2.f109494b = b.this.aJ.getTabName();
                    c2.f109497e = b.this.aJ.getChallengeId();
                    c2.f109493a = "full";
                    c2.f();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
                if (b.this.f79693e != null && b.this.f79693e.isShowing()) {
                    b.this.f79693e.dismiss();
                    b.this.f79693e = null;
                }
            }
        };
        this.N.a(this.bA);
        o a2 = com.ss.android.ugc.aweme.main.a.a.a((androidx.fragment.app.e) this.bv);
        if (a2 != null) {
            a2.a(new ViewPager.e() {
                /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(49541);
                }

                @Override // androidx.viewpager.widget.ViewPager.e
                public final void onPageScrollStateChanged(int i2) {
                }

                @Override // androidx.viewpager.widget.ViewPager.e
                public final void onPageScrolled(int i2, float f2, int i3) {
                }

                @Override // androidx.viewpager.widget.ViewPager.e
                public final void onPageSelected(int i2) {
                    if (i2 == 0) {
                        AwemeChangeCallBack.a((androidx.fragment.app.e) b.this.bv, b.this.W.c(b.this.N.getCurrentItem()));
                    }
                }
            });
        }
        this.bF = new h(this);
        this.bC = new com.ss.android.ugc.aweme.base.a.a() {
            /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass10 */

            static {
                Covode.recordClassIndex(49529);
            }

            @Override // com.ss.android.ugc.aweme.base.a.a
            public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                if (b.this.f79698j || 4 != i2) {
                    return false;
                }
                return true;
            }
        };
        if ((this.bv instanceof com.ss.android.ugc.aweme.base.a.g) && com.ss.android.ugc.aweme.detail.transition.b.f79870a && this.aJ.isSupportFeedTransition()) {
            ((com.ss.android.ugc.aweme.base.a.g) this.bv).registerActivityOnKeyDownListener(this.bC);
        }
        MethodCollector.o(5983);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public void a(List<Aweme> list, boolean z2) {
        if (bD()) {
            this.f79695g = z2;
            this.aW = true;
            com.ss.android.ugc.aweme.framework.a.a.b(4, "DetailFragmentPanel", "onRefreshResult mDetailInputFragment.enterNormalMode() " + this.bI);
            com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
            if (aVar != null) {
                aVar.e();
            }
            DmtStatusView n2 = n(false);
            if (!this.bI) {
                if (com.bytedance.common.utility.h.a(list)) {
                    DmtStatusView n3 = n(true);
                    if (n3 != null) {
                        n3.g();
                    }
                } else {
                    this.bI = true;
                    if (n2 != null) {
                        n2.d();
                    }
                    com.ss.android.b.a.a.a.b(new p(this));
                }
            } else if (n2 != null) {
                n2.d();
            }
            if (list == null || list.isEmpty() || !(list.get(0) instanceof Aweme)) {
                list = null;
            }
            List<Aweme> e2 = e(list);
            this.aF.setRefreshing(false);
            this.W.f91652b = z2;
            c(e2);
            b(e2);
            a("", true);
            com.ss.android.ugc.d.a.c.a(new i());
            ad();
            this.aW = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
        com.ss.android.ugc.aweme.framework.a.a.b(6, "DetailFragmentPanel", "showLoadLatestError " + Log.getStackTraceString(exc));
        if (bD()) {
            this.aF.setRefreshing(false);
            if (this.W.getCount() == 0) {
                DmtStatusView n2 = n(true);
                if (n2 != null) {
                    n2.setVisibility(0);
                    n2.h();
                }
            } else {
                com.ss.android.ugc.aweme.app.api.b.a.a(com.bytedance.ies.ugc.appcontext.d.a(), (Throwable) exc, (int) R.string.cyr);
            }
            this.bE = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.i.m
    public void a(Aweme aweme) {
        String aid;
        MethodCollector.i(6354);
        if (!bD()) {
            MethodCollector.o(6354);
            return;
        }
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = this.aJ.getAid();
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.detail.g.b(aid, aweme, null));
        DmtStatusView n2 = n(false);
        if (n2 != null) {
            n2.setVisibility(8);
        }
        if (aweme == null) {
            ViewStub viewStub = (ViewStub) this.f79699k.findViewById(R.id.b98);
            if (viewStub == null) {
                MethodCollector.o(6354);
                return;
            }
            viewStub.inflate();
            TextView textView = (TextView) this.f79699k.findViewById(R.id.fb9);
            if (textView != null) {
                textView.setVisibility(0);
                MethodCollector.o(6354);
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.h_h).a();
            MethodCollector.o(6354);
            return;
        }
        b(aweme);
        if (!com.ss.android.ugc.aweme.detail.g.b(this.aJ.getFrom()) || !aweme.isForwardAweme() || aweme.getForwardItem() != null) {
            if (aweme.getStatus() != null && aweme.getStatus().isDelete()) {
                this.f79699k.postDelayed(new Runnable() {
                    /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(49535);
                    }

                    public final void run() {
                        if (b.this.bv != null && !b.this.bv.isFinishing()) {
                            b.this.bv.finish();
                        }
                    }
                }, 600);
            }
            if (in.b(aweme.getAuthor(), in.g(aweme.getAuthor()))) {
                com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
                if (aVar != null) {
                    aVar.a(false);
                }
                AbstractC1859b bVar = this.E;
                if (bVar != null) {
                    bVar.b();
                }
            } else {
                ArrayList arrayList = new ArrayList();
                g gVar = this.y;
                if (gVar != null && !gVar.a(aweme)) {
                    this.y.f93331f = new q(this);
                }
                arrayList.add(AwemeService.b().a(aweme));
                c(arrayList);
                com.ss.android.ugc.aweme.comment.e.a aVar2 = this.f79701m;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
            c(aweme);
            if (this.aJ.isShowShareAfterOpen()) {
                a(y(), (String) null);
            }
            if (this.aJ.getNeedShowDonation()) {
                a(y(), 0);
            }
            if (this.H != null) {
                ITranslatedCaptionService j2 = TranslatedCaptionCacheServiceImpl.j();
                CaptionItemModel d2 = d(aweme);
                if (this.H.getVisibility() == 0 && d2 != null && j2 != null && j2.d(d2.getClaSubtitleId())) {
                    this.I.setText(R.string.agf);
                    this.H.setVisibility(8);
                }
                this.H.setOnClickListener(new f(this, aweme));
            }
            if (!(this.aJ.getUpvoteId() == null || aweme.getInteractPermission() == null)) {
                com.ss.android.ugc.aweme.upvote.service.a.f142308a.a(aweme.getAid(), aweme.getInteractPermission().getUpvote());
            }
            MethodCollector.o(6354);
            return;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.c0y).a();
        MethodCollector.o(6354);
    }

    public final void a(final Aweme aweme, final String str, final int i2) {
        if (aC() != null || i2 >= 3) {
            a(y(), this.aJ.getCid(), this.aJ.isCommentForceOpenReply(), this.aJ.getNeedAutoLikeComment(), this.aJ.getNeedShowReplyPanel(), this.aJ.getCommentUserFollowStatus());
        } else {
            a(new Runnable() {
                /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(49536);
                }

                public final void run() {
                    b.this.a(aweme, str, i2 + 1);
                }
            }, 50);
        }
    }

    public final void a(final Aweme aweme, final String str, final int i2, final int i3) {
        if (aC() != null || i3 >= 3) {
            b(aweme, str, i2);
        } else {
            a(new Runnable() {
                /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(49537);
                }

                public final void run() {
                    b.this.a(aweme, str, i2, i3 + 1);
                }
            }, 50);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Aweme aweme, int i2) {
        if (aC() != null || i2 >= 3) {
            SmartRouter.buildRoute(this.bv, "aweme://donation/pannel").withParam("enter_method", this.aJ.getEnterMethodValue()).withParam("enter_from", a_(true)).withParam("page_type", this.aJ.getPageType()).withParam("aweme_id", aweme.getAid()).open();
        } else {
            a(new r(this, aweme, i2), 50);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(ag agVar) {
        h hVar;
        bd t2;
        com.ss.android.ugc.aweme.feed.ui.seekbar.a.e eVar;
        int i2 = agVar.f93450a;
        if (i2 != 3) {
            int i3 = 0;
            if (i2 == 53) {
                if (!this.X) {
                    this.X = true;
                    D();
                    this.bD.compareAndSet(false, true);
                }
                super.a(agVar);
                return;
            } else if (i2 != 57) {
                switch (i2) {
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        super.a(agVar);
                        Aweme aD = aD();
                        if (this.bF == null) {
                            return;
                        }
                        if ((!this.aJ.isMyProfile() || !ac.h(aD)) && (hVar = this.bF) != null) {
                            hVar.a(this.bv, aD);
                            return;
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        a(1200L, 1000L);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        a(-1L, 0L);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        if (bD()) {
                            com.ss.android.ugc.aweme.feed.ui.seekbar.b.a aVar = this.q;
                            if (aVar != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) aVar.a(R.id.fh8);
                                h.f.b.l.b(relativeLayout, "");
                                if (relativeLayout.getVisibility() == 0 && (eVar = aVar.f95081b) != null) {
                                    eVar.c();
                                }
                            }
                            this.N.setCanTouch(false);
                            this.U.setCanTouch(false);
                            aj bf = bf();
                            if (bf != null) {
                                bd t3 = bf.t();
                                if (t3 != null) {
                                    t3.g();
                                }
                                bf.b(true);
                            }
                            aj j2 = j(this.ac);
                            if (j2 != null && (t2 = j2.t()) != null) {
                                t2.a(bW(), false);
                                t2.p();
                                return;
                            }
                            return;
                        }
                        return;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        if (aC() == null || !aC().R()) {
                            this.N.setCanTouch(true);
                            this.U.setCanTouch(true);
                            aj bf2 = bf();
                            if (bf2 == null) {
                                return;
                            }
                            if (this.bK) {
                                bf2.b(true);
                                return;
                            } else {
                                bf2.b(false);
                                return;
                            }
                        } else {
                            return;
                        }
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        Activity activity = this.bv;
                        if (activity != null) {
                            activity.onBackPressed();
                            return;
                        }
                        return;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        if (!ab()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.de8).a();
                            return;
                        }
                        Bundle bundle = agVar.f93452c;
                        if (bundle != null) {
                            i3 = bundle.getInt("emojiReact", 0);
                        }
                        a(bj(), true, i3);
                        return;
                }
            } else if (!ab()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.de8).a();
                return;
            } else {
                a(bj(), false, 0);
                return;
            }
        } else if (!this.aI.booleanValue()) {
            a(0L, 0L);
        } else {
            return;
        }
        super.a(agVar);
    }

    @Override // com.ss.android.ugc.aweme.detail.i.l
    public final void a(List<Aweme> list) {
        int size;
        if (bD()) {
            this.Y = 0;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Aweme a2 = AwemeService.b().a(list.get(i3));
                list.set(i3, a2);
                if (a2 != null && com.bytedance.common.utility.m.a(a2.getAid(), this.aJ.getAid())) {
                    i2 = i3;
                }
            }
            c(list);
            this.Y = i2;
            this.N.a(this.Y, false);
            this.N.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(49538);
                }

                public final void run() {
                    if (b.this.f79701m != null) {
                        b.this.f79701m.b();
                    }
                }
            });
        }
    }

    public final void a(String str) {
        a(y(), 0, str);
    }

    public final void a(Comment comment) {
        com.ss.android.ugc.aweme.story.view.a af;
        if (comment != null && (af = af()) != null) {
            comment.getCid();
            comment.getFakeId();
            comment.getText();
            af.b(comment);
        }
    }

    public final void G() {
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.feed.e.i
    public final String M() {
        return this.aJ.getTabName();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final ViewGroup N() {
        return (ViewGroup) this.f79699k;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.feed.e.i
    public final String O() {
        return this.aJ.getTracker();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final PreloadStrategyConfig R() {
        return s.d();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void W() {
        a(0L, 1200L);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Z() {
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final Aweme h() {
        return y();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.ad
    public final void l() {
        Activity activity = this.bv;
        if (activity != null) {
            activity.finish();
        }
    }

    private void ad() {
        if (aI()) {
            b.a.a(this.aX).c();
        }
    }

    private static boolean o() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void A() {
        super.A();
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void B() {
        if (!ae()) {
            super.B();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.c, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public final void J() {
        super.J();
        a(0L, 0L);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        com.ss.android.ugc.aweme.framework.a.a.a(4, "DetailFragmentPanel", "showLoadEmpty mDetailInputFragment.enterCleanMode()");
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final boolean z() {
        boolean z2 = super.z();
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.a(!z2);
        }
        return z2;
    }

    static {
        Covode.recordClassIndex(49527);
        HashSet hashSet = new HashSet();
        f79689a = hashSet;
        hashSet.add("from_search");
        hashSet.add("from_search_mix");
    }

    private static boolean ab() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean o2 = o();
        com.ss.android.ugc.aweme.lancet.j.f107229h = o2;
        return o2;
    }

    private com.ss.android.ugc.aweme.story.view.a af() {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj bf = bf();
        if (bf == null || (Q = bf.Q()) == null) {
            return null;
        }
        return Q.h();
    }

    public final long K() {
        if (this.aK != null) {
            return this.aK.d(com.ss.android.ugc.aweme.feed.helper.h.a().f93339b);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void P() {
        if (!com.ss.android.ugc.aweme.detail.ui.l.w.containsKey(this.aJ.getEventType())) {
            super.P();
        }
    }

    public final int U() {
        if (this.W == null || this.aZ != this.W.getCount() - 1) {
            return 0;
        }
        return 1;
    }

    public final View V() {
        aj aC = aC();
        if (aC instanceof ce) {
            return ((ce) aC).al();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Y() {
        if (this.aJ.isShowShareAfterOpen()) {
            a(y(), (String) null);
        }
        if (this.aJ.isShowCommentAfterOpen()) {
            n(x());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (bD() && !this.bE) {
            this.M.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void aa() {
        if (this.f79701m != null && this.aJ.isAdHasReportReason()) {
            this.f79701m.a(this.aJ.getAdReportReason(), this.aJ.getAdReportReasonType());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        if (bD()) {
            com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
            if (aVar != null) {
                aVar.d();
            }
            DmtStatusView n2 = n(true);
            if (n2 != null) {
                n2.setVisibility(0);
                n2.f();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
        if (bD() && !this.bE) {
            this.aF.setRefreshing(true);
        }
    }

    public final boolean j() {
        if (!t(y()) || TcmServiceImpl.j().a(y(), a_(true))) {
            return true;
        }
        return false;
    }

    public final androidx.fragment.app.i k() {
        if (az_() == null || az_().getActivity() == null) {
            return null;
        }
        return az_().getActivity().getSupportFragmentManager();
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        if ("discovery".equals(this.aJ.getEventType()) || this.aJ.isHotSpot()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void u() {
        com.ss.android.ugc.aweme.feed.n.b bVar;
        if (bD() && this.W.f91653c && this.Y == 2 && (bVar = this.s) != null) {
            bVar.m();
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        if (this.W.getCount() == 0) {
            l();
        } else {
            this.N.post(new s(this));
        }
    }

    public final void w() {
        this.aI = true;
        if (this.aJ != null) {
            this.aJ.setPlaylistCleanMode(this.aI.booleanValue());
        }
    }

    private boolean ae() {
        if (!bU() || !this.u) {
            return true;
        }
        if (this.bv != null) {
            BusinessComponentServiceUtils.getBusinessBridgeService().b();
        }
        if (this.bx) {
            return true;
        }
        if (!this.bJ) {
            return false;
        }
        this.bJ = false;
        return true;
    }

    public final void D() {
        Aweme c2;
        h hVar;
        if (this.N != null && this.W != null && (c2 = this.W.c(this.N.getCurrentItem())) != null && c2.getUserDigg() == 1) {
            if ((!this.aJ.isMyProfile() || !ac.h(c2)) && (hVar = this.bF) != null) {
                hVar.a(this.bv, c2);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.c, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public final void I() {
        if (com.ss.android.ugc.aweme.detail.transition.b.f79870a && this.aJ.isSupportFeedTransition() && !this.f79698j && this.bv != null) {
            com.ss.android.ugc.aweme.detail.transition.a.a(this.bv);
            com.ss.android.ugc.aweme.framework.a.a.a(6, "FeedShareElement", "FeedShareElement transition in DetailFragmentPanel onDetach exception. ");
        }
        this.f79698j = true;
        super.I();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final boolean Q() {
        Aweme aD = aD();
        if (aD == null || !com.ss.android.ugc.aweme.account.b.g().isLogin() || aD.getAuthor() == null || !TextUtils.equals(aD.getAuthor().getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId()) || com.bytedance.ies.abmock.b.a().a(true, "enable_preload_hp_personal", 1) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void X() {
        if (bD()) {
            aj bf = bf();
            if (com.ss.android.ugc.aweme.feed.x.g.e(bf)) {
                bf.a(bf.b());
                e(bf.b());
                if (com.ss.android.ugc.aweme.video.local.f.f143475a) {
                    bf.r();
                }
            }
        }
    }

    public final Aweme x() {
        aj bj = bj();
        if (bj != null) {
            return bj.P();
        }
        if (this.W == null || this.N == null) {
            return null;
        }
        return this.W.d(this.N.getCurrentItem());
    }

    public Aweme y() {
        aj bj = bj();
        if (bj != null) {
            return bj.b();
        }
        if (this.W == null || this.N == null) {
            return null;
        }
        return this.W.c(this.N.getCurrentItem());
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f79726a;

        /* renamed from: b  reason: collision with root package name */
        public int f79727b;

        /* renamed from: d  reason: collision with root package name */
        private final List<Aweme> f79729d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f79730e;

        /* renamed from: f  reason: collision with root package name */
        private final int f79731f;

        static {
            Covode.recordClassIndex(49542);
        }

        public final void run() {
            Activity activity = b.this.bv;
            if (activity != null) {
                if (com.a.b.c.b(activity, "common_feed_item_feed")) {
                    int i2 = this.f79727b;
                    if (i2 == 0) {
                        int size = this.f79729d.size();
                        int i3 = this.f79731f;
                        if (i3 == 0 || i3 == size - 1 || size == 2) {
                            a(2, this.f79729d);
                            return;
                        }
                        int i4 = i3 + 1;
                        if (i4 > size) {
                            a(2, this.f79729d);
                            return;
                        }
                        a(1, this.f79729d.subList(i3, i4));
                        com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(this, 16);
                    } else if (i2 == 1) {
                        a(2, this.f79729d);
                    }
                } else {
                    com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(this, 16);
                }
            }
        }

        private void a(int i2, List<Aweme> list) {
            this.f79727b = i2;
            b.this.z = true;
            b.this.b(list, this.f79730e);
            b.this.z = false;
        }

        a(List<Aweme> list, boolean z, int i2) {
            if (list.size() >= 2) {
                this.f79729d = list;
                this.f79730e = z;
                this.f79731f = i2;
                return;
            }
            throw new IllegalArgumentException("allAwemeList.size must > 1");
        }
    }

    public b() {
        super("");
        this.by = new Handler(Looper.getMainLooper());
        this.bz = null;
        this.f79695g = false;
        this.f79697i = false;
        this.bB = false;
        this.f79698j = false;
        this.bD = new AtomicBoolean(false);
        this.u = true;
        this.w = new HashSet<>();
        this.x = new HashSet<>();
        this.z = false;
        this.A = 0;
        this.bG = new d(this);
        this.B = true;
        this.bH = null;
        this.bI = false;
        this.bJ = false;
        this.bK = false;
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
            this.f79693e = com.ss.android.ugc.aweme.ug.guide.g.a(this.bv, bi.ad().findViewById(R.id.e11), new g(this));
            com.ss.android.ugc.aweme.ug.guide.g.a(new h(this));
            com.ss.android.ugc.aweme.ug.guide.g.a();
            s(aD);
            return true;
        }
    }

    public final void L() {
        boolean z2;
        boolean z3;
        float f2;
        Aweme c2 = this.W.c(this.Y);
        if (c2 != null) {
            boolean z4 = true;
            if (c2.getAwemeType() == 101) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c2.getAwemeType() == 4000) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 && !z3) {
                z4 = false;
                if (y.f(c2)) {
                    return;
                }
            }
            com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
            float f3 = 0.0f;
            if (aVar != null) {
                aVar.b(z4);
                com.ss.android.ugc.aweme.comment.e.a aVar2 = this.f79701m;
                if (z4) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                aVar2.a(f2);
            }
            com.ss.android.ugc.aweme.detail.b.a aVar3 = this.v;
            if (aVar3 != null) {
                if (!z2) {
                    f3 = 1.0f;
                }
                aVar3.a(f3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.c.e, com.ss.android.ugc.aweme.feed.q.a
    public void bm_() {
        String str;
        if (com.ss.android.ugc.aweme.detail.transition.b.f79870a && this.aJ.isSupportFeedTransition() && !this.f79698j) {
            if (this.bv != null) {
                com.ss.android.ugc.aweme.detail.transition.a.a(this.bv);
            }
            if (("onAdapterFinish activity's state" + this.bv) != null) {
                str = ", state: " + this.bv.isFinishing();
            } else {
                str = "";
            }
            com.ss.android.ugc.aweme.framework.a.a.b(6, "FeedShareElement", str);
        }
        this.f79698j = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void s() {
        if (bD()) {
            super.s();
            if (!this.aJ.isMyProfile() && this.Y != -1 && (this.be instanceof com.ss.android.ugc.aweme.commercialize.profile.talent.b)) {
                ((com.ss.android.ugc.aweme.commercialize.profile.talent.b) this.be).a(this.Y, this.aJ.getSecUid());
            }
            if (!this.W.f91652b) {
                this.M.c();
                return;
            }
            if (t()) {
                if (this.Y < this.W.getCount() - 3) {
                    return;
                }
            } else if (this.Y != this.W.getCount() - 3) {
                return;
            }
            com.ss.android.ugc.aweme.feed.n.c cVar = this.r;
            if (cVar != null) {
                cVar.k();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public void H() {
        super.H();
        this.aK.y();
        this.N.postDelayed(this.bG, 150);
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.h();
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.O(aD())) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.clf).a();
        }
        if (!(this.aJ.getDetailAdType() != 1 || !((Boolean) k.f93073b.getValue()).booleanValue() || aC() == null || aC().t() == null || az_() == null)) {
            com.ss.android.ugc.aweme.comment.e.a aVar2 = this.f79701m;
            if (aVar2 != null) {
                aVar2.d();
            }
            if (!(aC() == null || aC().t() == null)) {
                aC().t().a(s("ad_event_type"), s("industry_id"));
            }
        }
        q(false);
        com.ss.android.ugc.aweme.comment.e.a aVar3 = this.f79701m;
        if (aVar3 != null) {
            aVar3.j();
        }
        this.f79697i = false;
        bN();
    }

    @Override // com.ss.android.ugc.b.a.a.c, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public final void q() {
        aj U;
        super.q();
        if (this.bu && this.W != null && this.W.getCount() > 0) {
            if (!aN().b(this.aK)) {
                aj bf = bf();
                if (com.ss.android.ugc.aweme.feed.x.g.e(bf) && bf.a() == 40 && bf.b().getUserStory() != null && (U = bf.U()) != null) {
                    bf = U;
                }
                aN().a(this.aK);
                if (com.ss.android.ugc.aweme.feed.x.g.e(bf) && (bf.p().w() || com.ss.android.ugc.aweme.video.local.f.f143475a)) {
                    e(bf.b());
                }
            } else if (this.u && !ae()) {
                super.k(true);
            }
        }
        this.bD.get();
        ITranslatedCaptionService j2 = TranslatedCaptionCacheServiceImpl.j();
        CaptionItemModel d2 = d(y());
        View view = this.H;
        if (view != null && view.getVisibility() == 0 && d2 != null && j2 != null && j2.d(d2.getClaSubtitleId())) {
            this.H.setVisibility(8);
            TuxTextView tuxTextView = this.I;
            if (tuxTextView != null) {
                tuxTextView.setText(R.string.agf);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public void r() {
        com.ss.android.ugc.aweme.feed.ui.seekbar.a.e eVar;
        super.r();
        com.ss.android.ugc.aweme.feed.ui.seekbar.b.a aVar = this.q;
        if (!(aVar == null || (eVar = aVar.f95081b) == null)) {
            eVar.b();
        }
        try {
            if (TextUtils.equals("commerce_general", this.aJ.getFrom()) && !aq.a(new StringBuilder().append(aN().L().hashCode()).toString())) {
                aN().H();
            }
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
        if (this.N != null) {
            this.N.removeCallbacks(this.bG);
        }
        com.ss.android.ugc.aweme.comment.e.a aVar2 = this.f79701m;
        if (aVar2 != null) {
            aVar2.c();
        }
        if (this.bv instanceof com.ss.android.ugc.aweme.base.a.g) {
            ((com.ss.android.ugc.aweme.base.a.g) this.bv).unRegisterActivityOnKeyDownListener(this.bC);
        }
        if (this.bH != null) {
            com.bytedance.aweme.b.a.f25788b.f25790a.removeCallbacks(this.bH);
            this.bH = null;
        }
        m.a.a().e(this.aa);
    }

    /* access modifiers changed from: protected */
    public void m() {
        int i2;
        MethodCollector.i(6507);
        if (this.bv == null || this.bv.isFinishing()) {
            MethodCollector.o(6507);
        } else if (az_() == null) {
            MethodCollector.o(6507);
        } else if (this.aI.booleanValue()) {
            MethodCollector.o(6507);
        } else {
            com.ss.android.ugc.aweme.feed.param.b bVar = this.aJ;
            h.f.b.l.d(bVar, "");
            if (h.f.b.l.a((Object) bVar.getFrom(), (Object) "from_chat_favorite_video_panel")) {
                ViewGroup viewGroup = (ViewGroup) az_().getView();
                if (viewGroup instanceof FrameLayout) {
                    ConstraintLayout constraintLayout = new ConstraintLayout(this.bv);
                    constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
                    int dimensionPixelSize = this.bv.getResources().getDimensionPixelSize(R.dimen.it);
                    constraintLayout.setPadding(dimensionPixelSize, this.bv.getResources().getDimensionPixelSize(R.dimen.iu), dimensionPixelSize, 0);
                    constraintLayout.setBackgroundColor(-16777216);
                    viewGroup.addView(constraintLayout, viewGroup.getChildCount());
                    TuxButton tuxButton = new TuxButton(this.bv);
                    ConstraintLayout.a aVar = new ConstraintLayout.a(-1, -2);
                    aVar.f2051h = 0;
                    tuxButton.setLayoutParams(aVar);
                    tuxButton.setButtonSize(3);
                    tuxButton.setButtonVariant(0);
                    tuxButton.setText(R.string.fkx);
                    tuxButton.setTextColor(-1);
                    constraintLayout.addView(tuxButton);
                    tuxButton.setOnClickListener(new e(this));
                    this.f79692d = tuxButton;
                }
            } else if (this.bv.getIntent() != null && this.bv.getIntent().getIntExtra("bottom_view_type", 0) == 1) {
                int intExtra = this.bv.getIntent().getIntExtra("translation_status", 0);
                ViewGroup viewGroup2 = (ViewGroup) az_().getView();
                if (viewGroup2 instanceof FrameLayout) {
                    View a2 = com.a.b.c.a(this.bv, R.layout.wg, viewGroup2, false);
                    a2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
                    a2.setBackgroundColor(-16777216);
                    View findViewById = a2.findViewById(R.id.atj);
                    this.H = findViewById;
                    if (intExtra == 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    findViewById.setVisibility(i2);
                    TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.atl);
                    this.I = tuxTextView;
                    if (intExtra == 0) {
                        tuxTextView.setText(R.string.agk);
                    } else if (intExtra == 1) {
                        tuxTextView.setText(R.string.agf);
                    } else if (intExtra == 2) {
                        tuxTextView.setText(R.string.age);
                    } else if (intExtra == 3) {
                        tuxTextView.setText(R.string.agd);
                    }
                    viewGroup2.addView(a2, viewGroup2.getChildCount());
                }
            } else if (!this.f79696h) {
                this.f79701m = CommentServiceImpl.e().a(az_().getView(), bW(), a_(true), this, this);
            }
            ViewGroup viewGroup3 = (ViewGroup) az_().getView();
            if (viewGroup3 != null && viewGroup3.findViewById(R.id.c65) != null) {
                this.n = viewGroup3.findViewById(R.id.c65);
            } else if (viewGroup3 instanceof FrameLayout) {
                this.n = com.a.b.c.a(this.bv, R.layout.wm, viewGroup3, false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                viewGroup3.addView(this.n, layoutParams);
                this.n.setVisibility(8);
            } else if (viewGroup3 instanceof RelativeLayout) {
                this.n = com.a.b.c.a(this.bv, R.layout.wm, viewGroup3, false);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(14);
                layoutParams2.addRule(12);
                viewGroup3.addView(this.n, layoutParams2);
                this.n.setVisibility(8);
            }
            if (this.o == null) {
                if (this.p == null) {
                    this.p = TcmServiceImpl.j().a(viewGroup3, this.bv);
                }
                this.o = this.p.a();
            }
            MethodCollector.o(6507);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0081 A[EDGE_INSN: B:89:0x0081->B:25:0x0081 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.feed.q.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p() {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.h.b.p():void");
    }

    public final void a(int i2) {
        this.D = i2;
    }

    @Override // com.ss.android.ugc.aweme.detail.h.t
    public final void i(String str) {
        j(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(com.ss.android.ugc.aweme.feed.n.c cVar) {
        this.r = cVar;
    }

    @r
    public void onCancelVideoCoverMaskEvent(com.ss.android.ugc.aweme.feed.i.b bVar) {
        q(bVar.f93465a);
    }

    public final void b(boolean z2) {
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.a(z2);
            if (z2) {
                A();
            }
        }
    }

    public final void c(String str) {
        com.ss.android.ugc.aweme.story.view.a af = af();
        if (af != null) {
            af.b(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void e(int i2) {
        super.e(i2);
        if (i2 == 1) {
            bM();
        } else if (i2 == 0) {
            bN();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.v, com.ss.android.ugc.aweme.feed.q.a
    public final void h(String str) {
        if (bD()) {
            j(str);
            super.h(str);
        }
    }

    private static List<Aweme> e(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Aweme aweme : list) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    private void q(boolean z2) {
        com.ss.android.ugc.aweme.comment.e.a aVar;
        boolean z3;
        Aweme bL = bL();
        if (bL != null && (aVar = this.f79701m) != null) {
            if (z2 || !y.f(bL)) {
                z3 = false;
            } else {
                z3 = true;
            }
            aVar.d(z3);
        }
    }

    private int s(String str) {
        try {
            return new JSONObject(this.aJ.getInboxExtra()).getInt(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final void c(Comment comment) {
        com.ss.android.ugc.aweme.story.view.a af;
        if (comment != null && (af = af()) != null) {
            comment.getCid();
            comment.getFakeId();
            comment.getText();
            af.c(comment);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.i.l
    public final void c_(Exception exc) {
        if (bD()) {
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.bv, (Throwable) exc, (int) R.string.cyr);
            DmtStatusView n2 = n(false);
            if (n2 != null) {
                n2.setVisibility(8);
            }
        }
    }

    public final void d(boolean z2) {
        this.aJ.setMyProfile(z2);
        for (com.ss.android.ugc.aweme.feed.e.d dVar : this.aL.f92906a) {
            dVar.f92903h = z2;
        }
    }

    public final void f(String str) {
        ((TuxTextView) this.f79699k.findViewById(R.id.b99)).setText(str);
    }

    @r
    public void onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.i.f fVar) {
        if (fVar.f93479e == this.bv.hashCode() && !this.aI.booleanValue()) {
            a(fVar.f93475a, fVar.a());
        }
    }

    @r
    public void onInterceptedResumePlayOnResume(com.ss.android.ugc.aweme.ecommerce.a.a aVar) {
        if (this.bv != null && this.bv.hashCode() == aVar.f84195a) {
            this.bJ = !aVar.f84196b;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    @r
    public void onVideoPlayerEvent(j jVar) {
        int i2 = jVar.f128596c;
        if (i2 != 2 && i2 != 3) {
            return;
        }
        if (this.F) {
            bn();
        } else {
            com.ss.android.ugc.aweme.ug.guide.g.b();
        }
    }

    private static String a(long j2) {
        if (j2 < 1000 || j2 >= 10000) {
            return com.ss.android.ugc.aweme.i18n.b.a(j2);
        }
        return new BigDecimal(j2).divide(new BigDecimal(1000), 1, RoundingMode.HALF_UP).toString() + "K";
    }

    public final void b(Comment comment) {
        com.ss.android.ugc.aweme.story.view.a af;
        if (comment != null && (af = af()) != null) {
            comment.getCid();
            comment.getFakeId();
            comment.getText();
            af.a(comment);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.i.m
    public void b_(Exception exc) {
        if (bD()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.detail.g.b(this.aJ.getAid(), null, exc));
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.bv, (Throwable) exc, (int) R.string.cyr);
            DmtStatusView n2 = n(false);
            if (n2 != null) {
                n2.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al, com.ss.android.ugc.aweme.feed.q.a
    public final void d(int i2) {
        if (this.W != null && this.W.e() != null) {
            Aweme aweme = this.W.e().get(i2);
            if (com.ss.android.ugc.aweme.story.d.a.c(aweme) && com.ss.android.ugc.aweme.feed.x.m.a(aweme)) {
                b(i2);
                v();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final String e(Aweme aweme) {
        if (!this.u) {
            return "25";
        }
        if (this.bv != null) {
            BusinessComponentServiceUtils.getBusinessBridgeService().b();
        }
        View l2 = l(false);
        if (l2 != null) {
            l2.setAlpha(0.0f);
        }
        return super.e(aweme);
    }

    public final void f(boolean z2) {
        aj aC = aC();
        if (aC instanceof ce) {
            ((ce) aC).a(z2);
        }
    }

    @r
    public void onCommentEvent(com.ss.android.ugc.aweme.comment.c.c cVar) {
        Aweme aweme;
        if (!(cVar == null || (aweme = cVar.f71749d) == null)) {
            for (Aweme aweme2 : this.W.e()) {
                if (aweme2.getAid().equals(aweme.getAid())) {
                    aweme2.setCommentSetting(aweme.getCommentSetting());
                }
            }
        }
    }

    @r
    public void onDuetSettingEvent(com.ss.android.ugc.aweme.shortvideo.j.b bVar) {
        Aweme aweme;
        if (!(bVar == null || (aweme = bVar.f128575a) == null)) {
            for (Aweme aweme2 : this.W.e()) {
                if (aweme2.getAid().equals(aweme.getAid())) {
                    aweme2.setDuetSetting(aweme.getDuetSetting());
                    aweme2.setReactSetting(aweme.getReactSetting());
                }
            }
        }
    }

    @r
    public void onHideCommentInputFragmentEvent(com.ss.android.ugc.aweme.commercialize.event.f fVar) {
        Activity activity = this.bv;
        if (activity == null || fVar.f74049b != activity.hashCode()) {
            return;
        }
        if (fVar.f74048a) {
            com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
            if (aVar != null) {
                aVar.i();
                return;
            }
            return;
        }
        Fragment az_ = az_();
        if (az_ != null && az_.getUserVisibleHint()) {
            m();
            T();
        }
    }

    @r
    public void onShareCompleteEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        if (this.f79699k != null && TextUtils.equals("live_event", jVar.f103916d)) {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            try {
                View view = ((androidx.fragment.app.e) this.bv).getSupportFragmentManager().a("com.bytedance.android.livesdk.browser.fragment.WebDialogFragment").getView();
                Activity activity = this.bv;
                if (view != null && createIIMServicebyMonsterPlugin != null) {
                    createIIMServicebyMonsterPlugin.showIMSnackbar(activity, view, jVar);
                }
            } catch (Error unused) {
            }
        }
    }

    @r
    public void onShowAdLayoutEvent(com.ss.android.ugc.aweme.ad.feed.mask.b.a aVar) {
        com.ss.android.ugc.aweme.comment.e.a aVar2;
        if (this.W.c(this.Y) != null && TextUtils.equals(aVar.f65964b, this.W.c(this.Y).getAid())) {
            boolean z2 = aVar.f65963a;
            if (this.W.c(this.Y) != null && (aVar2 = this.f79701m) != null) {
                aVar2.c(z2);
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public void onStoryCommentEvent(l lVar) {
        com.ss.android.ugc.aweme.story.view.a af;
        Comment comment = lVar.f71769b;
        int i2 = lVar.f71768a;
        if (i2 == 1) {
            b(comment);
        } else if (i2 == 2) {
            c(comment);
        } else if (i2 == 3 && comment != null && (af = af()) != null) {
            comment.getCid();
            comment.getFakeId();
            comment.getText();
            af.d(comment);
        }
    }

    @r
    public void onVideoCleanModeEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.b bVar) {
        aj bj;
        if (this == bVar.f95078c && (bj = bj()) != null && bVar.f95077b != null && bj.b() != null && bVar.f95077b.getAid().equals(bj.b().getAid())) {
            bj.b(bVar.f95076a);
        }
    }

    static CaptionItemModel d(Aweme aweme) {
        if (!(aweme == null || aweme.getVideo() == null || aweme.getVideo().getCaptionModel() == null || aweme.getVideo().getCaptionModel().getCaptionList() == null || aweme.getVideo().getCaptionModel().getOriginalCaptionLanguage() == null)) {
            long languageId = aweme.getVideo().getCaptionModel().getOriginalCaptionLanguage().getLanguageId();
            for (CaptionItemModel captionItemModel : aweme.getVideo().getCaptionModel().getCaptionList()) {
                if (captionItemModel.getLanguageId() != languageId) {
                    return captionItemModel;
                }
            }
        }
        return null;
    }

    private void j(String str) {
        if (bD()) {
            if (com.ss.android.ugc.aweme.feed.x.g.e(bf())) {
                bm();
            }
            if (this.as == null || !this.as.a(str)) {
                com.ss.android.ugc.aweme.framework.a.a.b(6, "DeleteAweme", "mDeleteItemListener.deleteItem " + str + " failed");
                r(str);
                return;
            }
            v();
        }
    }

    private void r(String str) {
        if (!(str == null || this.W == null || this.W.e() == null)) {
            List<Aweme> e2 = this.W.e();
            for (int i2 = 0; i2 < e2.size(); i2++) {
                Aweme aweme = e2.get(i2);
                if (com.ss.android.ugc.aweme.story.d.a.c(aweme) && com.ss.android.ugc.aweme.feed.x.m.a(aweme)) {
                    a(i2, str);
                } else if (aweme != null && str.equals(aweme.getAid())) {
                    b(i2);
                    v();
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean t(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.h.b.t(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        com.ss.android.ugc.aweme.framework.a.a.b(6, "DetailFragmentPanel", "showLoadError mDetailInputFragment.enterCleanMode() " + Log.getStackTraceString(exc));
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.d();
        }
        com.ss.android.ugc.aweme.app.api.b.a.a(com.bytedance.ies.ugc.appcontext.d.a(), (Throwable) exc, (int) R.string.g4j);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        if (bD()) {
            this.M.b();
            this.bE = false;
            this.f79691c = false;
            com.ss.android.ugc.aweme.app.api.b.a.a(com.bytedance.ies.ugc.appcontext.d.a(), (Throwable) exc, (int) R.string.g4j);
        }
    }

    public final void e(String str) {
        MethodCollector.i(5946);
        ViewStub viewStub = (ViewStub) this.f79699k.findViewById(R.id.b9_);
        if (viewStub == null) {
            MethodCollector.o(5946);
            return;
        }
        viewStub.inflate();
        f(str);
        MethodCollector.o(5946);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al, com.ss.android.ugc.aweme.feed.q.a
    public final void g(String str) {
        super.g(str);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.detail.g.c(str));
        if (!this.bB) {
            this.bB = true;
            com.ss.android.ugc.aweme.cc.c.a("detail_page", com.ss.android.ugc.aweme.cc.b.SUCCESS, this.aJ.getEventType());
            if (TextUtils.equals(this.aJ.getEventType(), "westwindow")) {
                String eventType = this.aJ.getEventType();
                h.f.b.l.d("detail_page", "");
                h.f.b.l.d(eventType, "");
                a.C3587a aVar = com.ss.android.ugc.aweme.story.e.a.f137035a.get("detail_page");
                if (aVar != null) {
                    long currentTimeMillis = System.currentTimeMillis() - aVar.f137038b;
                    com.ss.android.ugc.aweme.story.e.a.f137035a.remove("detail_page");
                    com.ss.android.ugc.aweme.cw.g.c().execute(new a.b("detail_page", currentTimeMillis, eventType));
                }
            }
        }
        a aVar2 = this.bH;
        if (aVar2 != null && !aVar2.f79726a) {
            this.bH.f79726a = true;
            com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(this.bH, 16);
        }
    }

    @r
    public void onAwemeDeleteEvent(e eVar) {
        Aweme aweme;
        if (TextUtils.equals(this.aJ.getEventType(), eVar.f93473b) && (aweme = eVar.f93472a) != null && this.as != null && this.as.a(aweme)) {
            aX();
            this.W.notifyDataSetChanged();
            if (this.W.getCount() == 3) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.m("from_full_recommend"));
            }
            this.N.post(new k(this));
            H();
        }
    }

    @r
    public void onCommentDialogEvent(d dVar) {
        boolean z2;
        Activity activity = this.bv;
        if (activity != null && !activity.isFinishing() && dVar.f93469d == activity.hashCode()) {
            boolean z3 = false;
            if (dVar.f93466a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            g(z2);
            if (dVar.f93466a == 1) {
                z3 = true;
            }
            h(z3);
            if (dVar.f93466a == 1) {
                com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
                if (aVar != null) {
                    aVar.i();
                    return;
                }
                return;
            }
            Fragment az_ = az_();
            if (az_ != null && az_.getUserVisibleHint()) {
                m();
                T();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(com.ss.android.ugc.aweme.feed.param.b r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.h.b.<init>(com.ss.android.ugc.aweme.feed.param.b):void");
    }

    private static List<Aweme> d(List<Aweme> list) {
        if (!com.ss.android.ugc.aweme.feed.api.h.a().fullscreenShowLive()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                if (aweme.isLive()) {
                    StreamUrlModel streamUrlModel = aweme.getStreamUrlModel();
                    if (!(aweme.getRoom() == null || streamUrlModel == null || TextUtils.isEmpty(streamUrlModel.id))) {
                        com.ss.android.ugc.aweme.video.k.a().f143434b.put(streamUrlModel.id, RoomStruct.fromAweme(aweme));
                    }
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void b(Aweme aweme) {
        long playCount;
        String a_ = a_(true);
        if (this.n != null) {
            if (t(aweme)) {
                this.n.setVisibility(8);
                if (TcmServiceImpl.j().a(aweme, a_(true))) {
                    b(false);
                    this.p.a(aweme);
                    return;
                }
                this.p.b();
                b(true);
                return;
            }
            this.n.setVisibility(0);
            b(false);
            com.ss.android.ugc.aweme.common.r.a("analytics_banner_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a_).a("group_id", aweme.getAid()).f66730a);
            TextView textView = (TextView) this.n.findViewById(R.id.f0l);
            AwemeStatistics statistics = aweme.getStatistics();
            long j2 = 0;
            if (statistics == null) {
                playCount = 0;
            } else {
                playCount = statistics.getPlayCount();
            }
            String quantityString = this.bv.getResources().getQuantityString(R.plurals.s, (int) playCount, a(playCount));
            if (statistics != null) {
                j2 = statistics.getShareCount();
            }
            textView.setText(quantityString + this.bv.getResources().getString(R.string.b9o) + " " + this.bv.getResources().getQuantityString(R.plurals.r, (int) j2, a(j2)));
            this.n.setOnClickListener(new m(this, aweme));
        }
    }

    public void c(List<Aweme> list) {
        if (this.W != null) {
            int count = this.W.getCount();
            this.W.a(list);
            int count2 = this.W.getCount();
            if (count < count2 && list != null && list.size() >= count2) {
                m.a.a().a(list.subList(count, count2), !this.f79691c, aJ());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.a
    public final void e(boolean z2) {
        super.e(z2);
        if (z2) {
            m();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final com.ss.android.ugc.aweme.feed.q.a a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        if (bVar.isExposeSharerMsg() && !TextUtils.isEmpty(bVar.getAid())) {
            if (this.y == null) {
                this.y = new g();
            }
            g gVar = this.y;
            h.f.b.l.d(bVar, "");
            gVar.a(bVar.getAid(), bVar.getShareParamLinkId(), bVar.getShareParamUtmSource(), bVar.getShareParamUserId(), bVar.getShareParamSecUserId(), bVar.isExposeSharerMsg(), bVar.getShareCheckSum(), bVar.getShareTimeStamp());
        }
        this.aI = Boolean.valueOf(bVar.isPlaylistCleanMode());
        if (!(bVar.extra == null || !bVar.extra.containsKey("is_from_add_video_chain") || this.aK == null)) {
            this.aK.f92924k = true;
        }
        return super.a(bVar);
    }

    public void b(List<Aweme> list) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                Aweme aweme = list.get(i2);
                if (aweme == null || !TextUtils.equals(aweme.getAid(), this.aJ.getAid())) {
                    i2++;
                } else if (i2 != -1 && i2 < this.W.getCount()) {
                    if (!(this.W == null || this.N.getExpectedAdapterCount() == this.W.getCount())) {
                        this.W.notifyDataSetChanged();
                    }
                    this.N.a(i2, false);
                    b(list.get(i2));
                    return;
                }
            }
        }
        if (list.size() > 0) {
            b(list.get(0));
        }
    }

    public final void c(Aweme aweme) {
        if (("message".equals(this.aJ.getEventType()) || "chat".equals(this.aJ.getEventType()) || "push".equals(this.aJ.getEventType()) || "like_list".equals(this.aJ.getEventType()) || "notification_page".equals(this.aJ.getEventType()) || "click_comment_chain".equals(this.aJ.getEventType()) || "click_comment_bubble".equals(this.aJ.getEventType()) || "collection_comment".equals(this.aJ.getEventType()) || "question_list".equals(this.aJ.getEventType())) && ((!TextUtils.isEmpty(this.aJ.getCid()) || this.aJ.isCommentForceOpenReply()) && this.aJ.getCommentDeleted() == 0)) {
            if (this.aJ.getCommentDeleted() == 0 && this.aJ.getLevel1CommentDeleted() == 1) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.dja).a();
            } else if (!y.f(aweme)) {
                a(y(), this.aJ.getCid(), 0);
                return;
            }
        }
        if (!TextUtils.isEmpty(this.aJ.getVid())) {
            b(y(), this.aJ.getVid());
        } else if (!TextUtils.isEmpty(this.aJ.getLikeListIds())) {
            a(y(), this.aJ.getLikeListIds(), this.aJ.getLikeCount(), 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.v, com.ss.android.ugc.aweme.feed.q.a
    public final void d(Exception exc) {
        if (bD()) {
            if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.a aVar = (com.ss.android.ugc.aweme.base.api.a.a) exc;
                if (aVar.getErrorCode() == 2130) {
                    com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.bv, (Throwable) exc, (int) R.string.h_e);
                } else if (aVar.getErrorCode() == 2752) {
                    if (aD() == null || aD().getCommerceVideoAuthInfo() == null || aD().getCommerceVideoAuthInfo().getAuthStatus() != 2) {
                        com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.bv, exc, (int) R.string.d29);
                    }
                    ab.a("promote_layer_show").b("enter_from", this.aJ.getEventType()).b("content", "delete_fail").b("group_id", this.aJ.getAid()).f();
                }
            } else {
                com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.bv, (Throwable) exc, (int) R.string.b5u);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.j
    public final void d(String str) {
        String str2;
        if (!bD() || s.b() == 0 || !com.ss.android.ugc.aweme.feed.ai.a()) {
            return;
        }
        if (TextUtils.equals(this.G, str)) {
            int i2 = this.A + 1;
            this.A = i2;
            if (i2 >= s.a() && !h.a.f93250a.a(str)) {
                if (com.ss.android.ugc.aweme.ug.guide.g.c(aD())) {
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a(com.ss.android.i.b.n, "detail").a(com.ss.android.i.b.r, str);
                    if (s.b() == 1) {
                        str2 = "double";
                    } else {
                        str2 = "triple";
                    }
                    com.ss.android.ugc.aweme.common.r.a("share_highlight", a2.a("repeat", str2).a("highlight_cause", "loop2").f66730a);
                    ai bi = bi();
                    if (bi != null) {
                        bi.L();
                    }
                }
                if (this.A == 2) {
                    n.a("awe_share_guide_type_log", new com.ss.android.ugc.aweme.app.f.c().a("awe_share_guide_type", com.ss.android.ugc.aweme.feed.ai.c()).a());
                }
            } else if (this.A == 2) {
                n.a("awe_share_guide_type_log", new com.ss.android.ugc.aweme.app.f.c().a("awe_share_guide_type", "none").a());
            }
        } else {
            this.A = 1;
            this.G = str;
        }
    }

    public final boolean b(String str) {
        com.ss.android.ugc.aweme.story.view.a af = af();
        if (af == null) {
            return false;
        }
        return af.a(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.u.x
    public final void c(boolean z2) {
        this.bE = z2;
    }

    private int c(List<Aweme> list, int i2) {
        Aweme aweme;
        int indexOf;
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return -1;
        }
        List<Aweme> e2 = this.W.e();
        if (!com.bytedance.common.utility.collection.b.a((Collection) e2) && (aweme = e2.get(this.Y)) != null && (indexOf = list.indexOf(aweme) - i2) >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final void a(int i2, float f2) {
        boolean z2;
        Aweme c2;
        float max;
        float max2;
        if (f2 != 0.0f && this.W.getCount() > this.Y + 1) {
            if (this.Y == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            Aweme c3 = this.W.c(this.Y);
            if (z2) {
                c2 = this.W.c(this.Y + 1);
            } else {
                c2 = this.W.c(i2);
            }
            if (c3.getAwemeType() == c2.getAwemeType()) {
                return;
            }
            if (c3.getAwemeType() != 101 && c2.getAwemeType() != 101) {
                return;
            }
            if (c3.getAwemeType() == 101) {
                if (z2) {
                    max2 = Math.max(f2 - 0.5f, 0.0f);
                } else {
                    max2 = Math.max(0.5f - f2, 0.0f);
                }
                com.ss.android.ugc.aweme.detail.b.a aVar = this.v;
                if (aVar != null) {
                    aVar.a(max2 * 2.0f);
                }
                com.ss.android.ugc.aweme.comment.e.a aVar2 = this.f79701m;
                if (aVar2 != null) {
                    aVar2.a(max2 * 2.0f);
                }
            } else if (c2.getAwemeType() == 101) {
                if (z2) {
                    max = Math.max(0.5f - f2, 0.0f);
                } else {
                    max = Math.max(f2 - 0.5f, 0.0f);
                }
                com.ss.android.ugc.aweme.detail.b.a aVar3 = this.v;
                if (aVar3 != null) {
                    aVar3.a(max * 2.0f);
                }
                com.ss.android.ugc.aweme.comment.e.a aVar4 = this.f79701m;
                if (aVar4 != null) {
                    aVar4.a(max * 2.0f);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public void b(List<Aweme> list, boolean z2) {
        a aVar = this.bH;
        if (aVar != null) {
            boolean z3 = true;
            boolean z4 = !this.z;
            if (aVar.f79727b != 2) {
                z3 = false;
            }
            if (z4 || z3) {
                com.bytedance.aweme.b.a.f25788b.f25790a.removeCallbacks(this.bH);
                this.bH = null;
            }
        }
        if (bD() && !com.bytedance.common.utility.collection.b.a((Collection) list)) {
            this.f79695g = z2;
            DmtStatusView a2 = this.M.a(false);
            if (a2 != null) {
                a2.e();
            }
            if (!z2) {
                this.M.c();
            } else {
                this.M.d();
            }
            if (!this.z) {
                if (list.get(0) instanceof FollowFeed) {
                    list = com.ss.android.ugc.aweme.service.a.f121832a.a(list);
                } else if ("homepage_fresh".equalsIgnoreCase(this.aJ.getEventType())) {
                    list = d(list);
                }
            }
            List<Aweme> e2 = e(list);
            this.W.f91652b = z2;
            c(e2);
            final int a3 = com.ss.android.ugc.aweme.feed.x.m.a(e2, this.W.c(this.N.getCurrentItem()));
            if (!this.bE && this.f79691c) {
                this.N.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass14 */

                    static {
                        Covode.recordClassIndex(49533);
                    }

                    public final void run() {
                        if (a3 < b.this.W.getCount() - 1 && b.this.N != null) {
                            b.this.Y = a3 + 1;
                            b.this.ab = true;
                            b.this.N.setCurrentItemWithDefaultVelocity(b.this.Y);
                        }
                    }
                });
            }
            this.bE = false;
            this.f79691c = false;
            ad();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public void c(List<Aweme> list, boolean z2) {
        boolean z3;
        final int i2;
        if (bD()) {
            this.aF.setRefreshing(false);
            this.W.f91653c = z2;
            final String from = this.aJ.getFrom();
            if (z2 || this.bE || TextUtils.equals("from_mix_detail_item", from)) {
                if (!this.bE || com.bytedance.common.utility.collection.b.a((Collection) list) || this.W.getCount() == list.size()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                this.ax = z3;
                if (TextUtils.equals("from_rn_search", from) || TextUtils.equals("from_visual_search_result", from)) {
                    i2 = c(list, 0);
                } else if (TextUtils.equals("from_chat", from)) {
                    i2 = c(list, 1);
                } else if (TextUtils.equals("from_following_sky_light", from)) {
                    i2 = c(list, 1);
                } else if (TextUtils.equals("from_mix_detail_item", from)) {
                    this.Y = this.N.getCurrentItem();
                    i2 = c(list, 0);
                    this.Y = i2;
                } else {
                    i2 = -1;
                }
                c(list);
                if (!this.bE) {
                    this.N.post(new Runnable() {
                        /* class com.ss.android.ugc.aweme.detail.h.b.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(49534);
                        }

                        public final void run() {
                            if (b.this.N != null) {
                                if (!TextUtils.equals("from_mix_detail_item", from)) {
                                    b.this.ab = true;
                                }
                                int i2 = i2;
                                if (i2 > 0) {
                                    b.this.Y = i2;
                                    b.this.N.setCurrentItemWithDefaultVelocity(b.this.Y);
                                    return;
                                }
                                b.this.Y = 0;
                                b.this.N.a(b.this.Y, false);
                            }
                        }
                    });
                }
            } else if (this.bu) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.bv).a(R.string.b40).a();
                if (this.N.getCurrentItem() > 1) {
                    this.N.a(0, false);
                } else {
                    this.N.setCurrentItemWithDefaultVelocity(0);
                }
            }
            this.bE = false;
            ad();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(int i2, boolean z2) {
        Aweme c2 = this.W.c(i2);
        if (this.bu) {
            if (z2) {
                String aid = this.aJ.getAid();
                com.ss.android.ugc.aweme.framework.a.a.b(4, J, "allowAwemeChangeForFirstTime:" + z2 + ",aid:" + aid);
                if (!TextUtils.isEmpty(aid) && (c2 == null || !TextUtils.equals(aid, c2.getAid()))) {
                    com.ss.android.ugc.aweme.framework.a.a.b(4, J, "allowAwemeChangeForFirstTime->getAid is not null");
                    return;
                }
            }
            AwemeChangeCallBack.a((androidx.fragment.app.e) this.bv, c2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(long j2, long j3) {
        ai bi = bi();
        if (!(bi == null || bi.ad() == null || j2 < 0)) {
            Handler handler = this.by;
            bi.getClass();
            handler.postDelayed(i.a(bi), j2);
        }
        PopupWindow popupWindow = this.f79693e;
        if (popupWindow != null && popupWindow.isShowing() && j3 >= 0) {
            this.by.postDelayed(new j(this), j3);
        }
        com.ss.android.ugc.aweme.ug.guide.g.c();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final void a(MotionEvent motionEvent, aj ajVar, Aweme aweme) {
        if (!this.aJ.isVideoFromDcd()) {
            super.a(motionEvent, ajVar, aweme);
        }
    }

    private void a(aj ajVar, boolean z2, int i2) {
        if (ajVar != null && ajVar.b() != null) {
            if (!this.aJ.getEventType().equals("opus")) {
                com.ss.android.ugc.aweme.common.r.a(UGCMonitor.EVENT_COMMENT, this.aJ.getEventType(), this.aJ.getAid(), 0);
            } else if (this.aJ.isMyProfile()) {
                com.ss.android.ugc.aweme.common.r.a(UGCMonitor.EVENT_COMMENT, "personal_homepage", this.aJ.getAid(), 0);
            } else {
                com.ss.android.ugc.aweme.common.r.a(UGCMonitor.EVENT_COMMENT, "others_homepage", this.aJ.getAid(), 0);
            }
            a(ajVar, a_(true), z2, i2);
        }
    }

    private void a(aj ajVar, String str, boolean z2, int i2) {
        String str2;
        String str3;
        String searchResultId = this.aJ.getSearchResultId();
        if (TextUtils.isEmpty(searchResultId)) {
            searchResultId = ac.e(ajVar.b());
        }
        int i3 = -1;
        Aweme y2 = y();
        String str4 = "";
        String str5 = UGCMonitor.TYPE_POST;
        boolean z3 = false;
        if (y2 != null) {
            Aweme y3 = y();
            if (y3.getBottomBarModel() != null) {
                z3 = true;
            }
            i3 = com.ss.android.ugc.aweme.story.b.h.a(y3.getAuthor());
            if (com.ss.android.ugc.aweme.story.d.a.d(y3)) {
                str5 = "story";
            }
            str2 = com.ss.android.ugc.aweme.story.d.a.b(y3);
        } else {
            str2 = str4;
        }
        if (!(aD() == null || aD().playlist_info == null)) {
            str4 = aD().playlist_info.getMixId();
        }
        ae a2 = new ae().a(str);
        a2.f109472d = "click_bottom_comment_tab";
        if (z2) {
            str3 = "close_text_button_send";
        } else {
            str3 = "button_send";
        }
        a2.ag = str3;
        a2.v = str;
        a2.X = FeedParamProvider.a.a(this.bv).getPreviousPagePosition();
        a2.Y = z3;
        ae f2 = a2.g(ajVar.b());
        f2.f109471c = String.valueOf(this.D);
        ae aeVar = (ae) f2.l(this.aJ.getSearchId()).f(searchResultId);
        aeVar.u = str4;
        aeVar.am = this.aJ.getCategoryName();
        aeVar.af = i3;
        aeVar.W = str5;
        ae aeVar2 = (ae) aeVar.b_(str2);
        aeVar2.aq = i2;
        com.ss.android.ugc.aweme.metrics.c a3 = aeVar2.a(w.a(ajVar.b(), "post_comment", str)).a(com.ss.android.ugc.aweme.feed.x.y.b(this.aJ.getPreviousPage(), this.aJ.getFromGroupId()));
        com.ss.android.ugc.aweme.upvote.event.c.a(a3, y(), str);
        a3.f();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a
    public final com.ss.android.ugc.aweme.feed.adapter.b a(Context context, LayoutInflater layoutInflater, com.ss.android.ugc.aweme.feed.i.s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, com.ss.android.ugc.aweme.feed.e.l lVar) {
        if (com.ss.android.ugc.aweme.detail.g.b(this.aJ.getFrom())) {
            return new com.ss.android.ugc.aweme.feed.adapter.w(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
        }
        return new com.ss.android.ugc.aweme.detail.f(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
    }
}
