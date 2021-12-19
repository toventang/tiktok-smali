package com.bytedance.android.livesdk.ab;

import com.bytedance.android.livesdk.ab.c.a;
import com.bytedance.android.livesdk.ab.c.c;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f13553a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(7507);
    }

    public static h b() {
        return (h) DataChannelGlobal.f34575d.b(j.class);
    }

    public static void a() {
        a aVar;
        h hVar = (h) DataChannelGlobal.f34575d.b(j.class);
        if (hVar != null && (aVar = hVar.f13530e) != null) {
            aVar.f13463j = "";
        }
    }

    public static void a(Long l2) {
        c cVar;
        h b2 = b();
        if (b2 != null && (cVar = b2.f13529d) != null) {
            cVar.f13487h = l2;
        }
    }

    public static void c(String str) {
        c cVar;
        h b2 = b();
        if (b2 != null && (cVar = b2.f13529d) != null) {
            cVar.f13483d = str;
        }
    }

    public static void d(String str) {
        a aVar;
        h b2 = b();
        if (b2 != null && (aVar = b2.f13530e) != null) {
            aVar.K = str;
        }
    }

    public static void b(Long l2) {
        c cVar;
        h b2 = b();
        if (b2 != null && (cVar = b2.f13529d) != null) {
            cVar.f13488i = l2;
        }
    }

    public static void a(String str) {
        a aVar;
        h b2 = b();
        if (b2 != null && (aVar = b2.f13530e) != null) {
            aVar.n = str;
        }
    }

    public static void b(String str) {
        Room room;
        h b2 = b();
        if (b2 != null && (room = b2.f13527b) != null) {
            room.setRoomOrientation(str);
        }
    }
}
