package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.r;
import java.util.concurrent.Executor;

public final class q<ResultT> extends d<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f53385a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final l<ResultT> f53386b = new l<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f53387c;

    /* renamed from: d  reason: collision with root package name */
    private ResultT f53388d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f53389e;

    static {
        Covode.recordClassIndex(32979);
    }

    q() {
    }

    private final void e() {
        r.a(!this.f53387c, "Task is already complete");
    }

    private final void f() {
        boolean z;
        MethodCollector.i(9470);
        synchronized (this.f53385a) {
            try {
                z = this.f53387c;
            } catch (Throwable th) {
                MethodCollector.o(9470);
                throw th;
            }
        }
        if (!z) {
            MethodCollector.o(9470);
            return;
        }
        this.f53386b.a(this);
        MethodCollector.o(9470);
    }

    @Override // com.google.android.play.core.tasks.d
    public final d<ResultT> a(a aVar) {
        a(e.f53368a, aVar);
        return this;
    }

    @Override // com.google.android.play.core.tasks.d
    public final d<ResultT> a(b<? super ResultT> bVar) {
        a(e.f53368a, bVar);
        return this;
    }

    @Override // com.google.android.play.core.tasks.d
    public final d<ResultT> a(Executor executor, a aVar) {
        this.f53386b.a(new h(executor, aVar));
        f();
        return this;
    }

    @Override // com.google.android.play.core.tasks.d
    public final d<ResultT> a(Executor executor, b<? super ResultT> bVar) {
        this.f53386b.a(new j(executor, bVar));
        f();
        return this;
    }

    public final void a(Exception exc) {
        MethodCollector.i(9099);
        synchronized (this.f53385a) {
            try {
                e();
                this.f53387c = true;
                this.f53389e = exc;
            } catch (Throwable th) {
                MethodCollector.o(9099);
                throw th;
            }
        }
        this.f53386b.a(this);
        MethodCollector.o(9099);
    }

    public final void a(ResultT resultt) {
        MethodCollector.i(8902);
        synchronized (this.f53385a) {
            try {
                e();
                this.f53387c = true;
                this.f53388d = resultt;
            } catch (Throwable th) {
                MethodCollector.o(8902);
                throw th;
            }
        }
        this.f53386b.a(this);
        MethodCollector.o(8902);
    }

    @Override // com.google.android.play.core.tasks.d
    public final boolean a() {
        boolean z;
        MethodCollector.i(8579);
        synchronized (this.f53385a) {
            try {
                z = this.f53387c;
            } finally {
                MethodCollector.o(8579);
            }
        }
        return z;
    }

    @Override // com.google.android.play.core.tasks.d
    public final boolean b() {
        boolean z;
        MethodCollector.i(8580);
        synchronized (this.f53385a) {
            try {
                z = false;
                if (this.f53387c && this.f53389e == null) {
                    z = true;
                }
            } finally {
                MethodCollector.o(8580);
            }
        }
        return z;
    }

    public final boolean b(Exception exc) {
        MethodCollector.i(9285);
        synchronized (this.f53385a) {
            try {
                if (this.f53387c) {
                    MethodCollector.o(9285);
                    return false;
                }
                this.f53387c = true;
                this.f53389e = exc;
                this.f53386b.a(this);
                MethodCollector.o(9285);
                return true;
            } catch (Throwable th) {
                MethodCollector.o(9285);
                throw th;
            }
        }
    }

    public final boolean b(ResultT resultt) {
        MethodCollector.i(9098);
        synchronized (this.f53385a) {
            try {
                if (this.f53387c) {
                    MethodCollector.o(9098);
                    return false;
                }
                this.f53387c = true;
                this.f53388d = resultt;
                this.f53386b.a(this);
                MethodCollector.o(9098);
                return true;
            } catch (Throwable th) {
                MethodCollector.o(9098);
                throw th;
            }
        }
    }

    @Override // com.google.android.play.core.tasks.d
    public final Exception d() {
        Exception exc;
        MethodCollector.i(8583);
        synchronized (this.f53385a) {
            try {
                exc = this.f53389e;
            } finally {
                MethodCollector.o(8583);
            }
        }
        return exc;
    }

    @Override // com.google.android.play.core.tasks.d
    public final ResultT c() {
        ResultT resultt;
        MethodCollector.i(8582);
        synchronized (this.f53385a) {
            try {
                r.a(this.f53387c, "Task is not yet complete");
                Exception exc = this.f53389e;
                if (exc == null) {
                    resultt = this.f53388d;
                } else {
                    c cVar = new c(exc);
                    MethodCollector.o(8582);
                    throw cVar;
                }
            } finally {
                MethodCollector.o(8582);
            }
        }
        return resultt;
    }
}
