package com.bytedance.common.utility.b;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f26891a;

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f26892b;

    /* renamed from: c  reason: collision with root package name */
    public static ScheduledExecutorService f26893c;

    /* renamed from: d  reason: collision with root package name */
    public static ExecutorService f26894d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f26895e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f26896f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f26897g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f26898h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f26899i;

    /* renamed from: j  reason: collision with root package name */
    public static final int f26900j;

    /* renamed from: k  reason: collision with root package name */
    private static ExecutorService f26901k;

    /* renamed from: l  reason: collision with root package name */
    private static ExecutorService f26902l;

    /* renamed from: m  reason: collision with root package name */
    private static final b f26903m;
    private static final b n;
    private static final b o;
    private static final b p;
    private static final b q;
    private static final a r;
    private static final BlockingQueue<Runnable> s;
    private static final BlockingQueue<Runnable> t;
    private static final BlockingQueue<Runnable> u;
    private static final RejectedExecutionHandler v;

    public static ExecutorService a() {
        return f26891a;
    }

    public static ExecutorService b() {
        return f26892b;
    }

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f26904a = new AtomicInteger(1);

        /* renamed from: b  reason: collision with root package name */
        private final ThreadGroup f26905b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicInteger f26906c = new AtomicInteger(1);

        /* renamed from: d  reason: collision with root package name */
        private final String f26907d;

        static {
            Covode.recordClassIndex(15879);
        }

        public final Thread newThread(Runnable runnable) {
            AnonymousClass1 r3 = new Thread(this.f26905b, runnable, this.f26907d + this.f26906c.getAndIncrement()) {
                /* class com.bytedance.common.utility.b.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15880);
                }

                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            if (r3.isDaemon()) {
                r3.setDaemon(false);
            }
            return r3;
        }

        a(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f26905b = threadGroup;
            this.f26907d = str + "-" + f26904a.getAndIncrement() + "-Thread-";
        }
    }

    static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f26909a = new AtomicInteger(1);

        /* renamed from: b  reason: collision with root package name */
        private final ThreadGroup f26910b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicInteger f26911c = new AtomicInteger(1);

        /* renamed from: d  reason: collision with root package name */
        private final String f26912d;

        static {
            Covode.recordClassIndex(15881);
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(1825);
            Thread thread = new Thread(this.f26910b, runnable, this.f26912d + this.f26911c.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            MethodCollector.o(1825);
            return thread;
        }

        b(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                this.f26910b = securityManager.getThreadGroup();
            } else {
                this.f26910b = Thread.currentThread().getThreadGroup();
            }
            this.f26912d = str + "-" + f26909a.getAndIncrement() + "-Thread-";
        }
    }

    static {
        Covode.recordClassIndex(15877);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f26895e = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        f26896f = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f26897g = max;
        int i2 = (max * 2) + 1;
        f26898h = i2;
        int max2 = Math.max(2, Math.min(availableProcessors - 1, 3));
        f26899i = max2;
        int i3 = (availableProcessors * 2) + 1;
        f26900j = i3;
        b bVar = new b("TTDefaultExecutors");
        f26903m = bVar;
        b bVar2 = new b("TTCpuExecutors");
        n = bVar2;
        b bVar3 = new b("TTScheduledExecutors");
        o = bVar3;
        b bVar4 = new b("TTDownLoadExecutors");
        p = bVar4;
        b bVar5 = new b("TTSerialExecutors");
        q = bVar5;
        a aVar = new a("TTBackgroundExecutors");
        r = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        s = linkedBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        t = linkedBlockingQueue2;
        LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
        u = linkedBlockingQueue3;
        AnonymousClass1 r13 = new RejectedExecutionHandler() {
            /* class com.bytedance.common.utility.b.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15878);
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Executors.newCachedThreadPool().execute(runnable);
            }
        };
        v = r13;
        d dVar = new d(max, i2, TimeUnit.SECONDS, linkedBlockingQueue, bVar, r13);
        f26891a = dVar;
        dVar.allowCoreThreadTimeOut(true);
        d dVar2 = new d(max2, i3, TimeUnit.SECONDS, linkedBlockingQueue2, bVar2, r13);
        f26901k = dVar2;
        dVar2.allowCoreThreadTimeOut(true);
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 3;
        a2.f79178g = bVar3;
        f26893c = (ScheduledExecutorService) g.a(a2.a());
        d dVar3 = new d(2, 2, TimeUnit.SECONDS, linkedBlockingQueue3, bVar4, r13);
        f26892b = dVar3;
        dVar3.allowCoreThreadTimeOut(true);
        d dVar4 = new d(1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), bVar5);
        f26902l = dVar4;
        dVar4.allowCoreThreadTimeOut(true);
        d dVar5 = new d(0, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        f26894d = dVar5;
        dVar5.allowCoreThreadTimeOut(true);
    }
}
