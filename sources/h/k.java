package h;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;

public class k {
    static {
        Covode.recordClassIndex(105278);
    }

    public static final <T> h<T> a(a<? extends T> aVar) {
        l.d(aVar, "");
        return new t(aVar, (byte) 0);
    }

    public static final <T> h<T> a(m mVar, a<? extends T> aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        int i2 = j.f158741a[mVar.ordinal()];
        if (i2 == 1) {
            return new t(aVar, (byte) 0);
        }
        if (i2 == 2) {
            return new s(aVar);
        }
        if (i2 == 3) {
            return new aa(aVar);
        }
        throw new n();
    }
}
