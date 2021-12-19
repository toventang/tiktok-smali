package com.ss.android.ugc.aweme.discover.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.a.n;
import h.f.b.l;
import h.i;
import h.m;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class TrendsTabViewModel extends CommonListViewModel<DiscoverSectionItem, TrendsTabState> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f82806e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final LiveData<SuggestWordResponse> f82807a = n();

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.repo.a f82808b = new com.ss.android.ugc.aweme.discover.repo.a();

    /* renamed from: c  reason: collision with root package name */
    final List<Aweme> f82809c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Aweme> f82810d = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final h.h f82811f = i.a(m.NONE, b.f82812a);

    static {
        Covode.recordClassIndex(51597);
    }

    private final t<SuggestWordResponse> n() {
        return (t) this.f82811f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51598);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<t<SuggestWordResponse>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f82812a = new b();

        static {
            Covode.recordClassIndex(51599);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<SuggestWordResponse> invoke() {
            return new t();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<TrendsTabState, f.a.t<p<List<DiscoverSectionItem>, o>>> a() {
        return new g(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<TrendsTabState, f.a.t<p<List<DiscoverSectionItem>, o>>> b() {
        return new c(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new TrendsTabState(false, null, false, null, false, false, 63, null);
    }

    public final void m() {
        if (com.ss.android.ugc.aweme.search.h.f121133a.q()) {
            a(false, true);
        }
    }

    public final void b(boolean z) {
        c(new d(z));
    }

    static final class d extends h.f.b.m implements h.f.a.b<TrendsTabState, TrendsTabState> {
        final /* synthetic */ boolean $isTabHidden;

        static {
            Covode.recordClassIndex(51602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$isTabHidden = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TrendsTabState invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            return TrendsTabState.copy$default(trendsTabState2, false, null, this.$isTabHidden, null, false, false, 59, null);
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<TrendsTabState, TrendsTabState> {
        final /* synthetic */ boolean $scrollVertically;

        static {
            Covode.recordClassIndex(51603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.$scrollVertically = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TrendsTabState invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            return TrendsTabState.copy$default(trendsTabState2, false, null, false, null, this.$scrollVertically, false, 47, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<TrendsTabState, TrendsTabState> {
        final /* synthetic */ boolean $cacheThenFetch;
        final /* synthetic */ boolean $isFromSearch;

        static {
            Covode.recordClassIndex(51608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z, boolean z2) {
            super(1);
            this.$cacheThenFetch = z;
            this.$isFromSearch = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TrendsTabState invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            return TrendsTabState.copy$default(trendsTabState2, this.$cacheThenFetch, null, false, null, false, this.$isFromSearch, 30, null);
        }
    }

    public final void a(boolean z) {
        a(z, false);
    }

    static final class c extends h.f.b.m implements h.f.a.b<TrendsTabState, f.a.t<p<? extends List<? extends DiscoverSectionItem>, ? extends o>>> {
        final /* synthetic */ TrendsTabViewModel this$0;

        static {
            Covode.recordClassIndex(51600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TrendsTabViewModel trendsTabViewModel) {
            super(1);
            this.this$0 = trendsTabViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f.a.t<p<? extends List<? extends DiscoverSectionItem>, ? extends o>> invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            f.a.t<R> d2 = this.this$0.f82808b.a(new com.ss.android.ugc.aweme.discover.repo.fetcher.c(((ListState) trendsTabState2.getSubstate()).getPayload().f39460b), false).d(AnonymousClass1.f82813a);
            l.b(d2, "");
            return d2;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<TrendsTabState, z> {
        final /* synthetic */ Aweme $awemeScrolled;
        final /* synthetic */ TrendsTabViewModel this$0;

        static {
            Covode.recordClassIndex(51604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(TrendsTabViewModel trendsTabViewModel, Aweme aweme) {
            super(1);
            this.this$0 = trendsTabViewModel;
            this.$awemeScrolled = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            Map<String, Aweme> map = this.this$0.f82810d;
            String categoryIdBeingViewed = trendsTabState2.getCategoryIdBeingViewed();
            TrendsTabViewModel trendsTabViewModel = this.this$0;
            Aweme aweme = this.$awemeScrolled;
            List<Aweme> list = trendsTabViewModel.f82809c;
            int indexOf = trendsTabViewModel.f82809c.indexOf(aweme) + 1;
            if (indexOf >= 0 && indexOf <= n.a((List) list)) {
                aweme = list.get(indexOf);
            }
            map.put(categoryIdBeingViewed, aweme);
            TrendsTabViewModel trendsTabViewModel2 = this.this$0;
            AnonymousClass1 r1 = AnonymousClass1.f82814a;
            l.c(r1, "");
            trendsTabViewModel2.c(new ListViewModel.f(trendsTabViewModel2, r1));
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<TrendsTabState, f.a.t<p<? extends List<? extends DiscoverSectionItem>, ? extends o>>> {
        final /* synthetic */ TrendsTabViewModel this$0;

        static {
            Covode.recordClassIndex(51606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TrendsTabViewModel trendsTabViewModel) {
            super(1);
            this.this$0 = trendsTabViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f.a.t<p<? extends List<? extends DiscoverSectionItem>, ? extends o>> invoke(TrendsTabState trendsTabState) {
            final TrendsTabState trendsTabState2 = trendsTabState;
            l.d(trendsTabState2, "");
            com.ss.android.ugc.aweme.discover.repo.fetcher.c cVar = new com.ss.android.ugc.aweme.discover.repo.fetcher.c(-1);
            cVar.setFromSuggestSearch(trendsTabState2.isFromSuggestSearch());
            f.a.t<R> d2 = this.this$0.f82808b.a(cVar, trendsTabState2.getCacheThenFetch()).d(new f.a.d.g(this) {
                /* class com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f82815a;

                static {
                    Covode.recordClassIndex(51607);
                }

                {
                    this.f82815a = r1;
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    DiscoverSectionList discoverSectionList = (DiscoverSectionList) obj;
                    l.d(discoverSectionList, "");
                    if (!com.ss.android.ugc.aweme.search.h.f121133a.q()) {
                        return v.a(discoverSectionList.getSections(), new o(discoverSectionList.getHasMore(), discoverSectionList.getCursor()));
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(discoverSectionList.getSections());
                    if (trendsTabState2.isFromSuggestSearch()) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(trendsTabState2.getSubstate().getList());
                        arrayList2.remove(0);
                        arrayList.addAll(arrayList2);
                    }
                    this.f82815a.this$0.a(arrayList);
                    return v.a(arrayList, new o(discoverSectionList.getHasMore(), discoverSectionList.getCursor()));
                }
            });
            l.b(d2, "");
            return d2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r0 == null) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem> r6) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel.a(java.util.List):void");
    }

    private final void a(boolean z, boolean z2) {
        c(new h(z, z2));
        super.k();
    }
}
