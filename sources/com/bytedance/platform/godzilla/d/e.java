package com.bytedance.platform.godzilla.d;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(25660);
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 27 || Build.VERSION.PREVIEW_SDK_INT <= 0) {
            return false;
        }
        return true;
    }
}
