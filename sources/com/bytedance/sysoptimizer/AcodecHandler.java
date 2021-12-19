package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AcodecHandler {
    private static volatile boolean mInit;

    static {
        Covode.recordClassIndex(26969);
    }

    public static int com_bytedance_sysoptimizer_AcodecHandler_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    private static native void fixAcodecMessage();

    private static boolean inAndroid4x() {
        if (Build.VERSION.SDK_INT <= 20) {
            return true;
        }
        return false;
    }

    private static boolean inAndroid5x() {
        if (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
            return true;
        }
        return false;
    }

    public static synchronized void fixAcodecMessage(Context context) {
        synchronized (AcodecHandler.class) {
            MethodCollector.i(12627);
            if ((inAndroid4x() || inAndroid5x()) && SysOptimizer.loadOptimizerLibrary(context)) {
                com_bytedance_sysoptimizer_AcodecHandler_com_ss_android_ugc_aweme_lancet_LogLancet_i("AcodecHandler", "handlerAcodecMessage");
                ByteHook.a();
                fixAcodecMessage();
            }
            MethodCollector.o(12627);
        }
    }
}
