package com.ss.android.ugc.aweme.utils;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class ia {
    static {
        Covode.recordClassIndex(93660);
    }

    public static String a(int i2) {
        int i3 = i2 / 1000;
        int i4 = i3 % 60;
        int i5 = i3 / 60;
        int i6 = i5 / 60;
        int i7 = i5 % 60;
        if (i6 == 0) {
            return a.a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i7), Integer.valueOf(i4)});
        }
        return a.a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i4)});
    }
}
