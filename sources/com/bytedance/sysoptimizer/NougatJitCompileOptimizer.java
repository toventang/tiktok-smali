package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NougatJitCompileOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(27000);
    }

    public static int com_bytedance_sysoptimizer_NougatJitCompileOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native void optimize();

    public static synchronized void fix(Context context) {
        synchronized (NougatJitCompileOptimizer.class) {
            MethodCollector.i(12074);
            if (sOptimized) {
                MethodCollector.o(12074);
            } else if (Build.VERSION.SDK_INT != 24) {
                MethodCollector.o(12074);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        optimize();
                        sOptimized = true;
                        MethodCollector.o(12074);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_NougatJitCompileOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("NJitCompileOptimizer", "UnsatisfiedLinkError", e2);
                        MethodCollector.o(12074);
                        return;
                    } catch (NoSuchMethodError e3) {
                        com_bytedance_sysoptimizer_NougatJitCompileOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("NJitCompileOptimizer", "NoSuchMethodError", e3);
                    }
                }
                MethodCollector.o(12074);
            }
        }
    }
}
