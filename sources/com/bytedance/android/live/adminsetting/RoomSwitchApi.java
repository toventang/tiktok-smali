package com.bytedance.android.live.adminsetting;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface RoomSwitchApi {
    static {
        Covode.recordClassIndex(3521);
    }

    @t(a = "/webcast/room/switch/update/")
    @g
    f.a.t<d<Object>> updateSwitch(@e(a = "room_id") long j2, @e(a = "switch_type") int i2, @e(a = "switch_value") boolean z);
}
