package com.bytedance.android.ecommerce.k;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class k {
    static {
        Covode.recordClassIndex(3442);
    }

    public static void a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
