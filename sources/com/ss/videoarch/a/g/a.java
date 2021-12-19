package com.ss.videoarch.a.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f154337a;

    /* renamed from: b  reason: collision with root package name */
    private static Deque<RunnableC4106a> f154338b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private static Deque<RunnableC4106a> f154339c = new ArrayDeque();

    /* renamed from: com.ss.videoarch.a.g.a$a  reason: collision with other inner class name */
    public static class RunnableC4106a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f154353a;

        static {
            Covode.recordClassIndex(102900);
        }

        public final void run() {
            this.f154353a.run();
            a.a(this);
        }

        public RunnableC4106a(Runnable runnable) {
            this.f154353a = runnable;
        }
    }

    static {
        Covode.recordClassIndex(102899);
    }

    private static ThreadPoolExecutor a() {
        MethodCollector.i(1880);
        if (f154337a == null) {
            synchronized (a.class) {
                try {
                    if (f154337a == null) {
                        f154337a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1880);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = f154337a;
        MethodCollector.o(1880);
        return threadPoolExecutor;
    }

    public static synchronized Future a(Runnable runnable) {
        synchronized (a.class) {
            MethodCollector.i(1887);
            if (f154337a == null) {
                a();
            }
            if (f154337a == null) {
                a();
            }
            f154337a.getPoolSize();
            RunnableC4106a aVar = new RunnableC4106a(runnable);
            if (f154339c.size() >= 5) {
                f154338b.add(aVar);
                MethodCollector.o(1887);
                return null;
            }
            f154339c.add(aVar);
            Future<?> submit = f154337a.submit(aVar);
            MethodCollector.o(1887);
            return submit;
        }
    }

    public static synchronized void a(RunnableC4106a aVar) {
        synchronized (a.class) {
            MethodCollector.i(1894);
            f154339c.remove(aVar);
            if (f154338b.size() > 0) {
                Iterator<RunnableC4106a> it = f154338b.iterator();
                if (it.hasNext()) {
                    RunnableC4106a next = it.next();
                    it.remove();
                    f154339c.add(next);
                    f154337a.execute(next);
                }
            }
            MethodCollector.o(1894);
        }
    }
}
