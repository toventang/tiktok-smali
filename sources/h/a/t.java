package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class t extends s {
    static {
        Covode.recordClassIndex(105081);
    }

    public static final <T extends Comparable<? super T>> void c(List<T> list) {
        l.d(list, "");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void a(List<T> list, Comparator<? super T> comparator) {
        l.d(list, "");
        l.d(comparator, "");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
