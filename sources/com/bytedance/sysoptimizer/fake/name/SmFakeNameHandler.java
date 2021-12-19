package com.bytedance.sysoptimizer.fake.name;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.SysOptimizer;

public class SmFakeNameHandler {
    private static String TAG = "SYSOPTIMIZER";
    private static volatile boolean inited;

    public static int com_bytedance_sysoptimizer_fake_name_SmFakeNameHandler_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static native void replace(int i2);

    static {
        Covode.recordClassIndex(27016);
    }

    private static boolean inAndroid5x() {
        if (Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 21) {
            return true;
        }
        return false;
    }

    private static boolean shouldFix() {
        if (!inAndroid5x() || !Build.MODEL.startsWith("SM-")) {
            return false;
        }
        return true;
    }

    public static synchronized void start(Context context) {
        synchronized (SmFakeNameHandler.class) {
            MethodCollector.i(10632);
            if (!shouldFix()) {
                MethodCollector.o(10632);
            } else if (inited) {
                MethodCollector.o(10632);
            } else {
                inited = true;
                if (SysOptimizer.loadOptimizerLibrary(context)) {
                    try {
                        replace(Build.VERSION.SDK_INT);
                        MethodCollector.o(10632);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        com_bytedance_sysoptimizer_fake_name_SmFakeNameHandler_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "UnsatisfiedLinkError", e2);
                        MethodCollector.o(10632);
                        return;
                    } catch (NoSuchMethodError e3) {
                        com_bytedance_sysoptimizer_fake_name_SmFakeNameHandler_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "NoSuchMethodError", e3);
                    }
                }
                MethodCollector.o(10632);
            }
        }
    }
}
