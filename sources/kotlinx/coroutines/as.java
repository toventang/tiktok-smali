package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.q;
import h.r;

public final class as {
    static {
        Covode.recordClassIndex(105541);
    }

    public static final String a(d<?> dVar) {
        Object obj;
        if (dVar instanceof az) {
            return dVar.toString();
        }
        try {
            obj = q.m223constructorimpl(dVar + '@' + Integer.toHexString(System.identityHashCode(dVar)));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m226exceptionOrNullimpl(obj) != null) {
            obj = dVar.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(dVar));
        }
        return (String) obj;
    }
}
