package com.ss.android.ugc.aweme.kids.commonfeed.reportstats;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.common.a.a;
import java.util.Map;

public final class KidsAwemeStatsApi {

    /* renamed from: a  reason: collision with root package name */
    public static final RetrofitApi f106181a = ((RetrofitApi) RetrofitFactory.a().a(a.f105880a).a(RetrofitApi.class));

    /* renamed from: b  reason: collision with root package name */
    public static final KidsAwemeStatsApi f106182b = new KidsAwemeStatsApi();

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(67905);
        }

        @t(a = "/tiktok/v1/kids/video/stats/")
        @g
        i<BaseResponse> reportAwemeStats(@f Map<String, String> map);
    }

    private KidsAwemeStatsApi() {
    }

    static {
        Covode.recordClassIndex(67904);
    }
}
