package com.bytedance.nita.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.a.b.c;
import com.a.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static ConcurrentHashMap<String, d> f41649a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f41650b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static Handler f41651c;

    /* renamed from: d  reason: collision with root package name */
    private static HandlerThread f41652d;

    /* renamed from: e  reason: collision with root package name */
    private static d f41653e = new d();

    /* renamed from: f  reason: collision with root package name */
    private static Executor f41654f;

    private a() {
    }

    /* renamed from: com.bytedance.nita.e.a$a  reason: collision with other inner class name */
    public static final class ThreadFactoryC1019a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public int f41655a = -20;

        /* renamed from: b  reason: collision with root package name */
        private AtomicInteger f41656b = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(25489);
        }

        /* renamed from: com.bytedance.nita.e.a$a$a  reason: collision with other inner class name */
        static final class RunnableC1020a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ThreadFactoryC1019a f41657a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Runnable f41658b;

            static {
                Covode.recordClassIndex(25490);
            }

            RunnableC1020a(ThreadFactoryC1019a aVar, Runnable runnable) {
                this.f41657a = aVar;
                this.f41658b = runnable;
            }

            public final void run() {
                d dVar = c.f4932b;
                l.a((Object) dVar, "");
                if (dVar.f4938f) {
                    Process.setThreadPriority(this.f41657a.f41655a);
                }
                this.f41658b.run();
            }
        }

        public final Thread newThread(Runnable runnable) {
            l.c(runnable, "");
            String str = "AsyncInflate #" + this.f41656b.getAndIncrement();
            Thread thread = new Thread(new RunnableC1020a(this, runnable), str);
            a.f41649a.put(str, new d());
            return thread;
        }
    }

    static {
        Covode.recordClassIndex(25488);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f41659a = new b();

        static {
            Covode.recordClassIndex(25491);
        }

        b() {
        }

        public final void run() {
            try {
                Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                l.a((Object) declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj != null) {
                    ((ThreadLocal) obj).set(Looper.getMainLooper());
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            }
        }
    }

    private Handler b() {
        MethodCollector.i(7912);
        if (f41651c == null) {
            synchronized (this) {
                try {
                    if (f41651c == null) {
                        HandlerThread handlerThread = new HandlerThread("NitaMainThread");
                        f41652d = handlerThread;
                        handlerThread.start();
                        HandlerThread handlerThread2 = f41652d;
                        if (handlerThread2 == null) {
                            l.a();
                        }
                        Handler handler = new Handler(handlerThread2.getLooper());
                        f41651c = handler;
                        handler.postAtFrontOfQueue(b.f41659a);
                        d dVar = c.f4932b;
                        l.a((Object) dVar, "");
                        if (dVar.f4938f) {
                            HandlerThread handlerThread3 = f41652d;
                            if (handlerThread3 == null) {
                                l.a();
                            }
                            Process.setThreadPriority(handlerThread3.getThreadId(), -20);
                        }
                        f41649a.put("NitaMainThread", f41653e);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7912);
                    throw th;
                }
            }
        }
        Handler handler2 = f41651c;
        if (handler2 == null) {
            l.a();
        }
        MethodCollector.o(7912);
        return handler2;
    }

    public final synchronized Executor a() {
        Executor executor;
        MethodCollector.i(7918);
        if (f41654f == null) {
            ThreadFactoryC1019a aVar = new ThreadFactoryC1019a();
            d dVar = c.f4932b;
            l.a((Object) dVar, "");
            int i2 = dVar.f4934b;
            d dVar2 = c.f4932b;
            l.a((Object) dVar2, "");
            f41654f = new ThreadPoolExecutor(i2, dVar2.f4934b, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(10000), aVar, new ThreadPoolExecutor.DiscardOldestPolicy());
        }
        executor = f41654f;
        if (executor == null) {
            l.a();
        }
        MethodCollector.o(7918);
        return executor;
    }

    public static d a(Thread thread) {
        l.c(thread, "");
        d dVar = f41649a.get(thread.getName());
        if (dVar == null) {
            l.a();
        }
        return dVar;
    }

    public static Handler a(a aVar) {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.ss.android.ugc.aweme.logger.a.c().a("method_nita_executor_inflate_handler_duration", false);
        }
        Handler b2 = aVar.b();
        if (z) {
            com.ss.android.ugc.aweme.logger.a.c().b("method_nita_executor_inflate_handler_duration", false);
        }
        return b2;
    }
}
