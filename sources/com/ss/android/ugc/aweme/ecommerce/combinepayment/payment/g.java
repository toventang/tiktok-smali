package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.address.edit.a.b;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoReqInfo;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.view.PageStepper;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class g extends com.ss.android.ugc.aweme.base.arch.b implements com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.e {
    public static final c q = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public c f85387b = new c(null, null, null, null, null, false, null, null, null, null, 1023);

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> f85388c = x.f85404a;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> f85389d = z.f85406a;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> f85390e = w.f85403a;

    /* renamed from: j  reason: collision with root package name */
    public h.f.a.a<h.z> f85391j = y.f85405a;

    /* renamed from: k  reason: collision with root package name */
    public h.f.a.a<h.z> f85392k = v.f85402a;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o f85393l;

    /* renamed from: m  reason: collision with root package name */
    public String f85394m;
    public boolean n;
    public String[] o;
    public String p;
    private final lifecycleAwareLazy r;
    private final h.h s;
    private final h.h t;
    private final h.h u;
    private SparseArray v;

    static {
        Covode.recordClassIndex(53409);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.v == null) {
            this.v = new SparseArray();
        }
        View view = (View) this.v.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.v.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.v;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final PaymentViewModel b() {
        return (PaymentViewModel) this.r.getValue();
    }

    public final PaymentAdapter c() {
        return (PaymentAdapter) this.s.getValue();
    }

    public final t e() {
        return (t) this.t.getValue();
    }

    public final com.ss.android.ugc.aweme.views.i i() {
        return (com.ss.android.ugc.aweme.views.i) this.u.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(53415);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f85402a = new v();

        static {
            Covode.recordClassIndex(53439);
        }

        v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f85405a = new y();

        static {
            Covode.recordClassIndex(53442);
        }

        y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            return h.z.f158842a;
        }
    }

    private String k() {
        String str = this.f85394m;
        this.f85394m = null;
        return str;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(53410);
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

    static final class aa extends h.f.b.m implements h.f.a.a<t> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t invoke() {
            return new t(this.this$0.f85387b);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<PaymentAdapter> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PaymentAdapter invoke() {
            PaymentAdapter paymentAdapter = new PaymentAdapter(this.this$0);
            paymentAdapter.d(false);
            return paymentAdapter;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.views.i> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.views.i invoke() {
            return new com.ss.android.ugc.aweme.views.i(this.this$0.requireContext());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a
    public final boolean f() {
        if (this.n) {
            return false;
        }
        b().a(false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.e
    public final void g() {
        e().f85429c = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.f85387b.f85265f) {
            h();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        PaymentViewModel b2 = b();
        EventCenter.a().b("ec_payment_method_activate_clicked", b2);
        EventCenter.a().b("ec_resend_pay_request", b2);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f85387b.f85265f) {
            e().f85429c = SystemClock.elapsedRealtime();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<PaymentViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(53413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$b$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_payment_PaymentFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.e
    public final void h() {
        if (ActivityStack.isAppBackGround()) {
            this.f85394m = "close";
        }
        if (!com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c.f85536d) {
            t e2 = e();
            String k2 = k();
            if (k2 == null) {
                k2 = "return";
            }
            e2.a(k2, this.f85393l, j());
        }
    }

    public final boolean j() {
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m mVar;
        String paramValue;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.f85393l;
        if (oVar == null || (mVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m) h.a.n.b((List) b().b(oVar, "save_element"), 0)) == null || (paramValue = mVar.getParamValue()) == null) {
            return false;
        }
        return Boolean.parseBoolean(paramValue);
    }

    public g() {
        ab abVar = new ab(this);
        h.k.c a2 = h.f.b.ab.a(PaymentViewModel.class);
        a aVar = new a(a2);
        this.r = new lifecycleAwareLazy(this, aVar, new b(this, aVar, a2, abVar));
        this.s = h.i.a((h.f.a.a) new d(this));
        this.t = h.i.a((h.f.a.a) new aa(this));
        String[] strArr = new String[4];
        int i2 = 0;
        do {
            strArr[i2] = null;
            i2++;
        } while (i2 < 4);
        this.o = strArr;
        this.u = h.i.a((h.f.a.a) new t(this));
    }

    public static final class s extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f85400a;

        static {
            Covode.recordClassIndex(53434);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(g gVar) {
            this.f85400a = gVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<PaymentState, h.z> {
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o $paymentMethod;
            final /* synthetic */ RecyclerView $recyclerView$inlined;
            final /* synthetic */ int[] $recyclerViewRect$inlined;
            final /* synthetic */ int[] $visibleRect$inlined;
            final /* synthetic */ s this$0;

            static {
                Covode.recordClassIndex(53435);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar, s sVar, int[] iArr, RecyclerView recyclerView, int[] iArr2) {
                super(1);
                this.$paymentMethod = oVar;
                this.this$0 = sVar;
                this.$visibleRect$inlined = iArr;
                this.$recyclerView$inlined = recyclerView;
                this.$recyclerViewRect$inlined = iArr2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(PaymentState paymentState) {
                String str;
                PaymentState paymentState2 = paymentState;
                h.f.b.l.d(paymentState2, "");
                t e2 = this.this$0.f85400a.e();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = this.$paymentMethod;
                this.this$0.f85400a.b();
                int a2 = PaymentViewModel.a(this.$paymentMethod, paymentState2.getPaymentList());
                boolean a3 = hl.a(this.$paymentMethod.f85345l);
                this.this$0.f85400a.b();
                boolean a4 = PaymentViewModel.a(this.$paymentMethod);
                boolean a5 = hl.a(this.$paymentMethod.s);
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar = this.$paymentMethod.t;
                if (aVar != null) {
                    str = aVar.f85273b;
                } else {
                    str = null;
                }
                h.f.b.l.d(oVar, "");
                h.f.b.l.d("payment_type", "");
                if (!e2.f85428b.contains(h.f.b.l.a(oVar.f85334a, (Object) oVar.p))) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(e2.f85427a);
                    linkedHashMap.put("option_name", oVar.c());
                    linkedHashMap.put("is_option_discounted", Integer.valueOf(a3 ? 1 : 0));
                    linkedHashMap.put("rank", Integer.valueOf(a2));
                    linkedHashMap.put("option_type", "payment_type");
                    linkedHashMap.put("is_pay_saved", Integer.valueOf(a4 ? 1 : 0));
                    linkedHashMap.put("is_balance_shown", Integer.valueOf(a5 ? 1 : 0));
                    if (!(str == null || str.length() == 0)) {
                        linkedHashMap.put("option_unavailable_code", str);
                    }
                    com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_option_show", linkedHashMap);
                    e2.f85428b.add(h.f.b.l.a(oVar.f85334a, (Object) oVar.p));
                }
                return h.z.f158842a;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o paymentMethod;
            h.f.b.l.d(recyclerView, "");
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            recyclerView.getLocationOnScreen(iArr2);
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int k2 = linearLayoutManager.k();
            int m2 = linearLayoutManager.m();
            if (k2 <= m2) {
                while (true) {
                    View c2 = linearLayoutManager.c(k2);
                    if (!(c2 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d)) {
                        c2 = null;
                    }
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d dVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.d) c2;
                    if (!(dVar == null || (paymentMethod = dVar.getPaymentMethod()) == null)) {
                        dVar.getLocationOnScreen(iArr);
                        if ((recyclerView.getHeight() + iArr2[1]) - iArr[1] > 0) {
                            g gVar = this.f85400a;
                            gVar.withState(gVar.b(), new a(paymentMethod, this, iArr, recyclerView, iArr2));
                        }
                    }
                    if (k2 != m2) {
                        k2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f85403a = new w();

        static {
            Covode.recordClassIndex(53440);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            h.f.b.l.d(nVar, "");
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f85404a = new x();

        static {
            Covode.recordClassIndex(53441);
        }

        x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            h.f.b.l.d(nVar, "");
            return h.z.f158842a;
        }
    }

    static final class z extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f85406a = new z();

        static {
            Covode.recordClassIndex(53443);
        }

        z() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l lVar) {
            h.f.b.l.d(lVar, "");
            return h.z.f158842a;
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f85396a;

        static {
            Covode.recordClassIndex(53429);
        }

        o(g gVar) {
            this.f85396a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85396a.f85391j.invoke();
        }
    }

    public final void a(c cVar) {
        h.f.b.l.d(cVar, "");
        this.f85387b = cVar;
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f85395a;

        static {
            Covode.recordClassIndex(53428);
        }

        n(g gVar) {
            this.f85395a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85395a.b().a(false);
            androidx.fragment.app.e activity = this.f85395a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    public final void a(h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> bVar) {
        h.f.b.l.d(bVar, "");
        this.f85388c = bVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        Object obj;
        if (!(bundle == null || (string = bundle.getString("enter_params")) == null)) {
            try {
                obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(string, c.class);
            } catch (Exception unused) {
                obj = null;
            }
            c cVar = (c) obj;
            if (cVar != null) {
                this.f85387b = cVar;
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putString("enter_params", dg.a().b(this.f85387b));
    }

    static final class p extends h.f.b.m implements h.f.a.b<PaymentState, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            String str = "";
            h.f.b.l.d(paymentState2, str);
            TuxTextView tuxTextView = (TuxTextView) this.this$0.a(R.id.epr);
            h.f.b.l.b(tuxTextView, str);
            PaymentViewModel b2 = this.this$0.b();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o checkedPaymentMethod = paymentState2.getCheckedPaymentMethod();
            String str2 = this.this$0.f85387b.f85264e;
            if (str2 != null) {
                str = str2;
            }
            tuxTextView.setText(b2.a(checkedPaymentMethod, str));
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l lVar) {
            Long l2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l lVar2 = lVar;
            String str = "";
            h.f.b.l.d(lVar2, str);
            int i2 = h.f85407a[lVar2.ordinal()];
            if (i2 == 1) {
                this.this$0.e().a("next", this.this$0.f85393l, this.this$0.j());
                t e2 = this.this$0.e();
                e2.f85430d.put("select_region", Long.valueOf(SystemClock.elapsedRealtime()));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(e2.f85427a);
                Object obj = linkedHashMap.get("page_name");
                if (obj != 0) {
                    str = obj;
                }
                linkedHashMap.put("previous_page", str);
                linkedHashMap.put("page_name", "select_region");
                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_page", linkedHashMap);
            } else if (i2 == 2) {
                this.this$0.e().f85429c = SystemClock.elapsedRealtime();
                t e3 = this.this$0.e();
                Long l3 = e3.f85430d.get("select_region");
                if (l3 != null) {
                    l2 = Long.valueOf(SystemClock.elapsedRealtime() - l3.longValue());
                } else {
                    l2 = null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(e3.f85427a);
                Object obj2 = linkedHashMap2.get("page_name");
                if (obj2 != 0) {
                    str = obj2;
                }
                linkedHashMap2.put("previous_page", str);
                linkedHashMap2.put("page_name", "select_region");
                if (l2 != null) {
                    linkedHashMap2.put("stay_time", l2);
                }
                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_stay_page", linkedHashMap2);
            }
            this.this$0.f85389d.invoke(lVar2);
            return h.z.f158842a;
        }
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f85397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f85398b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f85399c;

        static {
            Covode.recordClassIndex(53432);
        }

        r(g gVar, Activity activity, String str) {
            this.f85397a = gVar;
            this.f85398b = activity;
            this.f85399c = str;
        }

        public final void onClick(View view) {
            List<? extends Object> list;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.ecommerce.util.n.a(this.f85398b);
            this.f85397a.b().a(true);
            g gVar = this.f85397a;
            String[] strArr = gVar.o;
            if (!(gVar.b().f85213g == null || (list = gVar.b().f85213g) == null)) {
                for (T t : list) {
                    if (t instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c) {
                        if (t.f85248a != null) {
                            strArr[0] = ",card_number";
                        } else {
                            strArr[0] = null;
                        }
                    } else if (t instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d) {
                        if (t.f85249a != null) {
                            strArr[1] = ",date";
                        } else {
                            strArr[1] = null;
                        }
                    } else if (t instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f) {
                        T t2 = t;
                        if (h.f.b.l.a((Object) t2.f85250b.f85293f, (Object) "cvv")) {
                            if (t2.f85252a != null) {
                                strArr[2] = ",code";
                            } else {
                                strArr[2] = null;
                            }
                        } else if (h.f.b.l.a((Object) t2.f85250b.f85293f, (Object) "holder_name")) {
                            if (t2.f85252a != null) {
                                strArr[3] = ",card_holder";
                            } else {
                                strArr[3] = null;
                            }
                        }
                    }
                }
            }
            g gVar2 = this.f85397a;
            gVar2.withState(gVar2.b(), new h.f.a.b<PaymentState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g.r.AnonymousClass1 */
                final /* synthetic */ r this$0;

                static {
                    Covode.recordClassIndex(53433);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(PaymentState paymentState) {
                    String str;
                    String str2;
                    PaymentState paymentState2 = paymentState;
                    h.f.b.l.d(paymentState2, "");
                    t e2 = this.this$0.f85397a.e();
                    String str3 = this.this$0.f85399c;
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o checkedPaymentMethod = paymentState2.getCheckedPaymentMethod();
                    if (checkedPaymentMethod != null) {
                        str = checkedPaymentMethod.c();
                    } else {
                        str = null;
                    }
                    if (this.this$0.f85397a.j()) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    String[] strArr = this.this$0.f85397a.o;
                    this.this$0.f85397a.b();
                    e2.a(str3, str, str2, strArr, Boolean.valueOf(PaymentViewModel.a(paymentState2.getCheckedPaymentMethod())));
                    return h.z.f158842a;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r rVar;
        Object obj;
        boolean z2;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> paymentElements;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> list;
        T t2;
        T t3;
        T t4;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m copy$default;
        boolean z3;
        int i2;
        String str;
        String str2;
        String str3;
        super.onActivityCreated(bundle);
        PaymentViewModel b2 = b();
        EventCenter.a().a("ec_payment_method_activate_clicked", b2);
        EventCenter.a().a("ec_resend_pay_request", b2);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            PaymentViewModel b3 = b();
            c cVar = this.f85387b;
            h.f.b.l.d(cVar, "");
            b3.f85209c = cVar.f85268i;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar = cVar.f85266g;
            if (!(nVar == null || (rVar = cVar.f85263d) == null)) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = cVar.f85266g.f85329b;
                if (oVar == null) {
                    oVar = rVar.a();
                }
                ArrayList arrayList = new ArrayList();
                Collection collection = rVar.f85351c;
                if (collection == null) {
                    collection = h.a.z.INSTANCE;
                }
                arrayList.addAll(collection);
                Collection collection2 = rVar.f85349a;
                if (collection2 == null) {
                    collection2 = h.a.z.INSTANCE;
                }
                arrayList.addAll(collection2);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o) obj;
                    if (!com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.l.a(oVar2, oVar)) {
                        if (oVar2.a(oVar)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar3 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o) obj;
                if (oVar3 != null) {
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p pVar = nVar.f85328a;
                    Boolean bool = nVar.f85330c;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    } else {
                        z2 = true;
                    }
                    b3.f85211e = z2;
                    if (!(pVar == null || (paymentElements = pVar.getPaymentElements()) == null || paymentElements.isEmpty())) {
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar4 = nVar.f85329b;
                        if (oVar4 != null) {
                            list = oVar4.a();
                        } else {
                            list = null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (list != null) {
                            for (T t5 : list) {
                                String str4 = t5.f85288a;
                                if (str4 != null) {
                                    List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e> a2 = t5.a();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (T t6 : a2) {
                                        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> paymentElements2 = pVar.getPaymentElements();
                                        if (paymentElements2 != null) {
                                            Iterator<T> it2 = paymentElements2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    t4 = null;
                                                    break;
                                                }
                                                t4 = it2.next();
                                                if (h.f.b.l.a((Object) t6.f85288a, (Object) t4.getElement())) {
                                                    break;
                                                }
                                            }
                                            T t7 = t4;
                                            if (t7 != null) {
                                                if (h.f.b.l.a((Object) t7.getElement(), (Object) "eg_ccdc_global_billing_address_country_regin")) {
                                                    copy$default = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m.copy$default(t7, null, null, h.f.b.l.a(t7.getParamValue(), (Object) ("," + nVar.f85332e + ',' + nVar.f85333f)), null, null, 27, null);
                                                } else {
                                                    copy$default = com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m.copy$default(t7, null, null, null, null, null, 31, null);
                                                }
                                                if (copy$default != null) {
                                                    arrayList2.add(copy$default);
                                                }
                                            }
                                        }
                                    }
                                    linkedHashMap.put(str4, arrayList2);
                                }
                            }
                        }
                        linkedHashMap.put("save_element", h.a.n.a(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m("save_element", "save_element", String.valueOf(h.f.b.l.a((Object) pVar.isChooseSave(), (Object) true)), null, null, 24, null)));
                        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> paymentElements3 = pVar.getPaymentElements();
                        if (paymentElements3 != null) {
                            Iterator<T> it3 = paymentElements3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    t2 = null;
                                    break;
                                }
                                t2 = it3.next();
                                if (h.f.b.l.a((Object) "card_id_element", (Object) t2.getElement())) {
                                    break;
                                }
                            }
                        } else {
                            t2 = null;
                        }
                        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> paymentElements4 = pVar.getPaymentElements();
                        if (paymentElements4 != null) {
                            Iterator<T> it4 = paymentElements4.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    t3 = null;
                                    break;
                                }
                                t3 = it4.next();
                                if (h.f.b.l.a((Object) "card_token_element", (Object) t3.getElement())) {
                                    break;
                                }
                            }
                        } else {
                            t3 = null;
                        }
                        if (!(t2 == null || t3 == null)) {
                            linkedHashMap.put("card_type_element", h.a.n.b(t2, t3));
                        }
                        b3.f85212f.put(h.f.b.l.a(oVar3.f85334a, (Object) oVar3.p), linkedHashMap);
                    }
                }
            }
            b().f85210d = e();
            h.f.b.l.b(activity, "");
            RecyclerView recyclerView = (RecyclerView) a(R.id.djj);
            h.f.b.l.b(recyclerView, "");
            recyclerView.setAdapter(c());
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.djj);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) a(R.id.djj)).b(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b(androidx.core.content.b.c(activity, R.color.b6)));
            ((RecyclerView) a(R.id.aub)).b(new com.ss.android.ugc.aweme.ecommerce.address.edit.a.c((int) com.bytedance.common.utility.n.b(getActivity(), 12.0f), (int) com.bytedance.common.utility.n.b(getActivity(), 16.0f)));
            if (this.f85387b.f85265f) {
                NormalTitleBar normalTitleBar = (NormalTitleBar) a(R.id.elv);
                h.f.b.l.b(normalTitleBar, "");
                ImageView startBtn = normalTitleBar.getStartBtn();
                h.f.b.l.b(startBtn, "");
                startBtn.setVisibility(8);
            } else {
                NormalTitleBar normalTitleBar2 = (NormalTitleBar) a(R.id.elv);
                h.f.b.l.b(normalTitleBar2, "");
                ImageView endBtn = normalTitleBar2.getEndBtn();
                h.f.b.l.b(endBtn, "");
                endBtn.setVisibility(8);
            }
            NormalTitleBar normalTitleBar3 = (NormalTitleBar) a(R.id.elv);
            h.f.b.l.b(normalTitleBar3, "");
            normalTitleBar3.getStartBtn().setOnClickListener(new n(this));
            NormalTitleBar normalTitleBar4 = (NormalTitleBar) a(R.id.elv);
            h.f.b.l.b(normalTitleBar4, "");
            normalTitleBar4.getEndBtn().setOnClickListener(new o(this));
            Integer num = this.f85387b.f85260a;
            Integer num2 = this.f85387b.f85261b;
            if (num == null || num2 == null) {
                z3 = false;
            } else {
                ((PageStepper) a(R.id.ea6)).setTotalStep(num2.intValue());
                ((PageStepper) a(R.id.ea6)).setLightStep(num.intValue());
                PageStepper pageStepper = (PageStepper) a(R.id.ea6);
                h.f.b.l.b(pageStepper, "");
                z3 = false;
                pageStepper.setVisibility(0);
            }
            Integer num3 = this.f85387b.f85262c;
            int ordinal = c.a.NEXT.ordinal();
            if (num3 != null && num3.intValue() == ordinal) {
                i2 = R.string.bir;
            } else {
                int ordinal2 = c.a.CONTINUE.ordinal();
                if (num3 != null && num3.intValue() == ordinal2) {
                    i2 = R.string.biq;
                } else {
                    i2 = R.string.bis;
                }
            }
            TuxButton tuxButton = (TuxButton) a(R.id.ux);
            h.f.b.l.b(tuxButton, "");
            Context context = getContext();
            if (context != null) {
                str = context.getString(i2);
            } else {
                str = null;
            }
            tuxButton.setText(str);
            Integer num4 = this.f85387b.f85262c;
            int ordinal3 = c.a.NEXT.ordinal();
            if (num4 != null && num4.intValue() == ordinal3) {
                str2 = "next";
            } else {
                int ordinal4 = c.a.PAY_NOW.ordinal();
                if (num4 != null && num4.intValue() == ordinal4) {
                    str2 = "pay_now";
                } else {
                    int ordinal5 = c.a.CONTINUE.ordinal();
                    if (num4 != null && num4.intValue() == ordinal5) {
                        str2 = "continue";
                    } else {
                        str2 = "";
                    }
                }
            }
            t e2 = e();
            h.f.b.l.d(str2, "");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(e2.f85427a);
            linkedHashMap2.put("button_name", str2);
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_show", linkedHashMap2);
            String str5 = this.f85387b.f85264e;
            if (str5 == null || str5.length() == 0) {
                z3 = true;
            }
            if (z3) {
                View a3 = a(R.id.an5);
                h.f.b.l.b(a3, "");
                a3.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) a(R.id.eps);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.epr);
                h.f.b.l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) a(R.id.eps);
                h.f.b.l.b(tuxTextView3, "");
                StringBuilder sb = new StringBuilder();
                Context context2 = getContext();
                if (context2 != null) {
                    str3 = context2.getString(R.string.fxu);
                } else {
                    str3 = null;
                }
                tuxTextView3.setText(sb.append(str3).append(':').toString());
                withState(b(), new p(this));
            }
            PaymentViewModel b4 = b();
            q qVar = new q(this);
            h.f.b.l.d(qVar, "");
            b4.f85207a = qVar;
            b().f85208b = this.f85387b.f85269j;
            ((TuxButton) a(R.id.ux)).setOnClickListener(new r(this, activity, str2));
            ((RecyclerView) a(R.id.djj)).a(new s(this));
            f.a.b.b unused = selectSubscribe(b(), i.f85408a, new ah(), new j(this, activity));
            f.a.b.b unused2 = selectSubscribe(b(), n.f85413a, new ah(), new k(this));
            f.a.b.b unused3 = selectSubscribe(b(), o.f85414a, new ah(), new l(this));
            f.a.b.b unused4 = selectSubscribe(b(), p.f85415a, new ah(), new m(this));
            f.a.b.b unused5 = selectSubscribe(b(), q.f85416a, new ah(), new e(this));
            f.a.b.b unused6 = selectSubscribe(b(), j.f85409a, new ah(), new f(this));
            f.a.b.b unused7 = selectSubscribe(b(), k.f85410a, new ah(), new C2042g(this));
            f.a.b.b unused8 = selectSubscribe(b(), l.f85411a, new ah(), new h(this));
            f.a.b.b unused9 = selectSubscribe(b(), m.f85412a, new ah(), new i(this));
        }
        View view = getView();
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            window = activity2.getWindow();
        } else {
            window = null;
        }
        if (!(view == null || window == null)) {
            androidx.lifecycle.i lifecycle = getLifecycle();
            h.f.b.l.b(lifecycle, "");
            new KeyBoardVisibilityUtil(lifecycle, window, view, null, new u(view, this));
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Object, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Object obj) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            iVar2.withState(this.this$0.b(), new h.f.a.b<PaymentState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(53419);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(PaymentState paymentState) {
                    String str;
                    String str2;
                    PaymentState paymentState2 = paymentState;
                    h.f.b.l.d(paymentState2, "");
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n paymentInfoForNextStep = paymentState2.getPaymentInfoForNextStep();
                    if (paymentInfoForNextStep != null) {
                        this.this$0.this$0.f85388c.invoke(paymentInfoForNextStep);
                        g gVar = this.this$0.this$0;
                        Integer num = this.this$0.this$0.f85387b.f85262c;
                        int ordinal = c.a.NEXT.ordinal();
                        if (num != null && num.intValue() == ordinal) {
                            str = "next";
                        } else {
                            str = "return";
                        }
                        gVar.f85394m = str;
                        Integer num2 = this.this$0.this$0.f85387b.f85262c;
                        int ordinal2 = c.a.PAY_NOW.ordinal();
                        if (num2 != null && num2.intValue() == ordinal2) {
                            t e2 = this.this$0.this$0.e();
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = paymentInfoForNextStep.f85329b;
                            if (oVar != null) {
                                str2 = oVar.c();
                            } else {
                                str2 = null;
                            }
                            this.this$0.this$0.b();
                            e2.a(str2, PaymentViewModel.a(paymentInfoForNextStep.f85329b));
                        }
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.f85392k.invoke();
            }
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            List<? extends Object> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            this.this$0.c().a(list2);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f85387b.f85265f) {
            new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.a(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g$g  reason: collision with other inner class name */
    static final class C2042g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2042g(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            h.f.b.l.d(iVar, "");
            if (nVar != null) {
                this.this$0.f85390e.invoke(nVar);
                this.this$0.f85394m = "return";
                this.this$0.n = true;
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                com.ss.android.ugc.aweme.views.i i2 = this.this$0.i();
                i2.setCanceledOnTouchOutside(true);
                i2.show();
            } else {
                try {
                    this.this$0.i().dismiss();
                } catch (Exception e2) {
                    com.bytedance.services.apm.api.a.a((Throwable) e2);
                }
            }
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            Context context;
            h.f.b.l.d(iVar, "");
            if (str != null) {
                Context context2 = this.this$0.getContext();
                if (context2 != null) {
                    context = context2.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && context == null) {
                        context = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                } else {
                    context = null;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.fwt).a();
            }
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<Boolean, Integer, h.z> {
        final /* synthetic */ View $view;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(View view, g gVar) {
            super(2);
            this.$view = view;
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            if (booleanValue) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.this$0.a(R.id.v5);
                h.f.b.l.b(constraintLayout, "");
                constraintLayout.setVisibility(8);
            } else {
                this.this$0.b().b(false);
                this.$view.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g.u.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ u f85401a;

                    static {
                        Covode.recordClassIndex(53438);
                    }

                    {
                        this.f85401a = r1;
                    }

                    public final void run() {
                        ConstraintLayout constraintLayout = (ConstraintLayout) this.f85401a.this$0.a(R.id.v5);
                        h.f.b.l.b(constraintLayout, "");
                        constraintLayout.setVisibility(0);
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            String str;
            String str2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar2 = nVar;
            h.f.b.l.d(iVar, "");
            if (nVar2 != null) {
                this.this$0.f85388c.invoke(nVar2);
                g gVar = this.this$0;
                Integer num = gVar.f85387b.f85262c;
                int ordinal = c.a.NEXT.ordinal();
                if (num != null && num.intValue() == ordinal) {
                    str = "next";
                } else {
                    str = "return";
                }
                gVar.f85394m = str;
                Integer num2 = this.this$0.f85387b.f85262c;
                int ordinal2 = c.a.PAY_NOW.ordinal();
                if (num2 != null && num2.intValue() == ordinal2) {
                    t e2 = this.this$0.e();
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar = nVar2.f85329b;
                    if (oVar != null) {
                        str2 = oVar.c();
                    } else {
                        str2 = null;
                    }
                    this.this$0.b();
                    e2.a(str2, PaymentViewModel.a(nVar2.f85329b));
                }
            }
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            int i2 = 8;
            if (booleanValue) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.this$0.a(R.id.v5);
                h.f.b.l.b(constraintLayout, "");
                constraintLayout.setVisibility(8);
                EditText editText = (EditText) ((FixedRecyclerView) this.this$0.a(R.id.djj)).findViewWithTag(Integer.valueOf(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.f.Email.ordinal()));
                if (editText != null) {
                    RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.aub);
                    h.f.b.l.b(recyclerView, "");
                    b.c.a(recyclerView, editText);
                }
            }
            RecyclerView recyclerView2 = (RecyclerView) this.this$0.a(R.id.aub);
            h.f.b.l.b(recyclerView2, "");
            if (booleanValue) {
                i2 = 0;
            }
            recyclerView2.setVisibility(i2);
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, h.z> {
        final /* synthetic */ Activity $act;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar, Activity activity) {
            super(2);
            this.this$0 = gVar;
            this.$act = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar) {
            boolean z;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.c cVar;
            String str;
            String str2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar;
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 = oVar;
            String str3 = "";
            h.f.b.l.d(iVar2, str3);
            this.this$0.f85393l = oVar2;
            com.ss.android.ugc.aweme.ecommerce.util.n.a(this.$act);
            TuxButton tuxButton = (TuxButton) this.this$0.a(R.id.ux);
            h.f.b.l.b(tuxButton, str3);
            if (oVar2 != null) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar3 = this.this$0.f85393l;
            if (!(oVar3 == null || (aVar = oVar3.t) == null || !h.f.b.l.a((Object) false, (Object) aVar.f85272a))) {
                TuxButton tuxButton2 = (TuxButton) this.this$0.a(R.id.ux);
                h.f.b.l.b(tuxButton2, str3);
                tuxButton2.setEnabled(false);
            }
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar4 = this.this$0.f85393l;
            if (!(oVar4 == null || (cVar = oVar4.u) == null || (str = cVar.f85281a) == null || !hl.a(str))) {
                TuxButton tuxButton3 = (TuxButton) this.this$0.a(R.id.ux);
                h.f.b.l.b(tuxButton3, str3);
                tuxButton3.setEnabled(false);
                PaymentViewModel b2 = this.this$0.b();
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar5 = this.this$0.f85393l;
                if (!(oVar5 == null || (str2 = oVar5.f85334a) == null || str2.length() == 0)) {
                    bz unused = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new PaymentViewModel.h(b2, h.a.n.d(new BindInfoReqInfo(str2)), null), 2);
                }
            }
            TuxTextView tuxTextView = (TuxTextView) this.this$0.a(R.id.epr);
            h.f.b.l.b(tuxTextView, str3);
            PaymentViewModel b3 = this.this$0.b();
            String str4 = this.this$0.f85387b.f85264e;
            if (str4 != null) {
                str3 = str4;
            }
            tuxTextView.setText(b3.a(oVar2, str3));
            if (oVar2 != null) {
                iVar2.withState(this.this$0.b(), new h.f.a.b<PaymentState, h.z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g.j.AnonymousClass1 */
                    final /* synthetic */ j this$0;

                    static {
                        Covode.recordClassIndex(53424);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(PaymentState paymentState) {
                        String str;
                        PaymentState paymentState2 = paymentState;
                        h.f.b.l.d(paymentState2, "");
                        if (this.this$0.this$0.p == null) {
                            this.this$0.this$0.p = oVar2.c();
                        }
                        t e2 = this.this$0.this$0.e();
                        String c2 = oVar2.c();
                        boolean a2 = hl.a(oVar2.f85345l);
                        this.this$0.this$0.b();
                        int a3 = PaymentViewModel.a(oVar2, paymentState2.getPaymentList());
                        String str2 = this.this$0.this$0.p;
                        this.this$0.this$0.b();
                        boolean a4 = PaymentViewModel.a(oVar2);
                        boolean a5 = hl.a(oVar2.s);
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a aVar = oVar2.t;
                        if (aVar != null) {
                            str = aVar.f85273b;
                        } else {
                            str = null;
                        }
                        h.f.b.l.d(c2, "");
                        h.f.b.l.d("payment_type", "");
                        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_select_option", e2.f85427a, new t.f(c2, a2, a3, "payment_type", str2, a4, a5, str));
                        return h.z.f158842a;
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.m<PaymentState, Bundle, PaymentState> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(53412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState, Bundle bundle) {
            boolean z;
            boolean z2;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h hVar;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar;
            Object obj;
            ArrayList arrayList;
            h.f.b.l.d(paymentState, "");
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r rVar = this.this$0.f85387b.f85263d;
            if (rVar != null) {
                y.a(rVar);
            }
            c cVar = this.this$0.f85387b;
            h.f.b.l.d(cVar, "");
            ArrayList arrayList2 = new ArrayList();
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r rVar2 = cVar.f85263d;
            if (rVar2 == null) {
                return new PaymentState(null, arrayList2, cVar.f85266g, null, false, null, null, false, false, null, 1017, null);
            }
            PaymentViewModel.a.a(h.a.z.INSTANCE);
            Collection<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> collection = rVar2.f85349a;
            if (collection == null) {
                collection = h.a.z.INSTANCE;
            }
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list = rVar2.f85351c;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (rVar2.f85354f == null || rVar2.f85351c.size() <= rVar2.f85354f.intValue()) {
                    List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list2 = rVar2.f85351c;
                    ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h(it.next()));
                    }
                    arrayList = arrayList3;
                } else {
                    aa aaVar = new aa(rVar2.f85351c.subList(rVar2.f85354f.intValue(), rVar2.f85351c.size()));
                    List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> subList = rVar2.f85351c.subList(0, rVar2.f85354f.intValue());
                    ArrayList arrayList4 = new ArrayList(h.a.n.a((Iterable) subList, 10));
                    Iterator<T> it2 = subList.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h(it2.next()));
                    }
                    arrayList = h.a.n.g((Collection) arrayList4);
                    arrayList.add(aaVar);
                }
                PaymentViewModel.a.a(arrayList);
            }
            if (!(!PaymentViewModel.f85206m.isEmpty()) || !(!collection.isEmpty())) {
                z2 = false;
            } else {
                z2 = true;
                arrayList2.add(new a(R.string.bj1));
            }
            arrayList2.addAll(PaymentViewModel.f85206m);
            if (z2) {
                arrayList2.add(new a(R.string.biy));
            }
            ArrayList arrayList5 = new ArrayList(h.a.n.a(collection, 10));
            for (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar2 : collection) {
                arrayList5.add(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h(oVar2));
            }
            arrayList2.addAll(arrayList5);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.q qVar = rVar2.f85353e;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar3 = null;
            if (!(qVar == null || qVar.f85347a == null)) {
                arrayList2.add(rVar2.f85353e);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList2) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h hVar2 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) (!(obj2 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) ? null : obj2);
                if (hVar2 != null && !(!h.f.b.l.a((Object) hVar2.f85254a.f85344k, (Object) true))) {
                    String str = hVar2.f85254a.f85343j;
                    if (str == null) {
                        str = "";
                    }
                    if (!com.ss.android.ugc.aweme.ecommerce.util.m.a(str)) {
                    }
                }
                arrayList6.add(obj2);
            }
            List g2 = h.a.n.g((Collection) arrayList6);
            int i2 = 0;
            for (Object obj3 : g2) {
                if (obj3 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) {
                    ((com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) obj3).f85256c = i2;
                    i2++;
                }
                if (obj3 instanceof aa) {
                    i2 += ((aa) obj3).f85240b.size();
                }
            }
            List g3 = h.a.n.g((Collection) g2);
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar = cVar.f85266g;
            if ((nVar == null || (oVar = nVar.f85329b) == null) && (oVar = rVar2.a()) == null) {
                hVar = null;
            } else {
                Iterator it3 = g3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (obj instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) {
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h hVar3 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) obj;
                        if (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.l.a(hVar3.f85254a, oVar) || hVar3.f85254a.a(oVar)) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h)) {
                    obj = null;
                }
                hVar = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h) obj;
                if (hVar != null) {
                    PaymentViewModel.a.a(hVar, hVar.f85254a, g3);
                }
            }
            if (hVar != null) {
                oVar3 = hVar.f85254a;
            }
            return new PaymentState(oVar3, g3, cVar.f85266g, null, false, null, null, false, false, null, 1016, null);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> list;
        h.f.b.l.d(layoutInflater, "");
        t e2 = e();
        c cVar = this.f85387b;
        h.f.b.l.d(cVar, "");
        if (!e2.f85431e) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r rVar = cVar.f85263d;
            String str = null;
            if (rVar == null || (list = rVar.f85349a) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : list) {
                    T t3 = t2;
                    if ((t3 instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o) && t3 != null && !(!h.f.b.l.a((Object) t3.f85344k, (Object) true))) {
                        String str2 = t3.f85343j;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!com.ss.android.ugc.aweme.ecommerce.util.m.a(str2)) {
                        }
                    }
                    arrayList2.add(t2);
                }
                arrayList = arrayList2;
            }
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r rVar2 = cVar.f85263d;
            if (rVar2 != null) {
                ArrayList<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o> arrayList3 = new ArrayList();
                Collection collection = rVar2.f85351c;
                if (collection == null) {
                    collection = h.a.z.INSTANCE;
                }
                arrayList3.addAll(collection);
                if (arrayList == null) {
                    arrayList = h.a.z.INSTANCE;
                }
                arrayList3.addAll(arrayList);
                ArrayList arrayList4 = new ArrayList(h.a.n.a((Iterable) arrayList3, 10));
                for (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o oVar : arrayList3) {
                    arrayList4.add(oVar.c());
                }
                str = h.a.n.a(arrayList4, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, t.c.f85434a, 30);
            }
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_page", e2.f85427a, new t.b(str));
            e2.f85431e = true;
        }
        return com.a.a(layoutInflater, R.layout.pb, viewGroup, false);
    }
}
