package f.a;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.d.k;
import f.a.e.b.b;
import f.a.e.e.c.c;
import f.a.e.e.c.d;
import f.a.e.e.c.e;
import f.a.e.e.c.g;
import f.a.e.e.c.i;
import f.a.e.e.c.j;
import f.a.e.e.c.l;
import f.a.e.e.c.m;
import f.a.e.e.c.o;
import f.a.e.e.c.p;
import f.a.e.e.c.q;
import f.a.e.e.c.r;
import f.a.e.e.c.s;
import f.a.e.e.c.v;
import f.a.e.e.c.w;
import f.a.e.e.c.x;
import f.a.h.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class n<T> implements r<T> {
    static {
        Covode.recordClassIndex(104934);
    }

    /* access modifiers changed from: protected */
    public abstract void b(p<? super T> pVar);

    public final n<T> a(f<? super T> fVar) {
        b.a((Object) fVar, "doAfterSuccess is null");
        return a.a(new d(this, fVar));
    }

    public final n<T> a(f.a.d.a aVar) {
        b.a((Object) aVar, "onFinally is null");
        return a.a(new e(this, aVar));
    }

    public final n<T> a(k<? super T> kVar) {
        b.a((Object) kVar, "predicate is null");
        return a.a(new g(this, kVar));
    }

    public final <R> n<R> a(f.a.d.g<? super T, ? extends r<? extends R>> gVar) {
        b.a((Object) gVar, "mapper is null");
        return a.a(new j(this, gVar));
    }

    @Override // f.a.r
    public final void a(p<? super T> pVar) {
        b.a((Object) pVar, "observer is null");
        p<? super T> a2 = a.a(this, pVar);
        b.a((Object) a2, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(a2);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.a.c.b.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final f.a.b.b c() {
        return a(f.a.e.b.a.f157191d, f.a.e.b.a.f157193f, f.a.e.b.a.f157190c);
    }

    public final T cE_() {
        f.a.e.d.g gVar = new f.a.e.d.g();
        a((p) gVar);
        return (T) gVar.a();
    }

    private h<T> d() {
        if (this instanceof f.a.e.c.b) {
            return ((f.a.e.c.b) this).a();
        }
        return a.a(new x(this));
    }

    public final b b() {
        return a.a(new l(this));
    }

    private <E extends p<? super T>> E c(E e2) {
        a((p) e2);
        return e2;
    }

    public static <T> n<T> a(q<T> qVar) {
        b.a((Object) qVar, "onSubscribe is null");
        return a.a(new c(qVar));
    }

    public final n<T> d(f.a.d.g<? super Throwable, ? extends T> gVar) {
        b.a((Object) gVar, "valueSupplier is null");
        return a.a(new q(this, gVar));
    }

    public final f.a.b.b e(f<? super T> fVar) {
        return a(fVar, f.a.e.b.a.f157193f, f.a.e.b.a.f157190c);
    }

    public final n<T> c(f<? super f.a.b.b> fVar) {
        f<Object> fVar2 = f.a.e.b.a.f157191d;
        f.a.d.a aVar = f.a.e.b.a.f157190c;
        return a.a(new r(this, (f) b.a((Object) fVar, "onSubscribe is null"), fVar2, fVar2, aVar, aVar, f.a.e.b.a.f157190c));
    }

    private <U> n<T> a(r<U> rVar) {
        b.a((Object) rVar, "timeoutIndicator is null");
        return a.a(new v(this, rVar));
    }

    public final b b(f.a.d.g<? super T, ? extends f> gVar) {
        b.a((Object) gVar, "mapper is null");
        return a.a(new i(this, gVar));
    }

    public final <R> n<R> c(f.a.d.g<? super T, ? extends R> gVar) {
        b.a((Object) gVar, "mapper is null");
        return a.a(new f.a.e.e.c.n(this, gVar));
    }

    public final n<T> d(f<? super T> fVar) {
        f<Object> fVar2 = f.a.e.b.a.f157191d;
        f.a.d.a aVar = f.a.e.b.a.f157190c;
        return a.a(new r(this, f.a.e.b.a.f157191d, (f) b.a((Object) fVar, "onSubscribe is null"), fVar2, aVar, aVar, f.a.e.b.a.f157190c));
    }

    public static <T> n<T> a(T t) {
        b.a((Object) t, "item is null");
        return a.a((n) new m(t));
    }

    public final n<T> b(aa aaVar) {
        b.a((Object) aaVar, "scheduler is null");
        return a.a(new s(this, aaVar));
    }

    public n<T> c(k<? super Throwable> kVar) {
        return d().a(2, kVar).e();
    }

    public static <T> n<T> a(Callable<? extends T> callable) {
        b.a((Object) callable, "callable is null");
        return a.a((n) new f.a.e.e.c.k(callable));
    }

    public final n<T> b(f.a.d.a aVar) {
        f<Object> fVar = f.a.e.b.a.f157191d;
        f.a.d.a aVar2 = f.a.e.b.a.f157190c;
        return a.a(new r(this, fVar, fVar, f.a.e.b.a.f157191d, (f.a.d.a) b.a((Object) aVar, "onComplete is null"), aVar2, aVar2));
    }

    public final n<T> b(f<? super Throwable> fVar) {
        f<Object> fVar2 = f.a.e.b.a.f157191d;
        f.a.d.a aVar = f.a.e.b.a.f157190c;
        return a.a(new r(this, fVar2, fVar2, (f) b.a((Object) fVar, "onError is null"), aVar, aVar, f.a.e.b.a.f157190c));
    }

    public final n<T> b(k<? super Throwable> kVar) {
        b.a((Object) kVar, "predicate is null");
        return a.a(new p(this, kVar));
    }

    public final n<T> a(aa aaVar) {
        b.a((Object) aaVar, "scheduler is null");
        return a.a(new o(this, aaVar));
    }

    public final f.a.b.b a(f<? super T> fVar, f<? super Throwable> fVar2) {
        return a(fVar, fVar2, f.a.e.b.a.f157190c);
    }

    public final n<T> a(long j2, TimeUnit timeUnit) {
        return b(j2, timeUnit, a.a(f.a.k.a.f158005b));
    }

    private n<T> b(long j2, TimeUnit timeUnit, aa aaVar) {
        return a((r) a(j2, timeUnit, aaVar));
    }

    private static n<Long> a(long j2, TimeUnit timeUnit, aa aaVar) {
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) aaVar, "scheduler is null");
        return a.a(new w(Math.max(0L, j2), timeUnit, aaVar));
    }

    public final f.a.b.b a(f<? super T> fVar, f<? super Throwable> fVar2, f.a.d.a aVar) {
        b.a((Object) fVar, "onSuccess is null");
        b.a((Object) fVar2, "onError is null");
        b.a((Object) aVar, "onComplete is null");
        return (f.a.b.b) c(new f.a.e.e.c.b(fVar, fVar2, aVar));
    }
}
