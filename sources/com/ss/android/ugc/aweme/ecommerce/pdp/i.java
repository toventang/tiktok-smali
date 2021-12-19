package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadExperiment;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class i extends com.ss.android.ugc.aweme.base.f.a implements ar<com.ss.android.ugc.aweme.base.arch.i>, q {

    /* renamed from: c  reason: collision with root package name */
    public static final c f86498c = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.base.arch.i f86499a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f86500b;

    /* renamed from: d  reason: collision with root package name */
    private final lifecycleAwareLazy f86501d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f86502e;

    static {
        Covode.recordClassIndex(54181);
    }

    public final PdpViewModel a() {
        return (PdpViewModel) this.f86501d.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(54185);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f86499a;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
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

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            l.a((Object) name, "");
            return name;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f.a.b.b bVar = this.f86500b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f86500b = null;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f86502e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_pdp_PdpFullFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.pdp.i$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.i$b$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.i.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_PdpFullFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public i() {
        h hVar = h.f86506a;
        h.k.c a2 = h.f.b.ab.a(PdpViewModel.class);
        a aVar = new a(a2);
        this.f86501d = new lifecycleAwareLazy(this, aVar, new b(this, aVar, a2, hVar));
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f86505a;

        static {
            Covode.recordClassIndex(54189);
        }

        g(i iVar) {
            this.f86505a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            f.a.b.b bVar = this.f86505a.f86500b;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f86505a.f86500b = null;
            if (th instanceof IPdpStarter.b) {
                this.f86505a.a().a((ProductPackStruct) null, Integer.valueOf(((IPdpStarter.b) th).getCode()));
            } else {
                this.f86505a.a().a((ProductPackStruct) null, (Integer) null);
            }
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f86503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86504b;

        static {
            Covode.recordClassIndex(54188);
        }

        f(i iVar, IPdpStarter.PdpEnterParam pdpEnterParam) {
            this.f86503a = iVar;
            this.f86504b = pdpEnterParam;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            this.f86503a.a().a(productPackStruct, (Integer) null);
            f.a.b.b bVar = this.f86503a.f86500b;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f86503a.f86500b = null;
            if (TextUtils.isEmpty(this.f86504b.getChainKey()) && !TextUtils.isEmpty(productPackStruct.v)) {
                HashMap<String, Object> visitReportParams = this.f86504b.getVisitReportParams();
                if (visitReportParams != null) {
                    String str = productPackStruct.v;
                    if (str == null) {
                        l.b();
                    }
                    visitReportParams.put("chain_key", str);
                }
                this.f86504b.setChainKey(productPackStruct.v);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        int i2;
        ProductPackStruct productPackStruct;
        Long l2;
        long j2;
        int i3;
        androidx.fragment.app.e activity;
        super.onCreate(bundle);
        if (!(bundle == null || (activity = getActivity()) == null)) {
            activity.finish();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("ENTER_PARAMS");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam");
        IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) serializable;
        a().s = k.a.a(getContext());
        a().f86300a = pdpEnterParam;
        a().w = true;
        a().a(true);
        k kVar = a().s;
        if (kVar != null) {
            kVar.a(true);
        }
        PdpViewModel a2 = a();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i2 = arguments2.getInt("PREFETCH_TYPE");
        } else {
            i2 = 0;
        }
        a2.f86308l = i2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            productPackStruct = (ProductPackStruct) arguments3.getParcelable("PREFETCH_RESULT");
        } else {
            productPackStruct = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (i3 = arguments4.getInt("ERROR_CODE", 0)) != 0) {
            a().a((ProductPackStruct) null, Integer.valueOf(i3));
        } else if (productPackStruct != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                l2 = Long.valueOf(arguments5.getLong("PREFETCH_FINISH_TIME"));
            } else {
                l2 = null;
            }
            a().a(productPackStruct, (Integer) null);
            k kVar2 = a().s;
            if (kVar2 != null) {
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = 0;
                }
                kVar2.s = j2;
            }
        } else {
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.d a3 = IPdpStarter.a.a().a(pdpEnterParam, true);
            if (a3.f86593d != null) {
                a().a(a3.f86593d, (Integer) null);
            } else {
                this.f86500b = a3.f86592c.a(new f(this, pdpEnterParam), new g(this));
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(54186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            androidx.fragment.app.e activity;
            boolean booleanValue = bool.booleanValue();
            l.d(iVar, "");
            if (booleanValue && (activity = this.this$0.getActivity()) != null) {
                activity.finish();
            }
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(54187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            l.d(iVar2, "");
            if (booleanValue) {
                ImagePreloadExperiment imagePreloadExperiment = ImagePreloadExperiment.INSTANCE;
                androidx.lifecycle.i lifecycle = iVar2.getLifecycle();
                l.b(lifecycle, "");
                imagePreloadExperiment.onFirstHeaderImageReady(lifecycle, this.this$0.a());
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<PdpMainState, Bundle, PdpMainState> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f86506a = new h();

        static {
            Covode.recordClassIndex(54190);
        }

        h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState, Bundle bundle) {
            PdpMainState pdpMainState2 = pdpMainState;
            l.d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 3, null, null, 1.0f, 0, null, 0, false, null, null, null, null, null, 65463, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.widget.c a2 = c.a.a(this, getView());
        a2.a(R.id.w7, new PdpBodyWidget(this), com.ss.android.ugc.aweme.ecommerce.pdp.c.d.f86442a);
        a2.a(R.id.bf7, new PdpHeadNavBarWidget(getFragmentManager()), com.ss.android.ugc.aweme.ecommerce.pdp.c.d.f86442a);
        a2.a(R.id.v_, new PdpBottomNavBarWidget(this), com.ss.android.ugc.aweme.ecommerce.pdp.c.d.f86442a);
        f.a.b.b unused = selectSubscribe(a(), j.f86507a, new ah(), new d(this));
        f.a.b.b unused2 = selectSubscribe(a(), k.f86508a, new ah(), new e(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(getContext(), R.layout.pm, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
