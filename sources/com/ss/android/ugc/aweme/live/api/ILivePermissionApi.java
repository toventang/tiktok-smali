package com.ss.android.ugc.aweme.live.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.live.model.b;
import f.a.t;

public interface ILivePermissionApi {
    static {
        Covode.recordClassIndex(69405);
    }

    @h(a = "/webcast/room/live_podcast/")
    t<b> getLivePodCast();
}
