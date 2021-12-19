package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.network.response.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.usermanage.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface AdminApi {
    static {
        Covode.recordClassIndex(12952);
    }

    @h(a = "/webcast/user/admin/list/")
    t<a<b, com.bytedance.android.livesdk.usermanage.a.a>> fetchAdministrators(@z(a = "anchor_id") long j2, @z(a = "sec_anchor_id") String str, @z(a = "sec_user_id") String str2);

    @com.bytedance.retrofit2.b.t(a = "/webcast/user/admin/update/")
    @g
    t<d<Object>> updateAdmin(@e(a = "update_type") int i2, @e(a = "to_user_id") long j2, @e(a = "anchor_id") long j3, @e(a = "current_room_id") long j4);
}
