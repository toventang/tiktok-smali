package com.bytedance.geckox.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f30139a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(17510);
    }

    public static void a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f30139a.post(runnable);
        }
    }
}
