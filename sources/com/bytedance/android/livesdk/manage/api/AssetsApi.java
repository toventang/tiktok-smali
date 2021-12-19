package com.bytedance.android.livesdk.manage.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.manage.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface AssetsApi {
    static {
        Covode.recordClassIndex(11231);
    }

    @h(a = "/webcast/assets/effects/")
    t<d<a>> getAssets(@z(a = "download_assets_from") int i2, @z(a = "room_id") Long l2);
}
