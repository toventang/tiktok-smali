package com.ss.android.ugc.aweme.favorites.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.favorites.api.d;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.ab;
import h.z;
import java.util.Collection;
import java.util.List;

public final class n extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    final h.h f90563j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90564k;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.e, com.ss.android.ugc.aweme.favorites.viewmodel.e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(56888);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.e invoke(com.ss.android.ugc.aweme.favorites.viewmodel.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    public interface f extends com.bytedance.assem.arch.service.c {
        static {
            Covode.recordClassIndex(56899);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(56886);
    }

    public final VideoCollectionListViewModel u() {
        return (VideoCollectionListViewModel) this.f90564k.getValue();
    }

    static final class h extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(56901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return com.bytedance.assem.arch.service.d.b(this.this$0, ab.a(f.class));
        }
    }

    static final class i implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f90589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f90590b;

        static {
            Covode.recordClassIndex(56902);
        }

        i(g gVar, n nVar) {
            this.f90589a = gVar;
            this.f90590b = nVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            n.a(this.f90590b.u(), new h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.e, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.c.n.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(56903);
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
                        this.this$0.f90589a.ag_();
                        this.this$0.f90590b.u().a(false);
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ g $adapter;
        final /* synthetic */ RecyclerView $rv;

        static {
            Covode.recordClassIndex(56905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(RecyclerView recyclerView, g gVar) {
            super(0);
            this.$rv = recyclerView;
            this.$adapter = gVar;
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
            Covode.recordClassIndex(56887);
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

    public n() {
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
        this.f90564k = bVar;
        this.f90563j = h.i.a((h.f.a.a) new h(this));
    }

    final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final SmartImageView f90565a;

        /* renamed from: b  reason: collision with root package name */
        public final SmartImageView f90566b;

        /* renamed from: c  reason: collision with root package name */
        public final SmartImageView f90567c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f90568d;

        /* renamed from: e  reason: collision with root package name */
        public final View f90569e;

        /* renamed from: f  reason: collision with root package name */
        public final View f90570f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f90571g;

        static {
            Covode.recordClassIndex(56889);
        }

        public static final class a implements com.bytedance.lighten.a.c.n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f90572a;

            static {
                Covode.recordClassIndex(56890);
            }

            @Override // com.bytedance.lighten.a.c.n
            public final void a() {
            }

            @Override // com.bytedance.lighten.a.c.n
            public final void a(Throwable th) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(c cVar) {
                this.f90572a = cVar;
            }

            /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$c$a$c  reason: collision with other inner class name */
            static final class C2190c<T> implements f.a.d.f {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f90577a;

                static {
                    Covode.recordClassIndex(56893);
                }

                C2190c(a aVar) {
                    this.f90577a = aVar;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f90577a.f90572a.f90568d.setImageResource(R.color.f159926j);
                }
            }

            static final class b<T> implements f.a.d.f {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Bitmap f90575a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f90576b;

                static {
                    Covode.recordClassIndex(56892);
                }

                b(Bitmap bitmap, a aVar) {
                    this.f90575a = bitmap;
                    this.f90576b = aVar;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f90576b.f90572a.f90568d.setImageBitmap((Bitmap) obj);
                    this.f90576b.f90572a.f90565a.setImageBitmap(this.f90575a);
                }
            }

            @Override // com.bytedance.lighten.a.c.n
            public final void a(Bitmap bitmap) {
                if (bitmap != null) {
                    t.b("").a(f.a.h.a.a(f.a.k.a.f158005b)).d(new C2189a(bitmap, this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(bitmap, this), new C2190c(this));
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.favorites.c.n$c$a$a  reason: collision with other inner class name */
            static final class C2189a<T, R> implements f.a.d.g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Bitmap f90573a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f90574b;

                static {
                    Covode.recordClassIndex(56891);
                }

                C2189a(Bitmap bitmap, a aVar) {
                    this.f90573a = bitmap;
                    this.f90574b = aVar;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    MethodCollector.i(9017);
                    h.f.b.l.d(obj, "");
                    Bitmap bitmap = this.f90573a;
                    double width = (double) bitmap.getWidth();
                    Double.isNaN(width);
                    double height = (double) this.f90573a.getHeight();
                    Double.isNaN(height);
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * 0.05d), (int) (height * 0.05d), false);
                    this.f90574b.f90572a.f90571g.ar_();
                    Bitmap.Config config = createScaledBitmap.getConfig();
                    if (config == null) {
                        MethodCollector.o(9017);
                        return null;
                    }
                    Bitmap copy = createScaledBitmap.copy(config, true);
                    com.ss.android.e.b.a(createScaledBitmap, copy, 25);
                    MethodCollector.o(9017);
                    return copy;
                }
            }
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f90578a;

            static {
                Covode.recordClassIndex(56894);
            }

            b(c cVar) {
                this.f90578a = cVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                SmartRouter.buildRoute(this.f90578a.f90571g.ar_(), "aweme://favorite/videos/allfavorites/content").open();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(n nVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.zv, viewGroup, false));
            h.f.b.l.d(viewGroup, "");
            this.f90571g = nVar;
            View findViewById = this.itemView.findViewById(R.id.agg);
            h.f.b.l.b(findViewById, "");
            this.f90565a = (SmartImageView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.agh);
            h.f.b.l.b(findViewById2, "");
            this.f90566b = (SmartImageView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.agi);
            h.f.b.l.b(findViewById3, "");
            this.f90567c = (SmartImageView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.si);
            h.f.b.l.b(findViewById4, "");
            this.f90568d = (ImageView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.ckm);
            h.f.b.l.b(findViewById5, "");
            this.f90569e = findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.aw6);
            h.f.b.l.b(findViewById6, "");
            this.f90570f = findViewById6;
        }
    }

    final class g extends com.ss.android.ugc.aweme.common.a.f<com.ss.android.ugc.aweme.favorites.viewmodel.b> {
        static {
            Covode.recordClassIndex(56900);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public g() {
        }

        @Override // com.ss.android.ugc.aweme.common.a.l
        public final int c(int i2) {
            com.ss.android.ugc.aweme.favorites.viewmodel.b bVar;
            List e2 = e();
            if (e2 == null || (bVar = (com.ss.android.ugc.aweme.favorites.viewmodel.b) h.a.n.b(e2, i2)) == null) {
                return 2;
            }
            return bVar.f91005b;
        }

        @Override // com.ss.android.ugc.aweme.common.a.l
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
            h.f.b.l.d(viewGroup, "");
            if (i2 == 0) {
                return new e(n.this, viewGroup);
            }
            if (i2 == 1) {
                return new c(n.this, viewGroup);
            }
            if (i2 == 2) {
                return new d(n.this, viewGroup);
            }
            throw new Exception("not match view type");
        }

        @Override // com.ss.android.ugc.aweme.common.a.l
        public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
            int i3;
            UrlModel urlModel;
            List<String> urlList;
            String str;
            String str2;
            String str3;
            UrlModel urlModel2;
            List<String> urlList2;
            String str4;
            UrlModel urlModel3;
            List<String> urlList3;
            UrlModel urlModel4;
            List<String> urlList4;
            List e2 = e();
            if (e2 != null && h.a.n.b(e2, i2) != null) {
                if (viewHolder instanceof e) {
                    e eVar = (e) viewHolder;
                    eVar.itemView.setOnClickListener(new e.a(eVar));
                    return;
                }
                int i4 = 4;
                int i5 = 8;
                String str5 = "";
                if (viewHolder instanceof c) {
                    c cVar = (c) viewHolder;
                    com.ss.android.ugc.aweme.favorites.api.d dVar = ((com.ss.android.ugc.aweme.favorites.viewmodel.b) e().get(i2)).f91004a;
                    h.f.b.l.d(dVar, str5);
                    if (dVar.f90451c == null || dVar.f90451c.size() <= 1) {
                        cVar.f90566b.setVisibility(8);
                        cVar.f90567c.setVisibility(8);
                        cVar.f90569e.setVisibility(0);
                    } else if (dVar.f90451c.size() <= 2) {
                        cVar.f90566b.setVisibility(0);
                        cVar.f90567c.setVisibility(4);
                        cVar.f90569e.setVisibility(8);
                    } else {
                        cVar.f90566b.setVisibility(0);
                        cVar.f90567c.setVisibility(0);
                        cVar.f90569e.setVisibility(8);
                    }
                    List<UrlModel> list = dVar.f90451c;
                    if (list == null || (urlModel4 = (UrlModel) h.a.n.b((List) list, 0)) == null || (urlList4 = urlModel4.getUrlList()) == null || (str2 = (String) h.a.n.b((List) urlList4, 0)) == null) {
                        str2 = str5;
                    }
                    List<UrlModel> list2 = dVar.f90451c;
                    if (list2 == null || (urlModel3 = (UrlModel) h.a.n.b((List) list2, 1)) == null || (urlList3 = urlModel3.getUrlList()) == null || (str3 = (String) h.a.n.b((List) urlList3, 0)) == null) {
                        str3 = str5;
                    }
                    List<UrlModel> list3 = dVar.f90451c;
                    if (!(list3 == null || (urlModel2 = (UrlModel) h.a.n.b((List) list3, 2)) == null || (urlList2 = urlModel2.getUrlList()) == null || (str4 = (String) h.a.n.b((List) urlList2, 0)) == null)) {
                        str5 = str4;
                    }
                    View view = cVar.f90570f;
                    List<UrlModel> list4 = dVar.f90451c;
                    if (list4 == null || list4.isEmpty()) {
                        i5 = 0;
                    }
                    view.setVisibility(i5);
                    v a2 = r.a(str2);
                    a2.E = cVar.f90565a;
                    a2.a(new c.a(cVar));
                    v a3 = r.a(str3);
                    a3.E = cVar.f90566b;
                    a3.c();
                    v a4 = r.a(str5);
                    a4.E = cVar.f90567c;
                    a4.c();
                    cVar.itemView.setOnClickListener(new c.b(cVar));
                } else if (viewHolder instanceof d) {
                    d dVar2 = (d) viewHolder;
                    com.ss.android.ugc.aweme.favorites.api.d dVar3 = ((com.ss.android.ugc.aweme.favorites.viewmodel.b) e().get(i2)).f91004a;
                    List<com.ss.android.ugc.aweme.favorites.viewmodel.b> e3 = e();
                    h.f.b.l.b(e3, str5);
                    if (!(e3 instanceof Collection) || !e3.isEmpty()) {
                        i3 = 0;
                        for (com.ss.android.ugc.aweme.favorites.viewmodel.b bVar : e3) {
                            if (bVar.f91005b == 2 && (i3 = i3 + 1) < 0) {
                                h.a.n.b();
                            }
                        }
                    } else {
                        i3 = 0;
                    }
                    h.f.b.l.d(dVar3, str5);
                    dVar2.f90579a.setText(dVar3.f90450b);
                    TextView textView = dVar2.f90579a;
                    if (!gb.a(dVar2.f90582d.ar_())) {
                        i4 = 3;
                    }
                    textView.setTextDirection(i4);
                    List<UrlModel> list5 = dVar3.f90451c;
                    if (!(list5 == null || (urlModel = (UrlModel) h.a.n.b((List) list5, 0)) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) h.a.n.b((List) urlList, 0)) == null)) {
                        str5 = str;
                    }
                    View view2 = dVar2.f90581c;
                    if (str5.length() == 0) {
                        i5 = 0;
                    }
                    view2.setVisibility(i5);
                    v a5 = r.a(str5);
                    a5.E = dVar2.f90580b;
                    a5.c();
                    dVar2.itemView.setOnClickListener(new d.a(dVar2, dVar3, i3));
                } else {
                    throw new Exception("not match view type");
                }
            }
        }
    }

    public static final class m extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f90591e;

        static {
            Covode.recordClassIndex(56907);
        }

        m(g gVar) {
            this.f90591e = gVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (this.f90591e.getItemViewType(i2) == 0) {
                return 2;
            }
            return 1;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ RecyclerView $rv;

        static {
            Covode.recordClassIndex(56906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(RecyclerView recyclerView) {
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

    final class e extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f90586a;

        static {
            Covode.recordClassIndex(56897);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f90587a;

            static {
                Covode.recordClassIndex(56898);
            }

            a(e eVar) {
                this.f90587a = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                ((f) this.f90587a.f90586a.f90563j.getValue()).a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(n nVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a02, viewGroup, false));
            h.f.b.l.d(viewGroup, "");
            this.f90586a = nVar;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.b>, z> {
        final /* synthetic */ g $adapter;
        final /* synthetic */ RecyclerView $rv;

        static {
            Covode.recordClassIndex(56904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar, RecyclerView recyclerView) {
            super(1);
            this.$adapter = gVar;
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
            if (!list2.isEmpty()) {
                this.$adapter.a(new com.ss.android.ugc.aweme.favorites.viewmodel.b(new com.ss.android.ugc.aweme.favorites.api.d(null, null, null, null, 31), 0));
            }
            this.$adapter.c(list2);
            return z.f158842a;
        }
    }

    final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f90579a;

        /* renamed from: b  reason: collision with root package name */
        public final SmartImageView f90580b;

        /* renamed from: c  reason: collision with root package name */
        public final View f90581c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f90582d;

        static {
            Covode.recordClassIndex(56895);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f90583a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.favorites.api.d f90584b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f90585c;

            static {
                Covode.recordClassIndex(56896);
            }

            a(d dVar, com.ss.android.ugc.aweme.favorites.api.d dVar2, int i2) {
                this.f90583a = dVar;
                this.f90584b = dVar2;
                this.f90585c = i2;
            }

            public final void onClick(View view) {
                Integer num;
                long j2;
                Long l2;
                ClickAgent.onClick(view);
                SmartRoute withParam = SmartRouter.buildRoute(this.f90583a.f90582d.ar_(), "aweme://favorite/videos/collections/content").withParam(StringSet.name, this.f90584b.f90450b).withParam("collectionCount", this.f90585c).withParam("id", this.f90584b.f90449a);
                d.b bVar = this.f90584b.f90452d;
                if (bVar != null) {
                    num = bVar.f90456a;
                } else {
                    num = null;
                }
                SmartRoute withParam2 = withParam.withParam("state", num);
                d.a aVar = this.f90584b.f90453e;
                if (aVar == null || (l2 = aVar.f90454a) == null) {
                    j2 = 0;
                } else {
                    j2 = l2.longValue();
                }
                withParam2.withParam("total", j2).open();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(n nVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a00, viewGroup, false));
            h.f.b.l.d(viewGroup, "");
            this.f90582d = nVar;
            View findViewById = this.itemView.findViewById(R.id.cs_);
            h.f.b.l.b(findViewById, "");
            this.f90579a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.agf);
            h.f.b.l.b(findViewById2, "");
            this.f90580b = (SmartImageView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.aw6);
            h.f.b.l.b(findViewById3, "");
            this.f90581c = findViewById3;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        RecyclerView recyclerView = (RecyclerView) view;
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        h.f.b.l.a((Object) system2, "");
        com.bytedance.tux.h.i.a((View) recyclerView, valueOf, (Integer) null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics()))), (Integer) null, false, 26);
        g gVar = new g();
        gVar.a((h.a) new i(gVar, this));
        gVar.s = new m(gVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        recyclerView.setAdapter(gVar);
        VideoCollectionListViewModel u = u();
        h.k.k kVar = o.f90592a;
        j jVar = new j(gVar, recyclerView);
        AssemViewModel.a(u, kVar, null, new l(recyclerView), new k(recyclerView, gVar), jVar, 2);
        u().a(true);
    }
}
