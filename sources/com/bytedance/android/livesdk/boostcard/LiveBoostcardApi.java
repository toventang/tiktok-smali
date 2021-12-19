package com.bytedance.android.livesdk.boostcard;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;

public interface LiveBoostcardApi {
    static {
        Covode.recordClassIndex(7878);
    }

    @g
    @a(a = a.EnumC0254a.GIFT)
    @t(a = "/webcast/boost/card/ack/")
    f.a.t<d<c>> boostCardAck(@e(a = "room_id") long j2, @e(a = "ack_type") int i2);

    @h(a = "/webcast/boost/card/boosted_users/")
    @a(a = a.EnumC0254a.GIFT)
    f.a.t<d<e>> queryUserStatus(@z(a = "room_id") long j2, @z(a = "need_points") boolean z);
}
