package com.bytedance.android.livesdkapi.g;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface i {

    public interface a {
        static {
            Covode.recordClassIndex(13763);
        }

        void a();

        void a(List<EnterRoomConfig> list);
    }

    static {
        Covode.recordClassIndex(13762);
    }

    List<EnterRoomConfig> a();

    void a(int i2, a aVar);

    void a(long j2);

    void a(Map<String, String> map);

    void b();
}
