package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.a.a;
import h.c.a.b;
import h.c.d;
import h.c.e;
import h.c.f;
import h.f.b.l;
import h.z;

public final class ay {
    static {
        Covode.recordClassIndex(105549);
    }

    public static final ax a(f fVar) {
        f.b bVar = fVar.get(e.f158671b);
        if (!(bVar instanceof ax)) {
            bVar = null;
        }
        ax axVar = (ax) bVar;
        if (axVar == null) {
            return au.f159027a;
        }
        return axVar;
    }

    public static final Object a(long j2, d<? super z> dVar) {
        if (j2 <= 0) {
            return z.f158842a;
        }
        n nVar = new n(b.a(dVar), 1);
        a(nVar.getContext()).scheduleResumeAfterDelay(j2, nVar);
        Object e2 = nVar.e();
        if (e2 == a.COROUTINE_SUSPENDED) {
            l.d(dVar, "");
        }
        return e2;
    }
}
