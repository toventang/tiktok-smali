package com.bytedance.android.live.banner;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.model.message.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface BannerRetrofitApi {
    static {
        Covode.recordClassIndex(3559);
    }

    @h(a = "/webcast/room/in_room_banner/")
    t<d<c>> queryLiveRoomBanner(@z(a = "room_id") long j2, @z(a = "user_type") int i2);
}
