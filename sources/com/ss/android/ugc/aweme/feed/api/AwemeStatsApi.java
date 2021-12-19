package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

public final class AwemeStatsApi {

    /* renamed from: a  reason: collision with root package name */
    public static final AwemeStatsService f91915a = ((AwemeStatsService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(AwemeStatsService.class));

    public interface AwemeStatsService {
        static {
            Covode.recordClassIndex(57856);
        }

        @t(a = "/aweme/v1/familiar/video/stats/")
        @g
        q<BaseResponse> awemeFamiliarStatsReport(@e(a = "item_id") String str, @e(a = "author_id") String str2, @e(a = "follow_status") int i2, @e(a = "follower_status") int i3);

        @t(a = "/aweme/v1/fast/stats/")
        @g
        q<BaseResponse> awemeFastStatsReport(@e(a = "item_id") String str, @e(a = "tab_type") int i2, @e(a = "aweme_type") int i3, @e(a = "origin_item_id") String str2);

        @t(a = "/aweme/v1/aweme/stats/")
        @g
        q<BaseResponse> awemeStatsReport(@f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(57855);
    }
}
