package com.google.android.gms.c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class ac<TResult> extends h<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f49893a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final aa<TResult> f49894b = new aa<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f49895c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f49896d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f49897e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f49898f;

    static {
        Covode.recordClassIndex(31145);
    }

    ac() {
    }

    @Override // com.google.android.gms.c.h
    public final boolean a() {
        boolean z;
        MethodCollector.i(5723);
        synchronized (this.f49893a) {
            try {
                z = this.f49895c;
            } finally {
                MethodCollector.o(5723);
            }
        }
        return z;
    }

    static class a extends LifecycleCallback {

        /* renamed from: b  reason: collision with root package name */
        private final List<WeakReference<z<?>>> f49899b = new ArrayList();

        static {
            Covode.recordClassIndex(31146);
        }

        public static a b(Activity activity) {
            j a2 = a(activity);
            a aVar = (a) a2.a("TaskOnStopCallback", a.class);
            return aVar == null ? new a(a2) : aVar;
        }

        private a(j jVar) {
            super(jVar);
            this.f50018a.a("TaskOnStopCallback", this);
        }

        public final <T> void a(z<T> zVar) {
            MethodCollector.i(4363);
            synchronized (this.f49899b) {
                try {
                    this.f49899b.add(new WeakReference<>(zVar));
                } finally {
                    MethodCollector.o(4363);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public final void d() {
            MethodCollector.i(4441);
            synchronized (this.f49899b) {
                try {
                    for (WeakReference<z<?>> weakReference : this.f49899b) {
                        z<?> zVar = weakReference.get();
                        if (zVar != null) {
                            zVar.N_();
                        }
                    }
                    this.f49899b.clear();
                } finally {
                    MethodCollector.o(4441);
                }
            }
        }
    }

    @Override // com.google.android.gms.c.h
    public final boolean c() {
        return this.f49896d;
    }

    @Override // com.google.android.gms.c.h
    public final boolean b() {
        boolean z;
        MethodCollector.i(5724);
        synchronized (this.f49893a) {
            try {
                z = this.f49895c && !this.f49896d && this.f49898f == null;
            } finally {
                MethodCollector.o(5724);
            }
        }
        return z;
    }

    @Override // com.google.android.gms.c.h
    public final TResult d() {
        TResult tresult;
        MethodCollector.i(5727);
        synchronized (this.f49893a) {
            try {
                g();
                i();
                if (this.f49898f == null) {
                    tresult = this.f49897e;
                } else {
                    f fVar = new f(this.f49898f);
                    MethodCollector.o(5727);
                    throw fVar;
                }
            } finally {
                MethodCollector.o(5727);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.c.h
    public final <X extends Throwable> TResult a(Class<X> cls) {
        TResult tresult;
        MethodCollector.i(5731);
        synchronized (this.f49893a) {
            try {
                g();
                i();
                if (cls.isInstance(this.f49898f)) {
                    X cast = cls.cast(this.f49898f);
                    MethodCollector.o(5731);
                    throw cast;
                } else if (this.f49898f == null) {
                    tresult = this.f49897e;
                } else {
                    f fVar = new f(this.f49898f);
                    MethodCollector.o(5731);
                    throw fVar;
                }
            } finally {
                MethodCollector.o(5731);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.c.h
    public final Exception e() {
        Exception exc;
        MethodCollector.i(5732);
        synchronized (this.f49893a) {
            try {
                exc = this.f49898f;
            } finally {
                MethodCollector.o(5732);
            }
        }
        return exc;
    }

    @Override // com.google.android.gms.c.h
    public final h<TResult> a(e<? super TResult> eVar) {
        return a(j.f49903a, eVar);
    }

    @Override // com.google.android.gms.c.h
    public final h<TResult> a(Executor executor, e<? super TResult> eVar) {
        this.f49894b.a(new v(executor, eVar));
        j();
        return this;
    }

    @Override // com.google.android.gms.c.h
    public final h<TResult> a(Activity activity, e<? super TResult> eVar) {
        v vVar = new v(j.f49903a, eVar);
        this.f49894b.a(vVar);
        a.b(activity).a(vVar);
        j();
        return this;
    }

    @Override // com.google.android.gms.c.h
    public final h<TResult> a(Executor executor, d dVar) {
        this.f49894b.a(new t(executor, dVar));
        j();
        return this;
    }

    @Override // com.google.android.gms.c.h
    public final h<TResult> a(Activity activity, d dVar) {
        t tVar = new t(j.f49903a, dVar);
        this.f49894b.a(tVar);
        a.b(activity).a(tVar);
        j();
        return this;
    }

    @Override // com.google.android.gms.c.h
    public final h<TResult> a(c<TResult> cVar) {
        return a(j.f49903a, cVar);
    }

    @Override // com.google.android.gms.c.h
    public final h<TResult> a(Executor executor, c<TResult> cVar) {
        this.f49894b.a(new r(executor, cVar));
        j();
        return this;
    }

    @Override // com.google.android.gms.c.h
    public final <TContinuationResult> h<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar) {
        ac acVar = new ac();
        this.f49894b.a(new l(executor, aVar, acVar));
        j();
        return acVar;
    }

    @Override // com.google.android.gms.c.h
    public final h<TResult> a(Executor executor, b bVar) {
        this.f49894b.a(new p(executor, bVar));
        j();
        return this;
    }

    @Override // com.google.android.gms.c.h
    public final <TContinuationResult> h<TContinuationResult> b(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        ac acVar = new ac();
        this.f49894b.a(new n(executor, aVar, acVar));
        j();
        return acVar;
    }

    @Override // com.google.android.gms.c.h
    public final <TContinuationResult> h<TContinuationResult> a(Executor executor, g<TResult, TContinuationResult> gVar) {
        ac acVar = new ac();
        this.f49894b.a(new x(executor, gVar, acVar));
        j();
        return acVar;
    }

    public final void a(TResult tresult) {
        MethodCollector.i(5756);
        synchronized (this.f49893a) {
            try {
                h();
                this.f49895c = true;
                this.f49897e = tresult;
            } catch (Throwable th) {
                MethodCollector.o(5756);
                throw th;
            }
        }
        this.f49894b.a(this);
        MethodCollector.o(5756);
    }

    public final boolean b(TResult tresult) {
        MethodCollector.i(5815);
        synchronized (this.f49893a) {
            try {
                if (this.f49895c) {
                    return false;
                }
                this.f49895c = true;
                this.f49897e = tresult;
                this.f49894b.a(this);
                MethodCollector.o(5815);
                return true;
            } finally {
                MethodCollector.o(5815);
            }
        }
    }

    public final void a(Exception exc) {
        MethodCollector.i(5860);
        r.a(exc, "Exception must not be null");
        synchronized (this.f49893a) {
            try {
                h();
                this.f49895c = true;
                this.f49898f = exc;
            } catch (Throwable th) {
                MethodCollector.o(5860);
                throw th;
            }
        }
        this.f49894b.a(this);
        MethodCollector.o(5860);
    }

    public final boolean b(Exception exc) {
        MethodCollector.i(5925);
        r.a(exc, "Exception must not be null");
        synchronized (this.f49893a) {
            try {
                if (this.f49895c) {
                    return false;
                }
                this.f49895c = true;
                this.f49898f = exc;
                this.f49894b.a(this);
                MethodCollector.o(5925);
                return true;
            } finally {
                MethodCollector.o(5925);
            }
        }
    }

    public final boolean f() {
        MethodCollector.i(5930);
        synchronized (this.f49893a) {
            try {
                if (this.f49895c) {
                    return false;
                }
                this.f49895c = true;
                this.f49896d = true;
                this.f49894b.a(this);
                MethodCollector.o(5930);
                return true;
            } finally {
                MethodCollector.o(5930);
            }
        }
    }

    private final void g() {
        r.a(this.f49895c, "Task is not yet complete");
    }

    private final void h() {
        r.a(!this.f49895c, "Task is already complete");
    }

    private final void i() {
        if (this.f49896d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        MethodCollector.i(5943);
        synchronized (this.f49893a) {
            try {
                if (this.f49895c) {
                    this.f49894b.a(this);
                    MethodCollector.o(5943);
                }
            } finally {
                MethodCollector.o(5943);
            }
        }
    }
}
