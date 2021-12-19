package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface EffectRelatedApi {
    static {
        Covode.recordClassIndex(4891);
    }

    @t(a = "/webcast/room/internal_ci_info/")
    @g
    f.a.t<d<Void>> uploadBeautyParams(@e(a = "room_id") long j2, @e(a = "filter_name") String str, @e(a = "brightening") int i2, @e(a = "beauty_skin") int i3, @e(a = "big_eyes") int i4, @e(a = "face_lift") int i5, @e(a = "use_filter") boolean z);
}
