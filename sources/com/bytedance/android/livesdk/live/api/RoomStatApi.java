package com.bytedance.android.livesdk.live.api;

import com.bytedance.android.live.network.response.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface RoomStatApi {
    static {
        Covode.recordClassIndex(10448);
    }

    @t(a = "/webcast/room/check_alive/")
    @g
    f.a.t<c<com.bytedance.android.livesdk.live.model.c>> checkRoom(@e(a = "room_ids") String str);
}
