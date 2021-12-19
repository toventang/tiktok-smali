package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;

public final class bd<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final aa f157533b;

    static {
        Covode.recordClassIndex(104667);
    }

    static final class a<T> extends AtomicReference<f.a.b.b> implements f.a.b.b, z<T> {
        private static final long serialVersionUID = 8094547886072529208L;
        final z<? super T> downstream;
        final AtomicReference<f.a.b.b> upstream = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104668);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this.upstream);
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((f.a.b.b) get());
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this.upstream, bVar);
        }

        a(z<? super T> zVar) {
            this.downstream = zVar;
        }
    }

    final class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final a<T> f157535b;

        static {
            Covode.recordClassIndex(104669);
        }

        public final void run() {
            bd.this.f157412a.b(this.f157535b);
        }

        b(a<T> aVar) {
            this.f157535b = aVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a aVar = new a(zVar);
        zVar.onSubscribe(aVar);
        f.a.e.a.b.setOnce(aVar, this.f157533b.a(new b(aVar)));
    }

    public bd(x<T> xVar, aa aaVar) {
        super(xVar);
        this.f157533b = aaVar;
    }
}
