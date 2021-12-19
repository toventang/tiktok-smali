package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.a.a;
import h.c.d;
import h.c.f;
import h.f.a.b;
import h.f.a.m;
import h.f.b.ad;
import h.f.b.l;
import h.n;
import h.q;
import h.r;
import h.w;
import h.z;

public enum ao {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    static {
        Covode.recordClassIndex(105537);
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final <T> void invoke(b<? super d<? super T>, ? extends Object> bVar, d<? super T> dVar) {
        int i2 = ap.f159019a[ordinal()];
        if (i2 == 1) {
            try {
                ba.a(h.c.a.b.a(h.c.a.b.a(bVar, dVar)), q.m223constructorimpl(z.f158842a));
            } catch (Throwable th) {
                dVar.resumeWith(q.m223constructorimpl(r.a(th)));
            }
        } else if (i2 == 2) {
            l.d(bVar, "");
            l.d(dVar, "");
            h.c.a.b.a(h.c.a.b.a(bVar, dVar)).resumeWith(q.m223constructorimpl(z.f158842a));
        } else if (i2 == 3) {
            l.d(dVar, "");
            try {
                f context = dVar.getContext();
                Object a2 = kotlinx.coroutines.internal.z.a(context, null);
                if (bVar != null) {
                    try {
                        Object invoke = ((b) ad.b(bVar, 1)).invoke(dVar);
                        kotlinx.coroutines.internal.z.b(context, a2);
                        if (invoke != a.COROUTINE_SUSPENDED) {
                            dVar.resumeWith(q.m223constructorimpl(invoke));
                        }
                    } catch (Throwable th2) {
                        kotlinx.coroutines.internal.z.b(context, a2);
                        throw th2;
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } catch (Throwable th3) {
                dVar.resumeWith(q.m223constructorimpl(r.a(th3)));
            }
        } else if (i2 != 4) {
            throw new n();
        }
    }

    /* JADX INFO: finally extract failed */
    public final <R, T> void invoke(m<? super R, ? super d<? super T>, ? extends Object> mVar, R r, d<? super T> dVar) {
        int i2 = ap.f159020b[ordinal()];
        if (i2 == 1) {
            kotlinx.coroutines.b.a.a(mVar, r, dVar);
        } else if (i2 == 2) {
            l.d(mVar, "");
            l.d(dVar, "");
            h.c.a.b.a(h.c.a.b.a(mVar, r, dVar)).resumeWith(q.m223constructorimpl(z.f158842a));
        } else if (i2 == 3) {
            l.d(dVar, "");
            try {
                f context = dVar.getContext();
                Object a2 = kotlinx.coroutines.internal.z.a(context, null);
                if (mVar != null) {
                    try {
                        Object invoke = ((m) ad.b(mVar, 2)).invoke(r, dVar);
                        kotlinx.coroutines.internal.z.b(context, a2);
                        if (invoke != a.COROUTINE_SUSPENDED) {
                            dVar.resumeWith(q.m223constructorimpl(invoke));
                        }
                    } catch (Throwable th) {
                        kotlinx.coroutines.internal.z.b(context, a2);
                        throw th;
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } catch (Throwable th2) {
                dVar.resumeWith(q.m223constructorimpl(r.a(th2)));
            }
        } else if (i2 != 4) {
            throw new n();
        }
    }
}
