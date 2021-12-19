package h.l;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class q<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f158796a;

    /* renamed from: b  reason: collision with root package name */
    public final int f158797b = 5;

    static {
        Covode.recordClassIndex(105331);
    }

    @Override // h.l.h
    public final Iterator<T> a() {
        return new a(this);
    }

    public static final class a implements h.f.b.a.a, Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public int f158798a;

        /* renamed from: b  reason: collision with root package name */
        public final Iterator<T> f158799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f158800c;

        static {
            Covode.recordClassIndex(105332);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f158798a <= 0 || !this.f158799b.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i2 = this.f158798a;
            if (i2 != 0) {
                this.f158798a = i2 - 1;
                return this.f158799b.next();
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(q qVar) {
            this.f158800c = qVar;
            this.f158798a = qVar.f158797b;
            this.f158799b = qVar.f158796a.a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public q(h<? extends T> hVar, int i2) {
        l.d(hVar, "");
        this.f158796a = hVar;
    }
}
