package ms.bd.o;

import com.bytedance.covode.number.Covode;
import ms.bd.o.n;

/* access modifiers changed from: package-private */
public final class q implements n.b {
    static {
        Covode.recordClassIndex(105943);
    }

    q() {
    }

    public static String a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }
}
