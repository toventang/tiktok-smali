package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.j.g;
import java.util.List;

final class al<T> extends e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<T> f158627a;

    static {
        Covode.recordClassIndex(105049);
    }

    @Override // h.a.e
    public final int a() {
        return this.f158627a.size();
    }

    public final void clear() {
        this.f158627a.clear();
    }

    public al(List<T> list) {
        l.d(list, "");
        this.f158627a = list;
    }

    @Override // h.a.e
    public final T a(int i2) {
        return this.f158627a.remove(v.a((List<?>) this, i2));
    }

    @Override // java.util.List, java.util.AbstractList
    public final T get(int i2) {
        return this.f158627a.get(v.a((List<?>) this, i2));
    }

    @Override // java.util.List, java.util.AbstractList
    public final T set(int i2, T t) {
        return this.f158627a.set(v.a((List<?>) this, i2), t);
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i2, T t) {
        List<T> list = this.f158627a;
        int size = size();
        if (i2 < 0 || size < i2) {
            throw new IndexOutOfBoundsException("Position index " + i2 + " must be in range [" + new g(0, size()) + "].");
        }
        list.add(size() - i2, t);
    }
}
