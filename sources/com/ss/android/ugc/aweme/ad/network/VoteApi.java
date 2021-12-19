package com.ss.android.ugc.aweme.ad.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public interface VoteApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66104a = a.f66105a;

    static {
        Covode.recordClassIndex(40634);
    }

    @t(a = "/tiktok/v1/ad/experience/vote/")
    @g
    f.a.t<BaseResponse> sendVoteOption(@e(a = "item_id") String str, @e(a = "creative_id") String str2, @e(a = "ad_id") String str3, @e(a = "vote_result") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f66105a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(40635);
        }
    }
}
