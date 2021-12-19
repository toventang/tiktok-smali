package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface RoomApi {
    static {
        Covode.recordClassIndex(8423);
    }

    @h(a = "/webcast/room/collect_unread/")
    t<d<Object>> collectUnreadRequest(@z(a = "room_id") long j2, @z(a = "anchor_id") long j3, @z(a = "unread_extra") String str, @z(a = "room_ids") String str2);

    @h(a = "/webcast/room/info_by_user/")
    @a(a = a.EnumC0254a.ROOM)
    t<d<Room>> fetchUserRoom(@z(a = "user_id") long j2, @z(a = "sec_user_id") String str);
}
