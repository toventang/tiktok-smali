package com.bytedance.common.jato.boost;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.jato.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ThreadBoostManager {
    static {
        Covode.recordClassIndex(15806);
    }

    public static native void maskMemoryInfo();

    private static boolean loadLibrary() {
        return c.a();
    }

    public static void delayMaskMemoryInfo() {
        if (loadLibrary()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.bytedance.common.jato.boost.ThreadBoostManager.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15807);
                }

                public final void run() {
                    new Thread(new Runnable() {
                        /* class com.bytedance.common.jato.boost.ThreadBoostManager.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(15808);
                        }

                        public final void run() {
                            MethodCollector.i(7258);
                            ThreadBoostManager.maskMemoryInfo();
                            MethodCollector.o(7258);
                        }
                    }).start();
                }
            }, 10000);
        }
    }
}
