package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.c;
import h.k.d;

public final class w extends v {
    static {
        Covode.recordClassIndex(105234);
    }

    @Override // h.k.j
    public final Object get() {
        return getGetter().call(new Object[0]);
    }

    public w(d dVar, String str, String str2) {
        super(NO_RECEIVER, ((d) dVar).a(), str, str2, !(dVar instanceof c) ? 1 : 0);
    }

    public w(Class cls, String str, String str2, int i2) {
        super(NO_RECEIVER, cls, str, str2, i2);
    }

    public w(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
