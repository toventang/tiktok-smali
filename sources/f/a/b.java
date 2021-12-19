package f.a;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.d.k;
import f.a.e.d.h;
import f.a.e.d.l;
import f.a.e.e.a.c;
import f.a.e.e.a.e;
import f.a.e.e.a.g;
import f.a.e.e.a.i;
import f.a.e.e.a.j;
import f.a.h.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class b implements f {
    static {
        Covode.recordClassIndex(104370);
    }

    /* access modifiers changed from: protected */
    public abstract void b(d dVar);

    public final b a(k<? super Throwable> kVar) {
        f.a.e.b.b.a((Object) kVar, "predicate is null");
        return a.a(new i(this, kVar));
    }

    @Override // f.a.f
    public final void a(d dVar) {
        f.a.e.b.b.a((Object) dVar, "s is null");
        try {
            d a2 = a.a(this, dVar);
            f.a.e.b.b.a((Object) a2, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(a2);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.a.c.b.a(th);
            a.a(th);
            throw b(th);
        }
    }

    public final f.a.b.b cG_() {
        l lVar = new l();
        a(lVar);
        return lVar;
    }

    public static b a(Throwable th) {
        f.a.e.b.b.a((Object) th, "error is null");
        return a.a(new e(th));
    }

    public static b b(Callable<?> callable) {
        f.a.e.b.b.a((Object) callable, "callable is null");
        return a.a(new g(callable));
    }

    private static NullPointerException b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public final f.a.b.b b(f.a.d.a aVar) {
        f.a.e.b.b.a((Object) aVar, "onComplete is null");
        h hVar = new h(aVar);
        a(hVar);
        return hVar;
    }

    public static b a(Callable<? extends f> callable) {
        f.a.e.b.b.a((Object) callable, "completableSupplier");
        return a.a(new f.a.e.e.a.b(callable));
    }

    public final b b(aa aaVar) {
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        return a.a(new f.a.e.e.a.k(this, aaVar));
    }

    public final b a(aa aaVar) {
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        return a.a(new f.a.e.e.a.h(this, aaVar));
    }

    public final b a(f.a.d.a aVar) {
        f<? super f.a.b.b> fVar = f.a.e.b.a.f157191d;
        f.a.d.a aVar2 = f.a.e.b.a.f157190c;
        return a(fVar, fVar, aVar, aVar2, aVar2, f.a.e.b.a.f157190c);
    }

    public final f.a.b.b a(f.a.d.a aVar, f<? super Throwable> fVar) {
        f.a.e.b.b.a((Object) fVar, "onError is null");
        f.a.e.b.b.a((Object) aVar, "onComplete is null");
        h hVar = new h(fVar, aVar);
        a(hVar);
        return hVar;
    }

    public final b a(long j2, TimeUnit timeUnit) {
        return a(j2, timeUnit, a.a(f.a.k.a.f158005b));
    }

    private b a(long j2, TimeUnit timeUnit, aa aaVar) {
        f.a.e.b.b.a((Object) timeUnit, "unit is null");
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        return a.a(new c(this, j2, timeUnit, aaVar));
    }

    private b a(f<? super f.a.b.b> fVar, f<? super Throwable> fVar2, f.a.d.a aVar, f.a.d.a aVar2, f.a.d.a aVar3, f.a.d.a aVar4) {
        f.a.e.b.b.a((Object) fVar, "onSubscribe is null");
        f.a.e.b.b.a((Object) fVar2, "onError is null");
        f.a.e.b.b.a((Object) aVar, "onComplete is null");
        f.a.e.b.b.a((Object) aVar2, "onTerminate is null");
        f.a.e.b.b.a((Object) aVar3, "onAfterTerminate is null");
        f.a.e.b.b.a((Object) aVar4, "onDispose is null");
        return a.a(new j(this, fVar, fVar2, aVar, aVar2, aVar3, aVar4));
    }
}
