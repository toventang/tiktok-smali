package com.ss.ttvideoengine.s;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f153255a;

    /* renamed from: b  reason: collision with root package name */
    private static Deque<a> f153256b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private static Deque<a> f153257c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f153258d = true;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f153259a;

        static {
            Covode.recordClassIndex(101776);
        }

        public final void run() {
            this.f153259a.run();
            b.a(this);
        }

        public a(Runnable runnable) {
            this.f153259a = runnable;
        }
    }

    static {
        Covode.recordClassIndex(101775);
    }

    private static ThreadPoolExecutor a() {
        MethodCollector.i(10600);
        if (f153255a == null) {
            synchronized (b.class) {
                try {
                    if (f153255a == null) {
                        if (f153258d) {
                            j.a("EngineThreadPool", "mEnableThreadPoolOptimize true");
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
                            f153255a = threadPoolExecutor;
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } else {
                            f153255a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10600);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor2 = f153255a;
        MethodCollector.o(10600);
        return threadPoolExecutor2;
    }

    public static synchronized void a(a aVar) {
        synchronized (b.class) {
            MethodCollector.i(10920);
            f153257c.remove(aVar);
            if (f153256b.size() > 0) {
                Iterator<a> it = f153256b.iterator();
                if (it.hasNext()) {
                    a next = it.next();
                    it.remove();
                    f153257c.add(next);
                    f153255a.execute(next);
                }
            }
            MethodCollector.o(10920);
        }
    }

    public static synchronized Future a(Runnable runnable) {
        synchronized (b.class) {
            MethodCollector.i(10751);
            if (f153255a == null) {
                a();
            }
            try {
                StringBuilder sb = new StringBuilder("addExecuteTask,pool size:");
                if (f153255a == null) {
                    a();
                }
                j.a("EngineThreadPool", sb.append(f153255a.getPoolSize()).append(", active:").append(f153255a.getActiveCount()).toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (f153258d) {
                Future<?> submit = f153255a.submit(runnable);
                MethodCollector.o(10751);
                return submit;
            }
            j.a("EngineThreadPool", "running:" + f153257c.size() + ", ready:" + f153256b.size());
            a aVar = new a(runnable);
            if (f153257c.size() >= 5) {
                f153256b.add(aVar);
                MethodCollector.o(10751);
                return null;
            }
            f153257c.add(aVar);
            Future<?> submit2 = f153255a.submit(aVar);
            MethodCollector.o(10751);
            return submit2;
        }
    }
}
