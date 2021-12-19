package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface ProfileNotificationApi {
    static {
        Covode.recordClassIndex(12834);
    }

    @t(a = "/webcast/user/relation/live_push_status/update/")
    @g
    f.a.t<d<Object>> sendNewSetting(@e(a = "push_status") int i2, @e(a = "sec_to_user_id") String str);
}
