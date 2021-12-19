package h.l;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e<T, R, E> implements h<E> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f158766a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T, R> f158767b;

    /* renamed from: c  reason: collision with root package name */
    public final b<R, Iterator<E>> f158768c;

    static {
        Covode.recordClassIndex(105304);
    }

    public static final class a implements h.f.b.a.a, Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f158769a;

        /* renamed from: b  reason: collision with root package name */
        public Iterator<? extends E> f158770b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f158771c;

        static {
            Covode.recordClassIndex(105305);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (a()) {
                Iterator<? extends E> it = this.f158770b;
                if (it == null) {
                    l.b();
                }
                return (E) it.next();
            }
            throw new NoSuchElementException();
        }

        private final boolean a() {
            Iterator<? extends E> it = this.f158770b;
            if (it != null && !it.hasNext()) {
                this.f158770b = null;
            }
            while (true) {
                if (this.f158770b == null) {
                    if (this.f158769a.hasNext()) {
                        Iterator<E> invoke = this.f158771c.f158768c.invoke(this.f158771c.f158767b.invoke(this.f158769a.next()));
                        if (invoke.hasNext()) {
                            this.f158770b = invoke;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(e eVar) {
            this.f158771c = eVar;
            this.f158769a = eVar.f158766a.a();
        }
    }

    @Override // h.l.h
    public final Iterator<E> a() {
        return new a(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super T, ? extends R> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super R, ? extends java.util.Iterator<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(h<? extends T> hVar, b<? super T, ? extends R> bVar, b<? super R, ? extends Iterator<? extends E>> bVar2) {
        l.d(hVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f158766a = hVar;
        this.f158767b = bVar;
        this.f158768c = bVar2;
    }
}
