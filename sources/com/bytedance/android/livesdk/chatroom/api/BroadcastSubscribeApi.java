package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface BroadcastSubscribeApi {
    static {
        Covode.recordClassIndex(8266);
    }

    @h(a = "/webcast/sub/privilege/get_sub_info/")
    t<d<f>> getSubscribeInfo(@z(a = "need_current_state") boolean z, @z(a = "sec_anchor_id") String str);
}
