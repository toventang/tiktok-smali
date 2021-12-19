package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.user.a;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.broadcast.model.b;
import com.bytedance.android.live.broadcast.model.i;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.broadcast.model.p;
import com.bytedance.android.live.network.response.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.bytedance.retrofit2.mime.TypedOutput;
import f.a.t;

public interface BroadcastRoomApi {
    static {
        Covode.recordClassIndex(3657);
    }

    @h(a = "/webcast/room/screenshot_category_list/")
    t<d<Object>> getAllCategory(@z(a = "platform") int i2);

    @h(a = "/webcast/room/anchor_pre_finish/")
    t<d<b>> getAnchorPreFinish(@z(a = "room_id") long j2);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/get_latest_room/")
    t<d<Room>> getLatestRoom();

    @h(a = "/webcast/room/game_list/")
    t<c<Game>> getLiveGameList(@z(a = "game_icon") int i2);

    @h(a = "/webcast/room/live_permission/apply_info/")
    t<d<i>> getLivePermissionApply(@z(a = "permission_names") String str);

    @h(a = "/webcast/anchor/health_score/total/")
    t<d<Object>> getLiveRoomHealthInfo();

    @h(a = "/webcast/room/create_info/")
    t<d<o>> getPreviewRoomCreateInfo(@z(a = "last_time_hashtag_id") long j2);

    @h(a = "/webcast/room/auditing/info/")
    t<d<WaitingReviewInfo>> getReviewInfo(@z(a = "room_id") long j2);

    @h(a = "/webcast/room/tag_list/")
    t<c<n>> getRoomTags();

    @h(a = "/webcast/anchor/cover/neednotice/")
    t<d<Object>> shouldShowCoverNotice();

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/video/capture/")
    t<d<Object>> updateCaptureVideo(@com.bytedance.retrofit2.b.b TypedOutput typedOutput);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/update_room_info/")
    @g
    t<d<p>> updateRoomInfo(@e(a = "room_id") long j2, @e(a = "cover_uri") String str);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/internal_ci_info/")
    @g
    t<d<Void>> uploadBeautyParams(@e(a = "room_id") long j2, @e(a = "filter_name") String str, @e(a = "brightening") int i2, @e(a = "beauty_skin") int i3, @e(a = "big_eyes") int i4, @e(a = "face_lift") int i5, @e(a = "use_filter") boolean z);

    @com.bytedance.retrofit2.b.t(a = "/webcast/review/upload_original_frame")
    t<d<a>> uploadOriginScreen(@com.bytedance.retrofit2.b.b TypedOutput typedOutput, @z(a = "room_id") Long l2);
}
