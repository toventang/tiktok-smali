package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class WmOverFlowOptimizer {
    private static boolean mOptimized;

    static {
        Covode.recordClassIndex(27015);
    }

    public static int com_bytedance_sysoptimizer_WmOverFlowOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (WmOverFlowOptimizer.class) {
            MethodCollector.i(11108);
            if (mOptimized) {
                MethodCollector.o(11108);
            } else if (Build.VERSION.SDK_INT <= 23 || Build.VERSION.SDK_INT > 25) {
                MethodCollector.o(11108);
            } else {
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        optimize();
                        mOptimized = true;
                        MethodCollector.o(11108);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_WmOverFlowOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("WmOverFlowOptimizer", "UnsatisfiedLinkError", e2);
                        MethodCollector.o(11108);
                        return;
                    } catch (NoSuchMethodError e3) {
                        com_bytedance_sysoptimizer_WmOverFlowOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("WmOverFlowOptimizer", "NoSuchMethodError", e3);
                    }
                }
                MethodCollector.o(11108);
            }
        }
    }
}
