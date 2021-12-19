package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.ah;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.widget.Widget;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSummaryPanel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.OrderSubmitBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.view.PageStepper;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.coupon.vm.CouponViewModel;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class j extends com.ss.android.ugc.aweme.base.arch.b implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final b f84878c = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public long f84879b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f84880d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f84881e = h.i.a((h.f.a.a) new c(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f84882j = h.i.a((h.f.a.a) new aa(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f84883k = h.i.a((h.f.a.a) new e(this));

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f84884l;

    static {
        Covode.recordClassIndex(53033);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.f84884l == null) {
            this.f84884l = new SparseArray();
        }
        View view = (View) this.f84884l.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f84884l.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.f84884l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final OrderSubmitViewModel b() {
        return (OrderSubmitViewModel) this.f84880d.getValue();
    }

    public final h c() {
        return (h) this.f84881e.getValue();
    }

    public final com.ss.android.ugc.aweme.views.i e() {
        return (com.ss.android.ugc.aweme.views.i) this.f84882j.getValue();
    }

    public final CouponViewModel g() {
        return (CouponViewModel) this.f84883k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(53042);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<h> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new h(this.this$0);
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.views.i> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.views.i invoke() {
            return new com.ss.android.ugc.aweme.views.i(this.this$0.requireContext());
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.b().a(false);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84786b = SystemClock.elapsedRealtime();
    }

    static final class e extends h.f.b.m implements h.f.a.a<CouponViewModel> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CouponViewModel invoke() {
            return new ad(this.this$0.requireActivity()).a(CouponViewModel.class);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            j jVar = this.this$0;
            jVar.withState(jVar.b(), AnonymousClass1.f84896a);
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a();
            OrderSubmitViewModel.a(this.this$0.b(), true, false, false, false, null, 62);
            return h.z.f158842a;
        }
    }

    static final class z extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a();
            OrderSubmitViewModel.a(this.this$0.b(), true, false, false, false, null, 62);
            return h.z.f158842a;
        }
    }

    public j() {
        h.k.c a2 = h.f.b.ab.a(OrderSubmitViewModel.class);
        this.f84880d = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84785a.clear();
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84786b = -1;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84790f = -1;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84791g = -1;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84792h = -1;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84793i = 0;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84787c = -1;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84788d = -1;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84789e = -1;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84794j = -1;
        OrderSubmitViewModel b2 = b();
        EventCenter.a().b("ec_payment_method_activate_clicked", b2);
        EventCenter.a().b("ec_osp_resend_order_create", b2);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ Fragment $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
                r4 = this;
                androidx.fragment.app.Fragment r0 = r4.$this_hostViewModel
                androidx.fragment.app.Fragment r3 = r0.getParentFragment()
                h.k.c r0 = r4.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
            L_0x0015:
                if (r3 == 0) goto L_0x0031
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r3, r0)     // Catch:{ as -> 0x002a }
                h.k.c r0 = r4.$viewModelClass     // Catch:{ as -> 0x002a }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)     // Catch:{ as -> 0x002a }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x002a }
                goto L_0x002f
            L_0x002a:
                androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0015
            L_0x002f:
                if (r0 != 0) goto L_0x0049
            L_0x0031:
                androidx.fragment.app.Fragment r0 = r4.$this_hostViewModel
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r4.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a
    public final boolean f() {
        if (b().q) {
            b().a(false);
            return true;
        }
        b().a("return");
        if (b().K.size() != 3) {
            if (b().u) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("quit_checkout", (String) null, 6);
                a(getActivity(), false);
            } else if (b().D) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("quit_checkout", (String) null, 6);
                a(getActivity(), true);
            }
            return true;
        }
        if (b().K.size() != 2) {
            return false;
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        return true;
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (ActivityStack.isAppBackGround()) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84789e += SystemClock.elapsedRealtime() - com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84788d;
            OrderSubmitViewModel b2 = b();
            b2.b_(new OrderSubmitViewModel.c(b2));
        }
        OrderSubmitViewModel b3 = b();
        if (b3.H) {
            OrderSubmitViewModel.a(b3, false, false, false, false, null, 63);
            b3.H = false;
        }
        if (b().y) {
            b().y = false;
            b().l();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84788d = SystemClock.elapsedRealtime();
            b().a("close");
        }
        if (!com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.c.f85536d) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(b().p, b().r, Boolean.valueOf(b().B), Boolean.valueOf(b().C), b().j(), (Long) null, (String) null, (String) null, 480);
        }
        if (b().y) {
            OrderSubmitViewModel b2 = b();
            EventCenter.a().a("ec_address_select", b2);
            EventCenter.a().a("ec_address_change", b2);
        }
    }

    public static final class d extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f84887a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f84888b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f84889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f84890d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f84891e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f84892f;

        static {
            Covode.recordClassIndex(53044);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f84892f.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i2, Context context, int i3, int i4, h.f.a.a aVar) {
            super(700);
            this.f84888b = i2;
            this.f84889c = context;
            this.f84890d = i3;
            this.f84891e = i4;
            this.f84892f = aVar;
        }
    }

    static final class s<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f84894a;

        static {
            Covode.recordClassIndex(53069);
        }

        s(j jVar) {
            this.f84894a = jVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f84894a.b().a((Voucher) obj);
        }
    }

    static final class w implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f84897a;

        static {
            Covode.recordClassIndex(53075);
        }

        w(j jVar) {
            this.f84897a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84897a.b().a(false);
        }
    }

    static final class x implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f84898a;

        static {
            Covode.recordClassIndex(53076);
        }

        x(j jVar) {
            this.f84898a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84898a.b().a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ab extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(j jVar, Context context) {
            super(1);
            this.this$0 = jVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.getString(R.string.fxo);
            h.f.b.l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.ab.AnonymousClass1 */
                final /* synthetic */ ab this$0;

                static {
                    Covode.recordClassIndex(53037);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    if (this.this$0.this$0.b().o != null) {
                        this.this$0.this$0.b().b();
                        Context context = this.this$0.$context;
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.o oVar = this.this$0.this$0.b().o;
                        AnonymousClass1 r4 = new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.ab.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(53038);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.ab.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f84885a;

                                    static {
                                        Covode.recordClassIndex(53039);
                                    }

                                    {
                                        this.f84885a = r1;
                                    }

                                    public final void run() {
                                        androidx.fragment.app.e activity = this.f84885a.this$0.this$0.this$0.getActivity();
                                        if (activity != null) {
                                            activity.finish();
                                        }
                                    }
                                }, 450);
                                return h.z.f158842a;
                            }
                        };
                        AnonymousClass2 r5 = new h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t, h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.ab.AnonymousClass1.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(53040);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t tVar) {
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t tVar2 = tVar;
                                h.f.b.l.d(tVar2, "");
                                this.this$0.this$0.this$0.b().a(tVar2);
                                return h.z.f158842a;
                            }
                        };
                        HashMap<String, Object> j2 = this.this$0.this$0.b().j();
                        j2.put("previous_page", "order_submit");
                        new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b(context, oVar, r4, r5, j2).a();
                    } else {
                        androidx.fragment.app.e activity = this.this$0.this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("quit_checkout", "quit", (String) null, 12);
                    return h.z.f158842a;
                }
            });
            String string2 = this.this$0.getString(R.string.fxn);
            h.f.b.l.b(string2, "");
            bVar2.b(string2, AnonymousClass2.f84886a);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a aVar;
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(b().F);
        LinkedHashMap<String, Object> linkedHashMap = com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84785a;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84787c = SystemClock.elapsedRealtime();
        OrderSubmitViewModel b2 = b();
        if (b2.K.size() != 1 || (b2.f84735k == null && ((aVar = b2.J) == null || aVar.f84911d == null))) {
            b2.c(OrderSubmitViewModel.f.f84742a);
            OrderSubmitViewModel.a(b2, false, false, false, false, null, 63);
        } else if (b2.f84735k != null) {
            BillInfoData billInfoData = b2.f84735k;
            if (billInfoData == null) {
                h.f.b.l.b();
            }
            b2.a(billInfoData, new BillInfoRequest(null, 0, null, false, false, false, false, null, null, null, false, null, null, null, null, 32767, null));
        } else {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a aVar2 = b2.J;
            if (aVar2 != null && aVar2.f84911d != null) {
                b2.c(OrderSubmitViewModel.d.f84740a);
                bz unused = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new OrderSubmitViewModel.e(b2, null), 2);
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(j jVar) {
            super(2);
            this.this$0 = jVar;
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

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j jVar) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j jVar2 = jVar;
            h.f.b.l.d(iVar, "");
            if (jVar2 != null) {
                ((OrderSummaryPanel) this.this$0.a(R.id.eet)).setBillSummaryData(jVar2);
            }
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            ((RecyclerView) this.this$0.a(R.id.djs)).a(0, intValue);
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Object, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Object obj) {
            h.f.b.l.d(iVar, "");
            if (obj != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.getContext()).a(R.string.de8).a();
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j$j  reason: collision with other inner class name */
    static final class C2032j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Object, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2032j(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Object obj) {
            h.f.b.l.d(iVar, "");
            if (obj != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.getContext()).a(R.string.fwt).a();
            }
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Object, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Object obj) {
            h.f.b.l.d(iVar, "");
            if (obj != null) {
                this.this$0.b().b(this.this$0.getContext());
            }
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, VoucherInfo, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, VoucherInfo voucherInfo) {
            h.f.b.l.d(iVar, "");
            this.this$0.g().a(voucherInfo);
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            num.intValue();
            h.f.b.l.d(iVar, "");
            CouponViewModel g2 = this.this$0.g();
            g2.a(g2.f85775a);
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                j jVar = this.this$0;
                c.a.a(jVar, jVar.getView()).a(R.id.ve, (Widget) new OrderSubmitBottomWidget(), true);
            }
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<Boolean, Integer, h.z> {
        final /* synthetic */ View $view;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(View view, j jVar) {
            super(2);
            this.$view = view;
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            this.this$0.b().D = true;
            if (booleanValue) {
                FrameLayout frameLayout = (FrameLayout) this.this$0.a(R.id.ve);
                h.f.b.l.b(frameLayout, "");
                frameLayout.setVisibility(8);
            } else {
                this.$view.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.t.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ t f84895a;

                    static {
                        Covode.recordClassIndex(53071);
                    }

                    {
                        this.f84895a = r1;
                    }

                    public final void run() {
                        FrameLayout frameLayout = (FrameLayout) this.f84895a.this$0.a(R.id.ve);
                        h.f.b.l.b(frameLayout, "");
                        frameLayout.setVisibility(0);
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    private final void a(Context context, boolean z2) {
        if (context != null) {
            com.bytedance.tux.dialog.b a2 = a.C1094a.a(context);
            if (z2) {
                a2.b(R.string.bha);
            } else {
                a2.b(R.string.bhb);
            }
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a2.a(R.string.fxr), new ab(this, context)).a(false)).a().b().show();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (!booleanValue) {
                try {
                    this.this$0.e().dismiss();
                } catch (Exception e2) {
                    com.bytedance.services.apm.api.a.a((Throwable) e2);
                }
            } else if (this.this$0.b().s) {
                com.ss.android.ugc.aweme.views.i e3 = this.this$0.e();
                e3.setCanceledOnTouchOutside(true);
                Window window = e3.getWindow();
                if (window != null) {
                    window.setFlags(8, 8);
                }
                e3.show();
            } else {
                com.ss.android.ugc.aweme.views.i e4 = this.this$0.e();
                e4.setCanceledOnTouchOutside(false);
                Window window2 = e4.getWindow();
                if (window2 != null) {
                    window2.clearFlags(8);
                }
                e4.show();
            }
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            int intValue = num.intValue();
            h.f.b.l.d(iVar2, "");
            if (intValue == 1) {
                iVar2.withState(this.this$0.b(), new h.f.a.b<OrderSubmitState, h.z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass2 */
                    final /* synthetic */ m this$0;

                    static {
                        Covode.recordClassIndex(53057);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(OrderSubmitState orderSubmitState) {
                        OrderSubmitState orderSubmitState2 = orderSubmitState;
                        h.f.b.l.d(orderSubmitState2, "");
                        Context requireContext = this.this$0.this$0.requireContext();
                        h.f.b.l.b(requireContext, "");
                        d.a(requireContext, this.this$0.this$0.b().f84737m, this.this$0.this$0.b().f84736l, orderSubmitState2.getLoadSuccess(), new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass2.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(53058);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                this.this$0.this$0.this$0.b().a(3);
                                return h.z.f158842a;
                            }
                        }, new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass2.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(53059);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                this.this$0.this$0.this$0.requireActivity().finish();
                                return h.z.f158842a;
                            }
                        }, new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass2.AnonymousClass3 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(53060);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                String str = this.this$0.this$0.this$0.b().v;
                                int hashCode = str.hashCode();
                                if (hashCode != -557572305) {
                                    if (hashCode == 1874714187 && str.equals("create_order")) {
                                        this.this$0.this$0.this$0.b().b(this.this$0.this$0.this$0.getContext());
                                    }
                                } else if (str.equals("query_bill_info")) {
                                    OrderSubmitViewModel.a(this.this$0.this$0.this$0.b(), false, false, false, false, null, 63);
                                }
                                return h.z.f158842a;
                            }
                        }, new h.f.a.b<FetchInfo, h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass2.AnonymousClass4 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(53061);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ h.z invoke(FetchInfo fetchInfo) {
                                Integer fetchAPI;
                                OrderShopDigest orderShopDigest;
                                List<OrderSKUDTO> orderSKUs;
                                OrderSKUDTO orderSKUDTO;
                                String str;
                                FetchInfo fetchInfo2 = fetchInfo;
                                OrderSubmitViewModel b2 = this.this$0.this$0.this$0.b();
                                String str2 = null;
                                if (fetchInfo2 != null) {
                                    str2 = fetchInfo2.getServerIssuedParams();
                                }
                                b2.N = str2;
                                if (!(fetchInfo2 == null || (fetchAPI = fetchInfo2.getFetchAPI()) == null)) {
                                    if (fetchAPI.intValue() == 1) {
                                        this.this$0.this$0.this$0.b().b(this.this$0.this$0.this$0.getContext());
                                    } else if (fetchAPI.intValue() == 2) {
                                        OrderSubmitViewModel.a(this.this$0.this$0.this$0.b(), false, false, false, false, null, 63);
                                        List<OrderShopDigest> list = this.this$0.this$0.this$0.b().f84730c;
                                        if (!(list == null || (orderShopDigest = (OrderShopDigest) h.a.n.h((List) list)) == null || (orderSKUs = orderShopDigest.getOrderSKUs()) == null || (orderSKUDTO = (OrderSKUDTO) h.a.n.h((List) orderSKUs)) == null || (str = orderSKUDTO.f85906a) == null)) {
                                            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.pdp.b.v(str));
                                        }
                                    }
                                    return h.z.f158842a;
                                }
                                OrderSubmitViewModel.a(this.this$0.this$0.this$0.b(), false, false, false, false, null, 63);
                                return h.z.f158842a;
                            }
                        }, new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass2.AnonymousClass5 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(53062);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                Context context = this.this$0.this$0.this$0.getContext();
                                if (context != null) {
                                    OrderSubmitViewModel b2 = this.this$0.this$0.this$0.b();
                                    h.f.b.l.b(context, "");
                                    b2.a(context, true);
                                }
                                return h.z.f158842a;
                            }
                        }, new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass2.AnonymousClass6 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(53063);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                RedirectContent redirectContent;
                                ExceptionUX exceptionUX = this.this$0.this$0.this$0.b().f84736l;
                                if (!(exceptionUX == null || (redirectContent = exceptionUX.getRedirectContent()) == null)) {
                                    String jumpSchema = redirectContent.getJumpSchema();
                                    if (jumpSchema != null) {
                                        Uri.Builder buildUpon = Uri.parse(jumpSchema).buildUpon();
                                        buildUpon.appendQueryParameter("source", "ordersubmit");
                                        HashMap hashMap = new HashMap();
                                        HashMap<String, Object> hashMap2 = this.this$0.this$0.this$0.b().F;
                                        if (hashMap2 != null) {
                                            hashMap.putAll(hashMap2);
                                        }
                                        hashMap.put("previous_page", "order_submit");
                                        hashMap.putAll(this.this$0.this$0.this$0.b().j());
                                        buildUpon.appendQueryParameter("trackParams", dg.a().b(hashMap));
                                        SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), buildUpon.toString()).open();
                                    }
                                    if (h.f.b.l.a((Object) redirectContent.getClosePage(), (Object) true)) {
                                        this.this$0.this$0.this$0.requireActivity().finish();
                                    }
                                }
                                return h.z.f158842a;
                            }
                        });
                        return h.z.f158842a;
                    }
                });
            } else if (intValue == 3) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("add_address_for_location", (String) null, 6);
                Context requireContext = this.this$0.requireContext();
                h.f.b.l.b(requireContext, "");
                ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a.C1094a.a(requireContext).b(R.string.fx2), new h.f.a.b<com.bytedance.tux.dialog.b.b, h.z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass1 */
                    final /* synthetic */ m this$0;

                    static {
                        Covode.recordClassIndex(53054);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        h.f.b.l.d(bVar2, "");
                        String string = this.this$0.this$0.requireContext().getString(R.string.fx0);
                        h.f.b.l.b(string, "");
                        bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.j.m.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(53055);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("add_address_for_location", "enter", (String) null, 12);
                                this.this$0.this$0.this$0.b().a(this.this$0.this$0.this$0.requireContext());
                                return h.z.f158842a;
                            }
                        });
                        String string2 = this.this$0.this$0.requireContext().getString(R.string.fx1);
                        h.f.b.l.b(string2, "");
                        bVar2.b(string2, AnonymousClass2.f84893a);
                        return h.z.f158842a;
                    }
                }).a(false)).a().b().show();
            } else if (intValue == 4) {
                this.this$0.requireActivity().finish();
            }
            this.this$0.b().b(0);
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            if (intValue == -1 || intValue == 0) {
                TuxNavBar tuxNavBar = (TuxNavBar) this.this$0.a(R.id.em8);
                h.f.b.l.b(tuxNavBar, "");
                tuxNavBar.setVisibility(0);
                com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
                String string = this.this$0.getResources().getString(R.string.fx9);
                h.f.b.l.b(string, "");
                ((TuxNavBar) this.this$0.a(R.id.em8)).a(gVar.a(string));
            } else if (intValue == 2) {
                TuxNavBar tuxNavBar2 = (TuxNavBar) this.this$0.a(R.id.em8);
                h.f.b.l.b(tuxNavBar2, "");
                tuxNavBar2.setVisibility(8);
            } else if (intValue == 3) {
                TuxNavBar tuxNavBar3 = (TuxNavBar) this.this$0.a(R.id.em8);
                h.f.b.l.b(tuxNavBar3, "");
                tuxNavBar3.setVisibility(0);
                com.bytedance.tux.navigation.a.g gVar2 = new com.bytedance.tux.navigation.a.g();
                String string2 = this.this$0.getResources().getString(R.string.bgb);
                h.f.b.l.b(string2, "");
                ((TuxNavBar) this.this$0.a(R.id.em8)).a(gVar2.a(string2));
            }
            ((DmtStatusView) this.this$0.a(R.id.e_o)).setStatus(intValue);
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(53064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.f84879b = SystemClock.elapsedRealtime();
                HashMap<String, Object> j2 = this.this$0.b().j();
                h.f.b.l.d("order_summary", "");
                h.f.b.l.d(j2, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84785a);
                linkedHashMap.put("actionsheet_name", "order_summary");
                linkedHashMap.putAll(j2);
                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_actionsheet", linkedHashMap);
                OrderSummaryPanel orderSummaryPanel = (OrderSummaryPanel) this.this$0.a(R.id.eet);
                orderSummaryPanel.startAnimation(orderSummaryPanel.f85026d);
            } else {
                if (this.this$0.f84879b != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.this$0.f84879b;
                    HashMap<String, Object> j3 = this.this$0.b().j();
                    h.f.b.l.d("order_summary", "");
                    h.f.b.l.d(j3, "");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84785a);
                    linkedHashMap2.put("stay_time", Long.valueOf(elapsedRealtime));
                    linkedHashMap2.put("actionsheet_name", "order_summary");
                    linkedHashMap2.putAll(j3);
                    com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_stay_actionsheet", linkedHashMap2);
                }
                OrderSummaryPanel orderSummaryPanel2 = (OrderSummaryPanel) this.this$0.a(R.id.eet);
                if (orderSummaryPanel2.f85028f != null) {
                    orderSummaryPanel2.setClickable(false);
                    orderSummaryPanel2.startAnimation(orderSummaryPanel2.f85028f);
                    orderSummaryPanel2.f85028f = null;
                } else {
                    orderSummaryPanel2.startAnimation(orderSummaryPanel2.f85027e);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        OrderSubmitViewModel b2 = b();
        EventCenter.a().a("ec_payment_method_activate_clicked", b2);
        EventCenter.a().a("ec_osp_resend_order_create", b2);
        TuxNavBar.a aVar = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr);
        a2.f45194b = true;
        TuxNavBar.a a3 = aVar.a(a2.a((h.f.a.a<h.z>) new u(this)));
        com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
        String string = getResources().getString(R.string.fx9);
        h.f.b.l.b(string, "");
        TuxNavBar.a a4 = a3.a(gVar.a(string));
        a4.f45188d = true;
        ((TuxNavBar) a(R.id.em8)).setNavActions(a4);
        DmtStatusView.a a5 = DmtStatusView.a.a(requireContext()).a(com.a.a(LayoutInflater.from(requireContext()), R.layout.rl, (ViewGroup) a(R.id.ad7), false));
        Context requireContext = requireContext();
        h.f.b.l.b(requireContext, "");
        DmtStatusView.a c2 = a5.c(a(requireContext, R.string.bge, R.string.bgd, R.drawable.yu, new y(this)));
        Context requireContext2 = requireContext();
        h.f.b.l.b(requireContext2, "");
        ((DmtStatusView) a(R.id.e_o)).setBuilder(c2.d(a(requireContext2, R.string.bgb, R.string.bga, R.drawable.zd, new z(this))));
        ((RecyclerView) a(R.id.djs)).a(new com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a(androidx.core.content.b.c(requireContext(), R.color.az), com.ss.android.ugc.aweme.base.utils.n.a(8.0d), 0.0f));
        RecyclerView recyclerView = (RecyclerView) a(R.id.djs);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djs);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setAdapter(c());
        ((OrderSummaryPanel) a(R.id.eet)).setCloseAction(new v(this));
        a(R.id.d01).setOnClickListener(new w(this));
        a(R.id.d02).setOnClickListener(new x(this));
        if ((!b().K.isEmpty()) && b().K.size() == 3) {
            ((PageStepper) a(R.id.d1h)).setLightStep(3);
        }
        da.a.a("tiktokec_anchor_order_submit").a((RecyclerView) a(R.id.djs));
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        View view2 = getView();
        if (!(window == null || view2 == null)) {
            androidx.lifecycle.i lifecycle = getLifecycle();
            h.f.b.l.b(lifecycle, "");
            new KeyBoardVisibilityUtil(lifecycle, window, view2, null, new t(view2, this));
        }
        f.a.b.b unused = selectSubscribe(b(), k.f84899a, new ah(), new k(this));
        f.a.b.b unused2 = selectSubscribe(b(), u.f85016a, new ah(), new p(this));
        f.a.b.b unused3 = selectSubscribe(b(), v.f85017a, new ah(), new q(this));
        f.a.b.b unused4 = selectSubscribe(b(), w.f85162a, new ah(), new r(this));
        g().f85776b.observe(this, new s(this));
        f.a.b.b unused5 = selectSubscribe(b(), l.f84900a, new ah(), new f(this));
        f.a.b.b unused6 = selectSubscribe(b(), m.f84901a, new ah(), new g(this));
        f.a.b.b unused7 = selectSubscribe(b(), n.f84902a, new ah(), new h(this));
        f.a.b.b unused8 = selectSubscribe(b(), o.f84903a, new ah(), new i(this));
        f.a.b.b unused9 = selectSubscribe(b(), p.f84904a, new ah(), new C2032j(this));
        f.a.b.b unused10 = selectSubscribe(b(), q.f84905a, new ah(), new l(this));
        f.a.b.b unused11 = selectSubscribe(b(), r.f84906a, new ah(), new m(this));
        f.a.b.b unused12 = selectSubscribe(b(), s.f85014a, new ah(), new n(this));
        f.a.b.b unused13 = selectSubscribe(b(), t.f85015a, new ah(), new o(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.rf, viewGroup, false);
    }

    private final View a(Context context, int i2, int i3, int i4, h.f.a.a<h.z> aVar) {
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.pk, (ViewGroup) a(R.id.ad7), false);
        ((AppCompatImageView) a2.findViewById(R.id.bm4)).setImageResource(i4);
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.text);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(context.getText(i2));
        TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.ej0);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(context.getText(i3));
        TuxButton tuxButton = (TuxButton) a2.findViewById(R.id.dmf);
        h.f.b.l.b(tuxButton, "");
        tuxButton.setOnClickListener(new d(i4, context, i2, i3, aVar));
        h.f.b.l.b(a2, "");
        return a2;
    }
}
