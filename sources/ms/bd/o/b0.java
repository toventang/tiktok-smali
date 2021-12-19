package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b0 {
    static {
        Covode.recordClassIndex(105889);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a() {
        MethodCollector.i(8956);
        boolean a2 = a(h.a(16777217, 0, 0, "3af1fb", new byte[]{33, 108, 24, 11, 91, 108, 36, 69, 51, 96, 44, 96, 16, 11, 77, 97, 62, 69, 35, 47, 22, 87, 59, 64, 77, 92, 62, 73, 35}));
        MethodCollector.o(8956);
        return a2;
    }

    static boolean a(String... strArr) {
        boolean z;
        boolean z2;
        int i2 = 0;
        do {
            try {
                Class.forName(strArr[0]);
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            z2 = z & true;
            if (!z2) {
                break;
            }
            i2++;
        } while (i2 <= 0);
        return z2;
    }
}
