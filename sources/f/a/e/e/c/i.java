package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b;
import f.a.d;
import f.a.d.g;
import f.a.f;
import f.a.p;
import f.a.r;
import java.util.concurrent.atomic.AtomicReference;

public final class i<T> extends b {

    /* renamed from: a  reason: collision with root package name */
    final r<T> f157365a;

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends f> f157366b;

    static {
        Covode.recordClassIndex(104558);
    }

    static final class a<T> extends AtomicReference<f.a.b.b> implements f.a.b.b, d, p<T> {
        private static final long serialVersionUID = -2177128922851101253L;
        final d downstream;
        final g<? super T, ? extends f> mapper;

        static {
            Covode.recordClassIndex(104559);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.p, f.a.d
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((f.a.b.b) get());
        }

        @Override // f.a.p, f.a.d
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.replace(this, bVar);
        }

        @Override // f.a.p, f.a.d
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            try {
                f fVar = (f) f.a.e.b.b.a(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    fVar.a(this);
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                onError(th);
            }
        }

        a(d dVar, g<? super T, ? extends f> gVar) {
            this.downstream = dVar;
            this.mapper = gVar;
        }
    }

    @Override // f.a.b
    public final void b(d dVar) {
        a aVar = new a(dVar, this.f157366b);
        dVar.onSubscribe(aVar);
        this.f157365a.a(aVar);
    }

    public i(r<T> rVar, g<? super T, ? extends f> gVar) {
        this.f157365a = rVar;
        this.f157366b = gVar;
    }
}
