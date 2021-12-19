package com.ss.android.ugc.aweme.filter.view.internal.filterbox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.filter.view.a.f;
import com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView;
import com.ss.android.ugc.aweme.filter.view.internal.main.j;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import f.a.l.g;
import f.a.t;
import h.f.b.l;
import h.p;
import h.z;

public final class c implements f {

    /* renamed from: f  reason: collision with root package name */
    public static final a f95798f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    FilterBoxListView f95799a;

    /* renamed from: b  reason: collision with root package name */
    public final g<z> f95800b;

    /* renamed from: c  reason: collision with root package name */
    final g<com.ss.android.ugc.aweme.filter.view.a.a> f95801c;

    /* renamed from: d  reason: collision with root package name */
    final FilterBoxListView.c f95802d = new d(this);

    /* renamed from: e  reason: collision with root package name */
    final g f95803e;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.tools.view.base.d f95804g;

    /* renamed from: h  reason: collision with root package name */
    private final ViewGroup f95805h;

    /* renamed from: i  reason: collision with root package name */
    private final m f95806i;

    /* renamed from: j  reason: collision with root package name */
    private final e f95807j;

    static {
        Covode.recordClassIndex(60709);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60710);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.f
    public final t<com.ss.android.ugc.aweme.filter.view.a.a> c() {
        t<com.ss.android.ugc.aweme.filter.view.a.a> c2 = this.f95801c.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.f
    public final t<Boolean> d() {
        com.ss.android.ugc.tools.view.base.d dVar = this.f95804g;
        if (dVar == null) {
            l.a("transitionView");
        }
        return dVar.d();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.f
    public final t<z> e() {
        t<z> c2 = this.f95800b.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.f
    public final void a() {
        g gVar = this.f95803e;
        if (gVar != null) {
            gVar.b();
        }
        com.ss.android.ugc.tools.view.base.d dVar = this.f95804g;
        if (dVar == null) {
            l.a("transitionView");
        }
        dVar.a();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.f
    public final void b() {
        g gVar = this.f95803e;
        if (gVar != null) {
            gVar.c();
        }
        com.ss.android.ugc.tools.view.base.d dVar = this.f95804g;
        if (dVar == null) {
            l.a("transitionView");
        }
        dVar.c();
        FilterBoxListView filterBoxListView = this.f95799a;
        if (filterBoxListView == null) {
            l.a("listView");
        }
        filterBoxListView.setCategoryMap(h.a.z.INSTANCE);
    }

    public static final class d implements FilterBoxListView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f95810a;

        static {
            Covode.recordClassIndex(60713);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f95810a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.c
        public final void a(EffectCategoryModel effectCategoryModel, com.ss.android.ugc.aweme.filter.repository.a.b bVar) {
            l.d(effectCategoryModel, "");
            l.d(bVar, "");
            c cVar = this.f95810a;
            g gVar = cVar.f95803e;
            if (gVar != null) {
                gVar.a(bVar);
            }
            cVar.f95801c.onNext(new com.ss.android.ugc.aweme.filter.view.a.a(com.ss.android.ugc.aweme.filter.view.a.b.BUILTIN_CLICK, bVar));
        }

        @Override // com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.c
        public final void b(EffectCategoryModel effectCategoryModel, com.ss.android.ugc.aweme.filter.repository.a.b bVar) {
            l.d(effectCategoryModel, "");
            l.d(bVar, "");
            c cVar = this.f95810a;
            g gVar = cVar.f95803e;
            if (gVar != null) {
                gVar.a(bVar);
            }
            cVar.f95801c.onNext(new com.ss.android.ugc.aweme.filter.view.a.a(com.ss.android.ugc.aweme.filter.view.a.b.INSERT, bVar));
        }

        @Override // com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.c
        public final void c(EffectCategoryModel effectCategoryModel, com.ss.android.ugc.aweme.filter.repository.a.b bVar) {
            l.d(effectCategoryModel, "");
            l.d(bVar, "");
            c cVar = this.f95810a;
            g gVar = cVar.f95803e;
            if (gVar != null) {
                gVar.b(bVar);
            }
            cVar.f95801c.onNext(new com.ss.android.ugc.aweme.filter.view.a.a(com.ss.android.ugc.aweme.filter.view.a.b.REMOVE, bVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC2313c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f95809a;

        static {
            Covode.recordClassIndex(60712);
        }

        View$OnClickListenerC2313c(c cVar) {
            this.f95809a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f95809a.f95800b.onNext(z.f158842a);
        }
    }

    static final class b<T> implements u<p<? extends f.a, ? extends com.ss.android.ugc.aweme.filter.repository.a.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f95808a;

        static {
            Covode.recordClassIndex(60711);
        }

        b(c cVar) {
            this.f95808a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(p<? extends f.a, ? extends com.ss.android.ugc.aweme.filter.repository.a.a> pVar) {
            p<? extends f.a, ? extends com.ss.android.ugc.aweme.filter.repository.a.a> pVar2 = pVar;
            if (pVar2 != null) {
                c cVar = this.f95808a;
                com.ss.android.ugc.aweme.filter.repository.a.a aVar = (com.ss.android.ugc.aweme.filter.repository.a.a) pVar2.getSecond();
                int i2 = d.f95811a[((f.a) pVar2.getFirst()).ordinal()];
                if (i2 == 1) {
                    FilterBoxListView filterBoxListView = cVar.f95799a;
                    if (filterBoxListView == null) {
                        l.a("listView");
                    }
                    filterBoxListView.setState(1);
                } else if (i2 == 2) {
                    FilterBoxListView filterBoxListView2 = cVar.f95799a;
                    if (filterBoxListView2 == null) {
                        l.a("listView");
                    }
                    filterBoxListView2.setState(3);
                } else if (i2 == 3) {
                    FilterBoxListView filterBoxListView3 = cVar.f95799a;
                    if (filterBoxListView3 == null) {
                        l.a("listView");
                    }
                    filterBoxListView3.setState(2);
                } else if (i2 == 4 && aVar != null) {
                    FilterBoxListView filterBoxListView4 = cVar.f95799a;
                    if (filterBoxListView4 == null) {
                        l.a("listView");
                    }
                    filterBoxListView4.setState(0);
                    FilterBoxListView filterBoxListView5 = cVar.f95799a;
                    if (filterBoxListView5 == null) {
                        l.a("listView");
                    }
                    filterBoxListView5.setCategoryMap(aVar.f95531b);
                    FilterBoxListView filterBoxListView6 = cVar.f95799a;
                    if (filterBoxListView6 == null) {
                        l.a("listView");
                    }
                    filterBoxListView6.setCallback(cVar.f95802d);
                }
            }
        }
    }

    public c(ViewGroup viewGroup, m mVar, g gVar, e eVar) {
        LiveData<p<f.a, com.ss.android.ugc.aweme.filter.repository.a.a>> a2;
        l.d(viewGroup, "");
        l.d(mVar, "");
        l.d(eVar, "");
        MethodCollector.i(10175);
        this.f95805h = viewGroup;
        this.f95806i = mVar;
        this.f95803e = gVar;
        this.f95807j = eVar;
        f.a.l.c cVar = new f.a.l.c();
        l.b(cVar, "");
        this.f95800b = cVar;
        f.a.l.c cVar2 = new f.a.l.c();
        l.b(cVar2, "");
        this.f95801c = cVar2;
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.d7, viewGroup, false);
        viewGroup.addView(a3);
        View findViewById = a3.findViewById(R.id.b2g);
        l.b(findViewById, "");
        FilterBoxListView filterBoxListView = (FilterBoxListView) findViewById;
        this.f95799a = filterBoxListView;
        if (filterBoxListView == null) {
            l.a("listView");
        }
        filterBoxListView.setFilterBoxViewConfigure(eVar);
        l.b(a3, "");
        this.f95804g = new j(a3, a3.findViewById(R.id.eae));
        a3.findViewById(R.id.ebu).setOnClickListener(new View$OnClickListenerC2313c(this));
        com.ss.android.ugc.tools.view.base.d dVar = this.f95804g;
        if (dVar == null) {
            l.a("transitionView");
        }
        dVar.f();
        if (gVar == null || (a2 = gVar.a()) == null) {
            MethodCollector.o(10175);
            return;
        }
        a2.observe(mVar, new b(this));
        MethodCollector.o(10175);
    }
}
