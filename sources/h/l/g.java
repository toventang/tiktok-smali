package h.l;

import com.bytedance.covode.number.Covode;
import h.a.ac;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;

public final class g<T> implements h<ac<? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f158777a;

    static {
        Covode.recordClassIndex(105308);
    }

    public static final class a implements h.f.b.a.a, Iterator<ac<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f158778a;

        /* renamed from: b  reason: collision with root package name */
        public int f158779b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f158780c;

        static {
            Covode.recordClassIndex(105309);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f158778a.hasNext();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            int i2 = this.f158779b;
            this.f158779b = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            return new ac(i2, this.f158778a.next());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(g gVar) {
            this.f158780c = gVar;
            this.f158778a = gVar.f158777a.a();
        }
    }

    @Override // h.l.h
    public final Iterator<ac<T>> a() {
        return new a(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.l.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(h<? extends T> hVar) {
        l.d(hVar, "");
        this.f158777a = hVar;
    }
}
