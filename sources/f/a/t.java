package f.a;

import com.bytedance.covode.number.Covode;
import f.a.d.c;
import f.a.d.d;
import f.a.d.h;
import f.a.e.b.a;
import f.a.e.b.b;
import f.a.e.d.f;
import f.a.e.d.o;
import f.a.e.e.e.aa;
import f.a.e.e.e.ab;
import f.a.e.e.e.ac;
import f.a.e.e.e.ad;
import f.a.e.e.e.ae;
import f.a.e.e.e.af;
import f.a.e.e.e.ag;
import f.a.e.e.e.ai;
import f.a.e.e.e.aj;
import f.a.e.e.e.ak;
import f.a.e.e.e.al;
import f.a.e.e.e.am;
import f.a.e.e.e.ao;
import f.a.e.e.e.ap;
import f.a.e.e.e.aq;
import f.a.e.e.e.ar;
import f.a.e.e.e.av;
import f.a.e.e.e.aw;
import f.a.e.e.e.ax;
import f.a.e.e.e.ay;
import f.a.e.e.e.bb;
import f.a.e.e.e.bd;
import f.a.e.e.e.be;
import f.a.e.e.e.bg;
import f.a.e.e.e.bj;
import f.a.e.e.e.bk;
import f.a.e.e.e.bl;
import f.a.e.e.e.bn;
import f.a.e.e.e.bp;
import f.a.e.e.e.g;
import f.a.e.e.e.i;
import f.a.e.e.e.j;
import f.a.e.e.e.k;
import f.a.e.e.e.l;
import f.a.e.e.e.n;
import f.a.e.e.e.p;
import f.a.e.e.e.q;
import f.a.e.e.e.r;
import f.a.e.e.e.u;
import f.a.e.e.e.v;
import f.a.e.e.e.w;
import f.a.e.e.e.x;
import f.a.e.e.e.y;
import f.a.e.e.e.z;
import f.a.h.a;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class t<T> implements x<T> {
    static {
        Covode.recordClassIndex(104940);
    }

    /* access modifiers changed from: protected */
    public abstract void a(z<? super T> zVar);

    public static <T> t<T> a(x<? extends T>... xVarArr) {
        return a.a(new g(a((Object[]) xVarArr), f.a.e.b.a.f157188a, h.f157961a, f.a.e.j.g.BOUNDARY));
    }

    private static <T> t<T> a(Iterable<? extends x<? extends T>> iterable, int i2, int i3) {
        return b((Iterable) iterable).a(f.a.e.b.a.f157188a, i2, i3);
    }

    public static <T> t<T> a(w<T> wVar) {
        b.a((Object) wVar, "source is null");
        return a.a(new i(wVar));
    }

    public static <T> t<T> a(Callable<? extends x<? extends T>> callable) {
        b.a((Object) callable, "supplier is null");
        return a.a(new k(callable));
    }

    public static <T> t<T> a(Throwable th) {
        b.a((Object) th, "e is null");
        return b((Callable<? extends Throwable>) f.a.e.b.a.a(th));
    }

    public static <T> t<T> a(T... tArr) {
        b.a((Object) tArr, "items is null");
        if (tArr.length == 0) {
            return a.a(v.f157740a);
        }
        if (tArr.length == 1) {
            return b((Object) tArr[0]);
        }
        return a.a(new aa(tArr));
    }

    public static <T> t<T> a(Future<? extends T> future) {
        b.a((Object) future, "future is null");
        return a.a(new ac(future));
    }

    public static <T> t<T> a(x<? extends T> xVar, x<? extends T> xVar2) {
        b.a((Object) xVar, "source1 is null");
        b.a((Object) xVar2, "source2 is null");
        return a((Object[]) new x[]{xVar, xVar2}).a((f.a.d.g) f.a.e.b.a.f157188a, false, 2);
    }

    public static <T> t<T> a(x<? extends T> xVar, x<? extends T> xVar2, x<? extends T> xVar3) {
        b.a((Object) xVar, "source1 is null");
        b.a((Object) xVar2, "source2 is null");
        b.a((Object) xVar3, "source3 is null");
        return a((Object[]) new x[]{xVar, xVar2, xVar3}).a((f.a.d.g) f.a.e.b.a.f157188a, false, 3);
    }

    public static <T, R> t<R> a(Iterable<? extends x<? extends T>> iterable, f.a.d.g<? super Object[], ? extends R> gVar) {
        b.a((Object) gVar, "zipper is null");
        b.a((Object) iterable, "sources is null");
        return a.a(new bp(null, iterable, gVar, h.f157961a));
    }

    public static <T1, T2, R> t<R> a(x<? extends T1> xVar, x<? extends T2> xVar2, c<? super T1, ? super T2, ? extends R> cVar) {
        b.a((Object) xVar, "source1 is null");
        b.a((Object) xVar2, "source2 is null");
        return a(f.a.e.b.a.a((c) cVar), h.f157961a, xVar, xVar2);
    }

    public static <T1, T2, T3, R> t<R> a(x<? extends T1> xVar, x<? extends T2> xVar2, x<? extends T3> xVar3, h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        b.a((Object) xVar, "source1 is null");
        b.a((Object) xVar2, "source2 is null");
        b.a((Object) xVar3, "source3 is null");
        return a(f.a.e.b.a.a((h) hVar), h.f157961a, xVar, xVar2, xVar3);
    }

    private static <T, R> t<R> a(f.a.d.g<? super Object[], ? extends R> gVar, int i2, x<? extends T>... xVarArr) {
        if (xVarArr.length == 0) {
            return a.a(v.f157740a);
        }
        b.a((Object) gVar, "zipper is null");
        b.a(i2, "bufferSize");
        return a.a(new bp(xVarArr, null, gVar, i2));
    }

    public final <R> R a(u<T, ? extends R> uVar) {
        return (R) ((u) b.a((Object) uVar, "converter is null")).a(this);
    }

    public final T a() {
        f fVar = new f();
        b((z) fVar);
        T t = (T) fVar.a();
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    public final <R> t<R> a(y<? super T, ? extends R> yVar) {
        return e(((y) b.a((Object) yVar, "composer is null")).a(this));
    }

    private <R> t<R> a(f.a.d.g<? super T, ? extends x<? extends R>> gVar, int i2, int i3) {
        b.a((Object) gVar, "mapper is null");
        b.a(i2, "maxConcurrency");
        b.a(i3, "prefetch");
        return a.a(new f.a.e.e.e.h(this, gVar, f.a.e.j.g.BOUNDARY, i2, i3));
    }

    public final <K> t<T> a(f.a.d.g<? super T, K> gVar) {
        b.a((Object) gVar, "keySelector is null");
        return a.a(new n(this, gVar, b.f157208a));
    }

    public final t<T> a(d<? super T, ? super T> dVar) {
        b.a((Object) dVar, "comparer is null");
        return a.a(new n(this, f.a.e.b.a.f157188a, dVar));
    }

    public final t<T> a(f.a.d.a aVar) {
        b.a((Object) aVar, "onFinally is null");
        return a.a(new p(this, aVar));
    }

    private t<T> a(f.a.d.f<? super T> fVar, f.a.d.f<? super Throwable> fVar2, f.a.d.a aVar, f.a.d.a aVar2) {
        b.a((Object) fVar, "onNext is null");
        b.a((Object) fVar2, "onError is null");
        b.a((Object) aVar, "onComplete is null");
        b.a((Object) aVar2, "onAfterTerminate is null");
        return a.a(new q(this, fVar, fVar2, aVar, aVar2));
    }

    public final t<T> a(f.a.d.f<? super f.a.b.b> fVar, f.a.d.a aVar) {
        b.a((Object) fVar, "onSubscribe is null");
        b.a((Object) aVar, "onDispose is null");
        return a.a(new r(this, fVar, aVar));
    }

    public final t<T> a(f.a.d.k<? super T> kVar) {
        b.a((Object) kVar, "predicate is null");
        return a.a(new x(this, kVar));
    }

    public final <R> t<R> a(f.a.d.g<? super T, ? extends x<? extends R>> gVar, boolean z) {
        return a(gVar, z, Integer.MAX_VALUE);
    }

    private <R> t<R> a(f.a.d.g<? super T, ? extends x<? extends R>> gVar, boolean z, int i2, int i3) {
        b.a((Object) gVar, "mapper is null");
        b.a(i2, "maxConcurrency");
        b.a(i3, "bufferSize");
        if (!(this instanceof f.a.e.c.g)) {
            return a.a(new y(this, gVar, z, i2, i3));
        }
        Object call = ((f.a.e.c.g) this).call();
        return call == null ? a.a(v.f157740a) : ay.a(call, gVar);
    }

    public final <U> t<U> b(f.a.d.g<? super T, ? extends Iterable<? extends U>> gVar) {
        b.a((Object) gVar, "mapper is null");
        return a.a(new z(this, gVar));
    }

    private <K, V> t<f.a.f.b<K, V>> a(f.a.d.g<? super T, ? extends K> gVar, f.a.d.g<? super T, ? extends V> gVar2, int i2) {
        b.a((Object) gVar, "keySelector is null");
        b.a((Object) gVar2, "valueSelector is null");
        b.a(i2, "bufferSize");
        return a.a(new af(this, gVar, gVar2, i2));
    }

    public final t<T> a(x<? extends T> xVar) {
        b.a((Object) xVar, "other is null");
        return a(this, xVar);
    }

    public final <U> t<U> a(Class<U> cls) {
        b.a((Object) cls, "clazz is null");
        return a(f.a.e.b.a.a((Class) cls)).b((Class) cls);
    }

    public final t<T> b(x<? extends T> xVar) {
        b.a((Object) xVar, "next is null");
        return e(f.a.e.b.a.b(xVar));
    }

    public final t<T> a(long j2, f.a.d.k<? super Throwable> kVar) {
        if (j2 >= 0) {
            b.a((Object) kVar, "predicate is null");
            return a.a(new av(this, j2, kVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j2)));
    }

    public final f.a.b.b a(f.a.d.f<? super T> fVar, f.a.d.f<? super Throwable> fVar2) {
        return a(fVar, fVar2, f.a.e.b.a.f157190c, f.a.e.b.a.f157191d);
    }

    public final f.a.b.b a(f.a.d.f<? super T> fVar, f.a.d.f<? super Throwable> fVar2, f.a.d.a aVar, f.a.d.f<? super f.a.b.b> fVar3) {
        b.a((Object) fVar, "onNext is null");
        b.a((Object) fVar2, "onError is null");
        b.a((Object) aVar, "onComplete is null");
        b.a((Object) fVar3, "onSubscribe is null");
        o oVar = new o(fVar, fVar2, aVar, fVar3);
        b((z) oVar);
        return oVar;
    }

    @Override // f.a.x
    public final void b(z<? super T> zVar) {
        b.a((Object) zVar, "observer is null");
        try {
            z<? super T> a2 = a.a(this, zVar);
            b.a((Object) a2, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            a(a2);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.a.c.b.a(th);
            a.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final t<T> a(long j2, TimeUnit timeUnit, x<? extends T> xVar, aa aaVar) {
        b.a((Object) timeUnit, "timeUnit is null");
        b.a((Object) aaVar, "scheduler is null");
        return a.a(new bk(this, j2, timeUnit, aaVar, xVar));
    }

    public final h<T> a(a aVar) {
        f.a.e.e.b.k kVar = new f.a.e.e.b.k(this);
        int i2 = AnonymousClass1.f158063a[aVar.ordinal()];
        if (i2 == 1) {
            return kVar.b();
        }
        if (i2 == 2) {
            return kVar.c();
        }
        if (i2 == 3) {
            return kVar;
        }
        if (i2 != 4) {
            return kVar.a();
        }
        return a.a(new f.a.e.e.b.t(kVar));
    }

    public final <U, R> t<R> a(x<? extends U> xVar, c<? super T, ? super U, ? extends R> cVar) {
        b.a((Object) xVar, "other is null");
        return a(this, xVar, cVar);
    }

    public static <T> t<T> a(Iterable<? extends x<? extends T>> iterable) {
        int i2 = h.f157961a;
        return a(iterable, i2, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.t<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final t<T> b(f.a.d.a aVar) {
        f.a.d.f<Object> fVar = f.a.e.b.a.f157191d;
        return a(fVar, fVar, aVar, f.a.e.b.a.f157190c);
    }

    public final t<T> a(f.a.d.f<? super Throwable> fVar) {
        f.a.d.f<? super T> fVar2 = f.a.e.b.a.f157191d;
        f.a.d.a aVar = f.a.e.b.a.f157190c;
        return a(fVar2, fVar, aVar, aVar);
    }

    public final t<T> b(f.a.d.f<? super T> fVar) {
        f.a.d.f<? super Throwable> fVar2 = f.a.e.b.a.f157191d;
        f.a.d.a aVar = f.a.e.b.a.f157190c;
        return a(fVar, fVar2, aVar, aVar);
    }

    public final t<T> a(aa aaVar) {
        return a(aaVar, h.f157961a);
    }

    public final t<T> a(long j2) {
        return a(j2, f.a.e.b.a.f157195h);
    }

    public final f.a.b.b a(f.a.d.f<? super T> fVar, f.a.d.f<? super Throwable> fVar2, f.a.d.a aVar) {
        return a(fVar, fVar2, aVar, f.a.e.b.a.f157191d);
    }

    public final t<T> f() {
        return a.a(new bb(this));
    }

    public final f.a.b.b g() {
        return a(f.a.e.b.a.f157191d, f.a.e.b.a.f157193f, f.a.e.b.a.f157190c, f.a.e.b.a.f157191d);
    }

    public final ab<List<T>> h() {
        b.a(16, "capacityHint");
        return a.a(new bn(this));
    }

    /* renamed from: f.a.t$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f158063a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 104941(0x199ed, float:1.47054E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                f.a.a[] r0 = f.a.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                f.a.t.AnonymousClass1.f158063a = r2
                f.a.a r0 = f.a.a.DROP     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = f.a.t.AnonymousClass1.f158063a     // Catch:{ NoSuchFieldError -> 0x0023 }
                f.a.a r0 = f.a.a.LATEST     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = f.a.t.AnonymousClass1.f158063a     // Catch:{ NoSuchFieldError -> 0x002e }
                f.a.a r0 = f.a.a.MISSING     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f.a.t.AnonymousClass1.f158063a     // Catch:{ NoSuchFieldError -> 0x0039 }
                f.a.a r0 = f.a.a.ERROR     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.t.AnonymousClass1.<clinit>():void");
        }
    }

    public final b d() {
        return a.a(new ai(this));
    }

    public final t<T> c() {
        return a.a(new ag(this));
    }

    public final f.a.f.a<T> e() {
        AtomicReference atomicReference = new AtomicReference();
        return a.a((f.a.f.a) new ar(new ar.c(atomicReference), this, atomicReference));
    }

    public final ab<T> b() {
        return a.a(new u(this));
    }

    public final <E extends z<? super T>> E c(E e2) {
        b((z) e2);
        return e2;
    }

    public final t<T> c(f.a.d.f<? super f.a.b.b> fVar) {
        return a(fVar, f.a.e.b.a.f157190c);
    }

    public final f.a.b.b d(f.a.d.f<? super T> fVar) {
        return a(fVar, f.a.e.b.a.f157193f, f.a.e.b.a.f157190c, f.a.e.b.a.f157191d);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: f.a.t<R>, f.a.t<U> */
    private <U> t<U> b(Class<U> cls) {
        b.a((Object) cls, "clazz is null");
        return (t<R>) d(new a.d(cls));
    }

    public static <T> t<T> c(Iterable<? extends x<? extends T>> iterable) {
        return b((Iterable) iterable).a((f.a.d.g) f.a.e.b.a.f157188a, false);
    }

    public static <T> t<T> b(Iterable<? extends T> iterable) {
        b.a((Object) iterable, "source is null");
        return f.a.h.a.a(new ad(iterable));
    }

    public static <T> t<T> c(Callable<? extends T> callable) {
        b.a((Object) callable, "supplier is null");
        return f.a.h.a.a((t) new ab(callable));
    }

    private static <T> t<T> e(x<T> xVar) {
        b.a((Object) xVar, "source is null");
        if (xVar instanceof t) {
            return f.a.h.a.a((t) xVar);
        }
        return f.a.h.a.a(new ae(xVar));
    }

    public final t<T> g(f.a.d.g<? super t<Throwable>, ? extends x<?>> gVar) {
        b.a((Object) gVar, "handler is null");
        return f.a.h.a.a(new aw(this, gVar));
    }

    public static <T> t<T> b(T t) {
        b.a((Object) t, "The item is null");
        return f.a.h.a.a((t) new al(t));
    }

    public final t<T> f(f.a.d.g<? super Throwable, ? extends T> gVar) {
        b.a((Object) gVar, "valueSupplier is null");
        return f.a.h.a.a(new aq(this, gVar));
    }

    public static <T> t<T> b(Callable<? extends Throwable> callable) {
        b.a((Object) callable, "errorSupplier is null");
        return f.a.h.a.a(new w(callable));
    }

    public final <R> t<R> d(f.a.d.g<? super T, ? extends R> gVar) {
        b.a((Object) gVar, "mapper is null");
        return f.a.h.a.a(new am(this, gVar));
    }

    public final t<T> e(f.a.d.g<? super Throwable, ? extends x<? extends T>> gVar) {
        b.a((Object) gVar, "resumeFunction is null");
        return f.a.h.a.a(new ap(this, gVar, false));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: f.a.t<f.a.f.b<K, V>>, f.a.t<f.a.f.b<K, T>> */
    public final <K> t<f.a.f.b<K, T>> c(f.a.d.g<? super T, ? extends K> gVar) {
        return (t<f.a.f.b<K, V>>) a(gVar, f.a.e.b.a.f157188a, h.f157961a);
    }

    public final t<T> d(x<? extends T> xVar) {
        b.a((Object) xVar, "other is null");
        return f.a.h.a.a(new be(this, xVar));
    }

    public final t<T> b(long j2) {
        if (j2 >= 0) {
            return f.a.h.a.a(new bg(this, j2));
        }
        throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(j2)));
    }

    public final t<T> c(x<? extends T> xVar) {
        b.a((Object) xVar, "next is null");
        return f.a.h.a.a(new ap(this, f.a.e.b.a.b(xVar), true));
    }

    public final t<T> b(aa aaVar) {
        b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new bd(this, aaVar));
    }

    public static t<Long> b(long j2, TimeUnit timeUnit) {
        return a(j2, timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    public final t<T> e(long j2, TimeUnit timeUnit) {
        return e(j2, timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    public final t<T> h(long j2, TimeUnit timeUnit) {
        return a(j2, timeUnit, (x) null, f.a.h.a.a(f.a.k.a.f158005b));
    }

    public final t<T> g(long j2, TimeUnit timeUnit) {
        return f(j2, timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    public final t<T> f(long j2, TimeUnit timeUnit) {
        aa a2 = f.a.h.a.a(f.a.k.a.f158005b);
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) a2, "scheduler is null");
        return f.a.h.a.a(new ax(this, j2, timeUnit, a2));
    }

    public final t<T> d(long j2, TimeUnit timeUnit) {
        return d(j2, timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    public static t<Long> a(long j2, TimeUnit timeUnit) {
        return a(j2, j2, timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    public final t<List<T>> c(long j2, TimeUnit timeUnit) {
        return c(j2, timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    private t<T> a(aa aaVar, int i2) {
        b.a((Object) aaVar, "scheduler is null");
        b.a(i2, "bufferSize");
        return f.a.h.a.a(new ao(this, aaVar, i2));
    }

    private <R> t<R> a(f.a.d.g<? super T, ? extends x<? extends R>> gVar, boolean z, int i2) {
        return a(gVar, z, i2, h.f157961a);
    }

    public final t<T> b(long j2, TimeUnit timeUnit, aa aaVar) {
        return e(j2, timeUnit, aaVar);
    }

    public static t<Long> a(long j2, long j3, TimeUnit timeUnit) {
        return a(j2, j3, timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: f.a.t<U extends java.util.Collection<? super T>>, f.a.t<java.util.List<T>> */
    private t<List<T>> c(long j2, TimeUnit timeUnit, aa aaVar) {
        return (t<U>) a(j2, timeUnit, aaVar, f.a.e.j.b.asCallable());
    }

    private t<T> d(long j2, TimeUnit timeUnit, aa aaVar) {
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new j(this, j2, timeUnit, aaVar));
    }

    private t<T> e(long j2, TimeUnit timeUnit, aa aaVar) {
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new l(this, j2, timeUnit, aaVar));
    }

    private t<T> f(long j2, TimeUnit timeUnit, aa aaVar) {
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new bj(this, j2, timeUnit, aaVar));
    }

    public static t<Long> a(long j2, TimeUnit timeUnit, aa aaVar) {
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new bl(Math.max(j2, 0L), timeUnit, aaVar));
    }

    private static t<Long> a(long j2, long j3, TimeUnit timeUnit, aa aaVar) {
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) aaVar, "scheduler is null");
        return f.a.h.a.a(new aj(Math.max(0L, j2), Math.max(0L, j3), timeUnit, aaVar));
    }

    private <U extends Collection<? super T>> t<U> a(long j2, TimeUnit timeUnit, aa aaVar, Callable<U> callable) {
        b.a((Object) timeUnit, "unit is null");
        b.a((Object) aaVar, "scheduler is null");
        b.a((Object) callable, "bufferSupplier is null");
        b.a(Integer.MAX_VALUE, "count");
        return f.a.h.a.a(new f.a.e.e.e.c(this, j2, j2, timeUnit, aaVar, callable, Integer.MAX_VALUE));
    }

    public static t<Long> a(long j2, long j3, long j4, long j5, TimeUnit timeUnit) {
        return a(j2, j3, j4, j5, timeUnit, f.a.h.a.a(f.a.k.a.f158005b));
    }

    private static t<Long> a(long j2, long j3, long j4, long j5, TimeUnit timeUnit, aa aaVar) {
        if (j3 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(j3)));
        } else if (j3 == 0) {
            return f.a.h.a.a(v.f157740a).b(j4, timeUnit, aaVar);
        } else {
            long j6 = (j3 - 1) + j2;
            if (j2 <= 0 || j6 >= 0) {
                b.a((Object) timeUnit, "unit is null");
                b.a((Object) aaVar, "scheduler is null");
                return f.a.h.a.a(new ak(j2, j6, Math.max(0L, j4), Math.max(0L, j5), timeUnit, aaVar));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }
}
