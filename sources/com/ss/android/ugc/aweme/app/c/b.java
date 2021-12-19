package com.ss.android.ugc.aweme.app.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

final class b {
    static {
        Covode.recordClassIndex(41049);
    }

    static int a() {
        Long.valueOf(d.h()).intValue();
        int i2 = 0;
        try {
            String[] split = d.i().split("\\.");
            int length = split.length;
            int i3 = 0;
            while (i2 < length) {
                try {
                    i3 = Integer.valueOf(split[i2]).intValue() + (i3 * 100);
                    i2++;
                } catch (Throwable unused) {
                    i2 = i3;
                    return i2;
                }
            }
            return i3;
        } catch (Throwable unused2) {
            return i2;
        }
    }
}
