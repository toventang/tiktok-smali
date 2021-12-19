package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import h.f.b.l;
import java.util.Iterator;

public final class ae<T> implements a, Iterator<ac<? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    private int f158625a;

    /* renamed from: b  reason: collision with root package name */
    private final Iterator<T> f158626b;

    static {
        Covode.recordClassIndex(105042);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return this.f158626b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i2 = this.f158625a;
        this.f158625a = i2 + 1;
        if (i2 < 0) {
            n.a();
        }
        return new ac(i2, this.f158626b.next());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public ae(Iterator<? extends T> it) {
        l.d(it, "");
        this.f158626b = it;
    }
}
