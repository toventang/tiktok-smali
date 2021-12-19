package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.j.g;
import java.util.List;

public class v extends u {
    static {
        Covode.recordClassIndex(105083);
    }

    public static final <T> List<T> e(List<T> list) {
        l.d(list, "");
        return new al(list);
    }

    public static final int a(List<?> list, int i2) {
        int a2 = n.a((List) list);
        if (i2 >= 0 && a2 >= i2) {
            return n.a((List) list) - i2;
        }
        throw new IndexOutOfBoundsException("Element index " + i2 + " must be in range [" + new g(0, n.a((List) list)) + "].");
    }
}
