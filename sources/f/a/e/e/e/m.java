package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.a.c;
import f.a.e.b.b;
import f.a.x;
import f.a.z;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class m<T, K> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, K> f157688b;

    /* renamed from: c  reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f157689c;

    static {
        Covode.recordClassIndex(104733);
    }

    static final class a<T, K> extends f.a.e.d.a<T, T> {

        /* renamed from: f  reason: collision with root package name */
        final Collection<? super K> f157690f;

        /* renamed from: g  reason: collision with root package name */
        final g<? super T, K> f157691g;

        static {
            Covode.recordClassIndex(104734);
        }

        @Override // f.a.e.d.a, f.a.e.c.i
        public final void clear() {
            this.f157690f.clear();
            super.clear();
        }

        @Override // f.a.e.d.a, f.a.z
        public final void onComplete() {
            if (!this.f157212d) {
                this.f157212d = true;
                this.f157690f.clear();
                this.f157209a.onComplete();
            }
        }

        @Override // f.a.e.c.i
        public final T poll() {
            T t;
            do {
                t = (T) this.f157211c.poll();
                if (t == null) {
                    break;
                }
            } while (!this.f157690f.add((Object) b.a((Object) this.f157691g.apply(t), "The keySelector returned a null key")));
            return t;
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        @Override // f.a.e.d.a, f.a.z
        public final void onError(Throwable th) {
            if (this.f157212d) {
                f.a.h.a.a(th);
                return;
            }
            this.f157212d = true;
            this.f157690f.clear();
            this.f157209a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157212d) {
                if (this.f157213e == 0) {
                    try {
                        if (this.f157690f.add(b.a((Object) this.f157691g.apply(t), "The keySelector returned a null key"))) {
                            this.f157209a.onNext(t);
                        }
                    } catch (Throwable th) {
                        a(th);
                    }
                } else {
                    this.f157209a.onNext(null);
                }
            }
        }

        a(z<? super T> zVar, g<? super T, K> gVar, Collection<? super K> collection) {
            super(zVar);
            this.f157691g = gVar;
            this.f157690f = collection;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        try {
            this.f157412a.b(new a(zVar, this.f157688b, (Collection) b.a(this.f157689c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            f.a.c.b.a(th);
            c.error(th, zVar);
        }
    }

    public m(x<T> xVar, g<? super T, K> gVar, Callable<? extends Collection<? super K>> callable) {
        super(xVar);
        this.f157688b = gVar;
        this.f157689c = callable;
    }
}
