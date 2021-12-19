package h.l;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class f<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<T> f158772a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T, T> f158773b;

    static {
        Covode.recordClassIndex(105306);
    }

    @Override // h.l.h
    public final Iterator<T> a() {
        return new a(this);
    }

    public static final class a implements h.f.b.a.a, Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public T f158774a;

        /* renamed from: b  reason: collision with root package name */
        public int f158775b = -2;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f158776c;

        static {
            Covode.recordClassIndex(105307);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f158775b < 0) {
                a();
            }
            if (this.f158775b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f158775b < 0) {
                a();
            }
            if (this.f158775b != 0) {
                T t = this.f158774a;
                Objects.requireNonNull(t, "null cannot be cast to non-null type T");
                this.f158775b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        private final void a() {
            T invoke;
            int i2;
            if (this.f158775b == -2) {
                invoke = this.f158776c.f158772a.invoke();
            } else {
                b<T, T> bVar = this.f158776c.f158773b;
                T t = this.f158774a;
                if (t == null) {
                    l.b();
                }
                invoke = bVar.invoke(t);
            }
            this.f158774a = invoke;
            if (invoke == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            this.f158775b = i2;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(f fVar) {
            this.f158776c = fVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super T, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(h.f.a.a<? extends T> aVar, b<? super T, ? extends T> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        this.f158772a = aVar;
        this.f158773b = bVar;
    }
}
