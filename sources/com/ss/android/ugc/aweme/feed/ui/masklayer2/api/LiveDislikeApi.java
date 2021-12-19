package com.ss.android.ugc.aweme.feed.ui.masklayer2.api;

import com.bytedance.android.live.base.model.live.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface LiveDislikeApi {
    static {
        Covode.recordClassIndex(60204);
    }

    @h(a = "/webcast/room/dislike/")
    t<Object<a>> dislikeLiveRoom(@z(a = "room_id") long j2, @z(a = "owner_uid") long j3, @z(a = "request_id") String str, @z(a = "source") String str2, @z(a = "enter_from_merge") String str3, @z(a = "enter_method") String str4, @z(a = "ad_id") String str5, @z(a = "creative_id") String str6, @z(a = "log_extra") String str7, @z(a = "tag") String str8);
}
