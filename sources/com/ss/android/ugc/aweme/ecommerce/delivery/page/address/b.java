package com.ss.android.ugc.aweme.ecommerce.delivery.page.address;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
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
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.r;
import h.f.a.s;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.List;

public final class b extends Fragment implements ar<com.ss.android.ugc.aweme.base.arch.i>, q {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f85841a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    private final h.h f85842b;

    /* renamed from: c  reason: collision with root package name */
    private final lifecycleAwareLazy f85843c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f85844d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<z> f85845e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f85846f;

    public static final class c extends m implements h.f.a.m<AddressSelectState, Bundle, AddressSelectState> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(53727);
        }

        public c() {
            super(2);
        }

        public final AddressSelectState invoke(AddressSelectState addressSelectState, Bundle bundle) {
            h.f.b.l.c(addressSelectState, "");
            return addressSelectState;
        }
    }

    final /* synthetic */ class l implements i.c {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f85852a;

        static {
            Covode.recordClassIndex(53739);
        }

        l(h.f.a.a aVar) {
            this.f85852a = aVar;
        }

        @Override // androidx.fragment.app.i.c
        public final /* synthetic */ void a() {
            h.f.b.l.b(this.f85852a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(53724);
    }

    public final View a(int i2) {
        if (this.f85846f == null) {
            this.f85846f = new SparseArray();
        }
        View view = (View) this.f85846f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85846f.put(i2, findViewById);
        return findViewById;
    }

    public final DeliveryPanelViewModel a() {
        return (DeliveryPanelViewModel) this.f85842b.getValue();
    }

    public final AddressSelectViewModel b() {
        return (AddressSelectViewModel) this.f85843c.getValue();
    }

    public final AddressAdapter c() {
        return (AddressAdapter) this.f85844d.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f85841a;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$b  reason: collision with other inner class name */
    public static final class C2061b extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(53726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2061b(h.k.c cVar) {
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

    static final class e extends m implements h.f.a.a<AddressAdapter> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AddressAdapter invoke() {
            AddressAdapter addressAdapter = new AddressAdapter(this.this$0);
            addressAdapter.d(false);
            return addressAdapter;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r3 = this;
            super.onDestroyView()
            androidx.fragment.app.i r2 = r3.getFragmentManager()
            if (r2 == 0) goto L_0x0018
            h.f.a.a<h.z> r1 = r3.f85845e
            if (r1 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l
            r0.<init>(r1)
            r1 = r0
        L_0x0013:
            androidx.fragment.app.i$c r1 = (androidx.fragment.app.i.c) r1
            r2.b(r1)
        L_0x0018:
            android.util.SparseArray r0 = r3.f85846f
            if (r0 == 0) goto L_0x001f
            r0.clear()
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b.onDestroyView():void");
    }

    public static final class d extends m implements h.f.a.a<AddressSelectViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(53728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressSelectFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$d$1 r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$d$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressSelectFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class k extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Object obj;
            List<Fragment> f2;
            FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) this.this$0.a(R.id.djj);
            if (fixedRecyclerView != null) {
                androidx.fragment.app.i fragmentManager = this.this$0.getFragmentManager();
                if (fragmentManager == null || (f2 = fragmentManager.f()) == null) {
                    obj = null;
                } else {
                    obj = n.i((List) f2);
                }
                fixedRecyclerView.setNestedScrollingEnabled(h.f.b.l.a(obj, this.this$0));
            }
            return z.f158842a;
        }
    }

    public static final class a extends m implements h.f.a.a<DeliveryPanelViewModel> {
        final /* synthetic */ Fragment $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressSelectFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)     // Catch:{ as -> 0x002a }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressSelectFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressSelectFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public b() {
        h.k.c a2 = h.f.b.ab.a(DeliveryPanelViewModel.class);
        this.f85842b = h.i.a((h.f.a.a) new a(this, a2, a2));
        h.k.c a3 = h.f.b.ab.a(AddressSelectViewModel.class);
        C2061b bVar = new C2061b(a3);
        this.f85843c = new lifecycleAwareLazy(this, bVar, new d(this, bVar, a3, c.INSTANCE));
        this.f85844d = h.i.a((h.f.a.a) new e(this));
        this.f85845e = new k(this);
    }

    public static final class j implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85851a;

        static {
            Covode.recordClassIndex(53737);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(b bVar) {
            this.f85851a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f85851a.a().a(com.ss.android.ugc.aweme.ecommerce.delivery.vm.a.POP);
            com.ss.android.ugc.aweme.ecommerce.delivery.a.a("close", "return", null, null, null);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            this.f85851a.a().f85935b.invoke();
            com.ss.android.ugc.aweme.ecommerce.delivery.a.a("close", "close", null, null, null);
        }
    }

    public static final class h extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85847a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f85848b;

        static {
            Covode.recordClassIndex(53734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(b bVar) {
            super(700);
            this.f85848b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                b bVar = this.f85848b;
                bVar.withState(bVar.b(), new a(this));
            }
        }

        static final class a extends m implements h.f.a.b<AddressSelectState, z> {
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(53735);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(AddressSelectState addressSelectState) {
                AddressSelectState addressSelectState2 = addressSelectState;
                h.f.b.l.d(addressSelectState2, "");
                if (addressSelectState2.getSelectedAddress() != null) {
                    this.this$0.f85848b.a().a(this.this$0.f85848b.getContext(), addressSelectState2.getSelectedAddress());
                }
                return z.f158842a;
            }
        }
    }

    public static final class i extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85849a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f85850b;

        static {
            Covode.recordClassIndex(53736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(b bVar) {
            super(700);
            this.f85850b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f85850b.a().a(com.ss.android.ugc.aweme.ecommerce.delivery.vm.a.PUSH_AREA_PAGE);
                com.ss.android.ugc.aweme.ecommerce.delivery.a.a("select_location", "next", null, null, null);
            }
        }
    }

    static final class f extends m implements h.f.a.b<DeliveryPanelState, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            h.f.b.l.d(deliveryPanelState2, "");
            this.this$0.c().a(deliveryPanelState2.getAddressRenderData());
            final z.e eVar = new z.e();
            eVar.element = null;
            deliveryPanelState2.getSelectedShipToInfo().a(new h.f.a.b<com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d, h.z>() {
                /* class com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(53732);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
                    h.f.b.l.d(dVar, "");
                    eVar.element = dVar;
                    return h.z.f158842a;
                }
            });
            if (deliveryPanelState2.getSelectedShipToInfo().f85830a == null) {
                for (T t : deliveryPanelState2.getAddressRenderData()) {
                    if (!(t instanceof com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d)) {
                        t = null;
                    }
                    T t2 = t;
                    if (t2 != null && t2.f85925b.a() && t2.f85924a) {
                        eVar.element = t2;
                    }
                }
            }
            this.this$0.b().a((com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d) eVar.element);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class g extends m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
            boolean z;
            com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            TuxButton tuxButton = (TuxButton) this.this$0.a(R.id.aet);
            h.f.b.l.b(tuxButton, "");
            if (dVar2 == null || !dVar2.f85924a) {
                z = false;
            } else {
                z = true;
            }
            tuxButton.setEnabled(z);
            return h.z.f158842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b$l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.od, viewGroup, false);
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
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
