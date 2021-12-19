package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ArtOptimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;

    public static int com_bytedance_sysoptimizer_ArtOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean disableDumpOatFile(int i2);

    private static native boolean increaseSuspendTime(int i2);

    private ArtOptimizer() {
    }

    static {
        Covode.recordClassIndex(26970);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 23) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optSuspendTimeout(Context context) {
        synchronized (ArtOptimizer.class) {
            MethodCollector.i(13479);
            if (mOptimized) {
                MethodCollector.o(13479);
                return true;
            } else if (loadOptimizerOnNeed(context)) {
                try {
                    boolean increaseSuspendTime = increaseSuspendTime(Build.VERSION.SDK_INT);
                    mOptimized = increaseSuspendTime;
                    MethodCollector.o(13479);
                    return increaseSuspendTime;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_ArtOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "UnsatisfiedLinkError", e2);
                    MethodCollector.o(13479);
                    return false;
                }
            } else {
                MethodCollector.o(13479);
                return false;
            }
        }
    }

    public static synchronized boolean disableDumpOatFileForANR(Context context) {
        synchronized (ArtOptimizer.class) {
            MethodCollector.i(13480);
            if (mOptimized) {
                MethodCollector.o(13480);
                return true;
            } else if (Build.VERSION.SDK_INT != 29 || !SysOptimizer.loadOptimizerLibrary(context)) {
                MethodCollector.o(13480);
                return false;
            } else {
                try {
                    boolean disableDumpOatFile = disableDumpOatFile(Build.VERSION.SDK_INT);
                    mOptimized = disableDumpOatFile;
                    MethodCollector.o(13480);
                    return disableDumpOatFile;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_ArtOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "UnsatisfiedLinkError", e2);
                    MethodCollector.o(13480);
                    return false;
                }
            }
        }
    }
}
