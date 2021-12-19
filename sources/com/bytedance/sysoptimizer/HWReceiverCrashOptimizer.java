package com.bytedance.sysoptimizer;

import android.content.ContextWrapper;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;

public class HWReceiverCrashOptimizer {
    private static volatile boolean sHasFix;

    static {
        Covode.recordClassIndex(26982);
    }

    public static void fix(ContextWrapper contextWrapper) {
        MethodCollector.i(13310);
        if (Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 23) {
            synchronized (HWReceiverCrashOptimizer.class) {
                try {
                    if (!sHasFix) {
                        sHasFix = true;
                        try {
                            Field declaredField = Class.forName("android.app.ContextImpl").getDeclaredField("mPackageInfo");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(contextWrapper.getBaseContext());
                            Field declaredField2 = Class.forName("android.app.LoadedApk").getDeclaredField("mReceiverResource");
                            declaredField2.setAccessible(true);
                            declaredField2.set(obj, null);
                        } catch (Exception unused) {
                        }
                        MethodCollector.o(13310);
                    }
                } finally {
                    MethodCollector.o(13310);
                }
            }
        } else {
            MethodCollector.o(13310);
        }
    }
}
