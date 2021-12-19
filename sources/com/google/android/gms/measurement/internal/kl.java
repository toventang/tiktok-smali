package com.google.android.gms.measurement.internal;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class kl {
    static {
        Covode.recordClassIndex(32369);
    }

    kl() {
    }

    public static boolean a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
