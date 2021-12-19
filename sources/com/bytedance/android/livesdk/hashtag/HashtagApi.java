package com.bytedance.android.livesdk.hashtag;

import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import f.a.t;

public interface HashtagApi {
    static {
        Covode.recordClassIndex(10053);
    }

    @h(a = "/webcast/room/hashtag/list/")
    @a(a = a.EnumC0254a.BROADCAST)
    t<d<HashtagResponse>> fetchHashtagList();

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/hashtag/set/")
    @g
    t<d<Void>> setHashtag(@e(a = "room_id") Long l2, @e(a = "anchor_id") Long l3, @e(a = "hashtag_id") Long l4, @e(a = "game_tag_id") Long l5);
}
