package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.a.k;
import com.google.c.a.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class an {
    static {
        Covode.recordClassIndex(33401);
    }

    enum b implements Iterator<Object> {
        INSTANCE;

        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            k.b(false, (Object) "no calls to next() since the last call to remove()");
        }

        static {
            Covode.recordClassIndex(33406);
        }
    }

    static final class a<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        static final bs<Object> f53919a = new a(new Object[0]);

        /* renamed from: b  reason: collision with root package name */
        private final T[] f53920b;

        /* renamed from: c  reason: collision with root package name */
        private final int f53921c = 0;

        static {
            Covode.recordClassIndex(33405);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.c.a
        public final T a(int i2) {
            return this.f53920b[this.f53921c + i2];
        }

        private a(T[] tArr) {
            super(0, 0);
            this.f53920b = tArr;
        }
    }

    static <T> T b(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static <T> T a(Iterator<? extends T> it) {
        if (it.hasNext()) {
            return (T) it.next();
        }
        return null;
    }

    static void c(Iterator<?> it) {
        k.a(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> br<T> a(final Iterator<T> it, final l<? super T> lVar) {
        k.a(it);
        k.a(lVar);
        return new b<T>() {
            /* class com.google.c.c.an.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33402);
            }

            /* access modifiers changed from: protected */
            @Override // com.google.c.c.b
            public final T a() {
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (lVar.a(t)) {
                        return t;
                    }
                }
                return (T) b();
            }
        };
    }

    public static <F, T> Iterator<T> a(Iterator<F> it, final f<? super F, ? extends T> fVar) {
        k.a(fVar);
        return new bo<F, T>(it) {
            /* class com.google.c.c.an.AnonymousClass2 */

            static {
                Covode.recordClassIndex(33403);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.bo
            public final T a(F f2) {
                return (T) fVar.a(f2);
            }
        };
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        k.a(collection);
        k.a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
