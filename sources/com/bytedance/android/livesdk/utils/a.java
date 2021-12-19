package com.bytedance.android.livesdk.utils;

import android.net.Uri;
import com.bytedance.android.livesdk.ab.c.a;
import com.bytedance.android.livesdk.j.aj;
import com.bytedance.android.livesdk.j.bi;
import com.bytedance.android.livesdk.j.bj;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22204a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(13110);
    }

    public static final boolean a(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(aj.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final void a(Uri uri, EnterRoomConfig enterRoomConfig) {
        l.d(uri, "");
        l.d(enterRoomConfig, "");
        ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.c.a.class)).a(uri, enterRoomConfig);
    }

    public static final void a(EnterRoomConfig enterRoomConfig, a.C0285a aVar) {
        l.d(enterRoomConfig, "");
        l.d(aVar, "");
        if (enterRoomConfig.f23299c.o) {
            aVar.a(enterRoomConfig.f23299c.f23333l);
            aVar.b(enterRoomConfig.f23299c.f23334m);
        }
    }

    public static final void a(DataChannel dataChannel, EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && dataChannel != null && enterRoomConfig.f23299c.o) {
            enterRoomConfig.f23299c.o = false;
            enterRoomConfig.f23299c.f23333l = new HashMap<>();
            enterRoomConfig.f23299c.f23334m = new HashMap<>();
            dataChannel.a(aj.class, (Object) false);
            dataChannel.a(bj.class, new HashMap());
            dataChannel.a(bi.class, new HashMap());
        }
    }

    public static final void a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        l.d(str, "");
        l.d(str2, "");
        ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.c.a.class)).a(str, str2, map, map2);
    }
}
