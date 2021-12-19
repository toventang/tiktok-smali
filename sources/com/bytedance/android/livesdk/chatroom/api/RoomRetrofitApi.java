package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.b;
import com.bytedance.android.live.network.response.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.network.response.e;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.model.DecorationTextAuditResult;
import com.bytedance.android.livesdkapi.depend.model.live.ContinueRoomResponse;
import com.bytedance.android.livesdkapi.depend.model.live.DebugRoomItem;
import com.bytedance.android.livesdkapi.depend.model.live.DebugToolState;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.x;
import com.bytedance.retrofit2.b.z;
import f.a.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RoomRetrofitApi {
    static {
        Covode.recordClassIndex(8281);
    }

    @h(a = "/webcast/room/collect_unread/")
    t<d<Object>> collectUnreadRequest(@z(a = "unread_extra") String str, @z(a = "room_ids") String str2);

    @h(a = "/webcast/room/continue/")
    t<d<ContinueRoomResponse>> continuePreviousRoom();

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/create/")
    @g
    t<e<Room>> createRoom(@f HashMap<String, String> hashMap);

    @h(a = "/hotsoon/room/{roomId}/_deblock_mosaic/")
    t<d<Object>> deblockMosaic(@x(a = "roomId") long j2);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/digg/")
    @g
    t<d<Object>> digg(@f HashMap<String, String> hashMap);

    @g
    @a(a = a.EnumC0254a.ROOM)
    @com.bytedance.retrofit2.b.t(a = "/webcast/room/enter/")
    t<b<Room, EnterRoomExtra>> enterRoom(@com.bytedance.retrofit2.b.e(a = "room_id") long j2, @com.bytedance.retrofit2.b.e(a = "hold_living_room") long j3, @com.bytedance.retrofit2.b.e(a = "is_login") long j4, @f HashMap<String, String> hashMap);

    @h(a = "/webcast/room/info/")
    @a(a = a.EnumC0254a.ROOM)
    t<d<Room>> fetchRoom(@aa HashMap<String, String> hashMap);

    @h(a = "/webcast/room/finish_abnormal/")
    t<d<Object>> finishRoomAbnormal();

    @h(a = "/webcast/anchor/health_score/total/")
    t<d<Object>> getLiveRoomHealthInfo();

    @h(a = "/hotsoon/room/follow/ids/")
    com.bytedance.retrofit2.b<c<Long>> getLivingRoomIds();

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/mget_info/")
    @g
    t<d<Map<String, Room>>> getMultipleRoomInfo(@com.bytedance.retrofit2.b.e(a = "room_ids") String str);

    @h(a = "/webcast/room/debug_item/")
    t<d<List<DebugRoomItem>>> getRoomDebugInfo(@z(a = "room_id") long j2);

    @h(a = "/webcast/room/debug_permission/")
    t<d<DebugToolState>> getRoomDebugInfoPermission();

    @h(a = "/webcast/room/info/")
    @a(a = a.EnumC0254a.ROOM)
    com.bytedance.retrofit2.b<d<Room>> getRoomStats(@z(a = "is_anchor") boolean z, @z(a = "room_id") long j2, @z(a = "pack_level") int i2);

    @h(a = "/webcast/room/info/")
    @a(a = a.EnumC0254a.ROOM)
    com.bytedance.retrofit2.b<d<Room>> getRoomStats(@z(a = "is_anchor") boolean z, @z(a = "room_id") long j2, @z(a = "pack_level") int i2, @z(a = "need_health_score_info") boolean z2, @z(a = "from_type") int i3);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/leave/")
    @g
    t<d<Object>> leaveRoom(@com.bytedance.retrofit2.b.e(a = "room_id") long j2);

    @h(a = "/webcast/room/background_img/delete/")
    t<d<Void>> removeRoomBackgroundImg(@z(a = "room_id") long j2, @z(a = "user_id") long j3);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/decoration/audit_text/")
    @g
    t<d<DecorationTextAuditResult>> sendDecorationText(@f HashMap<String, String> hashMap);

    @h(a = "/webcast/room/ping/audience/")
    t<d<PingResult>> sendPlayingPing(@z(a = "room_id") long j2, @z(a = "only_status") int i2);

    @h(a = "/webcast/room/auditing/apply/")
    t<d<Object>> unblockRoom(@z(a = "room_id") long j2);

    @h(a = "/webcast/anchor/memorial/memorial_reported/")
    t<d<Void>> updateAnchorMemorial(@z(a = "anchor_id") long j2);
}
