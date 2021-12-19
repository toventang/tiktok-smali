package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class m extends AtomicReferenceArray<Object> implements b, Runnable, Callable<Object> {

    /* renamed from: a  reason: collision with root package name */
    static final Object f157895a = new Object();

    /* renamed from: b  reason: collision with root package name */
    static final Object f157896b = new Object();

    /* renamed from: c  reason: collision with root package name */
    static final Object f157897c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final Object f157898d = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        Object obj = get(0);
        if (obj == f157895a || obj == f157898d) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(104838);
    }

    @Override // f.a.b.b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f157898d || obj5 == (obj3 = f157896b) || obj5 == (obj4 = f157897c)) {
                break;
            }
            if (get(2) != Thread.currentThread()) {
                z = true;
                obj3 = obj4;
            } else {
                z = false;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f157898d || obj == (obj2 = f157895a) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((a) obj).c(this);
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == f157895a || !compareAndSet(0, obj3, f157898d) || obj3 == null)) {
                ((a) obj3).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f157896b || obj2 == f157897c) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, f157898d));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == f157895a || !compareAndSet(0, obj4, f157898d) || obj4 == null)) {
            ((a) obj4).c(this);
        }
        do {
            obj = get(1);
            if (obj == f157896b || obj == f157897c) {
                return;
            }
        } while (!compareAndSet(1, obj, f157898d));
    }

    public final void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f157898d) {
                if (obj == f157896b) {
                    future.cancel(false);
                    return;
                } else if (obj == f157897c) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public m(Runnable runnable, a aVar) {
        super(3);
        this.actual = runnable;
        lazySet(0, aVar);
    }
}
