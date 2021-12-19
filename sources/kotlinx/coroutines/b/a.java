package kotlinx.coroutines.b;

import com.bytedance.covode.number.Covode;
import h.c.a.b;
import h.c.d;
import h.f.a.m;
import h.q;
import h.r;
import h.z;
import kotlinx.coroutines.ba;

public final class a {
    static {
        Covode.recordClassIndex(105552);
    }

    public static final void a(d<? super z> dVar, d<?> dVar2) {
        try {
            ba.a(b.a(dVar), q.m223constructorimpl(z.f158842a));
        } catch (Throwable th) {
            dVar2.resumeWith(q.m223constructorimpl(r.a(th)));
        }
    }

    public static final <R, T> void a(m<? super R, ? super d<? super T>, ? extends Object> mVar, R r, d<? super T> dVar) {
        try {
            ba.a(b.a(b.a(mVar, r, dVar)), q.m223constructorimpl(z.f158842a));
        } catch (Throwable th) {
            dVar.resumeWith(q.m223constructorimpl(r.a(th)));
        }
    }
}
