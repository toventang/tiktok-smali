package com.bytedance.android.livesdk.watch.chatroom;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(13238);
    }

    EnterRoomConfig a();

    void a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext);

    EnterRoomConfig b();

    int c();
}
