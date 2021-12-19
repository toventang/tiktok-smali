package com.bytedance.l.a;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

public interface a extends com.bytedance.android.live.base.a {
    static {
        Covode.recordClassIndex(24544);
    }

    Class a();

    void a(Context context, EnterRoomConfig enterRoomConfig);
}
