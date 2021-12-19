package com.ttnet.org.chromium.base.task;

import android.os.Binder;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.f;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a<Result> {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f155303a = c.f155315a;

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f155304b = new k();

    /* renamed from: f  reason: collision with root package name */
    private static final b f155305f = new b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public volatile int f155306c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f155307d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f155308e = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final Callable<Result> f155309g;

    /* renamed from: h  reason: collision with root package name */
    private final FutureTask<Result> f155310h;

    /* access modifiers changed from: protected */
    public abstract Result a();

    static class b implements RejectedExecutionHandler {
        static {
            Covode.recordClassIndex(103340);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            a.f155303a.execute(runnable);
        }
    }

    static {
        Covode.recordClassIndex(103337);
    }

    public a() {
        AnonymousClass1 r1 = new Callable<Result>() {
            /* class com.ttnet.org.chromium.base.task.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103338);
            }

            @Override // java.util.concurrent.Callable
            public final Result call() {
                a.this.f155308e.set(true);
                Result result = null;
                try {
                    result = (Result) a.this.a();
                    Binder.flushPendingCommands();
                    a.this.b(result);
                    return result;
                } catch (Throwable th) {
                    a.this.b(result);
                    throw th;
                }
            }
        };
        this.f155309g = r1;
        this.f155310h = new C4116a(r1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.base.task.a$a  reason: collision with other inner class name */
    public class C4116a extends FutureTask<Result> {
        static {
            Covode.recordClassIndex(103339);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.ttnet.org.chromium.base.task.a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        public void done() {
            try {
                a.this.a(get());
            } catch (InterruptedException e2) {
                f.b("AsyncTask", e2.toString(), new Object[0]);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (CancellationException unused) {
                a.this.a(null);
            }
        }

        C4116a(Callable<Result> callable) {
            super(callable);
        }
    }

    public final void a(Result result) {
        if (!this.f155308e.get()) {
            b(result);
        }
    }

    public final void b(Result result) {
        if (this instanceof d) {
            this.f155306c = 2;
        } else {
            ThreadUtils.a(new b(this, result));
        }
    }
}
