package com.bytedance.android.live.broadcast.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface AutoReplyApi {
    static {
        Covode.recordClassIndex(3655);
    }

    @t(a = "/webcast/room/set_auto_gift_thanks/")
    @g
    f.a.t<Object> enableAutoReply(@e(a = "enabled") String str);
}
