package com.bytedance.android.live.slot;

import com.bytedance.android.livesdk.ab.c.c;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.c.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static long f12746a;

    /* renamed from: b  reason: collision with root package name */
    public static final ac f12747b = new ac();

    /* renamed from: c  reason: collision with root package name */
    private static String f12748c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f12749d = "";

    private ac() {
    }

    private static String c() {
        if (b()) {
            return "1";
        }
        return "0";
    }

    public final void a() {
        f12746a = 0;
        a("");
        b("");
    }

    static {
        Covode.recordClassIndex(7090);
    }

    public static boolean b() {
        if (l.a((Object) f12749d, (Object) "ec_shop") || l.a((Object) f12748c, (Object) "ec_shop")) {
            return true;
        }
        return false;
    }

    public static void a(String str) {
        c cVar;
        l.d(str, "");
        f12748c = str;
        h hVar = (h) DataChannelGlobal.f34575d.b(j.class);
        if (hVar != null && (cVar = hVar.f13529d) != null) {
            cVar.a(c());
        }
    }

    public static void b(String str) {
        c cVar;
        l.d(str, "");
        f12749d = str;
        h hVar = (h) DataChannelGlobal.f34575d.b(j.class);
        if (hVar != null && (cVar = hVar.f13529d) != null) {
            cVar.a(c());
        }
    }
}
