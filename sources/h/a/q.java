package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class q extends p {
    static {
        Covode.recordClassIndex(105077);
    }

    public static final <T> List<T> b(Iterable<? extends Iterable<? extends T>> iterable) {
        l.d(iterable, "");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            n.a((Collection) arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static final <T> int a(Iterable<? extends T> iterable, int i2) {
        l.d(iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i2;
    }

    public static final <T> Collection<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        l.d(iterable, "");
        l.d(iterable2, "");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
                return (Collection) iterable;
            }
            Collection<T> collection = (Collection) iterable;
            if (collection.size() <= 2 || !(collection instanceof ArrayList)) {
                return collection;
            }
        }
        return n.j(iterable);
    }
}
