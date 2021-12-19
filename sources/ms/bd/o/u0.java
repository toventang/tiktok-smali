package ms.bd.o;

import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class u0 extends b.a {
    static {
        Covode.recordClassIndex(105962);
    }

    u0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        MethodCollector.i(8336);
        Intent a2 = x1.a(x1.a(a.f159493a.f159494b).f159564a, new IntentFilter((String) h.a(16777217, 0, 0, "343d3f", new byte[]{35, 56, 68, 2, 3, 120, 52, 91, 107, 58, 54, 51, 78, 4, 66, 112, 51, 1, 107, 59, 44, 120, 98, 49, 56, 69, 21, 39, 91, 11, 1, 30, 97, 62, 43, 84, 20})));
        int i2 = -1;
        if (a2 != null) {
            int intExtra = a2.getIntExtra((String) h.a(16777217, 0, 0, "fd2942", new byte[]{100, 114, 64, 89, 30, 54}), -1);
            if (intExtra == 2 || intExtra == 5) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        MethodCollector.o(8336);
        return valueOf;
    }
}
