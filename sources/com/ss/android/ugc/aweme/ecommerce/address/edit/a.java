package com.ss.android.ugc.aweme.ecommerce.address.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
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
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.address.edit.a.b;
import com.ss.android.ugc.aweme.ecommerce.address.edit.a.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.view.PageStepper;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.util.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class a extends Fragment implements ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.e {

    /* renamed from: f  reason: collision with root package name */
    public static final d f84388f = new d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f84389a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    public String f84390b;

    /* renamed from: c  reason: collision with root package name */
    public AddressPageStarter.AddressEditEnterParams f84391c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super h.p<String, Address>, z> f84392d;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.a<z> f84393e;

    /* renamed from: g  reason: collision with root package name */
    private final lifecycleAwareLazy f84394g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f84395h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f84396i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f84397j;

    public static final class b extends h.f.b.m implements h.f.a.m<AddressEditState, Bundle, AddressEditState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(52637);
        }

        public b() {
            super(2);
        }

        public final AddressEditState invoke(AddressEditState addressEditState, Bundle bundle) {
            h.f.b.l.c(addressEditState, "");
            return addressEditState;
        }
    }

    static {
        Covode.recordClassIndex(52635);
    }

    private final com.ss.android.ugc.aweme.views.i i() {
        return (com.ss.android.ugc.aweme.views.i) this.f84396i.getValue();
    }

    public final View a(int i2) {
        if (this.f84397j == null) {
            this.f84397j = new SparseArray();
        }
        View view = (View) this.f84397j.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f84397j.put(i2, findViewById);
        return findViewById;
    }

    public final AddressEditViewModel a() {
        return (AddressEditViewModel) this.f84394g.getValue();
    }

    public final l b() {
        return (l) this.f84395h.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(52640);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f84421a = new i();

        static {
            Covode.recordClassIndex(52645);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f84389a;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
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

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a
    public final boolean f() {
        e();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$a  reason: collision with other inner class name */
    public static final class C2014a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(52636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2014a(h.k.c cVar) {
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

    static final class e extends h.f.b.m implements h.f.a.a<l> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            a aVar = this.this$0;
            l lVar = new l(aVar, aVar.getChildFragmentManager());
            lVar.d(false);
            return lVar;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a().a();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f84397j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.views.i> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.views.i invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            return new com.ss.android.ugc.aweme.views.i(activity);
        }
    }

    public final void c() {
        if (i().isShowing()) {
            i().dismiss();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.ecommerce.address.a.a>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$l$a  reason: collision with other inner class name */
        static final class RunnableC2016a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f84423a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f84424b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f84425c;

            static {
                Covode.recordClassIndex(52649);
            }

            RunnableC2016a(int i2, l lVar, List list) {
                this.f84423a = i2;
                this.f84424b = lVar;
                this.f84425c = list;
            }

            public final void run() {
                View g2;
                RecyclerView recyclerView = (RecyclerView) this.f84424b.this$0.a(R.id.djj);
                h.f.b.l.b(recyclerView, "");
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null && (g2 = layoutManager.g(this.f84423a)) != null) {
                    h.f.b.l.b(g2, "");
                    ((NestedScrollView) this.f84424b.this$0.a(R.id.cu5)).a(0, (int) g2.getY(), false);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.ecommerce.address.a.a> list) {
            j jVar;
            int indexOf;
            List<? extends com.ss.android.ugc.aweme.ecommerce.address.a.a> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            int itemCount = this.this$0.b().getItemCount();
            this.this$0.b().a(list2);
            if (itemCount == list2.size()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.f84263c != null) {
                        if (next != null && (indexOf = list2.indexOf(next)) != -1) {
                            ((NestedScrollView) this.this$0.a(R.id.cu5)).post(new RunnableC2016a(indexOf, this, list2));
                        }
                    }
                }
            }
            if ((!list2.isEmpty()) && (jVar = this.this$0.a().f84362l) != null) {
                if (!jVar.f84458c) {
                    com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_page", jVar.f84456a);
                }
                jVar.f84458c = true;
            }
            return z.f158842a;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<AddressEditViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(52638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.address.edit.a$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.a$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.a.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.e
    public final void g() {
        i iVar;
        if (!ActivityStack.isAppBackGround() && (iVar = a().f84361k) != null) {
            new com.ss.android.ugc.aweme.ecommerce.address.edit.b.e().c(iVar.f84452a);
        }
        i iVar2 = a().f84361k;
        if (iVar2 != null) {
            iVar2.f84454c = SystemClock.elapsedRealtime();
        }
        j jVar = a().f84362l;
        if (jVar != null) {
            jVar.f84457b = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        i iVar = a().f84361k;
        if (iVar != null) {
            new com.ss.android.ugc.aweme.ecommerce.address.edit.b.d(iVar.f84453b).c(iVar.f84452a);
        }
        i iVar2 = a().f84361k;
        if (iVar2 != null) {
            iVar2.f84452a = new LinkedHashMap();
            iVar2.f84453b = 0;
            iVar2.f84454c = 0;
        }
    }

    public a() {
        h.k.c a2 = h.f.b.ab.a(AddressEditViewModel.class);
        C2014a aVar = new C2014a(a2);
        this.f84394g = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
        this.f84395h = h.i.a((h.f.a.a) new e(this));
        this.f84396i = h.i.a((h.f.a.a) new v(this));
        this.f84391c = new AddressPageStarter.AddressEditEnterParams("");
        this.f84392d = w.f84433a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038 A[Catch:{ all -> 0x004b }] */
    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel r0 = r7.a()
            com.ss.android.ugc.aweme.ecommerce.address.edit.i r6 = r0.f84361k
            if (r6 == 0) goto L_0x0014
            long r4 = r6.f84453b
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.f84454c
            long r2 = r2 - r0
            long r4 = r4 + r2
            r6.f84453b = r4
        L_0x0014:
            com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel r0 = r7.a()     // Catch:{ all -> 0x004b }
            com.ss.android.ugc.aweme.ecommerce.address.edit.j r4 = r0.f84362l     // Catch:{ all -> 0x004b }
            r3 = 0
            if (r4 == 0) goto L_0x0047
            r0 = 2131368645(0x7f0a1ac5, float:1.8357246E38)
            android.view.View r0 = r7.a(r0)     // Catch:{ all -> 0x004b }
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r0     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0031
            int r0 = r0.getVisibility()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r2 = 0
            goto L_0x0032
        L_0x0031:
            r2 = 1
        L_0x0032:
            java.lang.String r1 = r7.f84390b     // Catch:{ all -> 0x004b }
            r7.f84390b = r3     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = "close"
        L_0x003a:
            com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel r0 = r7.a()     // Catch:{ all -> 0x004b }
            com.ss.android.ugc.aweme.ecommerce.address.dto.Address r0 = r0.g()     // Catch:{ all -> 0x004b }
            r4.a(r2, r1, r0)     // Catch:{ all -> 0x004b }
            h.z r3 = h.z.f158842a     // Catch:{ all -> 0x004b }
        L_0x0047:
            h.q.m223constructorimpl(r3)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r0 = move-exception
            java.lang.Object r0 = h.r.a(r0)
            h.q.m223constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.a.h():void");
    }

    public final void e() {
        String string;
        String str;
        i iVar = a().f84361k;
        if (iVar != null) {
            iVar.a("back", null, null);
        }
        if (!a().f84358e) {
            this.f84390b = "return";
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        a.C0731a a2 = new a.C0731a(getActivity()).a(R.string.bil);
        if (this.f84391c.f84254j != null) {
            string = this.f84391c.f84254j;
        } else {
            string = getString(R.string.bik);
        }
        a2.f33402b = string;
        a.C0731a a3 = a2.b(R.string.fw8, (DialogInterface.OnClickListener) new f(this), false).a(R.string.fw7, (DialogInterface.OnClickListener) new g(this), false);
        a3.M = true;
        a3.a().c();
        if (a().f84362l != null) {
            if (this.f84391c.f84254j == null) {
                str = "quit_editing_address";
            } else {
                str = "quit_checkout";
            }
            j.d(str);
        }
    }

    public static final class h extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f84414a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f84415b = R.drawable.zd;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f84416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f84417d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f84418e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f84419f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f84420g;

        static {
            Covode.recordClassIndex(52644);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f84420g.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(Context context, h.f.a.a aVar) {
            super(700);
            this.f84416c = context;
            this.f84417d = R.string.bgb;
            this.f84418e = R.string.bga;
            this.f84419f = R.string.bgc;
            this.f84420g = aVar;
        }
    }

    public static final class t implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AddressPageStarter.AddressEditEnterParams f84430b;

        static {
            Covode.recordClassIndex(52659);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f84429a.e();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            i iVar = this.f84429a.a().f84361k;
            if (iVar != null) {
                iVar.a("delete", null, null);
            }
            a.C0731a a2 = new a.C0731a(this.f84429a.getActivity()).a(R.string.fwl).b(R.string.fwj).b(R.string.fwf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.edit.a.t.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ t f84431a;

                static {
                    Covode.recordClassIndex(52660);
                }

                {
                    this.f84431a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (this.f84431a.f84429a.a().f84362l != null) {
                        j.a("delete_address", "no");
                    }
                    i iVar = this.f84431a.f84429a.a().f84361k;
                    if (iVar != null) {
                        iVar.a("delete_address", "keep");
                    }
                }
            }, false).a(R.string.fwh, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.edit.a.t.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ t f84432a;

                static {
                    Covode.recordClassIndex(52661);
                }

                {
                    this.f84432a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (this.f84432a.f84429a.a().f84362l != null) {
                        j.a("delete_address", "yes");
                    }
                    i iVar = this.f84432a.f84429a.a().f84361k;
                    if (iVar != null) {
                        iVar.a("delete_address", "delete");
                    }
                    AddressEditViewModel a2 = this.f84432a.f84429a.a();
                    a2.c(AddressEditViewModel.a.f84364a);
                    String str = a2.f84357d;
                    h.f.b.l.d(str, "");
                    f.a.b.b a3 = ((AddressApi) AddressApi.a.f84265a.a(AddressApi.class)).deleteAddress(new com.ss.android.ugc.aweme.ecommerce.address.dto.h(h.a.n.a(str))).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new AddressEditViewModel.b(a2), new AddressEditViewModel.c(a2));
                    h.f.b.l.b(a3, "");
                    a2.a(a3);
                }
            }, false);
            a2.M = true;
            a2.a().c();
            if (this.f84429a.a().f84362l != null) {
                j.d("delete_address");
            }
        }

        t(a aVar, AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
            this.f84429a = aVar;
            this.f84430b = addressEditEnterParams;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<h.p<? extends String, ? extends Address>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f84433a = new w();

        static {
            Covode.recordClassIndex(52665);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h.p<? extends String, ? extends Address> pVar) {
            h.f.b.l.d(pVar, "");
            return z.f158842a;
        }
    }

    public final void a(AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
        h.f.b.l.d(addressEditEnterParams, "");
        this.f84391c = addressEditEnterParams;
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84422a;

        static {
            Covode.recordClassIndex(52646);
        }

        j(a aVar) {
            this.f84422a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84422a.a().a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("enter_params", this.f84391c);
    }

    public static final class s extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f84426a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f84427b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AddressPageStarter.AddressEditEnterParams f84428c;

        static {
            Covode.recordClassIndex(52658);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            if (view != null) {
                androidx.fragment.app.e activity = this.f84427b.getActivity();
                if (activity != null) {
                    com.ss.android.ugc.aweme.ecommerce.util.n.a(activity);
                }
                AddressEditViewModel a2 = this.f84427b.a();
                a2.b_(new AddressEditViewModel.m(a2));
                AddressPageStarter.AddressEditEnterParams addressEditEnterParams = this.f84428c;
                if (addressEditEnterParams == null || addressEditEnterParams.f84253i != 1) {
                    str = "save";
                } else {
                    str = "next";
                }
                j jVar = this.f84427b.a().f84362l;
                if (jVar != null) {
                    h.f.b.l.d(str, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(jVar.f84456a);
                    linkedHashMap.put("button_name", str);
                    com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_click", linkedHashMap);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(a aVar, AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
            super(700);
            this.f84427b = aVar;
            this.f84428c = addressEditEnterParams;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<Region> list;
        String str;
        String str2;
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams;
        String str3 = "";
        if (!(bundle == null || (addressEditEnterParams = (AddressPageStarter.AddressEditEnterParams) bundle.getParcelable("enter_params")) == null)) {
            h.f.b.l.b(addressEditEnterParams, str3);
            this.f84391c = addressEditEnterParams;
        }
        super.onCreate(bundle);
        AddressEditViewModel a2 = a();
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams2 = this.f84391c;
        i iVar = new i(this.f84391c);
        j jVar = new j(this.f84391c);
        a2.n = addressEditEnterParams2;
        a2.f84361k = iVar;
        a2.f84362l = jVar;
        a2.f84355b = addressEditEnterParams2 != null ? addressEditEnterParams2.f84246b : null;
        a2.q = addressEditEnterParams2 != null ? addressEditEnterParams2.f84246b : null;
        if (!(addressEditEnterParams2 == null || (str2 = addressEditEnterParams2.f84247c) == null)) {
            str3 = str2;
        }
        a2.f84359f = str3;
        if (!(addressEditEnterParams2 == null || (str = addressEditEnterParams2.f84248d) == null)) {
            a2.f84360g = (HashMap) new com.google.gson.f().a(str, new AddressEditViewModel.k().type);
        }
        Address address = a2.f84355b;
        if (address != null) {
            a2.f84354a = address.f84300c;
            a2.f84357d = address.f84298a;
            return;
        }
        if (!(addressEditEnterParams2 == null || (list = addressEditEnterParams2.f84245a) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t2 : list) {
                if (t2 != null) {
                    arrayList.add(t2);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                a2.f84356c = arrayList2;
                a2.f84354a = (Region) arrayList2.get(0);
                return;
            }
        }
        a2.f84354a = new Region(null, null, com.ss.android.ugc.aweme.language.d.a(), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = this.f84391c;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = (RecyclerView) a(R.id.djj);
            h.f.b.l.b(recyclerView, "");
            recyclerView.setAdapter(b());
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.djj);
            h.f.b.l.b(recyclerView2, "");
            h.f.b.l.b(activity, "");
            recyclerView2.setLayoutManager(new ScrollTopLinearLayoutManager(activity));
            RecyclerView recyclerView3 = (RecyclerView) a(R.id.djj);
            h.f.b.l.b(recyclerView3, "");
            recyclerView3.setNestedScrollingEnabled(false);
            ((RecyclerView) a(R.id.aub)).a(new c((int) com.bytedance.common.utility.n.b(getActivity(), 12.0f), (int) com.bytedance.common.utility.n.b(getActivity(), 16.0f)));
            if (addressEditEnterParams != null && addressEditEnterParams.f84253i == 1) {
                TuxButton tuxButton = (TuxButton) a(R.id.ds1);
                h.f.b.l.b(tuxButton, "");
                tuxButton.setText(getString(R.string.bir));
            }
            TuxButton tuxButton2 = (TuxButton) a(R.id.ds1);
            h.f.b.l.b(tuxButton2, "");
            tuxButton2.setOnClickListener(new s(this, addressEditEnterParams));
            if (a().f84355b != null) {
                ((NormalTitleBar) a(R.id.elv)).setEndBtnIcon(R.drawable.yv);
            }
            ((NormalTitleBar) a(R.id.elv)).setOnTitleBarClickListener(new t(this, addressEditEnterParams));
            if (addressEditEnterParams != null) {
                Integer num = addressEditEnterParams.f84249e;
                Integer num2 = addressEditEnterParams.f84250f;
                if (!(num == null || num2 == null)) {
                    ((PageStepper) a(R.id.ea6)).setTotalStep(num2.intValue());
                    ((PageStepper) a(R.id.ea6)).setLightStep(num.intValue());
                    PageStepper pageStepper = (PageStepper) a(R.id.ea6);
                    h.f.b.l.b(pageStepper, "");
                    pageStepper.setVisibility(0);
                }
            }
            new KeyBoardVisibilityUtil(activity, 16, new u(this, addressEditEnterParams));
        }
        Context context = getContext();
        if (context != null) {
            DmtStatusView.a a2 = DmtStatusView.a.a(getActivity()).a(R.string.bge, R.string.bgd, R.string.bgc, new j(this));
            h.f.b.l.b(context, "");
            k kVar = new k(this);
            View a3 = com.a.a(LayoutInflater.from(context), R.layout.pk, (ViewGroup) a(R.id.ad7), false);
            ((AppCompatImageView) a3.findViewById(R.id.bm4)).setImageResource(R.drawable.zd);
            TuxTextView tuxTextView = (TuxTextView) a3.findViewById(R.id.text);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setText(context.getText(R.string.bgb));
            TuxTextView tuxTextView2 = (TuxTextView) a3.findViewById(R.id.ej0);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setText(context.getText(R.string.bga));
            TuxButton tuxButton3 = (TuxButton) a3.findViewById(R.id.dmf);
            h.f.b.l.b(tuxButton3, "");
            tuxButton3.setText(context.getText(R.string.bgc));
            TuxButton tuxButton4 = (TuxButton) a3.findViewById(R.id.dmf);
            h.f.b.l.b(tuxButton4, "");
            tuxButton4.setOnClickListener(new h(context, kVar));
            h.f.b.l.b(a3, "");
            ((DmtStatusView) a(R.id.e_c)).setBuilder(a2.d(a3));
        }
        f.a.b.b unused = selectSubscribe(a(), b.f84434a, new ah(), new o(this));
        f.a.b.b unused2 = selectSubscribe(a(), e.f84448a, new ah(), new p(this));
        f.a.b.b unused3 = selectSubscribe(a(), f.f84449a, new ah(), new q(this));
        f.a.b.b unused4 = selectSubscribe(a(), g.f84450a, new ah(), new r(this));
        f.a.b.b unused5 = selectSubscribe(a(), h.f84451a, new ah(), new l(this));
        f.a.b.b unused6 = selectSubscribe(a(), c.f84443a, new ah(), new m(this));
        f.a.b.b unused7 = selectSubscribe(a(), d.f84447a, new ah(), new n(this));
        InputItemData inputItemData = this.f84391c.f84251g;
        if (inputItemData != null) {
            AddressEditViewModel a4 = a();
            h.f.b.l.d(inputItemData, "");
            a4.a(-1);
            a4.a(inputItemData);
            return;
        }
        a().a();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar) {
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

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            h.f.b.l.d(iVar, "");
            this.this$0.a(num, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.edit.a.p.AnonymousClass1 */
                final /* synthetic */ p this$0;

                static {
                    Covode.recordClassIndex(52654);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    EventCenter.a().a("ec_address_change", new AddressPageStarter.a(this.this$0.this$0.a().f84357d, 2).a());
                    this.this$0.this$0.f84390b = "return";
                    androidx.fragment.app.e activity = this.this$0.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            h.f.b.l.d(iVar, "");
            this.this$0.a(num, i.f84421a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84412a;

        static {
            Covode.recordClassIndex(52642);
        }

        f(a aVar) {
            this.f84412a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            if (this.f84412a.a().f84362l != null) {
                if (this.f84412a.f84391c.f84254j == null) {
                    str = "quit_editing_address";
                } else {
                    str = "quit_checkout";
                }
                j.a(str, "stay");
            }
            i iVar = this.f84412a.a().f84361k;
            if (iVar != null) {
                iVar.a("quit_editing", "stay");
            }
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            Integer num2 = num;
            h.f.b.l.d(iVar, "");
            if (num2 != null && num2.intValue() == 3) {
                this.this$0.c();
            } else {
                this.this$0.a(num2, new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.address.edit.a.q.AnonymousClass1 */
                    final /* synthetic */ q this$0;

                    static {
                        Covode.recordClassIndex(52656);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        String str;
                        androidx.fragment.app.e activity;
                        a aVar = this.this$0.this$0;
                        if (this.this$0.this$0.f84391c.f84253i == 1) {
                            str = "next";
                        } else {
                            str = "return";
                        }
                        aVar.f84390b = str;
                        h.p<String, Address> pVar = this.this$0.this$0.a().f84363m;
                        if (pVar != null) {
                            this.this$0.this$0.f84392d.invoke(pVar);
                        }
                        if (!this.this$0.this$0.f84391c.f84252h && (activity = this.this$0.this$0.getActivity()) != null) {
                            activity.finish();
                        }
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84413a;

        static {
            Covode.recordClassIndex(52643);
        }

        g(a aVar) {
            this.f84413a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            this.f84413a.f84390b = "return";
            if (this.f84413a.a().f84362l != null) {
                if (this.f84413a.f84391c.f84254j == null) {
                    str = "quit_editing_address";
                } else {
                    str = "quit_checkout";
                }
                j.a(str, "quit");
            }
            i iVar = this.f84413a.a().f84361k;
            if (iVar != null) {
                iVar.a("quit_editing", "quit");
            }
            if (this.f84413a.f84393e == null || this.f84413a.f84391c.f84254j == null) {
                androidx.fragment.app.e activity = this.f84413a.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            h.f.a.a<z> aVar = this.f84413a.f84393e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            int i2 = 8;
            if (booleanValue) {
                TuxButton tuxButton = (TuxButton) this.this$0.a(R.id.ds1);
                h.f.b.l.b(tuxButton, "");
                tuxButton.setVisibility(8);
                View a2 = this.this$0.a(R.id.ds2);
                h.f.b.l.b(a2, "");
                a2.setVisibility(8);
                EditText editText = (EditText) ((RecyclerView) this.this$0.a(R.id.djj)).findViewWithTag(5);
                if (editText != null) {
                    RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.aub);
                    h.f.b.l.b(recyclerView, "");
                    b.c.a(recyclerView, editText);
                }
            }
            RecyclerView recyclerView2 = (RecyclerView) this.this$0.a(R.id.aub);
            h.f.b.l.b(recyclerView2, "");
            if (booleanValue) {
                i2 = 0;
            }
            recyclerView2.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            View g2;
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            if (intValue >= 0) {
                RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.djj);
                h.f.b.l.b(recyclerView, "");
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager == null || (g2 = layoutManager.g(intValue)) == null)) {
                    h.f.b.l.b(g2, "");
                    ((NestedScrollView) this.this$0.a(R.id.cu5)).a(0, (int) g2.getY(), false);
                }
            }
            return z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<Boolean, Integer, z> {
        final /* synthetic */ AddressPageStarter.AddressEditEnterParams $enterParams$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(a aVar, AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
            super(2);
            this.this$0 = aVar;
            this.$enterParams$inlined = addressEditEnterParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            if (!booleanValue) {
                this.this$0.a().a(false);
                TuxButton tuxButton = (TuxButton) this.this$0.a(R.id.ds1);
                h.f.b.l.b(tuxButton, "");
                tuxButton.setVisibility(0);
                View a2 = this.this$0.a(R.id.ds2);
                h.f.b.l.b(a2, "");
                a2.setVisibility(0);
                ((RecyclerView) this.this$0.a(R.id.djj)).clearFocus();
            } else {
                TuxButton tuxButton2 = (TuxButton) this.this$0.a(R.id.ds1);
                h.f.b.l.b(tuxButton2, "");
                tuxButton2.setVisibility(8);
                View a3 = this.this$0.a(R.id.ds2);
                h.f.b.l.b(a3, "");
                a3.setVisibility(8);
                a aVar = this.this$0;
                aVar.withState(aVar.a(), new h.f.a.b<AddressEditState, z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.address.edit.a.u.AnonymousClass1 */
                    final /* synthetic */ u this$0;

                    static {
                        Covode.recordClassIndex(52663);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(AddressEditState addressEditState) {
                        View g2;
                        AddressEditState addressEditState2 = addressEditState;
                        h.f.b.l.d(addressEditState2, "");
                        if (addressEditState2.isAddressEditorFocus() && addressEditState2.getAutoScrollIndex() >= 0) {
                            RecyclerView recyclerView = (RecyclerView) this.this$0.this$0.a(R.id.djj);
                            h.f.b.l.b(recyclerView, "");
                            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                            if (!(layoutManager == null || (g2 = layoutManager.g(addressEditState2.getAutoScrollIndex())) == null)) {
                                h.f.b.l.b(g2, "");
                                ((NestedScrollView) this.this$0.this$0.a(R.id.cu5)).a(0, (int) g2.getY(), false);
                            }
                        }
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    public final void a(Integer num, h.f.a.a<z> aVar) {
        if (num != null) {
            if (num.intValue() == -1) {
                c();
                aVar.invoke();
            } else if (num.intValue() == 0) {
                i().show();
            } else if (num.intValue() == 2) {
                c();
                new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(getString(R.string.fwt)).a();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.nx, viewGroup, false);
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
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
