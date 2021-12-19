package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface LiveEventApi {
    static {
        Covode.recordClassIndex(8277);
    }

    @t(a = "/webcast/room/bind/event")
    @g
    f.a.t<d<Void>> bindLiveEvent(@e(a = "room_id") long j2, @e(a = "owner_user_id") long j3, @e(a = "event_id") long j4);
}
