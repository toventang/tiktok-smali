package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface BanUserInfoApi {
    static {
        Covode.recordClassIndex(3656);
    }

    @h(a = "/webcast/review/get_latest_ban_record/")
    t<d<c>> getBanUserInfo(@z(a = "ban_type") int i2);
}
