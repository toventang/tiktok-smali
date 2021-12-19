package com.ss.android.ugc.aweme.tcm.impl.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.BABCRemoveMe;

public interface BABCRemoveMeApi {
    static {
        Covode.recordClassIndex(90659);
    }

    @t(a = "/aweme/v1/ad/ba/branded/content/remove/me/")
    f.a.t<BABCRemoveMe> getBABCRemoveMe(@z(a = "item_id") String str);
}
