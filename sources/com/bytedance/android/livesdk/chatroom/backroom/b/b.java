package com.bytedance.android.livesdk.chatroom.backroom.b;

import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements a {
    static {
        Covode.recordClassIndex(8333);
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.b.a
    public final boolean a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        Long l2;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        l.d(stackContext, "");
        Long l3 = null;
        if (enterRoomConfig == null || (roomsData2 = enterRoomConfig.f23299c) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(roomsData2.R);
        }
        if (!(enterRoomConfig2 == null || (roomsData = enterRoomConfig2.f23299c) == null)) {
            l3 = Long.valueOf(roomsData.R);
        }
        return l.a(l2, l3);
    }
}
