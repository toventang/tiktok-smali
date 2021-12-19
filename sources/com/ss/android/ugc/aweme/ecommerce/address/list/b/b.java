package com.ss.android.ugc.aweme.ecommerce.address.list.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.util.o;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b extends i implements q {

    /* renamed from: a  reason: collision with root package name */
    public final AddressListActivity f84558a;

    /* renamed from: b  reason: collision with root package name */
    public final AddressListViewModel f84559b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f84560d = h.i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(52776);
    }

    public final AddressAdapter d() {
        return (AddressAdapter) this.f84560d.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.address.list.b.i
    public final void c() {
        com.ss.android.ugc.aweme.ecommerce.address.list.a.f84553a = new LinkedHashMap();
    }

    static final class a extends h.f.b.m implements h.f.a.a<AddressAdapter> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AddressAdapter invoke() {
            AddressAdapter addressAdapter = new AddressAdapter(this.this$0.f84558a);
            addressAdapter.d(false);
            return addressAdapter;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f84559b.a();
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f84559b.b();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.list.b.i
    public final void b() {
        if (!ActivityStack.isAppBackGround()) {
            new com.ss.android.ugc.aweme.ecommerce.address.list.a.c().d();
        }
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f84558a.getLifecycle();
        h.f.b.l.b(lifecycle, "");
        return lifecycle;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.list.b.i
    public final void a() {
        boolean z;
        String str;
        Object obj;
        MethodCollector.i(5701);
        this.f84558a.setContentView(R.layout.o1);
        AddressListViewModel addressListViewModel = this.f84559b;
        AddressPageStarter.AddressListEnterParams a2 = AddressPageStarter.AddressListEnterParams.a.a(this.f84558a.getIntent());
        if (a2 != null) {
            z = a2.f84256a;
        } else {
            z = false;
        }
        addressListViewModel.f84547b.a(AddressListViewModel.f84546a[0], Boolean.valueOf(z));
        if (!(a2 == null || (str = a2.f84257b) == null)) {
            try {
                obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(str, HashMap.class);
            } catch (Exception unused) {
                obj = null;
            }
            addressListViewModel.f84548c = (HashMap) obj;
        }
        EventCenter.a().a("ec_address_change", addressListViewModel);
        AddressListViewModel addressListViewModel2 = this.f84559b;
        h.f.b.l.d(addressListViewModel2, "");
        Map<String, Object> map = com.ss.android.ugc.aweme.ecommerce.address.list.a.f84553a;
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("page_name", "shipping_info");
        HashMap<String, Object> hashMap = addressListViewModel2.f84548c;
        if (hashMap != null) {
            map.putAll(hashMap);
        }
        o.a(this.f84558a.getWindow());
        RecyclerView recyclerView = (RecyclerView) this.f84558a._$_findCachedViewById(R.id.djj);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setAdapter(d());
        RecyclerView recyclerView2 = (RecyclerView) this.f84558a._$_findCachedViewById(R.id.djj);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) this.f84558a._$_findCachedViewById(R.id.djj)).a(new com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a(androidx.core.content.b.c(this.f84558a, R.color.b6), 0, n.b(this.f84558a, 16.0f), 2));
        ((NormalTitleBar) this.f84558a._$_findCachedViewById(R.id.elv)).setOnTitleBarClickListener(new l(this));
        ((DmtStatusView) this.f84558a._$_findCachedViewById(R.id.e_c)).setBuilder(new DmtStatusView.a(this.f84558a).a(this.f84558a.getLayoutInflater().inflate(R.layout.o2, (ViewGroup) null)).a(R.string.bge, R.string.bgd, R.string.bgc, new c(this)).d(a(this.f84558a, R.string.bgb, R.string.bga, R.drawable.zd, R.string.bgc, new d(this))).e(a(this.f84558a, R.string.fws, R.string.fwq, R.drawable.ys, R.string.fwe, new e(this))));
        f.a.b.b unused2 = selectSubscribe(this.f84559b, c.f84570a, new ah(), new h(this));
        f.a.b.b unused3 = selectSubscribe(this.f84559b, e.f84572a, new ah(), new i(this));
        f.a.b.b unused4 = selectSubscribe(this.f84559b, f.f84573a, new ah(), new j(this));
        f.a.b.b unused5 = selectSubscribe(this.f84559b, g.f84574a, new ah(), new k(this));
        f.a.b.b unused6 = selectSubscribe(this.f84559b, h.f84575a, new ah(), new f(this));
        f.a.b.b unused7 = selectSubscribe(this.f84559b, d.f84571a, new ah(), new g(this));
        this.f84559b.a();
        MethodCollector.o(5701);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$b  reason: collision with other inner class name */
    public static final class C2018b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f84561a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f84562b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f84563c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f84564d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f84565e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f84566f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f84567g;

        static {
            Covode.recordClassIndex(52778);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f84567g.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2018b(int i2, Context context, int i3, int i4, int i5, h.f.a.a aVar) {
            super(700);
            this.f84562b = i2;
            this.f84563c = context;
            this.f84564d = i3;
            this.f84565e = i4;
            this.f84566f = i5;
            this.f84567g = aVar;
        }
    }

    public static final class l implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f84569a;

        static {
            Covode.recordClassIndex(52789);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(b bVar) {
            this.f84569a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f84569a.f84558a.finish();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f84568a;

        static {
            Covode.recordClassIndex(52779);
        }

        c(b bVar) {
            this.f84568a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84568a.f84559b.a();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.address.list.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<AddressListState, z> {
            final /* synthetic */ com.bytedance.jedi.arch.i $this_selectSubscribe$inlined;
            final /* synthetic */ j this$0;

            static {
                Covode.recordClassIndex(52787);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar, com.bytedance.jedi.arch.i iVar) {
                super(1);
                this.this$0 = jVar;
                this.$this_selectSubscribe$inlined = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(AddressListState addressListState) {
                AddressListState addressListState2 = addressListState;
                h.f.b.l.d(addressListState2, "");
                if (addressListState2.getAddressList().size() >= 20) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.this$0.f84558a).a(this.this$0.this$0.f84558a.getString(R.string.fwd)).a();
                } else {
                    AddressPageStarter.a(this.this$0.this$0.f84558a, null, null, "shipping_info", true, dg.a().b(this.this$0.this$0.f84559b.f84548c), null, 4038);
                }
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.address.list.b bVar) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            if (bVar != null) {
                com.ss.android.ugc.aweme.ecommerce.address.list.a.a("add_address");
                iVar2.withState(this.this$0.f84559b, new a(this, iVar2));
            }
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
            Covode.recordClassIndex(52784);
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
            ((DmtStatusView) this.this$0.f84558a._$_findCachedViewById(R.id.e_c)).setStatus(intValue);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(AddressListActivity addressListActivity, AddressListViewModel addressListViewModel) {
        super(addressListActivity);
        h.f.b.l.d(addressListActivity, "");
        h.f.b.l.d(addressListViewModel, "");
        this.f84558a = addressListActivity;
        this.f84559b = addressListViewModel;
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.address.list.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.address.list.b bVar) {
            Address address;
            com.ss.android.ugc.aweme.ecommerce.address.list.b bVar2 = bVar;
            h.f.b.l.d(iVar, "");
            if (!(bVar2 == null || (address = bVar2.f84556a) == null)) {
                EventCenter.a().a("ec_address_select", new AddressPageStarter.a(address.f84298a, 3).a());
                this.this$0.f84558a.finish();
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.address.list.c, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.address.list.c cVar) {
            h.f.b.l.d(iVar, "");
            if (cVar != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f84558a).a(this.this$0.f84558a.getString(R.string.fw_)).a();
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d> list) {
            List<? extends com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            AddressAdapter d2 = this.this$0.d();
            List c2 = h.a.n.c(new AddressAdapter.a());
            c2.addAll(list2);
            d2.a(c2);
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.address.list.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.address.list.b bVar) {
            Address address;
            com.ss.android.ugc.aweme.ecommerce.address.list.b bVar2 = bVar;
            h.f.b.l.d(iVar, "");
            if (!(bVar2 == null || (address = bVar2.f84556a) == null)) {
                com.ss.android.ugc.aweme.ecommerce.address.list.a.a("edit");
                AddressPageStarter.a(this.this$0.f84558a, address, null, "shipping_info", true, dg.a().b(this.this$0.f84559b.f84548c), null, 4036);
            }
            return z.f158842a;
        }
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

    private final View a(Context context, int i2, int i3, int i4, int i5, h.f.a.a<z> aVar) {
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.pk, (ViewGroup) this.f84558a._$_findCachedViewById(R.id.ad7), false);
        ((AppCompatImageView) a2.findViewById(R.id.bm4)).setImageResource(i4);
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.text);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(context.getText(i2));
        TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.ej0);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(context.getText(i3));
        TuxButton tuxButton = (TuxButton) a2.findViewById(R.id.dmf);
        h.f.b.l.b(tuxButton, "");
        tuxButton.setText(context.getText(i5));
        TuxButton tuxButton2 = (TuxButton) a2.findViewById(R.id.dmf);
        h.f.b.l.b(tuxButton2, "");
        tuxButton2.setOnClickListener(new C2018b(i4, context, i2, i3, i5, aVar));
        h.f.b.l.b(a2, "");
        return a2;
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
