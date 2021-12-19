package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class ap extends ao {
    static {
        Covode.recordClassIndex(105053);
    }

    public static final <T> Set<T> a(Set<? extends T> set, Iterable<? extends T> iterable) {
        l.d(set, "");
        l.d(iterable, "");
        Collection<?> a2 = n.a((Iterable) iterable, (Iterable) set);
        if (a2.isEmpty()) {
            return n.m(set);
        }
        if (a2 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!a2.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a2);
        return linkedHashSet2;
    }
}
