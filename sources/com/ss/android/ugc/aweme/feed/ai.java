package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.base.h.d;
import com.ss.android.ugc.aweme.base.h.e;
import com.ss.android.ugc.aweme.utils.bo;

public final class ai {
    static {
        Covode.recordClassIndex(57847);
    }

    public static void b() {
        d();
        e c2 = d.c();
        c2.b("share_guide_show_times", c2.a("share_guide_show_times", 0) + 1);
    }

    public static String c() {
        return d.c().a("last_share_type", s.a.f66880a.i().c());
    }

    public static boolean a() {
        int a2 = b.a().a(true, "share_guide_threshold", 0);
        if (a2 < 0) {
            a2 = Integer.MAX_VALUE;
        }
        d();
        if (d.c().a("share_guide_show_times", 0) < a2) {
            return true;
        }
        return false;
    }

    private static void d() {
        int d2 = (int) (bo.d(System.currentTimeMillis()) / 86400000);
        e c2 = d.c();
        if (c2.a("share_guide_date_day", -1) != d2) {
            c2.b("share_guide_date_day", d2);
            c2.b("share_guide_show_times", 0);
        }
    }

    public static void a(String str) {
        d.c().b("last_share_type", str);
    }

    public static void b(String str) {
        d.c().b("last_share_way", str);
    }
}
