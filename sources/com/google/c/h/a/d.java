package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.a.k;
import com.google.c.h.a.b;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public abstract class d<I, O, F, T> extends b.h<O> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    q<? extends I> f54223a;

    /* renamed from: b  reason: collision with root package name */
    F f54224b;

    static {
        Covode.recordClassIndex(33638);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f2, I i2);

    /* access modifiers changed from: package-private */
    public abstract void a(T t);

    /* access modifiers changed from: protected */
    @Override // com.google.c.h.a.b
    public final void b() {
        a((Future<?>) this.f54223a);
        this.f54223a = null;
        this.f54224b = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.c.h.a.b
    public final String a() {
        String str;
        q<? extends I> qVar = this.f54223a;
        F f2 = this.f54224b;
        String a2 = super.a();
        if (qVar != null) {
            str = "inputFuture=[" + qVar + "], ";
        } else {
            str = "";
        }
        if (f2 != null) {
            return str + "function=[" + ((Object) f2) + "]";
        }
        if (a2 != null) {
            return str + a2;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.c.h.a.d<I, O, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void run() {
        boolean z;
        q<? extends I> qVar = this.f54223a;
        F f2 = this.f54224b;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (qVar == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (f2 != null) {
            z2 = false;
        }
        if (!z3 && !z2) {
            this.f54223a = null;
            try {
                try {
                    Object a2 = a(f2, l.a((Future) qVar));
                    this.f54224b = null;
                    a(a2);
                } catch (UndeclaredThrowableException e2) {
                    a(e2.getCause());
                    this.f54224b = null;
                } catch (Throwable th) {
                    this.f54224b = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                a(e3.getCause());
            } catch (RuntimeException e4) {
                a((Throwable) e4);
            } catch (Error e5) {
                a((Throwable) e5);
            }
        }
    }

    public static final class b<I, O> extends d<I, O, f<? super I, ? extends O>, O> {
        static {
            Covode.recordClassIndex(33640);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.d
        public final void a(O o) {
            b((Object) o);
        }

        public b(q<? extends I> qVar, f<? super I, ? extends O> fVar) {
            super(qVar, fVar);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.d
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((f) obj).a(obj2);
        }
    }

    public static final class a<I, O> extends d<I, O, e<? super I, ? extends O>, q<? extends O>> {
        static {
            Covode.recordClassIndex(33639);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.d
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            a((q) ((q) obj));
        }

        public a(q<? extends I> qVar, e<? super I, ? extends O> eVar) {
            super(qVar, eVar);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.d
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            q<O> a2 = ((e) obj).a(obj2);
            k.a(a2, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
            return a2;
        }
    }

    d(q<? extends I> qVar, F f2) {
        this.f54223a = (q) k.a(qVar);
        this.f54224b = (F) k.a(f2);
    }
}
