package com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.ab;
import h.m.p;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;

public final class b extends Fragment implements ar<com.ss.android.ugc.aweme.base.arch.i>, q {

    /* renamed from: b  reason: collision with root package name */
    public static final C2062b f85863b = new C2062b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f85864a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: c  reason: collision with root package name */
    private final h.h f85865c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f85866d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<z> f85867e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f85868f;

    final /* synthetic */ class o implements i.c {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f85880a;

        static {
            Covode.recordClassIndex(53773);
        }

        o(h.f.a.a aVar) {
            this.f85880a = aVar;
        }

        @Override // androidx.fragment.app.i.c
        public final /* synthetic */ void a() {
            h.f.b.l.b(this.f85880a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(53754);
    }

    public final View a(int i2) {
        if (this.f85868f == null) {
            this.f85868f = new SparseArray();
        }
        View view = (View) this.f85868f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85868f.put(i2, findViewById);
        return findViewById;
    }

    public final DeliveryPanelViewModel a() {
        return (DeliveryPanelViewModel) this.f85865c.getValue();
    }

    public final LogisticAdapter b() {
        return (LogisticAdapter) this.f85866d.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$b  reason: collision with other inner class name */
    public static final class C2062b {
        static {
            Covode.recordClassIndex(53756);
        }

        private C2062b() {
        }

        public /* synthetic */ C2062b(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f85864a;
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

    static final class c extends h.f.b.m implements h.f.a.a<LogisticAdapter> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LogisticAdapter invoke() {
            LogisticAdapter logisticAdapter = new LogisticAdapter(this.this$0);
            logisticAdapter.d(false);
            return logisticAdapter;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a().a(this.this$0.getContext());
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a().a(this.this$0.getContext());
            return z.f158842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r3 = this;
            super.onDestroyView()
            androidx.fragment.app.i r2 = r3.getFragmentManager()
            if (r2 == 0) goto L_0x0018
            h.f.a.a<h.z> r1 = r3.f85867e
            if (r1 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o
            r0.<init>(r1)
            r1 = r0
        L_0x0013:
            androidx.fragment.app.i$c r1 = (androidx.fragment.app.i.c) r1
            r2.b(r1)
        L_0x0018:
            android.util.SparseArray r0 = r3.f85868f
            if (r0 == 0) goto L_0x001f
            r0.clear()
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b.onDestroyView():void");
    }

    static final class n extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
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
                    obj = h.a.n.i((List) f2);
                }
                fixedRecyclerView.setNestedScrollingEnabled(h.f.b.l.a(obj, this.this$0));
            }
            return z.f158842a;
        }
    }

    public b() {
        h.k.c a2 = ab.a(DeliveryPanelViewModel.class);
        this.f85865c = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.f85866d = h.i.a((h.f.a.a) new c(this));
        this.f85867e = new n(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<DeliveryPanelViewModel> {
        final /* synthetic */ Fragment $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53755);
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_delivery_page_logistic_LogisticSelectFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)     // Catch:{ as -> 0x002a }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_delivery_page_logistic_LogisticSelectFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_delivery_page_logistic_LogisticSelectFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class d extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85869a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f85870b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f85871c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f85872d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f85873e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f85874f;

        static {
            Covode.recordClassIndex(53758);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f85874f.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i2, Context context, int i3, int i4, h.f.a.a aVar) {
            super(700);
            this.f85870b = i2;
            this.f85871c = context;
            this.f85872d = i3;
            this.f85873e = i4;
            this.f85874f = aVar;
        }
    }

    public static final class l implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85877a;

        static {
            Covode.recordClassIndex(53769);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(b bVar) {
            this.f85877a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            this.f85877a.a().f85935b.invoke();
            b bVar = this.f85877a;
            bVar.withState(bVar.a(), a.f85878a);
        }

        static final class a extends h.f.b.m implements h.f.a.b<DeliveryPanelState, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f85878a = new a();

            static {
                Covode.recordClassIndex(53770);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
                Float f2;
                String str;
                LogisticTextDTO logisticTextDTO;
                Price price;
                Price price2;
                String priceVal;
                DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                h.f.b.l.d(deliveryPanelState2, "");
                LogisticDTO selectedLogistic = deliveryPanelState2.getSelectedLogistic();
                String str2 = null;
                if (selectedLogistic == null || (price2 = selectedLogistic.f85894f) == null || (priceVal = price2.getPriceVal()) == null) {
                    f2 = null;
                } else {
                    f2 = p.c(priceVal);
                }
                LogisticDTO selectedLogistic2 = deliveryPanelState2.getSelectedLogistic();
                if (selectedLogistic2 == null || (price = selectedLogistic2.f85894f) == null) {
                    str = null;
                } else {
                    str = price.getCurrency();
                }
                LogisticDTO selectedLogistic3 = deliveryPanelState2.getSelectedLogistic();
                if (!(selectedLogistic3 == null || (logisticTextDTO = selectedLogistic3.f85898j) == null)) {
                    str2 = logisticTextDTO.f85905f;
                }
                com.ss.android.ugc.aweme.ecommerce.delivery.a.a("close", "close", f2, str, str2);
                return z.f158842a;
            }
        }
    }

    public static final class k extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85875a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f85876b;

        static {
            Covode.recordClassIndex(53768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(b bVar) {
            super(700);
            this.f85876b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                DeliveryPanelViewModel a2 = this.f85876b.a();
                a2.b_(new DeliveryPanelViewModel.a(a2));
                b bVar = this.f85876b;
                bVar.withState(bVar.a(), m.f85879a);
                h.f.b.l.d("continue", "");
                h.f.b.l.d("confirm", "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(com.ss.android.ugc.aweme.ecommerce.delivery.a.f85809a);
                linkedHashMap.put("button_name", "continue");
                linkedHashMap.put("button_type", "confirm");
                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_show", linkedHashMap);
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<DeliveryPanelState, z> {
            final /* synthetic */ List $list;
            final /* synthetic */ com.bytedance.jedi.arch.i $this_selectSubscribe$inlined;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(53762);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, g gVar, com.bytedance.jedi.arch.i iVar) {
                super(1);
                this.$list = list;
                this.this$0 = gVar;
                this.$this_selectSubscribe$inlined = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
                h.f.b.l.d(deliveryPanelState, "");
                this.this$0.this$0.b().a(this.$list);
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            List<? extends Object> list2 = list;
            h.f.b.l.d(iVar2, "");
            if (list2 != null) {
                iVar2.withState(this.this$0.a(), new a(list2, this, iVar2));
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<DeliveryPanelState, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f85879a = new m();

        static {
            Covode.recordClassIndex(53771);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
            Float f2;
            String str;
            LogisticTextDTO logisticTextDTO;
            Price price;
            Price price2;
            String priceVal;
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            h.f.b.l.d(deliveryPanelState2, "");
            LogisticDTO selectedLogistic = deliveryPanelState2.getSelectedLogistic();
            String str2 = null;
            if (selectedLogistic == null || (price2 = selectedLogistic.f85894f) == null || (priceVal = price2.getPriceVal()) == null) {
                f2 = null;
            } else {
                f2 = p.c(priceVal);
            }
            LogisticDTO selectedLogistic2 = deliveryPanelState2.getSelectedLogistic();
            if (selectedLogistic2 == null || (price = selectedLogistic2.f85894f) == null) {
                str = null;
            } else {
                str = price.getCurrency();
            }
            LogisticDTO selectedLogistic3 = deliveryPanelState2.getSelectedLogistic();
            if (!(selectedLogistic3 == null || (logisticTextDTO = selectedLogistic3.f85898j) == null)) {
                str2 = logisticTextDTO.f85905f;
            }
            com.ss.android.ugc.aweme.ecommerce.delivery.a.a("continue", "confirm", f2, str, str2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            ((DmtStatusView) this.this$0.a(R.id.e_c)).setStatus(intValue);
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, LogisticDTO, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, LogisticDTO logisticDTO) {
            boolean z;
            com.bytedance.jedi.arch.i iVar2 = iVar;
            final LogisticDTO logisticDTO2 = logisticDTO;
            h.f.b.l.d(iVar2, "");
            TuxButton tuxButton = (TuxButton) this.this$0.a(R.id.ux);
            h.f.b.l.b(tuxButton, "");
            if (logisticDTO2 != null) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            if (logisticDTO2 != null) {
                iVar2.withState(this.this$0.a(), new h.f.a.b<DeliveryPanelState, z>() {
                    /* class com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b.i.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(53765);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
                    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
                    @Override // h.f.a.b
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState r9) {
                        /*
                        // Method dump skipped, instructions count: 128
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b.i.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            }
            return z.f158842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b$o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ou, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    static final class j extends h.f.b.m implements h.f.a.q<com.bytedance.jedi.arch.i, List<? extends Object>, com.ss.android.ugc.aweme.ecommerce.delivery.b.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(3);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list, com.ss.android.ugc.aweme.ecommerce.delivery.b.a aVar) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list, "");
            h.f.b.l.d(aVar, "");
            iVar2.withState(this.this$0.a(), new h.f.a.b<DeliveryPanelState, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.b.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(53767);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(DeliveryPanelState deliveryPanelState) {
                    DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                    h.f.b.l.d(deliveryPanelState2, "");
                    if (!deliveryPanelState2.canSelectLogistic(this.this$0.this$0.a().f85934a)) {
                        TuxButton tuxButton = (TuxButton) this.this$0.this$0.a(R.id.ux);
                        h.f.b.l.b(tuxButton, "");
                        tuxButton.setVisibility(8);
                    } else {
                        TuxButton tuxButton2 = (TuxButton) this.this$0.this$0.a(R.id.ux);
                        h.f.b.l.b(tuxButton2, "");
                        tuxButton2.setVisibility(0);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
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

    private final View a(Context context, int i2, int i3, int i4, h.f.a.a<z> aVar) {
        LayoutInflater from = LayoutInflater.from(context);
        View view = getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        View a2 = com.a.a(from, R.layout.pk, (ViewGroup) view, false);
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

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
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
