package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class f extends b.a {
    static {
        Covode.recordClassIndex(105902);
    }

    f() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        boolean z;
        MethodCollector.i(8952);
        try {
            z = g.a(a.f159493a.f159494b, str, obj.toString());
        } catch (Throwable unused) {
            h.a(16777217, 0, 0, "c291c6", new byte[]{117, 49, 76});
            z = false;
        }
        Boolean bool = new Boolean(z);
        MethodCollector.o(8952);
        return bool;
    }
}
