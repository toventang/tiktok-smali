package com.ss.android.ugc.aweme.challenge.api;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.model.ChallengeCreateResponse;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.challenge.model.LiveChallengeRecommendResponse;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import java.util.HashMap;
import java.util.Map;
import l.b.d;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;
import l.b.u;
import l.b.x;

public final class ChallengeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final String f69888a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f69889b = (Api.f66569d + "/aweme/v1/challenge/aweme/");

    /* renamed from: c  reason: collision with root package name */
    public static final String f69890c = (Api.f66569d + "/aweme/v1/challenge/fresh/aweme/");

    /* renamed from: d  reason: collision with root package name */
    public static final String f69891d = (Api.f66569d + "/aweme/v1/commerce/challenge/detail/");

    /* renamed from: e  reason: collision with root package name */
    public static final String f69892e = (Api.f66569d + "/aweme/v1/commerce/challenge/aweme/");

    /* renamed from: f  reason: collision with root package name */
    public static final String f69893f = (Api.f66569d + "/aweme/v1/commerce/challenge/fresh/aweme/");

    /* renamed from: g  reason: collision with root package name */
    public static final RealApi f69894g;

    /* renamed from: h  reason: collision with root package name */
    private static final String f69895h = (Api.f66569d + "/aweme/v1/commit/challenge/");

    /* renamed from: i  reason: collision with root package name */
    private static final String f69896i = (Api.f66569d + "/aweme/v1/challenge/detail/");

    public interface RealApi {
        static {
            Covode.recordClassIndex(43100);
        }

        @f(a = "/aweme/v1/challenge/create/")
        q<ChallengeCreateResponse> createChallenge(@t(a = "source_type") int i2, @t(a = "challenge_name") String str);

        @f(a = "/aweme/v1/challenge/detail/")
        i<ChallengeDetail> fetchChallengeDetail(@t(a = "ch_id") String str, @t(a = "hashtag_name") String str2, @t(a = "query_type") int i2, @t(a = "click_reason") int i3);

        @f(a = "/aweme/v1/commerce/challenge/detail/")
        i<ChallengeDetail> fetchCommerceChallengeDetail(@t(a = "ch_id") String str, @t(a = "hashtag_name") String str2, @t(a = "query_type") int i2, @t(a = "click_reason") int i3);

        @f
        q<ChallengeAwemeList> getChallengeAwemeList(@x String str, @u Map<String, String> map);

        @f
        q<ChallengeDetail> getChallengeDetail(@x String str, @u Map<String, String> map);

        @f(a = "/aweme/v1/recommend/challenge/")
        q<ChallengeList> getChallengeList(@u Map<String, String> map);

        @f(a = "/aweme/v1/live/challenge/recommend/")
        q<LiveChallengeRecommendResponse> getRecommendLiveChallenge(@t(a = "room_id") String str);

        @f(a = "/aweme/v1/challenge/aweme/single/")
        i<Object> loadChallengeMixFeedList(@t(a = "pull_type") int i2, @t(a = "ch_id") String str, @t(a = "cursor") long j2, @t(a = "count") int i3, @t(a = "hashtag_name") String str2, @t(a = "query_type") int i4);

        @f(a = "/aweme/v1/challenge/fresh/aweme/single/")
        i<Object> loadFreshChallengeMixFeedList(@t(a = "pull_type") int i2, @t(a = "ch_id") String str, @t(a = "cursor") long j2, @t(a = "count") int i3, @t(a = "hashtag_name") String str2, @t(a = "query_type") int i4);

        @o(a = "/aweme/v1/challenge/search/")
        @e
        q<SearchChallengeList> searchChallenge(@d Map<String, String> map);

        @f(a = "/aweme/v1/search/challengesug/")
        q<SearchSugChallengeList> searchSugChallenge(@t(a = "keyword") String str, @t(a = "source") String str2);
    }

    static {
        Covode.recordClassIndex(43099);
        String str = Api.f66569d;
        f69888a = str;
        f69894g = (RealApi) RetrofitFactory.a().a(str).a(RealApi.class);
    }

    public static i<ChallengeDetail> a(String str, String str2) {
        return f69894g.fetchCommerceChallengeDetail(str, str2, 0, 0);
    }

    public static ChallengeDetail a(String str, int i2, boolean z, String str2) {
        String str3;
        if (!CommerceChallengeServiceImpl.e().b(str) || in.d()) {
            str3 = f69896i;
        } else {
            str3 = f69891d;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str);
            hashMap.put("query_type", "0");
        }
        hashMap.put("click_reason", String.valueOf(i2));
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("preview_token", str2);
        }
        return f69894g.getChallengeDetail(str3, hashMap).get();
    }
}
