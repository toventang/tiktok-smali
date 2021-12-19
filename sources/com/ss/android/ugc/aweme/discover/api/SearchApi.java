package com.ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.f;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.discover.model.SearchChallengeList;
import com.ss.android.ugc.aweme.discover.model.SearchEffectListResponse;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.search.g.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.e;
import l.b.o;

public final class SearchApi {

    /* renamed from: a  reason: collision with root package name */
    public static final String f80771a = Api.f66569d;

    /* renamed from: b  reason: collision with root package name */
    public static final SearchApi f80772b = new SearchApi();

    /* renamed from: c  reason: collision with root package name */
    private static final h f80773c = i.a((h.f.a.a) a.f80774a);

    public interface RealApi {
        static {
            Covode.recordClassIndex(50230);
        }

        @o(a = "/aweme/v1/challenge/search/")
        @e
        q<SearchChallengeList> searchChallengeList(@c(a = "cursor") long j2, @c(a = "keyword") String str, @c(a = "count") int i2, @c(a = "hot_search") int i3, @c(a = "source") String str2, @c(a = "search_source") String str3, @c(a = "search_id") String str4, @c(a = "last_search_id") String str5, @c(a = "query_correct_type") int i4, @c(a = "search_context") String str6);

        @o(a = "/aweme/v1/loadmore/wish/")
        @e
        b.i<SearchEffectListResponse> searchEffectList(@c(a = "keyword") String str, @c(a = "alasrc") String str2, @c(a = "source") String str3, @c(a = "offset") int i2, @c(a = "limit") int i3, @c(a = "aid") int i4);

        @o(a = "/aweme/v1/live/search/")
        @e
        q<SearchLiveList> searchLiveList(@c(a = "offset") long j2, @c(a = "keyword") String str, @c(a = "count") int i2, @c(a = "search_source") String str2, @c(a = "enter_from") String str3, @c(a = "search_id") String str4, @c(a = "source") String str5, @c(a = "live_id_list") String str6);

        @o(a = "/aweme/v1/music/search/")
        @e
        q<SearchMusicList> searchMusicList(@c(a = "cursor") long j2, @c(a = "keyword") String str, @c(a = "count") int i2, @c(a = "hot_search") int i3, @c(a = "search_id") String str2, @c(a = "last_search_id") String str3, @c(a = "source") String str4, @c(a = "search_source") String str5, @c(a = "query_correct_type") int i4, @c(a = "is_filter_search") int i5, @c(a = "filter_by") int i6, @c(a = "sort_type") int i7, @f LinkedHashMap<String, Integer> linkedHashMap, @c(a = "search_context") String str6);

        @o(a = "/aweme/v1/discover/search/")
        @e
        q<SearchUserList> searchUserList(@c(a = "cursor") long j2, @c(a = "keyword") String str, @c(a = "count") int i2, @c(a = "type") int i3, @c(a = "hot_search") int i4, @c(a = "search_source") String str2, @c(a = "search_id") String str3, @c(a = "last_search_id") String str4, @c(a = "query_correct_type") int i5, @c(a = "search_channel") String str5, @c(a = "sug_user_id") String str6, @c(a = "is_rich_sug") String str7, @c(a = "search_context") String str8);
    }

    public static RealApi a() {
        return (RealApi) f80773c.getValue();
    }

    private SearchApi() {
    }

    static final class a extends m implements h.f.a.a<RealApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80774a = new a();

        static {
            Covode.recordClassIndex(50231);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RealApi invoke() {
            return RetrofitFactory.a().b(SearchApi.f80771a).d().a(RealApi.class);
        }
    }

    static {
        Covode.recordClassIndex(50229);
    }

    public static SearchChallengeList b(com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar) {
        l.d(fVar, "");
        try {
            SearchChallengeList searchChallengeList = a().searchChallengeList(fVar.f81395i, fVar.f81387a, fVar.f81396j, fVar.f81391e, "challenge", fVar.f81389c, fVar.f81393g, fVar.f81394h, fVar.f81392f, fVar.t).get();
            l.b(searchChallengeList, "");
            return searchChallengeList;
        } catch (ExecutionException e2) {
            RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
            l.b(compatibleException, "");
            throw compatibleException;
        }
    }

    public static SearchLiveList c(com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar) {
        l.d(fVar, "");
        try {
            SearchLiveList searchLiveList = a().searchLiveList(fVar.f81395i, fVar.f81387a, fVar.f81396j, fVar.f81389c, fVar.f81397k, fVar.f81393g, fVar.f81390d, fVar.s).get();
            l.b(searchLiveList, "");
            return searchLiveList;
        } catch (ExecutionException e2) {
            RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
            l.b(compatibleException, "");
            throw compatibleException;
        }
    }

    public static SearchUserList a(com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar) {
        l.d(fVar, "");
        try {
            SearchUserList searchUserList = a().searchUserList(fVar.f81395i, fVar.f81387a, fVar.f81396j, 1, fVar.f81391e, fVar.f81389c, fVar.f81393g, fVar.f81394h, fVar.f81392f, fVar.f81399m, fVar.o, fVar.p, fVar.t).get();
            l.b(searchUserList, "");
            return searchUserList;
        } catch (ExecutionException e2) {
            RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
            l.b(compatibleException, "");
            throw compatibleException;
        }
    }

    public static SearchMusicList d(com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar) {
        ExecutionException e2;
        int i2;
        int i3;
        int i4;
        LinkedHashMap<String, Integer> linkedHashMap;
        l.d(fVar, "");
        try {
            RealApi a2 = a();
            long j2 = fVar.f81395i;
            String str = fVar.f81387a;
            int i5 = fVar.f81396j;
            int i6 = fVar.f81391e;
            String str2 = fVar.f81393g;
            String str3 = fVar.f81394h;
            String str4 = fVar.f81389c;
            int i7 = fVar.f81392f;
            b bVar = fVar.f81398l;
            if (bVar == null || bVar.isDefaultOption()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            b bVar2 = fVar.f81398l;
            if (bVar2 != null) {
                i3 = bVar2.getFilterBy();
            } else {
                i3 = 0;
            }
            b bVar3 = fVar.f81398l;
            if (bVar3 != null) {
                i4 = bVar3.getSortType();
            } else {
                i4 = 0;
            }
            try {
                b bVar4 = fVar.f81398l;
                if (bVar4 == null || (linkedHashMap = bVar4.activityToFieldMap()) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                SearchMusicList searchMusicList = a2.searchMusicList(j2, str, i5, i6, str2, str3, "music", str4, i7, i2, i3, i4, linkedHashMap, fVar.t).get();
                l.b(searchMusicList, "");
                return searchMusicList;
            } catch (ExecutionException e3) {
                e2 = e3;
                RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                l.b(compatibleException, "");
                throw compatibleException;
            }
        } catch (ExecutionException e4) {
            e2 = e4;
            RuntimeException compatibleException2 = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
            l.b(compatibleException2, "");
            throw compatibleException2;
        }
    }

    public static SearchLiveList a(String str, long j2, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str5, "");
        try {
            SearchLiveList searchLiveList = a().searchLiveList(j2, str, 20, str3, str4, str5, str2, "").get();
            l.b(searchLiveList, "");
            return searchLiveList;
        } catch (ExecutionException e2) {
            RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
            l.b(compatibleException, "");
            throw compatibleException;
        }
    }
}
