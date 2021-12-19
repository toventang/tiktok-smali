package com.ss.android.ugc.aweme.live.deeplink;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface UniqueIdApi {
    static {
        Covode.recordClassIndex(69420);
    }

    @h(a = "/aweme/v1/user/uniqueid/")
    t<c> getRoomId(@z(a = "id") String str);
}
