package com.bytedance.scene.d;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class j {
    static {
        Covode.recordClassIndex(26268);
    }

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method must call on main thread");
        }
    }
}
