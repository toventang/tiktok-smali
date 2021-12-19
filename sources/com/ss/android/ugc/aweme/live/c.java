package com.ss.android.ugc.aweme.live;

import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import f.a.t;

public interface c extends d {
    static {
        Covode.recordClassIndex(69413);
    }

    t<NewLiveRoomStruct> a(long j2, String str);

    boolean a();

    boolean f(String str);

    void z();
}
