package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MTK_PVR_Optimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;
    private static boolean sAlwaysCatchSIGSEGV;
    private static boolean sCatchSIGSEGV;

    public static int com_bytedance_sysoptimizer_MTK_PVR_Optimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native void optimize();

    private static native void setCatchOption(boolean z);

    static {
        Covode.recordClassIndex(26995);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void setAlwaysCatchSIGSEGV(boolean z) {
        boolean z2;
        synchronized (MTK_PVR_Optimizer.class) {
            MethodCollector.i(12383);
            if (sAlwaysCatchSIGSEGV == z) {
                MethodCollector.o(12383);
                return;
            }
            sAlwaysCatchSIGSEGV = z;
            if (mOptimized) {
                if (z || sCatchSIGSEGV) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setCatchOption(z2);
            }
            MethodCollector.o(12383);
        }
    }

    public static synchronized void setCatchSIGSEGV(boolean z) {
        boolean z2;
        synchronized (MTK_PVR_Optimizer.class) {
            MethodCollector.i(12382);
            if (sCatchSIGSEGV == z) {
                MethodCollector.o(12382);
                return;
            }
            sCatchSIGSEGV = z;
            if (mOptimized) {
                if (sAlwaysCatchSIGSEGV || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setCatchOption(z2);
            }
            MethodCollector.o(12382);
        }
    }

    public static synchronized void enable(Context context) {
        boolean z;
        synchronized (MTK_PVR_Optimizer.class) {
            MethodCollector.i(12520);
            if (mOptimized) {
                MethodCollector.o(12520);
                return;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    if (!sAlwaysCatchSIGSEGV) {
                        if (!sCatchSIGSEGV) {
                            z = false;
                            setCatchOption(z);
                            optimize();
                            mOptimized = true;
                            MethodCollector.o(12520);
                            return;
                        }
                    }
                    z = true;
                    setCatchOption(z);
                    optimize();
                    mOptimized = true;
                    MethodCollector.o(12520);
                    return;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_MTK_PVR_Optimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "UnsatisfiedLinkError", e2);
                }
            }
            MethodCollector.o(12520);
        }
    }
}
