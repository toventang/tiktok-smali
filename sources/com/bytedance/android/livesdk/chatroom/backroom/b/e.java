package com.bytedance.android.livesdk.chatroom.backroom.b;

import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e implements a {
    static {
        Covode.recordClassIndex(8336);
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.b.a
    public final boolean a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        EnterRoomConfig.RoomsData roomsData;
        l.d(stackContext, "");
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.f23299c) == null || roomsData.R <= 0) {
            return true;
        }
        return false;
    }
}
