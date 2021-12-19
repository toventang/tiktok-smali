package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ao extends an {
    static {
        Covode.recordClassIndex(105052);
    }

    public static final <T> Set<T> a(T... tArr) {
        l.d(tArr, "");
        if (tArr.length > 0) {
            return i.l(tArr);
        }
        return ab.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> a(Set<? extends T> set) {
        l.d(set, "");
        int size = set.size();
        if (size == 0) {
            return ab.INSTANCE;
        }
        if (size != 1) {
            return set;
        }
        return am.a(set.iterator().next());
    }

    public static final <T> Set<T> b(T... tArr) {
        l.d(tArr, "");
        return (Set) i.b((Object[]) tArr, (Collection) new LinkedHashSet(ag.a(tArr.length)));
    }

    public static final <T> HashSet<T> c(T... tArr) {
        l.d(tArr, "");
        return (HashSet) i.b((Object[]) tArr, (Collection) new HashSet(ag.a(tArr.length)));
    }
}
