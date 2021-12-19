package f.a.e.i;

import com.bytedance.covode.number.Covode;
import org.a.c;

public class b<T> extends a<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final c<? super T> downstream;
    protected T value;

    static {
        Covode.recordClassIndex(104854);
    }

    @Override // org.a.d
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // f.a.e.c.i
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final boolean isCancelled() {
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

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    @Override // f.a.e.c.i
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }

    public b(c<? super T> cVar) {
        this.downstream = cVar;
    }

    @Override // f.a.e.c.e
    public final int requestFusion(int i2) {
        if ((i2 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // org.a.d
    public final void request(long j2) {
        T t;
        if (f.validate(j2)) {
            do {
                int i2 = get();
                if ((i2 & -2) == 0) {
                    if (i2 == 1) {
                        if (compareAndSet(1, 3) && (t = this.value) != null) {
                            this.value = null;
                            c<? super T> cVar = this.downstream;
                            cVar.onNext(t);
                            if (get() != 4) {
                                cVar.onComplete();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void complete(T t) {
        int i2 = get();
        while (i2 != 8) {
            if ((i2 & -3) == 0) {
                if (i2 == 2) {
                    lazySet(3);
                    c<? super T> cVar = this.downstream;
                    cVar.onNext(t);
                    if (get() != 4) {
                        cVar.onComplete();
                        return;
                    }
                    return;
                }
                this.value = t;
                if (!compareAndSet(0, 1)) {
                    i2 = get();
                    if (i2 == 4) {
                        this.value = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.value = t;
        lazySet(16);
        c<? super T> cVar2 = this.downstream;
        cVar2.onNext(t);
        if (get() != 4) {
            cVar2.onComplete();
        }
    }
}
