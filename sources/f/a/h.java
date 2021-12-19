package f.a;

import com.bytedance.covode.number.Covode;
import f.a.d.a;
import f.a.d.f;
import f.a.d.g;
import f.a.d.k;
import f.a.e.e.b.aa;
import f.a.e.e.b.ac;
import f.a.e.e.b.d;
import f.a.e.e.b.i;
import f.a.e.e.b.j;
import f.a.e.e.b.m;
import f.a.e.e.b.n;
import f.a.e.e.b.o;
import f.a.e.e.b.p;
import f.a.e.e.b.q;
import f.a.e.e.b.r;
import f.a.e.e.b.s;
import f.a.e.e.b.u;
import f.a.e.e.b.w;
import f.a.e.e.b.y;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.a.b;
import org.a.c;

public abstract class h<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final int f157961a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* access modifiers changed from: protected */
    public abstract void a(c<? super T> cVar);

    public final <R> R a(i<T, ? extends R> iVar) {
        return (R) ((i) f.a.e.b.b.a((Object) iVar, "converter is null")).a(this);
    }

    public final h<T> a(f<? super T> fVar, f<? super Throwable> fVar2, a aVar, a aVar2) {
        f.a.e.b.b.a((Object) fVar, "onNext is null");
        f.a.e.b.b.a((Object) fVar2, "onError is null");
        f.a.e.b.b.a((Object) aVar, "onComplete is null");
        f.a.e.b.b.a((Object) aVar2, "onAfterTerminate is null");
        return f.a.h.a.a(new d(this, fVar, fVar2, aVar, aVar2));
    }

    public final h<T> a(k<? super T> kVar) {
        f.a.e.b.b.a((Object) kVar, "predicate is null");
        return f.a.h.a.a(new f.a.e.e.b.h(this, kVar));
    }

    public final h<T> a(long j2, k<? super Throwable> kVar) {
        if (j2 >= 0) {
            f.a.e.b.b.a((Object) kVar, "predicate is null");
            return f.a.h.a.a(new w(this, j2, kVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j2)));
    }

    public final f.a.b.b a(f<? super T> fVar, f<? super Throwable> fVar2) {
        return a(fVar, fVar2, f.a.e.b.a.f157190c, m.a.INSTANCE);
    }

    public final f.a.b.b a(f<? super T> fVar, f<? super Throwable> fVar2, a aVar, f<? super org.a.d> fVar3) {
        f.a.e.b.b.a((Object) fVar, "onNext is null");
        f.a.e.b.b.a((Object) fVar2, "onError is null");
        f.a.e.b.b.a((Object) aVar, "onComplete is null");
        f.a.e.b.b.a((Object) fVar3, "onSubscribe is null");
        f.a.e.h.c cVar = new f.a.e.h.c(fVar, fVar2, aVar, fVar3);
        a((l) cVar);
        return cVar;
    }

    public final void a(l<? super T> lVar) {
        f.a.e.b.b.a((Object) lVar, "s is null");
        try {
            c<? super T> a2 = f.a.h.a.a(this, lVar);
            f.a.e.b.b.a((Object) a2, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            a((c) a2);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.h.a.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final h<T> a(f<? super T> fVar) {
        f<? super Throwable> fVar2 = f.a.e.b.a.f157191d;
        a aVar = f.a.e.b.a.f157190c;
        return a(fVar, fVar2, aVar, aVar);
    }

    public final <R> h<R> a(g<? super T, ? extends b<? extends R>> gVar) {
        int i2 = f157961a;
        return a(gVar, i2, i2);
    }

    public final h<T> a(aa aaVar) {
        return a(aaVar, f157961a);
    }

    public final h<T> a() {
        int i2 = f157961a;
        f.a.e.b.b.a(i2, "bufferSize");
        return f.a.h.a.a(new r(this, i2, f.a.e.b.a.f157190c));
    }

    public final h<T> c() {
        return f.a.h.a.a(new u(this));
    }

    public final h<T> d() {
        return a(1, f.a.e.b.a.f157195h);
    }

    public final n<T> e() {
        return f.a.h.a.a(new aa(this));
    }

    static {
        Covode.recordClassIndex(104885);
    }

    public final h<T> b() {
        return f.a.h.a.a((h) new s(this));
    }

    public final f.a.b.b b(f<? super T> fVar) {
        return a(fVar, f.a.e.b.a.f157193f, f.a.e.b.a.f157190c, m.a.INSTANCE);
    }

    @Override // org.a.b
    public final void a_(c<? super T> cVar) {
        if (cVar instanceof l) {
            a((l) ((l) cVar));
            return;
        }
        f.a.e.b.b.a((Object) cVar, "s is null");
        a((l) new f.a.e.h.d(cVar));
    }

    public final h<T> b(aa aaVar) {
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        return a(aaVar, !(this instanceof f.a.e.e.b.b));
    }

    public final <R> h<R> b(g<? super T, ? extends R> gVar) {
        f.a.e.b.b.a((Object) gVar, "mapper is null");
        return f.a.h.a.a(new p(this, gVar));
    }

    public static <T> h<T> a(T t) {
        f.a.e.b.b.a((Object) t, "item is null");
        return f.a.h.a.a((h) new o(t));
    }

    public static <T> h<T> a(Callable<? extends T> callable) {
        f.a.e.b.b.a((Object) callable, "supplier is null");
        return f.a.h.a.a((h) new j(callable));
    }

    public static h<Long> a(TimeUnit timeUnit) {
        return a(timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    private h<T> a(aa aaVar, boolean z) {
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new ac(this, aaVar, z));
    }

    private h<T> a(aa aaVar, int i2) {
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        f.a.e.b.b.a(i2, "bufferSize");
        return f.a.h.a.a(new q(this, aaVar, i2));
    }

    public static <T> h<T> a(k<T> kVar, a aVar) {
        f.a.e.b.b.a((Object) kVar, "source is null");
        f.a.e.b.b.a((Object) aVar, "mode is null");
        return f.a.h.a.a(new f.a.e.e.b.b(kVar, aVar));
    }

    private static h<Long> a(TimeUnit timeUnit, aa aaVar) {
        f.a.e.b.b.a((Object) timeUnit, "unit is null");
        f.a.e.b.b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new n(Math.max(0L, 40L), Math.max(0L, 40L), timeUnit, aaVar));
    }

    public final f.a.b.b a(f<? super T> fVar, f<? super Throwable> fVar2, a aVar) {
        return a(fVar, fVar2, aVar, m.a.INSTANCE);
    }

    private <R> h<R> a(g<? super T, ? extends b<? extends R>> gVar, int i2, int i3) {
        f.a.e.b.b.a((Object) gVar, "mapper is null");
        f.a.e.b.b.a(i2, "maxConcurrency");
        f.a.e.b.b.a(i3, "bufferSize");
        if (!(this instanceof f.a.e.c.g)) {
            return f.a.h.a.a(new i(this, gVar, i2, i3));
        }
        Object call = ((f.a.e.c.g) this).call();
        if (call == null) {
            return f.a.h.a.a(f.a.e.e.b.f.f157307b);
        }
        return y.a(call, gVar);
    }
}
