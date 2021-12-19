package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ab;
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
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.widget.FixedRecyclerView;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class a extends Fragment implements ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q {

    /* renamed from: b  reason: collision with root package name */
    public static final e f87622b = new e((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f87623a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: c  reason: collision with root package name */
    private final h.h f87624c;

    /* renamed from: d  reason: collision with root package name */
    private final lifecycleAwareLazy f87625d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f87626e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f87627f;

    /* renamed from: g  reason: collision with root package name */
    private final h.f.a.a<z> f87628g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f87629h;

    public static final class c extends h.f.b.m implements h.f.a.m<DistrictPickerState, Bundle, DistrictPickerState> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(55084);
        }

        public c() {
            super(2);
        }

        public final DistrictPickerState invoke(DistrictPickerState districtPickerState, Bundle bundle) {
            h.f.b.l.c(districtPickerState, "");
            return districtPickerState;
        }
    }

    final /* synthetic */ class r implements i.c {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f87639a;

        static {
            Covode.recordClassIndex(55103);
        }

        r(h.f.a.a aVar) {
            this.f87639a = aVar;
        }

        @Override // androidx.fragment.app.i.c
        public final /* synthetic */ void a() {
            h.f.b.l.b(this.f87639a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(55081);
    }

    public final View a(int i2) {
        if (this.f87629h == null) {
            this.f87629h = new SparseArray();
        }
        View view = (View) this.f87629h.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f87629h.put(i2, findViewById);
        return findViewById;
    }

    public final DistrictPickerWrapperViewModel a() {
        return (DistrictPickerWrapperViewModel) this.f87624c.getValue();
    }

    public final DistrictPickerViewModel b() {
        return (DistrictPickerViewModel) this.f87625d.getValue();
    }

    public final RegionAdapter c() {
        return (RegionAdapter) this.f87626e.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class e {
        static {
            Covode.recordClassIndex(55087);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f87623a;
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

    public static final class b extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(55083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h.k.c cVar) {
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

    static final class q extends h.f.b.m implements h.f.a.a<RegionAdapter> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RegionAdapter invoke() {
            RegionAdapter regionAdapter = new RegionAdapter(this.this$0);
            regionAdapter.d(false);
            return regionAdapter;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            DistrictPickerViewModel b2 = this.this$0.b();
            this.this$0.getContext();
            b2.g();
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            DistrictPickerViewModel b2 = this.this$0.b();
            this.this$0.getContext();
            b2.g();
            return z.f158842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView() {
        /*
            r3 = this;
            super.onDestroyView()
            androidx.fragment.app.i r2 = r3.getFragmentManager()
            if (r2 == 0) goto L_0x0018
            h.f.a.a<h.z> r1 = r3.f87628g
            if (r1 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r r0 = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r
            r0.<init>(r1)
            r1 = r0
        L_0x0013:
            androidx.fragment.app.i$c r1 = (androidx.fragment.app.i.c) r1
            r2.b(r1)
        L_0x0018:
            android.util.SparseArray r0 = r3.f87629h
            if (r0 == 0) goto L_0x001f
            r0.clear()
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a.onDestroyView():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a aVar = a().f87693a;
        if (aVar != null) {
            aVar.f87620c = SystemClock.elapsedRealtime();
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<DistrictPickerViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(55085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPicker$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$d$1 r0 = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$d$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPicker$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar) {
            super(0);
            this.this$0 = aVar;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$a  reason: collision with other inner class name */
    public static final class C2117a extends h.f.b.m implements h.f.a.a<DistrictPickerWrapperViewModel> {
        final /* synthetic */ Fragment $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(55082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2117a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPicker$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)     // Catch:{ as -> 0x002a }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPicker$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a.C2117a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_fragment_RegionPicker$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public a() {
        h.k.c a2 = h.f.b.ab.a(DistrictPickerWrapperViewModel.class);
        this.f87624c = h.i.a((h.f.a.a) new C2117a(this, a2, a2));
        h.k.c a3 = h.f.b.ab.a(DistrictPickerViewModel.class);
        b bVar = new b(a3);
        this.f87625d = new lifecycleAwareLazy(this, bVar, new d(this, bVar, a3, c.INSTANCE));
        this.f87626e = h.i.a((h.f.a.a) new q(this));
        this.f87628g = new o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i2;
        List<Fragment> f2;
        List<Fragment> f3;
        super.onDestroy();
        androidx.fragment.app.i fragmentManager = getFragmentManager();
        int i3 = 0;
        if (fragmentManager == null || (f3 = fragmentManager.f()) == null) {
            i2 = 0;
        } else {
            i2 = f3.size();
        }
        androidx.fragment.app.i fragmentManager2 = getFragmentManager();
        if (!(fragmentManager2 == null || (f2 = fragmentManager2.f()) == null)) {
            for (T t : f2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h.a.n.a();
                }
                if (h.f.b.l.a((Object) t, (Object) this) && i3 == i2 - 1) {
                    a("return");
                }
                i3 = i4;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        androidx.fragment.app.i fragmentManager;
        int i2;
        List<Fragment> f2;
        List<Fragment> f3;
        super.onStop();
        if (ActivityStack.isAppBackGround() && (fragmentManager = getFragmentManager()) != null) {
            List<Fragment> f4 = fragmentManager.f();
            int i3 = 0;
            if (!(f4 == null || f4.isEmpty())) {
                androidx.fragment.app.i fragmentManager2 = getFragmentManager();
                if (fragmentManager2 == null || (f3 = fragmentManager2.f()) == null) {
                    i2 = 0;
                } else {
                    i2 = f3.size();
                }
                androidx.fragment.app.i fragmentManager3 = getFragmentManager();
                if (!(fragmentManager3 == null || (f2 = fragmentManager3.f()) == null)) {
                    for (T t : f2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            h.a.n.a();
                        }
                        if (h.f.b.l.a((Object) t, (Object) this) && i3 == i2 - 1) {
                            a("close");
                        }
                        i3 = i4;
                    }
                }
            }
        }
    }

    public static final class f extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87630a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f87631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f87632c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f87633d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f87634e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f87635f;

        static {
            Covode.recordClassIndex(55088);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f87635f.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(int i2, Context context, int i3, int i4, h.f.a.a aVar) {
            super(700);
            this.f87631b = i2;
            this.f87632c = context;
            this.f87633d = i3;
            this.f87634e = i4;
            this.f87635f = aVar;
        }
    }

    public static final class m implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f87638a;

        static {
            Covode.recordClassIndex(55098);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(a aVar) {
            this.f87638a = aVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            this.f87638a.a().c(DistrictPickerWrapperViewModel.a.f87694a);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f87638a.a("return");
            androidx.fragment.app.i fragmentManager = this.f87638a.getFragmentManager();
            if (fragmentManager != null) {
                h.f.b.l.b(fragmentManager, "");
                if (fragmentManager.f().size() > 1) {
                    fragmentManager.c();
                } else {
                    this.f87638a.a().c(DistrictPickerWrapperViewModel.e.f87696a);
                }
            }
        }
    }

    public static final class l extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87636a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f87637b;

        static {
            Covode.recordClassIndex(55095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(a aVar) {
            super(700);
            this.f87637b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                a aVar = this.f87637b;
                aVar.withState(aVar.b(), new C2118a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$l$a  reason: collision with other inner class name */
        static final class C2118a extends h.f.b.m implements h.f.a.b<DistrictPickerState, z> {
            final /* synthetic */ l this$0;

            static {
                Covode.recordClassIndex(55096);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2118a(l lVar) {
                super(1);
                this.this$0 = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(DistrictPickerState districtPickerState) {
                DistrictPickerState districtPickerState2 = districtPickerState;
                h.f.b.l.d(districtPickerState2, "");
                if (districtPickerState2.getSelectedDistrict() != null) {
                    DistrictPickerWrapperViewModel a2 = this.this$0.f87637b.a();
                    ArrayList<Region> a3 = this.this$0.f87637b.b().a(districtPickerState2.getSelectedDistrict());
                    h.f.b.l.d(a3, "");
                    a2.c(new DistrictPickerWrapperViewModel.b(a3));
                    this.this$0.f87637b.withState(this.this$0.f87637b.b(), new h.f.a.b<DistrictPickerState, z>(this) {
                        /* class com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a.l.C2118a.AnonymousClass1 */
                        final /* synthetic */ C2118a this$0;

                        static {
                            Covode.recordClassIndex(55097);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(DistrictPickerState districtPickerState) {
                            DistrictPickerState districtPickerState2 = districtPickerState;
                            String str = "";
                            h.f.b.l.d(districtPickerState2, str);
                            com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a aVar = this.this$0.this$0.f87637b.a().f87693a;
                            if (aVar == null) {
                                return null;
                            }
                            String titleEn = districtPickerState2.getTitleEn();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(aVar.f87618a);
                            Object obj = linkedHashMap.get("page_name");
                            if (obj == null) {
                                obj = str;
                            }
                            linkedHashMap.put("previous_page", obj);
                            if (titleEn != null) {
                                str = titleEn;
                            }
                            linkedHashMap.put("page_name", str);
                            linkedHashMap.put("button_name", "save");
                            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_click", linkedHashMap);
                            return z.f158842a;
                        }
                    });
                }
                return z.f158842a;
            }
        }
    }

    public final void a(String str) {
        withState(b(), new n(this, str));
    }

    static final class p extends h.f.b.m implements h.f.a.b<DistrictPickerWrapperState, Animation> {
        final /* synthetic */ boolean $enter;
        final /* synthetic */ int $nextAnim;
        final /* synthetic */ int $transit;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar, int i2, boolean z, int i3) {
            super(1);
            this.this$0 = aVar;
            this.$transit = i2;
            this.$enter = z;
            this.$nextAnim = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Animation invoke(DistrictPickerWrapperState districtPickerWrapperState) {
            DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
            h.f.b.l.d(districtPickerWrapperState2, "");
            if (!districtPickerWrapperState2.getDone() && !districtPickerWrapperState2.getTitleBarBack() && !districtPickerWrapperState2.getPhysicalBack()) {
                return a.super.onCreateAnimation(this.$transit, this.$enter, this.$nextAnim);
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            return translateAnimation;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<DistrictPickerState, z> {
        final /* synthetic */ String $quitType;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$quitType = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState r14) {
            /*
            // Method dump skipped, instructions count: 224
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a.n.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            b().f87688e.a(DistrictPickerViewModel.f87683a[1], Integer.valueOf(arguments.getInt("parent_id")));
            b().f87685b = arguments.getStringArray("geoname_ids");
            b().f87686c = (OrderSKUDTO) arguments.getParcelable("order_sku");
            b().f87687d.a(DistrictPickerViewModel.f87683a[0], Integer.valueOf(arguments.getInt("number_of_remaining_level", Integer.MAX_VALUE)));
            this.f87627f = arguments.getBoolean("show_back_icon");
        }
        DistrictPickerViewModel b2 = b();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (arrayList = arguments2.getParcelableArrayList("current_selected_region_list")) == null) {
            arrayList = new ArrayList();
        }
        h.f.b.l.d(arrayList, "");
        b2.f87689f = new ArrayList<>(arrayList);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list, "");
            iVar2.withState(this.this$0.b(), new h.f.a.b<DistrictPickerState, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(55093);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(DistrictPickerState districtPickerState) {
                    int i2;
                    DistrictPickerState districtPickerState2 = districtPickerState;
                    String str = "";
                    h.f.b.l.d(districtPickerState2, str);
                    TuxButton tuxButton = (TuxButton) this.this$0.this$0.a(R.id.aoi);
                    h.f.b.l.b(tuxButton, str);
                    if (this.this$0.this$0.b().b()) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    tuxButton.setVisibility(i2);
                    ((com.bytedance.ies.dmt.ui.titlebar.a) this.this$0.this$0.a(R.id.elv)).setTitle(districtPickerState2.getTitle());
                    this.this$0.this$0.c().a(districtPickerState2.getDistrictList());
                    if (districtPickerState2.getTitleEn().length() > 0) {
                        com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a aVar = this.this$0.this$0.a().f87693a;
                        if (aVar != null) {
                            String titleEn = districtPickerState2.getTitleEn();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(aVar.f87618a);
                            Object obj = linkedHashMap.get("page_name");
                            if (obj == null) {
                                obj = str;
                            }
                            linkedHashMap.put("previous_page", obj);
                            if (titleEn != null) {
                                str = titleEn;
                            }
                            linkedHashMap.put("page_name", str);
                            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_page", linkedHashMap);
                        }
                        com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a aVar2 = this.this$0.this$0.a().f87693a;
                        if (aVar2 != null) {
                            aVar2.f87620c = SystemClock.elapsedRealtime();
                        }
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(2);
            this.this$0 = aVar;
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

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, District, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
            if (r10 == null) goto L_0x0050;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r12, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District r13) {
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a$r] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i2, boolean z, int i3) {
        return (Animation) withState(a(), new p(this, i2, z, i3));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.qj, viewGroup, false);
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
        tuxButton.setOnClickListener(new f(i4, context, i2, i3, aVar));
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
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
