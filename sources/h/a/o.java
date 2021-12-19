package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Collections;
import java.util.List;

public class o {
    static {
        Covode.recordClassIndex(105075);
    }

    public static final <T> List<T> a(Iterable<? extends T> iterable) {
        l.d(iterable, "");
        List<T> l2 = n.l(iterable);
        Collections.shuffle(l2);
        return l2;
    }

    public static final <T> List<T> a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        l.b(singletonList, "");
        return singletonList;
    }
}
