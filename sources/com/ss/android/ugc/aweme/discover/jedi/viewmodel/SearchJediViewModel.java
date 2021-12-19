package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.f;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import f.a.d.g;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

public final class SearchJediViewModel extends JediViewModel<SearchState> {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f81364a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f81365b;

    /* renamed from: c  reason: collision with root package name */
    public final ListMiddleware<SearchState, h, e> f81366c = new ListMiddleware<>(new d(this), new c(this), null, e.f81379a, 4);

    /* renamed from: d  reason: collision with root package name */
    public List<h> f81367d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f81368e;

    static {
        Covode.recordClassIndex(50562);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ SearchState d() {
        return new SearchState(null, null, 3, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        new SearchJediViewModelMiddlewareBinding().binding(this);
    }

    public static final class a extends m implements h.f.a.b<SearchState, SearchState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81369a = new a();

        static {
            Covode.recordClassIndex(50563);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SearchState invoke(SearchState searchState) {
            SearchState searchState2 = searchState;
            l.d(searchState2, "");
            return SearchState.copy$default(searchState2, ListState.copy$default(searchState2.getListState(), null, null, null, new f(new CancellationException()), null, 23, null), null, 2, null);
        }
    }

    public static final class b extends m implements h.f.a.b<SearchState, SearchState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f81370a = new b();

        static {
            Covode.recordClassIndex(50564);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SearchState invoke(SearchState searchState) {
            SearchState searchState2 = searchState;
            l.d(searchState2, "");
            return SearchState.copy$default(searchState2, ListState.copy$default(searchState2.getListState(), null, null, new f(new CancellationException()), null, null, 27, null), null, 2, null);
        }
    }

    static final class d extends m implements h.f.a.b<SearchState, t<p<? extends List<? extends h>, ? extends e>>> {
        final /* synthetic */ SearchJediViewModel this$0;

        static {
            Covode.recordClassIndex(50570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchJediViewModel searchJediViewModel) {
            super(1);
            this.this$0 = searchJediViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends h>, ? extends e>> invoke(SearchState searchState) {
            SearchState searchState2 = searchState;
            l.d(searchState2, "");
            t<R> d2 = SearchApiNew.a(searchState2.getSearchParam(), 0, a.f81382a, null).c(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f81375a;

                static {
                    Covode.recordClassIndex(50571);
                }

                {
                    this.f81375a = r1;
                }

                @Override // f.a.d.f
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    this.f81375a.this$0.f81364a = (f.a.b.b) obj;
                }
            }).b(new f.a.d.a(this) {
                /* class com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.d.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f81376a;

                static {
                    Covode.recordClassIndex(50572);
                }

                {
                    this.f81376a = r1;
                }

                @Override // f.a.d.a
                public final void a() {
                    this.f81376a.this$0.f81364a = null;
                }
            }).d(new g(this) {
                /* class com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.d.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f81377a;

                static {
                    Covode.recordClassIndex(50573);
                }

                {
                    this.f81377a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    com.ss.android.ugc.aweme.discover.mixfeed.m mVar = (com.ss.android.ugc.aweme.discover.mixfeed.m) obj;
                    l.d(mVar, "");
                    SearchJediViewModel searchJediViewModel = this.f81377a.this$0;
                    searchJediViewModel.f81367d = null;
                    searchJediViewModel.f81368e = false;
                    SearchJediViewModel.b(mVar.f81826c);
                    this.f81377a.this$0.a(mVar.f81826c);
                    return mVar;
                }
            }).d(AnonymousClass4.f81378a);
            l.b(d2, "");
            return d2;
        }
    }

    static boolean a(h hVar) {
        Integer valueOf;
        if (hVar == null || (valueOf = Integer.valueOf(hVar.getFeedType())) == null) {
            return false;
        }
        if (valueOf.intValue() == 65280 || valueOf.intValue() == 1048336) {
            return true;
        }
        return false;
    }

    public static void b(List<h> list) {
        if (list != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (h hVar : list) {
                if (hVar.getFeedType() == 65515 && hVar.f81780b.size() < 3) {
                    arrayList.add(hVar);
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
    }

    static final class c extends m implements h.f.a.b<SearchState, t<p<? extends List<? extends h>, ? extends e>>> {
        final /* synthetic */ SearchJediViewModel this$0;

        static {
            Covode.recordClassIndex(50565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchJediViewModel searchJediViewModel) {
            super(1);
            this.this$0 = searchJediViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends h>, ? extends e>> invoke(SearchState searchState) {
            SearchState searchState2 = searchState;
            l.d(searchState2, "");
            final f searchParam = searchState2.getSearchParam();
            String str = searchState2.getListState().getPayload().f81385c;
            l.d(str, "");
            searchParam.f81393g = str;
            int i2 = searchState2.getListState().getPayload().f39460b;
            SearchApiResult searchApiResult = searchState2.getListState().getPayload().f81386d;
            Objects.requireNonNull(searchApiResult, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
            t<R> d2 = SearchApiNew.a(searchParam, i2, 10, (com.ss.android.ugc.aweme.discover.mixfeed.m) searchApiResult).c(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f81371a;

                static {
                    Covode.recordClassIndex(50566);
                }

                {
                    this.f81371a = r1;
                }

                @Override // f.a.d.f
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    this.f81371a.this$0.f81365b = (f.a.b.b) obj;
                }
            }).b(new f.a.d.a(this) {
                /* class com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.c.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f81372a;

                static {
                    Covode.recordClassIndex(50567);
                }

                {
                    this.f81372a = r1;
                }

                @Override // f.a.d.a
                public final void a() {
                    this.f81372a.this$0.f81365b = null;
                }
            }).d(new g(this) {
                /* class com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.c.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f81373a;

                static {
                    Covode.recordClassIndex(50568);
                }

                {
                    this.f81373a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    com.ss.android.ugc.aweme.discover.mixfeed.m mVar = (com.ss.android.ugc.aweme.discover.mixfeed.m) obj;
                    l.d(mVar, "");
                    SearchJediViewModel searchJediViewModel = this.f81373a.this$0;
                    List<h> list = mVar.f81826c;
                    if (searchJediViewModel.f81367d != null) {
                        if (list != null) {
                            Iterator<h> it = list.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!SearchJediViewModel.a(it.next())) {
                                    i2++;
                                } else if (i2 >= 0 && i2 < list.size()) {
                                    searchJediViewModel.f81368e = true;
                                    list.add(0, list.remove(i2));
                                    List<h> list2 = searchJediViewModel.f81367d;
                                    if (list2 == null) {
                                        l.b();
                                    }
                                    list.addAll(1, list2);
                                }
                            }
                        }
                        searchJediViewModel.f81367d = null;
                    }
                    SearchJediViewModel.b(mVar.f81826c);
                    this.f81373a.this$0.a(mVar.f81826c);
                    return mVar;
                }
            }).d(new g() {
                /* class com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.c.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(50569);
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    com.ss.android.ugc.aweme.discover.mixfeed.m mVar = (com.ss.android.ugc.aweme.discover.mixfeed.m) obj;
                    String str = "";
                    l.d(mVar, str);
                    List<h> list = mVar.f81826c;
                    String str2 = searchParam.f81393g;
                    if (str2 != null) {
                        str = str2;
                    }
                    return v.a(list, new e(str, mVar.f81825b, mVar.f81824a, mVar));
                }
            });
            l.b(d2, "");
            return d2;
        }
    }

    public final void a(List<h> list) {
        int i2;
        if (list != null && (!list.isEmpty())) {
            int i3 = 0;
            if (this.f81368e) {
                this.f81368e = false;
                i2 = 1;
            } else {
                i2 = 0;
            }
            Iterator<T> it = list.iterator();
            int i4 = 0;
            int i5 = -1;
            while (true) {
                if (!it.hasNext()) {
                    i3 = i2;
                    break;
                }
                if (a((h) it.next())) {
                    i2++;
                } else {
                    i5 = i4;
                }
                if (i5 != -1) {
                    if (i2 % 2 == 0) {
                        i2 = 0;
                        i5 = -1;
                    } else if (!(i5 == -1 || i2 % 2 == 0)) {
                        int i6 = i4 + 1;
                        if (i6 < list.size()) {
                            Iterator<h> it2 = list.subList(i6, list.size()).iterator();
                            int i7 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (!a(it2.next())) {
                                    i7++;
                                } else if (i7 != -1) {
                                    list.add(i5, list.remove(i6 + i7));
                                    int i8 = i5 + 2;
                                    if (i8 < list.size()) {
                                        a(list.subList(i8, list.size()));
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        this.f81367d = arrayList;
                        arrayList.addAll(list.subList(i5, list.size()));
                        List<h> list2 = this.f81367d;
                        if (list2 == null) {
                            l.b();
                        }
                        list.removeAll(list2);
                    }
                }
                i4++;
            }
            if (i3 % 2 != 0) {
                this.f81367d = new ArrayList();
            }
        }
    }

    static final class e extends m implements h.f.a.m<List<? extends h>, List<? extends h>, List<? extends h>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f81379a = new e();

        static {
            Covode.recordClassIndex(50575);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<? extends h> invoke(List<? extends h> list, List<? extends h> list2) {
            List<? extends h> list3 = list;
            List<? extends h> list4 = list2;
            l.d(list3, "");
            l.d(list4, "");
            return n.o(n.d((Collection) list3, (Iterable) list4));
        }
    }
}
