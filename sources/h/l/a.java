package h.l;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<h<T>> f158757a;

    static {
        Covode.recordClassIndex(105299);
    }

    @Override // h.l.h
    public final Iterator<T> a() {
        h<T> andSet = this.f158757a.getAndSet(null);
        if (andSet != null) {
            return andSet.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public a(h<? extends T> hVar) {
        l.d(hVar, "");
        this.f158757a = new AtomicReference<>(hVar);
    }
}
