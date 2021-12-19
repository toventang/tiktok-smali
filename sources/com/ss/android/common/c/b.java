package com.ss.android.common.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f59365a;

    /* renamed from: b  reason: collision with root package name */
    public static long f59366b = 100;

    /* renamed from: c  reason: collision with root package name */
    public static long f59367c;

    static {
        Covode.recordClassIndex(36652);
    }

    public static void a() {
        MethodCollector.i(5674);
        if (f59365a) {
            try {
                if (f59367c < 100) {
                    Thread.sleep(f59366b);
                } else {
                    f59365a = false;
                }
                f59367c++;
                MethodCollector.o(5674);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                MethodCollector.o(5674);
            }
        } else {
            f59367c = 0;
            MethodCollector.o(5674);
        }
    }
}
