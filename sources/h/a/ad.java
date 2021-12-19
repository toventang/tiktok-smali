package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import h.f.b.l;
import java.util.Iterator;

public final class ad<T> implements a, Iterable<ac<? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<Iterator<T>> f158624a;

    static {
        Covode.recordClassIndex(105041);
    }

    @Override // java.lang.Iterable
    public final Iterator<ac<T>> iterator() {
        return new ae(this.f158624a.invoke());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends java.util.Iterator<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ad(h.f.a.a<? extends Iterator<? extends T>> aVar) {
        l.d(aVar, "");
        this.f158624a = aVar;
    }
}
