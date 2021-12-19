package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.c;
import h.k.d;

public class p extends o {
    static {
        Covode.recordClassIndex(105227);
    }

    @Override // h.k.j
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().call(obj);
    }

    public p(d dVar, String str, String str2) {
        super(NO_RECEIVER, ((d) dVar).a(), str, str2, !(dVar instanceof c) ? 1 : 0);
    }

    public p(Class cls, String str, String str2, int i2) {
        super(NO_RECEIVER, cls, str, str2, i2);
    }

    public p(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
