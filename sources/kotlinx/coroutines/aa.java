package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.b.a.e;
import h.c.d;
import h.q;
import h.r;
import kotlinx.coroutines.internal.u;

public final class aa {
    static {
        Covode.recordClassIndex(105511);
    }

    public static final <T> Object a(Object obj) {
        Throwable r4 = q.m226exceptionOrNullimpl(obj);
        if (r4 == null) {
            return obj;
        }
        return new CompletedExceptionally(r4, false, 2, null);
    }

    public static final <T> Object a(Object obj, d<? super T> dVar) {
        if (!(obj instanceof CompletedExceptionally)) {
            return q.m223constructorimpl(obj);
        }
        Throwable th = ((CompletedExceptionally) obj).cause;
        if (ar.f159023c && (dVar instanceof e)) {
            th = u.a(th, (e) dVar);
        }
        return q.m223constructorimpl(r.a(th));
    }
}
