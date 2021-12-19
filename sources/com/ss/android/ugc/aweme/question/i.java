package com.ss.android.ugc.aweme.question;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.keva.Keva;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.refresh.TuxRefreshLayout;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailViewModel;
import com.ss.android.ugc.aweme.question.widget.MonitorSizeChangedLinearLayout;
import com.ss.android.ugc.aweme.question.widget.a;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public class i extends com.ss.android.ugc.aweme.challenge.ui.b implements ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q, a.AbstractC3097a, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final d r = new d((byte) 0);
    private final h.h N = h.i.a(h.m.NONE, new k(this));
    private final h.h O = h.i.a(h.m.NONE, new l(this));
    private final h.h P = h.i.a(h.m.NONE, new m(this));
    private final h.h Q = h.i.a(h.m.NONE, new p(this));
    private final h.h R = h.i.a(h.m.NONE, new n(this));
    private final h.h S = h.i.a(h.m.NONE, new j(this));
    private com.ss.android.ugc.aweme.question.c.c T;
    private String U;
    private com.ss.android.ugc.aweme.question.api.a V;
    private boolean W = true;
    private boolean X;
    private boolean Y;
    private final lifecycleAwareLazy Z;
    private final h.h aa;
    private final h.h ab;
    private com.ss.android.ugc.aweme.v.a.a ac;
    private com.ss.android.ugc.aweme.v.a.b ad;
    private boolean ae;
    private androidx.fragment.app.l af;
    private float ag;
    private float ah;
    private int ai;
    private SparseArray aj;

    /* renamed from: d  reason: collision with root package name */
    final h.h f119996d = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: e  reason: collision with root package name */
    public e f119997e;

    /* renamed from: j  reason: collision with root package name */
    public c f119998j;

    /* renamed from: k  reason: collision with root package name */
    public String f119999k;

    /* renamed from: l  reason: collision with root package name */
    public int f120000l;

    /* renamed from: m  reason: collision with root package name */
    public String f120001m = "";
    public String n = "";
    public com.ss.android.ugc.aweme.base.arch.i o = new com.ss.android.ugc.aweme.base.arch.i();
    com.ss.android.ugc.aweme.question.widget.a p;
    final IQAInvitationService q;
    private final h.h s = h.i.a(h.m.NONE, new C3096i(this));
    private final h.h t = h.i.a(h.m.NONE, new o(this));
    private final h.h u = h.i.a(h.m.NONE, new r(this));

    public static final class b extends h.f.b.m implements h.f.a.m<QuestionDetailState, Bundle, QuestionDetailState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(77949);
        }

        public b() {
            super(2);
        }

        public final QuestionDetailState invoke(QuestionDetailState questionDetailState, Bundle bundle) {
            h.f.b.l.c(questionDetailState, "");
            return questionDetailState;
        }
    }

    static {
        Covode.recordClassIndex(77946);
    }

    private final View t() {
        return (View) this.t.getValue();
    }

    private final View u() {
        return (View) this.u.getValue();
    }

    private final MonitorSizeChangedLinearLayout v() {
        return (MonitorSizeChangedLinearLayout) this.S.getValue();
    }

    private final QuestionDetailJediViewModel w() {
        return (QuestionDetailJediViewModel) this.Z.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.detail.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String a(int i2) {
        return i2 != 0 ? "" : "qa_detail";
    }

    public final View b(int i2) {
        if (this.aj == null) {
            this.aj = new SparseArray();
        }
        View view = (View) this.aj.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.aj.put(i2, findViewById);
        return findViewById;
    }

    public final QuestionDetailParam b() {
        return (QuestionDetailParam) this.s.getValue();
    }

    /* access modifiers changed from: package-private */
    public final RelativeLayout c() {
        return (RelativeLayout) this.N.getValue();
    }

    /* access modifiers changed from: package-private */
    public final View e() {
        return (View) this.O.getValue();
    }

    public final SpringLayout g() {
        return (SpringLayout) this.P.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new org.greenrobot.eventbus.g(i.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new org.greenrobot.eventbus.g(i.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final int h() {
        return R.layout.arj;
    }

    /* access modifiers changed from: package-private */
    public final DmtStatusView j() {
        return (DmtStatusView) this.Q.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ImageView m() {
        return (ImageView) this.R.getValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(77952);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.o;
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final androidx.fragment.app.l l() {
        return this.af;
    }

    static final class aa implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f120002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f120003b;

        static {
            Covode.recordClassIndex(77948);
        }

        aa(String str, h.f.a.a aVar) {
            this.f120002a = str;
            this.f120003b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f120003b.invoke();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<HashMap<Integer, View>> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f120006a = new q();

        static {
            Covode.recordClassIndex(77965);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<Integer, View> invoke() {
            return new HashMap();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.a(true, true);
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<MonitorSizeChangedLinearLayout> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MonitorSizeChangedLinearLayout invoke() {
            return this.this$0.b(R.id.bf9);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.this$0.b(R.id.e9y);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.this$0.b(R.id.e9v);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<TuxRefreshLayout> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxRefreshLayout invoke() {
            return this.this$0.b(R.id.c7d);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.b(R.id.e0k);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.b(R.id.e_f);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.this$0.b(R.id.e_o);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.b(R.id.emo);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f120007a;

        static {
            Covode.recordClassIndex(77975);
        }

        z(i iVar) {
            this.f120007a = iVar;
        }

        public final void run() {
            ScrollableLayout scrollableLayout = this.f120007a.y;
            if (scrollableLayout != null) {
                scrollableLayout.setMaxScrollHeight(Integer.MAX_VALUE);
            }
        }
    }

    private static boolean x() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String i() {
        String str = this.U;
        if (str == null) {
            h.f.b.l.a("mQuestionId");
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void k() {
        super.k();
        DmtTabLayout dmtTabLayout = this.C;
        if (dmtTabLayout != null) {
            dmtTabLayout.setBackgroundResource(R.color.f159928l);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.a
    public void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.aj;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.i$i  reason: collision with other inner class name */
    static final class C3096i extends h.f.b.m implements h.f.a.a<QuestionDetailParam> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3096i(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ QuestionDetailParam invoke() {
            Object value = this.this$0.f119996d.getValue();
            if (value == null) {
                return new QuestionDetailParam(null, null, null, null, null, null, 63, null);
            }
            return value;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<QuestionDetailViewModel> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ QuestionDetailViewModel invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            return QuestionDetailViewModel.a.a(activity);
        }
    }

    static boolean r() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean x2 = x();
        com.ss.android.ugc.aweme.lancet.j.f107226e = x2;
        return x2;
    }

    public static final class c extends h.f.b.m implements h.f.a.a<QuestionDetailJediViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(77950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_question_QuestionDetailFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel> r0 = com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.question.i$c$1 r0 = new com.ss.android.ugc.aweme.question.i$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.question.i.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_question_QuestionDetailFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final List<Aweme> q() {
        List<Aweme> p2;
        if (this.I == null || !(this.I.get(this.G) instanceof com.ss.android.ugc.aweme.challenge.ui.s)) {
            return h.a.z.INSTANCE;
        }
        Object obj = this.I.get(this.G);
        if (!(obj instanceof com.ss.android.ugc.aweme.challenge.ui.s)) {
            obj = null;
        }
        com.ss.android.ugc.aweme.challenge.ui.s sVar = (com.ss.android.ugc.aweme.challenge.ui.s) obj;
        if (sVar == null || (p2 = sVar.p()) == null) {
            return h.a.z.INSTANCE;
        }
        return p2;
    }

    @Override // com.ss.android.ugc.aweme.question.widget.a.AbstractC3097a
    public final void s() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        User curUser = g2.getCurUser();
        h.f.b.l.b(curUser, "");
        com.ss.android.ugc.aweme.common.r.a("enter_qa_personal_profile", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qa_detail").a("enter_method", "click_toast").f66730a);
        SmartRouter.buildRoute(this, "aweme://user/qna/profile/" + curUser.getUid()).withParam("enter_from", "qa_detail").withParam("enter_method", "click_toast").open();
        com.ss.android.ugc.aweme.question.widget.a aVar = this.p;
        if (aVar == null) {
            h.f.b.l.b();
        }
        if (aVar.isShowing()) {
            com.ss.android.ugc.aweme.question.widget.a aVar2 = this.p;
            if (aVar2 == null) {
                h.f.b.l.b();
            }
            aVar2.dismiss();
        }
    }

    public i() {
        h.k.c a2 = h.f.b.ab.a(QuestionDetailJediViewModel.class);
        a aVar = new a(a2);
        this.Z = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
        this.aa = h.i.a(h.m.NONE, new s(this));
        this.ab = h.i.a(h.m.NONE, q.f120006a);
        IQAInvitationService b2 = QAInvitationService.b();
        h.f.b.l.b(b2, "");
        this.q = b2;
        this.ai = -1;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    private final void b(View view) {
        a(view, new y(this));
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f120005a;

        static {
            Covode.recordClassIndex(77954);
        }

        f(h.f.a.b bVar) {
            this.f120005a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                h.f.a.b bVar = this.f120005a;
                h.f.b.l.b(view, "");
                bVar.invoke(view);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        h.f.b.l.d(aVar, "");
        String str = aVar.f68097a;
        if (str != null && h.m.p.a((CharSequence) str, (CharSequence) "/tiktok/v1/forum/question/detail/?", false)) {
            EventBus.a().d(aVar);
            a(true, false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements com.ss.android.ugc.aweme.detail.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f120004a;

        static {
            Covode.recordClassIndex(77953);
        }

        e(i iVar) {
            this.f120004a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.detail.k
        public final void a(boolean z) {
            if (z) {
                i iVar = this.f120004a;
                e eVar = iVar.f119997e;
                if (eVar == null) {
                    h.f.b.l.a("mHotFragment");
                }
                String jSONObject = eVar.a().toString();
                h.f.b.l.b(jSONObject, "");
                iVar.n = jSONObject;
            } else if (this.f120004a.g().f45677g) {
                this.f120004a.g().setRefreshing(false);
            }
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            h.f.b.l.d(view, "");
            if (MSAdaptionService.c().c(this.this$0.getContext())) {
                SmartRouter.buildRoute(this.this$0.getContext(), "//duo").withParam("duo_type", "duo_back").open();
            } else {
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            h.f.b.l.d(view, "");
            i iVar = this.this$0;
            AnonymousClass1 r4 = new h.f.a.a<h.z>(this.this$0) {
                /* class com.ss.android.ugc.aweme.question.i.x.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(77973);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    long j2;
                    User creator;
                    String uid;
                    Long id;
                    i iVar = (i) this.receiver;
                    iVar.getContext();
                    if (!i.r()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(iVar.getContext()).a(R.string.de8).a();
                    } else {
                        try {
                            androidx.fragment.app.e activity = iVar.getActivity();
                            if (activity != null) {
                                IQAInvitationService iQAInvitationService = iVar.q;
                                com.ss.android.ugc.aweme.qainvitation.e.e eVar = com.ss.android.ugc.aweme.qainvitation.e.e.QUESTION_DETAIL;
                                c cVar = iVar.f119998j;
                                long j3 = 0;
                                if (cVar == null || (id = cVar.getId()) == null) {
                                    j2 = 0;
                                } else {
                                    j2 = id.longValue();
                                }
                                Long valueOf = Long.valueOf(j2);
                                c cVar2 = iVar.f119998j;
                                if (!(cVar2 == null || (creator = cVar2.getCreator()) == null || (uid = creator.getUid()) == null)) {
                                    j3 = Long.parseLong(uid);
                                }
                                IQAInvitationService.a.a(iQAInvitationService, activity, "click_button", "qa_detail", eVar, valueOf, Long.valueOf(j3), null, 128);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    return h.z.f158842a;
                }
            };
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                androidx.fragment.app.e activity = iVar.getActivity();
                if (activity != null) {
                    com.ss.android.ugc.aweme.login.c.a(activity, "qa_detail", "click_button", new aa("click_button", r4));
                }
            } else {
                r4.invoke();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(Bundle bundle) {
        String id = b().getId();
        String str = "";
        if (id == null) {
            id = str;
        }
        this.U = id;
        String processId = b().getProcessId();
        if (processId != null) {
            str = processId;
        }
        this.f120001m = str;
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        h.f.b.l.d(jVar, "");
        if (TextUtils.equals("qna", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            createIIMServicebyMonsterPlugin.showIMSnackbar(activity, c(), jVar);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            String str;
            String str2;
            long j2;
            String str3;
            int i2;
            Integer videosCount;
            Long id;
            User creator;
            h.f.b.l.d(view, "");
            if (this.this$0.f119998j != null) {
                QuestionDetailParam b2 = this.this$0.b();
                ShareInfo shareInfo = null;
                if (b2 != null) {
                    str = b2.getId();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                dVar.a("enter_from", "qa_detail");
                if (str != null) {
                    dVar.a("question_id", str);
                }
                com.ss.android.ugc.aweme.common.r.a("click_more_button", dVar.f66730a);
                c cVar = this.this$0.f119998j;
                if (cVar == null || (creator = cVar.getCreator()) == null || (str2 = creator.getUid()) == null) {
                    str2 = "";
                }
                c cVar2 = this.this$0.f119998j;
                if (cVar2 == null || (id = cVar2.getId()) == null) {
                    j2 = 0;
                } else {
                    j2 = id.longValue();
                }
                c cVar3 = this.this$0.f119998j;
                if (cVar3 == null || (str3 = cVar3.getContent()) == null) {
                    str3 = "";
                }
                c cVar4 = this.this$0.f119998j;
                if (cVar4 == null || (videosCount = cVar4.getVideosCount()) == null) {
                    i2 = 0;
                } else {
                    i2 = videosCount.intValue();
                }
                c cVar5 = this.this$0.f119998j;
                if (cVar5 != null) {
                    shareInfo = cVar5.getShareInfo();
                }
                List<Aweme> q = this.this$0.q();
                ShareService shareService = ah.f123352a;
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                shareService.a(activity, new com.ss.android.ugc.aweme.qna.model.b(str2, j2, str3, i2, shareInfo, q), new com.ss.android.ugc.aweme.sharer.ui.g(), this.this$0.f120001m);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            long j2;
            long j3;
            long j4;
            UrlModel urlModel;
            User user;
            User creator;
            User creator2;
            Aweme video;
            String aid;
            User creator3;
            String uid;
            Long id;
            String str = "";
            h.f.b.l.d(view, str);
            c cVar = this.this$0.f119998j;
            String str2 = null;
            if (!(cVar == null || cVar.getCreator() == null)) {
                CommentService e2 = CommentServiceImpl.e();
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, str);
                c cVar2 = this.this$0.f119998j;
                if (cVar2 == null || (id = cVar2.getId()) == null) {
                    j2 = 0;
                } else {
                    j2 = id.longValue();
                }
                c cVar3 = this.this$0.f119998j;
                if (cVar3 == null || (creator3 = cVar3.getCreator()) == null || (uid = creator3.getUid()) == null) {
                    j3 = 0;
                } else {
                    j3 = Long.parseLong(uid);
                }
                c cVar4 = this.this$0.f119998j;
                if (cVar4 == null || (video = cVar4.getVideo()) == null || (aid = video.getAid()) == null) {
                    j4 = 0;
                } else {
                    j4 = Long.parseLong(aid);
                }
                c cVar5 = this.this$0.f119998j;
                if (cVar5 == null || (creator2 = cVar5.getCreator()) == null) {
                    urlModel = null;
                } else {
                    urlModel = creator2.getAvatarThumb();
                }
                c cVar6 = this.this$0.f119998j;
                if (cVar6 != null) {
                    user = cVar6.getCreator();
                } else {
                    user = null;
                }
                String e3 = in.e(user);
                String str3 = this.this$0.f119999k;
                if (str3 != null) {
                    str = str3;
                }
                c cVar7 = this.this$0.f119998j;
                if (!(cVar7 == null || (creator = cVar7.getCreator()) == null)) {
                    str2 = creator.getSecUid();
                }
                e2.a(activity, new QaStruct(j2, j3, j4, urlModel, e3, str, str2, h.a.z.INSTANCE), "qa_detail", "click_qa_detail", "answer");
            }
            return h.z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0612, code lost:
        if (h.m.p.b(r5, r9, false) != true) goto L_0x0614;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.question.api.a r26) {
        /*
        // Method dump skipped, instructions count: 2036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.question.i.a(com.ss.android.ugc.aweme.question.api.a):void");
    }

    private static void a(View view, h.f.a.b<? super View, h.z> bVar) {
        view.setOnClickListener(new f(bVar));
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void a(float f2, float f3) {
        this.X = com.ss.android.ugc.aweme.detail.m.a(f2, f3, this.X, this);
    }

    static final class w extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th2, "");
            i iVar2 = this.this$0;
            if (iVar2.ab_()) {
                iVar2.g().setRefreshing(false);
                iVar2.g().setVisibility(8);
                iVar2.m().setVisibility(8);
                iVar2.c().setVisibility(8);
                iVar2.e().setVisibility(8);
                iVar2.j().h();
                if (th2 != null) {
                    th2.printStackTrace();
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(int i2, int i3) {
        boolean z2;
        super.a(i2, i3);
        Set<Map.Entry> entrySet = ((HashMap) this.ab.getValue()).entrySet();
        if (entrySet != null) {
            for (Map.Entry entry : entrySet) {
                Object value = entry.getValue();
                h.f.b.l.b(value, "");
                View view = (View) value;
                Integer num = (Integer) entry.getKey();
                if (num != null && num.intValue() == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                view.setSelected(z2);
            }
        }
        if (this.I != null) {
            Object obj = this.I.get(i2);
            com.ss.android.ugc.aweme.detail.h hVar = (com.ss.android.ugc.aweme.detail.h) obj;
            h.f.b.l.b(hVar, "");
            if (!hVar.d()) {
                obj = null;
            }
            com.ss.android.ugc.aweme.detail.h hVar2 = (com.ss.android.ugc.aweme.detail.h) obj;
            if (hVar2 != null) {
                hVar2.j();
            }
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.question.api.a, h.z> {
        final /* synthetic */ View $view;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(i iVar, View view) {
            super(2);
            this.this$0 = iVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.question.api.a aVar) {
            com.ss.android.ugc.aweme.question.api.a aVar2 = aVar;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(aVar2, "");
            this.this$0.a(aVar2);
            if (QnaService.a().enablePublicQna()) {
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                if (!activity.isDestroyed()) {
                    androidx.fragment.app.e activity2 = this.this$0.getActivity();
                    if (activity2 == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity2, "");
                    if (!activity2.isFinishing()) {
                        i iVar2 = this.this$0;
                        View view = this.$view;
                        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(iVar2);
                        if (b2 != null && h.f.b.l.a((Object) iVar2.b().getEnterMethod(), (Object) "ask_question") && h.f.b.l.a((Object) iVar2.b().getQuestionType(), (Object) "textual")) {
                            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                            h.f.b.l.b(g2, "");
                            User curUser = g2.getCurUser();
                            h.f.b.l.b(curUser, "");
                            if (curUser.getDisplayQnaOnProfile() == null) {
                                Keva repo = Keva.getRepo("keva_question_detail_repo");
                                StringBuilder sb = new StringBuilder("is_first_time_ask_text_question");
                                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                                h.f.b.l.b(g3, "");
                                if (repo.getBoolean(sb.append(g3.getCurUserId()).toString(), true)) {
                                    Keva repo2 = Keva.getRepo("keva_question_detail_repo");
                                    StringBuilder sb2 = new StringBuilder("is_first_time_ask_text_question");
                                    IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
                                    h.f.b.l.b(g4, "");
                                    repo2.storeBoolean(sb2.append(g4.getCurUserId()).toString(), false);
                                    iVar2.p = new com.ss.android.ugc.aweme.question.widget.a(b2, view, iVar2);
                                    com.ss.android.ugc.aweme.question.widget.a aVar3 = iVar2.p;
                                    if (aVar3 == null) {
                                        h.f.b.l.b();
                                    }
                                    new Handler().postDelayed(new a.d(aVar3), 200);
                                    new Handler().postDelayed(new a.e(aVar3), 3000);
                                }
                            }
                        }
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    public final void a(boolean z2, boolean z3) {
        getContext();
        if (!r()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            j().h();
            g().setRefreshing(false);
        } else {
            j().f();
            String id = b().getId();
            if (id != null) {
                w().a(Long.parseLong(id), z3);
            }
            List<com.ss.android.ugc.aweme.detail.h> list = this.I;
            if (z2 && list != null) {
                for (com.ss.android.ugc.aweme.detail.h hVar : list) {
                    hVar.a(false, true);
                }
            }
        }
        if (z3) {
            j().d();
            a(0.0f, -60.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void b(int i2, int i3) {
        int i4;
        super.b(i2, i3);
        float f2 = 0.0f;
        if (this.ai != v().getBottom()) {
            int bottom = v().getBottom();
            View view = this.A;
            h.f.b.l.b(view, "");
            float bottom2 = (float) ((bottom - view.getBottom()) - t().getHeight());
            this.ag = bottom2;
            float b2 = bottom2 - com.bytedance.common.utility.n.b(getContext(), 20.0f);
            this.ah = b2;
            if (b2 < 0.0f) {
                this.ah = 0.0f;
            }
            this.ai = v().getBottom();
        }
        if (i2 == 0) {
            u().setBackground(new ColorDrawable(androidx.core.content.b.c(u().getContext(), R.color.c9)));
        } else {
            u().setBackground(new ColorDrawable(androidx.core.content.b.c(u().getContext(), R.color.f159928l)));
        }
        com.ss.android.ugc.aweme.question.c.c cVar = this.T;
        if (cVar != null) {
            i4 = cVar.getAvatarContainerHeight();
        } else {
            i4 = 1;
        }
        float f3 = ((float) i2) / ((float) i4);
        if (f3 >= 0.0f) {
            if (f3 > 1.0f) {
                f2 = 1.0f;
            } else {
                f2 = f3;
            }
        }
        TextView textView = this.z;
        h.f.b.l.b(textView, "");
        textView.setAlpha(f2);
        this.X = com.ss.android.ugc.aweme.detail.m.a(f2, this.X, this);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.a
    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        int identifier;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(b().getId())) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        DmtTabLayout dmtTabLayout = this.C;
        h.f.b.l.b(dmtTabLayout, "");
        dmtTabLayout.setVisibility(8);
        TextView textView = this.z;
        h.f.b.l.b(textView, "");
        textView.setVisibility(0);
        if (MSAdaptionService.c().c(getContext())) {
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) b(R.id.qb);
            h.f.b.l.b(autoRTLImageView, "");
            autoRTLImageView.setVisibility(8);
        }
        AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) b(R.id.qb);
        h.f.b.l.b(autoRTLImageView2, "");
        a(autoRTLImageView2, new t(this));
        int i3 = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            i2 = 0;
        } else {
            i2 = context.getResources().getDimensionPixelSize(identifier);
        }
        float dimension = getResources().getDimension(R.dimen.a0s);
        t().getLayoutParams().height = i2;
        t().setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = j().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (((float) i2) + dimension);
        a(m(), new h(this));
        d.a aVar = new d.a(getContext());
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 69.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        h.f.b.l.a((Object) system2, "");
        j().setBuilder(DmtStatusView.a.a(getContext()).b(aVar.a(2131231887, a2, h.g.a.a(TypedValue.applyDimension(1, 69.0f, system2.getDisplayMetrics()))).b(R.string.f4w).a().f33648a));
        g().setScrollMode(com.bytedance.tux.widget.spring.g.NONE);
        g().setOnRefreshListener(new g(this));
        v().setOnSizeChangedListener(new u(this));
        h.a.a(this, w(), j.f120008a, (com.bytedance.jedi.arch.ah) null, new w(this), (h.f.a.b) null, new v(this, view), 10);
        a(false, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    static final class u extends h.f.b.m implements h.f.a.r<Integer, Integer, Integer, Integer, h.z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(77969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(i iVar) {
            super(4);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(Integer num, Integer num2, Integer num3, Integer num4) {
            num.intValue();
            int intValue = num2.intValue();
            num3.intValue();
            num4.intValue();
            this.this$0.f120000l = intValue;
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
