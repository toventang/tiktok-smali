package com.ss.android.ugc.aweme.lancet;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.logger.a;

public final class m {
    static {
        Covode.recordClassIndex(68587);
    }

    private static boolean b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private static boolean a() {
        if (!b() || !a.b.f109011a.f109002c) {
            return false;
        }
        return true;
    }

    private static String a(String str) {
        return "load_so_".concat(String.valueOf(str));
    }

    public static void a(long j2, String str) {
        if (a()) {
            long uptimeMillis = SystemClock.uptimeMillis() - j2;
            a.b.f109011a.a(a(str), uptimeMillis);
            a.b.f109011a.b("load_so_total", uptimeMillis);
        }
    }
}
