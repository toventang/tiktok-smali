package com.bytedance.ies.xelement.alphavideo.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public Executor f36636a;

    /* renamed from: b  reason: collision with root package name */
    final Set<b<T>> f36637b;

    /* renamed from: c  reason: collision with root package name */
    public final FutureTask<c<T>> f36638c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c<T> f36639d;

    /* renamed from: e  reason: collision with root package name */
    private Thread f36640e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<b<Throwable>> f36641f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f36642g;

    static {
        Covode.recordClassIndex(22006);
    }

    private boolean c() {
        Thread thread = this.f36640e;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        return true;
    }

    private synchronized void b() {
        MethodCollector.i(5934);
        if (c() || this.f36639d != null) {
            MethodCollector.o(5934);
            return;
        }
        AnonymousClass2 r1 = new Thread("LynxLottieTaskObserver") {
            /* class com.bytedance.ies.xelement.alphavideo.a.d.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private boolean f36645b;

            static {
                Covode.recordClassIndex(22008);
            }

            public final void run() {
                while (!isInterrupted() && !this.f36645b) {
                    if (d.this.f36638c.isDone()) {
                        try {
                            d dVar = d.this;
                            dVar.a(dVar.f36638c.get());
                        } catch (InterruptedException | ExecutionException e2) {
                            d.this.a(new c<>(e2));
                        }
                        this.f36645b = true;
                        d.this.a();
                    }
                }
            }
        };
        this.f36640e = r1;
        r1.start();
        MethodCollector.o(5934);
    }

    public final synchronized void a() {
        MethodCollector.i(5937);
        if (!c()) {
            MethodCollector.o(5937);
            return;
        }
        if (this.f36637b.isEmpty() || this.f36639d != null) {
            this.f36640e.interrupt();
            this.f36640e = null;
        }
        MethodCollector.o(5937);
    }

    public d(Callable<c<T>> callable) {
        this(callable, (byte) 0);
    }

    public final void a(c<T> cVar) {
        if (this.f36639d == null) {
            this.f36639d = cVar;
            this.f36642g.post(new Runnable() {
                /* class com.bytedance.ies.xelement.alphavideo.a.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22007);
                }

                public final void run() {
                    if (!(d.this.f36639d == null || d.this.f36638c.isCancelled())) {
                        c<T> cVar = d.this.f36639d;
                        if (cVar.f36634a != null) {
                            d dVar = d.this;
                            V v = cVar.f36634a;
                            for (b bVar : new ArrayList(dVar.f36637b)) {
                                bVar.a(v);
                            }
                            return;
                        }
                        d.this.a(cVar.f36635b);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized d<T> a(b<T> bVar) {
        MethodCollector.i(5857);
        if (!(this.f36639d == null || this.f36639d.f36634a == null)) {
            bVar.a(this.f36639d.f36634a);
        }
        this.f36637b.add(bVar);
        b();
        MethodCollector.o(5857);
        return this;
    }

    public final synchronized d<T> b(b<Throwable> bVar) {
        MethodCollector.i(5924);
        if (!(this.f36639d == null || this.f36639d.f36635b == null)) {
            bVar.a(this.f36639d.f36635b);
        }
        this.f36641f.add(bVar);
        b();
        MethodCollector.o(5924);
        return this;
    }

    public final void a(Throwable th) {
        ArrayList<b> arrayList = new ArrayList(this.f36641f);
        if (!arrayList.isEmpty()) {
            for (b bVar : arrayList) {
                bVar.a(th);
            }
        }
    }

    private d(Callable<c<T>> callable, byte b2) {
        this.f36636a = Executors.newCachedThreadPool();
        this.f36637b = new LinkedHashSet(1);
        this.f36641f = new LinkedHashSet(1);
        this.f36642g = new Handler(Looper.getMainLooper());
        this.f36639d = null;
        FutureTask<c<T>> futureTask = new FutureTask<>(callable);
        this.f36638c = futureTask;
        this.f36636a.execute(futureTask);
        b();
    }
}
