package h.l;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f158759a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f158760b;

    /* renamed from: c  reason: collision with root package name */
    public final b<T, Boolean> f158761c;

    static {
        Covode.recordClassIndex(105302);
    }

    @Override // h.l.h
    public final Iterator<T> a() {
        return new a(this);
    }

    public static final class a implements h.f.b.a.a, Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f158762a;

        /* renamed from: b  reason: collision with root package name */
        public int f158763b = -1;

        /* renamed from: c  reason: collision with root package name */
        public T f158764c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f158765d;

        static {
            Covode.recordClassIndex(105303);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f158763b == -1) {
                a();
            }
            if (this.f158763b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f158763b == -1) {
                a();
            }
            if (this.f158763b != 0) {
                T t = this.f158764c;
                this.f158764c = null;
                this.f158763b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        private final void a() {
            while (this.f158762a.hasNext()) {
                T next = this.f158762a.next();
                if (this.f158765d.f158761c.invoke(next).booleanValue() == this.f158765d.f158760b) {
                    this.f158764c = next;
                    this.f158763b = 1;
                    return;
                }
            }
            this.f158763b = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f158765d = dVar;
            this.f158762a = dVar.f158759a.a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(h<? extends T> hVar, boolean z, b<? super T, Boolean> bVar) {
        l.d(hVar, "");
        l.d(bVar, "");
        this.f158759a = hVar;
        this.f158760b = z;
        this.f158761c = bVar;
    }
}
