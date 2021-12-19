package h.l;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import h.c.g;
import h.f.b.a.a;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class i<T> extends j<T> implements d<z>, a, Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    public d<? super z> f158781a;

    /* renamed from: b  reason: collision with root package name */
    private int f158782b;

    /* renamed from: c  reason: collision with root package name */
    private T f158783c;

    /* renamed from: d  reason: collision with root package name */
    private Iterator<? extends T> f158784d;

    static {
        Covode.recordClassIndex(105311);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // h.c.d
    public final f getContext() {
        return g.INSTANCE;
    }

    private final Throwable a() {
        int i2 = this.f158782b;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 != 5) {
            return new IllegalStateException("Unexpected state of the iterator: " + this.f158782b);
        }
        return new IllegalStateException("Iterator has failed.");
    }

    @Override // java.util.Iterator
    public final T next() {
        do {
            int i2 = this.f158782b;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    this.f158782b = 1;
                    Iterator<? extends T> it = this.f158784d;
                    if (it == null) {
                        l.b();
                    }
                    return (T) it.next();
                } else if (i2 == 3) {
                    this.f158782b = 0;
                    T t = this.f158783c;
                    this.f158783c = null;
                    return t;
                } else {
                    throw a();
                }
            }
        } while (hasNext());
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        while (true) {
            int i2 = this.f158782b;
            if (i2 != 0) {
                if (i2 == 1) {
                    Iterator<? extends T> it = this.f158784d;
                    if (it == null) {
                        l.b();
                    }
                    if (it.hasNext()) {
                        this.f158782b = 2;
                        return true;
                    }
                    this.f158784d = null;
                } else if (i2 == 2 || i2 == 3) {
                    return true;
                } else {
                    if (i2 == 4) {
                        return false;
                    }
                    throw a();
                }
            }
            this.f158782b = 5;
            d<? super z> dVar = this.f158781a;
            if (dVar == null) {
                l.b();
            }
            this.f158781a = null;
            dVar.resumeWith(q.m223constructorimpl(z.f158842a));
        }
    }

    @Override // h.c.d
    public final void resumeWith(Object obj) {
        r.a(obj);
        this.f158782b = 4;
    }

    @Override // h.l.j
    public final Object a(T t, d<? super z> dVar) {
        this.f158783c = t;
        this.f158782b = 3;
        this.f158781a = dVar;
        h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
        if (aVar == h.c.a.a.COROUTINE_SUSPENDED) {
            l.d(dVar, "");
        }
        if (aVar == h.c.a.a.COROUTINE_SUSPENDED) {
            return aVar;
        }
        return z.f158842a;
    }
}
