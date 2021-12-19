package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.google.c.a.k;
import com.google.c.a.l;
import java.util.Iterator;

public abstract class s<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    private final j<Iterable<E>> f54101a;

    static {
        Covode.recordClassIndex(33534);
    }

    protected s() {
        this.f54101a = j.absent();
    }

    public final Iterable<E> a() {
        return this.f54101a.or(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (E e2 : a()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append((Object) e2);
        }
        return sb.append(']').toString();
    }

    public static <E> s<E> a(final Iterable<E> iterable) {
        if (iterable instanceof s) {
            return (s) iterable;
        }
        return new s<E>(iterable) {
            /* class com.google.c.c.s.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33535);
            }

            @Override // java.lang.Iterable
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    s(Iterable<E> iterable) {
        k.a(iterable);
        this.f54101a = j.fromNullable(this == iterable ? null : iterable);
    }

    public final s<E> a(l<? super E> lVar) {
        return a(am.a(a(), lVar));
    }
}
