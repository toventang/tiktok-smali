package h.a;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.List;

public abstract class e<E> extends AbstractList<E> implements h.f.b.a.e, List<E> {
    static {
        Covode.recordClassIndex(105062);
    }

    public abstract int a();

    public abstract E a(int i2);

    protected e() {
    }

    public final int size() {
        return a();
    }

    @Override // java.util.List, java.util.AbstractList
    public final E remove(int i2) {
        return a(i2);
    }
}
