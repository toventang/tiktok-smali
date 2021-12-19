package com.ss.android.ugc.aweme.ecommerce.address.list;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
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
import com.ss.android.ugc.aweme.base.arch.i;
import com.ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.f.a.r;
import h.f.a.s;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.k.k;
import h.z;

public final class AddressListActivity extends com.ss.android.ugc.aweme.ecommerce.common.b implements ar<i>, q {

    /* renamed from: c  reason: collision with root package name */
    public static final c f84538c = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f84539a = new i();

    /* renamed from: b  reason: collision with root package name */
    final lifecycleAwareLazy f84540b;

    /* renamed from: d  reason: collision with root package name */
    private final h f84541d;

    /* renamed from: e  reason: collision with root package name */
    private long f84542e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f84543f;

    public static final class a extends m implements h.f.a.m<AddressListState, Bundle, AddressListState> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(52750);
        }

        public a() {
            super(2);
        }

        public final AddressListState invoke(AddressListState addressListState, Bundle bundle) {
            l.c(addressListState, "");
            return addressListState;
        }
    }

    static {
        Covode.recordClassIndex(52749);
    }

    private final com.ss.android.ugc.aweme.ecommerce.address.list.b.i a() {
        return (com.ss.android.ugc.aweme.ecommerce.address.list.b.i) this.f84541d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f84543f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f84543f == null) {
            this.f84543f = new SparseArray();
        }
        View view = (View) this.f84543f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f84543f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(52753);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ i d() {
        return this.f84539a;
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

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ AddressListActivity this$0;

        static {
            Covode.recordClassIndex(52754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddressListActivity addressListActivity) {
            super(0);
            this.this$0 = addressListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            AddressListActivity.super.onBackPressed();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        a().a(new d(this));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        a().c();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        a().b();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.d().b(SystemClock.elapsedRealtime() - this.f84542e);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onResume", true);
        super.onResume();
        this.f84542e = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onResume", false);
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.address.list.b.i> {
        final /* synthetic */ AddressListActivity this$0;

        static {
            Covode.recordClassIndex(52757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AddressListActivity addressListActivity) {
            super(0);
            this.this$0 = addressListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.list.b.i invoke() {
            return com.ss.android.ugc.aweme.ecommerce.router.i.a(StrategyService.b().a().a(new h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(52758);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
                    return new com.ss.android.ugc.aweme.ecommerce.address.list.b.b(this.this$0.this$0, (AddressListViewModel) this.this$0.this$0.f84540b.getValue());
                }
            }).b(new h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity.f.AnonymousClass2 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(52759);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
                    return new com.ss.android.ugc.aweme.ecommerce.address.list.b.a(this.this$0.this$0);
                }
            }), this.this$0.getIntent().getData());
        }
    }

    public AddressListActivity() {
        h.k.c a2 = ab.a(AddressListViewModel.class);
        this.f84540b = new lifecycleAwareLazy(this, new b(this, a2, a.INSTANCE, a2));
        this.f84541d = h.i.a((h.f.a.a) new f(this));
        this.f84542e = -1;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
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

    public static final class b extends m implements h.f.a.a<AddressListViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ androidx.appcompat.app.d $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(52751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.appcompat.app.d dVar, h.k.c cVar, h.f.a.m mVar, h.k.c cVar2) {
            super(0);
            this.$this_viewModel = dVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_address_list_AddressListActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.a(r0)
                if (r0 == 0) goto L_0x0038
                h.f.b.l.a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity$b$1
                r0.<init>(r4)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_address_list_AddressListActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    static final class e extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f84544a = new e();

        static {
            Covode.recordClassIndex(52755);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f84545a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onCreate", true);
        activityConfiguration(e.f84544a);
        super.onCreate(bundle);
        a().a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onRestoreInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onRestoreInstanceState(bundle);
        a().a(this, bundle);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        a().b(this, bundle);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
