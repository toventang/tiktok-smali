package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MaliMemOptimizer {
    private static volatile boolean hasEnableMaliGLErrorSkip;
    private static volatile boolean hasSetTimeMillsDelayed;

    static {
        Covode.recordClassIndex(26997);
    }

    private static native void enable_gl_error_skip(boolean z);

    private static native void set_time_mills_delayed(int i2, int i3);

    private MaliMemOptimizer() {
    }

    public static synchronized void enableMaliGLErrorSkip(Context context, boolean z) {
        synchronized (MaliMemOptimizer.class) {
            MethodCollector.i(11429);
            if (hasEnableMaliGLErrorSkip) {
                MethodCollector.o(11429);
                return;
            }
            ByteHook.a();
            SysOptimizer.loadOptimizerLibrary(context);
            enable_gl_error_skip(z);
            hasEnableMaliGLErrorSkip = true;
            MethodCollector.o(11429);
        }
    }

    public static synchronized void setTimeMillsDelayed(int i2, int i3, Context context) {
        synchronized (MaliMemOptimizer.class) {
            MethodCollector.i(11283);
            if (hasSetTimeMillsDelayed) {
                MethodCollector.o(11283);
                return;
            }
            ByteHook.a();
            SysOptimizer.loadOptimizerLibrary(context);
            set_time_mills_delayed(i2, i3);
            hasSetTimeMillsDelayed = true;
            MethodCollector.o(11283);
        }
    }
}
