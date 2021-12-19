package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

public abstract class j<T> implements Serializable {
    private static final long serialVersionUID = 0;

    static {
        Covode.recordClassIndex(33246);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract j<T> or(j<? extends T> jVar);

    public abstract T or(q<? extends T> qVar);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> j<V> transform(f<? super T, V> fVar);

    j() {
    }

    public static <T> j<T> absent() {
        return a.f53675a;
    }

    public static <T> j<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new n(t);
    }

    public static <T> j<T> of(T t) {
        return new n(k.a(t));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends j<? extends T>> iterable) {
        k.a(iterable);
        return new Iterable<T>() {
            /* class com.google.c.a.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33247);
            }

            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return new b<T>() {
                    /* class com.google.c.a.j.AnonymousClass1.AnonymousClass1 */

                    /* renamed from: b  reason: collision with root package name */
                    private final Iterator<? extends j<? extends T>> f53698b;

                    static {
                        Covode.recordClassIndex(33248);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.google.c.a.b
                    public final T a() {
                        while (this.f53698b.hasNext()) {
                            j jVar = (j) this.f53698b.next();
                            if (jVar.isPresent()) {
                                return (T) jVar.get();
                            }
                        }
                        return (T) b();
                    }

                    {
                        this.f53698b = (Iterator) k.a(iterable.iterator());
                    }
                };
            }
        };
    }
}
