package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.a.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class am {
    static {
        Covode.recordClassIndex(33398);
    }

    static <E> Collection<E> b(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return ap.a(iterable.iterator());
    }

    public static <T> T c(Iterable<? extends T> iterable) {
        return (T) an.a(iterable.iterator());
    }

    static Object[] a(Iterable<?> iterable) {
        return b(iterable).toArray();
    }

    public static <T> Iterable<T> a(final Iterable<T> iterable, final l<? super T> lVar) {
        k.a(iterable);
        k.a(lVar);
        return new s<T>() {
            /* class com.google.c.c.am.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33399);
            }

            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return an.a(iterable.iterator(), lVar);
            }
        };
    }

    static <T> boolean a(List<T> list, l<? super T> lVar) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            T t = list.get(i2);
            if (!lVar.a(t)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, t);
                    } catch (UnsupportedOperationException unused) {
                        a(list, lVar, i3, i2);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        a(list, lVar, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        if (i2 != i3) {
            return true;
        }
        return false;
    }

    private static <T> void a(List<T> list, l<? super T> lVar, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (lVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }
}
