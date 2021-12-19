package h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;

public final class r {
    static {
        Covode.recordClassIndex(105386);
    }

    public static final Object a(Throwable th) {
        l.d(th, "");
        return new q.b(th);
    }

    public static final void a(Object obj) {
        if (obj instanceof q.b) {
            throw ((q.b) obj).exception;
        }
    }
}
