package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface StickerReportApi {
    static {
        Covode.recordClassIndex(3666);
    }

    @t(a = "/webcast/room/event_report/")
    @g
    f.a.t<d<Void>> reportEffectChange(@e(a = "room_id") long j2, @e(a = "event") int i2, @e(a = "effect_id") String str, @e(a = "last_effect_id") String str2);

    @t(a = "/webcast/gift/set_room_supported/")
    @g
    f.a.t<d<Object>> reportFaceGift(@e(a = "room_id") long j2, @e(a = "gift_ids") String str);
}
