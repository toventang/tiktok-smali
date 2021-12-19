package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface FirstRechargeApi {
    static {
        Covode.recordClassIndex(9838);
    }

    @g
    @a(a = a.EnumC0254a.GIFT)
    @t(a = "/webcast/diamond/first_charge/")
    f.a.t<d<a>> syncFirstRechargeInfo(@e(a = "live_id") Long l2, @e(a = "currency") String str);
}
