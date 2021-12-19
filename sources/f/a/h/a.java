package f.a.h;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.ab;
import f.a.ae;
import f.a.b;
import f.a.d;
import f.a.d.c;
import f.a.d.e;
import f.a.d.f;
import f.a.d.g;
import f.a.h;
import f.a.n;
import f.a.p;
import f.a.t;
import f.a.z;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile f<? super Throwable> f157962a;

    /* renamed from: b  reason: collision with root package name */
    static volatile g<? super Runnable, ? extends Runnable> f157963b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile g<? super Callable<aa>, ? extends aa> f157964c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile g<? super Callable<aa>, ? extends aa> f157965d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile g<? super Callable<aa>, ? extends aa> f157966e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile g<? super Callable<aa>, ? extends aa> f157967f;

    /* renamed from: g  reason: collision with root package name */
    static volatile g<? super aa, ? extends aa> f157968g;

    /* renamed from: h  reason: collision with root package name */
    static volatile g<? super aa, ? extends aa> f157969h;

    /* renamed from: i  reason: collision with root package name */
    public static volatile g<? super aa, ? extends aa> f157970i;

    /* renamed from: j  reason: collision with root package name */
    static volatile g<? super aa, ? extends aa> f157971j;

    /* renamed from: k  reason: collision with root package name */
    static volatile g<? super h, ? extends h> f157972k;

    /* renamed from: l  reason: collision with root package name */
    static volatile g<? super t, ? extends t> f157973l;

    /* renamed from: m  reason: collision with root package name */
    static volatile g<? super f.a.f.a, ? extends f.a.f.a> f157974m;
    static volatile g<? super n, ? extends n> n;
    static volatile g<? super ab, ? extends ab> o;
    static volatile g<? super b, ? extends b> p;
    static volatile c<? super h, ? super org.a.c, ? extends org.a.c> q;
    static volatile c<? super n, ? super p, ? extends p> r;
    static volatile c<? super t, ? super z, ? extends z> s;
    static volatile c<? super ab, ? super ae, ? extends ae> t;
    static volatile c<? super b, ? super d, ? extends d> u;
    static volatile e v;
    public static volatile boolean w;
    public static volatile boolean x;

    static {
        Covode.recordClassIndex(104886);
    }

    public static void a(Throwable th) {
        f<? super Throwable> fVar = f157962a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!b(th)) {
            th = new f.a.c.f(th);
        }
        if (fVar != null) {
            try {
                fVar.accept(th);
                return;
            } catch (Throwable th2) {
                c(th2);
            }
        }
        c(th);
    }

    public static Runnable a(Runnable runnable) {
        f.a.e.b.b.a((Object) runnable, "run is null");
        g<? super Runnable, ? extends Runnable> gVar = f157963b;
        if (gVar == null) {
            return runnable;
        }
        return (Runnable) a(gVar, runnable);
    }

    public static void a(f<? super Throwable> fVar) {
        if (!w) {
            f157962a = fVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static <T> org.a.c<? super T> a(h<T> hVar, org.a.c<? super T> cVar) {
        c<? super h, ? super org.a.c, ? extends org.a.c> cVar2 = q;
        return cVar2 != null ? (org.a.c) a(cVar2, hVar, cVar) : cVar;
    }

    public static <T> z<? super T> a(t<T> tVar, z<? super T> zVar) {
        c<? super t, ? super z, ? extends z> cVar = s;
        return cVar != null ? (z) a(cVar, tVar, zVar) : zVar;
    }

    public static <T> p<? super T> a(n<T> nVar, p<? super T> pVar) {
        c<? super n, ? super p, ? extends p> cVar = r;
        return cVar != null ? (p) a(cVar, nVar, pVar) : pVar;
    }

    public static <T> n<T> a(n<T> nVar) {
        g<? super n, ? extends n> gVar = n;
        return gVar != null ? (n) a(gVar, nVar) : nVar;
    }

    public static <T> h<T> a(h<T> hVar) {
        g<? super h, ? extends h> gVar = f157972k;
        return gVar != null ? (h) a(gVar, hVar) : hVar;
    }

    public static <T> t<T> a(t<T> tVar) {
        g<? super t, ? extends t> gVar = f157973l;
        return gVar != null ? (t) a(gVar, tVar) : tVar;
    }

    public static boolean a() {
        e eVar = v;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.a();
        } catch (Throwable th) {
            throw f.a.e.j.h.a(th);
        }
    }

    private static <T, R> R a(g<T, R> gVar, T t2) {
        try {
            return gVar.apply(t2);
        } catch (Throwable th) {
            throw f.a.e.j.h.a(th);
        }
    }

    private static <T, U, R> R a(c<T, U, R> cVar, T t2, U u2) {
        try {
            return cVar.a(t2, u2);
        } catch (Throwable th) {
            throw f.a.e.j.h.a(th);
        }
    }

    public static aa a(aa aaVar) {
        g<? super aa, ? extends aa> gVar = f157968g;
        if (gVar == null) {
            return aaVar;
        }
        return (aa) a(gVar, aaVar);
    }

    public static aa b(aa aaVar) {
        g<? super aa, ? extends aa> gVar = f157970i;
        if (gVar == null) {
            return aaVar;
        }
        return (aa) a(gVar, aaVar);
    }

    public static aa c(aa aaVar) {
        g<? super aa, ? extends aa> gVar = f157971j;
        if (gVar == null) {
            return aaVar;
        }
        return (aa) a(gVar, aaVar);
    }

    public static aa d(aa aaVar) {
        g<? super aa, ? extends aa> gVar = f157969h;
        if (gVar == null) {
            return aaVar;
        }
        return (aa) a(gVar, aaVar);
    }

    private static void c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static aa a(Callable<aa> callable) {
        try {
            return (aa) f.a.e.b.b.a((Object) callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw f.a.e.j.h.a(th);
        }
    }

    private static boolean b(Throwable th) {
        if (!(th instanceof f.a.c.d) && !(th instanceof f.a.c.c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof f.a.c.a)) {
            return false;
        }
        return true;
    }

    public static <T> ab<T> a(ab<T> abVar) {
        g<? super ab, ? extends ab> gVar = o;
        if (gVar != null) {
            return (ab) a(gVar, abVar);
        }
        return abVar;
    }

    public static b a(b bVar) {
        g<? super b, ? extends b> gVar = p;
        if (gVar != null) {
            return (b) a(gVar, bVar);
        }
        return bVar;
    }

    public static <T> f.a.f.a<T> a(f.a.f.a<T> aVar) {
        g<? super f.a.f.a, ? extends f.a.f.a> gVar = f157974m;
        if (gVar != null) {
            return (f.a.f.a) a(gVar, aVar);
        }
        return aVar;
    }

    public static aa a(g<? super Callable<aa>, ? extends aa> gVar, Callable<aa> callable) {
        return (aa) f.a.e.b.b.a(a((g) gVar, (Object) callable), "Scheduler Callable result can't be null");
    }

    public static <T> ae<? super T> a(ab<T> abVar, ae<? super T> aeVar) {
        c<? super ab, ? super ae, ? extends ae> cVar = t;
        if (cVar != null) {
            return (ae) a(cVar, abVar, aeVar);
        }
        return aeVar;
    }

    public static d a(b bVar, d dVar) {
        c<? super b, ? super d, ? extends d> cVar = u;
        if (cVar != null) {
            return (d) a(cVar, bVar, dVar);
        }
        return dVar;
    }
}
