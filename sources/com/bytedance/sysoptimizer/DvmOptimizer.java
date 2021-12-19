package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DvmOptimizer {
    private static boolean sOptimized;

    static {
        Covode.recordClassIndex(26977);
    }

    private static native void optLinearAllocBuffer(int i2);

    private static native void startHookDvmFunc();

    private DvmOptimizer() {
    }

    public static void optDvmLinearAllocBuffer(Context context) {
        optDvmLinearAllocBuffer(context, 67108864);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT <= 19) {
            return SysOptimizer.loadOptimizerLibrary(context);
        }
        return false;
    }

    public static void hookDvmLinearAllocFunc(Context context) {
        MethodCollector.i(12621);
        if (loadOptimizerOnNeed(context)) {
            startHookDvmFunc();
        }
        MethodCollector.o(12621);
    }

    public static synchronized void optDvmLinearAllocBuffer(Context context, int i2) {
        synchronized (DvmOptimizer.class) {
            MethodCollector.i(12515);
            if (sOptimized) {
                MethodCollector.o(12515);
                return;
            }
            if (loadOptimizerOnNeed(context)) {
                optLinearAllocBuffer(i2);
                sOptimized = true;
            }
            MethodCollector.o(12515);
        }
    }
}
