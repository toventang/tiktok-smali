package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.c.d;
import f.a.e.d.b;
import f.a.x;
import f.a.z;

public final class p<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final f.a.d.a f157700b;

    static {
        Covode.recordClassIndex(104739);
    }

    static final class a<T> extends b<T> implements z<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final z<? super T> downstream;
        final f.a.d.a onFinally;
        d<T> qd;
        boolean syncFused;
        f.a.b.b upstream;

        static {
            Covode.recordClassIndex(104740);
        }

        @Override // f.a.e.c.i
        public final void clear() {
            this.qd.clear();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.upstream.dispose();
            a();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.downstream.onComplete();
            a();
        }

        @Override // f.a.e.c.i
        public final T poll() {
            T poll = this.qd.poll();
            if (poll == null && this.syncFused) {
                a();
            }
            return poll;
        }

        private void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.a();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    f.a.h.a.a(th);
                }
            }
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof d) {
                    this.qd = (d) bVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            d<T> dVar = this.qd;
            boolean z = false;
            if (dVar == null || (i2 & 4) != 0) {
                return 0;
            }
            int requestFusion = dVar.requestFusion(i2);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        a(z<? super T> zVar, f.a.d.a aVar) {
            this.downstream = zVar;
            this.onFinally = aVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157700b));
    }

    public p(x<T> xVar, f.a.d.a aVar) {
        super(xVar);
        this.f157700b = aVar;
    }
}
