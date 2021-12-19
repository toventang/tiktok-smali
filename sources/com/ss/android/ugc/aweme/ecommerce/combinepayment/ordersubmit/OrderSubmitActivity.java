package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.ab;
import h.f.b.z;
import h.p;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class OrderSubmitActivity extends com.ss.android.ugc.aweme.ecommerce.common.b implements ar<com.ss.android.ugc.aweme.base.arch.i>, q {

    /* renamed from: d  reason: collision with root package name */
    public static final c f84714d = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f84715a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super MotionEvent, z> f84716b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f84717c;

    /* renamed from: e  reason: collision with root package name */
    private final lifecycleAwareLazy f84718e;

    /* renamed from: f  reason: collision with root package name */
    private long f84719f;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f84720h;

    public static final class a extends h.f.b.m implements h.f.a.m<OrderSubmitState, Bundle, OrderSubmitState> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(52892);
        }

        public a() {
            super(2);
        }

        public final OrderSubmitState invoke(OrderSubmitState orderSubmitState, Bundle bundle) {
            h.f.b.l.c(orderSubmitState, "");
            return orderSubmitState;
        }
    }

    static {
        Covode.recordClassIndex(52891);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f84720h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f84720h == null) {
            this.f84720h = new SparseArray();
        }
        View view = (View) this.f84720h.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f84720h.put(i2, findViewById);
        return findViewById;
    }

    public final OrderSubmitViewModel a() {
        return (OrderSubmitViewModel) this.f84718e.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(52895);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class i extends com.google.gson.b.a<List<? extends Region>> {
        static {
            Covode.recordClassIndex(52904);
        }

        i() {
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f84715a;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        ILiveOuterService s = LiveOuterService.s();
        h.f.b.l.b(s, "");
        s.d().b(SystemClock.elapsedRealtime() - this.f84719f);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity", "onResume", true);
        super.onResume();
        this.f84719f = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        Fragment fragment = this.f84717c;
        if (fragment != null && (fragment instanceof e)) {
            ((e) fragment).g();
        }
    }

    public OrderSubmitActivity() {
        h.k.c a2 = ab.a(OrderSubmitViewModel.class);
        this.f84718e = new lifecycleAwareLazy(this, new b(this, a2, a.INSTANCE, a2));
        this.f84716b = e.f84722a;
        this.f84719f = -1;
    }

    public static final class b extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ androidx.appcompat.app.d $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(52893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.appcompat.app.d dVar, h.k.c cVar, h.f.a.m mVar, h.k.c cVar2) {
            super(0);
            this.$this_viewModel = dVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r4.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                h.f.b.l.a(r1, r3)
                h.k.c r0 = r4.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.a(r0)
                if (r0 == 0) goto L_0x0038
                h.f.b.l.a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity$b$1
                r0.<init>(r4)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.edit.a $this_apply;
        final /* synthetic */ OrderSubmitActivity this$0;

        static {
            Covode.recordClassIndex(52896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.ss.android.ugc.aweme.ecommerce.address.edit.a aVar, OrderSubmitActivity orderSubmitActivity) {
            super(0);
            this.$this_apply = aVar;
            this.this$0 = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.a().o != null) {
                this.this$0.a().b();
                OrderSubmitActivity orderSubmitActivity = this.this$0;
                o oVar = orderSubmitActivity.a().o;
                AnonymousClass1 r4 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.d.AnonymousClass1 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(52897);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.d.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f84721a;

                            static {
                                Covode.recordClassIndex(52898);
                            }

                            {
                                this.f84721a = r1;
                            }

                            public final void run() {
                                androidx.fragment.app.e activity = this.f84721a.this$0.$this_apply.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                        }, 450);
                        return z.f158842a;
                    }
                };
                AnonymousClass2 r5 = new h.f.a.b<t, z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.d.AnonymousClass2 */
                    final /* synthetic */ d this$0;

                    static {
                        Covode.recordClassIndex(52899);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(t tVar) {
                        t tVar2 = tVar;
                        h.f.b.l.d(tVar2, "");
                        this.this$0.this$0.a().a(tVar2);
                        return z.f158842a;
                    }
                };
                HashMap<String, Object> j2 = this.this$0.a().j();
                j2.put("previous_page", "shipping_address");
                new com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b(orderSubmitActivity, oVar, r4, r5, j2).a();
            } else {
                androidx.fragment.app.e activity = this.$this_apply.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
        h.f.b.l.b(supportFragmentManager, "");
        int e2 = supportFragmentManager.e();
        if (e2 > 0) {
            i.a c2 = getSupportFragmentManager().c(e2 - 1);
            h.f.b.l.b(c2, "");
            Fragment a2 = getSupportFragmentManager().a(c2.h());
            if ((a2 instanceof a) && ((a) a2).f()) {
                return;
            }
            if (e2 == 1) {
                finish();
            } else {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        Fragment fragment = this.f84717c;
        if (fragment != null && (fragment instanceof e)) {
            ((e) fragment).h();
        }
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    static final class l implements i.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrderSubmitActivity f84723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f84724b;

        static {
            Covode.recordClassIndex(52907);
        }

        l(OrderSubmitActivity orderSubmitActivity, z.c cVar) {
            this.f84723a = orderSubmitActivity;
            this.f84724b = cVar;
        }

        @Override // androidx.fragment.app.i.c
        public final void a() {
            Fragment fragment;
            androidx.fragment.app.i supportFragmentManager = this.f84723a.getSupportFragmentManager();
            h.f.b.l.b(supportFragmentManager, "");
            int e2 = supportFragmentManager.e();
            if (e2 > 0) {
                int i2 = e2 - 1;
                androidx.fragment.app.i supportFragmentManager2 = this.f84723a.getSupportFragmentManager();
                i.a c2 = this.f84723a.getSupportFragmentManager().c(i2);
                h.f.b.l.b(c2, "");
                Fragment a2 = supportFragmentManager2.a(c2.h());
                if (a2 != null && (a2 instanceof e)) {
                    ((e) a2).g();
                }
                if (!(this.f84723a.f84717c == null || (fragment = this.f84723a.f84717c) == null || !(fragment instanceof e))) {
                    ((e) fragment).h();
                }
                this.f84723a.f84717c = a2;
                i.a c3 = this.f84723a.getSupportFragmentManager().c(i2);
                h.f.b.l.b(c3, "");
                String.valueOf(c3.h());
            }
            if (e2 <= this.f84724b.element) {
                if (e2 == 0) {
                    this.f84723a.a().a((c) null);
                } else {
                    androidx.fragment.app.i supportFragmentManager3 = this.f84723a.getSupportFragmentManager();
                    androidx.fragment.app.i supportFragmentManager4 = this.f84723a.getSupportFragmentManager();
                    h.f.b.l.b(supportFragmentManager4, "");
                    i.a c4 = supportFragmentManager3.c(supportFragmentManager4.e() - 1);
                    h.f.b.l.b(c4, "");
                    OrderSubmitViewModel a3 = this.f84723a.a();
                    String h2 = c4.h();
                    if (h2 == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(h2, "");
                    a3.a(new c(h2, true));
                }
            }
            this.f84724b.element = e2;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<MotionEvent, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f84722a = new e();

        static {
            Covode.recordClassIndex(52900);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(MotionEvent motionEvent) {
            h.f.b.l.d(motionEvent, "");
            return h.z.f158842a;
        }
    }

    public static n a(n nVar) {
        n a2 = nVar.a(R.anim.aq, R.anim.ar, R.anim.aq, R.anim.ar);
        h.f.b.l.b(a2, "");
        return a2;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f84716b.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> {
        final /* synthetic */ OrderSubmitActivity this$0;

        static {
            Covode.recordClassIndex(52902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(OrderSubmitActivity orderSubmitActivity) {
            super(1);
            this.this$0 = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            this.this$0.a().a(nVar2);
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f84725a = new m();

        static {
            Covode.recordClassIndex(52908);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f84726a);
            baseActivityViewModel2.config(AnonymousClass2.f84727a);
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, h.z> {
        final /* synthetic */ OrderSubmitActivity this$0;

        static {
            Covode.recordClassIndex(52903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(OrderSubmitActivity orderSubmitActivity) {
            super(1);
            this.this$0 = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            HashMap<String, Object> hashMap = this.this$0.a().F;
            if (hashMap != null) {
                hashMap.put("previous_page", "payment_method");
            }
            this.this$0.a().a(nVar2);
            this.this$0.a().a();
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<p<? extends String, ? extends Address>, h.z> {
        final /* synthetic */ OrderSubmitActivity this$0;

        static {
            Covode.recordClassIndex(52901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(OrderSubmitActivity orderSubmitActivity) {
            super(1);
            this.this$0 = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(p<? extends String, ? extends Address> pVar) {
            p<? extends String, ? extends Address> pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            HashMap<String, Object> hashMap = this.this$0.a().F;
            if (hashMap != null) {
                hashMap.put("previous_page", "shipping_address");
            }
            this.this$0.a().f84734g = new ShippingAddress((Address) pVar2.getSecond(), null, null, null, null);
            this.this$0.a().f84731d = null;
            this.this$0.a().a();
            return h.z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        h.f.b.l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putString("requestParams", dg.a().b(new OrderSubmitRequestParam(a().f84729b, a().f84730c, null, null, 12, null)));
        bundle.putString("chainKey", a().f84732e);
        bundle.putString("trackParams", dg.a().b(a().F));
        bundle.putString("repoId", a().I);
        bundle.putString("response", dg.a().b(a().f84735k));
        Fragment fragment = this.f84717c;
        if (fragment != null) {
            str = fragment.getTag();
        } else {
            str = null;
        }
        bundle.putString("last_page", str);
        bundle.putInt("buy_type", a().f84728a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b6, code lost:
        if (r2 == null) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0215 A[SYNTHETIC, Splitter:B:87:0x0215] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a1  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 697
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ OrderSubmitActivity this$0;

        static {
            Covode.recordClassIndex(52906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(OrderSubmitActivity orderSubmitActivity) {
            super(2);
            this.this$0 = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            ViewPropertyAnimator duration;
            float f2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            ViewPropertyAnimator animate = this.this$0._$_findCachedViewById(R.id.e_h).animate();
            if (!(animate == null || (duration = animate.setDuration(300)) == null)) {
                if (booleanValue) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                duration.alpha(f2);
            }
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, c, h.z> {
        final /* synthetic */ OrderSubmitActivity this$0;

        static {
            Covode.recordClassIndex(52905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(OrderSubmitActivity orderSubmitActivity) {
            super(2);
            this.this$0 = orderSubmitActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, c cVar) {
            int i2;
            int i3;
            InputItemData inputItemData;
            Address address;
            c cVar2 = cVar;
            h.f.b.l.d(iVar, "");
            if (cVar2 != null && !cVar2.f84857b) {
                String str = cVar2.f84856a;
                int hashCode = str.hashCode();
                if (hashCode != -1273172058) {
                    String str2 = null;
                    r rVar = null;
                    if (hashCode != -129088550) {
                        if (hashCode == 1664927849 && str.equals("payment_fragment")) {
                            n a2 = this.this$0.getSupportFragmentManager().a();
                            h.f.b.l.b(a2, "");
                            n a3 = OrderSubmitActivity.a(a2);
                            OrderSubmitActivity orderSubmitActivity = this.this$0;
                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g gVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.g();
                            HashMap<String, Object> hashMap = orderSubmitActivity.a().F;
                            if (hashMap == null) {
                                hashMap = new HashMap<>();
                            }
                            HashMap hashMap2 = new HashMap(hashMap);
                            ShippingAddress shippingAddress = orderSubmitActivity.a().f84734g;
                            if (shippingAddress != null) {
                                address = shippingAddress.getShippingAddress();
                            } else {
                                address = null;
                            }
                            BillInfoData billInfoData = orderSubmitActivity.a().f84735k;
                            if (billInfoData != null) {
                                rVar = billInfoData.getPaymentMethods();
                            }
                            gVar.a(new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.c(2, 3, Integer.valueOf(c.a.NEXT.ordinal()), rVar, null, false, orderSubmitActivity.a().n, hashMap2, null, address, 304));
                            g gVar2 = new g(orderSubmitActivity);
                            h.f.b.l.d(gVar2, "");
                            gVar.f85390e = gVar2;
                            gVar.a(new h(orderSubmitActivity));
                            a3.a(R.id.b94, gVar, "payment_fragment").a("payment_fragment").c();
                        }
                    } else if (str.equals("address_edit_fragment")) {
                        n a4 = this.this$0.getSupportFragmentManager().a();
                        h.f.b.l.b(a4, "");
                        n a5 = OrderSubmitActivity.a(a4);
                        OrderSubmitActivity orderSubmitActivity2 = this.this$0;
                        com.ss.android.ugc.aweme.ecommerce.address.edit.a aVar = new com.ss.android.ugc.aweme.ecommerce.address.edit.a();
                        List<Region> list = orderSubmitActivity2.a().f84731d;
                        String b2 = dg.a().b(orderSubmitActivity2.a().F);
                        if (orderSubmitActivity2.a().K.size() == 3) {
                            i2 = 1;
                        } else {
                            i2 = null;
                        }
                        if (orderSubmitActivity2.a().K.size() == 3) {
                            i3 = 3;
                        } else {
                            i3 = null;
                        }
                        BillInfoData billInfoData2 = orderSubmitActivity2.a().f84735k;
                        if (billInfoData2 != null) {
                            inputItemData = billInfoData2.getAddressInputItemData();
                        } else {
                            inputItemData = null;
                        }
                        if (orderSubmitActivity2.a().K.size() == 3) {
                            str2 = orderSubmitActivity2.getString(R.string.bha);
                        }
                        aVar.a(new AddressPageStarter.AddressEditEnterParams(list, null, "product_detail", b2, i2, i3, inputItemData, true, 1, str2));
                        f fVar = new f(orderSubmitActivity2);
                        h.f.b.l.d(fVar, "");
                        aVar.f84392d = fVar;
                        aVar.f84393e = new d(aVar, orderSubmitActivity2);
                        a5.a(R.id.b94, aVar, "address_edit_fragment").a("address_edit_fragment").c();
                    }
                } else if (str.equals("order_submit_fragment")) {
                    n a6 = this.this$0.getSupportFragmentManager().a();
                    h.f.b.l.b(a6, "");
                    OrderSubmitActivity.a(a6).a(R.id.b94, new j(), "order_submit_fragment").a("order_submit_fragment").c();
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
