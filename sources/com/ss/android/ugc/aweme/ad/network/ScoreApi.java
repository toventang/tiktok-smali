package com.ss.android.ugc.aweme.ad.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public interface ScoreApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66102a = a.f66103a;

    static {
        Covode.recordClassIndex(40632);
    }

    @t(a = "/tiktok/v1/ad/experience/ad/history/rating/")
    @g
    f.a.t<BaseResponse> sendScoreOption(@e(a = "item_id") String str, @e(a = "advertiser_id") String str2, @e(a = "ad_id") String str3, @e(a = "creative_id") String str4, @e(a = "rating") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f66103a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(40633);
        }
    }
}
