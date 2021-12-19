package com.bytedance.platform.a.a;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class i {
    static {
        Covode.recordClassIndex(25568);
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
