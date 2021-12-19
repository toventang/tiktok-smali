package com.ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f107209a;

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f107210b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private static final int f107211c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f107212d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f107213e;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f107214f;

    /* renamed from: g  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f107215g;

    static {
        MethodCollector.i(40);
        Covode.recordClassIndex(68579);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f107211c = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        f107212d = max;
        int i2 = (max * 2) + 1;
        f107213e = i2;
        AnonymousClass1 r11 = new ThreadFactory() {
            /* class com.ss.android.ugc.aweme.lancet.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f107216a = new AtomicInteger(1);

            /* renamed from: b  reason: collision with root package name */
            private Thread.UncaughtExceptionHandler f107217b = h.f107218a;

            static {
                Covode.recordClassIndex(68580);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Facebook-SDK #" + this.f107216a.getAndIncrement());
                thread.setUncaughtExceptionHandler(this.f107217b);
                return thread;
            }
        };
        f107214f = r11;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f107215g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i2, 10, TimeUnit.SECONDS, linkedBlockingQueue, r11);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f107209a = threadPoolExecutor;
        MethodCollector.o(40);
    }
}
