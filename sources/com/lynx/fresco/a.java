package com.lynx.fresco;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Executor f55466a;

    static {
        Covode.recordClassIndex(34729);
    }

    a() {
    }

    public static Executor a() {
        MethodCollector.i(523);
        if (f55466a == null) {
            synchronized (a.class) {
                try {
                    if (f55466a == null) {
                        f55466a = b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(523);
                    throw th;
                }
            }
        }
        Executor executor = f55466a;
        MethodCollector.o(523);
        return executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.util.concurrent.ThreadPoolExecutor */
    /* JADX WARN: Multi-variable type inference failed */
    private static Executor b() {
        AnonymousClass2 r2;
        MethodCollector.i(530);
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
                /* class com.lynx.fresco.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34730);
                }

                public final Thread newThread(Runnable runnable) {
                    MethodCollector.i(3295);
                    Thread thread = new Thread(runnable, "lynx-fresco-dispatch-thread");
                    thread.setPriority(3);
                    MethodCollector.o(3295);
                    return thread;
                }
            }, new ThreadPoolExecutor.AbortPolicy());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            r2 = threadPoolExecutor;
        } catch (Throwable unused) {
            r2 = new Executor() {
                /* class com.lynx.fresco.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(34731);
                }

                public final void execute(Runnable runnable) {
                    if ("can not execute: ".concat(String.valueOf(runnable)) != null) {
                        runnable.getClass().getName();
                    }
                }
            };
        }
        MethodCollector.o(530);
        return r2;
    }
}
