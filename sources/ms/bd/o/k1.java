package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.TimeZone;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class k1 extends b.a {
    static {
        Covode.recordClassIndex(105921);
    }

    k1() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        int i2;
        String str2;
        MethodCollector.i(8701);
        try {
            TimeZone timeZone = TimeZone.getDefault();
            str2 = timeZone.getID();
            try {
                i2 = ((timeZone.getRawOffset() / 60) / 60) / 1000;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
            i2 = 0;
            String str3 = str2 + ((String) h.a(16777217, 0, 0, "6637fd", new byte[]{107})) + i2;
            MethodCollector.o(8701);
            return str3;
        }
        String str32 = str2 + ((String) h.a(16777217, 0, 0, "6637fd", new byte[]{107})) + i2;
        MethodCollector.o(8701);
        return str32;
    }
}
