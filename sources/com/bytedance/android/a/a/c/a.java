package com.bytedance.android.a.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f6610a;

    static {
        Covode.recordClassIndex(3184);
    }

    private static ExecutorService a() {
        MethodCollector.i(3515);
        if (f6610a == null) {
            synchronized (a.class) {
                try {
                    if (f6610a == null) {
                        l.a a2 = l.a(o.FIXED);
                        a2.f79174c = 1;
                        f6610a = g.a(a2.a());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3515);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f6610a;
        MethodCollector.o(3515);
        return executorService;
    }

    public static void a(c cVar) {
        a().execute(cVar);
    }
}
