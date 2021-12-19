package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicInteger;

public final class d<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157761a;

    /* renamed from: b  reason: collision with root package name */
    final f.a.d.a f157762b;

    static {
        Covode.recordClassIndex(104764);
    }

    static final class a<T> extends AtomicInteger implements ae<T>, b {
        private static final long serialVersionUID = 4109457741734051389L;
        final ae<? super T> downstream;
        final f.a.d.a onFinally;
        b upstream;

        static {
            Covode.recordClassIndex(104765);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.upstream.dispose();
            a();
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

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
            a();
        }

        a(ae<? super T> aeVar, f.a.d.a aVar) {
            this.downstream = aeVar;
            this.onFinally = aVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157761a.a_(new a(aeVar, this.f157762b));
    }

    public d(ag<T> agVar, f.a.d.a aVar) {
        this.f157761a = agVar;
        this.f157762b = aVar;
    }
}
