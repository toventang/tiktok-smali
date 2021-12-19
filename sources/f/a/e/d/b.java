package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.e.c.d;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b<T> extends AtomicInteger implements d<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    static {
        Covode.recordClassIndex(104438);
    }

    @Override // f.a.e.c.i
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
