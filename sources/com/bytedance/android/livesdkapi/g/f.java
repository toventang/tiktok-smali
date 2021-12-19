package com.bytedance.android.livesdkapi.g;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

public interface f {

    public interface a {
        static {
            Covode.recordClassIndex(13759);
        }

        void c();
    }

    static {
        Covode.recordClassIndex(13758);
    }

    int a();

    int a(EnterRoomConfig enterRoomConfig);

    EnterRoomConfig a(int i2);

    void a(Room room);

    void a(a aVar);

    void b(a aVar);

    Room c(int i2);
}
