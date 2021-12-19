package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class n0 extends b.a {
    static {
        Covode.recordClassIndex(105933);
    }

    n0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        String str2;
        MethodCollector.i(10113);
        try {
            Locale locale = a.f159493a.f159494b.getResources().getConfiguration().locale;
            str2 = locale.getLanguage() + ((String) h.a(16777217, 0, 0, "cb19f9", new byte[]{77})) + locale.getCountry();
        } catch (Throwable unused) {
            str2 = null;
        }
        String a2 = z1.a(str2);
        MethodCollector.o(10113);
        return a2;
    }
}
