package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

public interface j extends a {
    static {
        Covode.recordClassIndex(13816);
    }

    void a(Context context, EnterRoomConfig enterRoomConfig, long j2);

    void a(Context context, EnterRoomConfig enterRoomConfig, String str);

    boolean a(Context context, EnterRoomConfig enterRoomConfig);

    void b(Context context, EnterRoomConfig enterRoomConfig);
}
