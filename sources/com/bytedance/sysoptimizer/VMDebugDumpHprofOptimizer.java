package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class VMDebugDumpHprofOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(27014);
    }

    public static int com_bytedance_sysoptimizer_VMDebugDumpHprofOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_VMDebugDumpHprofOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (VMDebugDumpHprofOptimizer.class) {
            MethodCollector.i(11759);
            if (sOptimized) {
                MethodCollector.o(11759);
                return;
            }
            if ((Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 23) && SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    com_bytedance_sysoptimizer_VMDebugDumpHprofOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_d("VMDebugDump", "opt ret = " + optimize());
                    optimize();
                    sOptimized = true;
                    MethodCollector.o(11759);
                    return;
                } catch (UnsatisfiedLinkError e2) {
                    com_bytedance_sysoptimizer_VMDebugDumpHprofOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("VMDebugDump", "UnsatisfiedLinkError", e2);
                    MethodCollector.o(11759);
                    return;
                } catch (NoSuchMethodError e3) {
                    com_bytedance_sysoptimizer_VMDebugDumpHprofOptimizer_com_ss_android_ugc_aweme_lancet_LogLancet_e("VMDebugDump", "NoSuchMethodError", e3);
                }
            }
            MethodCollector.o(11759);
        }
    }
}
