package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
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
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.z;
import java.util.List;

public final class e extends Fragment implements ar<com.ss.android.ugc.aweme.base.arch.i>, q {

    /* renamed from: f */
    public static final d f87643f = new d((byte) 0);

    /* renamed from: a */
    public final com.ss.android.ugc.aweme.base.arch.i f87644a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b */
    public h.f.a.a<z> f87645b;

    /* renamed from: c */
    public h.f.a.a<z> f87646c;

    /* renamed from: d */
    public h.f.a.b<? super List<Region>, z> f87647d;

    /* renamed from: e */
    public h.f.a.b<? super List<Region>, z> f87648e;

    /* renamed from: g */
    private final lifecycleAwareLazy f87649g;

    /* renamed from: h */
    private SparseArray f87650h;

    public static final class b extends h.f.b.m implements h.f.a.m<DistrictPickerWrapperState, Bundle, DistrictPickerWrapperState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(55109);
        }

        public b() {
            super(2);
        }

        public final DistrictPickerWrapperState invoke(DistrictPickerWrapperState districtPickerWrapperState, Bundle bundle) {
            h.f.b.l.c(districtPickerWrapperState, "");
            return districtPickerWrapperState;
        }
    }

    static {
        Covode.recordClassIndex(55107);
    }

    public final DistrictPickerWrapperViewModel a() {
        return (DistrictPickerWrapperViewModel) this.f87649g.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(55112);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        private static e a(String str, OrderSKUDTO orderSKUDTO, int i2, boolean z, String str2) {
            e eVar = new e();
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putStringArray("geoname_ids", new String[]{str});
            }
            if (orderSKUDTO != null) {
                bundle.putParcelable("order_sku", orderSKUDTO);
            }
            bundle.putInt("number_of_remaining_level", i2 - 1);
            bundle.putBoolean("show_back_icon", z);
            bundle.putString("page_info", str2);
            eVar.setArguments(bundle);
            return eVar;
        }

        public static /* synthetic */ e a(String str, OrderSKUDTO orderSKUDTO, int i2, boolean z, String str2, int i3) {
            if ((i3 & 1) != 0) {
                str = null;
            }
            if ((i3 & 2) != 0) {
                orderSKUDTO = null;
            }
            if ((i3 & 4) != 0) {
                i2 = Integer.MAX_VALUE;
            }
            if ((i3 & 8) != 0) {
                z = false;
            }
            if ((i3 & 16) != 0) {
                str2 = null;
            }
            return a(str, orderSKUDTO, i2, z, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a */
        public static final i f87651a = new i();

        static {
            Covode.recordClassIndex(55119);
        }

        i() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a */
        public static final j f87652a = new j();

        static {
            Covode.recordClassIndex(55120);
        }

        j() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a */
        public static final m f87655a = new m();

        static {
            Covode.recordClassIndex(55123);
        }

        m() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a */
        public static final n f87656a = new n();

        static {
            Covode.recordClassIndex(55124);
        }

        n() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f87644a;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

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
            Covode.recordClassIndex(55108);
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

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f87650h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<DistrictPickerWrapperViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(55110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPickerWrapper$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPickerWrapper$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public e() {
        h.k.c a2 = h.f.b.ab.a(DistrictPickerWrapperViewModel.class);
        a aVar = new a(a2);
        this.f87649g = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
        this.f87645b = i.f87651a;
        this.f87646c = j.f87652a;
        this.f87647d = l.f87654a;
        this.f87648e = k.f87653a;
    }

    public final boolean b() {
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager, "");
        if (childFragmentManager.h()) {
            return true;
        }
        androidx.fragment.app.i childFragmentManager2 = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager2, "");
        if (childFragmentManager2.f().size() > 1) {
            getChildFragmentManager().c();
            return true;
        }
        a().a();
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {

        /* renamed from: a */
        public static final k f87653a = new k();

        static {
            Covode.recordClassIndex(55121);
        }

        k() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            h.f.b.l.d(list, "");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {

        /* renamed from: a */
        public static final l f87654a = new l();

        static {
            Covode.recordClassIndex(55122);
        }

        l() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            h.f.b.l.d(list, "");
            return z.f158842a;
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {

        /* renamed from: a */
        public static final o f87657a = new o();

        static {
            Covode.recordClassIndex(55125);
        }

        o() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            h.f.b.l.d(list, "");
            return z.f158842a;
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.b<List<? extends Region>, z> {

        /* renamed from: a */
        public static final p f87658a = new p();

        static {
            Covode.recordClassIndex(55126);
        }

        p() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Region> list) {
            h.f.b.l.d(list, "");
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("page_info");
        } else {
            str = null;
        }
        a().f87693a = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a(str);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e$e */
    public static final class C2119e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(55113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2119e(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar2, "");
            if (booleanValue) {
                iVar2.withState(this.this$0.a(), new h.f.a.b<DistrictPickerWrapperState, z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e.C2119e.AnonymousClass1 */
                    final /* synthetic */ C2119e this$0;

                    static {
                        Covode.recordClassIndex(55114);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(DistrictPickerWrapperState districtPickerWrapperState) {
                        DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
                        h.f.b.l.d(districtPickerWrapperState2, "");
                        this.this$0.this$0.f87647d.invoke(districtPickerWrapperState2.getSelectedRegions());
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(55115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.f87646c.invoke();
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(55116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.f87645b.invoke();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Region>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(55117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Region> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final List<? extends Region> list2 = list;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list2, "");
            iVar2.withState(this.this$0.a(), new h.f.a.b<DistrictPickerWrapperState, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(55118);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(DistrictPickerWrapperState districtPickerWrapperState) {
                    DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
                    h.f.b.l.d(districtPickerWrapperState2, "");
                    if (!districtPickerWrapperState2.getDone() && (!list2.isEmpty())) {
                        this.this$0.this$0.f87648e.invoke(list2);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        f.a.b.b unused = selectSubscribe(a(), f.f87659a, new ah(), new C2119e(this));
        f.a.b.b unused2 = selectSubscribe(a(), g.f87660a, new ah(), new f(this));
        f.a.b.b unused3 = selectSubscribe(a(), h.f87661a, new ah(), new g(this));
        f.a.b.b unused4 = selectSubscribe(a(), i.f87662a, new ah(), new h(this));
        androidx.fragment.app.n a2 = getChildFragmentManager().a();
        Bundle arguments = getArguments();
        a aVar = new a();
        aVar.setArguments(arguments);
        if (arguments != null) {
            arguments.putInt("parent_id", R.id.b92);
        }
        a2.a(R.id.b92, aVar).a((String) null).c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.oo, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    private void a(h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.b<? super List<Region>, z> bVar, h.f.a.b<? super List<Region>, z> bVar2) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar2, "");
        this.f87645b = aVar;
        this.f87646c = aVar2;
        this.f87647d = bVar;
        this.f87648e = bVar2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.e */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(e eVar, h.f.a.a aVar, h.f.a.a aVar2, h.f.a.b bVar, h.f.a.b bVar2, int i2) {
        if ((i2 & 1) != 0) {
            aVar = m.f87655a;
        }
        if ((i2 & 2) != 0) {
            aVar2 = n.f87656a;
        }
        if ((i2 & 4) != 0) {
            bVar = o.f87657a;
        }
        if ((i2 & 8) != 0) {
            bVar2 = p.f87658a;
        }
        eVar.a(aVar, aVar2, bVar, bVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
