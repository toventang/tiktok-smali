package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import kotlinx.coroutines.internal.t;

public final class cs<T> extends t<T> {
    static {
        Covode.recordClassIndex(105610);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean c(Throwable th) {
        return false;
    }

    public cs(f fVar, d<? super T> dVar) {
        super(fVar, dVar);
    }
}
