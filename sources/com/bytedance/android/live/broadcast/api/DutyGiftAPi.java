package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface DutyGiftAPi {
    static {
        Covode.recordClassIndex(3661);
    }

    @h(a = "/webcast/gift/duty_gift/")
    t<d<DutyGiftInfo>> dutyGiftRequest(@z(a = "room_id") long j2, @z(a = "anchor_id") long j3, @z(a = "op_type") long j4, @z(a = "is_cut_short") boolean z);
}
