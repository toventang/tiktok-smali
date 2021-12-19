package com.bytedance.android.livesdk.feed.tab.api;

import com.bytedance.android.live.network.response.a;
import com.bytedance.android.livesdk.feed.feed.f;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface FeedTabApi {
    static {
        Covode.recordClassIndex(9799);
    }

    @h(a = "/webcast/tab/")
    t<a<ah, f>> queryTab(@z(a = "live_entrance") int i2);
}
