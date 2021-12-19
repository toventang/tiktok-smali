package h.a;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.ad;
import h.f.b.l;
import h.l.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;

public class u extends t {
    static {
        Covode.recordClassIndex(105082);
    }

    public static final <T> T d(List<T> list) {
        l.d(list, "");
        if (!list.isEmpty()) {
            return list.remove(n.a((List) list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> boolean a(Iterable<? extends T> iterable, b<? super T, Boolean> bVar) {
        l.d(iterable, "");
        l.d(bVar, "");
        return a(iterable, bVar, true);
    }

    public static final <T> boolean a(Collection<? super T> collection, h<? extends T> hVar) {
        l.d(collection, "");
        l.d(hVar, "");
        Iterator<? extends T> a2 = hVar.a();
        boolean z = false;
        while (a2.hasNext()) {
            if (collection.add((Object) a2.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l.d(collection, "");
        l.d(iterable, "");
        return ad.b(collection).removeAll(n.a((Iterable) iterable, (Iterable) collection));
    }

    public static final <T> boolean c(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l.d(collection, "");
        l.d(iterable, "");
        return ad.b(collection).retainAll(n.a((Iterable) iterable, (Iterable) collection));
    }

    public static final <T> boolean a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        l.d(collection, "");
        l.d(iterable, "");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }

    private static final <T> boolean b(List<T> list, b<? super T, Boolean> bVar) {
        int i2;
        if (!(list instanceof RandomAccess)) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
            return a(ad.a(list), bVar, true);
        }
        int a2 = n.a((List) list);
        if (a2 >= 0) {
            int i3 = 0;
            i2 = 0;
            while (true) {
                T t = list.get(i3);
                if (!bVar.invoke(t).booleanValue()) {
                    if (i2 != i3) {
                        list.set(i2, t);
                    }
                    i2++;
                }
                if (i3 == a2) {
                    break;
                }
                i3++;
            }
        } else {
            i2 = 0;
        }
        if (i2 >= list.size()) {
            return false;
        }
        int a3 = n.a((List) list);
        if (a3 >= i2) {
            while (true) {
                list.remove(a3);
                if (a3 == i2) {
                    break;
                }
                a3--;
            }
        }
        return true;
    }

    public static final <T> boolean a(Collection<? super T> collection, T[] tArr) {
        l.d(collection, "");
        l.d(tArr, "");
        return collection.addAll(i.a((Object[]) tArr));
    }

    public static final <T> boolean a(List<T> list, b<? super T, Boolean> bVar) {
        l.d(list, "");
        l.d(bVar, "");
        return b(list, bVar);
    }

    public static final <T> boolean a(Iterable<? extends T> iterable, b<? super T, Boolean> bVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (bVar.invoke((Object) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
