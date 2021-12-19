package h.l;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import java.util.Iterator;

public final class r<T, R> implements h<R> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f158801a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T, R> f158802b;

    static {
        Covode.recordClassIndex(105333);
    }

    public static final class a implements h.f.b.a.a, Iterator<R> {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f158803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f158804b;

        static {
            Covode.recordClassIndex(105334);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f158803a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return this.f158804b.f158802b.invoke(this.f158803a.next());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(r rVar) {
            this.f158804b = rVar;
            this.f158803a = rVar.f158801a.a();
        }
    }

    @Override // h.l.h
    public final Iterator<R> a() {
        return new a(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public r(h<? extends T> hVar, b<? super T, ? extends R> bVar) {
        l.d(hVar, "");
        l.d(bVar, "");
        this.f158801a = hVar;
        this.f158802b = bVar;
    }
}
