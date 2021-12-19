package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.a;
import com.bytedance.android.live.network.response.c;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface EndPageRecommendRetrofitApi {
    static {
        Covode.recordClassIndex(8268);
    }

    @h(a = "/webcast/room/recommend_live/")
    t<a<Room, com.bytedance.android.live.base.model.c.a>> getLive(@z(a = "room_id") long j2);

    @h(a = "/webcast/feed/")
    t<a<FeedItem, com.bytedance.android.live.base.model.c.a>> getNewRecommend(@z(a = "max_time") long j2, @z(a = "req_from") String str, @z(a = "channel_id") String str2, @z(a = "is_draw") long j3, @z(a = "draw_room_id") long j4, @z(a = "draw_room_owner_id") long j5);

    @h(a = "/webcast/room/recommend_item/")
    t<c<Object>> getVideos(@z(a = "room_id") long j2);
}
