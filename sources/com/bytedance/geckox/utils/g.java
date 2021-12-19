package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public class g implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f30124a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f30125b;

    static {
        Covode.recordClassIndex(17494);
    }

    private g() {
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class com.bytedance.geckox.utils.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17495);
            }

            public final Thread newThread(Runnable runnable) {
                MethodCollector.i(8955);
                Thread thread = new Thread(runnable);
                thread.setName("gecko-io-thread");
                thread.setPriority(3);
                MethodCollector.o(8955);
                return thread;
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        this.f30125b = com.ss.android.ugc.aweme.cw.g.a(a2.a());
    }

    public static g a() {
        MethodCollector.i(6947);
        if (f30124a == null) {
            synchronized (g.class) {
                try {
                    if (f30124a == null) {
                        f30124a = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6947);
                    throw th;
                }
            }
        }
        g gVar = f30124a;
        MethodCollector.o(6947);
        return gVar;
    }

    public void execute(Runnable runnable) {
        this.f30125b.execute(runnable);
    }
}
