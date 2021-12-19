package h.b;

import com.bytedance.covode.number.Covode;

public class b {
    static {
        Covode.recordClassIndex(105095);
    }

    public static final <T extends Comparable<?>> int a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
