package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ONativeCryptoCRLOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(27001);
    }

    public static int com_bytedance_sysoptimizer_ONativeCryptoCRLOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_ONativeCryptoCRLOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (ONativeCryptoCRLOptimizer.class) {
            MethodCollector.i(11603);
            if (sOptimized) {
                MethodCollector.o(11603);
            } else if (Build.VERSION.SDK_INT != 27) {
                MethodCollector.o(11603);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        if (optimize()) {
                            com_bytedance_sysoptimizer_ONativeCryptoCRLOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("NativeCrypt", "hook succ");
                        } else {
                            com_bytedance_sysoptimizer_ONativeCryptoCRLOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("NativeCrypt", "hook fail");
                        }
                        sOptimized = true;
                        MethodCollector.o(11603);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_ONativeCryptoCRLOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("NativeCrypt", "UnsatisfiedLinkError", e2);
                        MethodCollector.o(11603);
                        return;
                    } catch (NoSuchMethodError e3) {
                        com_bytedance_sysoptimizer_ONativeCryptoCRLOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("NativeCrypt", "NoSuchMethodError", e3);
                    }
                }
                MethodCollector.o(11603);
            }
        }
    }
}
