package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.s.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface MuteApi {
    static {
        Covode.recordClassIndex(12954);
    }

    @h(a = "/webcast/room/silence/list/")
    t<c> getMuteList(@z(a = "room_id") long j2, @z(a = "count") int i2, @z(a = "offset") int i3, @z(a = "sec_user_id") String str);

    @h(a = "/webcast/room/silence/")
    t<d<Object>> mute(@z(a = "room_id") long j2, @z(a = "user_id") long j3, @z(a = "silence_type") long j4, @z(a = "sec_user_id") String str, @z(a = "duration") long j5);

    @h(a = "/webcast/room/unsilence/")
    t<d<Object>> unmute(@z(a = "room_id") long j2, @z(a = "user_id") long j3, @z(a = "sec_user_id") String str);
}
