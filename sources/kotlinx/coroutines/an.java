package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.a.a;
import h.c.d;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.b.b;
import kotlinx.coroutines.internal.e;
import kotlinx.coroutines.internal.t;

public final class an {
    static {
        Covode.recordClassIndex(105528);
    }

    public static final am a(f fVar) {
        if (fVar.get(bz.f159061c) == null) {
            fVar = fVar.plus(cd.a(null));
        }
        return new e(fVar);
    }

    public static final void b(am amVar) {
        bz bzVar = (bz) amVar.a().get(bz.f159061c);
        if (bzVar != null) {
            bzVar.a((CancellationException) null);
            return;
        }
        throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(amVar)).toString());
    }

    public static final boolean a(am amVar) {
        bz bzVar = (bz) amVar.a().get(bz.f159061c);
        if (bzVar != null) {
            return bzVar.b();
        }
        return true;
    }

    public static final <R> Object a(m<? super am, ? super d<? super R>, ? extends Object> mVar, d<? super R> dVar) {
        t tVar = new t(dVar.getContext(), dVar);
        Object a2 = b.a(tVar, tVar, mVar);
        if (a2 == a.COROUTINE_SUSPENDED) {
            l.d(dVar, "");
        }
        return a2;
    }
}
