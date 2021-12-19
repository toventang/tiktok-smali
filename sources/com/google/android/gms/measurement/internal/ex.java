package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class ex extends fy {

    /* renamed from: f  reason: collision with root package name */
    static final AtomicLong f51564f = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: a  reason: collision with root package name */
    fc f51565a;

    /* renamed from: b  reason: collision with root package name */
    fc f51566b;

    /* renamed from: c  reason: collision with root package name */
    final Object f51567c = new Object();

    /* renamed from: d  reason: collision with root package name */
    final Semaphore f51568d = new Semaphore(2);

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f51569e;

    /* renamed from: g  reason: collision with root package name */
    private final PriorityBlockingQueue<fd<?>> f51570g = new PriorityBlockingQueue<>();

    /* renamed from: h  reason: collision with root package name */
    private final BlockingQueue<fd<?>> f51571h = new LinkedBlockingQueue();

    /* renamed from: i  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f51572i = new ez(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: j  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f51573j = new ez(this, "Thread death: Uncaught exception on network thread");

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fy
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    static {
        Covode.recordClassIndex(32218);
    }

    public final boolean f() {
        if (Thread.currentThread() == this.f51565a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final void c() {
        if (Thread.currentThread() != this.f51565a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final void b() {
        if (Thread.currentThread() != this.f51566b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void a(Runnable runnable) {
        x();
        r.a(runnable);
        a(new fd<>(this, runnable, "Task exception on worker thread"));
    }

    public final <V> Future<V> b(Callable<V> callable) {
        x();
        r.a(callable);
        fd<?> fdVar = new fd<>(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f51565a) {
            fdVar.run();
        } else {
            a(fdVar);
        }
        return fdVar;
    }

    ex(ff ffVar) {
        super(ffVar);
    }

    private final void a(fd<?> fdVar) {
        MethodCollector.i(6687);
        synchronized (this.f51567c) {
            try {
                this.f51570g.add(fdVar);
                fc fcVar = this.f51565a;
                if (fcVar == null) {
                    fc fcVar2 = new fc(this, "Measurement Worker", this.f51570g);
                    this.f51565a = fcVar2;
                    fcVar2.setUncaughtExceptionHandler(this.f51572i);
                    this.f51565a.start();
                } else {
                    fcVar.a();
                }
            } finally {
                MethodCollector.o(6687);
            }
        }
    }

    public final void b(Runnable runnable) {
        MethodCollector.i(6692);
        x();
        r.a(runnable);
        fd<?> fdVar = new fd<>(this, runnable, "Task exception on network thread");
        synchronized (this.f51567c) {
            try {
                this.f51571h.add(fdVar);
                fc fcVar = this.f51566b;
                if (fcVar == null) {
                    fc fcVar2 = new fc(this, "Measurement Network", this.f51571h);
                    this.f51566b = fcVar2;
                    fcVar2.setUncaughtExceptionHandler(this.f51573j);
                    this.f51566b.start();
                } else {
                    fcVar.a();
                }
            } finally {
                MethodCollector.o(6692);
            }
        }
    }

    public final <V> Future<V> a(Callable<V> callable) {
        x();
        r.a(callable);
        fd<?> fdVar = new fd<>(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f51565a) {
            if (!this.f51570g.isEmpty()) {
                q().f51471f.a("Callable skipped the worker queue.");
            }
            fdVar.run();
        } else {
            a(fdVar);
        }
        return fdVar;
    }

    /* access modifiers changed from: package-private */
    public final <T> T a(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        String str2;
        String str3;
        MethodCollector.i(6682);
        synchronized (atomicReference) {
            try {
                p().a(runnable);
                try {
                    atomicReference.wait(j2);
                } catch (InterruptedException unused) {
                    ee eeVar = q().f51471f;
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        str2 = "Interrupted waiting for ".concat(valueOf);
                    } else {
                        str2 = new String("Interrupted waiting for ");
                    }
                    eeVar.a(str2);
                    MethodCollector.o(6682);
                    return null;
                }
            } finally {
                MethodCollector.o(6682);
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            ee eeVar2 = q().f51471f;
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3 = "Timed out waiting for ".concat(valueOf2);
            } else {
                str3 = new String("Timed out waiting for ");
            }
            eeVar2.a(str3);
        }
        return t;
    }
}
