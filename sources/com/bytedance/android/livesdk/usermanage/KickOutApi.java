package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.s.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface KickOutApi {
    static {
        Covode.recordClassIndex(12953);
    }

    @h(a = "/webcast/room/kick/list/")
    t<c> getKickedOutList(@z(a = "room_id") long j2, @z(a = "count") int i2, @z(a = "offset") int i3, @z(a = "sec_user_id") String str);

    @h(a = "/webcast/room/kick/user/")
    t<d<h.z>> kickOut(@z(a = "room_id") long j2, @z(a = "kick_uid") long j3);

    @h(a = "/webcast/room/unkick/user/")
    t<d<h.z>> unKickOut(@z(a = "room_id") long j2, @z(a = "kick_uid") long j3);
}
