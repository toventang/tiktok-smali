package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
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
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.base.arch.i;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.ab;
import h.f.b.l;
import h.h;
import h.k.k;
import h.m.p;
import h.z;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.ecommerce.common.a.a implements ar<i>, q {

    /* renamed from: b  reason: collision with root package name */
    public static final b f85033b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f85034a = new i();

    /* renamed from: c  reason: collision with root package name */
    private final h f85035c;

    /* renamed from: d  reason: collision with root package name */
    private long f85036d = SystemClock.elapsedRealtime();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f85037e;

    static {
        Covode.recordClassIndex(53155);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final View a(int i2) {
        if (this.f85037e == null) {
            this.f85037e = new SparseArray();
        }
        View view = (View) this.f85037e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85037e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void a() {
        SparseArray sparseArray = this.f85037e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final OrderSubmitViewModel b() {
        return (OrderSubmitViewModel) this.f85035c.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(53157);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ i d() {
        return this.f85034a;
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

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(53160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismissAllowingStateLoss();
            return z.f158842a;
        }
    }

    public a() {
        super((byte) 0);
        h.k.c a2 = ab.a(OrderSubmitViewModel.class);
        this.f85035c = h.i.a((h.f.a.a) new C2035a(this, a2, a2));
    }

    public final void c() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.clo);
        l.b(tuxTextView, "");
        tuxTextView.setText(getString(R.string.fwz, Integer.valueOf(((DmtEditText) a(R.id.cln)).length())));
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(b().p, "return", (Boolean) null, (Boolean) null, b().j(), Long.valueOf(SystemClock.elapsedRealtime() - this.f85036d), "message", "order_submit", 268);
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.f84786b = SystemClock.elapsedRealtime();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a$a  reason: collision with other inner class name */
    public static final class C2035a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ Fragment $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2035a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_view_MessageEditDialogFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)     // Catch:{ as -> 0x002a }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_view_MessageEditDialogFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.C2035a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_view_MessageEditDialogFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.ecommerce.util.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f85073a;

        static {
            Covode.recordClassIndex(53161);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f85073a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.util.l
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            this.f85073a.c();
        }
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85069a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f85070b;

        static {
            Covode.recordClassIndex(53158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(700);
            this.f85070b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("save", "confirm", this.f85070b.b().j(), "message", (String) null, (Boolean) null, (String) null, (Boolean) null, 240);
                OrderSubmitViewModel b2 = this.f85070b.b();
                DmtEditText dmtEditText = (DmtEditText) this.f85070b.a(R.id.cln);
                l.b(dmtEditText, "");
                String valueOf = String.valueOf(dmtEditText.getText());
                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = p.b((CharSequence) valueOf).toString();
                l.d(obj, "");
                b2.c(new OrderSubmitViewModel.ab(obj));
                b2.t = obj;
                this.f85070b.dismissAllowingStateLoss();
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(53159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (!bool.booleanValue() && ((DmtEditText) this.this$0.a(R.id.cln)).hasFocus()) {
                ((DmtEditText) this.this$0.a(R.id.cln)).clearFocus();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        l.d(view, "");
        d dVar = new d(this);
        l.d(dVar, "");
        this.f85710h = dVar;
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        String string = getString(R.string.fxg);
        l.b(string, "");
        TuxNavBar.a a2 = aVar.a(gVar.a(string));
        com.bytedance.tux.navigation.a.b a3 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small);
        a3.f45194b = true;
        ((TuxNavBar) a(R.id.clq)).setNavActions(a2.b(a3.a((h.f.a.a<z>) new e(this))));
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("save", "confirm", b().j(), "message", (String) null, (Boolean) null, 112);
        ((TuxNavBar) a(R.id.clq)).a(true);
        TuxButton tuxButton = (TuxButton) a(R.id.clp);
        l.b(tuxButton, "");
        tuxButton.setOnClickListener(new c(this));
        com.ss.android.ugc.aweme.ecommerce.util.c.a((EditText) a(R.id.cln), 200);
        ((DmtEditText) a(R.id.cln)).addTextChangedListener(new f(this));
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("message")) == null) {
            str = "";
        }
        l.b(str, "");
        ((DmtEditText) a(R.id.cln)).setText(str);
        c();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(false, b().j(), "message", "order_submit", null, null, null, 112);
        b().k();
        return com.a.a(layoutInflater, R.layout.rh, viewGroup, false);
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
