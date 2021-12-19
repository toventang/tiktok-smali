package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.p;
import f.a.r;
import java.util.concurrent.atomic.AtomicInteger;

public final class e<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final f.a.d.a f157354b;

    static {
        Covode.recordClassIndex(104551);
    }

    static final class a<T> extends AtomicInteger implements b, p<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final p<? super T> downstream;
        final f.a.d.a onFinally;
        b upstream;

        static {
            Covode.recordClassIndex(104552);
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

        @Override // f.a.p
        public final void onComplete() {
            this.downstream.onComplete();
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

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
            a();
        }

        a(p<? super T> pVar, f.a.d.a aVar) {
            this.downstream = pVar;
            this.onFinally = aVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157348a.a(new a(pVar, this.f157354b));
    }

    public e(r<T> rVar, f.a.d.a aVar) {
        super(rVar);
        this.f157354b = aVar;
    }
}
