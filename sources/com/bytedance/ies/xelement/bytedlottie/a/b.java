package com.bytedance.ies.xelement.bytedlottie.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.k;
import com.bytedance.lottie.n;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public Executor f36805a;

    /* renamed from: b  reason: collision with root package name */
    final Set<k<T>> f36806b;

    /* renamed from: c  reason: collision with root package name */
    public final FutureTask<n<T>> f36807c;

    /* renamed from: d  reason: collision with root package name */
    public volatile n<T> f36808d;

    /* renamed from: e  reason: collision with root package name */
    private Thread f36809e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<k<Throwable>> f36810f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f36811g;

    static {
        Covode.recordClassIndex(22092);
    }

    private boolean c() {
        Thread thread = this.f36809e;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        return true;
    }

    private synchronized void b() {
        MethodCollector.i(9958);
        if (c() || this.f36808d != null) {
            MethodCollector.o(9958);
            return;
        }
        AnonymousClass2 r1 = new Thread("LynxLottieTaskObserver") {
            /* class com.bytedance.ies.xelement.bytedlottie.a.b.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private boolean f36814b;

            static {
                Covode.recordClassIndex(22094);
            }

            public final void run() {
                while (!isInterrupted() && !this.f36814b) {
                    if (b.this.f36807c.isDone()) {
                        try {
                            b bVar = b.this;
                            bVar.a(bVar.f36807c.get());
                        } catch (InterruptedException | ExecutionException e2) {
                            b.this.a(new n<>(e2));
                        }
                        this.f36814b = true;
                        b.this.a();
                    }
                }
            }
        };
        this.f36809e = r1;
        r1.start();
        MethodCollector.o(9958);
    }

    public final synchronized void a() {
        MethodCollector.i(9959);
        if (!c()) {
            MethodCollector.o(9959);
            return;
        }
        if (this.f36806b.isEmpty() || this.f36808d != null) {
            this.f36809e.interrupt();
            this.f36809e = null;
        }
        MethodCollector.o(9959);
    }

    public b(Callable<n<T>> callable) {
        this(callable, (byte) 0);
    }

    public final void a(n<T> nVar) {
        if (this.f36808d == null) {
            this.f36808d = nVar;
            this.f36811g.post(new Runnable() {
                /* class com.bytedance.ies.xelement.bytedlottie.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22093);
                }

                public final void run() {
                    if (!(b.this.f36808d == null || b.this.f36807c.isCancelled())) {
                        n<T> nVar = b.this.f36808d;
                        if (nVar.f40815a != null) {
                            b bVar = b.this;
                            V v = nVar.f40815a;
                            for (k kVar : new ArrayList(bVar.f36806b)) {
                                kVar.a(v);
                            }
                            return;
                        }
                        b.this.a(nVar.f40816b);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final void a(Throwable th) {
        ArrayList<k> arrayList = new ArrayList(this.f36810f);
        if (!arrayList.isEmpty()) {
            for (k kVar : arrayList) {
                kVar.a(th);
            }
        }
    }

    private b(Callable<n<T>> callable, byte b2) {
        this.f36805a = Executors.newCachedThreadPool();
        this.f36806b = new LinkedHashSet(1);
        this.f36810f = new LinkedHashSet(1);
        this.f36811g = new Handler(Looper.getMainLooper());
        this.f36808d = null;
        FutureTask<n<T>> futureTask = new FutureTask<>(callable);
        this.f36807c = futureTask;
        this.f36805a.execute(futureTask);
        b();
    }
}
