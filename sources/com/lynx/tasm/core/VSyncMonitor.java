package com.lynx.tasm.core;

import android.view.Choreographer;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

public class VSyncMonitor {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<WindowManager> f56542a;

    static {
        Covode.recordClassIndex(35270);
    }

    public static native void nativeOnVSync(long j2, long j3, long j4);

    public static void request(final long j2) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
            /* class com.lynx.tasm.core.VSyncMonitor.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35271);
            }

            public final void doFrame(long j2) {
                long j3;
                MethodCollector.i(13857);
                if (VSyncMonitor.f56542a.get() != null) {
                    double refreshRate = (double) VSyncMonitor.f56542a.get().getDefaultDisplay().getRefreshRate();
                    Double.isNaN(refreshRate);
                    j3 = (long) (1.0E9d / refreshRate);
                } else {
                    j3 = 16666666;
                }
                VSyncMonitor.nativeOnVSync(j2, j2, j2 + j3);
                MethodCollector.o(13857);
            }
        });
    }
}
