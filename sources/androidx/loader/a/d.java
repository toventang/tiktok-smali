package androidx.loader.a;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d<Params, Progress, Result> {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadFactory f3591a;

    /* renamed from: b  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f3592b;

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f3593c;

    /* renamed from: h  reason: collision with root package name */
    private static b f3594h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Executor f3595i;

    /* renamed from: d  reason: collision with root package name */
    final FutureTask<Result> f3596d;

    /* renamed from: e  reason: collision with root package name */
    public volatile c f3597e = c.PENDING;

    /* renamed from: f  reason: collision with root package name */
    final AtomicBoolean f3598f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    final AtomicBoolean f3599g = new AtomicBoolean();

    /* renamed from: j  reason: collision with root package name */
    private final AbstractCallableC0051d<Params, Result> f3600j;

    /* access modifiers changed from: protected */
    public abstract Result a();

    /* access modifiers changed from: protected */
    public void a(Result result) {
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.d$d  reason: collision with other inner class name */
    public static abstract class AbstractCallableC0051d<Params, Result> implements Callable<Result> {

        /* renamed from: b  reason: collision with root package name */
        Params[] f3608b;

        static {
            Covode.recordClassIndex(1367);
        }

        AbstractCallableC0051d() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends Handler {
        static {
            Covode.recordClassIndex(1365);
        }

        b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            if (message.what == 1) {
                aVar.f3605a.e(aVar.f3606b[0]);
            }
        }
    }

    private static Handler b() {
        b bVar;
        synchronized (d.class) {
            if (f3594h == null) {
                f3594h = new b();
            }
            bVar = f3594h;
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.d$4  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3604a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 1363(0x553, float:1.91E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.loader.a.d$c[] r0 = androidx.loader.a.d.c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                androidx.loader.a.d.AnonymousClass4.f3604a = r2
                androidx.loader.a.d$c r0 = androidx.loader.a.d.c.RUNNING     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = androidx.loader.a.d.AnonymousClass4.f3604a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.loader.a.d$c r0 = androidx.loader.a.d.c.FINISHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.a.d.AnonymousClass4.<clinit>():void");
        }
    }

    public enum c {
        PENDING,
        RUNNING,
        FINISHED;

        static {
            Covode.recordClassIndex(1366);
        }
    }

    static {
        Covode.recordClassIndex(1359);
        AnonymousClass1 r7 = new ThreadFactory() {
            /* class androidx.loader.a.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f3601a = new AtomicInteger(1);

            static {
                Covode.recordClassIndex(1360);
            }

            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ModernAsyncTask #" + this.f3601a.getAndIncrement());
            }
        };
        f3591a = r7;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f3592b = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, r7);
        f3593c = threadPoolExecutor;
        f3595i = threadPoolExecutor;
    }

    d() {
        AnonymousClass2 r1 = new AbstractCallableC0051d<Params, Result>() {
            /* class androidx.loader.a.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1361);
            }

            @Override // java.util.concurrent.Callable
            public final Result call() {
                d.this.f3599g.set(true);
                Result result = null;
                try {
                    Process.setThreadPriority(10);
                    result = (Result) d.this.a();
                    Binder.flushPendingCommands();
                    d.this.d(result);
                    return result;
                } catch (Throwable th) {
                    d.this.d(result);
                    throw th;
                }
            }
        };
        this.f3600j = r1;
        this.f3596d = new FutureTask<Result>(r1) {
            /* class androidx.loader.a.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1362);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: androidx.loader.a.d */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: protected */
            public final void done() {
                try {
                    d.this.c(get());
                } catch (InterruptedException unused) {
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (CancellationException unused2) {
                    d.this.c(null);
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final void c(Result result) {
        if (!this.f3599g.get()) {
            d(result);
        }
    }

    /* access modifiers changed from: package-private */
    public final Result d(Result result) {
        b().obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: package-private */
    public final void e(Result result) {
        if (this.f3598f.get()) {
            b(result);
        } else {
            a((Object) result);
        }
        this.f3597e = c.FINISHED;
    }

    public final d<Params, Progress, Result> a(Executor executor) {
        if (this.f3597e != c.PENDING) {
            int i2 = AnonymousClass4.f3604a[this.f3597e.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i2 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f3597e = c.RUNNING;
            this.f3600j.f3608b = null;
            executor.execute(this.f3596d);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        final d f3605a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f3606b;

        static {
            Covode.recordClassIndex(1364);
        }

        a(d dVar, Data... dataArr) {
            this.f3605a = dVar;
            this.f3606b = dataArr;
        }
    }
}
