package com.ss.android.ugc.aweme.detail.operators;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.q;
import com.bytedance.widget.Widget;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class p implements aa {

    /* renamed from: a  reason: collision with root package name */
    public boolean f79818a;

    /* renamed from: b  reason: collision with root package name */
    public final SearchJediViewModel f79819b;

    /* renamed from: c  reason: collision with root package name */
    private q f79820c;

    public static final class a extends m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(49653);
        }

        public a() {
            super(1);
        }

        @Override // h.f.a.b
        public final void invoke(com.bytedance.jedi.arch.i iVar) {
        }
    }

    public static final class b extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(49654);
        }

        public b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* bridge */ /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            invoke(iVar, th);
            return z.f158842a;
        }

        public final void invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            l.c(th, "");
        }
    }

    public static final class e implements com.bytedance.jedi.arch.ext.list.a<com.ss.android.ugc.aweme.discover.mixfeed.h> {
        static {
            Covode.recordClassIndex(49657);
        }

        @Override // com.bytedance.jedi.arch.ext.list.a
        public final void a(List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list, h.f.a.a<z> aVar) {
            l.d(list, "");
        }

        public static final class a extends RecyclerView.a<RecyclerView.ViewHolder> {
            static {
                Covode.recordClassIndex(49658);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final int getItemCount() {
                return 0;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                l.d(viewHolder, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.a
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                return a(viewGroup, i2);
            }

            a() {
            }

            /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$e$a$a  reason: collision with other inner class name */
            public static final class C1862a extends RecyclerView.ViewHolder {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ViewGroup f79833a;

                static {
                    Covode.recordClassIndex(49659);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1862a(ViewGroup viewGroup, View view) {
                    super(view);
                    this.f79833a = viewGroup;
                }
            }

            private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
                boolean a2;
                MethodCollector.i(1705);
                l.d(viewGroup, "");
                C1862a aVar = new C1862a(viewGroup, new View(viewGroup.getContext()));
                try {
                    if (aVar.itemView.getParent() != null) {
                        try {
                            a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a2) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                            com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(aVar.itemView);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ai.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                gg.f143005a = aVar.getClass().getName();
                MethodCollector.o(1705);
                return aVar;
            }
        }

        e() {
        }

        @Override // com.bytedance.jedi.arch.ext.list.a
        public final com.bytedance.jedi.arch.ext.list.a.b<com.ss.android.ugc.aweme.discover.mixfeed.h> a() {
            return new com.bytedance.jedi.arch.ext.list.a.b<>(new a(), new com.ss.android.ugc.aweme.discover.jedi.a.a(), (byte) 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.jedi.arch.ext.list.a
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.h a(int i2) {
            return a.C0960a.a((com.bytedance.jedi.arch.ext.list.a) this, i2, false);
        }
    }

    static {
        Covode.recordClassIndex(49652);
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
        return 9;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
    }

    public static final class c implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.discover.mixfeed.h, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f79821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f79822b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f79823c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f79824d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f79825e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h>, z> f79826f;

        static {
            Covode.recordClassIndex(49655);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f79824d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f79825e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h>, z> c() {
            return this.f79826f;
        }

        public c(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f79821a = bVar;
            this.f79822b = mVar;
            this.f79823c = mVar2;
            this.f79824d = bVar;
            this.f79825e = mVar;
            this.f79826f = mVar2;
        }
    }

    public static final class d implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.discover.mixfeed.h, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f79827a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f79828b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f79829c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f79830d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f79831e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h>, z> f79832f;

        static {
            Covode.recordClassIndex(49656);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f79830d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f79831e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h>, z> c() {
            return this.f79832f;
        }

        public d(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f79827a = bVar;
            this.f79828b = mVar;
            this.f79829c = mVar2;
            this.f79830d = bVar;
            this.f79831e = mVar;
            this.f79832f = mVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final Object getViewModel() {
        return this.f79819b;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return this.f79818a;
    }

    public p(SearchJediViewModel searchJediViewModel) {
        this.f79819b = searchJediViewModel;
    }

    static final class g extends m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(49662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(p pVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(1);
            this.this$0 = pVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            l.d(iVar, "");
            this.$listView.aO_();
            this.this$0.f79818a = true;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        if (this.f79819b == null) {
            return false;
        }
        this.f79820c = new DetailJediWidget();
        View view = fragment.getView();
        if (view == null) {
            l.b();
        }
        com.bytedance.widget.c a2 = c.a.a(fragment, view);
        q qVar = this.f79820c;
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
        SearchJediViewModel searchJediViewModel = this.f79819b;
        if (searchJediViewModel == null) {
            l.b();
        }
        q qVar = this.f79820c;
        if (qVar == null) {
            l.a("jediView");
        }
        e eVar = new e();
        c cVar = new c(a.INSTANCE, b.INSTANCE, new f(this, adVar));
        d dVar = new d(new g(this, adVar), new i(this, adVar), new h(this, adVar));
        l.d(searchJediViewModel, "");
        l.d(qVar, "");
        l.d(eVar, "");
        ListMiddleware.a(searchJediViewModel.f81366c, qVar, eVar, qVar.getUniqueOnlyGlobal(), cVar, dVar, null, null, 896);
    }

    static final class f extends m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(49660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p pVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = pVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(list, "");
            iVar2.withState(this.this$0.f79819b, new h.f.a.b<SearchState, z>(this) {
                /* class com.ss.android.ugc.aweme.detail.operators.p.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(49661);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(SearchState searchState) {
                    SearchState searchState2 = searchState;
                    l.d(searchState2, "");
                    com.bytedance.jedi.arch.ext.list.b bVar = searchState2.getListState().getPayload().f39459a;
                    List<com.ss.android.ugc.aweme.discover.mixfeed.h> list = searchState2.getListState().getList();
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t.getFeedType() == 65280) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<com.ss.android.ugc.aweme.newfollow.b.a> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                    for (com.ss.android.ugc.aweme.newfollow.b.a aVar : arrayList2) {
                        arrayList3.add(aVar.getAweme());
                    }
                    this.this$0.$listView.a(arrayList3, bVar.f39447a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(49665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(p pVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = pVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            Throwable th2 = th;
            l.d(iVar, "");
            l.d(th2, "");
            this.$listView.c(new Exception(th2));
            this.this$0.f79818a = false;
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listView;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(49663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(p pVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = pVar;
            this.$listView = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(list, "");
            SearchJediViewModel searchJediViewModel = this.this$0.f79819b;
            if (searchJediViewModel == null) {
                l.b();
            }
            iVar2.withState(searchJediViewModel, new h.f.a.b<SearchState, z>(this) {
                /* class com.ss.android.ugc.aweme.detail.operators.p.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(49664);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(SearchState searchState) {
                    SearchState searchState2 = searchState;
                    l.d(searchState2, "");
                    com.bytedance.jedi.arch.ext.list.b bVar = searchState2.getListState().getPayload().f39459a;
                    List<com.ss.android.ugc.aweme.discover.mixfeed.h> list = searchState2.getListState().getList();
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t.getFeedType() == 65280) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<com.ss.android.ugc.aweme.newfollow.b.a> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                    for (com.ss.android.ugc.aweme.newfollow.b.a aVar : arrayList2) {
                        arrayList3.add(aVar.getAweme());
                    }
                    this.this$0.$listView.b(arrayList3, bVar.f39447a);
                    return z.f158842a;
                }
            });
            this.this$0.f79818a = false;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        if (i2 == 1) {
            SearchJediViewModel searchJediViewModel = this.f79819b;
            if (searchJediViewModel == null) {
                l.b();
            }
            if (searchJediViewModel.f81364a != null) {
                f.a.b.b bVar2 = searchJediViewModel.f81364a;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                searchJediViewModel.c(SearchJediViewModel.b.f81370a);
            }
            searchJediViewModel.f81366c.refresh();
        } else if (i2 == 4) {
            SearchJediViewModel searchJediViewModel2 = this.f79819b;
            if (searchJediViewModel2 == null) {
                l.b();
            }
            if (searchJediViewModel2.f81365b != null) {
                f.a.b.b bVar3 = searchJediViewModel2.f81365b;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                searchJediViewModel2.c(SearchJediViewModel.a.f81369a);
            }
            searchJediViewModel2.f81366c.loadMore();
        }
    }
}
