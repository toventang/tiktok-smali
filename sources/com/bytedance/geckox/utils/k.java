package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public class k implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static volatile k f30129a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f30130b;

    static {
        Covode.recordClassIndex(17499);
    }

    private k() {
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class com.bytedance.geckox.utils.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17500);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("gecko-piecemeal-thread");
                return thread;
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        this.f30130b = g.a(a2.a());
    }

    public static k a() {
        MethodCollector.i(6939);
        if (f30129a == null) {
            synchronized (k.class) {
                try {
                    if (f30129a == null) {
                        f30129a = new k();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6939);
                    throw th;
                }
            }
        }
        k kVar = f30129a;
        MethodCollector.o(6939);
        return kVar;
    }

    public void execute(Runnable runnable) {
        this.f30130b.execute(runnable);
    }
}
