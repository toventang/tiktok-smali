package com.ss.android.ugc.aweme.discover.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.y;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.discover.c.f;
import com.ss.android.ugc.aweme.discover.mixfeed.m;
import com.ss.android.ugc.aweme.discover.mixfeed.n;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import com.ss.android.ugc.aweme.discover.model.SearchMusicList;
import f.a.d.g;
import f.a.t;
import f.a.w;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import l.b.o;
import org.json.JSONObject;

public final class SearchApiNew {

    /* renamed from: a  reason: collision with root package name */
    public static final String f80775a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f80776b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f80777c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<String> f80778d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public static final SearchApiNew f80779e = new SearchApiNew();

    public interface RealApi {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80780a = a.f80782b;

        static {
            Covode.recordClassIndex(50233);
        }

        @l.b.f(a = "/aweme/v1/search/videosug/")
        t<com.ss.android.ugc.aweme.discover.mixfeed.t> fetchFeedDetailWords(@l.b.t(a = "aweme_id") String str, @l.b.t(a = "source") String str2);

        @o(a = "/aweme/v1/search/item/")
        @l.b.e
        q<SearchMix> searchFeedList(@l.b.c(a = "keyword") String str, @l.b.c(a = "offset") long j2, @l.b.c(a = "count") int i2, @l.b.c(a = "source") String str2, @l.b.c(a = "search_source") String str3, @l.b.c(a = "hot_search") int i3, @l.b.c(a = "search_id") String str4, @l.b.c(a = "last_search_id") String str5, @l.b.c(a = "query_correct_type") int i4, @l.b.c(a = "is_filter_search") int i5, @l.b.c(a = "sort_type") int i6, @l.b.c(a = "publish_time") int i7, @l.b.c(a = "enter_from") String str6, @l.b.c(a = "search_channel") String str7, @l.b.c(a = "show_results_source") String str8, @l.b.c(a = "search_context") String str9, @com.bytedance.retrofit2.b.f LinkedHashMap<String, Integer> linkedHashMap);

        @o(a = "/aweme/v1/general/search/single/")
        @l.b.e
        @y(a = 3)
        i<m> searchMTMixFeedList(@l.b.c(a = "keyword") String str, @l.b.c(a = "offset") int i2, @l.b.c(a = "count") int i3, @l.b.c(a = "search_source") String str2, @l.b.c(a = "hot_search") int i4, @l.b.c(a = "search_id") String str3, @l.b.c(a = "last_search_id") String str4, @l.b.c(a = "query_correct_type") int i5, @l.b.c(a = "multi_mod") int i6, @l.b.c(a = "sug_user_id") String str5, @l.b.c(a = "is_rich_sug") String str6, @l.b.c(a = "is_filter_search") int i7, @l.b.c(a = "publish_time") int i8, @l.b.c(a = "sort_type") int i9, @l.b.c(a = "backtrace") String str7, @l.b.c(a = "original_query") String str8, @l.b.c(a = "words_type") String str9, @l.b.c(a = "search_context") String str10, @l.b.c(a = "ad_user_agent") String str11, @l.b.c(a = "trending_event_id") String str12, @com.bytedance.retrofit2.b.f LinkedHashMap<String, Integer> linkedHashMap);

        @o(a = "/aweme/v1/general/search/stream/")
        @l.b.e
        @ae
        @y(a = 3)
        i<com.bytedance.ies.ugc.aweme.network.a.b<m>> searchMTMixFeedListByChunk(@l.b.c(a = "keyword") String str, @l.b.c(a = "offset") int i2, @l.b.c(a = "count") int i3, @l.b.c(a = "search_source") String str2, @l.b.c(a = "hot_search") int i4, @l.b.c(a = "search_id") String str3, @l.b.c(a = "last_search_id") String str4, @l.b.c(a = "query_correct_type") int i5, @l.b.c(a = "multi_mod") int i6, @l.b.c(a = "sug_user_id") String str5, @l.b.c(a = "is_rich_sug") String str6, @l.b.c(a = "is_filter_search") int i7, @l.b.c(a = "publish_time") int i8, @l.b.c(a = "sort_type") int i9, @l.b.c(a = "original_query") String str7, @l.b.c(a = "ad_user_agent") String str8, @l.b.c(a = "trending_event_id") String str9, @l.b.c(a = "search_context") String str10, @l.b.c(a = "backtrace") String str11, @l.b.c(a = "words_type") String str12, @com.bytedance.retrofit2.b.f LinkedHashMap<String, Integer> linkedHashMap);

