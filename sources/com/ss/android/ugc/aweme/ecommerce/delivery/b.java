package com.ss.android.ugc.aweme.ecommerce.delivery;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
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
import com.ss.android.ugc.aweme.base.arch.i;
import com.ss.android.ugc.aweme.ecommerce.delivery.a.g;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.router.StrategyService;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.k.k;
import h.z;

public final class b extends com.ss.android.ugc.aweme.ecommerce.common.a.a implements ar<i>, q {

    /* renamed from: b  reason: collision with root package name */
    public static final d f85825b = new d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f85826a = new i();

    /* renamed from: c  reason: collision with root package name */
    private final lifecycleAwareLazy f85827c;

    /* renamed from: d  reason: collision with root package name */
    private final h f85828d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f85829e;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.b$b  reason: collision with other inner class name */
    public static final class C2060b extends m implements h.f.a.m<DeliveryPanelState, Bundle, DeliveryPanelState> {
        public static final C2060b INSTANCE = new C2060b();

        static {
            Covode.recordClassIndex(53699);
        }

        public C2060b() {
            super(2);
        }

        public final DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState, Bundle bundle) {
            l.c(deliveryPanelState, "");
            return deliveryPanelState;
        }
    }

    static {
        Covode.recordClassIndex(53697);
    }

    private final g c() {
        return (g) this.f85828d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final View a(int i2) {
        if (this.f85829e == null) {
            this.f85829e = new SparseArray();
        }
        View view = (View) this.f85829e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85829e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void a() {
        SparseArray sparseArray = this.f85829e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final DeliveryPanelViewModel b() {
        return (DeliveryPanelViewModel) this.f85827c.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(53702);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ i d() {
        return this.f85826a;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e
    public final com.ss.android.ugc.aweme.ecommerce.router.m e() {
        return c();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(53698);
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

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onDestroyView() {
        super.onDestroyView();
        c().d();
        a();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        c().b();
    }

    public static final class c extends m implements h.f.a.a<DeliveryPanelViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(53700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_delivery_DeliveryWrapperFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.delivery.b$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.b$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.b.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_delivery_DeliveryWrapperFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class e extends m implements h.f.a.a<g> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            Uri uri;
            com.ss.android.ugc.aweme.ecommerce.router.h b2 = StrategyService.b().a().a(new h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.delivery.b.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(53704);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
                    return new com.ss.android.ugc.aweme.ecommerce.delivery.a.b(this.this$0.this$0, this.this$0.this$0.b());
                }
            }).b(new h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.delivery.b.e.AnonymousClass2 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(53705);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
                    return new com.ss.android.ugc.aweme.ecommerce.delivery.a.a(this.this$0.this$0, this.this$0.this$0.b());
                }
            });
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                uri = (Uri) arguments.getParcelable("uri");
            } else {
                uri = null;
            }
            return com.ss.android.ugc.aweme.ecommerce.router.i.a(b2, uri);
        }
    }

    public b() {
        super((byte) 0);
        h.k.c a2 = h.f.b.ab.a(DeliveryPanelViewModel.class);
        a aVar = new a(a2);
        this.f85827c = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, C2060b.INSTANCE));
        this.f85828d = h.i.a((h.f.a.a) new e(this));
    }

    @Override // androidx.fragment.app.d
    public final void onCancel(DialogInterface dialogInterface) {
        l.d(dialogInterface, "");
        super.onCancel(dialogInterface);
        c().e();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c().a();
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i, com.google.android.material.bottomsheet.b, com.ss.android.ugc.aweme.ecommerce.common.a.e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        c().a(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c().c();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            g c2 = c();
            l.b(activity, "");
            c2.a(activity, bundle);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            g c2 = c();
            l.b(activity, "");
            c2.b(activity, bundle);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return c().a(layoutInflater, viewGroup);
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
