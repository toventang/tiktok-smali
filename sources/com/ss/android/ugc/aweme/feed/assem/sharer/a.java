package com.ss.android.ugc.aweme.feed.assem.sharer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bb;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new y(a.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0)};
    private final h.h.d v;
    private final h.h w;
    private final h.h x;
    private SparseArray y;

    public static final class b extends h.f.b.m implements h.f.a.b<j, j> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58580);
        }

        public b() {
            super(1);
        }

        public final j invoke(j jVar) {
            h.f.b.l.c(jVar, "");
            return jVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58581);
        }

        public c() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<bb, bb> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58584);
        }

        public f() {
            super(1);
        }

        public final bb invoke(bb bbVar) {
            h.f.b.l.c(bbVar, "");
            return bbVar;
        }
    }

    static {
        Covode.recordClassIndex(58578);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.aj3;
    }

    public final VideoExposeSharerInformationVM F() {
        return (VideoExposeSharerInformationVM) this.v.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.y == null) {
            this.y = new SparseArray();
        }
        View view = (View) this.y.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.y.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58582);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58583);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58585);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58586);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final void a() {
        super.a();
        F().a((Context) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$a  reason: collision with other inner class name */
    public static final class C2249a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2249a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public a() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoExposeSharerInformationVM.class);
        this.v = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new C2249a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.w = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
        this.x = new com.bytedance.ext_power_list.g(ab.a(VideoEventDispatchViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        VideoExposeSharerInformationVM F;
        super.x();
        f.a.a(this, F(), b.f92521a, (com.bytedance.assem.arch.viewModel.k) null, j.f92508a, 6);
        a(F, d.f92523a, e.f92524a, com.bytedance.assem.arch.viewModel.l.a(F().f25686c), null, k.f92509a);
        f.a.a(this, F(), f.f92525a, (com.bytedance.assem.arch.viewModel.k) null, l.f92510a, 6);
        f.a.a(this, F(), g.f92526a, com.bytedance.assem.arch.viewModel.l.c(), m.f92511a, 4);
        f.a.a(this, F(), c.f92522a, com.bytedance.assem.arch.viewModel.l.c(), i.f92507a, 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(VideoItemParams videoItemParams) {
        b(videoItemParams);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final /* synthetic */ boolean c(VideoItemParams videoItemParams) {
        return c(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final boolean b(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        return VideoExposeSharerInformationVM.a.a(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        super.b(videoItemParams);
        F().a(ar_());
    }

    public final void a(int i2) {
        TuxTextView tuxTextView = (TuxTextView) B().findViewById(R.id.f7_);
        h.f.b.l.b(tuxTextView, "");
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(i2);
        TuxTextView tuxTextView2 = (TuxTextView) B().findViewById(R.id.f7_);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setLayoutParams(marginLayoutParams);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        if (((j) F().e()).f92535g) {
            B().setVisibility(0);
        } else {
            B().setVisibility(8);
        }
        F().a(false);
        VideoExposeSharerInformationVM F = F();
        if (F.f92500l == null) {
            F.f92500l = com.ss.android.ugc.aweme.friends.service.a.f97047a.i();
            w wVar = F.f92500l;
            if (wVar == null) {
                h.f.b.l.b();
            }
            wVar.a(F);
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        ((RelativeLayout) view.findViewById(R.id.ezp)).setOnClickListener(new n(this));
        ((RelativeLayout) B().findViewById(R.id.ayz)).setOnClickListener(new o(this));
        f.a.a(this, (VideoPlayViewModel) this.w.getValue(), h.f92527a, (com.bytedance.assem.arch.viewModel.k) null, p.f92518a, 6);
        f.a.a(this, (VideoEventDispatchViewModel) this.x.getValue(), i.f92528a, (com.bytedance.assem.arch.viewModel.k) null, q.f92520a, 6);
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92516a;

        static {
            Covode.recordClassIndex(58594);
        }

        n(a aVar) {
            this.f92516a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            String str;
            ClickAgent.onClick(view);
            VideoExposeSharerInformationVM F = this.f92516a.F();
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && aweme.getExposeSharer() != null && !aweme.isDelete()) {
                ExposeSharer exposeSharer = aweme.getExposeSharer();
                if (exposeSharer != null) {
                    str = exposeSharer.getUid();
                } else {
                    str = null;
                }
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                String str2 = "";
                h.f.b.l.b(g2, str2);
                if (!TextUtils.equals(str, g2.getCurUserId())) {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                        com.ss.android.ugc.aweme.commercialize.g.a().a(F.h(), aweme);
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "follow", aweme.getAwemeRawAd()).c();
                    }
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aa(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                        com.ss.android.ugc.aweme.commercialize.g.a().a(F.h(), aweme, "plus_sign");
                    }
                    com.ss.android.ugc.aweme.base.utils.f fVar = f.a.f68431a;
                    h.f.b.l.b(fVar, str2);
                    if (!fVar.c()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(F.h()).a(R.string.de8).a();
                        return;
                    }
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g3, str2);
                    if (!g3.isLogin()) {
                        Activity activity = (Activity) F.h();
                        String str3 = F.p;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        com.ss.android.ugc.aweme.login.c.a(activity, str2, "click_follow", new ap().a("group_id", aweme.getAid()).a("log_pb", ac.c(aweme.getAid())).f142646a, new VideoExposeSharerInformationVM.b(aweme, F));
                        return;
                    }
                    String str4 = F.p;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    F.a(aweme, str2, true);
                }
            }
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92517a;

        static {
            Covode.recordClassIndex(58595);
        }

        o(a aVar) {
            this.f92517a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            VideoExposeSharerInformationVM F = this.f92517a.F();
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && aweme.getExposeSharer() != null) {
                ExposeSharer exposeSharer = aweme.getExposeSharer();
                String str4 = null;
                if (exposeSharer != null && exposeSharer.getUid() != null && !in.d() && !com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
                    if (aweme.isCanPlay() && !aweme.isDelete()) {
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "share_user_info_card");
                        if (((FeedBaseViewModel) F).o == 0) {
                            str = "homepage_hot";
                        } else {
                            str = "server_push";
                        }
                        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("previous_page", str).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid());
                        ExposeSharer exposeSharer2 = aweme.getExposeSharer();
                        if (exposeSharer2 != null) {
                            str2 = exposeSharer2.getUid();
                        } else {
                            str2 = null;
                        }
                        r.a("enter_personal_detail", a3.a("to_user_id", str2).f66730a);
                        SmartRoute buildRoute = SmartRouter.buildRoute(F.h(), "aweme://user/profile/");
                        ExposeSharer exposeSharer3 = aweme.getExposeSharer();
                        if (exposeSharer3 != null) {
                            str3 = exposeSharer3.getUid();
                        } else {
                            str3 = null;
                        }
                        SmartRoute withParam = buildRoute.withParam("uid", str3);
                        ExposeSharer exposeSharer4 = aweme.getExposeSharer();
                        if (exposeSharer4 != null) {
                            str4 = exposeSharer4.getSecUid();
                        }
                        withParam.withParam("sec_user_id", str4).withParam("extra_from_pre_page", "share_user_info_card").withParam("enter_from", "others_homepage").open();
                    } else if (aweme.isImage()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(F.h()).a(R.string.cjs).a();
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(F.h()).a(R.string.har).a();
                    }
                }
            }
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<a, String, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f92508a = new j();

        static {
            Covode.recordClassIndex(58588);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, String str) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            TuxTextView tuxTextView = (TuxTextView) aVar2.B().findViewById(R.id.f7_);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setText(str);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<a, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f92510a = new l();

        static {
            Covode.recordClassIndex(58590);
        }

        l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Integer num) {
            a aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(aVar2, "");
            ((TuxTextView) aVar2.B().findViewById(R.id.b7h)).setText(intValue);
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<a, Double, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f92518a = new p();

        static {
            Covode.recordClassIndex(58596);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Double d2) {
            final a aVar2 = aVar;
            Double d3 = d2;
            h.f.b.l.d(aVar2, "");
            if (!((j) aVar2.F().e()).f92535g && d3 != null && d3.doubleValue() >= 1.0d) {
                aVar2.B().post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.assem.sharer.a.p.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(58597);
                    }

                    public final void run() {
                        Aweme aweme;
                        String str;
                        String str2;
                        a aVar = aVar2;
                        int i2 = 0;
                        aVar.B().setVisibility(0);
                        aVar.B().measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) aVar.B().getMeasuredHeight(), 0.0f);
                        translateAnimation.setDuration(250);
                        translateAnimation.setFillAfter(true);
                        ViewParent parent = aVar.s().getParent();
                        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                        View view = (View) parent;
                        if (view != null) {
                            view.startAnimation(translateAnimation);
                        }
                        VideoExposeSharerInformationVM F = aVar.F();
                        if (aVar.B().findViewById(R.id.ezp) != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) aVar.B().findViewById(R.id.ezp);
                            h.f.b.l.b(relativeLayout, "");
                            if (relativeLayout.getVisibility() == 0) {
                                i2 = 1;
                            }
                        }
                        VideoItemParams videoItemParams = (VideoItemParams) F.g();
                        if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null) {
                            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                            if (((FeedBaseViewModel) F).o == 0) {
                                str = "homepage_hot";
                            } else {
                                str = "server_push";
                            }
                            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid());
                            ExposeSharer exposeSharer = aweme.getExposeSharer();
                            if (exposeSharer != null) {
                                str2 = exposeSharer.getUid();
                            } else {
                                str2 = null;
                            }
                            r.a("show_share_user_info", a2.a("from_user_id", str2).a("with_follow_button", i2).f66730a);
                        }
                    }
                });
                aVar2.F().a(new VideoExposeSharerInformationVM.f());
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92507a = new i();

        static {
            Covode.recordClassIndex(58587);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            RelativeLayout relativeLayout = (RelativeLayout) aVar3.B().findViewById(R.id.ezp);
            h.f.b.l.b(relativeLayout, "");
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = (RelativeLayout) aVar3.B().findViewById(R.id.ezp);
            h.f.b.l.b(relativeLayout2, "");
            relativeLayout2.setAlpha(1.0f);
            TuxIconView tuxIconView = (TuxIconView) aVar3.B().findViewById(R.id.cs2);
            h.f.b.l.b(tuxIconView, "");
            tuxIconView.setAlpha(0.0f);
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar3.a(h.g.a.a(TypedValue.applyDimension(1, 92.0f, system.getDisplayMetrics())));
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<a, com.ss.android.ugc.aweme.challenge.d.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92520a = new q();

        static {
            Covode.recordClassIndex(58598);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (r0 == null) goto L_0x0047;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.assem.sharer.a r5, com.ss.android.ugc.aweme.challenge.d.c r6) {
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.sharer.a.q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92511a = new m();

        static {
            Covode.recordClassIndex(58591);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            T t;
            final a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (!(aVar4 == null || (t = aVar4.f25631b) == null)) {
                boolean booleanValue = t.booleanValue();
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                final int a2 = h.g.a.a(TypedValue.applyDimension(1, 30.0f, system.getDisplayMetrics()));
                if (booleanValue) {
                    final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar3.B().findViewById(R.id.cs2), "alpha", 0.0f, 1.0f);
                    h.f.b.l.b(ofFloat, "");
                    ofFloat.setDuration(150L);
                    ofFloat.setRepeatCount(0);
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.feed.assem.sharer.a.m.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(58592);
                        }

                        public final void onAnimationStart(Animator animator) {
                            h.f.b.l.d(animator, "");
                        }

                        public final void onAnimationEnd(Animator animator) {
                            h.f.b.l.d(animator, "");
                            TuxIconView tuxIconView = (TuxIconView) aVar3.B().findViewById(R.id.cs2);
                            h.f.b.l.b(tuxIconView, "");
                            tuxIconView.setAlpha(1.0f);
                        }
                    });
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar3.B().findViewById(R.id.ezp), "alpha", 1.0f, 0.0f);
                    h.f.b.l.b(ofFloat2, "");
                    ofFloat2.setDuration(150L);
                    ofFloat2.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.feed.assem.sharer.a.m.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(58593);
                        }

                        public final void onAnimationStart(Animator animator) {
                            h.f.b.l.d(animator, "");
                            RelativeLayout relativeLayout = (RelativeLayout) aVar3.B().findViewById(R.id.ezp);
                            h.f.b.l.b(relativeLayout, "");
                            relativeLayout.setVisibility(0);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            h.f.b.l.d(animator, "");
                            RelativeLayout relativeLayout = (RelativeLayout) aVar3.B().findViewById(R.id.ezp);
                            h.f.b.l.b(relativeLayout, "");
                            relativeLayout.setVisibility(8);
                            RelativeLayout relativeLayout2 = (RelativeLayout) aVar3.B().findViewById(R.id.ezp);
                            h.f.b.l.b(relativeLayout2, "");
                            relativeLayout2.setAlpha(1.0f);
                            aVar3.a(a2);
                            ofFloat.start();
                        }
                    });
                    ofFloat2.start();
                } else {
                    RelativeLayout relativeLayout = (RelativeLayout) aVar3.B().findViewById(R.id.ezp);
                    h.f.b.l.b(relativeLayout, "");
                    relativeLayout.setVisibility(8);
                    TuxIconView tuxIconView = (TuxIconView) aVar3.B().findViewById(R.id.cs2);
                    h.f.b.l.b(tuxIconView, "");
                    tuxIconView.setAlpha(1.0f);
                    aVar3.a(a2);
                }
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.q<a, String, UrlModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f92509a = new k();

        static {
            Covode.recordClassIndex(58589);
        }

        k() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(a aVar, String str, UrlModel urlModel) {
            a aVar2 = aVar;
            String str2 = str;
            h.f.b.l.d(aVar2, "");
            h.f.b.l.d(str2, "");
            v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
            h.f.b.l.b(a2, "");
            v a3 = a2.a(str2);
            a3.K = true;
            a3.E = (SmartImageView) aVar2.B().findViewById(R.id.e2h);
            a3.c();
            return z.f158842a;
        }
    }
}
