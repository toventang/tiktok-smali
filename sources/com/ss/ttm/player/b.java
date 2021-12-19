package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ExecutorService f152030a;

    /* renamed from: b  reason: collision with root package name */
    private static ThreadPoolExecutor f152031b;

    static {
        Covode.recordClassIndex(101329);
    }

    private static synchronized ExecutorService a() {
        ExecutorService executorService;
        synchronized (b.class) {
            MethodCollector.i(2156);
            if (f152030a != null) {
                executorService = f152030a;
            } else {
                if (f152031b == null) {
                    f152031b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                }
                executorService = f152031b;
            }
            MethodCollector.o(2156);
        }
        return executorService;
    }

    public static synchronized Future<String> a(Callable<String> callable) {
        Future<String> submit;
        synchronized (b.class) {
            MethodCollector.i(2158);
            submit = a().submit(callable);
            MethodCollector.o(2158);
        }
        return submit;
    }

    public static synchronized void a(Runnable runnable) {
        synchronized (b.class) {
            MethodCollector.i(2157);
            a().submit(runnable);
            MethodCollector.o(2157);
        }
    }

    public static synchronized void a(ExecutorService executorService) {
        synchronized (b.class) {
            MethodCollector.i(2152);
            f152030a = executorService;
            MethodCollector.o(2152);
        }
    }
}
