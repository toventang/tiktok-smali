package com.ss.android.ugc.aweme.discover.hitrank;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import l.b.f;
import l.b.t;

public interface RankApi {
    static {
        Covode.recordClassIndex(50468);
    }

    @f(a = "aweme/v1/spotpoint/set/hitrank/")
    q<BaseResponse> finishHitRankTask(@t(a = "to_userid") String str, @t(a = "rank_type") int i2, @t(a = "action_type") int i3, @t(a = "hashtag_names") List<String> list, @t(a = "sec_to_userid") String str2);

    @f(a = "aweme/v1/spotpoint/hit/notice/star/list/")
    q<HitNotice> getActivityInfo(@t(a = "user_id") String str, @t(a = "sec_user_id") String str2);
}
