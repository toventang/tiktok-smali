package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.c;
import h.k.d;

public class r extends q {
    static {
        Covode.recordClassIndex(105229);
    }

    @Override // h.k.k
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public r(d dVar, String str, String str2) {
        super(NO_RECEIVER, ((d) dVar).a(), str, str2, !(dVar instanceof c) ? 1 : 0);
    }

    public r(Class cls, String str, String str2, int i2) {
        super(NO_RECEIVER, cls, str, str2, i2);
    }

    public r(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
