package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RegexMatcherOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(27005);
    }

    public static int com_bytedance_sysoptimizer_RegexMatcherOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_RegexMatcherOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (RegexMatcherOptimizer.class) {
            MethodCollector.i(10635);
            if (sOptimized) {
                MethodCollector.o(10635);
            } else if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        com_bytedance_sysoptimizer_RegexMatcherOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d("RegexMatcherOptimizer", "opt ret = " + optimize());
                        optimize();
                        sOptimized = true;
                        MethodCollector.o(10635);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_RegexMatcherOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("RegexMatcherOptimizer", "UnsatisfiedLinkError", e2);
                        MethodCollector.o(10635);
                        return;
                    } catch (NoSuchMethodError e3) {
                        com_bytedance_sysoptimizer_RegexMatcherOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("RegexMatcherOptimizer", "NoSuchMethodError", e3);
                    }
                }
                MethodCollector.o(10635);
            } else {
                MethodCollector.o(10635);
            }
        }
    }
}
