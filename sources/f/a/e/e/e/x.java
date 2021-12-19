package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.k;
import f.a.z;

public final class x<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final k<? super T> f157742b;

    static {
        Covode.recordClassIndex(104752);
    }

    static final class a<T> extends f.a.e.d.a<T, T> {

        /* renamed from: f  reason: collision with root package name */
        final k<? super T> f157743f;

        static {
            Covode.recordClassIndex(104753);
        }

        @Override // f.a.e.c.i
        public final T poll() {
            T t;
            do {
                t = (T) this.f157211c.poll();
                if (t == null) {
                    break;
                }
            } while (!this.f157743f.a(t));
            return t;
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (this.f157213e == 0) {
                try {
                    if (this.f157743f.a(t)) {
                        this.f157209a.onNext(t);
                    }
                } catch (Throwable th) {
                    a(th);
                }
            } else {
                this.f157209a.onNext(null);
            }
        }

        a(z<? super T> zVar, k<? super T> kVar) {
            super(zVar);
            this.f157743f = kVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157742b));
    }

    public x(f.a.x<T> xVar, k<? super T> kVar) {
        super(xVar);
        this.f157742b = kVar;
    }
}
