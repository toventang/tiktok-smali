package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.g.d;
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

public final class m<T> {

    /* renamed from: a  reason: collision with root package name */
    public static Executor f5750a = Executors.newCachedThreadPool();

    /* renamed from: b  reason: collision with root package name */
    public FutureTask<l<T>> f5751b;

    /* renamed from: c  reason: collision with root package name */
    public volatile l<T> f5752c;

    /* renamed from: d  reason: collision with root package name */
    private Thread f5753d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<i<T>> f5754e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<i<Throwable>> f5755f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f5756g;

    static {
        Covode.recordClassIndex(2403);
    }

    private boolean c() {
        Thread thread = this.f5753d;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        return true;
    }

    class a extends FutureTask<l<T>> {
        static {
            Covode.recordClassIndex(2406);
        }

        /* access modifiers changed from: protected */
        public final void done() {
            if (!isCancelled()) {
                try {
                    m.this.a((l) ((l) get()));
                } catch (InterruptedException | ExecutionException e2) {
                    m.this.a((l) new l<>(e2));
                }
            }
        }

        a(Callable<l<T>> callable) {
            super(callable);
        }
    }

    private synchronized void b() {
        MethodCollector.i(4903);
        if (c() || this.f5752c != null) {
            MethodCollector.o(4903);
            return;
        }
        AnonymousClass2 r1 = new Thread("LottieTaskObserver") {
            /* class com.airbnb.lottie.m.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private boolean f5759b;

            static {
                Covode.recordClassIndex(2405);
            }

            public final void run() {
                while (!isInterrupted() && !this.f5759b) {
                    if (m.this.f5751b.isDone()) {
                        try {
                            m mVar = m.this;
                            mVar.a((l) mVar.f5751b.get());
                        } catch (InterruptedException | ExecutionException e2) {
                            m.this.a((l) new l<>(e2));
                        }
                        this.f5759b = true;
                        m.this.a();
                    }
                }
            }
        };
        this.f5753d = r1;
        r1.start();
        MethodCollector.o(4903);
    }

    public final synchronized void a() {
        MethodCollector.i(4906);
        if (!c()) {
            MethodCollector.o(4906);
            return;
        }
        if (this.f5754e.isEmpty() || this.f5752c != null) {
            this.f5753d.interrupt();
            this.f5753d = null;
        }
        MethodCollector.o(4906);
    }

    public m(Callable<l<T>> callable) {
        this(callable, (byte) 0);
    }

    public final void a(l<T> lVar) {
        if (this.f5752c == null) {
            this.f5752c = lVar;
            this.f5756g.post(new Runnable() {
                /* class com.airbnb.lottie.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(2404);
                }

                public final void run() {
                    if (m.this.f5752c == null) {
                        return;
                    }
                    if (d.a.f5625a || m.this.f5751b == null || !m.this.f5751b.isCancelled()) {
                        l<T> lVar = m.this.f5752c;
                        if (lVar.f5748a != null) {
                            m.this.a((Object) lVar.f5748a);
                        } else {
                            m.this.a(lVar.f5749b);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized m<T> b(i<T> iVar) {
        MethodCollector.i(4733);
        this.f5754e.remove(iVar);
        if (!d.a.f5625a && this.f5751b != null) {
            a();
        }
        MethodCollector.o(4733);
        return this;
    }

    public final synchronized m<T> d(i<Throwable> iVar) {
        MethodCollector.i(4833);
        this.f5755f.remove(iVar);
        if (!d.a.f5625a && this.f5751b != null) {
            a();
        }
        MethodCollector.o(4833);
        return this;
    }

    public final synchronized m<T> a(i<T> iVar) {
        MethodCollector.i(4725);
        if (!(this.f5752c == null || this.f5752c.f5748a == null)) {
            iVar.a(this.f5752c.f5748a);
        }
        this.f5754e.add(iVar);
        if (!d.a.f5625a && this.f5751b != null) {
            b();
        }
        MethodCollector.o(4725);
        return this;
    }

    public final synchronized m<T> c(i<Throwable> iVar) {
        MethodCollector.i(4735);
        if (!(this.f5752c == null || this.f5752c.f5749b == null)) {
            iVar.a(this.f5752c.f5749b);
        }
        this.f5755f.add(iVar);
        if (!d.a.f5625a && this.f5751b != null) {
            b();
        }
        MethodCollector.o(4735);
        return this;
    }

    private synchronized void b(T t) {
        MethodCollector.i(4841);
        for (i iVar : new ArrayList(this.f5754e)) {
            iVar.a(t);
        }
        MethodCollector.o(4841);
    }

    private synchronized void b(Throwable th) {
        MethodCollector.i(4899);
        ArrayList<i> arrayList = new ArrayList(this.f5755f);
        if (arrayList.isEmpty()) {
            MethodCollector.o(4899);
            return;
        }
        for (i iVar : arrayList) {
            iVar.a(th);
        }
        MethodCollector.o(4899);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a(Object obj) {
        MethodCollector.i(4835);
        synchronized (this) {
            try {
                b(obj);
            } finally {
                MethodCollector.o(4835);
            }
        }
    }

    public final synchronized void a(Throwable th) {
        MethodCollector.i(4842);
        try {
            b(th);
            MethodCollector.o(4842);
        } catch (Throwable unused) {
            MethodCollector.o(4842);
        }
    }

    private m(Callable<l<T>> callable, byte b2) {
        this.f5754e = new LinkedHashSet(1);
        this.f5755f = new LinkedHashSet(1);
        this.f5756g = new Handler(Looper.getMainLooper());
        this.f5752c = null;
        if (!d.a.f5625a) {
            FutureTask<l<T>> futureTask = new FutureTask<>(callable);
            this.f5751b = futureTask;
            f5750a.execute(futureTask);
            b();
        } else if (d.a.f5634j) {
            try {
                f5750a.execute(new a(callable));
            } catch (Throwable th) {
                if (d.f5620a) {
                    throw th;
                }
            }
        } else {
            f5750a.execute(new a(callable));
        }
    }
}
