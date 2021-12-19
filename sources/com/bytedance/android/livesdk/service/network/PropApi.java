package com.bytedance.android.livesdk.service.network;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;

public interface PropApi {
    static {
        Covode.recordClassIndex(12621);
    }

    @t(a = "/webcast/props/mine/")
    f.a.t<d<a>> getPropList(@z(a = "room_id") long j2);

    @t(a = "/webcast/props/consume/")
    @g
    f.a.t<d<w>> sendProp(@e(a = "prop_def_id") long j2, @z(a = "room_id") long j3, @e(a = "count") int i2, @e(a = "to_user_id") long j4, @e(a = "is_aweme_free_gift") int i3);
}
