package com.bytedance.android.livesdkapi.c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface a extends com.bytedance.android.live.base.a {

    /* renamed from: com.bytedance.android.livesdkapi.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0501a {
        static {
            Covode.recordClassIndex(13569);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(13568);
    }

    void a(Context context, String str, long j2);

    void a(Context context, String str, long j2, AbstractC0501a aVar);

    void a(Uri uri, EnterRoomConfig enterRoomConfig);

    void a(String str, String str2, Map<String, String> map, Map<String, String> map2);
}
