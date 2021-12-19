package d.a.a;

import com.bytedance.covode.number.Covode;
import h.a.f;
import h.f.b.l;
import java.util.Iterator;

public final class c<E> extends f<E> {

    /* renamed from: a  reason: collision with root package name */
    private final b<E, Boolean> f156543a;

    static {
        Covode.recordClassIndex(103934);
    }

    private /* synthetic */ c() {
        this(false);
    }

    public final void clear() {
        this.f156543a.clear();
    }

    @Override // h.a.f
    public final int a() {
        return this.f156543a.keySet().size();
    }

    public final boolean isEmpty() {
        return this.f156543a.keySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f156543a.keySet().iterator();
    }

    public c(boolean z) {
        this.f156543a = new b<>(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        return l.a((Object) this.f156543a.put(e2, true), (Object) true);
    }

    public final boolean contains(Object obj) {
        return this.f156543a.keySet().contains(obj);
    }

    public final boolean remove(Object obj) {
        return l.a((Object) this.f156543a.remove(obj), (Object) true);
    }
}
