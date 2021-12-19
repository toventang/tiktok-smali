package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class FdSanFatalSwitch {
    private static volatile boolean mFdSanFatalSwitch;

    static {
        Covode.recordClassIndex(26981);
    }

    private static native void openAndroidQFdsan();

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return SysOptimizer.loadOptimizerLibrary(context);
        }
        return false;
    }

    public static synchronized void openAndroidQFdsan(Context context) {
        synchronized (FdSanFatalSwitch.class) {
            MethodCollector.i(13308);
            if (!mFdSanFatalSwitch && loadOptimizerOnNeed(context)) {
                openAndroidQFdsan();
                mFdSanFatalSwitch = true;
            }
            MethodCollector.o(13308);
        }
    }
}
