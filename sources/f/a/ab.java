package f.a;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.e.b.b;
import f.a.e.c.c;
import f.a.e.d.i;
import f.a.e.e.e.ba;
import f.a.e.e.f.d;
import f.a.e.e.f.e;
import f.a.e.e.f.g;
import f.a.e.e.f.h;
import f.a.e.e.f.j;
import f.a.e.e.f.k;
import f.a.e.e.f.l;
import f.a.e.e.f.m;
import f.a.e.e.f.n;
import f.a.e.e.f.o;
import f.a.e.e.f.p;
import f.a.e.e.f.r;
import f.a.e.e.f.s;
import f.a.e.e.f.t;
import f.a.e.e.f.u;
import f.a.e.e.f.v;
import f.a.e.e.f.x;
import f.a.e.e.f.y;
import f.a.e.e.f.z;
import f.a.h.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class ab<T> implements ag<T> {
    static {
        Covode.recordClassIndex(104363);
    }

    /* access modifiers changed from: protected */
    public abstract void a(ae<? super T> aeVar);

    public static <T> ab<T> a(Callable<? extends T> callable) {
        b.a((Object) callable, "callable is null");
        return a.a(new l(callable));
    }

    public final <R> R a(ac<T, ? extends R> acVar) {
        return (R) ((ac) b.a((Object) acVar, "converter is null")).a(this);
    }

    public final <R> ab<R> a(ah<? super T, ? extends R> ahVar) {
        return a(((ah) b.a((Object) ahVar, "transformer is null")).a(this));
    }

    public final ab<T> a(f.a.d.a aVar) {
        b.a((Object) aVar, "onFinally is null");
        return a.a(new d(this, aVar));
    }

    public final ab<T> a(f<? super f.a.b.b> fVar) {
        b.a((Object) fVar, "onSubscribe is null");
        return a.a(new h(this, fVar));
    }

    public final ab<T> a(f.a.d.b<? super T, ? super Throwable> bVar) {
        b.a((Object) bVar, "onEvent is null");
        return a.a(new g(this, bVar));
    }

    public final <R> ab<R> a(f.a.d.g<? super T, ? extends ag<? extends R>> gVar) {
        b.a((Object) gVar, "mapper is null");
        return a.a(new k(this, gVar));
    }

    public final ab<T> a(aa aaVar) {
        b.a((Object) aaVar, "scheduler is null");
        return a.a(new r(this, aaVar));
    }

    public final f.a.b.b a(f<? super T> fVar, f<? super Throwable> fVar2) {
        b.a((Object) fVar, "onSuccess is null");
        b.a((Object) fVar2, "onError is null");
        i iVar = new i(fVar, fVar2);
        a_(iVar);
        return iVar;
    }

    public final ab<T> a(long j2, TimeUnit timeUnit, aa aaVar, ag<? extends T> agVar) {
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) aaVar, "scheduler is null");
        return a.a(new v(this, j2, timeUnit, aaVar, agVar));
    }

    public final ab<T> a(long j2, TimeUnit timeUnit) {
        return a(j2, timeUnit, a.a(f.a.k.a.f158005b), null);
    }

    public final ab<T> cF_() {
        return a.a(new n(this));
    }

    private h<T> e() {
        if (this instanceof f.a.e.c.b) {
            return ((f.a.e.c.b) this).a();
        }
        return a.a(new x(this));
    }

    public final ab<T> b() {
        return a((h) e().d());
    }

    public final t<T> d() {
        if (this instanceof c) {
            return ((c) this).a();
        }
        return a.a(new y(this));
    }

    public final f.a.b.b c() {
        return a(f.a.e.b.a.f157191d, f.a.e.b.a.f157193f);
    }

    public final f.a.b.b d(f<? super T> fVar) {
        return a(fVar, f.a.e.b.a.f157193f);
    }

    public static <T> ab<T> a(af<T> afVar) {
        b.a((Object) afVar, "source is null");
        return a.a(new f.a.e.e.f.a(afVar));
    }

    private static <T> ab<T> b(Callable<? extends Throwable> callable) {
        b.a((Object) callable, "errorSupplier is null");
        return a.a(new j(callable));
    }

    public final ab<T> c(f<? super Throwable> fVar) {
        b.a((Object) fVar, "onError is null");
        return a.a(new f.a.e.e.f.f(this, fVar));
    }

    public final ab<T> d(f.a.d.g<? super Throwable, ? extends ag<? extends T>> gVar) {
        b.a((Object) gVar, "resumeFunctionInCaseOfError is null");
        return a.a(new t(this, gVar));
    }

    private static <T> ab<T> a(ag<T> agVar) {
        b.a((Object) agVar, "source is null");
        if (agVar instanceof ab) {
            return a.a((ab) agVar);
        }
        return a.a(new m(agVar));
    }

    public final <R> ab<R> c(f.a.d.g<? super T, ? extends R> gVar) {
        b.a((Object) gVar, "mapper is null");
        return a.a(new p(this, gVar));
    }

    @Override // f.a.ag
    public final void a_(ae<? super T> aeVar) {
        b.a((Object) aeVar, "subscriber is null");
        ae<? super T> a2 = a.a(this, aeVar);
        b.a((Object) a2, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            a((ae) a2);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.a.c.b.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final ab<T> b(aa aaVar) {
        b.a((Object) aaVar, "scheduler is null");
        return a.a(new u(this, aaVar));
    }

    public final ab<T> b(f.a.d.a aVar) {
        b.a((Object) aVar, "onDispose is null");
        return a.a(new e(this, aVar));
    }

    private static <T> ab<T> a(h<T> hVar) {
        return a.a(new f.a.e.e.b.ab(hVar));
    }

    public final ab<T> b(f<? super T> fVar) {
        b.a((Object) fVar, "onSuccess is null");
        return a.a(new f.a.e.e.f.i(this, fVar));
    }

    public static <T> ab<T> a(x<? extends T> xVar) {
        b.a((Object) xVar, "observableSource is null");
        return a.a(new ba(xVar));
    }

    public final ab<T> b(T t) {
        b.a((Object) t, "value is null");
        return a.a(new s(this, t));
    }

    public static <T> ab<T> a(T t) {
        b.a((Object) t, "value is null");
        return a.a(new o(t));
    }

    public final f.a.b.b b(f.a.d.b<? super T, ? super Throwable> bVar) {
        b.a((Object) bVar, "onCallback is null");
        f.a.e.d.d dVar = new f.a.e.d.d(bVar);
        a_(dVar);
        return dVar;
    }

    public static <T> ab<T> a(Throwable th) {
        b.a((Object) th, "error is null");
        return b((Callable<? extends Throwable>) f.a.e.b.a.a(th));
    }

    public final <R> t<R> b(f.a.d.g<? super T, ? extends x<? extends R>> gVar) {
        b.a((Object) gVar, "mapper is null");
        return a.a(new f.a.e.e.d.a(this, gVar));
    }

    private static <T, R> ab<R> a(f.a.d.g<? super Object[], ? extends R> gVar, ag<? extends T>... agVarArr) {
        b.a((Object) gVar, "zipper is null");
        b.a((Object) agVarArr, "sources is null");
        return a.a(new z(agVarArr, gVar));
    }

    public static <T1, T2, R> ab<R> a(ag<? extends T1> agVar, ag<? extends T2> agVar2, f.a.d.c<? super T1, ? super T2, ? extends R> cVar) {
        b.a((Object) agVar, "source1 is null");
        b.a((Object) agVar2, "source2 is null");
        return a(f.a.e.b.a.a((f.a.d.c) cVar), agVar, agVar2);
    }
}
