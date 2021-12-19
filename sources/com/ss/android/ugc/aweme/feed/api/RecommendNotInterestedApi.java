package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import java.util.Map;
import l.b.d;
import l.b.e;
import l.b.o;

public final class RecommendNotInterestedApi {

    public interface SyncNotInterestedApi {
        static {
            Covode.recordClassIndex(57887);
        }

        @o(a = "/aweme/v1/commit/dislike/item/")
        @e
        t<BaseResponse> dislikeRecommend(@l.b.t(a = "aweme_id") String str, @d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(57886);
    }
}
