package com.ss.android.ugc.aweme.cw;

import android.os.Build;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class a extends ThreadPoolExecutor {

    /* renamed from: b  reason: collision with root package name */
    private static volatile Field f79096b;

    /* renamed from: a  reason: collision with root package name */
    public o f79097a;

    static {
        Covode.recordClassIndex(49108);
    }

    public void shutdown() {
        MethodCollector.i(5420);
        if (g.a(this)) {
            MethodCollector.o(5420);
            return;
        }
        super.shutdown();
        MethodCollector.o(5420);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        MethodCollector.i(5421);
        if (g.a(this)) {
            List<Runnable> emptyList = Collections.emptyList();
            MethodCollector.o(5421);
            return emptyList;
        }
        List<Runnable> shutdownNow = super.shutdownNow();
        MethodCollector.o(5421);
        return shutdownNow;
    }

    private static void a() {
        MethodCollector.i(5456);
        try {
            if (f79096b == null) {
                synchronized (a.class) {
                    try {
                        if (f79096b == null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                f79096b = Thread.class.getDeclaredField("threadLocals");
                            } else {
                                f79096b = Thread.class.getDeclaredField("localValues");
                            }
                            f79096b.setAccessible(true);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(5456);
                        throw th;
                    }
                }
            }
            f79096b.set(Thread.currentThread(), null);
            MethodCollector.o(5456);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(5456);
        }
    }

    public void execute(Runnable runnable) {
        MethodCollector.i(5417);
        if (g.f79144a.f79152b.contains(this.f79097a)) {
            super.execute(new b(runnable, this));
            MethodCollector.o(5417);
            return;
        }
        super.execute(runnable);
        MethodCollector.o(5417);
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        try {
            if (Looper.myLooper() != null) {
                a();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    a(o oVar, int i2, int i3, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i2, i3, 30, timeUnit, blockingQueue, threadFactory);
        this.f79097a = oVar;
    }

    a(o oVar, int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i2, i3, j2, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f79097a = oVar;
    }
}
