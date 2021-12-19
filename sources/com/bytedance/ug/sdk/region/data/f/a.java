package com.bytedance.ug.sdk.region.data.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f45790a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f45791b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f45792c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f45793d;

    /* renamed from: e  reason: collision with root package name */
    private static ExecutorService f45794e;

    /* renamed from: f  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f45795f;

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadFactoryC1126a f45796g;

    /* renamed from: h  reason: collision with root package name */
    private static final RejectedExecutionHandler f45797h;

    /* renamed from: com.bytedance.ug.sdk.region.data.f.a$a  reason: collision with other inner class name */
    static class ThreadFactoryC1126a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f45798a = new AtomicInteger(1);

        /* renamed from: b  reason: collision with root package name */
        private final ThreadGroup f45799b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicInteger f45800c = new AtomicInteger(1);

        /* renamed from: d  reason: collision with root package name */
        private final String f45801d;

        static {
            Covode.recordClassIndex(27898);
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(11327);
            Thread thread = new Thread(this.f45799b, runnable, this.f45801d + this.f45800c.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            MethodCollector.o(11327);
            return thread;
        }

        ThreadFactoryC1126a(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f45799b = threadGroup;
            this.f45801d = str + "-" + f45798a.getAndIncrement() + "-Thread-";
        }
    }

    static {
        MethodCollector.i(11325);
        Covode.recordClassIndex(27896);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f45790a = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        f45791b = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f45792c = max;
        int i2 = (max * 2) + 1;
        f45793d = i2;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f45795f = linkedBlockingQueue;
        ThreadFactoryC1126a aVar = new ThreadFactoryC1126a("TTDefaultExecutors");
        f45796g = aVar;
        AnonymousClass1 r12 = new RejectedExecutionHandler() {
            /* class com.bytedance.ug.sdk.region.data.f.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(27897);
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Executors.newCachedThreadPool().execute(runnable);
            }
        };
        f45797h = r12;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i2, 30, TimeUnit.SECONDS, linkedBlockingQueue, aVar, r12);
        f45794e = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        MethodCollector.o(11325);
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            f45794e.submit(runnable);
        }
    }
}
