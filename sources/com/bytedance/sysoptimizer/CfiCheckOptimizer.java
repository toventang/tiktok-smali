package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class CfiCheckOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26974);
    }

    public static int com_bytedance_sysoptimizer_CfiCheckOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean disableCfiCheck();

    private CfiCheckOptimizer() {
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 29 || Build.VERSION.SDK_INT > 30 || !Process.is64Bit()) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (CfiCheckOptimizer.class) {
            MethodCollector.i(13477);
            if (mOptimized) {
                MethodCollector.o(13477);
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean disableCfiCheck = disableCfiCheck();
                    mOptimized = disableCfiCheck;
                    MethodCollector.o(13477);
                    return disableCfiCheck;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_CfiCheckOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("CfiCheckOptimizer", "failed to optimize, UnsatisfiedLinkError", e2);
                }
            }
            MethodCollector.o(13477);
            return false;
        }
    }
}
