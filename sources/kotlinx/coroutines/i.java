package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.e;
import h.c.f;
import h.c.g;
import h.f.a.m;
import h.f.b.l;
import kotlinx.coroutines.b.a;
import kotlinx.coroutines.b.b;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.z;

public final /* synthetic */ class i {
    static {
        Covode.recordClassIndex(105638);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.concurrent.atomic.AtomicIntegerFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object a(f fVar, m<? super am, ? super d<? super T>, ? extends Object> mVar, d<? super T> dVar) {
        boolean z;
        Object b2;
        f context = dVar.getContext();
        f plus = context.plus(fVar);
        de.a(plus);
        if (plus == context) {
            t tVar = new t(plus, dVar);
            b2 = b.a(tVar, tVar, mVar);
        } else if (l.a(plus.get(e.f158671b), context.get(e.f158671b))) {
            dc dcVar = new dc(plus, dVar);
            Object a2 = z.a(plus, null);
            try {
                b2 = b.a(dcVar, dcVar, mVar);
            } finally {
                z.b(plus, a2);
            }
        } else {
            bb bbVar = new bb(plus, dVar);
            bbVar.cL_();
            a.a(mVar, bbVar, bbVar);
            while (true) {
                int i2 = bbVar._decision;
                z = true;
                if (i2 == 0) {
                    if (bb.f159037b.compareAndSet(bbVar, 0, 1)) {
                        break;
                    }
                } else if (i2 == 2) {
                    z = false;
                } else {
                    throw new IllegalStateException("Already suspended".toString());
                }
            }
            if (z) {
                b2 = h.c.a.a.COROUTINE_SUSPENDED;
            } else {
                b2 = cf.b(bbVar.p());
                if (b2 instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) b2).cause;
                }
            }
        }
        if (b2 == h.c.a.a.COROUTINE_SUSPENDED) {
            l.d(dVar, "");
        }
        return b2;
    }

    public static /* synthetic */ bz a(am amVar, f fVar, ao aoVar, m mVar, int i2) {
        if ((i2 & 1) != 0) {
            fVar = g.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            aoVar = ao.DEFAULT;
        }
        return g.b(amVar, fVar, aoVar, mVar);
    }

    public static /* synthetic */ av b(am amVar, f fVar, ao aoVar, m mVar, int i2) {
        if ((i2 & 1) != 0) {
            fVar = g.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            aoVar = ao.DEFAULT;
        }
        return g.a(amVar, fVar, aoVar, mVar);
    }
}
