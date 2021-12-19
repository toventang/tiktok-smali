package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface FollowApi {
    static {
        Covode.recordClassIndex(12994);
    }

    @t(a = "/webcast/user/relation/update/")
    @g
    f.a.t<d<a>> follow(@e(a = "follow_type") int i2, @e(a = "to_user_id") long j2, @e(a = "current_room_id") long j3, @e(a = "sec_user_id") String str, @e(a = "sec_to_user_id") String str2);

    @t(a = "/webcast/user/relation/update/")
    @g
    f.a.t<d<a>> unfollow(@e(a = "follow_type") int i2, @e(a = "sec_user_id") String str, @e(a = "to_user_id") long j2, @e(a = "sec_to_user_id") String str2, @e(a = "current_room_id") long j3);
}
