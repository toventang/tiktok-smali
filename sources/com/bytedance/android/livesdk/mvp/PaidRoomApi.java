package com.bytedance.android.livesdk.mvp;

import com.bytedance.android.live.network.response.b;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;

public interface PaidRoomApi {
    static {
        Covode.recordClassIndex(11733);
    }

    @t(a = "/webcast/room/gated/check_ticket/")
    @g
    f.a.t<b<Void, CheckCodeExtra>> checkCode(@e(a = "ticket_code") String str, @e(a = "room_id") Long l2);

    @h(a = "/webcast/room/gated/event_info/")
    f.a.t<d<a>> queryRoomData(@z(a = "room_id") Long l2);
}
