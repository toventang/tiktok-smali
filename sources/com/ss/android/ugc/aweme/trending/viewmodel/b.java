package com.ss.android.ugc.aweme.trending.viewmodel;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.q;
import com.bytedance.widget.Widget;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b implements aa {

    /* renamed from: e  reason: collision with root package name */
    public static final a f141177e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f141178a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f141179b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f141180c;

    /* renamed from: d  reason: collision with root package name */
    public final TrendingMainViewModel f141181d;

    /* renamed from: f  reason: collision with root package name */
    private q f141182f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f141183g = h.i.a((h.f.a.a) j.f141196a);

    static {
        Covode.recordClassIndex(92185);
    }

    public final ISearchService a() {
        return (ISearchService) this.f141183g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return 30;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
    }

    static final class a {
        static {
            Covode.recordClassIndex(92186);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$b  reason: collision with other inner class name */
    public static final class C3740b implements com.bytedance.jedi.arch.ext.list.c<Aweme, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f141184a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f141185b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f141186c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f141187d;

        /* renamed from: e  reason: collision with root package name */
        private final m<com.bytedance.jedi.arch.i, Throwable, z> f141188e;

        /* renamed from: f  reason: collision with root package name */
        private final m<com.bytedance.jedi.arch.i, List<? extends Aweme>, z> f141189f;

        static {
            Covode.recordClassIndex(92187);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f141187d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f141188e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<com.bytedance.jedi.arch.i, List<? extends Aweme>, z> c() {
            return this.f141189f;
        }

        public C3740b(h.f.a.b bVar, m mVar, m mVar2) {
            this.f141184a = bVar;
            this.f141185b = mVar;
            this.f141186c = mVar2;
            this.f141187d = bVar;
            this.f141188e = mVar;
            this.f141189f = mVar2;
        }
    }

    public static final class c implements com.bytedance.jedi.arch.ext.list.c<Aweme, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f141190a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f141191b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f141192c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f141193d;

        /* renamed from: e  reason: collision with root package name */
        private final m<com.bytedance.jedi.arch.i, Throwable, z> f141194e;

        /* renamed from: f  reason: collision with root package name */
        private final m<com.bytedance.jedi.arch.i, List<? extends Aweme>, z> f141195f;

        static {
            Covode.recordClassIndex(92188);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f141193d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f141194e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final m<com.bytedance.jedi.arch.i, List<? extends Aweme>, z> c() {
            return this.f141195f;
        }

        public c(h.f.a.b bVar, m mVar, m mVar2) {
            this.f141190a = bVar;
            this.f141191b = mVar;
            this.f141192c = mVar2;
            this.f141193d = bVar;
            this.f141194e = mVar;
            this.f141195f = mVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        return this.f141181d;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return this.f141180c;
    }

    static final class j extends h.f.b.m implements h.f.a.a<ISearchService> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f141196a = new j();

        static {
            Covode.recordClassIndex(92198);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchService invoke() {
            return SearchServiceImpl.t();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(1);
            this.this$0 = bVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            l.d(iVar2, "");
            iVar2.withState(this.this$0.f141181d, new h.f.a.b<TrendingMainState, z>(this) {
                /* class com.ss.android.ugc.aweme.trending.viewmodel.b.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(92190);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(TrendingMainState trendingMainState) {
                    TrendingMainState trendingMainState2 = trendingMainState;
                    l.d(trendingMainState2, "");
                    if (trendingMainState2.getInitAwemeList().isEmpty() || !this.this$0.this$0.f141179b) {
                        this.this$0.$listView.b();
                    }
                    return z.f158842a;
                }
            });
            this.this$0.f141180c = true;
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(1);
            this.this$0 = bVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            l.d(iVar, "");
            this.$listView.aO_();
            this.this$0.f141180c = true;
            return z.f158842a;
        }
    }

    public b(TrendingMainViewModel trendingMainViewModel) {
        this.f141181d = trendingMainViewModel;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        if (this.f141181d == null) {
            return false;
        }
        this.f141182f = new JediWidget();
        com.bytedance.widget.c a2 = c.a.a(fragment, fragment.getView());
        q qVar = this.f141182f;
        if (qVar == null) {
            l.a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a2.a((Widget) qVar);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        l.d(adVar, "");
        adVar.az_();
        TrendingMainViewModel trendingMainViewModel = this.f141181d;
        if (trendingMainViewModel != null) {
            q qVar = this.f141182f;
            if (qVar == null) {
                l.a("jediView");
            }
            ListViewModel.a(trendingMainViewModel, qVar, (com.bytedance.jedi.arch.ext.list.a) null, new C3740b(new d(this, adVar), new f(this, adVar), new e(this, adVar)), new c(new g(this, adVar), new i(this, adVar), new h(this, adVar)), 242);
        }
    }

    static final class e extends h.f.b.m implements m<com.bytedance.jedi.arch.i, List<? extends Aweme>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = bVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Aweme> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(list, "");
            iVar2.withState(this.this$0.f141181d, new h.f.a.b<TrendingMainState, z>(this) {
                /* class com.ss.android.ugc.aweme.trending.viewmodel.b.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(92192);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(TrendingMainState trendingMainState) {
                    TrendingMainState trendingMainState2 = trendingMainState;
                    l.d(trendingMainState2, "");
                    this.this$0.this$0.f141180c = false;
                    List<Aweme> list = trendingMainState2.getSubstate().getList();
                    list.size();
                    ArrayList arrayList = new ArrayList();
                    if (this.this$0.this$0.f141179b) {
                        arrayList.addAll(trendingMainState2.getInitAwemeList());
                        this.this$0.this$0.f141178a = trendingMainState2.getInitAwemeList().size();
                        this.this$0.this$0.a().a(false, (List<? extends Aweme>) list, this.this$0.this$0.f141178a);
                        for (T t : list) {
                            if (!e.a(t, trendingMainState2.getInitAwemeList())) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        this.this$0.this$0.f141178a = 0;
                        arrayList.addAll(list);
                        this.this$0.this$0.a().a(true, (List<? extends Aweme>) list, this.this$0.this$0.f141178a);
                    }
                    arrayList.size();
                    if (!this.this$0.this$0.f141179b) {
                        this.this$0.this$0.f141181d.f141166e.setValue(false);
                    }
                    this.this$0.$listView.a(arrayList, trendingMainState2.getSubstate().getHasMore().f39447a);
                    this.this$0.this$0.f141179b = false;
                    this.this$0.this$0.f141181d.f141169k = false;
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements m<com.bytedance.jedi.arch.i, List<? extends Aweme>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = bVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Aweme> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(list, "");
            iVar2.withState(this.this$0.f141181d, new h.f.a.b<TrendingMainState, z>(this) {
                /* class com.ss.android.ugc.aweme.trending.viewmodel.b.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(92196);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(TrendingMainState trendingMainState) {
                    TrendingMainState trendingMainState2 = trendingMainState;
                    l.d(trendingMainState2, "");
                    this.this$0.this$0.f141180c = false;
                    trendingMainState2.getSubstate().getList().size();
                    List<Aweme> list = trendingMainState2.getSubstate().getList();
                    this.this$0.this$0.a().a(false, (List<? extends Aweme>) list, this.this$0.this$0.f141178a);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    arrayList.size();
                    this.this$0.$listView.b(arrayList, trendingMainState2.getSubstate().getHasMore().f39447a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = bVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            Throwable th2 = th;
            l.d(iVar, "");
            l.d(th2, "");
            com.ss.android.ugc.aweme.common.e.c cVar = this.$listView;
            if (!(th2 instanceof Exception)) {
                th2 = null;
            }
            cVar.c((Exception) th2);
            this.this$0.f141180c = false;
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = bVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            Throwable th2 = th;
            l.d(iVar, "");
            l.d(th2, "");
            this.this$0.f141181d.f141166e.setValue(false);
            com.ss.android.ugc.aweme.common.e.c cVar = this.$listView;
            if (!(th2 instanceof Exception)) {
                th2 = null;
            }
            cVar.b((Exception) th2);
            this.this$0.f141180c = false;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        TrendingMainViewModel trendingMainViewModel;
        l.d(bVar, "");
        if (i2 == 1) {
            TrendingMainViewModel trendingMainViewModel2 = this.f141181d;
            if (trendingMainViewModel2 != null) {
                trendingMainViewModel2.k();
            }
        } else if (i2 == 4 && (trendingMainViewModel = this.f141181d) != null) {
            trendingMainViewModel.l();
        }
    }
}
