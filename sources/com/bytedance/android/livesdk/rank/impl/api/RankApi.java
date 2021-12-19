package com.bytedance.android.livesdk.rank.impl.api;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.b;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.rank.api.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.api.model.PeriodRankExtra;
import com.bytedance.android.livesdk.rank.api.model.g;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.android.livesdk.rank.impl.api.model.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.x;
import com.bytedance.retrofit2.b.z;
import f.a.t;
import java.util.HashMap;

public interface RankApi {
    static {
        Covode.recordClassIndex(12188);
    }

    @h(a = "/webcast/ranklist/hour/")
    t<b<Object, Extra>> getDailyRankContent(@aa HashMap<String, String> hashMap);

    @h(a = "/webcast/ranklist/noble/")
    t<d<Object>> getNobleUserRank(@aa HashMap<String, String> hashMap);

    @h(a = "/webcast/ranklist/online_audience/")
    t<d<g>> getOnlineRankList(@z(a = "room_id") long j2, @z(a = "anchor_id") long j3);

    @h(a = "/webcast/ranklist/contributor/")
    t<b<CurrentRankListResponse, PeriodRankExtra>> getPeriodUserRank(@aa HashMap<String, String> hashMap);

    @h(a = "/webcast/ranklist/list/")
    t<d<RankResponse>> getRankList(@z(a = "anchor_id") long j2, @z(a = "room_id") long j3, @z(a = "rank_types") String str, @z(a = "region_type") int i2);

    @com.bytedance.retrofit2.b.t(a = "/webcast/ranklist/score_display_config/")
    @com.bytedance.retrofit2.b.g
    t<d<f>> getScoreDisplayConfig(@e(a = "room_id") long j2, @e(a = "score_location") String str);

    @h(a = "/webcast/ranklist/room/{room_id}/contributor/")
    @a(a = a.EnumC0254a.RANK_LIST)
    t<d<CurrentRankListResponse>> getUserRankContent(@x(a = "room_id") long j2, @aa HashMap<String, String> hashMap);

    @h(a = "/webcast/ranklist/entrance/")
    t<d<com.bytedance.android.livesdk.rank.impl.api.model.b>> queryRankEntrances(@z(a = "anchor_id") long j2, @z(a = "room_id") long j3);
}
