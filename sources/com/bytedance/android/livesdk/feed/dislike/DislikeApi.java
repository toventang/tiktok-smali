package com.bytedance.android.livesdk.feed.dislike;

import com.bytedance.android.live.base.model.live.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface DislikeApi {
    static {
        Covode.recordClassIndex(9620);
    }

    @h(a = "/webcast/room/dislike/")
    t<d<a>> dislikeRoom(@z(a = "id") long j2, @z(a = "owner_uid") long j3, @z(a = "request_id") String str, @z(a = "enter_source") String str2, @z(a = "source") String str3, @z(a = "log_pb") String str4);
}
