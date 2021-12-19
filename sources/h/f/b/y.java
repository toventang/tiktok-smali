package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.c;
import h.k.d;

public class y extends x {
    static {
        Covode.recordClassIndex(105236);
    }

    @Override // h.k.k
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public y(d dVar, String str, String str2) {
        super(NO_RECEIVER, ((d) dVar).a(), str, str2, !(dVar instanceof c) ? 1 : 0);
    }

    public y(Class cls, String str, String str2, int i2) {
        super(NO_RECEIVER, cls, str, str2, i2);
    }

    public y(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
