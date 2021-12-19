package com.bytedance.lottie;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.b.f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class o<T> {

    /* renamed from: a  reason: collision with root package name */
    public static Executor f40817a = f.a();

    /* renamed from: b  reason: collision with root package name */
    final Set<k<Throwable>> f40818b;

    /* renamed from: c  reason: collision with root package name */
    public final FutureTask<n<T>> f40819c;

    /* renamed from: d  reason: collision with root package name */
    public volatile n<T> f40820d;

    /* renamed from: e  reason: collision with root package name */
    private Thread f40821e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<k<T>> f40822f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f40823g;

    static {
        Covode.recordClassIndex(25020);
    }

    private boolean c() {
        Thread thread = this.f40821e;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        return true;
    }

    private synchronized void b() {
        MethodCollector.i(2220);
        if (c() || this.f40820d != null) {
            MethodCollector.o(2220);
            return;
        }
        AnonymousClass2 r1 = new Thread("LottieTaskObserver") {
            /* class com.bytedance.lottie.o.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private boolean f40826b;

            static {
                Covode.recordClassIndex(25022);
            }

            public final void run() {
                while (!isInterrupted() && !this.f40826b) {
                    if (o.this.f40819c.isDone()) {
                        try {
                            o oVar = o.this;
                            oVar.a((n) oVar.f40819c.get());
                        } catch (InterruptedException | ExecutionException e2) {
                            o.this.a((n) new n<>(e2));
                        }
                        this.f40826b = true;
                        o.this.a();
                    }
                }
            }
        };
        this.f40821e = r1;
        r1.start();
        MethodCollector.o(2220);
    }

    public final synchronized void a() {
        MethodCollector.i(2224);
        if (!c()) {
            MethodCollector.o(2224);
            return;
        }
        if (this.f40822f.isEmpty() || this.f40820d != null) {
            this.f40821e.interrupt();
            this.f40821e = null;
        }
        MethodCollector.o(2224);
    }

    public o(Callable<n<T>> callable) {
        this(callable, (byte) 0);
    }

    public final void a(n<T> nVar) {
        if (this.f40820d == null) {
            this.f40820d = nVar;
            this.f40823g.post(new Runnable() {
                /* class com.bytedance.lottie.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25021);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: com.bytedance.lottie.k */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    if (!(o.this.f40820d == null || o.this.f40819c.isCancelled())) {
                        n<T> nVar = o.this.f40820d;
                        if (nVar.f40815a != null) {
                            o.this.a((Object) nVar.f40815a);
                            return;
                        }
                        o oVar = o.this;
                        Throwable th = nVar.f40816b;
                        ArrayList<k> arrayList = new ArrayList(oVar.f40818b);
                        if (!arrayList.isEmpty()) {
                            for (k kVar : arrayList) {
                                kVar.a(th);
                            }
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized o<T> b(k<T> kVar) {
        MethodCollector.i(2211);
        this.f40822f.remove(kVar);
        a();
        MethodCollector.o(2211);
        return this;
    }

    public final synchronized o<T> d(k<Throwable> kVar) {
        MethodCollector.i(2216);
        this.f40818b.remove(kVar);
        a();
        MethodCollector.o(2216);
        return this;
    }

    public final synchronized o<T> a(k<T> kVar) {
        MethodCollector.i(2210);
        if (!(this.f40820d == null || this.f40820d.f40815a == null)) {
            kVar.a(this.f40820d.f40815a);
        }
        this.f40822f.add(kVar);
        b();
        MethodCollector.o(2210);
        return this;
    }

    public final synchronized o<T> c(k<Throwable> kVar) {
        MethodCollector.i(2213);
        if (!(this.f40820d == null || this.f40820d.f40816b == null)) {
            kVar.a(this.f40820d.f40816b);
        }
        this.f40818b.add(kVar);
        b();
        MethodCollector.o(2213);
        return this;
    }

    public final synchronized void a(T t) {
        MethodCollector.i(2218);
        for (k kVar : new ArrayList(this.f40822f)) {
            kVar.a(t);
        }
        MethodCollector.o(2218);
    }

    private o(Callable<n<T>> callable, byte b2) {
        this.f40822f = new LinkedHashSet(1);
        this.f40818b = new LinkedHashSet(1);
        this.f40823g = new Handler(Looper.getMainLooper());
        this.f40820d = null;
        FutureTask<n<T>> futureTask = new FutureTask<>(callable);
        this.f40819c = futureTask;
        f40817a.execute(futureTask);
        b();
    }
}
