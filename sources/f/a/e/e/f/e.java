package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicReference;

public final class e<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157763a;

    /* renamed from: b  reason: collision with root package name */
    final f.a.d.a f157764b;

    static {
        Covode.recordClassIndex(104766);
    }

    static final class a<T> extends AtomicReference<f.a.d.a> implements ae<T>, b {
        private static final long serialVersionUID = -8583764624474935784L;
        final ae<? super T> downstream;
        b upstream;

        static {
            Covode.recordClassIndex(104767);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.d.a aVar = (f.a.d.a) getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    f.a.h.a.a(th);
                }
                this.upstream.dispose();
            }
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        a(ae<? super T> aeVar, f.a.d.a aVar) {
            this.downstream = aeVar;
            lazySet(aVar);
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157763a.a_(new a(aeVar, this.f157764b));
    }

    public e(ag<T> agVar, f.a.d.a aVar) {
        this.f157763a = agVar;
        this.f157764b = aVar;
    }
}
