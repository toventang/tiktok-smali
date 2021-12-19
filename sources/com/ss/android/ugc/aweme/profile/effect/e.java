package com.ss.android.ugc.aweme.profile.effect;

import android.content.Context;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.profile.ui.as;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.z;
import java.util.List;

public class e extends cs implements ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q, as {

    /* renamed from: d  reason: collision with root package name */
    public static final d f116307d = new d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f116308a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    public d f116309b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f116310c;

    /* renamed from: e  reason: collision with root package name */
    private final lifecycleAwareLazy f116311e;

    /* renamed from: j  reason: collision with root package name */
    private boolean f116312j;

    /* renamed from: k  reason: collision with root package name */
    private String f116313k;

    /* renamed from: l  reason: collision with root package name */
    private String f116314l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f116315m;
    private boolean n;
    private boolean o;
    private SparseArray p;

    public static final class b extends h.f.b.m implements h.f.a.m<EffectProfileState, Bundle, EffectProfileState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(75090);
        }

        public b() {
            super(2);
        }

        public final EffectProfileState invoke(EffectProfileState effectProfileState, Bundle bundle) {
            h.f.b.l.c(effectProfileState, "");
            return effectProfileState;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(75095);
        }

        public f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* bridge */ /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.sticker.model.g> list) {
            invoke(iVar, list);
            return z.f158842a;
        }

        public final void invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.sticker.model.g> list) {
            h.f.b.l.c(list, "");
        }
    }

    final /* synthetic */ class q implements h.a {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f116330a;

        static {
            Covode.recordClassIndex(75106);
        }

        q(h.f.a.a aVar) {
            this.f116330a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final /* synthetic */ void l() {
            h.f.b.l.b(this.f116330a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(75088);
    }

    public final View a(int i2) {
        if (this.p == null) {
            this.p = new SparseArray();
        }
        View view = (View) this.p.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.p.put(i2, findViewById);
        return findViewById;
    }

    public final EffectProfileListViewModel a() {
        return (EffectProfileListViewModel) this.f116311e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void g() {
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(75093);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    public static final class g implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.sticker.model.g, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f116317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f116318b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f116319c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f116320d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f116321e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> f116322f;

        static {
            Covode.recordClassIndex(75096);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f116320d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f116321e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> c() {
            return this.f116322f;
        }

        public g(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f116317a = bVar;
            this.f116318b = mVar;
            this.f116319c = mVar2;
            this.f116320d = bVar;
            this.f116321e = mVar;
            this.f116322f = mVar2;
        }
    }

    public static final class h implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.sticker.model.g, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f116323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f116324b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f116325c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f116326d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f116327e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> f116328f;

        static {
            Covode.recordClassIndex(75097);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f116326d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f116327e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> c() {
            return this.f116328f;
        }

        public h(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f116323a = bVar;
            this.f116324b = mVar;
            this.f116325c = mVar2;
            this.f116326d = bVar;
            this.f116327e = mVar;
            this.f116328f = mVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final boolean cb_() {
        return this.f116310c;
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f116308a;
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        return a(R.id.drv);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(75089);
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

    static final /* synthetic */ class i extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(75098);
        }

        i(EffectProfileListViewModel effectProfileListViewModel) {
            super(0, effectProfileListViewModel, EffectProfileListViewModel.class, "loadMore", "loadMore()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((ListViewModel) this.receiver).l();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final void bM_() {
        if (this.f116315m || this.n || this.o) {
            c();
        } else {
            a().k();
        }
    }

    public final void c() {
        if (ab_()) {
            h();
            ((DmtStatusView) a(R.id.e_o)).g();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.as
    public final boolean k() {
        if (!ab_()) {
            return false;
        }
        ((RecyclerView) a(R.id.drv)).b(0);
        a().k();
        return true;
    }

    public static final class c extends h.f.b.m implements h.f.a.a<EffectProfileListViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(75091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_profile_effect_EffectProfileListFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel> r0 = com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.profile.effect.e$c$1 r0 = new com.ss.android.ugc.aweme.profile.effect.e$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.effect.e.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_profile_effect_EffectProfileListFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public e() {
        h.k.c a2 = h.f.b.ab.a(EffectProfileListViewModel.class);
        a aVar = new a(a2);
        this.f116311e = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
        this.f116310c = true;
    }

    private final void h() {
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        a2.b(i()).c(j());
        ((DmtStatusView) a(R.id.e_o)).d();
        ((DmtStatusView) a(R.id.e_o)).setBuilder(a2);
    }

    private final View i() {
        int i2;
        int i3;
        if (this.f116315m) {
            i2 = R.string.ewz;
            i3 = R.string.ewy;
        } else {
            if (this.n) {
                i2 = R.string.ex1;
            } else if (this.f116312j) {
                i2 = R.string.ex5;
            } else {
                i2 = R.string.ex3;
            }
            if (this.n) {
                i3 = R.string.ex0;
            } else if (this.f116312j) {
                i3 = R.string.ex4;
            } else {
                i3 = R.string.ex2;
            }
        }
        MtEmptyView a2 = MtEmptyView.a(getContext());
        a2.setStatus(new d.a(getContext()).b(i2).c(i3).f33648a);
        h.f.b.l.b(a2, "");
        return a2;
    }

    private final View j() {
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        Context context2 = getContext();
        if (context2 == null) {
            h.f.b.l.b();
        }
        tuxTextView.setTextColor(androidx.core.content.b.c(context2, R.color.c4));
        tuxTextView.setText(R.string.cyv);
        tuxTextView.setOnClickListener(new View$OnClickListenerC2969e(this));
        return tuxTextView;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void b(boolean z) {
        this.f116315m = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void c(boolean z) {
        this.n = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void d_(boolean z) {
        this.o = z;
    }

    public static final class k extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f116329e;

        static {
            Covode.recordClassIndex(75100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(e eVar) {
            this.f116329e = eVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            d dVar = this.f116329e.f116309b;
            if (dVar == null) {
                h.f.b.l.b();
            }
            if (i2 < dVar.a().f39423c.size()) {
                return 1;
            }
            return 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.effect.e$e  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2969e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f116316a;

        static {
            Covode.recordClassIndex(75094);
        }

        View$OnClickListenerC2969e(e eVar) {
            this.f116316a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f116316a.a().k();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(75101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            this.this$0.f116310c = false;
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.f116312j) {
            k();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(75103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            d dVar = this.this$0.f116309b;
            if (dVar == null) {
                h.f.b.l.b();
            }
            dVar.ag_();
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(75102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            this.this$0.f116310c = true;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.sticker.model.g>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(75104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.sticker.model.g> list) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list, "");
            d dVar = this.this$0.f116309b;
            if (dVar == null) {
                h.f.b.l.b();
            }
            dVar.ai_();
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(75105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            d dVar = this.this$0.f116309b;
            if (dVar == null) {
                h.f.b.l.b();
            }
            dVar.ai_();
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, ListState<com.ss.android.ugc.aweme.sticker.model.g, com.bytedance.jedi.arch.ext.list.o>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(75099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, ListState<com.ss.android.ugc.aweme.sticker.model.g, com.bytedance.jedi.arch.ext.list.o> listState) {
            boolean z;
            ListState<com.ss.android.ugc.aweme.sticker.model.g, com.bytedance.jedi.arch.ext.list.o> listState2 = listState;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(listState2, "");
            List<com.ss.android.ugc.aweme.sticker.model.g> list = listState2.getList();
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
            } else if ((listState2.getRefresh() instanceof com.bytedance.jedi.arch.f) || (listState2.getLoadMore() instanceof com.bytedance.jedi.arch.f)) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).h();
            } else {
                this.this$0.c();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void a(String str, String str2) {
        if (!TextUtils.equals(this.f116313k, str) && !TextUtils.equals(this.f116314l, str2)) {
            this.f116310c = true;
        }
        this.f116313k = str;
        this.f116314l = str2;
        try {
            a().a(this.f116312j, this.f116313k, this.f116314l);
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f116312j = arguments.getBoolean("is_me", false);
            this.f116313k = arguments.getString("user_id");
            this.f116314l = arguments.getString("sec_user_id");
            a().a(this.f116312j, this.f116313k, this.f116314l);
        }
        h();
        this.f116309b = new d(this, this.f116312j, (byte) 0);
        getContext();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(2, 1);
        d dVar = this.f116309b;
        if (dVar == null) {
            h.f.b.l.b();
        }
        dVar.a(new q(new i(a())));
        wrapGridLayoutManager.a(new k(this));
        RecyclerView recyclerView = (RecyclerView) a(R.id.drv);
        recyclerView.setAdapter(this.f116309b);
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        recyclerView.a(new b());
        recyclerView.setItemAnimator(null);
        ListViewModel.a(a(), this, this.f116309b, new g(new l(this), new m(this), f.INSTANCE), new h(new n(this), new p(this), new o(this)), 240);
        f.a.b.b unused = selectSubscribe(a(), f.f116331a, new ah(), new j(this));
        if (this.N) {
            a().k();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.anl, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
