package com.ss.android.ugc.effectmanager.common.utils;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class Preconditions {
    static {
        Covode.recordClassIndex(95347);
    }

    private Preconditions() {
    }

    public static void checkUiThread() {
        Thread currentThread = Thread.currentThread();
        if (Looper.getMainLooper().getThread() != currentThread) {
            throw new IllegalStateException("Method cannot be called off the main application thread (on: " + currentThread.getName() + ")");
        }
    }

    public static <T> T checkNotNull(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
