package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DvmDeadLockOptimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    public static int com_bytedance_sysoptimizer_DvmDeadLockOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    private DvmDeadLockOptimizer() {
    }

    static {
        Covode.recordClassIndex(26975);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT != 19) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (DvmDeadLockOptimizer.class) {
            MethodCollector.i(13385);
            if (mOptimized) {
                MethodCollector.o(13385);
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean optimize = optimize();
                    mOptimized = optimize;
                    MethodCollector.o(13385);
                    return optimize;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_DvmDeadLockOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "failed to optimize, UnsatisfiedLinkError", e2);
                }
            }
            MethodCollector.o(13385);
            return false;
        }
    }
}
