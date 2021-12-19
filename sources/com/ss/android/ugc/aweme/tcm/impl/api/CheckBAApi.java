package com.ss.android.ugc.aweme.tcm.impl.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.BAInfos;

public interface CheckBAApi {
    static {
        Covode.recordClassIndex(90660);
    }

    @t(a = "/aweme/v1/commerce/tcm/creator/check_business_partner/")
    f.a.t<BAInfos> getCheckBA(@z(a = "uids") String str);
}
