package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class HighLevelTrimMemory {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    public static int com_bytedance_sysoptimizer_HighLevelTrimMemory_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean disable();

    private HighLevelTrimMemory() {
    }

    static {
        Covode.recordClassIndex(26985);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (HighLevelTrimMemory.class) {
            MethodCollector.i(13240);
            if (mOptimized) {
                MethodCollector.o(13240);
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean disable = disable();
                    mOptimized = disable;
                    MethodCollector.o(13240);
                    return disable;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_HighLevelTrimMemory_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "failed to optimize, UnsatisfiedLinkError", e2);
                }
            }
            MethodCollector.o(13240);
            return false;
        }
    }
}
