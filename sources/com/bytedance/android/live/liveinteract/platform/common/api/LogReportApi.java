package com.bytedance.android.live.liveinteract.platform.common.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.b;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;

public interface LogReportApi {
    static {
        Covode.recordClassIndex(6493);
    }

    @t(a = "/webcast/stats/")
    f.a.t<d<Object>> logReport(@z(a = "ssmix") String str, @b Object obj);
}
