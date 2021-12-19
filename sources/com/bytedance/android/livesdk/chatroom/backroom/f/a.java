package com.bytedance.android.livesdk.chatroom.backroom.f;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(8349);
    }

    public static final String a(EnterRoomConfig enterRoomConfig) {
        l.d(enterRoomConfig, "");
        String str = enterRoomConfig.f23299c.av;
        if (str == null) {
            return enterRoomConfig.f23299c.J + '-' + enterRoomConfig.f23299c.L;
        }
        return str;
    }
}
