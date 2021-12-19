package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.log.al;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.a.m;
import com.ss.android.ugc.aweme.common.d.a;
import com.ss.android.ugc.aweme.common.e.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.transition.FeedShareElementInfo;
import com.ss.android.ugc.aweme.detail.transition.a;
import com.ss.android.ugc.aweme.detail.transition.d;
import com.ss.android.ugc.aweme.experiment.fp;
import com.ss.android.ugc.aweme.experiment.fs;
import com.ss.android.ugc.aweme.experiment.k;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.mix.b.e;
import com.ss.android.ugc.aweme.mix.b.f;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.a.l;
import com.ss.android.ugc.aweme.profile.a.v;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.y;
import com.ss.android.ugc.aweme.profile.presenter.z;
import com.ss.android.ugc.aweme.profile.ui.aq;
import com.ss.android.ugc.aweme.profile.ui.b;
import com.ss.android.ugc.aweme.profile.ui.bc;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.setting.ui.bv;
import com.ss.android.ugc.aweme.story.ProfileStoryApi;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.fr;
import com.ss.android.ugc.aweme.utils.ho;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.ab;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends b implements h.a, com.ss.android.ugc.aweme.common.d.c<com.ss.android.ugc.aweme.profile.a.c>, com.ss.android.ugc.aweme.common.e.c<Aweme>, d<Aweme>, o, as, com.ss.android.ugc.aweme.story.base.d, com.ss.android.ugc.aweme.story.base.d, i, j {
    protected ViewStub A;
    protected View B;
    protected boolean C;
    View D;
    public String E;
    public View F;
    b G;
    protected ProfileViewModel H;
    protected a I;
    public aq.c J;
    private LinearLayout K;
    private String L;
    private String M;
    private String Q;
    private b R;
    private int S;
    private boolean T = true;
    private boolean U;
    private com.ss.android.ugc.aweme.story.archive.a V;
    private bc W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private Aweme aa;
    private String ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private Boolean ag = false;
    private boolean ah = false;
    private String ai;
    private String aj;
    private String ak;
    private boolean al = false;
    private MineUserStoryFetcher am = new MineUserStoryFetcher((byte) 0);
    private boolean an = true;
    private boolean ao = false;
    private IDraftService.DraftListener ap = new IDraftService.DraftListenerAdapter() {
        /* class com.ss.android.ugc.aweme.profile.ui.c.AnonymousClass3 */

        static {
            Covode.recordClassIndex(75564);
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftClean() {
            if (c.this.f117014j && c.this.f117013e == 0) {
                c.this.o();
                c.this.x();
            }
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftDelete(com.ss.android.ugc.aweme.draft.model.c cVar) {
            com.ss.android.ugc.aweme.story.j.a.b("AwemeListFragmentImpl", "onDraftDelete -> delete draft");
            if (c.this.f117014j && c.this.f117013e == 0) {
                c.this.I();
            }
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(com.ss.android.ugc.aweme.draft.model.c cVar) {
            if (c.this.f117014j && c.this.f117013e == 0) {
                c.this.I();
            }
        }
    };
    private boolean aq = false;
    private boolean ar = false;

    /* renamed from: b  reason: collision with root package name */
    protected User f117010b;

    /* renamed from: c  reason: collision with root package name */
    protected String f117011c;

    /* renamed from: d  reason: collision with root package name */
    protected String f117012d;

    /* renamed from: e  reason: collision with root package name */
    protected int f117013e;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f117014j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f117015k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f117016l;

    /* renamed from: m  reason: collision with root package name */
    protected int f117017m = -1;
    protected RecyclerView n;
    public String o = "";
    protected com.ss.android.ugc.aweme.profile.a.b p;
    protected WrapGridLayoutManager q;
    public com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> r;
    protected DmtStatusView s;
    protected aq.a t;
    protected boolean u = true;
    protected DmtStatusView.a v;
    protected boolean w;
    protected boolean y = true;
    public boolean z;

    static {
        Covode.recordClassIndex(75561);
    }

    private static boolean d(int i2) {
        return i2 == 4;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public final void A() {
        this.w = true;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    /* access modifiers changed from: protected */
    public int a() {
        return R.layout.anw;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.e.i] */
    @Override // com.ss.android.ugc.aweme.common.e.d
    public final boolean a(com.ss.android.ugc.aweme.common.e.i<Aweme> iVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Aweme> list, boolean z2) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(103, new g(c.class, "onPrivateModelEvent", w.class, ThreadMode.POSTING, 0, false));
        hashMap.put(332, new g(c.class, "onMixDeleteEvent", f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(2, new g(c.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, true));
        hashMap.put(361, new g(c.class, "onGuideCardChange", l.class, ThreadMode.MAIN, 0, false));
        hashMap.put(362, new g(c.class, "onPublishStatusUpdate", com.ss.android.ugc.aweme.shortvideo.j.f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(363, new g(c.class, "onMixCreatedEvent", e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(364, new g(c.class, "onProAccountStateChangeEvent", com.ss.android.ugc.aweme.setting.d.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(365, new g(c.class, "checkRemoveTalentAdData", com.ss.android.ugc.aweme.commercialize.profile.talent.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(366, new g(c.class, "onDarkmodeStatusEvent", com.ss.android.ugc.aweme.profile.b.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(76, new g(c.class, "onUpdateWhoCanSeeMyLikeListModeEvent", bv.class, ThreadMode.MAIN, 0, false));
        hashMap.put(36, new g(c.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        hashMap.put(367, new g(c.class, "onRemoveVideoFromMix", com.ss.android.ugc.aweme.mix.b.h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(33, new g(c.class, "onDynamicEvent", com.ss.android.ugc.aweme.challenge.d.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(368, new g(c.class, "onSwitchCreatorAccountSuccessEvent", com.ss.android.ugc.aweme.setting.d.f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(77, new g(c.class, "onUpdateUserEvent", com.ss.android.ugc.aweme.base.d.c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(34, new g(c.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(369, new g(c.class, "checkRemoveTalentAdData", com.ss.android.ugc.aweme.mix.b.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(55, new g(c.class, "onSwitchBusinessAccountSuccessEvent", com.ss.android.ugc.aweme.setting.d.e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(370, new g(c.class, "onMixManageDoneClickEvent", com.ss.android.ugc.aweme.mix.b.g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(135, new g(c.class, "onChangePlayListNameEvent", com.ss.android.ugc.aweme.mix.b.c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        return this.ao;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public void b(boolean z2) {
        if (this.X != z2) {
            if (this.C) {
                N();
            }
            this.X = z2;
            V();
            this.s.g();
        }
    }

    private void a(com.ss.android.ugc.aweme.draft.model.c cVar) {
        com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
        if (bVar != null && !bVar.B) {
            bVar.f115805h = cVar;
            bVar.f115801d = true;
            bVar.notifyDataSetChanged();
        }
        DmtStatusView dmtStatusView = this.s;
        if (dmtStatusView != null && !dmtStatusView.j()) {
            this.s.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(FeedItemList feedItemList) {
        if (com.bytedance.common.utility.collection.b.a((Collection) feedItemList.getItems())) {
            k();
            return;
        }
        com.ss.android.ugc.aweme.profile.presenter.b bVar = (com.ss.android.ugc.aweme.profile.presenter.b) this.r.f76396h;
        Message obtainMessage = bVar.mHandler.obtainMessage(0);
        obtainMessage.obj = feedItemList;
        bVar.handleMsg(obtainMessage);
        getActivity();
        if (Q()) {
            k();
        } else {
            this.u = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(IAVDraftService iAVDraftService) {
        try {
            com.ss.android.ugc.aweme.profile.service.b.f116618a.checkToTransformMusDraft();
            com.ss.android.b.a.a.a.b(new l(this, iAVDraftService.draftList(false)));
            return null;
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2, com.ss.android.ugc.aweme.mix.model.a aVar) {
        com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (aVar != null) {
            List<com.ss.android.ugc.aweme.mix.model.d> mixList = aVar.getMixList();
            User user = this.f117010b;
            if (user == null || user.isSecret()) {
                this.p.a(false, (com.ss.android.ugc.aweme.mix.model.a) null);
                return;
            }
            if (z2) {
                if (R().booleanValue() || !this.f117014j) {
                    if (mixList != null) {
                        if (mixList.size() > 0) {
                            this.p.a(true, aVar);
                            return;
                        } else if (mixList.size() == 0 && this.f117014j && MixFeedService.k().f()) {
                            this.p.a(true, (com.ss.android.ugc.aweme.mix.model.a) null);
                            return;
                        } else if (mixList.size() != 0) {
                            return;
                        }
                    } else if (this.f117014j && MixFeedService.k().f()) {
                        this.p.a(true, (com.ss.android.ugc.aweme.mix.model.a) null);
                        return;
                    }
                    if (this.f117014j) {
                        return;
                    }
                } else {
                    this.p.a(false, (com.ss.android.ugc.aweme.mix.model.a) null);
                    return;
                }
            }
            this.p.a(false, (com.ss.android.ugc.aweme.mix.model.a) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2, com.ss.android.ugc.aweme.story.model.d dVar) {
        this.U = false;
        com.ss.android.ugc.aweme.story.model.c detail = dVar.getDetail();
        boolean n2 = this.p.n();
        this.p.a(detail);
        if (this.p.q()) {
            if (z2 && !this.s.j() && !this.s.l()) {
                boolean n3 = this.p.n();
                if (n2) {
                    if (n3) {
                        this.p.notifyItemChanged(0);
                    } else {
                        this.p.notifyItemRemoved(0);
                    }
                } else if (n3) {
                    this.p.notifyItemInserted(0);
                }
            }
            f(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2, Throwable th) {
        com.ss.android.ugc.aweme.story.j.a.a("profile", th);
        this.U = false;
        this.V = null;
        f(z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void a(String str, String str2) {
        com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar;
        if (!TextUtils.equals(this.f117011c, str) && !TextUtils.equals(this.f117012d, str2)) {
            this.u = true;
        }
        this.f117011c = str;
        this.f117012d = str2;
        com.ss.android.ugc.aweme.profile.a.b bVar2 = this.p;
        if (bVar2 != null) {
            bVar2.z = str;
            bVar2.A = str2;
        }
        if (this.f117013e == 0 && !this.f117014j && (bVar = this.r) != null) {
            ((z) bVar).f116611a = this.f117011c;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Aweme> list, boolean z2) {
        String str;
        if (!d(list, z2)) {
            com.ss.android.ugc.aweme.profile.f.l.b();
            if (ab_()) {
                if (fp.f90063a) {
                    fr.a((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    fr.b(3000);
                }
                boolean z3 = true;
                this.p.d(true);
                if (getTag() != null && (str = this.f117011c) != null && str.equals(b.C2974b.f116918b) && getTag().endsWith(Integer.toString(0)) && b.C2974b.f116917a > 0) {
                    b.i.b(new r(b.C2974b.f116919c, b.C2974b.f116917a), b.i.f4824a);
                    b.C2974b.f116917a = 0;
                    b.C2974b.f116918b = null;
                    b.C2974b.a("");
                }
                this.y = true;
                this.ah = true;
                this.s.d();
                this.p.ai_();
                this.p.x = z2;
                List<Aweme> d2 = d(list);
                c(d2);
                this.p.b_(d2);
                if (!this.f117014j) {
                    J();
                }
                if (W()) {
                    a(d2 != null ? d2.size() : 0);
                }
                if (this.f117014j && this.f117013e == 0) {
                    this.H.a(d2);
                }
                if (this.f117014j && this.f117013e == 14) {
                    this.H.b(d2);
                }
                if (this.f117014j && TextUtils.equals(this.O, ho.a(1)) && !s.a.f66880a.d().c().booleanValue() && !s.a.f66880a.a().c().booleanValue() && this.D != null && this.p.c() != 0 && !this.Y) {
                    this.D.setVisibility(0);
                }
                if (d2 != null && !d2.isEmpty()) {
                    z3 = false;
                } else if (this.s != null) {
                    if (this.C) {
                        n();
                    } else if (!this.p.n()) {
                        f();
                    }
                }
                if (this.t != null && (!z3 || this.p.n())) {
                    this.t.a(this.f117013e);
                }
                this.ao = z2;
                this.S = 0;
                a(z2);
                if (!this.f117014j) {
                    com.ss.android.ugc.aweme.profile.f.l.c();
                    com.bytedance.a.b.b("profile", com.bytedance.a.d.a(this.O));
                    com.ss.android.ugc.aweme.cc.c.a(com.ss.android.ugc.aweme.cc.d.f69802a, (com.ss.android.ugc.aweme.cc.b) null, 6);
                    com.ss.android.ugc.aweme.cc.d.f69803b = false;
                } else if (com.ss.android.ugc.aweme.cc.d.f69804c) {
                    com.ss.android.ugc.aweme.cc.c.a("my_profile", (com.ss.android.ugc.aweme.cc.b) null, 6);
                    com.ss.android.ugc.aweme.cc.d.f69804c = false;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z2) {
        if (!z2) {
            this.p.a((h.a) null);
            this.p.d(false);
            return;
        }
        X();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public final void a(boolean z2, boolean z3) {
        b.i.a(100).a(new s(this, z2, z3), b.i.f4826c, null);
    }

    private boolean a(Bundle bundle) {
        View view;
        Activity activity;
        if (com.ss.android.ugc.aweme.detail.transition.b.f79870a && this.f117016l && getActivity() != null && (view = this.F) != null && !TextUtils.isEmpty(v.l(view))) {
            try {
                bundle.putBoolean("feed_transition_enable", true);
                if (Build.VERSION.SDK_INT >= 21) {
                    androidx.fragment.app.e activity2 = getActivity();
                    AnonymousClass4 r2 = new com.ss.android.ugc.aweme.detail.transition.c() {
                        /* class com.ss.android.ugc.aweme.profile.ui.c.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(75565);
                        }

                        @Override // com.ss.android.ugc.aweme.detail.transition.c
                        public final FeedShareElementInfo[] e() {
                            if (!TextUtils.isEmpty(c.this.E) && c.this.F != null && !TextUtils.equals(c.this.E, c.this.F.getTransitionName())) {
                                c.this.z();
                            }
                            if (c.this.F == null) {
                                return new FeedShareElementInfo[0];
                            }
                            return new FeedShareElementInfo[]{new FeedShareElementInfo(c.this.F)};
                        }
                    };
                    h.f.b.l.d(activity2, "");
                    h.f.b.l.d(r2, "");
                    com.ss.android.ugc.aweme.detail.transition.b.a((Activity) activity2, false);
                    com.ss.android.ugc.aweme.detail.transition.d a2 = d.a.a();
                    h.f.b.l.d(activity2, "");
                    a2.f79879a = new WeakReference<>(activity2);
                    WeakReference<Activity> weakReference = a2.f79879a;
                    if (!(weakReference == null || (activity = weakReference.get()) == null)) {
                        h.f.b.l.b(activity, "");
                        if (!activity.isFinishing()) {
                            activity.getWindow().setFlags(16, 16);
                        }
                    }
                    activity2.setExitSharedElementCallback(new a.SharedElementCallbackC1863a(activity2, r2));
                    FeedShareElementInfo<?>[] e2 = r2.e();
                    int length = e2.length;
                    View[] viewArr = new View[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        View view2 = e2[i2].f79855a;
                        if (view2 != null) {
                            viewArr[i2] = view2;
                        }
                    }
                    SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(com.ss.android.ugc.aweme.detail.transition.b.a(activity2, viewArr)).withParam("activity_has_activity_options", true).open();
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, int] */
    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void a(List<Aweme> list, int i2) {
        if (ab_() && !com.bytedance.common.utility.collection.b.a((Collection) list)) {
            if (this.p.f115801d) {
                i2++;
            }
            if (this.p.p() == 0) {
                this.p.b_(d(list));
                this.s.setVisibility(4);
            } else {
                if (com.ss.android.ugc.aweme.profile.service.h.f116622a.shouldUseRecyclerPartialUpdate()) {
                    this.p.notifyItemInserted(i2);
                } else {
                    this.p.b_(d(list));
                }
                RecyclerView recyclerView = this.n;
                if (recyclerView != null) {
                    recyclerView.post(new t(this));
                }
            }
            aq.a aVar = this.t;
            if (aVar != null) {
                aVar.a(this.f117013e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public final void a(String str, boolean z2) {
        this.E = str;
        if (Build.VERSION.SDK_INT >= 21 && this.p != null && this.F != null && !TextUtils.isEmpty(this.E)) {
            int o2 = this.p.o();
            int a2 = this.p.a(this.E) + o2;
            int l2 = this.q.l();
            int n2 = this.q.n();
            boolean z3 = !TextUtils.equals(this.E, this.F.getTransitionName());
            if (a2 >= o2) {
                if ((a2 < l2 || a2 > n2) && (z3 || !c(l2))) {
                    com.ss.android.ugc.d.a.c.a(new cu(this.f117014j));
                    this.q.e(a2);
                    return;
                }
                View aa2 = aa();
                if (aa2 != null) {
                    Rect rect = new Rect();
                    aa2.getLocalVisibleRect(rect);
                    int height = aa2.getHeight();
                    if (z2) {
                        if (c.b.f66221a != null && c.b.f66221a.f66203l.f66219e != null) {
                            int i2 = c.b.f66221a.f66203l.f66217c;
                            Rect rect2 = new Rect();
                            aa2.getGlobalVisibleRect(rect2);
                            Rect rect3 = c.b.f66221a.f66203l.f66219e;
                            if (rect2.bottom - rect2.top < height) {
                                if (!c(l2)) {
                                    com.ss.android.ugc.d.a.c.a(new ct(this.f117014j, (float) (((rect2.bottom - rect2.top) - height) - i2)));
                                } else if (rect.top > 0) {
                                    this.n.scrollBy(0, (rect2.bottom - rect2.top) - height);
                                } else {
                                    this.n.scrollBy(0, -(((rect2.bottom - rect2.top) - height) - i2));
                                }
                            } else if (rect2.bottom >= rect3.bottom || rect2.bottom <= rect3.bottom - i2) {
                                if (c(l2)) {
                                    return;
                                }
                                if (rect2.top > rect3.bottom || rect2.bottom > rect3.bottom) {
                                    com.ss.android.ugc.d.a.c.a(new cu(this.f117014j));
                                    this.q.e(a2);
                                }
                            } else if (c(l2)) {
                                this.n.scrollBy(0, -((rect3.bottom - i2) - rect2.bottom));
                            } else {
                                com.ss.android.ugc.d.a.c.a(new ct(this.f117014j, (float) ((rect3.bottom - i2) - rect2.bottom)));
                            }
                        }
                    } else if (rect.top > 0 && (rect.bottom > 0 || rect.bottom - rect.top < height)) {
                        com.ss.android.ugc.d.a.c.a(new cu(this.f117014j));
                        this.q.e(a2);
                    } else if (rect.top == 0 && rect.bottom - rect.top < height) {
                        if (c(l2)) {
                            int height2 = this.F.getHeight();
                            Rect rect4 = new Rect();
                            this.F.getLocalVisibleRect(rect4);
                            if (rect4.top > 0 && rect4.left == 0 && rect4.bottom == height2) {
                                this.n.scrollBy(0, -rect4.top);
                            } else if (rect4.top == 0 && rect4.left == 0 && rect4.bottom < height2) {
                                this.n.scrollBy(0, height2 - rect4.bottom);
                            }
                        } else {
                            com.ss.android.ugc.d.a.c.a(new ct(this.f117014j, (float) (rect.bottom - height)));
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public void a(User user) {
        String string;
        String string2;
        MethodCollector.i(7355);
        this.f117010b = user;
        if (!this.f117014j && !in.d() && this.f117013e == 1) {
            Context context = getContext();
            boolean z2 = this.ar;
            LinearLayout linearLayout = this.K;
            if (!(linearLayout == null || context == null)) {
                linearLayout.removeAllViews();
                if (z2) {
                    string = context.getString(R.string.exs);
                    string2 = context.getString(R.string.exr);
                } else {
                    string = context.getString(R.string.ey0);
                    string2 = context.getString(R.string.ext);
                }
                a(context, this.K, string, com.a.a(string2, new Object[]{in.b(this.f117010b)}));
            }
        }
        com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar = this.r;
        if (bVar == null) {
            MethodCollector.o(7355);
            return;
        }
        com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) bVar.f76396h;
        if (!(aVar instanceof com.ss.android.ugc.aweme.profile.presenter.b)) {
            MethodCollector.o(7355);
            return;
        }
        ((com.ss.android.ugc.aweme.profile.presenter.b) aVar).f116544d = this.f117010b;
        MethodCollector.o(7355);
    }

    /* access modifiers changed from: protected */
    public final View a(final Context context, boolean z2) {
        String string;
        String string2;
        MethodCollector.i(7397);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z2) {
            string = getString(R.string.ey5);
        } else {
            string = getString(R.string.ey0);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setTuxFont(32);
        Integer a2 = com.bytedance.tux.h.d.a(context, R.attr.bc);
        if (a2 != null) {
            tuxTextView.setTextColor(a2.intValue());
        }
        tuxTextView.setGravity(17);
        tuxTextView.setText(string);
        linearLayout.addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setGravity(17);
        Integer a3 = com.bytedance.tux.h.d.a(context, R.attr.bi);
        if (a3 != null) {
            tuxTextView2.setTextColor(a3.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (!this.al) {
            if (z2) {
                string2 = com.a.a(getString(R.string.ey4), new Object[]{getString(R.string.ey3)});
            } else {
                string2 = getString(R.string.ey7);
            }
            sb.append(string2);
        }
        String sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
        if (context != null) {
            String string3 = getString(R.string.ey3);
            if (z2) {
                int indexOf = sb2.indexOf(string3);
                int length = string3.length() + indexOf;
                if (indexOf >= 0 && length >= 0) {
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        /* class com.ss.android.ugc.aweme.profile.ui.c.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(75566);
                        }

                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }

                        public final void onClick(View view) {
                            SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                        }
                    }, indexOf, length, 18);
                    spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.d(n.a(17.0d)), indexOf, length, 18);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bh)), indexOf, length, 18);
                }
                tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        tuxTextView2.setText(spannableStringBuilder);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = com.bytedance.tux.h.f.b(12);
        linearLayout.addView(tuxTextView2, layoutParams);
        MethodCollector.o(7397);
        return linearLayout;
    }

    public final void a(Aweme aweme) {
        com.ss.android.ugc.aweme.story.j.a.b("AwemeListFragmentImpl", "onUserStoryUpdated, uid" + aweme.getAuthorUid() + " aweme instance: " + System.identityHashCode(aweme));
        if (this.f117013e == 0) {
            if (com.ss.android.ugc.aweme.story.d.a.a(aweme.getUserStory())) {
                d(this.f117011c);
                return;
            }
            com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar = this.r;
            if (bVar != null && bVar.f76396h != null) {
                List items = ((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).getItems();
                int a2 = v.a.a(items);
                com.ss.android.ugc.aweme.story.j.a.b("AwemeListFragmentImpl", "onUserStoryUpdated, indexInModel: ".concat(String.valueOf(a2)));
                if (a2 < 0) {
                    ((com.ss.android.ugc.aweme.profile.presenter.b) this.r.f76396h).a(aweme);
                } else if (v.a.a((Aweme) items.get(a2), aweme)) {
                    items.set(a2, aweme);
                }
                List e2 = this.p.e();
                int a3 = v.a.a(e2);
                if (a3 >= 0 && v.a.a((Aweme) e2.get(a3), aweme)) {
                    e2.set(a3, aweme);
                    com.ss.android.ugc.aweme.profile.a.b bVar2 = this.p;
                    bVar2.notifyItemChanged(bVar2.o() + a3);
                }
                com.ss.android.ugc.aweme.story.j.a.b("AwemeListFragmentImpl", "onUserStoryUpdated, indexInAdapter: ".concat(String.valueOf(a3)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty()) {
            o();
            x();
            return;
        }
        a((com.ss.android.ugc.aweme.draft.model.c) list.get(list.size() - 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 838
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.c.a(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public void a(com.ss.android.ugc.aweme.profile.a.c cVar) {
        if (((com.ss.android.ugc.aweme.common.a.a) cVar).f76353m != null && this.y && this.I != null) {
            this.y = false;
            a(false, false);
        }
    }

    private void a(Aweme aweme, ag agVar) {
        if (aweme != null) {
            if (!com.ss.android.ugc.aweme.profile.experiment.l.f116366a || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1) {
                if (aweme.getAwemeType() != 40) {
                    this.aa = aweme;
                } else if (com.ss.android.ugc.aweme.story.c.b.f()) {
                    Aweme a2 = com.ss.android.ugc.aweme.story.g.f137757a.e().a();
                    this.aa = a2;
                    String str = this.f117011c;
                    if (str != null && str.equals(a2.getAuthor().getUid())) {
                        a(this.aa);
                    }
                    this.aa = null;
                } else {
                    return;
                }
                if (this.r == null) {
                    this.ac = true;
                } else {
                    ae();
                }
                EventBus.a().f(agVar);
            }
        }
    }

    private static void ab() {
        if (k.f90252a) {
            com.ss.android.ugc.aweme.ca.c.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        if (!fs.f90079c) {
            l();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs, com.ss.android.ugc.aweme.profile.ui.aq
    public final void s() {
        b((Aweme) null);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public final void y() {
        com.ss.android.ugc.aweme.common.d.a aVar = this.I;
        if (aVar != null) {
            aVar.a();
        }
    }

    private int M() {
        return a(this.f117014j, this.f117013e);
    }

    private void N() {
        View view = this.B;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    private static boolean P() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static Boolean R() {
        return Boolean.valueOf(MixFeedService.k().c());
    }

    private void S() {
        if (U()) {
            this.s.f();
        }
    }

    private boolean W() {
        return TextUtils.equals(this.O, ho.a(0));
    }

    private boolean Z() {
        if (!this.f117014j || this.f117013e != 0) {
            return false;
        }
        return true;
    }

    private void af() {
        com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
        if (bVar != null && this.H != null) {
            bVar.r();
        }
    }

    public final void D() {
        RecyclerView recyclerView = this.n;
        if (recyclerView != null) {
            recyclerView.getRecycledViewPool().setMaxRecycledViews(0, 25);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void L() {
        this.n.b(0);
        com.ss.android.ugc.aweme.common.d.a aVar = this.I;
        if (aVar != null) {
            aVar.a(false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (ab_()) {
            this.p.ag_();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final boolean cb_() {
        if (!this.u || this.Z || this.X) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public View m() {
        if (!ab_()) {
            return null;
        }
        return this.n;
    }

    public final void o() {
        com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
        if (bVar != null) {
            bVar.f115801d = false;
            bVar.f115805h = null;
            bVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public final void q() {
        getActivity();
        this.q = new WrapGridLayoutManager(3, 1);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public final void w() {
        com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
        if (bVar != null && bVar.getItemCount() < 24) {
            l();
        }
    }

    public final void z() {
        this.F = aa();
        this.E = null;
    }

    private void O() {
        if (this.f117014j && this.f117013e == 0) {
            IAVDraftService draftService = AVExternalServiceImpl.a().draftService();
            b.i.b(new n(this, draftService), draftService.executor());
        }
    }

    private static boolean Q() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean P = P();
        com.ss.android.ugc.aweme.lancet.j.f107229h = P;
        return P;
    }

    private boolean U() {
        if (this.p.getItemCount() != 0 || this.p.f115801d) {
            return false;
        }
        return true;
    }

    private void X() {
        if (Y()) {
            this.p.b(((com.ss.android.ugc.aweme.profile.presenter.b) this.r.f76396h).f116545e);
            this.p.d(true);
        }
    }

    private boolean Y() {
        com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar = this.r;
        if (bVar == null || !(bVar.f76396h instanceof com.ss.android.ugc.aweme.profile.presenter.b) || !((com.ss.android.ugc.aweme.profile.presenter.b) this.r.f76396h).c()) {
            return false;
        }
        return true;
    }

    private boolean ac() {
        com.ss.android.ugc.aweme.profile.a.b bVar;
        if (!ab_() || (bVar = this.p) == null || bVar.getItemCount() != 0) {
            return false;
        }
        return true;
    }

    public final void E() {
        com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
        if (bVar != null) {
            bVar.D = null;
            if (bVar.F != null) {
                bVar.F.a(bVar.z, bVar.A, null);
            }
        }
    }

    public final void I() {
        IAVDraftService draftService = AVExternalServiceImpl.a().draftService();
        b.i.b(new i(this, draftService), draftService.executor());
    }

    /* access modifiers changed from: package-private */
    public final h.z J() {
        if (this.f117014j) {
            return h.z.f158842a;
        }
        ab.a(this.f117013e, new j(this));
        return h.z.f158842a;
    }

    /* access modifiers changed from: protected */
    public final View c() {
        MethodCollector.i(9560);
        if (this.B == null) {
            this.B = this.A.inflate();
        }
        View view = this.B;
        MethodCollector.o(9560);
        return view;
    }

    public void n() {
        if (!this.X && !this.Z && ab_()) {
            this.s.setVisibility(4);
            c().setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public void onStop() {
        if (getUserVisibleHint()) {
            y();
        }
        try {
            if (ab_()) {
                a(this.n);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final RecyclerView.h r() {
        return new a((int) com.bytedance.common.utility.n.b(getContext(), 1.0f));
    }

    /* access modifiers changed from: package-private */
    public final void x() {
        if (this.p.getItemCount() == 0) {
            this.s.setVisibility(4);
            aq.a aVar = this.t;
            if (aVar != null) {
                aVar.a(this.f117014j, this.f117013e);
            }
        }
    }

    private boolean T() {
        if ((!this.f117014j || this.f117013e != 0 || (!this.p.f115801d && !this.p.s())) && this.p.getItemCount() <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        if (ab_()) {
            if (!this.f117014j && (TextUtils.equals(this.O, ho.a(1)) || com.ss.android.ugc.aweme.base.utils.o.b(getView()) || this.z)) {
                com.bytedance.a.b.a("profile", com.bytedance.a.d.a(this.O));
            }
            N();
            S();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public void bM_() {
        if (ab_()) {
            if (this.X || this.Z) {
                f();
            } else if (this.s == null || !this.C) {
                v();
            } else {
                n();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.profile.f.n.a(false);
        if (getUserVisibleHint()) {
            y();
        }
        try {
            if (ab_()) {
                a(this.n);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        if (!this.f117014j) {
            com.bytedance.a.b.c("profile", com.bytedance.a.d.a(this.O));
        }
    }

    /* access modifiers changed from: protected */
    public final void u() {
        if (this.f117013e != 0 || this.f117014j) {
            this.r = new y();
        } else {
            z zVar = new z();
            this.r = zVar;
            zVar.f116611a = this.f117011c;
        }
        this.r.a_(this);
        this.r.a((com.ss.android.ugc.aweme.common.e.d) this);
        com.ss.android.ugc.aweme.profile.presenter.b bVar = new com.ss.android.ugc.aweme.profile.presenter.b();
        bVar.f116544d = this.f117010b;
        com.ss.android.ugc.aweme.profile.presenter.b.a(getActivity());
        this.r.a((com.ss.android.ugc.aweme.common.b) bVar);
    }

    private View aa() {
        View childAt;
        int a2 = (this.p.a(this.E) - this.q.k()) + this.p.o();
        if (a2 < 0 || (childAt = this.n.getChildAt(a2)) == null || !(this.n.a(childAt) instanceof com.ss.android.ugc.aweme.profile.a.c)) {
            return null;
        }
        this.F = ((com.ss.android.ugc.aweme.profile.a.c) this.n.a(childAt)).n;
        return ((com.ss.android.ugc.aweme.profile.a.c) this.n.a(childAt)).n;
    }

    private void ae() {
        int i2;
        List items;
        com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar = this.r;
        if (bVar == null || bVar.f76396h == null || ((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).getItems() == null || (items = ((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).getItems()) == null) {
            i2 = 0;
        } else {
            Iterator it = items.iterator();
            i2 = 0;
            while (it.hasNext() && ((Aweme) it.next()).isTop()) {
                i2++;
            }
        }
        Aweme aweme = this.aa;
        if (aweme != null && this.r.a(aweme, i2)) {
            if (this.aa.getAwemeType() != 40) {
                ((com.ss.android.ugc.aweme.profile.presenter.b) this.r.f76396h).a(this.aa, this.f117011c);
            }
            a(false, true);
            this.s.setVisibility(4);
            aq.a aVar = this.t;
            if (aVar != null) {
                aVar.a(this.f117013e);
            }
        }
    }

    public final void B() {
        boolean z2;
        T t2;
        StringBuilder append = new StringBuilder("clearData(), type is ").append(this.f117013e).append(", mAwemeAdapter null is ");
        if (this.p == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.ss.android.ugc.aweme.profile.f.k.a(append.append(z2).toString());
        com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
        if (bVar != null) {
            bVar.ai_();
            this.p.f();
            this.u = true;
            if (this.r.f76396h != null && (t2 = this.r.f76396h.mData) != null) {
                t2.maxCursor = 0;
                t2.items = null;
                t2.hasMore = 0;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public final ArrayList<Aweme> C() {
        com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
        if (bVar == null || ((com.ss.android.ugc.aweme.common.a.d) bVar).f76354l == null || ((com.ss.android.ugc.aweme.common.a.d) this.p).f76354l.size() < 3) {
            return null;
        }
        ArrayList<Aweme> arrayList = new ArrayList<>();
        for (Aweme aweme : ((com.ss.android.ugc.aweme.common.a.d) this.p).f76354l) {
            if (aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0) {
                arrayList.add(aweme);
                if (arrayList.size() >= 3) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ List K() {
        int l2 = this.q.l();
        int n2 = this.q.n();
        List e2 = this.p.e();
        if (e2 == null) {
            return null;
        }
        h.f.b.l.d("others profile list visible items: " + l2 + " - " + n2, "");
        if (l2 < 0 || l2 > e2.size() || n2 < 0 || n2 > e2.size()) {
            return null;
        }
        return e2.subList(l2, n2);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (Z()) {
            AVExternalServiceImpl.a().draftService().unregisterListener(this.ap);
        }
        super.onDestroyView();
        com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar = this.r;
        if (bVar != null) {
            bVar.cd_();
        }
        al.a().f74741a.clear();
        al.a().f74742b = false;
        com.ss.android.ugc.aweme.profile.a.b bVar2 = this.p;
        if (bVar2 != null) {
            bVar2.f();
        }
        f.a.b.b bVar3 = this.R;
        if (bVar3 != null) {
            bVar3.dispose();
        }
        f.a.b.b bVar4 = this.G;
        if (bVar4 != null) {
            bVar4.dispose();
        }
        com.a.b.c.a("profile_item_aweme");
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public void onStart() {
        RecyclerView recyclerView;
        super.onStart();
        try {
            if (this.p != null) {
                if (this.f117014j && W()) {
                    List e2 = this.p.e();
                    int a2 = v.a.a(((com.ss.android.ugc.aweme.common.a.d) this.p).f76354l);
                    if (a2 >= 0) {
                        e2.set(a2, MineUserStoryFetcher.a());
                    }
                }
                this.p.notifyDataSetChanged();
                if (d(this.f117013e) && (recyclerView = this.n) != null) {
                    com.ss.android.ugc.aweme.profile.service.c.f116620a.setDataSetChangedOnStart(true);
                    recyclerView.post(g.f117137a);
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public final void t() {
        String str;
        androidx.fragment.app.e activity = getActivity();
        boolean z2 = this.f117014j;
        if (z2 || this.f117013e == 4) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        com.ss.android.ugc.aweme.profile.a.b bVar = new com.ss.android.ugc.aweme.profile.a.b(activity, str, z2, this.f117013e, this, this, this.f117011c, this.f117012d);
        this.p = bVar;
        String str2 = this.ab;
        if (str2 != null) {
            bVar.C = str2;
        }
        this.p.a((h.a) this);
        this.p.f115803f = this.f117015k;
        if (this.f117013e == 0) {
            this.p.t = new m() {
                /* class com.ss.android.ugc.aweme.profile.ui.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(75563);
                }

                @Override // com.ss.android.ugc.aweme.common.a.m
                public final int b(int i2) {
                    if (i2 == 5 || i2 == 8 || i2 == 9 || i2 == 10) {
                        return ((GridLayoutManager) c.this.q).f3760b;
                    }
                    return 1;
                }
            };
        }
        if (this.f117014j && this.f117013e == 0) {
            this.H.a();
        }
    }

    private void V() {
        DmtStatusView dmtStatusView;
        int M2 = M();
        if (M2 != 0 && this.v != null && (dmtStatusView = this.s) != null) {
            dmtStatusView.d();
            int i2 = this.f117013e;
            if (i2 == 4) {
                a(getContext(), this.s, this.v);
            } else {
                if (this.f117014j) {
                    if (i2 == 1) {
                        if (in.d()) {
                            this.v.b(a(getContext(), M2));
                        } else if (s.a.f66880a.c().c().intValue() == 0) {
                            this.v.b(a(getContext(), false));
                        } else {
                            this.v.b(a(getContext(), true));
                        }
                    }
                } else if (i2 == 1) {
                    if (in.d()) {
                        this.v.b(a(getContext(), M2));
                    } else {
                        this.v.b(b(getContext(), false));
                    }
                }
                this.v.b(a(getContext(), M2));
            }
            this.s.setBuilder(this.v);
        }
    }

    private void ad() {
        int size;
        com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.r.f76396h;
        if (aVar instanceof com.ss.android.ugc.aweme.profile.presenter.b) {
            List items = aVar.getItems();
            if (items == null) {
                size = 0;
            } else {
                size = items.size();
            }
            int i2 = this.f117013e;
            if (i2 == 14) {
                for (int i3 = size - 1; i3 >= 0; i3--) {
                    Aweme aweme = (Aweme) items.get(i3);
                    if (!(aweme == null || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() == 1)) {
                        this.r.a(items.get(i3));
                    }
                }
            } else if (i2 == 0) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    Aweme aweme2 = (Aweme) items.get(i4);
                    if (aweme2 != null && aweme2.getStatus() != null && !aweme2.isTop() && aweme2.getStatus().getPrivateStatus() == 1) {
                        this.r.a(aweme2);
                        arrayList.add(aweme2);
                    }
                }
                ((com.ss.android.ugc.aweme.profile.presenter.b) this.r.f76396h).a(arrayList, this.f117011c);
            }
            this.p.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public void f() {
        if (ab_()) {
            if (!this.f117014j) {
                com.ss.android.ugc.aweme.profile.f.l.b();
                com.bytedance.a.b.b("profile", com.bytedance.a.d.a(this.O));
                com.ss.android.ugc.aweme.cc.c.a(com.ss.android.ugc.aweme.cc.d.f69802a, (com.ss.android.ugc.aweme.cc.b) null, 6);
                com.ss.android.ugc.aweme.cc.d.f69803b = false;
            }
            if (((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).isHasMore() && !this.Z && !this.X) {
                l();
            }
            this.ah = true;
            if (this.f117014j && this.f117013e == 0) {
                if (!com.bytedance.common.utility.collection.b.a((Collection) this.p.e())) {
                    this.p.f();
                }
                if (this.p.getItemCount() != 0 || this.p.f115801d) {
                    aq.a aVar = this.t;
                    if (aVar != null) {
                        aVar.a(this.f117013e);
                    }
                } else if (this.t != null && !((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).isHasMore()) {
                    this.t.a(this.f117014j, this.f117013e);
                }
                this.s.setVisibility(4);
            } else if (this.p.f115806i != null) {
                this.s.setVisibility(4);
            } else {
                N();
                if (!((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).isHasMore()) {
                    V();
                    this.s.g();
                    View view = this.D;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    aq.a aVar2 = this.t;
                    if (aVar2 != null) {
                        aVar2.a(this.f117014j, this.f117013e);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.c.g():void");
    }

    /* access modifiers changed from: protected */
    public void j() {
        int M2 = M();
        this.v = DmtStatusView.a.a(getContext());
        TuxTextView a2 = a(getContext(), (int) R.string.cyv);
        a2.setOnClickListener(new d(this));
        this.v.c(a2);
        int i2 = this.f117013e;
        if (i2 == 4) {
            a(getContext(), this.s, this.v);
        } else {
            try {
                if (this.f117014j) {
                    if (i2 == 1) {
                        if (in.d()) {
                            this.v.b(a(getContext(), M2));
                        } else if (s.a.f66880a.c().c().intValue() == 0) {
                            this.v.b(a(getContext(), false));
                        } else {
                            this.v.b(a(getContext(), true));
                        }
                    }
                } else if (i2 == 1) {
                    if (in.d()) {
                        this.v.b(a(getContext(), M2));
                    } else {
                        this.v.b(b(getContext(), false));
                    }
                }
                this.v.b(a(getContext(), M2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.s.setBuilder(this.v);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        int i2;
        int i3;
        int i4;
        if (this.ao) {
            if (!in.d() || !Z()) {
                if (this.f117014j) {
                    int i5 = this.f117013e;
                    com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
                    if (bVar == null || bVar.e() == null) {
                        i4 = 0;
                    } else {
                        i4 = this.p.e().size();
                    }
                    com.ss.android.ugc.aweme.profile.f.e.a(i5, true, i4);
                }
                com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar2 = this.r;
                Object[] objArr = new Object[6];
                objArr[0] = 4;
                objArr[1] = true;
                objArr[2] = this.f117011c;
                objArr[3] = Integer.valueOf(this.f117013e);
                if (this.f117014j) {
                    i2 = 1000;
                } else {
                    i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                }
                objArr[4] = Integer.valueOf(i2);
                objArr[5] = this.f117012d;
                bVar2.a(objArr);
                if (fs.f90078b && this.f117013e == 0) {
                    if (com.ss.android.ugc.aweme.profile.presenter.b.f116540f > 0) {
                        i3 = com.ss.android.ugc.aweme.profile.presenter.b.f116540f + 8;
                    } else {
                        i3 = 20;
                    }
                    int i6 = i3 - this.p.G;
                    for (int i7 = 0; i7 < i6; i7++) {
                        com.a.b.c.a(getActivity(), "profile_item_aweme");
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public void onResume() {
        View view;
        super.onResume();
        d.a.a().a();
        com.ss.android.ugc.aweme.profile.f.n.a(true);
        if (this.f117014j && TextUtils.equals(this.O, ho.a(1)) && ((s.a.f66880a.d().c().booleanValue() || this.p.c() == 0 || s.a.f66880a.a().c().booleanValue()) && (view = this.D) != null && view.getVisibility() == 0)) {
            this.D.setVisibility(8);
            this.Y = true;
        }
        if (getUserVisibleHint() && !com.bytedance.ies.abmock.b.a().a(true, "stop_main_anim_when_invisible", false)) {
            a(false, true);
        }
        if (this.ad) {
            this.ad = false;
            ad();
        }
        if (this.ae) {
            this.ae = false;
            ad();
            k();
        }
        if (this.af) {
            this.af = false;
            k();
        }
        af();
        if (this.ag.booleanValue()) {
            k();
            this.ag = false;
        }
    }

    /* access modifiers changed from: protected */
    public void p() {
        com.ss.android.ugc.aweme.challenge.ui.z zVar;
        String str;
        this.n.setOverScrollMode(2);
        q();
        this.n.setLayoutManager(this.q);
        this.n.a(r());
        if (!com.ss.android.ugc.aweme.performance.i.a()) {
            zVar = new com.ss.android.ugc.aweme.challenge.ui.z();
            this.n.a(zVar);
        } else {
            zVar = null;
        }
        this.I = new com.ss.android.ugc.aweme.common.d.a(this.n, zVar);
        if (fs.f90079c) {
            this.n.a(new RecyclerView.n() {
                /* class com.ss.android.ugc.aweme.profile.ui.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75562);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2) {
                    int i3;
                    super.a(recyclerView, i2);
                    if (i2 == 0) {
                        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof GridLayoutManager) {
                            i3 = ((LinearLayoutManager) layoutManager).m();
                        } else {
                            i3 = -1;
                        }
                        recyclerView.getLayoutManager().A();
                        if (i3 > recyclerView.getLayoutManager().A() - 15) {
                            c.this.l();
                        }
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2, int i3) {
                    super.a(recyclerView, i2, i3);
                }
            });
        }
        this.n = com.ss.android.ugc.aweme.profile.service.h.f116622a.buildBaseRecyclerView(this.n, this);
        if (this.f117014j) {
            str = "my_profile";
        } else {
            str = "user_profile";
        }
        da.a.a(str).a(this.n);
        t();
        this.n.setAdapter(this.p);
        u();
        if ((this.f117014j && this.f117013e == 0) || this.w || this.N) {
            v();
        }
        int i2 = this.f117017m;
        if (i2 > 0) {
            this.n.setPadding(0, 0, 0, i2);
        }
        if (this.ac) {
            ae();
        }
    }

    /* access modifiers changed from: protected */
    public final void v() {
        if (!this.f117014j || this.f117013e != 0 || !MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(getContext())) {
            if (!this.f117014j) {
                if (getArguments() == null || !getArguments().containsKey("is_first_time")) {
                    com.ss.android.ugc.aweme.profile.f.l.a(com.ss.android.ugc.aweme.profile.f.l.d(), "others_homepage");
                } else {
                    getArguments().remove("is_first_time");
                }
            }
            k();
        } else {
            if (TextUtils.isEmpty(this.f117011c)) {
                this.f117011c = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
            }
            if (TextUtils.isEmpty(this.f117012d)) {
                this.f117012d = com.ss.android.ugc.aweme.account.b.g().getCurSecUserId();
            }
            this.u = false;
            if (!in.d()) {
                ((com.ss.android.ugc.aweme.profile.presenter.b) this.r.f76396h).b(this.f117011c).a(new e(this), new m(this));
            }
        }
        O();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.as
    public final boolean k() {
        int i2;
        int i3;
        if (fs.f90079c && this.r.j()) {
            return false;
        }
        if ((in.d() && Z()) || !ab_()) {
            return false;
        }
        getActivity();
        if (!Q()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.de8).a();
            if (T()) {
                this.s.h();
            } else {
                this.s.d();
            }
            this.u = true;
            return false;
        }
        S();
        boolean z2 = !this.r.j();
        if (this.f117014j && TextUtils.isEmpty(this.f117011c)) {
            this.f117011c = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
        }
        if (this.f117014j && TextUtils.isEmpty(this.f117012d)) {
            this.f117012d = com.ss.android.ugc.aweme.account.b.g().getCurSecUserId();
        }
        if (!TextUtils.isEmpty(this.f117011c)) {
            b.i.b(new com.ss.android.ugc.aweme.profile.f.j(this.f117013e, this.f117011c), r.a());
            if (this.f117014j) {
                com.ss.android.ugc.aweme.profile.f.e.a(this.f117013e, false, 0);
            }
            com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar = this.r;
            Object[] objArr = new Object[6];
            objArr[0] = 1;
            objArr[1] = true;
            objArr[2] = this.f117011c;
            objArr[3] = Integer.valueOf(this.f117013e);
            if (this.f117014j) {
                i2 = 1000;
            } else {
                i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            objArr[4] = Integer.valueOf(i2);
            objArr[5] = this.f117012d;
            bVar.a(objArr);
            this.u = false;
            if (this.f117013e == 0 && (!this.f117014j || R().booleanValue())) {
                MixFeedService.k().a(this.f117011c, this.f117012d, new o(this));
            }
            e(false);
            if (fs.f90078b && this.f117013e == 0) {
                com.a.b.c.a("profile_item_aweme");
                if (com.ss.android.ugc.aweme.profile.presenter.b.f116540f > 0) {
                    i3 = com.ss.android.ugc.aweme.profile.presenter.b.f116540f;
                } else {
                    i3 = 12;
                }
                int i4 = i3 - this.p.G;
                for (int i5 = 0; i5 < i4; i5++) {
                    com.a.b.c.a(getActivity(), "profile_item_aweme");
                }
            }
        }
        return z2;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs, com.ss.android.ugc.aweme.profile.ui.aq
    public final void c_(String str) {
        this.aj = str;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public final void d(boolean z2) {
        this.f117015k = z2;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void d_(boolean z2) {
        this.C = z2;
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onGuideCardChange(l lVar) {
        this.p.m();
    }

    private boolean c(int i2) {
        if (i2 > this.p.o() + 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.aq
    public final void a(aq.a aVar) {
        this.t = aVar;
    }

    public final void b(String str) {
        this.ab = str;
        com.ss.android.ugc.aweme.profile.a.b bVar = this.p;
        if (bVar != null) {
            bVar.C = str;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void checkRemoveTalentAdData(com.ss.android.ugc.aweme.mix.b.b bVar) {
        this.p.a(bVar.f109808a, (com.ss.android.ugc.aweme.mix.model.a) null);
    }

    @org.greenrobot.eventbus.r
    public void onDarkmodeStatusEvent(com.ss.android.ugc.aweme.profile.b.b bVar) {
        if (this.f117014j) {
            int i2 = this.f117013e;
            if (i2 == 14 || i2 == 0) {
                this.af = true;
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onDynamicEvent(com.ss.android.ugc.aweme.challenge.d.b bVar) {
        if (bVar.f69919a == 0) {
            a(true, false);
        } else {
            y();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z2) {
        super.onHiddenChanged(z2);
        if (!z2) {
            af();
        }
    }

    @org.greenrobot.eventbus.r
    public void onMixCreatedEvent(e eVar) {
        if (this.f117013e == 0 && this.f117014j) {
            this.ag = true;
        }
    }

    @org.greenrobot.eventbus.r
    public void onMixManageDoneClickEvent(com.ss.android.ugc.aweme.mix.b.g gVar) {
        if (this.f117013e == 0 && this.f117014j) {
            k();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onProAccountStateChangeEvent(com.ss.android.ugc.aweme.setting.d.b bVar) {
        if (this.f117013e == 0 && this.f117014j) {
            this.aq = true;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(com.ss.android.ugc.aweme.setting.d.e eVar) {
        if (this.f117013e == 0 && this.f117014j) {
            this.aq = true;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onSwitchCreatorAccountSuccessEvent(com.ss.android.ugc.aweme.setting.d.f fVar) {
        if (this.f117013e == 0 && this.f117014j) {
            this.aq = true;
        }
    }

    private void f(boolean z2) {
        com.ss.android.ugc.aweme.story.archive.a aVar;
        if (!z2 && (aVar = this.V) != null) {
            a(aVar.f136740a, this.V.f136741b);
            this.V = null;
        }
    }

    @org.greenrobot.eventbus.r
    public void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        if (com.ss.android.ugc.aweme.profile.service.h.f116622a.onAntiCrawlerEvent(aVar.f68097a)) {
            EventBus.a().d(aVar);
            k();
        }
    }

    @org.greenrobot.eventbus.r
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        com.ss.android.ugc.aweme.profile.a.b bVar;
        if (ab_() && (bVar = this.p) != null) {
            bVar.a(followStatusEvent.status);
        }
    }

    @org.greenrobot.eventbus.r
    public void onPublishStatusUpdate(com.ss.android.ugc.aweme.shortvideo.j.f fVar) {
        if (fVar.f128578b == 9) {
            O();
        }
        if (fVar.f128578b == 2) {
            O();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onUpdateUserEvent(com.ss.android.ugc.aweme.base.d.c cVar) {
        if (this.f117013e == 0 && this.f117014j && this.aq) {
            this.aq = false;
            k();
        }
    }

    private boolean c(Aweme aweme) {
        List<Aweme> list = ((com.ss.android.ugc.aweme.common.a.d) this.p).f76354l;
        if (list == null) {
            return false;
        }
        for (Aweme aweme2 : list) {
            if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                return true;
            }
        }
        return false;
    }

    private void e(boolean z2) {
        if (this.p.q()) {
            f.a.b.b bVar = this.R;
            if (bVar != null) {
                bVar.dispose();
            }
            this.U = true;
            this.R = ProfileStoryApi.f136693a.getStoryArchDetail().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new p(this, z2), new q(this, z2));
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(bv bvVar) {
        if (this.f117014j && TextUtils.equals(this.O, ho.a(1))) {
            V();
            if (this.p.getItemCount() == 0) {
                this.s.g();
            } else {
                this.s.setVisibility(4);
            }
        }
    }

    private void c(List<Aweme> list) {
        Aweme aweme = this.aa;
        if (!(aweme == null || aweme.getVideo() == null || list == null)) {
            for (Aweme aweme2 : list) {
                if (!(aweme2.getAid() == null || !aweme2.getAid().equals(this.aa.getAid()) || aweme2.getVideo() == null)) {
                    aweme2.getVideo().setCover(this.aa.getVideo().getCover());
                    aweme2.getVideo().setDynamicCover(this.aa.getVideo().getDynamicCover());
                    return;
                }
            }
        }
    }

    private static List<Aweme> d(List<Aweme> list) {
        ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.e();
        if (list == null || e2 == null || e2.b() == null || e2.b().isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme != null && (aweme.getAwemeRawAd() == null || !e2.b().contains(aweme.getAwemeRawAd().getCreativeIdStr()))) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @org.greenrobot.eventbus.r
    public void onChangePlayListNameEvent(com.ss.android.ugc.aweme.mix.b.c cVar) {
        if (this.f117013e == 0 && this.f117014j) {
            this.ag = true;
            List e2 = this.p.e();
            for (int i2 = 0; i2 < e2.size(); i2++) {
                if (!(e2.get(i2) == null || ((Aweme) e2.get(i2)).playlist_info == null)) {
                    String mixId = ((Aweme) e2.get(i2)).playlist_info.getMixId();
                    if (cVar.f109810b != null && cVar.f109810b.equals(mixId)) {
                        ((Aweme) e2.get(i2)).playlist_info.setMixName(cVar.f109809a);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getParentFragment() != null) {
            this.H = ProfileViewModel.a.a(getParentFragment());
        }
        Bundle arguments = getArguments();
        this.f117013e = arguments.getInt(StringSet.type);
        String string = arguments.getString("uid");
        String string2 = arguments.getString("sec_user_id");
        if (!TextUtils.isEmpty(string)) {
            this.f117011c = string;
        }
        if (!TextUtils.isEmpty(string2)) {
            this.f117012d = string2;
        }
        this.f117014j = arguments.getBoolean("is_my_profile");
        this.f117016l = arguments.getBoolean("is_scene_transition_enable");
        this.f117017m = arguments.getInt("bottom_bar_height");
        this.w = arguments.getBoolean("should_refresh_on_init_data", false);
        if (fp.f90064b && this.f117013e == 0) {
            this.w = true;
        }
    }

    @org.greenrobot.eventbus.r
    public void onMixDeleteEvent(com.ss.android.ugc.aweme.mix.b.f fVar) {
        if (this.f117013e == 0 && this.f117014j) {
            this.ag = true;
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.gj2).a();
            List e2 = this.p.e();
            for (int i2 = 0; i2 < e2.size(); i2++) {
                if (!(e2.get(i2) == null || ((Aweme) e2.get(i2)).playlist_info == null)) {
                    String mixId = ((Aweme) e2.get(i2)).playlist_info.getMixId();
                    if (fVar.f109818b != null && fVar.f109818b.equals(mixId)) {
                        ((Aweme) e2.get(i2)).playlist_info = null;
                    }
                }
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onPrivateModelEvent(w wVar) {
        int i2;
        if (!(wVar.f93499b == null || this.p == null)) {
            if (!this.f117014j || !com.ss.android.ugc.aweme.profile.experiment.l.f116366a || !((i2 = this.f117013e) == 14 || i2 == 0)) {
                for (int i3 = 0; i3 < this.p.e().size(); i3++) {
                    Aweme aweme = (Aweme) this.p.e().get(i3);
                    if (aweme.getAid().equals(wVar.f93499b.getAid())) {
                        aweme.setStatus(wVar.f93499b.getStatus());
                        this.p.notifyItemChanged(i3);
                        return;
                    }
                }
                return;
            }
            this.ae = true;
        }
    }

    @org.greenrobot.eventbus.r
    public void onRemoveVideoFromMix(com.ss.android.ugc.aweme.mix.b.h hVar) {
        String str;
        if (this.f117013e == 0 && this.f117014j) {
            this.ag = true;
            if (hVar == null || hVar.f109819a == null) {
                str = "";
            } else {
                str = hVar.f109819a.getAid();
            }
            List e2 = this.p.e();
            if (this.p.e() == null) {
                k();
                this.ag = false;
            }
            for (int i2 = 0; i2 < e2.size(); i2++) {
                if (str.equals(((Aweme) e2.get(i2)).getAid()) && e2.get(i2) != null && ((Aweme) e2.get(i2)).playlist_info != null) {
                    ((Aweme) e2.get(i2)).playlist_info = null;
                    return;
                }
            }
        }
    }

    private void b(Aweme aweme) {
        com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar = this.r;
        if (bVar == null || bVar.f76396h == null) {
            com.ss.android.ugc.aweme.framework.a.a.a(5, "AwemeListFragment", "syncData() NOT executed");
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a(3, "AwemeListFragment", "syncData() start");
        boolean z2 = false;
        List items = ((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).getItems();
        HashSet hashSet = new HashSet();
        if (items != null && items.size() > 0) {
            Iterator it = items.iterator();
            while (it.hasNext()) {
                Aweme aweme2 = (Aweme) it.next();
                int i2 = this.f117013e;
                if (i2 != 1) {
                    if (i2 == 4 && (aweme2 == null || !aweme2.isCollected() || (aweme != null && TextUtils.equals(aweme2.getAid(), aweme.getAid()) && !aweme.isCollected()))) {
                        it.remove();
                        if (aweme2 != null) {
                            hashSet.add(aweme2.getAid());
                        }
                    }
                } else if (aweme2 == null || !aweme2.isLike() || (aweme != null && TextUtils.equals(aweme2.getAid(), aweme.getAid()) && !aweme.isLike())) {
                    it.remove();
                    if (aweme2 != null) {
                        hashSet.add(aweme2.getAid());
                    }
                }
                z2 = true;
            }
            if (z2 && this.p != null) {
                com.ss.android.ugc.aweme.profile.f.k.a("notifyDataSetChanged() called in syncData(), removed aids = ".concat(String.valueOf(hashSet)));
                this.p.notifyDataSetChanged();
            }
        }
        if (!this.s.l()) {
            if (ac()) {
                f();
            }
            this.r.c();
        }
    }

    private void d(String str) {
        com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a> bVar;
        if (this.f117013e == 0 && str.equals(this.f117011c) && (bVar = this.r) != null && bVar.f76396h != null) {
            List items = ((com.ss.android.ugc.aweme.common.e.a) this.r.f76396h).getItems();
            int a2 = v.a.a(items);
            if (a2 >= 0) {
                items.remove(a2);
            }
            List e2 = this.p.e();
            int a3 = v.a.a(e2);
            if (a3 >= 0) {
                e2.remove(a3);
                this.p.notifyDataSetChanged();
            }
            com.ss.android.ugc.aweme.story.j.a.b("AwemeListFragmentImpl", "onUserStoryDeleted: uid: ".concat(String.valueOf(str)));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        if (ab_()) {
            if (this.p.getItemCount() == 0) {
                this.s.d();
                aq.a aVar = this.t;
                if (aVar != null) {
                    aVar.a(this.f117014j, this.f117013e);
                }
            }
            this.p.j();
            com.ss.android.ugc.aweme.profile.f.e.a(this.f117013e, true, exc);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void checkRemoveTalentAdData(com.ss.android.ugc.aweme.commercialize.profile.talent.a aVar) {
        ITalentAdRevenueShareService e2;
        if (!this.f117014j) {
            com.ss.android.ugc.aweme.common.e.a aVar2 = (com.ss.android.ugc.aweme.common.e.a) this.r.f76396h;
            if (aVar2 instanceof com.ss.android.ugc.aweme.profile.presenter.b) {
                com.ss.android.ugc.aweme.profile.presenter.b bVar = (com.ss.android.ugc.aweme.profile.presenter.b) aVar2;
                if (!(bVar.mData == null || ((FeedItemList) bVar.mData).getItems() == null || (e2 = TalentAdRevenueShareServiceImpl.e()) == null || e2.b() == null || e2.b().isEmpty())) {
                    ArrayList arrayList = new ArrayList();
                    for (Aweme aweme : ((FeedItemList) bVar.mData).getItems()) {
                        if (aweme != null && (aweme.getAwemeRawAd() == null || !e2.b().contains(aweme.getAwemeRawAd().getCreativeIdStr()))) {
                            arrayList.add(aweme);
                        }
                    }
                    e2.b().clear();
                    ((FeedItemList) bVar.mData).items = arrayList;
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.profile.talent.c(((FeedItemList) bVar.mData).getItems()));
                }
            }
            ITalentAdRevenueShareService e3 = TalentAdRevenueShareServiceImpl.e();
            if (e3 != null) {
                e3.d();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        com.ss.android.ugc.aweme.profile.a.b bVar;
        com.ss.android.ugc.aweme.profile.a.b bVar2;
        RecyclerView recyclerView;
        int i2;
        super.setUserVisibleHint(z2);
        if (ab_()) {
            boolean z3 = true;
            if (z2) {
                if (!this.T && this.f117014j && (recyclerView = this.n) != null && ((i2 = this.f117013e) == 0 || i2 == 1 || i2 == 14)) {
                    recyclerView.b(0);
                    k();
                }
                this.T = false;
                if (ab_() && this.n != null && (bVar2 = this.p) != null && !bVar2.f115803f) {
                    this.p.f115803f = true;
                    int childCount = this.n.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        RecyclerView.ViewHolder f2 = this.n.f(i3);
                        if (f2 instanceof com.ss.android.ugc.aweme.profile.a.c) {
                            com.ss.android.ugc.aweme.profile.a.c cVar = (com.ss.android.ugc.aweme.profile.a.c) f2;
                            cVar.f();
                            a(cVar);
                        }
                    }
                }
            } else {
                y();
                if (!this.f117014j) {
                    com.bytedance.a.b.c("profile", com.bytedance.a.d.a(this.O));
                }
            }
            al a2 = al.a();
            if (this.f117013e != 0) {
                z3 = false;
            }
            a2.f74742b = z3;
            if (d(this.f117013e) && (bVar = this.p) != null) {
                bVar.w = z2;
            }
            if (this.an != z2 && this.f117013e == 0) {
                this.an = z2;
                com.ss.android.ugc.aweme.profile.f.n.a(z2);
            }
        }
    }

    private void a(int i2) {
        float f2;
        int i3;
        String str;
        Context context = getContext();
        if (context != null) {
            int[] iArr = {-1, -1};
            this.n.getLocationOnScreen(iArr);
            int i4 = iArr[1];
            if (i4 >= 0) {
                float f3 = 0.0f;
                if (TextUtils.equals(this.o, "from_main")) {
                    f2 = com.bytedance.tux.h.f.a((Number) 58);
                } else {
                    f2 = 0.0f;
                }
                h.f.b.l.c(context, "");
                Resources resources = context.getResources();
                h.f.b.l.a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i5 = 0;
                if (displayMetrics != null) {
                    i3 = displayMetrics.heightPixels;
                } else {
                    i3 = 0;
                }
                float a2 = ((float) ((i3 + com.bytedance.tux.h.e.a(context)) - i4)) - f2;
                if (a2 > 0.0f) {
                    f3 = a2;
                }
                float a3 = f3 / com.bytedance.tux.h.f.a((Number) 170);
                int i6 = (int) a3;
                if (a3 > ((float) i6)) {
                    a3 = (float) (i6 + 1);
                }
                int i7 = ((int) a3) * 3;
                int i8 = i7 - i2;
                if (i8 >= 0) {
                    i5 = i8;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("empty_num", i5).a("video_num", i7 - i5);
                if (this.f117014j) {
                    str = "personal_homepage";
                } else {
                    a4.a("profile_user_id", this.f117011c);
                    str = "others_homepage";
                }
                a4.a("enter_from", str);
                r.a("video_show_cnt", a4.f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void b(int i2) {
        if (ab_()) {
            if (this.p.f115801d) {
                i2++;
            }
            if (i2 <= this.p.getItemCount() || i2 == 0) {
                this.p.notifyItemRemoved(i2);
                if (this.p.c() == 0) {
                    int i3 = this.f117013e;
                    if (i3 == 1) {
                        V();
                        this.s.g();
                    } else if (i3 == 14) {
                        this.s.g();
                    } else {
                        this.s.setVisibility(4);
                    }
                    aq.a aVar = this.t;
                    if (aVar != null) {
                        aVar.a(this.f117014j, this.f117013e);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public void c(boolean z2) {
        if (this.Z != z2) {
            this.Z = z2;
            V();
            DmtStatusView dmtStatusView = this.s;
            if (dmtStatusView != null) {
                dmtStatusView.g();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        aq.c cVar;
        if (ab_()) {
            if (!T()) {
                if (!this.f117014j && 1 == this.f117013e && (cVar = this.J) != null) {
                    cVar.a(false);
                }
                this.s.d();
            } else if (this.f117014j || 1 != this.f117013e) {
                if (this.p.n()) {
                    this.p.a((com.ss.android.ugc.aweme.story.model.c) null);
                    this.p.notifyItemRemoved(0);
                }
                this.s.h();
            } else if (!(exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) || ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() != 7) {
                this.s.h();
                aq.c cVar2 = this.J;
                if (cVar2 != null) {
                    cVar2.a(false);
                }
            } else {
                DmtStatusView dmtStatusView = this.s;
                dmtStatusView.setBuilder(dmtStatusView.c().b(b(getContext(), true)));
                this.s.g();
                aq.c cVar3 = this.J;
                if (cVar3 != null) {
                    cVar3.a(true);
                }
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) this.p.e())) {
                this.p.f();
            }
            this.u = true;
            com.ss.android.ugc.aweme.profile.f.e.a(this.f117013e, false, exc);
            af();
            if (!this.f117014j) {
                com.ss.android.ugc.aweme.profile.f.ab abVar = com.ss.android.ugc.aweme.profile.f.l.f116426a;
                if (abVar != null) {
                    abVar.c();
                }
                com.bytedance.a.b.a("profile", com.bytedance.a.d.a(this.O), com.bytedance.ies.b.a.a.a(com.bytedance.ies.ugc.appcontext.d.a(), exc));
                com.ss.android.ugc.aweme.cc.c.a(com.ss.android.ugc.aweme.cc.d.f69802a, com.ss.android.ugc.aweme.cc.b.FAIL, 4);
                com.ss.android.ugc.aweme.cc.d.f69803b = false;
            }
        }
    }

    @org.greenrobot.eventbus.r(b = true)
    public void onVideoEvent(ag agVar) {
        String str;
        Aweme a2;
        Aweme aweme;
        int a3;
        int b2;
        if ((agVar.f93450a == 15 || agVar.f93450a == 2 || agVar.f93450a == 13 || agVar.f93450a == 21 || agVar.f93450a == 54) && ab_()) {
            int i2 = agVar.f93450a;
            if (i2 != 2) {
                if (i2 != 13) {
                    if (i2 != 15) {
                        if (i2 != 21) {
                            if (i2 == 54 && (agVar.f93451b instanceof Aweme) && d(this.f117013e)) {
                                Aweme aweme2 = (Aweme) agVar.f93451b;
                                if (!aweme2.isCollected()) {
                                    b(aweme2);
                                }
                            }
                        } else if ((agVar.f93451b instanceof Aweme) && (aweme = (Aweme) agVar.f93451b) != null && this.f117013e == agVar.f93457h && !agVar.f93455f.equals("playlist") && (a3 = this.p.a(aweme.getAid())) != -1 && (this.n.getLayoutManager() instanceof com.ss.android.ugc.aweme.views.m)) {
                            RecyclerView recyclerView = this.n;
                            if (!com.ss.android.ugc.aweme.detail.transition.b.f79870a) {
                                View c2 = recyclerView.getLayoutManager().c(a3);
                                if (c2 != null) {
                                    int[] iArr = new int[2];
                                    c2.getLocationOnScreen(iArr);
                                    Activity activity = (Activity) recyclerView.getContext();
                                    int i3 = Build.VERSION.SDK_INT;
                                    if (activity != null) {
                                        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                                        DisplayMetrics displayMetrics = new DisplayMetrics();
                                        defaultDisplay.getRealMetrics(displayMetrics);
                                        b2 = displayMetrics.heightPixels;
                                    } else {
                                        b2 = com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a());
                                    }
                                    int i4 = b2 - iArr[1];
                                    if (c2.getHeight() > 0 && (((float) i4) * 1.0f) / ((float) c2.getHeight()) > 0.4f) {
                                        return;
                                    }
                                }
                                com.ss.android.ugc.d.a.c.a(new cu(this.f117014j));
                                ((com.ss.android.ugc.aweme.views.m) this.n.getLayoutManager()).a(a3, 0);
                            }
                        }
                    } else if (this.f117014j) {
                        int i5 = this.f117013e;
                        if (i5 == 0) {
                            if (agVar.f93451b instanceof Aweme) {
                                a(AwemeService.b().a((Aweme) agVar.f93451b), agVar);
                            } else if (agVar.f93451b instanceof List) {
                                for (Aweme aweme3 : (List) agVar.f93451b) {
                                    a(AwemeService.b().a(aweme3), agVar);
                                }
                            }
                        } else if (i5 == 14 && com.ss.android.ugc.aweme.profile.experiment.l.f116366a && (a2 = AwemeService.b().a((Aweme) agVar.f93451b)) != null && a2.getStatus().getPrivateStatus() == 1) {
                            com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.r.f76396h;
                            if (aVar instanceof com.ss.android.ugc.aweme.profile.presenter.b) {
                                this.ad = true;
                                ((com.ss.android.ugc.aweme.profile.presenter.b) aVar).a(a2);
                                if (com.ss.android.ugc.aweme.profile.experiment.l.f116366a) {
                                    this.s.setVisibility(4);
                                }
                            }
                        }
                    }
                } else if (this.f117014j && this.f117013e == 1) {
                    String str2 = (String) agVar.f93451b;
                    Aweme b3 = AwemeService.b().b(str2);
                    if ((b3 != null || (b3 = AwemeService.b().a(str2, this.f117013e)) != null) && b3.getAwemeType() != 13) {
                        if (b3.getUserDigg() != 0) {
                            if (!(c(b3) || this.r.a(b3, 0))) {
                            }
                        } else if (isResumed() && SettingsManager.a().a("profile_favorite_undigg_optimize_setting", true) && c(b3)) {
                            boolean a4 = this.r.a(b3);
                            this.p.notifyDataSetChanged();
                            com.ss.android.ugc.aweme.profile.f.k.a("handle cancel digg in favorite list for aid " + b3.getAid() + ", result is " + a4);
                        }
                    }
                }
            } else if (this.f117014j) {
                String str3 = (String) agVar.f93451b;
                int i6 = this.f117013e;
                if (i6 == 0) {
                    if (ab_() && !TextUtils.isEmpty(str3)) {
                        Aweme a5 = com.ss.android.ugc.aweme.feed.x.m.a(str3);
                        com.ss.android.ugc.aweme.profile.presenter.b bVar = (com.ss.android.ugc.aweme.profile.presenter.b) this.r.f76396h;
                        String str4 = this.f117011c;
                        if (a5 != null) {
                            t.a(new com.ss.android.ugc.aweme.profile.presenter.j(bVar, str4, a5)).b(f.a.h.a.b(f.a.k.a.f158006c)).g();
                        }
                        if (this.r.a(a5)) {
                            this.p.notifyDataSetChanged();
                        }
                    }
                } else if (i6 == 14) {
                    com.ss.android.ugc.aweme.profile.a.b bVar2 = this.p;
                    if (bVar2.E == null || bVar2.E.getItems() == null || bVar2.E.getItems().isEmpty()) {
                        str = null;
                    } else {
                        str = bVar2.E.getItems().get(0).getAid();
                    }
                    if (TextUtils.equals(str3, str)) {
                        e(true);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(List list) {
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            o();
        } else {
            a((com.ss.android.ugc.aweme.draft.model.c) list.get(list.size() - 1));
        }
    }

    private static void a(RecyclerView recyclerView) {
        RecyclerView.ViewHolder a2;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (!(childAt == null || (a2 = recyclerView.a(childAt)) == null || a2.getItemViewType() != 0)) {
                    ((com.ss.android.ugc.aweme.common.a.g) a2).al_();
                }
            }
        }
    }

    private static TuxTextView a(Context context, int i2) {
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(androidx.core.content.b.c(context, R.color.c4));
        tuxTextView.setText(i2);
        return tuxTextView;
    }

    private boolean d(List<Aweme> list, boolean z2) {
        if (!this.U || !this.p.q()) {
            return false;
        }
        this.V = new com.ss.android.ugc.aweme.story.archive.a(list, z2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(boolean z2, boolean z3) {
        com.ss.android.ugc.aweme.common.d.a aVar;
        if (!com.ss.android.ugc.aweme.base.utils.o.b(getView()) || (aVar = this.I) == null) {
            return null;
        }
        aVar.a(z2, z3);
        return null;
    }

    private static int a(boolean z2, int i2) {
        if (z2) {
            if (i2 == 0) {
                return R.string.bnt;
            }
            if (i2 != 1 || in.d()) {
                return R.string.ddj;
            }
            if (s.a.f66880a.c().c().intValue() == 0) {
                return R.string.cw2;
            }
            return R.string.cw3;
        } else if (i2 == 0) {
            return R.string.h8e;
        } else {
            if (i2 == 4) {
                return R.string.bnb;
            }
            return R.string.h88;
        }
    }

    static final /* synthetic */ Object a(String str, long j2) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        try {
            jSONObject.put("group_id", str);
            com.ss.android.ugc.aweme.ct.a.f79071a = SystemClock.uptimeMillis() - j2;
            jSONObject.put("duration", String.valueOf(com.ss.android.ugc.aweme.ct.a.f79071a));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ss.android.common.c.a.a("post_list", jSONObject);
        return null;
    }

    /* access modifiers changed from: protected */
    public final View b(Context context, boolean z2) {
        String string;
        String string2;
        MethodCollector.i(7457);
        this.ar = z2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setOrientation(1);
        if (z2) {
            string = context.getString(R.string.exs);
            string2 = context.getString(R.string.exr);
        } else {
            string = context.getString(R.string.ey0);
            string2 = context.getString(R.string.ext);
        }
        a(context, this.K, string, com.a.a(string2, new Object[]{in.b(this.f117010b)}));
        LinearLayout linearLayout2 = this.K;
        MethodCollector.o(7457);
        return linearLayout2;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h.k.c a2;
        super.onViewCreated(view, bundle);
        if (Z()) {
            AVExternalServiceImpl.a().draftService().registerListener(this.ap);
        }
        p();
        if (this.f117013e == 0 && com.ss.android.ugc.aweme.story.c.b.f() && this.f117014j && in.c().getUid() != null) {
            if (this.W == null) {
                bc bcVar = new bc(this);
                this.W = bcVar;
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                String curUserId = g2.getCurUserId();
                h.f.b.l.b(curUserId, "");
                h.k.k[] kVarArr = new h.k.k[0];
                com.ss.android.ugc.aweme.story.userstory.b bVar = com.ss.android.ugc.aweme.story.userstory.b.f138510c;
                if (h.f.b.l.a(h.f.b.ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.a.class), h.f.b.ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
                    a2 = h.f.b.ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class);
                } else {
                    a2 = h.f.b.ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.a.class);
                }
                StoryReceiver storyReceiver = new StoryReceiver(curUserId, bcVar, bVar);
                if (h.f.b.l.a(a2, h.f.b.ab.a(com.ss.android.ugc.aweme.story.base.distribution.dispatcher.b.class))) {
                    bVar.a((com.ss.android.ugc.aweme.story.base.d) bcVar, storyReceiver);
                }
                f.a.b.b a3 = bVar.a().a(new bc.a(curUserId, bVar)).d(new bc.b(kVarArr)).a(bVar.f136888b).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new bc.c(bcVar), bc.d.f116929a);
                h.f.b.l.b(a3, "");
                com.ss.android.ugc.aweme.story.base.distribution.dispatcher.d.a(a3, storyReceiver);
                this.W.f116923a = new h(this);
            }
            com.ss.android.ugc.aweme.story.j.a.b("AwemeListFragmentImpl", "#" + System.identityHashCode(this) + ", init: uid: " + this.f117011c);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Aweme> list, boolean z2) {
        aq.a aVar;
        if (ab_()) {
            this.p.ai_();
            this.p.x = z2;
            if (this.p.getItemCount() == 0) {
                if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                    aq.a aVar2 = this.t;
                    if (aVar2 != null) {
                        aVar2.a(this.f117013e);
                    }
                } else if (!z2 && (aVar = this.t) != null) {
                    aVar.a(this.f117014j, this.f117013e);
                }
            }
            List<Aweme> d2 = d(list);
            if (fs.f90077a) {
                this.p.b(d2);
            } else {
                this.p.b_(d2);
            }
            this.ao = z2;
            if (this.p.c() != 0 || z2 || !this.s.j()) {
                if (com.bytedance.common.utility.collection.b.a((Collection) d2) && z2 && !this.Z && !this.X) {
                    l();
                } else if (!com.bytedance.common.utility.collection.b.a((Collection) d2)) {
                    this.s.a(true);
                }
            } else if (!this.f117014j || this.f117013e != 0) {
                V();
                this.s.g();
            }
            a(z2);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.b.c.a((Activity) getActivity(), a());
        this.n = (RecyclerView) a2.findViewById(R.id.b1g);
        this.A = (ViewStub) a2.findViewById(R.id.ed6);
        RecyclerView recyclerView = this.n;
        if (recyclerView instanceof FpsRecyclerView) {
            ((FpsRecyclerView) recyclerView).setLabel("profile_list");
        }
        if (com.ss.android.ugc.aweme.profile.service.h.f116622a.shouldUseRecyclerPartialUpdate() && this.n.getItemAnimator() != null) {
            this.n.getItemAnimator().f3830i = 0;
        }
        boolean f2 = com.ss.android.ugc.aweme.setting.services.f.f122672a.f();
        this.al = f2;
        if (f2 || s.a.f66880a.c().c().intValue() == 0) {
            this.D = a(a2, this.f117014j, this.O, false);
        } else {
            this.D = a(a2, this.f117014j, this.O, true);
        }
        this.s = (DmtStatusView) a2.findViewById(R.id.e_o);
        j();
        return a2;
    }

    private static void a(Context context, DmtStatusView dmtStatusView, DmtStatusView.a aVar) {
        if (dmtStatusView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dmtStatusView.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.width = -1;
            layoutParams.height = -1;
            dmtStatusView.setLayoutParams(layoutParams);
            MtEmptyView a2 = MtEmptyView.a(context);
            a2.setStatus(new d.a(context).b(R.string.bsy).c(R.string.bsx).a(2131233436).f33648a);
            aVar.b(a2);
        }
    }

    private static View a(View view, boolean z2, String str, boolean z3) {
        final Context context = view.getContext();
        if (!z2 || !TextUtils.equals(str, ho.a(1)) || in.d() || !s.a.f66880a.b().c().booleanValue() || s.a.f66880a.d().c().booleanValue() || s.a.f66880a.a().c().booleanValue() || !z3) {
            return null;
        }
        final View findViewById = view.findViewById(R.id.bdu);
        TextView textView = (TextView) view.findViewById(R.id.c_w);
        ImageView imageView = (ImageView) view.findViewById(R.id.bve);
        imageView.setImageResource(2131232207);
        textView.setTextColor(androidx.core.content.b.c(context, R.color.c2));
        findViewById.setBackgroundColor(androidx.core.content.b.c(context, R.color.f159928l));
        String string = context.getString(R.string.ey6);
        String string2 = context.getString(R.string.ey3);
        String a2 = com.a.a(string, new Object[]{context.getString(R.string.ey3)});
        SpannableString spannableString = new SpannableString(a2);
        int indexOf = a2.indexOf(string2);
        int length = string2.length() + indexOf;
        if (indexOf >= 0 && length >= 0) {
            spannableString.setSpan(new ClickableSpan() {
                /* class com.ss.android.ugc.aweme.profile.ui.c.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(75567);
                }

                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    s.a.f66880a.a().b(true);
                    findViewById.setVisibility(8);
                    SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                }
            }, indexOf, length, 18);
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bh)), indexOf, length, 18);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        imageView.setOnClickListener(new f(findViewById));
        return findViewById;
    }

    private static void a(Context context, LinearLayout linearLayout, String str, String str2) {
        MethodCollector.i(7467);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setTuxFont(32);
        tuxTextView.setGravity(17);
        tuxTextView.setText(str);
        Integer a2 = com.bytedance.tux.h.d.a(context, R.attr.bc);
        if (a2 != null) {
            tuxTextView.setTextColor(a2.intValue());
        }
        linearLayout.addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setGravity(17);
        tuxTextView2.setText(str2);
        Integer a3 = com.bytedance.tux.h.d.a(context, R.attr.bi);
        if (a3 != null) {
            tuxTextView2.setTextColor(a3.intValue());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = com.bytedance.tux.h.f.b(12);
        linearLayout.addView(tuxTextView2, layoutParams);
        MethodCollector.o(7467);
    }
}
