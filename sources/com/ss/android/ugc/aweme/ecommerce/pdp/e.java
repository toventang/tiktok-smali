package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
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
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.e.a;
import com.bytedance.widget.c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class e extends com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b implements ar<com.ss.android.ugc.aweme.base.arch.i>, q {

    /* renamed from: c  reason: collision with root package name */
    public static final c f86485c = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.base.arch.i f86486a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f86487b;

    /* renamed from: i  reason: collision with root package name */
    private final lifecycleAwareLazy f86488i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f86489j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f86490k;

    static {
        Covode.recordClassIndex(54164);
    }

    public final PdpViewModel a() {
        return (PdpViewModel) this.f86488i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void b() {
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final View i() {
        if (this.f86490k == null) {
            this.f86490k = new SparseArray();
        }
        View view = (View) this.f86490k.get(R.id.epv);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.epv);
        this.f86490k.put(R.id.epv, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void j() {
        SparseArray sparseArray = this.f86490k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        j();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(54168);
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
        return this.f86486a;
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

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final i f86494a = new i();

        static {
            Covode.recordClassIndex(54176);
        }

        i() {
        }

        public final void run() {
            com.ss.android.ugc.aweme.video.v.O().B();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54165);
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

    private final void o() {
        if (n()) {
            com.ss.android.ugc.aweme.video.v.O().y();
        }
    }

    private final void p() {
        if (n()) {
            com.ss.android.ugc.aweme.video.v.O().G();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final boolean f() {
        k kVar = a().s;
        if (kVar == null) {
            return false;
        }
        kVar.a("return");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void g() {
        k kVar = a().s;
        if (kVar != null) {
            kVar.a(true);
        }
        super.g();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void h() {
        k kVar = a().s;
        if (kVar != null) {
            kVar.a(false);
        }
        super.h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f.a.b.b bVar = this.f86487b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f86487b = null;
    }

    private final boolean n() {
        IPdpStarter.PdpEnterParam pdpEnterParam = a().f86300a;
        if (pdpEnterParam == null || !pdpEnterParam.getPlayerControl()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void c() {
        k kVar = a().s;
        if (kVar != null) {
            kVar.a("return");
        }
        super.c();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void e() {
        k kVar = a().s;
        if (kVar != null) {
            kVar.a("return");
        }
        super.e();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (a().f86301b && n()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.a(false, getContext()));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (n()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.a(true, getContext()));
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(54166);
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_pdp_PdpFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.pdp.e$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.e$b$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.e.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_PdpFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public e() {
        j jVar = new j(this);
        h.k.c a2 = h.f.b.ab.a(PdpViewModel.class);
        a aVar = new a(a2);
        this.f86488i = new lifecycleAwareLazy(this, aVar, new b(this, aVar, a2, jVar));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void a(boolean z) {
        k kVar = a().s;
        if (kVar != null) {
            kVar.a(false);
        }
        super.a(z);
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f86493a;

        static {
            Covode.recordClassIndex(54175);
        }

        h(e eVar) {
            this.f86493a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            f.a.b.b bVar = this.f86493a.f86487b;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f86493a.f86487b = null;
            if (th instanceof IPdpStarter.b) {
                this.f86493a.a().a((ProductPackStruct) null, Integer.valueOf(((IPdpStarter.b) th).getCode()));
            } else {
                this.f86493a.a().a((ProductPackStruct) null, (Integer) null);
            }
        }
    }

    public final void b(boolean z) {
        if (isResumed() && this.f86489j && n()) {
            if (z) {
                View view = getView();
                if (view != null) {
                    view.post(i.f86494a);
                }
                com.ss.android.ugc.aweme.video.v.O().F();
                return;
            }
            p();
            o();
        }
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        l.d(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (n()) {
            com.ss.android.ugc.aweme.video.i O = com.ss.android.ugc.aweme.video.v.O();
            l.b(O, "");
            boolean o = O.o();
            if (this.f86489j && !o) {
                o();
            }
            p();
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f86491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86492b;

        static {
            Covode.recordClassIndex(54174);
        }

        g(e eVar, IPdpStarter.PdpEnterParam pdpEnterParam) {
            this.f86491a = eVar;
            this.f86492b = pdpEnterParam;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            HashMap<String, Object> trackParams;
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            this.f86491a.a().a(productPackStruct, (Integer) null);
            f.a.b.b bVar = this.f86491a.f86487b;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f86491a.f86487b = null;
            PopUp popUp = productPackStruct.u;
            if (!(popUp == null || popUp.f86322a == null || (trackParams = this.f86492b.getTrackParams()) == null)) {
                this.f86491a.a(popUp, trackParams);
            }
            if (TextUtils.isEmpty(this.f86492b.getChainKey()) && !TextUtils.isEmpty(productPackStruct.v)) {
                HashMap<String, Object> visitReportParams = this.f86492b.getVisitReportParams();
                if (visitReportParams != null) {
                    String str = productPackStruct.v;
                    if (str == null) {
                        l.b();
                    }
                    visitReportParams.put("chain_key", str);
                }
                this.f86492b.setChainKey(productPackStruct.v);
            }
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        IPdpStarter.PdpEnterParam pdpEnterParam = a().f86300a;
        if (pdpEnterParam != null) {
            if (pdpEnterParam.getCollapsible()) {
                if (pdpEnterParam.getCollapsedHeight() != null) {
                    BottomSheetBehavior<View> bottomSheetBehavior = this.f86856d;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.b((int) pdpEnterParam.getCollapsedHeight().floatValue());
                    }
                } else {
                    BottomSheetBehavior<View> bottomSheetBehavior2 = this.f86856d;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.b((int) com.ss.android.ugc.aweme.ecommerce.util.h.a());
                    }
                }
                h();
                BottomSheetBehavior<View> bottomSheetBehavior3 = this.f86856d;
                if (bottomSheetBehavior3 != null) {
                    bottomSheetBehavior3.f52333i = false;
                }
            } else if (pdpEnterParam.getCollapsedHeight() == null) {
                BottomSheetBehavior<View> bottomSheetBehavior4 = this.f86856d;
                if (bottomSheetBehavior4 != null) {
                    bottomSheetBehavior4.b((int) pdpEnterParam.getExpandHeight());
                }
                g();
                a().f86301b = true;
                a().f86302c = true;
                BottomSheetBehavior<View> bottomSheetBehavior5 = this.f86856d;
                if (bottomSheetBehavior5 != null) {
                    bottomSheetBehavior5.f52333i = true;
                }
                this.f86859g = false;
            } else {
                BottomSheetBehavior<View> bottomSheetBehavior6 = this.f86856d;
                if (bottomSheetBehavior6 != null) {
                    bottomSheetBehavior6.b((int) pdpEnterParam.getCollapsedHeight().floatValue());
                }
                h();
                BottomSheetBehavior<View> bottomSheetBehavior7 = this.f86856d;
                if (bottomSheetBehavior7 != null) {
                    bottomSheetBehavior7.f52333i = false;
                }
                this.f86859g = true;
            }
            ViewGroup m2 = m();
            if (m2 != null) {
                com.bytedance.tux.h.i.b(m2, null, Integer.valueOf(com.ss.android.ugc.aweme.ecommerce.util.h.f87568b - ((int) pdpEnterParam.getExpandHeight())), null, null, false, 29);
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        int i2;
        boolean z;
        ProductPackStruct productPackStruct;
        Long l2;
        Long l3;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        long j2;
        long j3;
        int i3;
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
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
        a().a(pdpEnterParam.getFullScreen());
        a().w = false;
        PdpViewModel a2 = a();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i2 = arguments2.getInt("PREFETCH_TYPE");
        } else {
            i2 = 0;
        }
        a2.f86308l = i2;
        PdpViewModel a3 = a();
        if (pdpEnterParam.getFullScreen() || pdpEnterParam.getExpandHeight() >= ((float) (com.ss.android.ugc.aweme.ecommerce.util.h.f87568b - hh.b()))) {
            z = true;
        } else {
            z = false;
        }
        a3.v = z;
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
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                l3 = Long.valueOf(arguments6.getLong("CLICK_TIMESTAMP"));
            } else {
                l3 = null;
            }
            a().a(productPackStruct, (Integer) null);
            k kVar = a().s;
            long j4 = 0;
            if (kVar != null) {
                if (l2 != null) {
                    j3 = l2.longValue();
                } else {
                    j3 = 0;
                }
                kVar.s = j3;
            }
            k kVar2 = a().s;
            if (kVar2 != null) {
                if (l3 != null) {
                    j2 = l3.longValue();
                } else {
                    j2 = 0;
                }
                kVar2.r = j2;
            }
            k kVar3 = a().s;
            if (kVar3 != null) {
                if (l3 != null) {
                    j4 = l3.longValue();
                }
                kVar3.q = j4;
            }
            PopUp popUp = productPackStruct.u;
            if (!(popUp == null || popUp.f86322a == null || (trackParams2 = pdpEnterParam.getTrackParams()) == null)) {
                a(popUp, trackParams2);
            }
            if (productPackStruct.u != null) {
                PopUp popUp2 = productPackStruct.u;
                if (popUp2 == null) {
                    l.b();
                }
                if (popUp2.f86322a != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                    PopUp popUp3 = productPackStruct.u;
                    if (popUp3 == null) {
                        l.b();
                    }
                    a(popUp3, trackParams);
                }
            }
        } else {
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.d a4 = IPdpStarter.a.a().a(pdpEnterParam, true);
            if (a4.f86593d != null) {
                a().a(a4.f86593d, (Integer) null);
            } else {
                this.f86487b = a4.f86592c.a(new g(this, pdpEnterParam), new h(this));
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$e  reason: collision with other inner class name */
    static final class C2084e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(54172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2084e(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(iVar, "");
            if (booleanValue) {
                this.this$0.dismissAllowingStateLoss();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(54169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            int intValue = num.intValue();
            l.d(iVar, "");
            AnonymousClass1 r2 = new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.pdp.e.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(54170);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    a();
                    return z.f158842a;
                }

                public final void a() {
                    a.C1099a.a((androidx.fragment.app.d) this.this$0.this$0).b(false).e(-16777216).c(false).f44923a.d();
                    this.this$0.this$0.b(false);
                }
            };
            AnonymousClass2 r1 = new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.pdp.e.d.AnonymousClass2 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(54171);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    a();
                    return z.f158842a;
                }

                public final void a() {
                    a.C1099a.a((androidx.fragment.app.d) this.this$0.this$0).b(true).a().e(-16777216).c(false).f44923a.d();
                    this.this$0.this$0.b(true);
                }
            };
            if (intValue == 3) {
                this.this$0.g();
                r1.a();
            } else if (intValue == 4) {
                this.this$0.h();
                r2.a();
            } else if (intValue == 5) {
                this.this$0.a(false);
                r2.a();
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(54173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(2);
            this.this$0 = eVar;
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

    static final class j extends h.f.b.m implements h.f.a.m<PdpMainState, Bundle, PdpMainState> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(54177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState, Bundle bundle) {
            PdpMainState pdpMainState2 = pdpMainState;
            l.d(pdpMainState2, "");
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || !arguments.getBoolean("full_screen")) {
                return pdpMainState2;
            }
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 3, null, null, 1.0f, 0, null, 0, false, null, null, null, null, null, 65463, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void a(View view, float f2) {
        l.d(view, "");
        super.a(view, f2);
        if (!Float.isNaN(f2)) {
            a().c(new PdpViewModel.ac(f2));
            Iterator<T> it = a().f86307k.iterator();
            while (it.hasNext()) {
                it.next().invoke(Float.valueOf(f2));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.widget.c a2 = c.a.a(this, getView());
        a2.a(R.id.w7, new PdpBodyWidget(this), com.ss.android.ugc.aweme.ecommerce.pdp.c.d.f86442a);
        a2.a(R.id.bf7, new PdpHeadNavBarWidget(getFragmentManager()), com.ss.android.ugc.aweme.ecommerce.pdp.c.d.f86442a);
        a2.a(R.id.v_, new PdpBottomNavBarWidget(this), com.ss.android.ugc.aweme.ecommerce.pdp.c.d.f86442a);
        f.a.b.b unused = selectSubscribe(a(), f.f86495a, new ah(), new d(this));
        f.a.b.b unused2 = selectSubscribe(a(), g.f86496a, new ah(), new C2084e(this));
        f.a.b.b unused3 = selectSubscribe(a(), h.f86497a, new ah(), new f(this));
        com.ss.android.ugc.aweme.video.i O = com.ss.android.ugc.aweme.video.v.O();
        l.b(O, "");
        this.f86489j = O.o();
    }

    public final void a(PopUp popUp, Map<String, ? extends Object> map) {
        Object obj;
        String obj2;
        String a2 = a(popUp.f86322a, map);
        long j2 = popUp.f86323b;
        Context context = getContext();
        if (context != null) {
            l.b(context, "");
            obj = com.bytedance.ies.xbridge.base.a.b.a(context).a("ug_last_popup_time");
        } else {
            obj = null;
        }
        if (obj == null) {
            SmartRouter.buildRoute(getContext(), a2).open();
            obj = Long.valueOf(System.currentTimeMillis() / 1000);
        } else {
            Class<?> cls = obj.getClass();
            if (l.a(cls, Integer.class)) {
                obj2 = String.valueOf(((Integer) obj).intValue());
            } else if (l.a(cls, Short.class)) {
                obj2 = String.valueOf((int) ((Short) obj).shortValue());
            } else if (l.a(cls, Long.class)) {
                obj2 = String.valueOf(((Long) obj).longValue());
            } else if (l.a(cls, Float.class)) {
                obj2 = String.valueOf(((Float) obj).floatValue());
            } else if (l.a(cls, Double.class)) {
                obj2 = String.valueOf(((Double) obj).doubleValue());
            } else if (l.a(cls, Integer.TYPE)) {
                obj2 = String.valueOf(((Integer) obj).intValue());
            } else if (l.a(cls, Short.TYPE)) {
                obj2 = String.valueOf((int) ((Short) obj).shortValue());
            } else if (l.a(cls, Long.TYPE)) {
                obj2 = String.valueOf(((Long) obj).longValue());
            } else if (l.a(cls, Float.TYPE)) {
                obj2 = String.valueOf(((Float) obj).floatValue());
            } else if (l.a(cls, Double.TYPE)) {
                obj2 = String.valueOf(((Double) obj).doubleValue());
            } else {
                obj2 = obj.toString();
            }
            if (Long.parseLong(obj2) + j2 <= System.currentTimeMillis() / 1000) {
                SmartRouter.buildRoute(getContext(), a2).open();
                obj = Long.valueOf(System.currentTimeMillis() / 1000);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            l.b(context2, "");
            com.bytedance.ies.xbridge.base.a.b.a(context2).a("ug_last_popup_time", obj.toString());
        }
    }

    private static String a(String str, Map<String, ? extends Object> map) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Object obj = map.get("author_id");
        String str13 = null;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (l.a(cls, Integer.class)) {
                str2 = String.valueOf(((Integer) obj).intValue());
            } else if (l.a(cls, Short.class)) {
                str2 = String.valueOf((int) ((Short) obj).shortValue());
            } else if (l.a(cls, Long.class)) {
                str2 = String.valueOf(((Long) obj).longValue());
            } else if (l.a(cls, Float.class)) {
                str2 = String.valueOf(((Float) obj).floatValue());
            } else if (l.a(cls, Double.class)) {
                str2 = String.valueOf(((Double) obj).doubleValue());
            } else if (l.a(cls, Integer.TYPE)) {
                str2 = String.valueOf(((Integer) obj).intValue());
            } else if (l.a(cls, Short.TYPE)) {
                str2 = String.valueOf((int) ((Short) obj).shortValue());
            } else if (l.a(cls, Long.TYPE)) {
                str2 = String.valueOf(((Long) obj).longValue());
            } else if (l.a(cls, Float.TYPE)) {
                str2 = String.valueOf(((Float) obj).floatValue());
            } else if (l.a(cls, Double.TYPE)) {
                str2 = String.valueOf(((Double) obj).doubleValue());
            } else {
                str2 = obj.toString();
            }
        } else {
            str2 = null;
        }
        buildUpon.appendQueryParameter("anchor_id", str2);
        Object obj2 = map.get("source_content_id");
        if (obj2 != null) {
            Class<?> cls2 = obj2.getClass();
            if (l.a(cls2, Integer.class)) {
                str3 = String.valueOf(((Integer) obj2).intValue());
            } else if (l.a(cls2, Short.class)) {
                str3 = String.valueOf((int) ((Short) obj2).shortValue());
            } else if (l.a(cls2, Long.class)) {
                str3 = String.valueOf(((Long) obj2).longValue());
            } else if (l.a(cls2, Float.class)) {
                str3 = String.valueOf(((Float) obj2).floatValue());
            } else if (l.a(cls2, Double.class)) {
                str3 = String.valueOf(((Double) obj2).doubleValue());
            } else if (l.a(cls2, Integer.TYPE)) {
                str3 = String.valueOf(((Integer) obj2).intValue());
            } else if (l.a(cls2, Short.TYPE)) {
                str3 = String.valueOf((int) ((Short) obj2).shortValue());
            } else if (l.a(cls2, Long.TYPE)) {
                str3 = String.valueOf(((Long) obj2).longValue());
            } else if (l.a(cls2, Float.TYPE)) {
                str3 = String.valueOf(((Float) obj2).floatValue());
            } else if (l.a(cls2, Double.TYPE)) {
                str3 = String.valueOf(((Double) obj2).doubleValue());
            } else {
                str3 = obj2.toString();
            }
        } else {
            str3 = null;
        }
        buildUpon.appendQueryParameter("group_id", str3);
        Object obj3 = map.get("entrance_form");
        if (obj3 != null) {
            Class<?> cls3 = obj3.getClass();
            if (l.a(cls3, Integer.class)) {
                str4 = String.valueOf(((Integer) obj3).intValue());
            } else if (l.a(cls3, Short.class)) {
                str4 = String.valueOf((int) ((Short) obj3).shortValue());
            } else if (l.a(cls3, Long.class)) {
                str4 = String.valueOf(((Long) obj3).longValue());
            } else if (l.a(cls3, Float.class)) {
                str4 = String.valueOf(((Float) obj3).floatValue());
            } else if (l.a(cls3, Double.class)) {
                str4 = String.valueOf(((Double) obj3).doubleValue());
            } else if (l.a(cls3, Integer.TYPE)) {
                str4 = String.valueOf(((Integer) obj3).intValue());
            } else if (l.a(cls3, Short.TYPE)) {
                str4 = String.valueOf((int) ((Short) obj3).shortValue());
            } else if (l.a(cls3, Long.TYPE)) {
                str4 = String.valueOf(((Long) obj3).longValue());
            } else if (l.a(cls3, Float.TYPE)) {
                str4 = String.valueOf(((Float) obj3).floatValue());
            } else if (l.a(cls3, Double.TYPE)) {
                str4 = String.valueOf(((Double) obj3).doubleValue());
            } else {
                str4 = obj3.toString();
            }
        } else {
            str4 = null;
        }
        buildUpon.appendQueryParameter("enter_from", str4);
        Object obj4 = map.get("anchor_show_type");
        if (obj4 != null) {
            Class<?> cls4 = obj4.getClass();
            if (l.a(cls4, Integer.class)) {
                str5 = String.valueOf(((Integer) obj4).intValue());
            } else if (l.a(cls4, Short.class)) {
                str5 = String.valueOf((int) ((Short) obj4).shortValue());
            } else if (l.a(cls4, Long.class)) {
                str5 = String.valueOf(((Long) obj4).longValue());
            } else if (l.a(cls4, Float.class)) {
                str5 = String.valueOf(((Float) obj4).floatValue());
            } else if (l.a(cls4, Double.class)) {
                str5 = String.valueOf(((Double) obj4).doubleValue());
            } else if (l.a(cls4, Integer.TYPE)) {
                str5 = String.valueOf(((Integer) obj4).intValue());
            } else if (l.a(cls4, Short.TYPE)) {
                str5 = String.valueOf((int) ((Short) obj4).shortValue());
            } else if (l.a(cls4, Long.TYPE)) {
                str5 = String.valueOf(((Long) obj4).longValue());
            } else if (l.a(cls4, Float.TYPE)) {
                str5 = String.valueOf(((Float) obj4).floatValue());
            } else if (l.a(cls4, Double.TYPE)) {
                str5 = String.valueOf(((Double) obj4).doubleValue());
            } else {
                str5 = obj4.toString();
            }
        } else {
            str5 = null;
        }
        buildUpon.appendQueryParameter("anchor_show_type", str5);
        Object obj5 = map.get("product_source");
        if (obj5 != null) {
            Class<?> cls5 = obj5.getClass();
            if (l.a(cls5, Integer.class)) {
                str6 = String.valueOf(((Integer) obj5).intValue());
            } else if (l.a(cls5, Short.class)) {
                str6 = String.valueOf((int) ((Short) obj5).shortValue());
            } else if (l.a(cls5, Long.class)) {
                str6 = String.valueOf(((Long) obj5).longValue());
            } else if (l.a(cls5, Float.class)) {
                str6 = String.valueOf(((Float) obj5).floatValue());
            } else if (l.a(cls5, Double.class)) {
                str6 = String.valueOf(((Double) obj5).doubleValue());
            } else if (l.a(cls5, Integer.TYPE)) {
                str6 = String.valueOf(((Integer) obj5).intValue());
            } else if (l.a(cls5, Short.TYPE)) {
                str6 = String.valueOf((int) ((Short) obj5).shortValue());
            } else if (l.a(cls5, Long.TYPE)) {
                str6 = String.valueOf(((Long) obj5).longValue());
            } else if (l.a(cls5, Float.TYPE)) {
                str6 = String.valueOf(((Float) obj5).floatValue());
            } else if (l.a(cls5, Double.TYPE)) {
                str6 = String.valueOf(((Double) obj5).doubleValue());
            } else {
                str6 = obj5.toString();
            }
        } else {
            str6 = null;
        }
        buildUpon.appendQueryParameter("product_source", str6);
        Object obj6 = map.get("source_from");
        if (obj6 != null) {
            Class<?> cls6 = obj6.getClass();
            if (l.a(cls6, Integer.class)) {
                str7 = String.valueOf(((Integer) obj6).intValue());
            } else if (l.a(cls6, Short.class)) {
                str7 = String.valueOf((int) ((Short) obj6).shortValue());
            } else if (l.a(cls6, Long.class)) {
                str7 = String.valueOf(((Long) obj6).longValue());
            } else if (l.a(cls6, Float.class)) {
                str7 = String.valueOf(((Float) obj6).floatValue());
            } else if (l.a(cls6, Double.class)) {
                str7 = String.valueOf(((Double) obj6).doubleValue());
            } else if (l.a(cls6, Integer.TYPE)) {
                str7 = String.valueOf(((Integer) obj6).intValue());
            } else if (l.a(cls6, Short.TYPE)) {
                str7 = String.valueOf((int) ((Short) obj6).shortValue());
            } else if (l.a(cls6, Long.TYPE)) {
                str7 = String.valueOf(((Long) obj6).longValue());
            } else if (l.a(cls6, Float.TYPE)) {
                str7 = String.valueOf(((Float) obj6).floatValue());
            } else if (l.a(cls6, Double.TYPE)) {
                str7 = String.valueOf(((Double) obj6).doubleValue());
            } else {
                str7 = obj6.toString();
            }
        } else {
            str7 = null;
        }
        buildUpon.appendQueryParameter("source_from", str7);
        Object obj7 = map.get("source");
        if (obj7 != null) {
            Class<?> cls7 = obj7.getClass();
            if (l.a(cls7, Integer.class)) {
                str8 = String.valueOf(((Integer) obj7).intValue());
            } else if (l.a(cls7, Short.class)) {
                str8 = String.valueOf((int) ((Short) obj7).shortValue());
            } else if (l.a(cls7, Long.class)) {
                str8 = String.valueOf(((Long) obj7).longValue());
            } else if (l.a(cls7, Float.class)) {
                str8 = String.valueOf(((Float) obj7).floatValue());
            } else if (l.a(cls7, Double.class)) {
                str8 = String.valueOf(((Double) obj7).doubleValue());
            } else if (l.a(cls7, Integer.TYPE)) {
                str8 = String.valueOf(((Integer) obj7).intValue());
            } else if (l.a(cls7, Short.TYPE)) {
                str8 = String.valueOf((int) ((Short) obj7).shortValue());
            } else if (l.a(cls7, Long.TYPE)) {
                str8 = String.valueOf(((Long) obj7).longValue());
            } else if (l.a(cls7, Float.TYPE)) {
                str8 = String.valueOf(((Float) obj7).floatValue());
            } else if (l.a(cls7, Double.TYPE)) {
                str8 = String.valueOf(((Double) obj7).doubleValue());
            } else {
                str8 = obj7.toString();
            }
        } else {
            str8 = null;
        }
        buildUpon.appendQueryParameter("source", str8);
        Object obj8 = map.get("product_id");
        if (obj8 != null) {
            Class<?> cls8 = obj8.getClass();
            if (l.a(cls8, Integer.class)) {
                str9 = String.valueOf(((Integer) obj8).intValue());
            } else if (l.a(cls8, Short.class)) {
                str9 = String.valueOf((int) ((Short) obj8).shortValue());
            } else if (l.a(cls8, Long.class)) {
                str9 = String.valueOf(((Long) obj8).longValue());
            } else if (l.a(cls8, Float.class)) {
                str9 = String.valueOf(((Float) obj8).floatValue());
            } else if (l.a(cls8, Double.class)) {
                str9 = String.valueOf(((Double) obj8).doubleValue());
            } else if (l.a(cls8, Integer.TYPE)) {
                str9 = String.valueOf(((Integer) obj8).intValue());
            } else if (l.a(cls8, Short.TYPE)) {
                str9 = String.valueOf((int) ((Short) obj8).shortValue());
            } else if (l.a(cls8, Long.TYPE)) {
                str9 = String.valueOf(((Long) obj8).longValue());
            } else if (l.a(cls8, Float.TYPE)) {
                str9 = String.valueOf(((Float) obj8).floatValue());
            } else if (l.a(cls8, Double.TYPE)) {
                str9 = String.valueOf(((Double) obj8).doubleValue());
            } else {
                str9 = obj8.toString();
            }
        } else {
            str9 = null;
        }
        buildUpon.appendQueryParameter("product_id", str9);
        Object obj9 = map.get("is_self");
        if (obj9 != null) {
            Class<?> cls9 = obj9.getClass();
            if (l.a(cls9, Integer.class)) {
                str10 = String.valueOf(((Integer) obj9).intValue());
            } else if (l.a(cls9, Short.class)) {
                str10 = String.valueOf((int) ((Short) obj9).shortValue());
            } else if (l.a(cls9, Long.class)) {
                str10 = String.valueOf(((Long) obj9).longValue());
            } else if (l.a(cls9, Float.class)) {
                str10 = String.valueOf(((Float) obj9).floatValue());
            } else if (l.a(cls9, Double.class)) {
                str10 = String.valueOf(((Double) obj9).doubleValue());
            } else if (l.a(cls9, Integer.TYPE)) {
                str10 = String.valueOf(((Integer) obj9).intValue());
            } else if (l.a(cls9, Short.TYPE)) {
                str10 = String.valueOf((int) ((Short) obj9).shortValue());
            } else if (l.a(cls9, Long.TYPE)) {
                str10 = String.valueOf(((Long) obj9).longValue());
            } else if (l.a(cls9, Float.TYPE)) {
                str10 = String.valueOf(((Float) obj9).floatValue());
            } else if (l.a(cls9, Double.TYPE)) {
                str10 = String.valueOf(((Double) obj9).doubleValue());
            } else {
                str10 = obj9.toString();
            }
        } else {
            str10 = null;
        }
        buildUpon.appendQueryParameter("is_self", str10);
        Object obj10 = map.get("is_single_anchor");
        if (obj10 != null) {
            Class<?> cls10 = obj10.getClass();
            if (l.a(cls10, Integer.class)) {
                str11 = String.valueOf(((Integer) obj10).intValue());
            } else if (l.a(cls10, Short.class)) {
                str11 = String.valueOf((int) ((Short) obj10).shortValue());
            } else if (l.a(cls10, Long.class)) {
                str11 = String.valueOf(((Long) obj10).longValue());
            } else if (l.a(cls10, Float.class)) {
                str11 = String.valueOf(((Float) obj10).floatValue());
            } else if (l.a(cls10, Double.class)) {
                str11 = String.valueOf(((Double) obj10).doubleValue());
            } else if (l.a(cls10, Integer.TYPE)) {
                str11 = String.valueOf(((Integer) obj10).intValue());
            } else if (l.a(cls10, Short.TYPE)) {
                str11 = String.valueOf((int) ((Short) obj10).shortValue());
            } else if (l.a(cls10, Long.TYPE)) {
                str11 = String.valueOf(((Long) obj10).longValue());
            } else if (l.a(cls10, Float.TYPE)) {
                str11 = String.valueOf(((Float) obj10).floatValue());
            } else if (l.a(cls10, Double.TYPE)) {
                str11 = String.valueOf(((Double) obj10).doubleValue());
            } else {
                str11 = obj10.toString();
            }
        } else {
            str11 = null;
        }
        buildUpon.appendQueryParameter("is_single_anchor", str11);
        Object obj11 = map.get("is_ad");
        if (obj11 != null) {
            Class<?> cls11 = obj11.getClass();
            if (l.a(cls11, Integer.class)) {
                str12 = String.valueOf(((Integer) obj11).intValue());
            } else if (l.a(cls11, Short.class)) {
                str12 = String.valueOf((int) ((Short) obj11).shortValue());
            } else if (l.a(cls11, Long.class)) {
                str12 = String.valueOf(((Long) obj11).longValue());
            } else if (l.a(cls11, Float.class)) {
                str12 = String.valueOf(((Float) obj11).floatValue());
            } else if (l.a(cls11, Double.class)) {
                str12 = String.valueOf(((Double) obj11).doubleValue());
            } else if (l.a(cls11, Integer.TYPE)) {
                str12 = String.valueOf(((Integer) obj11).intValue());
            } else if (l.a(cls11, Short.TYPE)) {
                str12 = String.valueOf((int) ((Short) obj11).shortValue());
            } else if (l.a(cls11, Long.TYPE)) {
                str12 = String.valueOf(((Long) obj11).longValue());
            } else if (l.a(cls11, Float.TYPE)) {
                str12 = String.valueOf(((Float) obj11).floatValue());
            } else if (l.a(cls11, Double.TYPE)) {
                str12 = String.valueOf(((Double) obj11).doubleValue());
            } else {
                str12 = obj11.toString();
            }
        } else {
            str12 = null;
        }
        buildUpon.appendQueryParameter("is_ad", str12);
        Object obj12 = map.get("ad_id");
        if (obj12 != null) {
            Class<?> cls12 = obj12.getClass();
            if (l.a(cls12, Integer.class)) {
                str13 = String.valueOf(((Integer) obj12).intValue());
            } else if (l.a(cls12, Short.class)) {
                str13 = String.valueOf((int) ((Short) obj12).shortValue());
            } else if (l.a(cls12, Long.class)) {
                str13 = String.valueOf(((Long) obj12).longValue());
            } else if (l.a(cls12, Float.class)) {
                str13 = String.valueOf(((Float) obj12).floatValue());
            } else if (l.a(cls12, Double.class)) {
                str13 = String.valueOf(((Double) obj12).doubleValue());
            } else if (l.a(cls12, Integer.TYPE)) {
                str13 = String.valueOf(((Integer) obj12).intValue());
            } else if (l.a(cls12, Short.TYPE)) {
                str13 = String.valueOf((int) ((Short) obj12).shortValue());
            } else if (l.a(cls12, Long.TYPE)) {
                str13 = String.valueOf(((Long) obj12).longValue());
            } else if (l.a(cls12, Float.TYPE)) {
                str13 = String.valueOf(((Float) obj12).floatValue());
            } else if (l.a(cls12, Double.TYPE)) {
                str13 = String.valueOf(((Double) obj12).doubleValue());
            } else {
                str13 = obj12.toString();
            }
        }
        buildUpon.appendQueryParameter("ad_id", str13);
        String builder = buildUpon.toString();
        l.b(builder, "");
        return builder;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b
    public final void a(int i2, int i3, boolean z) {
        k kVar;
        String str;
        String str2;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        if (i3 == 5 || i3 == 3 || i3 == 4) {
            a().a(i3);
        }
        if (i3 == 3 && (pdpEnterParam = a().f86300a) != null && !pdpEnterParam.getCollapsible() && pdpEnterParam.getCollapsedHeight() != null) {
            BottomSheetBehavior<View> bottomSheetBehavior = this.f86856d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.b((int) pdpEnterParam.getExpandHeight());
            }
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.f86856d;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.f52333i = true;
            }
            this.f86859g = false;
        }
        if (i3 == 3) {
            if (i2 == 4) {
                k kVar2 = a().s;
                if (kVar2 != null) {
                    kVar2.c(true);
                }
                k kVar3 = a().s;
                if (kVar3 != null) {
                    kVar3.a(false, a().a());
                }
                k kVar4 = a().s;
                if (kVar4 != null) {
                    kVar4.c("halftofull");
                }
                ProductPackStruct productPackStruct = a().f86303d;
                if (productPackStruct == null || (str2 = productPackStruct.f86638b) == null) {
                    str2 = "";
                }
                l.d(str2, "");
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.b(str2, 2));
            }
        } else if (i3 == 4) {
            if (i2 == 3) {
                k kVar5 = a().s;
                if (kVar5 != null) {
                    kVar5.c(false);
                }
                k kVar6 = a().s;
                if (kVar6 != null) {
                    kVar6.a(true, a().a());
                }
                k kVar7 = a().s;
                if (kVar7 != null) {
                    kVar7.c("fulltohalf");
                }
                ProductPackStruct productPackStruct2 = a().f86303d;
                if (productPackStruct2 == null || (str = productPackStruct2.f86638b) == null) {
                    str = "";
                }
                l.d(str, "");
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.b(str, 3));
            }
        } else if (i3 == 5 && i2 == 4 && z && (kVar = a().s) != null) {
            kVar.c("halftoquit");
        }
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
