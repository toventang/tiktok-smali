package com.bytedance.android.livesdk.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class g implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13568a = g.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private ArrayBlockingQueue<Runnable> f13569b;

    /* renamed from: c  reason: collision with root package name */
    private c f13570c;

    /* renamed from: d  reason: collision with root package name */
    private b f13571d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f13572a;

        /* renamed from: b  reason: collision with root package name */
        c f13573b;

        /* renamed from: c  reason: collision with root package name */
        String f13574c;

        static {
            Covode.recordClassIndex(7517);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(7519);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(7516);
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13575a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayBlockingQueue<Runnable> f13576b;

        static {
            Covode.recordClassIndex(7518);
        }

        public final void run() {
            while (!this.f13575a) {
                try {
                    this.f13576b.take().run();
                } catch (InterruptedException e2) {
                    com.bytedance.android.live.core.c.a.a(6, g.f13568a, e2.getMessage());
                }
            }
        }

        private b(ArrayBlockingQueue<Runnable> arrayBlockingQueue) {
            this.f13576b = arrayBlockingQueue;
        }

        /* synthetic */ b(ArrayBlockingQueue arrayBlockingQueue, byte b2) {
            this(arrayBlockingQueue);
        }
    }

    static class d implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f13577a;

        /* renamed from: b  reason: collision with root package name */
        private AtomicInteger f13578b;

        static {
            Covode.recordClassIndex(7520);
        }

        private d(String str) {
            this.f13578b = new AtomicInteger();
            this.f13577a = str;
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(3412);
            Thread thread = new Thread(runnable, this.f13577a + "-" + this.f13578b.incrementAndGet());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.o(3412);
            return thread;
        }

        /* synthetic */ d(String str, byte b2) {
            this(str);
        }
    }

    public void execute(Runnable runnable) {
        c cVar;
        if (!this.f13569b.offer(runnable) && (cVar = this.f13570c) != null) {
            cVar.a();
        }
    }

    private g(int i2, ThreadFactory threadFactory, c cVar) {
        this.f13569b = new ArrayBlockingQueue<>(i2);
        b bVar = new b(this.f13569b, (byte) 0);
        this.f13571d = bVar;
        threadFactory.newThread(bVar).start();
        this.f13570c = cVar;
    }

    /* synthetic */ g(int i2, ThreadFactory threadFactory, c cVar, byte b2) {
        this(i2, threadFactory, cVar);
    }
}
