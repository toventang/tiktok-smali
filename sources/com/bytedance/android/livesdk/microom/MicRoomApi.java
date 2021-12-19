package com.bytedance.android.livesdk.microom;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.microom.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface MicRoomApi {
    static {
        Covode.recordClassIndex(11247);
    }

    @h(a = "/webcast/room/next_event_show")
    t<d<a>> getNextRoomData(@z(a = "channel_uid") long j2, @z(a = "now_anchor_id") long j3);
}
