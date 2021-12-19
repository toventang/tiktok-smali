package com.bytedance.android.livesdk.ab;

import com.bytedance.android.livesdk.ab.c.a;
import com.bytedance.android.livesdk.ab.c.c;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13556a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(7513);
    }

    public static h n() {
        return (h) DataChannelGlobal.f34575d.b(j.class);
    }

    public static String a() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.f13455b) == null) {
            return "";
        }
        return str;
    }

    public static String b() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.B) == null) {
            return "";
        }
        return str;
    }

    public static String c() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.f13456c) == null) {
            return "";
        }
        return str;
    }

    public static String d() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.f13454a) == null) {
            return "";
        }
        return str;
    }

    public static String e() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.n) == null) {
            return "";
        }
        return str;
    }

    public static String f() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.f13458e) == null) {
            return "";
        }
        return str;
    }

    public static String g() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.f13463j) == null) {
            return "";
        }
        return str;
    }

    public static long h() {
        Long l2;
        h n = n();
        if (n == null || (l2 = n.f13528c) == null) {
            return 0;
        }
        return l2.longValue();
    }

    public static long i() {
        Room room;
        h n = n();
        if (n == null || (room = n.f13527b) == null) {
            return 0;
        }
        return room.getId();
    }

    public static String j() {
        Room room;
        String log_pb;
        h n = n();
        if (n == null || (room = n.f13527b) == null || (log_pb = room.getLog_pb()) == null) {
            return "";
        }
        return log_pb;
    }

    public static String k() {
        Room room;
        String requestId;
        h n = n();
        if (n == null || (room = n.f13527b) == null || (requestId = room.getRequestId()) == null) {
            return "";
        }
        return requestId;
    }

    public static String l() {
        c cVar;
        Long l2;
        String valueOf;
        h n = n();
        if (n == null || (cVar = n.f13529d) == null || (l2 = cVar.f13486g) == null || (valueOf = String.valueOf(l2.longValue())) == null) {
            return "";
        }
        return valueOf;
    }

    public static String m() {
        a aVar;
        String str;
        h hVar = (h) DataChannelGlobal.f34575d.b(j.class);
        if (hVar == null || (aVar = hVar.f13530e) == null || (str = aVar.s) == null) {
            return "";
        }
        return str;
    }

    public static String o() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.F) == null) {
            return "";
        }
        return str;
    }

    public static String p() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.G) == null) {
            return "";
        }
        return str;
    }

    public static String q() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.o) == null) {
            return "";
        }
        return str;
    }

    public static String r() {
        a aVar;
        String str;
        h n = n();
        if (n == null || (aVar = n.f13530e) == null || (str = aVar.q) == null) {
            return "";
        }
        return str;
    }
}
