package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import java.util.Iterator;

public abstract class af implements a, Iterator<Integer> {
    static {
        Covode.recordClassIndex(105043);
    }

    public abstract int a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }
}
