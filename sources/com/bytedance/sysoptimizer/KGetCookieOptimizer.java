package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class KGetCookieOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26988);
    }

    public static int com_bytedance_sysoptimizer_KGetCookieOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_KGetCookieOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (KGetCookieOptimizer.class) {
            MethodCollector.i(12229);
            if (sOptimized) {
                MethodCollector.o(12229);
            } else if (Build.VERSION.SDK_INT != 19) {
                MethodCollector.o(12229);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        if (optimize()) {
                            com_bytedance_sysoptimizer_KGetCookieOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d("KGetCookieOptimizer", "GetCookie opt succ");
                        }
                        sOptimized = true;
                        MethodCollector.o(12229);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_KGetCookieOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("KGetCookieOptimizer", "UnsatisfiedLinkError", e2);
                        MethodCollector.o(12229);
                        return;
                    } catch (NoSuchMethodError e3) {
                        com_bytedance_sysoptimizer_KGetCookieOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("KGetCookieOptimizer", "NoSuchMethodError", e3);
                    }
                }
                MethodCollector.o(12229);
            }
        }
    }
}
