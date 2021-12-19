package com.bytedance.android.livesdk.chatroom.d;

import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.c.j;
import com.bytedance.android.livesdk.ab.c.m;
import com.bytedance.android.livesdk.ab.c.n;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(8420);
    }

    private static final boolean a() {
        d a2 = d.a();
        l.b(a2, "");
        if (!a2.f15171a || a2.f15172b == null) {
            return false;
        }
        return a2.f15172b.f15180f;
    }

    private static final boolean b(EnterRoomConfig enterRoomConfig) {
        if (!a(enterRoomConfig) || a()) {
            return false;
        }
        return true;
    }

    private static final boolean a(EnterRoomConfig enterRoomConfig) {
        if (!l.a((Object) "live_merge", (Object) enterRoomConfig.f23299c.J) || !l.a((Object) "live_cover", (Object) enterRoomConfig.f23299c.L)) {
            return false;
        }
        return true;
    }

    private static final int c(EnterRoomConfig enterRoomConfig, int i2) {
        if (i2 == 0 || b(enterRoomConfig)) {
            return 0;
        }
        return 1;
    }

    private static final int b(EnterRoomConfig enterRoomConfig, int i2) {
        if (i2 != 0 || b(enterRoomConfig)) {
            return i2;
        }
        d a2 = d.a();
        l.b(a2, "");
        return a2.f();
    }

    public static final void a(EnterRoomConfig enterRoomConfig, int i2) {
        l.d(enterRoomConfig, "");
        m mVar = new m(b(enterRoomConfig, i2), c(enterRoomConfig, i2));
        h hVar = (h) DataChannelGlobal.f34575d.b(j.class);
        if (hVar != null) {
            hVar.f13531f = mVar;
        }
        DataChannelGlobal.f34575d.a(n.class, mVar);
    }
}
