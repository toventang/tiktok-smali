package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class l1 extends b.a {
    static {
        Covode.recordClassIndex(105925);
    }

    l1() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        String str2;
        MethodCollector.i(13778);
        try {
            Locale locale = a.f159493a.f159494b.getResources().getConfiguration().locale;
            str2 = locale.getLanguage() + ((String) h.a(16777217, 0, 0, "7d794d", new byte[]{25})) + locale.getCountry();
        } catch (Throwable unused) {
            str2 = null;
        }
        String a2 = z1.a(str2);
        MethodCollector.o(13778);
        return a2;
    }
}
