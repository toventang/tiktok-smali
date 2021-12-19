package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RedmiTypeFaceOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(27004);
    }

    public static int com_bytedance_sysoptimizer_RedmiTypeFaceOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize(boolean z);

    public static void fixOnAndroidQ(Context context) {
        fixOnAndroidQ(context, false);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fixOnAndroidQ(Context context, boolean z) {
        MethodCollector.i(11280);
        if (mOptimized) {
            MethodCollector.o(11280);
        } else if (Build.VERSION.SDK_INT != 29) {
            MethodCollector.o(11280);
        } else {
            if (loadOptimizerOnNeed(context)) {
                try {
                    optimize(z);
                    mOptimized = true;
                    MethodCollector.o(11280);
                    return;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_RedmiTypeFaceOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("RedmiTypeFaceOptimizer", "UnsatisfiedLinkError", e2);
                }
            }
            MethodCollector.o(11280);
        }
    }
}
