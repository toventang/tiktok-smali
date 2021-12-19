package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class StageFrightAndroid4Optimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(27010);
    }

    public static int com_bytedance_sysoptimizer_StageFrightAndroid4Optimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    private static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fixStageFrightAndroid4(Context context) {
        MethodCollector.i(11926);
        if (mOptimized) {
            MethodCollector.o(11926);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MethodCollector.o(11926);
        } else {
            if (loadOptimizerOnNeed(context)) {
                try {
                    optimize();
                    mOptimized = true;
                    MethodCollector.o(11926);
                    return;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_StageFrightAndroid4Optimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("StageFrightOptimizer", "UnsatisfiedLinkError", e2);
                }
            }
            MethodCollector.o(11926);
        }
    }
}
