package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.b.a.e;
import h.c.d;
import h.c.f;
import h.q;
import h.r;
import h.w;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.z;

public final class bd {
    static {
        Covode.recordClassIndex(105557);
    }

    public static final boolean a(int i2) {
        return i2 == 1;
    }

    private static boolean b(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private static final void a(bc<?> bcVar) {
        bl a2 = cw.a();
        if (a2.isUnconfinedLoopActive()) {
            a2.dispatchUnconfined(bcVar);
            return;
        }
        a2.incrementUseCount(true);
        try {
            a(bcVar, bcVar.i(), 2);
            do {
            } while (a2.processUnconfinedEvent());
        } catch (Throwable th) {
            bcVar.a(th, (Throwable) null);
        } finally {
            a2.decrementUseCount(true);
        }
    }

    public static final <T> void a(bc<? super T> bcVar, int i2) {
        d<? super T> i3 = bcVar.i();
        if (!b(i2) || !(i3 instanceof az) || a(i2) != a(bcVar.f159038f)) {
            a(bcVar, i3, i2);
            return;
        }
        ah ahVar = ((az) i3).f159031d;
        f context = i3.getContext();
        if (ahVar.isDispatchNeeded(context)) {
            ahVar.dispatch(context, bcVar);
        } else {
            a(bcVar);
        }
    }

    private static <T> void a(bc<? super T> bcVar, d<? super T> dVar, int i2) {
        Object d2 = bcVar.d();
        Throwable d3 = bc.d(d2);
        if (d3 != null && (!ar.f159023c || !(dVar instanceof e) || (d3 = u.a(d3, (e) dVar)) != null)) {
            d2 = r.a(d3);
        }
        Object r3 = q.m223constructorimpl(d2);
        if (i2 == 0) {
            dVar.resumeWith(r3);
        } else if (i2 == 1) {
            ba.a(dVar, r3);
        } else if (i2 != 2) {
            throw new IllegalStateException("Invalid mode ".concat(String.valueOf(i2)).toString());
        } else if (dVar != null) {
            az azVar = (az) dVar;
            f context = azVar.getContext();
            Object a2 = z.a(context, azVar.f159030b);
            try {
                azVar.f159032e.resumeWith(r3);
            } finally {
                z.b(context, a2);
            }
        } else {
            throw new w("null cannot be cast to non-null type");
        }
    }
}
