package com.bytedance.android.live.core.feed;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface FeedApi {
    static {
        Covode.recordClassIndex(4674);
    }

    @h
    @a(a = a.EnumC0254a.FEED)
    t<com.bytedance.android.live.network.response.a<FeedItem, com.bytedance.android.live.base.model.c.a>> feed(@ag String str, @z(a = "max_time") long j2, @z(a = "req_from") String str2);

    @h
    @a(a = a.EnumC0254a.FEED)
    t<com.bytedance.android.live.network.response.a<FeedItem, com.bytedance.android.live.base.model.c.a>> feed(@ag String str, @z(a = "max_time") long j2, @z(a = "req_from") String str2, @z(a = "is_draw") long j3, @z(a = "draw_room_id") long j4, @z(a = "draw_room_owner_id") long j5);

    @h
    @a(a = a.EnumC0254a.FEED)
    t<com.bytedance.android.live.network.response.a<FeedItem, com.bytedance.android.live.base.model.c.a>> feed(@ag String str, @z(a = "max_time") long j2, @z(a = "req_from") String str2, @z(a = "channel_id") String str3, @z(a = "is_draw") long j3, @z(a = "draw_room_id") long j4, @z(a = "draw_room_owner_id") long j5);

    @h
    @a(a = a.EnumC0254a.FEED)
    t<com.bytedance.android.live.network.response.a<FeedItem, com.bytedance.android.live.base.model.c.a>> feed(@ag String str, @z(a = "max_time") long j2, @z(a = "req_from") String str2, @z(a = "channel_id") String str3, @z(a = "draw_room_id") String str4, @z(a = "draw_room_owner_id") String str5, @z(a = "hashtag_id") long j3, @z(a = "style") long j4);
}
