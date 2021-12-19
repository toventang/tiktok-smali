package f.a.e.i;

import com.bytedance.covode.number.Covode;
import f.a.e.c.f;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.c;

public final class d<T> extends AtomicInteger implements f<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final c<? super T> subscriber;
    final T value;

    static {
        Covode.recordClassIndex(104856);
    }

    @Override // f.a.e.c.e
    public final int requestFusion(int i2) {
        return i2 & 1;
    }

    @Override // org.a.d
    public final void cancel() {
        lazySet(2);
    }

    @Override // f.a.e.c.i
    public final void clear() {
        lazySet(1);
    }

    public final boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    @Override // f.a.e.c.i
    public final boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    @Override // f.a.e.c.i
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    @Override // f.a.e.c.i
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.a.d
    public final void request(long j2) {
        if (f.validate(j2) && compareAndSet(0, 1)) {
            c<? super T> cVar = this.subscriber;
            cVar.onNext(this.value);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    public d(c<? super T> cVar, T t) {
        this.subscriber = cVar;
        this.value = t;
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
