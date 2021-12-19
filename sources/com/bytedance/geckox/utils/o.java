package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.policy.c.a;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class o {

    /* renamed from: c  reason: collision with root package name */
    private static o f30134c;

    /* renamed from: a  reason: collision with root package name */
    public a f30135a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f30136b;

    static {
        Covode.recordClassIndex(17507);
    }

    private o() {
    }

    public final Executor b() {
        if (this.f30136b == null) {
            this.f30136b = a(new ThreadFactory() {
                /* class com.bytedance.geckox.utils.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17508);
                }

                public final Thread newThread(Runnable runnable) {
                    MethodCollector.i(10363);
                    Thread thread = new Thread(runnable);
                    thread.setName("gecko-check-update-thread");
                    thread.setPriority(3);
                    MethodCollector.o(10363);
                    return thread;
                }
            });
        }
        return this.f30136b;
    }

    public static o a() {
        MethodCollector.i(6996);
        if (f30134c == null) {
            synchronized (o.class) {
                try {
                    if (f30134c == null) {
                        f30134c = new o();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6996);
                    throw th;
                }
            }
        }
        o oVar = f30134c;
        MethodCollector.o(6996);
        return oVar;
    }

    public static ExecutorService a(ThreadFactory threadFactory) {
        l.a a2 = l.a(com.ss.android.ugc.aweme.cw.o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return g.a(a2.a());
    }
}
