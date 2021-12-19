package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.j.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class p extends o {
    static {
        Covode.recordClassIndex(105076);
    }

    public static final void a() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void b() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final <T> int a(List<? extends T> list) {
        l.d(list, "");
        return list.size() - 1;
    }

    public static final <T> List<T> b(T... tArr) {
        l.d(tArr, "");
        if (tArr.length > 0) {
            return i.a((Object[]) tArr);
        }
        return z.INSTANCE;
    }

    public static final g a(Collection<?> collection) {
        l.d(collection, "");
        return new g(0, collection.size() - 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> b(List<? extends T> list) {
        l.d(list, "");
        int size = list.size();
        if (size == 0) {
            return z.INSTANCE;
        }
        if (size != 1) {
            return list;
        }
        return n.a(list.get(0));
    }

    public static final <T> List<T> c(T... tArr) {
        l.d(tArr, "");
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new g(tArr, true));
    }

    public static final <T> ArrayList<T> d(T... tArr) {
        l.d(tArr, "");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new g(tArr, true));
    }

    public static final <T> Collection<T> a(T[] tArr) {
        l.d(tArr, "");
        return new g(tArr, false);
    }
}
