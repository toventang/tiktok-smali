package com.bytedance.android.livesdk.subscribe;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.gson.o;
import f.a.t;

public interface SubscribeApi {
    static {
        Covode.recordClassIndex(12645);
    }

    @h(a = "/webcast/sub/privilege/get_sub_privilege_detail")
    t<d<o>> getSubPrivilegeDetail(@z(a = "room_id") String str, @z(a = "sec_anchor_id") String str2);
}
