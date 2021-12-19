package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f48439a;

    static {
        Covode.recordClassIndex(29202);
    }

    public static synchronized void a() {
        synchronized (b.class) {
            MethodCollector.i(9438);
            if (!f48439a) {
                com.facebook.imageutils.b.a("static-webp");
                f48439a = true;
            }
            MethodCollector.o(9438);
        }
    }
}
