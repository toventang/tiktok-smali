package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.f;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import f.a.t;

public interface BroadcastSettingApi {
    static {
        Covode.recordClassIndex(3658);
    }

    @h(a = "/webcast/user/permission/")
    t<d<f>> fetchBroadcastSetting();
}
