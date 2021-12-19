package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class s0 extends b.a {
    static {
        Covode.recordClassIndex(105951);
    }

    s0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        x1 a2 = x1.a(a.f159493a.f159494b);
        Integer c2 = a2.c();
        if (c2 == null) {
            return null;
        }
        a2.f159565b.add(c2);
        try {
            int size = a2.f159565b.size();
            if (size <= 20) {
                return null;
            }
            ArrayList arrayList = new ArrayList(a2.f159565b.subList(size - 10, size));
            a2.f159565b.clear();
            a2.f159565b = arrayList;
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