        @o(a = "/aweme/v1/music/search/")
        @l.b.e
        t<SearchMusicList> searchMusicList(@l.b.c(a = "cursor") long j2, @l.b.c(a = "keyword") String str, @l.b.c(a = "count") int i2, @l.b.c(a = "hot_search") int i3, @l.b.c(a = "search_id") String str2, @l.b.c(a = "query_correct_type") int i4, @l.b.c(a = "is_author_search") int i5, @l.b.c(a = "is_filter_search") int i6, @l.b.c(a = "filter_by") int i7, @l.b.c(a = "sort_type") int i8, @com.bytedance.retrofit2.b.f LinkedHashMap<String, Integer> linkedHashMap);

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static final RealApi f80781a;

            /* renamed from: b  reason: collision with root package name */
            static final /* synthetic */ a f80782b = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(50234);
                Object a2 = SearchApiNew.f80776b.a(RealApi.class);
                l.b(a2, "");
                f80781a = (RealApi) a2;
            }
        }
    }

    private SearchApiNew() {
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f80783a;

        static {
            Covode.recordClassIndex(50235);
        }

        a(n nVar) {
            this.f80783a = nVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cursor", this.f80783a.f81837c);
            jSONObject.put("searchId", this.f80783a.f81840f);
            jSONObject.put("keyword", this.f80783a.f81836b);
            jSONObject.put("correctType", this.f80783a.f81842h);
            com.ss.android.ugc.aweme.base.o.a("search_page_repeat_request", jSONObject);
            return 0;
        }
    }

    static {
        Covode.recordClassIndex(50232);
        String str = Api.f66569d;
        f80775a = str;
        f80776b = RetrofitFactory.a().a(str);
    }

    static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f80789a = new d();

        static {
            Covode.recordClassIndex(50238);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            m mVar = (m) obj;
            l.d(mVar, "");
            com.ss.android.ugc.aweme.discover.c.e.f80919b.a(mVar);
            return mVar;
        }
    }

    static final class e<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f80790a = new e();

        static {
            Covode.recordClassIndex(50239);
        }

        e() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            m mVar = (m) obj;
            l.d(mVar, "");
            com.ss.android.ugc.aweme.search.l.g.a(mVar);
            return mVar;
        }
    }

    static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f80788a;

        static {
            Covode.recordClassIndex(50237);
        }

        c(m mVar) {
            this.f80788a = mVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            m mVar = (m) obj;
            l.d(mVar, "");
            l.d(mVar, "");
            SearchApiResult a2 = f.a.a(mVar);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
            return a2;
        }
    }

    public static t<SearchMusicList> a(com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar) {
        boolean z;
        int i2;
        int i3;
        LinkedHashMap<String, Integer> linkedHashMap;
        l.d(fVar, "");
        try {
            RealApi realApi = RealApi.a.f80781a;
            long j2 = fVar.f81395i;
            String str = fVar.f81387a;
            int i4 = fVar.f81396j;
            int i5 = fVar.f81391e;
            String str2 = fVar.f81393g;
            int i6 = fVar.f81392f;
            int i7 = fVar.q;
            com.ss.android.ugc.aweme.search.g.b bVar = fVar.f81398l;
            if (bVar != null) {
                z = bVar.isDefaultOption();
            } else {
                z = true;
            }
            int i8 = 0;
            if (!z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.search.g.b bVar2 = fVar.f81398l;
            if (bVar2 != null) {
                i3 = bVar2.getFilterBy();
            } else {
                i3 = 0;
            }
            com.ss.android.ugc.aweme.search.g.b bVar3 = fVar.f81398l;
            if (bVar3 != null) {
                i8 = bVar3.getSortType();
            }
            com.ss.android.ugc.aweme.search.g.b bVar4 = fVar.f81398l;
            if (bVar4 == null || (linkedHashMap = bVar4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            return realApi.searchMusicList(j2, str, i4, i5, str2, i6, i7, i2, i3, i8, linkedHashMap);
        } catch (ExecutionException e2) {
            RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
            l.b(compatibleException, "");
            throw compatibleException;
        }
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f80784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f80785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.jedi.viewmodel.f f80786c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f80787d;

        static {
            Covode.recordClassIndex(50236);
        }

        b(int i2, i iVar, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar, int i3) {
            this.f80784a = i2;
            this.f80785b = iVar;
            this.f80786c = fVar;
            this.f80787d = i3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:44:0x013a, code lost:
            if (r1 == null) goto L_0x013c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0190  */
        @Override // f.a.w
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(f.a.v<com.ss.android.ugc.aweme.discover.mixfeed.m> r7) {
            /*
            // Method dump skipped, instructions count: 406
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.api.SearchApiNew.b.subscribe(f.a.v):void");
        }
    }

    public static t<m> a(com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar, int i2, int i3, m mVar) {
        i<m> iVar;
        l.d(fVar, "");
        if (mVar != null) {
            iVar = mVar.f81829g;
            mVar.f81829g = null;
        } else {
            iVar = null;
        }
        t<m> b2 = t.a(new b(i2, iVar, fVar, i3)).d(new c(mVar)).d(d.f80789a).d(e.f80790a).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }
}
