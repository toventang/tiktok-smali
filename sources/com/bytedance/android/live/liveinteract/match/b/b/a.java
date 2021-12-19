package com.bytedance.android.live.liveinteract.match.b.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static b f10674a = new b("data_battle_state");

    /* renamed from: b  reason: collision with root package name */
    public static b f10675b = new b("data_battle_rematch_state");

    /* renamed from: c  reason: collision with root package name */
    public static final a f10676c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(5700);
    }

    public static final boolean a() {
        c a2 = f10674a.a();
        if (c.START.compareTo((Enum) a2) > 0 || a2.compareTo((Enum) c.END) >= 0) {
            return false;
        }
        return true;
    }

    public static void a(String str, int i2) {
        l.d(str, "");
        if (i2 == 1) {
            f10674a.b(false, str);
        } else if (i2 != 2) {
            f10674a.b(false, str);
            f10675b.b(true, str);
        } else {
            f10675b.b(true, str);
        }
    }
}
