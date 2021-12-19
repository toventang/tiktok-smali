package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DvmGlesOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(26976);
    }

    public static int com_bytedance_sysoptimizer_DvmGlesOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (DvmGlesOptimizer.class) {
            MethodCollector.i(13498);
            if (mOptimized) {
                MethodCollector.o(13498);
            } else if (Build.VERSION.SDK_INT != 19) {
                MethodCollector.o(13498);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        optimize();
                        mOptimized = true;
                        MethodCollector.o(13498);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_DvmGlesOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("DvmGlesOptimizer", "UnsatisfiedLinkError", e2);
                        MethodCollector.o(13498);
                        return;
                    } catch (NoSuchMethodError e3) {
                        com_bytedance_sysoptimizer_DvmGlesOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("DvmGlesOptimizer", "NoSuchMethodError", e3);
                    }
                }
                MethodCollector.o(13498);
            }
        }
    }
}
