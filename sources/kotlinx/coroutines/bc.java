package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.a;
import h.c.b.a.e;
import h.c.d;
import h.c.f;
import h.f.b.l;
import h.q;
import h.r;
import h.w;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.scheduling.h;
import kotlinx.coroutines.scheduling.i;

public abstract class bc<T> extends h {

    /* renamed from: f  reason: collision with root package name */
    public int f159038f;

    static {
        Covode.recordClassIndex(105556);
    }

    public void a(Object obj, Throwable th) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T c(Object obj) {
        return obj;
    }

    public abstract Object d();

    public abstract d<T> i();

    public final void run() {
        Object obj;
        bz bzVar;
        Object obj2;
        i iVar = this.f159203h;
        try {
            d<T> i2 = i();
            if (i2 != null) {
                az azVar = (az) i2;
                d<T> dVar = azVar.f159032e;
                f context = dVar.getContext();
                Object d2 = d();
                Object a2 = z.a(context, azVar.f159030b);
                try {
                    Throwable d3 = d(d2);
                    if (bd.a(this.f159038f)) {
                        bzVar = (bz) context.get(bz.f159061c);
                    } else {
                        bzVar = null;
                    }
                    if (d3 != null) {
                        dVar.resumeWith(q.m223constructorimpl(r.a(d3)));
                    } else if (bzVar == null || bzVar.b()) {
                        dVar.resumeWith(q.m223constructorimpl(c(d2)));
                    } else {
                        Throwable m2 = bzVar.m();
                        a(d2, m2);
                        if (ar.f159023c && (dVar instanceof e)) {
                            m2 = u.a(m2, (e) dVar);
                        }
                        dVar.resumeWith(q.m223constructorimpl(r.a(m2)));
                    }
                    try {
                        iVar.b();
                        obj2 = q.m223constructorimpl(h.z.f158842a);
                    } catch (Throwable th) {
                        obj2 = q.m223constructorimpl(r.a(th));
                    }
                    a((Throwable) null, q.m226exceptionOrNullimpl(obj2));
                    return;
                } finally {
                    z.b(context, a2);
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        } catch (Throwable th2) {
            obj = q.m223constructorimpl(r.a(th2));
        }
        a(th, q.m226exceptionOrNullimpl(obj));
    }

    public bc(int i2) {
        this.f159038f = i2;
    }

    public static Throwable d(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            obj = null;
        }
        CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    public final void a(Throwable th, Throwable th2) {
        if (th == null) {
            if (th2 != null) {
                th = th2;
            } else {
                return;
            }
        } else if (th2 != null) {
            a.a(th, th2);
        }
        String str = "Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
        if (th == null) {
            l.a();
        }
        aj.a(i().getContext(), new aq(str, th));
    }
}
