package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface StickerGiftApi {
    static {
        Covode.recordClassIndex(3665);
    }

    @h(a = "/webcast/gift/user_name/check/")
    t<d<b>> checkUserNameLegality(@z(a = "name") String str);
}
