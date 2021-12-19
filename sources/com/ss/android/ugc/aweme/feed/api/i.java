package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.account.experiment.service.NonPersonalizationService;
import com.ss.android.ugc.aweme.app.api.c.c;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.h.g;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;

public final class i implements FeedApi.RetrofitApi {

    /* renamed from: a  reason: collision with root package name */
    private final FeedApi.RetrofitApi f91946a;

    static {
        Covode.recordClassIndex(57898);
    }

    private static void a() {
        if (a.b.f109011a.f109002c) {
            a.b.f109011a.b("feed_compose_params", false);
            a.b.f109011a.a("feed_api_to_net_api", System.currentTimeMillis(), false);
        }
    }

    private static void b() {
        if (a.b.f109011a.f109002c) {
            a.b.f109011a.b("feed_net_api_to_feed_api", false);
            a.b.f109011a.a("feed_api_to_ui_response", false);
        }
    }

    i(FeedApi.RetrofitApi retrofitApi) {
        if (retrofitApi != null) {
            this.f91946a = retrofitApi;
            return;
        }
        throw new IllegalArgumentException("retrofitApi should not be null");
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<FeedItemList> fetchRoamingFeed(int i2, String str) {
        return this.f91946a.fetchRoamingFeed(i2, str);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<FeedTimeLineItemList> fetchTimelineFeed(int i2, long j2, long j3, int i3, String str, String str2, String str3, int i4) {
        return this.f91946a.fetchTimelineFeed(i2, j2, j3, i3, str, str2, str3, i4);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<FeedItemList> fetchNearbyFeed(long j2, long j3, int i2, Integer num, String str, int i3, int i4, String str2, String str3) {
        return this.f91946a.fetchNearbyFeed(j2, j3, i2, num, str, i3, i4, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<FeedItemList> fetchFollowFeed(long j2, long j3, int i2, Integer num, String str, double d2, int i3, String str2, String str3, String str4, String str5, String str6, int i4, Integer num2, Integer num3, String str7, Long l2, String str8, String str9, Object obj, Integer num4, String str10, String str11) {
        a();
        q<FeedItemList> fetchFollowFeed = this.f91946a.fetchFollowFeed(j2, j3, i2, num, str, d2, i3, str2, str3, str4, str5, str6, i4, num2, num3, str7, l2, str8, str9, obj, num4, str10, str11);
        b();
        return fetchFollowFeed;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<FeedItemList> fetchFollowFeedImmediate(long j2, long j3, int i2, Integer num, String str, double d2, int i3, String str2, String str3, String str4, String str5, String str6, int i4, String str7, Integer num2, Integer num3, String str8, Long l2, String str9, String str10, Object obj, Integer num4, String str11, String str12) {
        a();
        q<FeedItemList> fetchFollowFeedImmediate = this.f91946a.fetchFollowFeedImmediate(j2, j3, i2, num, str, d2, i3, str2, str3, str4, str5, str6, i4, str7, num2, num3, str8, l2, str9, str10, obj, num4, str11, str12);
        b();
        return fetchFollowFeedImmediate;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(int i2, int i3, long j2, long j3, int i4, Integer num, String str, double d2, int i5, String str2, String str3, String str4, int i6, String str5, Long l2, String str6, String str7, Object obj, Integer num2, String str8, Integer num3, String str9, String str10, String str11, boolean z, String str12, int i7) {
        a();
        q<c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2 = this.f91946a.fetchRecommendFeedV2(i2, i3, j2, j3, i4, num, str, d2, i5, str2, str3, str4, i6, str5, l2, str6, str7, obj, num2, str8, num3, str9, str10, str11, z, str12, i7);
        b();
        return fetchRecommendFeedV2;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<FeedItemList> fetchRecommendFeed(int i2, int i3, long j2, long j3, int i4, Integer num, String str, double d2, int i5, String str2, String str3, String str4, String str5, String str6, int i6, Integer num2, Integer num3, String str7, Long l2, String str8, String str9, Object obj, Integer num4, Long l3, String str10, Integer num5, Integer num6, String str11, String str12, boolean z) {
        a();
        q<FeedItemList> fetchRecommendFeed = this.f91946a.fetchRecommendFeed(i2, i3, j2, j3, i4, num, str, d2, i5, str2, str3, str4, str5, str6, i6, num2, num3, str7, l2, str8, str9, obj, num4, l3, str10, num5, num6, str11, str12, z);
        b();
        return fetchRecommendFeed;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<FeedItemList> fetchRecommendFeedImmediate(int i2, int i3, long j2, long j3, int i4, Integer num, String str, double d2, int i5, String str2, String str3, String str4, String str5, String str6, int i6, String str7, Integer num2, Integer num3, String str8, Long l2, String str9, String str10, String str11, Object obj, Integer num4, Long l3, String str12, Integer num5, Integer num6, String str13, String str14) {
        a();
        q<FeedItemList> fetchRecommendFeedImmediate = this.f91946a.fetchRecommendFeedImmediate(i2, i3, j2, j3, i4, num, str, d2, i5, str2, str3, str4, str5, str6, i6, str7, num2, num3, str8, l2, str9, str10, str11, obj, num4, l3, str12, num5, num6, str13, str14);
        b();
        return fetchRecommendFeedImmediate;
    }

    public final q<c<aweme_v2_feed_response, FeedItemList>> a(int i2, long j2, long j3, int i3, Integer num, String str, double d2, int i4, String str2, String str3, String str4, String str5, String str6, int i5, Integer num2, Integer num3, String str7, Long l2, String str8, String str9, Object obj, Integer num4, Long l3, String str10, Integer num5, Integer num6, String str11, String str12, String str13, String str14, int i6, Object obj2, String str15) {
        return fetchRecommendFeedV2(g.f(), i2, j2, j3, i3, num, str, d2, i4, str2, str3, str4, str5, str6, i5, num2, num3, str7, l2, str8, str9, obj, num4, l3, str10, num5, num6, str11, str12, str13, NonPersonalizationService.c().a(), str14, i6, obj2, str15);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final q<c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(int i2, int i3, long j2, long j3, int i4, Integer num, String str, double d2, int i5, String str2, String str3, String str4, String str5, String str6, int i6, Integer num2, Integer num3, String str7, Long l2, String str8, String str9, Object obj, Integer num4, Long l3, String str10, Integer num5, Integer num6, String str11, String str12, String str13, boolean z, String str14, int i7, Object obj2, String str15) {
        q<c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2;
        a();
        if (!com.ss.android.ugc.aweme.compliance.api.a.k().f()) {
            fetchRecommendFeedV2 = fetchRecommendFeedV2(i2, i3, j2, j3, i4, num, str, d2, i5, str2, str4, str5, i6, str7, l2, str8, str9, obj, num4, str10, num5, str11, str12, str13, z, str14, i7);
        } else {
            fetchRecommendFeedV2 = this.f91946a.fetchRecommendFeedV2(i2, i3, j2, j3, i4, num, str, d2, i5, str2, str3, str4, str5, str6, i6, num2, num3, str7, l2, str8, str9, obj, num4, l3, str10, num5, num6, str11, str12, str13, z, str14, i7, obj2, str15);
        }
        b();
        return fetchRecommendFeedV2;
    }
}
