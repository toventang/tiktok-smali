package com.ss.android.ugc.aweme.shortvideo.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;

public final class m {
    static {
        Covode.recordClassIndex(84299);
    }

    private static long a() {
        long maxShootingDuration = g.a().l().getMaxDurationResolver().getMaxShootingDuration();
        if (g.a().e().getDurationMode(true)) {
            return maxShootingDuration;
        }
        return 15000;
    }

    public static long a(String str) {
        long a2 = a();
        if (!TextUtils.isEmpty(str)) {
            long b2 = (long) l.f115658a.b().b(str);
            if (b2 != -1) {
                return Math.min(a2, b2);
            }
        }
        return a2;
    }
}
