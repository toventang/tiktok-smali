package com.bytedance.android.livesdkapi.depend.d;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

public final class o {
    static {
        Covode.recordClassIndex(13613);
    }

    public static void a(Room room, String str, EnterRoomConfig enterRoomConfig) {
        enterRoomConfig.f23299c.X = str;
        a.a(room, enterRoomConfig);
    }
}
