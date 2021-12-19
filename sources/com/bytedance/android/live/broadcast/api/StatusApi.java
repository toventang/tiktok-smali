package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface StatusApi {
    static {
        Covode.recordClassIndex(3664);
    }

    @h(a = "/webcast/room/ping/anchor/")
    t<d<Void>> sendStatus(@z(a = "room_id") long j2, @z(a = "status") int i2, @z(a = "stream_id") long j3, @z(a = "reason_no") int i3);
}
