package com.bytedance.android.livesdk.like;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface LikeApi {
    static {
        Covode.recordClassIndex(10309);
    }

    @h(a = "/webcast/room/like/icon/")
    t<d<u>> getIcons(@z(a = "room_id") long j2, @z(a = "anchor_id") long j3);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/like/")
    @g
    t<d<Void>> like(@e(a = "room_id") long j2, @e(a = "count") long j3);
}
