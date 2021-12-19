package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class JitCompileMethodCrash {
    private static String TAG = "OPTIMIZER-JIT";
    private static boolean mOptimized;

    public static int com_bytedance_sysoptimizer_JitCompileMethodCrash_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_JitCompileMethodCrash_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize(int i2);

    private JitCompileMethodCrash() {
    }

    static {
        Covode.recordClassIndex(26986);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 27 || Build.VERSION.SDK_INT > 30) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (JitCompileMethodCrash.class) {
            MethodCollector.i(12381);
            if (mOptimized) {
                MethodCollector.o(12381);
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean optimize = optimize(Build.VERSION.SDK_INT);
                    mOptimized = optimize;
                    MethodCollector.o(12381);
                    return optimize;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_JitCompileMethodCrash_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "failed to optimize, UnsatisfiedLinkError", e2);
                }
            }
            com_bytedance_sysoptimizer_JitCompileMethodCrash_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "optimize failed.");
            MethodCollector.o(12381);
            return false;
        }
    }
}
