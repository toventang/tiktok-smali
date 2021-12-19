package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface FollowDistributedApi {
    static {
        Covode.recordClassIndex(8269);
    }

    @t(a = "/webcast/linkmic/online/user_room_info/")
    @g
    f.a.t<d<Room>> getFollowRoomInfo(@e(a = "scene") int i2, @e(a = "user_id") long j2);
}
