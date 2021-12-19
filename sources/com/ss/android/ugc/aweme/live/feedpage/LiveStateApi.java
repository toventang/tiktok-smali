package com.ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface LiveStateApi {
    static {
        Covode.recordClassIndex(69440);
    }

    @t(a = "/webcast/room/live_room_id/")
    @g
    f.a.t<j> liveStates(@e(a = "user_id") String str, @e(a = "scene") String str2);
}
