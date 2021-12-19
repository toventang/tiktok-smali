package com.lynx.tasm.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Executor f56544a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile ExecutorService f56545b;

    static {
        Covode.recordClassIndex(35272);
    }

    private a() {
    }

    public static Executor a() {
        MethodCollector.i(14004);
        if (f56544a == null) {
            synchronized (a.class) {
                try {
                    if (f56544a == null) {
                        f56544a = a("lynx-brief-io-thread", 3, 2);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14004);
                    throw th;
                }
            }
        }
        Executor executor = f56544a;
        MethodCollector.o(14004);
        return executor;
    }

    public static ExecutorService b() {
        MethodCollector.i(14005);
        if (f56545b == null) {
            synchronized (a.class) {
                try {
                    if (f56545b == null) {
                        f56545b = a("lynx-view-op-thread", 10, Runtime.getRuntime().availableProcessors());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14005);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f56545b;
        MethodCollector.o(14005);
        return executorService;
    }

    private static ExecutorService a(final String str, final int i2, int i3) {
        try {
            AnonymousClass1 r1 = new ThreadFactory() {
                /* class com.lynx.tasm.core.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35273);
                }

                public final Thread newThread(Runnable runnable) {
                    MethodCollector.i(14001);
                    Thread thread = new Thread(runnable, str);
                    if (thread.isDaemon()) {
                        thread.setDaemon(false);
                    }
                    thread.setPriority(i2);
                    MethodCollector.o(14001);
                    return thread;
                }
            };
            l.a a2 = l.a(o.FIXED);
            a2.f79174c = i3;
            a2.f79178g = r1;
            return g.a(a2.a());
        } catch (Throwable unused) {
            f56544a = new Executor() {
                /* class com.lynx.tasm.core.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(35274);
                }

                public final void execute(Runnable runnable) {
                }
            };
            return null;
        }
    }
}
