package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.x;
import f.a.z;

public final class o<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final f<? super T> f157698b;

    static {
        Covode.recordClassIndex(104737);
    }

    static final class a<T> extends f.a.e.d.a<T, T> {

        /* renamed from: f  reason: collision with root package name */
        final f<? super T> f157699f;

        static {
            Covode.recordClassIndex(104738);
        }

        @Override // f.a.e.c.i
        public final T poll() {
            T t = (T) this.f157211c.poll();
            if (t != null) {
                this.f157699f.accept(t);
            }
            return t;
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157209a.onNext(t);
            if (this.f157213e == 0) {
                try {
                    this.f157699f.accept(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        a(z<? super T> zVar, f<? super T> fVar) {
            super(zVar);
            this.f157699f = fVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157698b));
    }

    public o(x<T> xVar, f<? super T> fVar) {
        super(xVar);
        this.f157698b = fVar;
    }
}
