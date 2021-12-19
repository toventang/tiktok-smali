package com.ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.g;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.TrendingData;
import com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.gt;
import f.a.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.f;
import l.b.o;
import l.b.t;

public final class SuggestWordsApi {

    /* renamed from: a  reason: collision with root package name */
    public static final SuggestWordsApi f80812a = new SuggestWordsApi();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80813b = i.a((h.f.a.a) b.f80826a);

    public interface SuggestApi {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80814a = a.f80815a;

        static {
            Covode.recordClassIndex(50249);
        }

        @o(a = "/aweme/v1/suggest/deletemostvisit/")
        @g
        b.i<BaseResponse> deleteVisitedAccount(@c(a = "uid") String str);

        @f(a = "/aweme/v1/search/clicksug/")
        b.i<ClickSearchResponse> fetchClickSearchData(@t(a = "keyword") String str, @t(a = "aweme_id") String str2);

        @f(a = "/aweme/v1/search/billboard/")
        b.i<TrendingData> fetchSearchBillboard(@t(a = "billboard_type") int i2);

        @f(a = "/aweme/v1/suggest/guide/")
        f.a.t<SuggestWordResponse> fetchSuggestWords(@t(a = "business_id") String str, @t(a = "pd") String str2, @t(a = "history_list") String str3, @t(a = "is_debug") String str4);

        @f(a = "/aweme/v1/suggest/guide/")
        ab<SuggestWordResponse> getSuggestSearchList(@t(a = "business_id") String str, @t(a = "pd") String str2, @t(a = "history_list") String str3, @t(a = "is_debug") String str4, @t(a = "req_source") String str5);

        @f(a = "/aweme/v1/suggest/guide/")
        b.i<SuggestWordResponse> getSuggestWords(@t(a = "business_id") String str, @t(a = "from_group_id") String str2, @t(a = "word_in_box") String str3, @t(a = "data_type") Integer num, @t(a = "history_list") String str4, @t(a = "type") String str5);

        @f(a = "/aweme/v1/suggest/guide/")
        b.i<String> getSuggestWordsWithRawString(@t(a = "business_id") String str, @t(a = "from_group_id") String str2, @t(a = "word_in_box") String str3, @t(a = "data_type") Integer num, @t(a = "history_list") String str4, @t(a = "type") String str5);

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f80815a = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(50250);
            }
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f80816a;

        /* renamed from: b  reason: collision with root package name */
        public String f80817b;

        /* renamed from: c  reason: collision with root package name */
        public String f80818c;

        /* renamed from: d  reason: collision with root package name */
        public String f80819d;

        /* renamed from: e  reason: collision with root package name */
        public String f80820e;

        /* renamed from: f  reason: collision with root package name */
        public String f80821f;

        /* renamed from: g  reason: collision with root package name */
        public String f80822g;

        /* renamed from: h  reason: collision with root package name */
        public String f80823h;

        /* renamed from: i  reason: collision with root package name */
        public Integer f80824i;

        /* renamed from: j  reason: collision with root package name */
        public String f80825j;

        static {
            Covode.recordClassIndex(50251);
        }
    }

    public static SuggestApi a() {
        return (SuggestApi) f80813b.getValue();
    }

    private SuggestWordsApi() {
    }

    public static b.i<TrendingData> b() {
        return a().fetchSearchBillboard(0);
    }

    static final class b extends m implements h.f.a.a<SuggestApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f80826a = new b();

        static {
            Covode.recordClassIndex(50252);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SuggestApi invoke() {
            return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(SuggestApi.class);
        }
    }

    static {
        Covode.recordClassIndex(50248);
    }

    public static b.i<BaseResponse> b(a aVar) {
        l.d(aVar, "");
        try {
            return a().deleteVisitedAccount(aVar.f80823h);
        } catch (ExecutionException e2) {
            RuntimeException compatibleException = com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
            l.b(compatibleException, "");
            throw compatibleException;
        }
    }

    public static final f.a.t<SuggestWordResponse> c(a aVar) {
        l.d(aVar, "");
        return a().fetchSuggestWords(aVar.f80816a, aVar.f80817b, gt.f143029c.a().a(), aVar.f80818c);
    }

    public static b.i<ClickSearchResponse> d(a aVar) {
        l.d(aVar, "");
        return a().fetchClickSearchData(aVar.f80821f, aVar.f80822g);
    }

    public static b.i<String> a(a aVar) {
        l.d(aVar, "");
        return a().getSuggestWordsWithRawString(aVar.f80816a, aVar.f80819d, aVar.f80820e, aVar.f80824i, gt.f143029c.a().a(), "qrec");
    }
}
