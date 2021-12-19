package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import h.q;
import h.r;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.z;

public final class ba {

    /* renamed from: a  reason: collision with root package name */
    public static final v f159035a = new v("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final v f159036b = new v("REUSABLE_CLAIMED");

    static {
        Covode.recordClassIndex(105554);
    }

    public static final <T> void a(d<? super T> dVar, Object obj) {
        if (dVar instanceof az) {
            az azVar = (az) dVar;
            Object a2 = aa.a(obj);
            if (azVar.f159031d.isDispatchNeeded(azVar.getContext())) {
                azVar.f159029a = a2;
                azVar.f159038f = 1;
                azVar.f159031d.dispatch(azVar.getContext(), azVar);
                return;
            }
            bl a3 = cw.a();
            if (a3.isUnconfinedLoopActive()) {
                azVar.f159029a = a2;
                azVar.f159038f = 1;
                a3.dispatchUnconfined(azVar);
                return;
            }
            a3.incrementUseCount(true);
            try {
                bz bzVar = (bz) azVar.getContext().get(bz.f159061c);
                if (bzVar == null || bzVar.b()) {
                    f context = azVar.getContext();
                    Object a4 = z.a(context, azVar.f159030b);
                    try {
                        azVar.f159032e.resumeWith(obj);
                    } finally {
                        z.b(context, a4);
                    }
                } else {
                    azVar.resumeWith(q.m223constructorimpl(r.a((Throwable) bzVar.m())));
                }
                do {
                } while (a3.processUnconfinedEvent());
            } catch (Throwable th) {
                azVar.a(th, (Throwable) null);
            } finally {
                a3.decrementUseCount(true);
            }
        } else {
            dVar.resumeWith(obj);
        }
    }
}
