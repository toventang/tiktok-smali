package com.bytedance.im.core.internal.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ExecutorService f38735a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile ExecutorService f38736b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile ExecutorService f38737c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile ExecutorService f38738d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f38739e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f38740f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static final Object f38741g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f38742h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f38743i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static ThreadFactory f38744j = new ThreadFactory() {
        /* class com.bytedance.im.core.internal.e.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(23109);
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(9524);
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            MethodCollector.o(9524);
            return thread;
        }
    };

    static {
        Covode.recordClassIndex(23108);
    }

    public static Executor b() {
        MethodCollector.i(9695);
        if (f38735a == null) {
            synchronized (f38740f) {
                try {
                    if (f38735a == null) {
                        f38735a = a(f38744j);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9695);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f38735a;
        MethodCollector.o(9695);
        return executorService;
    }

    public static Executor c() {
        MethodCollector.i(9863);
        if (d.a().b().ag) {
            Executor b2 = b();
            MethodCollector.o(9863);
            return b2;
        }
        if (f38736b == null) {
            synchronized (f38741g) {
                try {
                    if (f38736b == null) {
                        f38736b = a(f38744j);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9863);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f38736b;
        MethodCollector.o(9863);
        return executorService;
    }

    public static Executor d() {
        MethodCollector.i(9866);
        if (f38738d == null) {
            synchronized (f38743i) {
                try {
                    if (f38738d == null) {
                        f38738d = a(f38744j);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9866);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f38738d;
        MethodCollector.o(9866);
        return executorService;
    }

    public static synchronized Executor a() {
        ExecutorService executorService;
        synchronized (a.class) {
            MethodCollector.i(9539);
            int i2 = 4;
            if (f38737c == null) {
                ExecutorService executorService2 = d.a().b().L;
                if (executorService2 != null) {
                    f38737c = executorService2;
                    f38739e = true;
                } else {
                    synchronized (f38742h) {
                        try {
                            if (f38737c == null || f38737c.isShutdown()) {
                                int availableProcessors = Runtime.getRuntime().availableProcessors();
                                if (availableProcessors <= 1) {
                                    availableProcessors = 4;
                                }
                                f38737c = a(availableProcessors, f38744j);
                                f38739e = false;
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(9539);
                            throw th;
                        }
                    }
                }
            }
            if (f38737c.isShutdown()) {
                int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                if (availableProcessors2 > 1) {
                    i2 = availableProcessors2;
                }
                f38737c = a(i2, f38744j);
                f38739e = false;
            }
            executorService = f38737c;
            MethodCollector.o(9539);
        }
        return executorService;
    }

    public static String a(Executor executor) {
        if (executor == null) {
            return "unknown";
        }
        if (executor == f38737c) {
            return "default";
        }
        if (executor == f38736b) {
            return "receive";
        }
        if (executor == f38735a) {
            return "send";
        }
        if (executor == f38738d) {
            return "common";
        }
        return "unknown";
    }

    private static ExecutorService a(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return g.a(a2.a());
    }

    private static ExecutorService a(int i2, ThreadFactory threadFactory) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = i2;
        a2.f79178g = threadFactory;
        return g.a(a2.a());
    }
}
