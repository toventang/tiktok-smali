package f.a.e.i;

import com.bytedance.covode.number.Covode;
import f.a.e.c.f;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<T> extends AtomicInteger implements f<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    static {
        Covode.recordClassIndex(104853);
    }

    @Override // f.a.e.c.i
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
