package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.h.a;
import f.a.z;

public class j<T> extends b<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final z<? super T> downstream;
    protected T value;

    static {
        Covode.recordClassIndex(104446);
    }

    @Override // f.a.b.b
    public void dispose() {
        set(4);
        this.value = null;
    }

    @Override // f.a.e.c.i
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // f.a.e.c.i
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    public final boolean tryDispose() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    public final void complete() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.downstream.onComplete();
        }
    }

    @Override // f.a.e.c.i
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    public j(z<? super T> zVar) {
        this.downstream = zVar;
    }

    @Override // f.a.e.c.e
    public final int requestFusion(int i2) {
        if ((i2 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            a.a(th);
            return;
        }
        lazySet(2);
        this.downstream.onError(th);
    }

    public final void complete(T t) {
        int i2 = get();
        if ((i2 & 54) == 0) {
            z<? super T> zVar = this.downstream;
            if (i2 == 8) {
                this.value = t;
                lazySet(16);
                zVar.onNext(null);
            } else {
                lazySet(2);
                zVar.onNext(t);
            }
            if (get() != 4) {
                zVar.onComplete();
            }
        }
    }
}
