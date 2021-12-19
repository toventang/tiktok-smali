package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import f.a.t;

public interface PromoteEntryCheckApi {
    static {
        Covode.recordClassIndex(46053);
    }

    @h(a = "/aweme/v1/promote/api/entry/check/")
    t<PromoteEntryCheck> getPromoteEntryCheck(@z(a = "item_id") String str, @z(a = "source") String str2);
}
