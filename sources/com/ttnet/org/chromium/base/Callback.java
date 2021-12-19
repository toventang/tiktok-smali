package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public interface Callback<T> {
    static {
        Covode.recordClassIndex(103250);
    }

    public static abstract class Helper {
        static {
            Covode.recordClassIndex(103251);
        }

        static void onObjectResultFromNative(Callback callback, Object obj) {
        }

        static void runRunnable(Runnable runnable) {
            runnable.run();
        }

        static void onBooleanResultFromNative(Callback callback, boolean z) {
            Boolean.valueOf(z);
        }

        static void onIntResultFromNative(Callback callback, int i2) {
            Integer.valueOf(i2);
        }
    }
}
