package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bb;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationVM;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.VideoTitleFollowBtn;
import com.ss.android.ugc.aweme.feed.ui.bm;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    public static final k G = new k((byte) 0);
    static final /* synthetic */ h.k.i[] u = {new h.f.b.y(a.class, "authorInfoVM", "getAuthorInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/videoauthorinfo/VideoAuthorInfoVM;", 0), new h.f.b.y(a.class, "authorInfoRelationVM", "getAuthorInfoRelationVM()Lcom/ss/android/ugc/aweme/feed/assem/videoauthorinfo/VideoAuthorInfoRelationVM;", 0)};
    public TuxTextView A;
    public MutualRelationView B;
    public boolean C;
    public String D = "";
    public String E = "low_interest";
    public final HashMap<String, String> F = new HashMap<>();
    private View H;
    private TuxTextView I;
    private MutualRelationView J;
    private View K;
    private TuxTextView L;
    private MutualRelationView M;
    private final h.h N = h.i.a((h.f.a.a) new l(this));
    private final h.h O = h.i.a((h.f.a.a) new ad(this));
    private final h.h P = h.i.a((h.f.a.a) new ac(this));
    private final h.h.d Q;
    private final h.h.d R;
    private final h.h S;
    private final h.h T;
    private SparseArray U;
    public TextView v;
    public TextView w;
    public VideoTitleFollowBtn x;
    public View y;
    public View z;

    public static final class b extends h.f.b.m implements h.f.a.b<q, q> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58620);
        }

        public b() {
            super(1);
        }

        public final q invoke(q qVar) {
            h.f.b.l.c(qVar, "");
            return qVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<p, p> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58622);
        }

        public d() {
            super(1);
        }

        public final p invoke(p pVar) {
            h.f.b.l.c(pVar, "");
            return pVar;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<bb, bb> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58623);
        }

        public e() {
            super(1);
        }

        public final bb invoke(bb bbVar) {
            h.f.b.l.c(bbVar, "");
            return bbVar;
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58626);
        }

        public h() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    static {
        Covode.recordClassIndex(58613);
    }

    private final float H() {
        return ((Number) this.N.getValue()).floatValue();
    }

    private final float I() {
        return ((Number) this.O.getValue()).floatValue();
    }

    private final float J() {
        return ((Number) this.P.getValue()).floatValue();
    }

    private final VideoAuthorInfoVM K() {
        return (VideoAuthorInfoVM) this.Q.a(this, u[0]);
    }

    private final VideoEventDispatchViewModel L() {
        return (VideoEventDispatchViewModel) this.S.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.t9;
    }

    public final VideoAuthorInfoRelationVM F() {
        return (VideoAuthorInfoRelationVM) this.R.a(this, u[1]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.U == null) {
            this.U = new SparseArray();
        }
        View view = (View) this.U.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.U.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class k {
        static {
            Covode.recordClassIndex(58629);
        }

        private k() {
        }

        public /* synthetic */ k(byte b2) {
            this();
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58624);
        }

        public f() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58625);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final i INSTANCE = new i();

        static {
            Covode.recordClassIndex(58627);
        }

        public i() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final j INSTANCE = new j();

        static {
            Covode.recordClassIndex(58628);
        }

        public j() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a$a  reason: collision with other inner class name */
    public static final class C2250a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2250a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(com.bytedance.common.utility.n.b(this.this$0.ar_(), 4.0f));
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(com.bytedance.common.utility.n.b(this.this$0.ar_(), 30.0f));
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(((float) com.ss.android.ugc.aweme.base.utils.i.b(this.this$0.ar_())) - com.bytedance.common.utility.n.b(this.this$0.ar_(), 105.0f));
        }
    }

    static final class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92565a;

        static {
            Covode.recordClassIndex(58645);
        }

        y(a aVar) {
            this.f92565a = aVar;
        }

        public final void run() {
            LiveData<Aweme> a2 = CommentServiceImpl.e().a(this.f92565a.f25546d);
            if (a2 != null) {
                a2.observe(this.f92565a, new androidx.lifecycle.u(this) {
                    /* class com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a.y.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ y f92566a;

                    static {
                        Covode.recordClassIndex(58646);
                    }

                    {
                        this.f92566a = r1;
                    }

                    @Override // androidx.lifecycle.u
                    public final /* synthetic */ void onChanged(Object obj) {
                        Aweme aweme = (Aweme) obj;
                        if (aweme != null) {
                            String aid = aweme.getAid();
                            Aweme aweme2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92566a.f92565a)).mAweme;
                            h.f.b.l.b(aweme2, "");
                            if (h.f.b.l.a((Object) aid, (Object) aweme2.getAid())) {
                                this.f92566a.f92565a.a(aweme);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, K(), b.f92568a, (com.bytedance.assem.arch.viewModel.k) null, q.f92553a, 6);
        f.a.a(this, K(), i.f92575a, (com.bytedance.assem.arch.viewModel.k) null, s.f92559a, 6);
        f.a.a(this, K(), j.f92576a, (com.bytedance.assem.arch.viewModel.k) null, t.f92560a, 6);
        f.a.a(this, K(), k.f92577a, (com.bytedance.assem.arch.viewModel.k) null, u.f92561a, 6);
        f.a.a(this, F(), l.f92578a, (com.bytedance.assem.arch.viewModel.k) null, m.f92549a, 6);
        f.a.a(this, F(), c.f92569a, (com.bytedance.assem.arch.viewModel.k) null, n.f92550a, 6);
        f.a.a(this, F(), d.f92570a, e.f92571a, f.f92572a, (com.bytedance.assem.arch.viewModel.k) null, o.f92551a, 24);
        f.a.a(this, F(), g.f92573a, (com.bytedance.assem.arch.viewModel.k) null, p.f92552a, 6);
        f.a.a(this, F(), h.f92574a, (com.bytedance.assem.arch.viewModel.k) null, r.f92554a, 6);
    }

    public a() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = h.f.b.ab.a(VideoAuthorInfoVM.class);
        this.Q = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new C2250a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        i.c cVar2 = i.c.f25720a;
        h.k.c a3 = h.f.b.ab.a(VideoAuthorInfoRelationVM.class);
        this.R = com.bytedance.ext_power_list.k.a(this, a3, cVar2 == null ? i.c.f25720a : cVar2, new c(a3), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), d.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.S = new com.bytedance.ext_power_list.g(h.f.b.ab.a(VideoEventDispatchViewModel.class), this, f.INSTANCE, g.INSTANCE, e.INSTANCE);
        this.T = new com.bytedance.ext_power_list.g(h.f.b.ab.a(VideoViewModel.class), this, i.INSTANCE, j.INSTANCE, h.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    public static final /* synthetic */ TextView a(a aVar) {
        TextView textView = aVar.v;
        if (textView == null) {
            h.f.b.l.a("titleView");
        }
        return textView;
    }

    public static final /* synthetic */ TextView b(a aVar) {
        TextView textView = aVar.w;
        if (textView == null) {
            h.f.b.l.a("postTimeView");
        }
        return textView;
    }

    public static final /* synthetic */ View c(a aVar) {
        View view = aVar.z;
        if (view == null) {
            h.f.b.l.a("relationLayout");
        }
        return view;
    }

    public static final /* synthetic */ VideoTitleFollowBtn d(a aVar) {
        VideoTitleFollowBtn videoTitleFollowBtn = aVar.x;
        if (videoTitleFollowBtn == null) {
            h.f.b.l.a("followUserBtn");
        }
        return videoTitleFollowBtn;
    }

    public static final /* synthetic */ View e(a aVar) {
        View view = aVar.y;
        if (view == null) {
            h.f.b.l.a("rootLayout");
        }
        return view;
    }

    public static final /* synthetic */ MutualRelationView f(a aVar) {
        MutualRelationView mutualRelationView = aVar.B;
        if (mutualRelationView == null) {
            h.f.b.l.a("mutualRelationView");
        }
        return mutualRelationView;
    }

    public static final /* synthetic */ TuxTextView g(a aVar) {
        TuxTextView tuxTextView = aVar.A;
        if (tuxTextView == null) {
            h.f.b.l.a("tvRelationView");
        }
        return tuxTextView;
    }

    static final class v implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92562a;

        static {
            Covode.recordClassIndex(58642);
        }

        v(a aVar) {
            this.f92562a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DataCenter dataCenter = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92562a)).dataCenter;
            if (dataCenter != null) {
                dataCenter.a("title_view_click", (Object) null);
            }
        }
    }

    static final class z implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92567a;

        static {
            Covode.recordClassIndex(58647);
        }

        z(a aVar) {
            this.f92567a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DataCenter dataCenter = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92567a)).dataCenter;
            if (dataCenter != null) {
                dataCenter.a("title_view_click", (Object) null);
            }
        }
    }

    public final void a(Aweme aweme) {
        Aweme aweme2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme;
        if (aweme2 != null) {
            aweme2.setInteractionTagInfo(aweme.getInteractionTagInfo());
            b(aweme2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ae implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f92540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f92541b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f92542c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f92543d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f92544e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Aweme f92545f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f92546g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ TuxTextView f92547h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ MutualRelationView f92548i;

        static {
            Covode.recordClassIndex(58619);
        }

        ae(View view, String str, View view2, float f2, a aVar, Aweme aweme, View view3, TuxTextView tuxTextView, MutualRelationView mutualRelationView) {
            this.f92540a = view;
            this.f92541b = str;
            this.f92542c = view2;
            this.f92543d = f2;
            this.f92544e = aVar;
            this.f92545f = aweme;
            this.f92546g = view3;
            this.f92547h = tuxTextView;
            this.f92548i = mutualRelationView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f92540a.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            if (activity != null && (activity instanceof androidx.fragment.app.e)) {
                VideoAuthorInfoRelationVM F = this.f92544e.F();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
                Aweme aweme = this.f92545f;
                String str = this.f92544e.E;
                String str2 = "";
                h.f.b.l.d(eVar, str2);
                h.f.b.l.d(aweme, str2);
                h.f.b.l.d(str, str2);
                CommentServiceImpl.e().a(eVar, aweme, F.p, str);
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", F.p);
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = str2;
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aid);
                String authorUid = aweme.getAuthorUid();
                if (authorUid != null) {
                    str2 = authorUid;
                }
                com.ss.android.ugc.aweme.common.r.a("tag_anchor_click", a3.a("author_id", str2).a("anchor_type", str).f66730a);
            }
        }
    }

    static final class aa implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92538a;

        static {
            Covode.recordClassIndex(58615);
        }

        aa(a aVar) {
            this.f92538a = aVar;
        }

        public final void onClick(View view) {
            User author;
            ClickAgent.onClick(view);
            a aVar = this.f92538a;
            Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar)).mAweme;
            if (aweme != null) {
                DataCenter dataCenter = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", aweme.getAid());
                }
                if (view != null && view.getVisibility() == 0 && !com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme) && !aweme.isDelete() && (author = aweme.getAuthor()) != null) {
                    String uid = author.getUid();
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    if (!TextUtils.equals(uid, g2.getCurUserId())) {
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aa(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                            com.ss.android.ugc.aweme.commercialize.g.a().a(view.getContext(), aweme, "plus_sign");
                        }
                        com.ss.android.ugc.aweme.base.utils.f fVar = f.a.f68431a;
                        h.f.b.l.b(fVar, "");
                        if (!fVar.c()) {
                            Context context = view.getContext();
                            new com.bytedance.ies.dmt.ui.e.a(context, context.getString(R.string.de8), 2, com.bytedance.ies.dmt.ui.e.a.b()).a();
                        } else if (((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar)).dataCenter != null && author.getFollowStatus() == 0) {
                            ag agVar = new ag(12, aweme);
                            agVar.n = "card_button";
                            DataCenter dataCenter2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar)).dataCenter;
                            if (dataCenter2 != null) {
                                dataCenter2.a("feed_internal_event", agVar);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ss.android.ugc.aweme.feed.model.Aweme r22) {
        /*
        // Method dump skipped, instructions count: 549
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a.b(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.f4s);
        h.f.b.l.b(findViewById, "");
        this.w = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        h.f.b.l.b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.v = textView;
        if (textView == null) {
            h.f.b.l.a("titleView");
        }
        textView.setOnTouchListener(new com.bytedance.ies.dmt.ui.widget.b());
        TextView textView2 = this.v;
        if (textView2 == null) {
            h.f.b.l.a("titleView");
        }
        textView2.setOnClickListener(new v(this));
        View findViewById3 = view.findViewById(R.id.cga);
        h.f.b.l.b(findViewById3, "");
        this.z = findViewById3;
        View findViewById4 = view.findViewById(R.id.yf);
        h.f.b.l.b(findViewById4, "");
        this.x = (VideoTitleFollowBtn) findViewById4;
        View findViewById5 = view.findViewById(R.id.doz);
        h.f.b.l.b(findViewById5, "");
        this.y = findViewById5;
        View findViewById6 = view.findViewById(R.id.title);
        h.f.b.l.b(findViewById6, "");
        this.v = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.f5p);
        h.f.b.l.b(findViewById7, "");
        this.A = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.crw);
        h.f.b.l.b(findViewById8, "");
        this.B = (MutualRelationView) findViewById8;
        View findViewById9 = view.findViewById(R.id.e73);
        h.f.b.l.b(findViewById9, "");
        this.I = (TuxTextView) findViewById9;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        gradientDrawable.setStroke(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())), androidx.core.content.b.c(view.getContext(), R.color.f159928l));
        gradientDrawable.setColor(androidx.core.content.b.c(view.getContext(), R.color.f159928l));
        View findViewById10 = view.findViewById(R.id.e72);
        MutualRelationView mutualRelationView = (MutualRelationView) findViewById10;
        mutualRelationView.setSocialVideoTag(true);
        Resources system2 = Resources.getSystem();
        h.f.b.l.a((Object) system2, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        h.f.b.l.a((Object) system3, "");
        mutualRelationView.a(a2, h.g.a.a(TypedValue.applyDimension(1, 12.0f, system3.getDisplayMetrics())));
        h.f.b.l.b(findViewById10, "");
        this.J = mutualRelationView;
        View findViewById11 = view.findViewById(R.id.e74);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(com.bytedance.common.utility.n.b(view.getContext(), 2.0f));
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        Integer a3 = com.bytedance.tux.h.d.a(context, R.attr.a9);
        if (a3 != null) {
            gradientDrawable2.setColor(a3.intValue());
        }
        findViewById11.setBackground(gradientDrawable2);
        h.f.b.l.b(findViewById11, "");
        this.H = findViewById11;
        View findViewById12 = view.findViewById(R.id.e76);
        h.f.b.l.b(findViewById12, "");
        this.L = (TuxTextView) findViewById12;
        View findViewById13 = view.findViewById(R.id.e75);
        MutualRelationView mutualRelationView2 = (MutualRelationView) findViewById13;
        mutualRelationView2.setSocialVideoTag(true);
        Resources system4 = Resources.getSystem();
        h.f.b.l.a((Object) system4, "");
        int a4 = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system4.getDisplayMetrics()));
        Resources system5 = Resources.getSystem();
        h.f.b.l.a((Object) system5, "");
        mutualRelationView2.a(a4, h.g.a.a(TypedValue.applyDimension(1, 12.0f, system5.getDisplayMetrics())));
        h.f.b.l.b(findViewById13, "");
        this.M = mutualRelationView2;
        View findViewById14 = view.findViewById(R.id.e77);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(com.bytedance.common.utility.n.b(view.getContext(), 2.0f));
        Context context2 = view.getContext();
        h.f.b.l.b(context2, "");
        Integer a5 = com.bytedance.tux.h.d.a(context2, R.attr.a9);
        if (a5 != null) {
            gradientDrawable3.setColor(a5.intValue());
        }
        findViewById14.setBackground(gradientDrawable3);
        h.f.b.l.b(findViewById14, "");
        this.K = findViewById14;
        View view2 = this.y;
        if (view2 == null) {
            h.f.b.l.a("rootLayout");
        }
        view2.setOnClickListener(new z(this));
        VideoTitleFollowBtn videoTitleFollowBtn = this.x;
        if (videoTitleFollowBtn == null) {
            h.f.b.l.a("followUserBtn");
        }
        videoTitleFollowBtn.setOnClickListener(new aa(this));
        f.a.b(this, L(), o.f92581a, (com.bytedance.assem.arch.viewModel.k) null, ab.f92539a, 6);
        f.a.b(this, L(), m.f92579a, (com.bytedance.assem.arch.viewModel.k) null, w.f92563a, 6);
        f.a.a(this, (VideoViewModel) this.T.getValue(), n.f92580a, (com.bytedance.assem.arch.viewModel.k) null, x.f92564a, 6);
        com.ss.android.ugc.aweme.base.utils.m.a(new y(this));
    }

    static final class q extends h.f.b.m implements h.f.a.m<a, String, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92553a = new q();

        static {
            Covode.recordClassIndex(58635);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, String str) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            a.a(aVar2).setText(str);
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<a, Integer, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f92559a = new s();

        static {
            Covode.recordClassIndex(58639);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, Integer num) {
            a aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(aVar2, "");
            a.a(aVar2).setVisibility(intValue);
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f92550a = new n();

        static {
            Covode.recordClassIndex(58632);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            T t;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (!(aVar4 == null || (t = aVar4.f25631b) == null)) {
                aVar3.C = t.booleanValue();
                Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3)).mAweme;
                h.f.b.l.b(aweme, "");
                aVar3.b(aweme);
            }
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<a, h.p<? extends Integer, ? extends Integer>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f92552a = new p();

        static {
            Covode.recordClassIndex(58634);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, h.p<? extends Integer, ? extends Integer> pVar) {
            a aVar2 = aVar;
            h.p<? extends Integer, ? extends Integer> pVar2 = pVar;
            h.f.b.l.d(aVar2, "");
            if (pVar2 != null) {
                a.d(aVar2).a(((Number) pVar2.getFirst()).intValue(), ((Number) pVar2.getSecond()).intValue());
                a.d(aVar2).setVisibility(0);
                a.d(aVar2).setAlpha(1.0f);
            }
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<a, h.p<? extends String, ? extends String>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f92560a = new t();

        static {
            Covode.recordClassIndex(58640);
        }

        t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, h.p<? extends String, ? extends String> pVar) {
            a aVar2 = aVar;
            h.p<? extends String, ? extends String> pVar2 = pVar;
            h.f.b.l.d(aVar2, "");
            if (pVar2 != null) {
                Context ar_ = aVar2.ar_();
                if (ar_ == null) {
                    h.f.b.l.b();
                }
                io.a(ar_, (String) pVar2.getFirst(), (String) pVar2.getSecond(), a.a(aVar2));
            }
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<a, String, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f92561a = new u();

        static {
            Covode.recordClassIndex(58641);
        }

        u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, String str) {
            a aVar2 = aVar;
            String str2 = str;
            h.f.b.l.d(aVar2, "");
            a.b(aVar2).setText(str2);
            TextView b2 = a.b(aVar2);
            int i2 = 0;
            if (str2 == null || str2.length() == 0) {
                i2 = 8;
            }
            b2.setVisibility(i2);
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<a, InteractionTagInfoEvent, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f92563a = new w();

        static {
            Covode.recordClassIndex(58643);
        }

        w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, InteractionTagInfoEvent interactionTagInfoEvent) {
            Aweme aweme;
            a aVar2 = aVar;
            InteractionTagInfoEvent interactionTagInfoEvent2 = interactionTagInfoEvent;
            h.f.b.l.d(aVar2, "");
            if (!(interactionTagInfoEvent2 == null || (aweme = interactionTagInfoEvent2.aweme) == null)) {
                String aid = aweme.getAid();
                Aweme aweme2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme;
                h.f.b.l.b(aweme2, "");
                if (h.f.b.l.a((Object) aid, (Object) aweme2.getAid())) {
                    aVar2.a(aweme);
                }
            }
            return h.z.f158842a;
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.m<a, FollowStatusEvent, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f92539a = new ab();

        static {
            Covode.recordClassIndex(58616);
        }

        ab() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, FollowStatusEvent followStatusEvent) {
            String str;
            FollowStatus followStatus;
            a aVar2 = aVar;
            FollowStatusEvent followStatusEvent2 = followStatusEvent;
            h.f.b.l.d(aVar2, "");
            if (followStatusEvent2 != null) {
                FollowStatus followStatus2 = followStatusEvent2.status;
                if (followStatus2 != null) {
                    str = followStatus2.userId;
                } else {
                    str = null;
                }
                if (!(!h.f.b.l.a((Object) str, (Object) com.ss.android.ugc.aweme.metrics.ac.a(((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme))) && (followStatus = followStatusEvent2.status) != null && followStatus.followStatus == 1) {
                    Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme;
                    h.f.b.l.b(aweme, "");
                    if (bm.c(aweme.getAid())) {
                        VideoAuthorInfoRelationVM F = aVar2.F();
                        FollowStatus followStatus3 = followStatusEvent2.status;
                        h.f.b.l.d(followStatus3, "");
                        if (hh.b()) {
                            F.a(new VideoAuthorInfoRelationVM.a(followStatus3));
                        }
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<a, Boolean, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f92554a = new r();

        static {
            Covode.recordClassIndex(58636);
        }

        r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, Boolean bool) {
            final a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (!(!h.f.b.l.a((Object) bool, (Object) true))) {
                Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme;
                h.f.b.l.b(aweme, "");
                bm.a(aweme.getAid());
                final int measuredHeight = a.e(aVar2).getMeasuredHeight() - a.a(aVar2).getMeasuredHeight();
                final int measuredHeight2 = a.e(aVar2).getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                h.f.b.l.b(ofFloat, "");
                ofFloat.setStartDelay(200);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a.r.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(58637);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Drawable background;
                        h.f.b.l.b(valueAnimator, "");
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        ViewGroup.MarginLayoutParams marginLayoutParams = null;
                        if (!(animatedValue instanceof Float)) {
                            animatedValue = null;
                        }
                        Float f2 = (Float) animatedValue;
                        if (f2 != null) {
                            float floatValue = f2.floatValue();
                            View e2 = a.e(aVar2);
                            if (!(e2 == null || (background = e2.getBackground()) == null)) {
                                background.setAlpha((int) (255.0f * floatValue));
                            }
                            View e3 = a.e(aVar2);
                            ViewGroup.LayoutParams layoutParams = a.e(aVar2).getLayoutParams();
                            layoutParams.height = (int) (((float) measuredHeight2) - ((1.0f - floatValue) * ((float) measuredHeight)));
                            e3.setLayoutParams(layoutParams);
                            TextView a2 = a.a(aVar2);
                            ViewGroup.LayoutParams layoutParams2 = a.a(aVar2).getLayoutParams();
                            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                                layoutParams2 = null;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            if (marginLayoutParams2 != null) {
                                int b2 = (int) com.bytedance.common.utility.n.b(aVar2.ar_(), 8.0f * floatValue);
                                if (!gb.a(aVar2.ar_())) {
                                    marginLayoutParams2.leftMargin = b2;
                                } else {
                                    marginLayoutParams2.rightMargin = b2;
                                }
                                marginLayoutParams2.topMargin = b2;
                                marginLayoutParams = marginLayoutParams2;
                            }
                            a2.setLayoutParams(marginLayoutParams);
                            a.d(aVar2).setAlpha(floatValue);
                            a.c(aVar2).setAlpha(floatValue);
                        }
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.a.r.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(58638);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        aVar2.F().a(VideoAuthorInfoRelationVM.b.f92537a);
                        Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme;
                        h.f.b.l.b(aweme, "");
                        bm.a(aweme.getAid(), false);
                    }
                });
                ofFloat.start();
            }
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f92564a = new x();

        static {
            Covode.recordClassIndex(58644);
        }

        x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            VideoItemParams videoItemParams;
            Aweme aweme;
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (!(aVar2 == null || (videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3)) == null || (aweme = videoItemParams.mAweme) == null)) {
                if (aVar3.F.keySet().contains(aweme.getAid())) {
                    VideoAuthorInfoRelationVM F = aVar3.F();
                    String str = aVar3.F.get(aweme.getAid());
                    if (str == null) {
                        str = "";
                    }
                    h.f.b.l.b(str, "");
                    F.a(aweme, str);
                } else if (TextUtils.isEmpty(aVar3.D)) {
                    String aid = aweme.getAid();
                    h.f.b.l.b(aid, "");
                    aVar3.D = aid;
                }
            }
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<a, Boolean, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92549a = new m();

        static {
            Covode.recordClassIndex(58631);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: android.graphics.drawable.GradientDrawable */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, Boolean bool) {
            int i2;
            ColorDrawable colorDrawable;
            float f2;
            a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(aVar2, "");
            View c2 = a.c(aVar2);
            int i3 = 8;
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c2.setVisibility(i2);
            VideoTitleFollowBtn d2 = a.d(aVar2);
            if (booleanValue) {
                i3 = 0;
            }
            d2.setVisibility(i3);
            a.c(aVar2).setAlpha(1.0f);
            a.d(aVar2).setAlpha(1.0f);
            View e2 = a.e(aVar2);
            if (booleanValue) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(com.bytedance.common.utility.n.b(aVar2.ar_(), 4.0f));
                Context ar_ = aVar2.ar_();
                colorDrawable = gradientDrawable;
                if (ar_ != null) {
                    Integer a2 = com.bytedance.tux.h.d.a(ar_, R.attr.a4);
                    colorDrawable = gradientDrawable;
                    if (a2 != null) {
                        gradientDrawable.setColor(a2.intValue());
                        colorDrawable = gradientDrawable;
                    }
                }
            } else {
                colorDrawable = new ColorDrawable(0);
            }
            e2.setBackground(colorDrawable);
            View e3 = a.e(aVar2);
            ViewGroup.LayoutParams layoutParams = a.e(aVar2).getLayoutParams();
            layoutParams.height = -2;
            e3.setLayoutParams(layoutParams);
            if (booleanValue) {
                f2 = 8.0f;
            } else {
                f2 = 0.0f;
            }
            TextView a3 = a.a(aVar2);
            ViewGroup.LayoutParams layoutParams2 = a.a(aVar2).getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams2 != null) {
                int b2 = (int) com.bytedance.common.utility.n.b(aVar2.ar_(), f2);
                if (!gb.a(aVar2.ar_())) {
                    marginLayoutParams2.leftMargin = b2;
                } else {
                    marginLayoutParams2.rightMargin = b2;
                }
                marginLayoutParams2.topMargin = b2;
                marginLayoutParams = marginLayoutParams2;
            }
            a3.setLayoutParams(marginLayoutParams);
            if (booleanValue) {
                Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2)).mAweme;
                h.f.b.l.b(aweme, "");
                bm.a(aweme.getAid(), true);
            }
            aVar2.F().a(new VideoAuthorInfoRelationVM.c(booleanValue));
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.r<a, MutualStruct, String, Aweme, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92551a = new o();

        static {
            Covode.recordClassIndex(58633);
        }

        o() {
            super(4);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(a aVar, MutualStruct mutualStruct, String str, Aweme aweme) {
            a aVar2 = aVar;
            MutualStruct mutualStruct2 = mutualStruct;
            String str2 = str;
            Aweme aweme2 = aweme;
            h.f.b.l.d(aVar2, "");
            if (mutualStruct2 != null) {
                a.f(aVar2).setVisibility(0);
                MutualRelationView f2 = a.f(aVar2);
                Context ar_ = aVar2.ar_();
                if (ar_ == null) {
                    h.f.b.l.b();
                }
                f2.setTextColor(androidx.core.content.b.c(ar_, R.color.a9));
                a.f(aVar2).setDarkMode(true);
                a.f(aVar2).a(mutualStruct2, com.ss.android.ugc.aweme.friends.e.e());
            } else {
                a.f(aVar2).setVisibility(8);
            }
            if (aweme2 != null) {
                com.ss.android.ugc.aweme.social.ext.a.a(a.g(aVar2), null, aweme2, Integer.valueOf(a.g(aVar2).getMaxWidth()), 1);
                a.g(aVar2).setVisibility(0);
            } else if (str2 == null || str2.length() == 0) {
                a.g(aVar2).setVisibility(8);
            } else {
                TuxTextView tuxTextView = aVar2.A;
                if (tuxTextView == null) {
                    h.f.b.l.a("tvRelationView");
                }
                tuxTextView.setVisibility(0);
                TuxTextView tuxTextView2 = aVar2.A;
                if (tuxTextView2 == null) {
                    h.f.b.l.a("tvRelationView");
                }
                tuxTextView2.setText(str2);
                a.g(aVar2).setVisibility(0);
            }
            return h.z.f158842a;
        }
    }
}
