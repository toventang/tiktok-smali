package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MaliGpuExtIsSupportOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26996);
    }

    public static int com_bytedance_sysoptimizer_MaliGpuExtIsSupportOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_MaliGpuExtIsSupportOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (MaliGpuExtIsSupportOptimizer.class) {
            MethodCollector.i(11605);
            if (sOptimized) {
                MethodCollector.o(11605);
            } else if (Build.VERSION.SDK_INT != 21) {
                MethodCollector.o(11605);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        if (optimize()) {
                            com_bytedance_sysoptimizer_MaliGpuExtIsSupportOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d("MaliGpuExtIsSupportOpt", "opt for extIsSupport");
                        } else {
                            com_bytedance_sysoptimizer_MaliGpuExtIsSupportOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d("MaliGpuExtIsSupportOpt", "opt failed");
                        }
                        sOptimized = true;
                        MethodCollector.o(11605);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_MaliGpuExtIsSupportOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("MaliGpuExtIsSupportOpt", "UnsatisfiedLinkError", e2);
                        MethodCollector.o(11605);
                        return;
                    } catch (NoSuchMethodError e3) {
                        com_bytedance_sysoptimizer_MaliGpuExtIsSupportOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("MaliGpuExtIsSupportOpt", "NoSuchMethodError", e3);
                    }
                }
                MethodCollector.o(11605);
            }
        }
    }
}
