package com.ss.android.ugc.aweme.favorites.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.favorites.api.d;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.z;
import java.util.List;

public final class j extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90542j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f90543k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f90544l;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.e, com.ss.android.ugc.aweme.favorites.viewmodel.e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(56859);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.e invoke(com.ss.android.ugc.aweme.favorites.viewmodel.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    public interface g extends com.bytedance.assem.arch.service.c {
        static {
            Covode.recordClassIndex(56866);
        }

        void a();

        void a(com.ss.android.ugc.aweme.favorites.api.d dVar);
    }

    static {
        Covode.recordClassIndex(56857);
    }

    public final VideoCollectionListViewModel u() {
        return (VideoCollectionListViewModel) this.f90542j.getValue();
    }

    public final g v() {
        return (g) this.f90543k.getValue();
    }

    public final e w() {
        return (e) this.f90544l.getValue();
    }

    public static final class e implements com.bytedance.assem.arch.extensions.c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f90551a;

        /* renamed from: b  reason: collision with root package name */
        public final String f90552b;

        static {
            Covode.recordClassIndex(56863);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f90551a == eVar.f90551a && h.f.b.l.a(this.f90552b, eVar.f90552b);
        }

        public final int hashCode() {
            boolean z = this.f90551a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            String str = this.f90552b;
            return i5 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Config(moveToCollection=" + this.f90551a + ", excludeId=" + this.f90552b + ")";
        }

        private /* synthetic */ e() {
            this(false, null);
        }

        public e(boolean z, String str) {
            this.f90551a = z;
            this.f90552b = str;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(56868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return com.bytedance.assem.arch.service.d.b(this.this$0, ab.a(g.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.j$j  reason: collision with other inner class name */
    static final class C2188j implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f90556a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f90557b;

        static {
            Covode.recordClassIndex(56869);
        }

        C2188j(h hVar, j jVar) {
            this.f90556a = hVar;
            this.f90557b = jVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            j.a(this.f90557b.u(), new h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.e, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.c.j.C2188j.AnonymousClass1 */
                final /* synthetic */ C2188j this$0;

                static {
                    Covode.recordClassIndex(56870);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.e eVar) {
                    com.ss.android.ugc.aweme.favorites.viewmodel.e eVar2 = eVar;
                    h.f.b.l.d(eVar2, "");
                    if (eVar2.f91012c) {
                        this.this$0.f90556a.ag_();
                        this.this$0.f90557b.u().a(false, this.this$0.f90557b.w().f90552b);
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h $adapter;
        final /* synthetic */ RecyclerView $rv;

        static {
            Covode.recordClassIndex(56872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(RecyclerView recyclerView, h hVar) {
            super(0);
            this.$rv = recyclerView;
            this.$adapter = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$rv.setVisibility(8);
            this.$adapter.f();
            return z.f158842a;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(56858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(56860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.c.j$e, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.favorites.c.j.e invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.c.j$e> r1 = com.ss.android.ugc.aweme.favorites.c.j.e.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.c.j.c.invoke():java.lang.Object");
        }
    }

    public j() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoCollectionListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f90542j = bVar;
        this.f90543k = h.i.a((h.f.a.a) new i(this));
        this.f90544l = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    }

    final class h extends com.ss.android.ugc.aweme.common.a.f<com.ss.android.ugc.aweme.favorites.viewmodel.b> {
        static {
            Covode.recordClassIndex(56867);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public h() {
        }

        @Override // com.ss.android.ugc.aweme.common.a.l
        public final int c(int i2) {
            List e2 = e();
            h.f.b.l.b(e2, "");
            com.ss.android.ugc.aweme.favorites.viewmodel.b bVar = (com.ss.android.ugc.aweme.favorites.viewmodel.b) n.b(e2, i2);
            if (bVar != null) {
                return bVar.f91005b;
            }
            return 2;
        }

        @Override // com.ss.android.ugc.aweme.common.a.l
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
            h.f.b.l.d(viewGroup, "");
            if (i2 == 0) {
                return new f(j.this, viewGroup);
            }
            if (i2 == 2) {
                return new d(j.this, viewGroup);
            }
            throw new Exception("not match view type");
        }

        @Override // com.ss.android.ugc.aweme.common.a.l
        public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
            int i3;
            long j2;
            UrlModel urlModel;
            List<String> urlList;
            String str;
            Long l2;
            List e2 = e();
            if (e2 != null && n.b(e2, i2) != null) {
                if (viewHolder instanceof f) {
                    f fVar = (f) viewHolder;
                    fVar.itemView.setOnClickListener(new f.a(fVar));
                } else if (viewHolder instanceof d) {
                    d dVar = (d) viewHolder;
                    com.ss.android.ugc.aweme.favorites.api.d dVar2 = ((com.ss.android.ugc.aweme.favorites.viewmodel.b) e().get(i2)).f91004a;
                    String str2 = "";
                    h.f.b.l.d(dVar2, str2);
                    dVar.f90545a.setText(dVar2.f90450b);
                    TextView textView = dVar.f90545a;
                    if (gb.a(dVar.f90548d.ar_())) {
                        i3 = 4;
                    } else {
                        i3 = 3;
                    }
                    textView.setTextDirection(i3);
                    d.a aVar = dVar2.f90453e;
                    if (aVar == null || (l2 = aVar.f90454a) == null) {
                        j2 = 0;
                    } else {
                        j2 = l2.longValue();
                    }
                    TextView textView2 = dVar.f90547c;
                    Context context = dVar.f90547c.getContext();
                    h.f.b.l.b(context, str2);
                    textView2.setText(context.getResources().getQuantityString(R.plurals.co, (int) j2, String.valueOf(j2)));
                    List<UrlModel> list = dVar2.f90451c;
                    if (!(list == null || (urlModel = (UrlModel) n.b((List) list, 0)) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) n.b((List) urlList, 0)) == null)) {
                        str2 = str;
                    }
                    v a2 = r.a(str2);
                    a2.E = dVar.f90546b;
                    a2.c();
                    dVar.itemView.setOnClickListener(new d.a(dVar, dVar2));
                } else {
                    throw new Exception("not match view type");
                }
            }
        }
    }

    final class f extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f90553a;

        static {
            Covode.recordClassIndex(56864);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f90554a;

            static {
                Covode.recordClassIndex(56865);
            }

            a(f fVar) {
                this.f90554a = fVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f90554a.f90553a.v().a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(j jVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a01, viewGroup, false));
            h.f.b.l.d(viewGroup, "");
            this.f90553a = jVar;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ RecyclerView $rv;

        static {
            Covode.recordClassIndex(56873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(RecyclerView recyclerView) {
            super(1);
            this.$rv = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.$rv.setVisibility(8);
            return z.f158842a;
        }
    }

    final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f90545a;

        /* renamed from: b  reason: collision with root package name */
        public final SmartImageView f90546b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f90547c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f90548d;

        static {
            Covode.recordClassIndex(56861);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f90549a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.favorites.api.d f90550b;

            static {
                Covode.recordClassIndex(56862);
            }

            a(d dVar, com.ss.android.ugc.aweme.favorites.api.d dVar2) {
                this.f90549a = dVar;
                this.f90550b = dVar2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f90549a.f90548d.v().a(this.f90550b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j jVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a05, viewGroup, false));
            h.f.b.l.d(viewGroup, "");
            this.f90548d = jVar;
            View findViewById = this.itemView.findViewById(R.id.cs_);
            h.f.b.l.b(findViewById, "");
            this.f90545a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.agf);
            h.f.b.l.b(findViewById2, "");
            this.f90546b = (SmartImageView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.fhy);
            h.f.b.l.b(findViewById3, "");
            this.f90547c = (TextView) findViewById3;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.b>, z> {
        final /* synthetic */ h $adapter;
        final /* synthetic */ RecyclerView $rv;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(56871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j jVar, h hVar, RecyclerView recyclerView) {
            super(1);
            this.this$0 = jVar;
            this.$adapter = hVar;
            this.$rv = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.b> list) {
            List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.b> list2 = list;
            h.f.b.l.d(list2, "");
            this.$adapter.ai_();
            this.$rv.setVisibility(0);
            List e2 = this.$adapter.e();
            if (e2 != null) {
                e2.clear();
            }
            if (!this.this$0.w().f90551a) {
                this.$adapter.a(new com.ss.android.ugc.aweme.favorites.viewmodel.b(new com.ss.android.ugc.aweme.favorites.api.d(null, null, null, null, 31), 0));
            }
            this.$adapter.c(list2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        RecyclerView recyclerView = (RecyclerView) view;
        h hVar = new h();
        hVar.a((h.a) new C2188j(hVar, this));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(hVar);
        VideoCollectionListViewModel u = u();
        h.k.k kVar = k.f90558a;
        k kVar2 = new k(this, hVar, recyclerView);
        AssemViewModel.a(u, kVar, null, new m(recyclerView), new l(recyclerView, hVar), kVar2, 2);
        u().a(true, w().f90552b);
    }
}
