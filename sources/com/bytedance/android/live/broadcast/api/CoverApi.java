package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface CoverApi {
    static {
        Covode.recordClassIndex(3660);
    }

    @h(a = "/webcast/room/anchor_cover_status/")
    t<d<Object>> anchorCoverStatus();

    @h(a = "/webcast/room/anchor_cover_quality/")
    t<d<Object>> getCoverQuality(@z(a = "uri") String str);
}
