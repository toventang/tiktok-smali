package com.bytedance.apm.q;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class s {
    static {
        Covode.recordClassIndex(14719);
    }

    public static boolean a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
