package com.ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.o;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static volatile o f60646a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile o f60647b;

    static {
        Covode.recordClassIndex(37448);
    }

    public static o a(boolean z) {
        MethodCollector.i(13700);
        if (!z || !c.E()) {
            if (f60646a == null) {
                synchronized (l.class) {
                    try {
                        if (f60646a == null) {
                            f60646a = new p();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(13700);
                        throw th;
                    }
                }
            }
            o oVar = f60646a;
            MethodCollector.o(13700);
            return oVar;
        }
        if (f60647b == null) {
            synchronized (l.class) {
                try {
                    if (f60647b == null) {
                        f60647b = c.f60427b.b();
                    }
                } catch (Throwable th2) {
                    MethodCollector.o(13700);
                    throw th2;
                }
            }
        }
        o oVar2 = f60647b;
        MethodCollector.o(13700);
        return oVar2;
    }
}
