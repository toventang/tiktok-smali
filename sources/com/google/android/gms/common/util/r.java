package com.google.android.gms.common.util;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class r {
    static {
        Covode.recordClassIndex(31480);
    }

    public static boolean a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
