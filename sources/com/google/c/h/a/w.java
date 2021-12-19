package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.h.a.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

class w<V> extends b.h<V> implements RunnableFuture<V> {

    /* renamed from: a  reason: collision with root package name */
    private volatile p<?> f54250a;

    static {
        Covode.recordClassIndex(33672);
    }

    final class a extends p<V> {
        private final Callable<V> callable;

        static {
            Covode.recordClassIndex(33673);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.p
        public final boolean a() {
            return w.this.isDone();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.p
        public final V b() {
            return this.callable.call();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.p
        public final String c() {
            return this.callable.toString();
        }

        a(Callable<V> callable2) {
            this.callable = (Callable) k.a(callable2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.p
        public final void a(V v, Throwable th) {
            if (th == null) {
                w.this.b((Object) v);
            } else {
                w.this.a(th);
            }
        }
    }

    public void run() {
        p<?> pVar = this.f54250a;
        if (pVar != null) {
            pVar.run();
        }
        this.f54250a = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.c.h.a.b
    public final String a() {
        p<?> pVar = this.f54250a;
        if (pVar != null) {
            return "task=[" + pVar + "]";
        }
        return super.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.c.h.a.b
    public final void b() {
        p<?> pVar;
        super.b();
        if (d() && (pVar = this.f54250a) != null) {
            Runnable runnable = (Runnable) pVar.get();
            if ((runnable instanceof Thread) && pVar.compareAndSet(runnable, p.f54238b)) {
                ((Thread) runnable).interrupt();
                pVar.set(p.f54237a);
            }
        }
        this.f54250a = null;
    }

    static <V> w<V> a(Callable<V> callable) {
        return new w<>(callable);
    }

    private w(Callable<V> callable) {
        this.f54250a = new a(callable);
    }

    static <V> w<V> a(Runnable runnable, V v) {
        return new w<>(Executors.callable(runnable, v));
    }
}
