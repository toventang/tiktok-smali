package com.ss.android.ugc.trill.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;

public final class a {
    static {
        Covode.recordClassIndex(98962);
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean a2 = a();
        j.f107226e = a2;
        return a2;
    }

    public static void a(String str, String str2) {
        d.a();
        if (b()) {
            n.a("aweme_change_user_profile", new c().a("errorDesc", String.valueOf(str)).a("action", String.valueOf(str2)).a());
        }
    }
}
