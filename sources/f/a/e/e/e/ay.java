package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.a.c;
import f.a.e.c.d;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ay {
    static {
        Covode.recordClassIndex(104655);
    }

    public static final class a<T> extends AtomicInteger implements d<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final z<? super T> observer;
        final T value;

        static {
            Covode.recordClassIndex(104656);
        }

        @Override // f.a.e.c.i
        public final void clear() {
            lazySet(3);
        }

        @Override // f.a.b.b
        public final void dispose() {
            set(3);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        @Override // f.a.e.c.i
        public final T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }

        @Override // f.a.e.c.i
        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public a(z<? super T> zVar, T t) {
            this.observer = zVar;
            this.value = t;
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> extends t<R> {

        /* renamed from: a  reason: collision with root package name */
        final T f157506a;

        /* renamed from: b  reason: collision with root package name */
        final g<? super T, ? extends x<? extends R>> f157507b;

        static {
            Covode.recordClassIndex(104657);
        }

        @Override // f.a.t
        public final void a(z<? super R> zVar) {
            try {
                x xVar = (x) f.a.e.b.b.a(this.f157507b.apply(this.f157506a), "The mapper returned a null ObservableSource");
                if (xVar instanceof Callable) {
                    try {
                        Object call = ((Callable) xVar).call();
                        if (call == null) {
                            c.complete(zVar);
                            return;
                        }
                        a aVar = new a(zVar, call);
                        zVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        c.error(th, zVar);
                    }
                } else {
                    xVar.b(zVar);
                }
            } catch (Throwable th2) {
                c.error(th2, zVar);
            }
        }

        b(T t, g<? super T, ? extends x<? extends R>> gVar) {
            this.f157506a = t;
            this.f157507b = gVar;
        }
    }

    public static <T, U> t<U> a(T t, g<? super T, ? extends x<? extends U>> gVar) {
        return f.a.h.a.a(new b(t, gVar));
    }

    public static <T, R> boolean a(x<T> xVar, z<? super R> zVar, g<? super T, ? extends x<? extends R>> gVar) {
        if (!(xVar instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) xVar).call();
            if (obj == 0) {
                c.complete(zVar);
                return true;
            }
            try {
                x xVar2 = (x) f.a.e.b.b.a(gVar.apply(obj), "The mapper returned a null ObservableSource");
                if (xVar2 instanceof Callable) {
                    try {
                        Object call = ((Callable) xVar2).call();
                        if (call == null) {
                            c.complete(zVar);
                            return true;
                        }
                        a aVar = new a(zVar, call);
                        zVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        c.error(th, zVar);
                        return true;
                    }
                } else {
                    xVar2.b(zVar);
                }
                return true;
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                c.error(th2, zVar);
                return true;
            }
        } catch (Throwable th3) {
            f.a.c.b.a(th3);
            c.error(th3, zVar);
            return true;
        }
    }
}
