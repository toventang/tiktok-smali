package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class w extends v {
    static {
        Covode.recordClassIndex(105084);
    }

    public static final <T> void f(List<T> list) {
        l.d(list, "");
        Collections.reverse(list);
    }

    public static final <R> List<R> a(Iterable<?> iterable, Class<R> cls) {
        l.d(iterable, "");
        l.d(cls, "");
        return (List) n.a(iterable, new ArrayList(), cls);
    }

    public static final <C extends Collection<? super R>, R> C a(Iterable<?> iterable, C c2, Class<R> cls) {
        l.d(iterable, "");
        l.d(c2, "");
        l.d(cls, "");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c2.add(obj);
            }
        }
        return c2;
    }
}
