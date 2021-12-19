package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class JitGetMethodHashOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26987);
    }

    public static int com_bytedance_sysoptimizer_JitGetMethodHashOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    private static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fix(Context context) {
        MethodCollector.i(13404);
        if (mOptimized) {
            MethodCollector.o(13404);
            return;
        }
        if (loadOptimizerOnNeed(context)) {
            try {
                optimize();
                mOptimized = true;
                MethodCollector.o(13404);
                return;
            } catch (UnsatisfiedLinkError e2) {
                com_bytedance_sysoptimizer_JitGetMethodHashOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("JitGetMethodHashOptimizer", "UnsatisfiedLinkError", e2);
            }
        }
        MethodCollector.o(13404);
    }
}
