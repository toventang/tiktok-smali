package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.h;
import com.google.c.a.k;
import com.google.c.h.a.a;
import com.google.c.h.a.o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class l extends n {
    static {
        Covode.recordClassIndex(33650);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Future<V> f54232a;

        /* renamed from: b  reason: collision with root package name */
        final k<? super V> f54233b;

        static {
            Covode.recordClassIndex(33651);
        }

        public final String toString() {
            return h.a(this).a(this.f54233b).toString();
        }

        public final void run() {
            try {
                this.f54233b.onSuccess(l.a((Future) this.f54232a));
            } catch (ExecutionException e2) {
                this.f54233b.onFailure(e2.getCause());
            } catch (Error | RuntimeException e3) {
                this.f54233b.onFailure(e3);
            }
        }

        a(Future<V> future, k<? super V> kVar) {
            this.f54232a = future;
            this.f54233b = kVar;
        }
    }

    public static <V> q<V> a(V v) {
        if (v == null) {
            return o.b.f54235a;
        }
        return new o.b(v);
    }

    public static <V> q<V> a(Throwable th) {
        k.a(th);
        return new o.a(th);
    }

    public static <V> V a(Future<V> future) {
        k.b(future.isDone(), "Future was expected to be done: %s", future);
        return (V) y.a(future);
    }

    public static <V> void a(q<V> qVar, k<? super V> kVar, Executor executor) {
        k.a(kVar);
        qVar.a(new a(qVar, kVar), executor);
    }

    public static <V, X extends Throwable> q<V> a(q<? extends V> qVar, Class<X> cls, e<? super X, ? extends V> eVar, Executor executor) {
        a.C1238a aVar = new a.C1238a(qVar, cls, eVar);
        qVar.a(aVar, u.a(executor, aVar));
        return aVar;
    }
}
