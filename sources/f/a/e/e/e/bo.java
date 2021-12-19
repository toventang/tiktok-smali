package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.c;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;

public final class bo<T, U, R> extends a<T, R> {

    /* renamed from: b  reason: collision with root package name */
    final c<? super T, ? super U, ? extends R> f157579b;

    /* renamed from: c  reason: collision with root package name */
    final x<? extends U> f157580c;

    static {
        Covode.recordClassIndex(104696);
    }

    static final class a<T, U, R> extends AtomicReference<U> implements f.a.b.b, z<T> {
        private static final long serialVersionUID = -312246233408980075L;
        final c<? super T, ? super U, ? extends R> combiner;
        final z<? super R> downstream;
        final AtomicReference<f.a.b.b> other = new AtomicReference<>();
        final AtomicReference<f.a.b.b> upstream = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104697);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this.upstream);
            f.a.e.a.b.dispose(this.other);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed(this.upstream.get());
        }

        @Override // f.a.z
        public final void onComplete() {
            f.a.e.a.b.dispose(this.other);
            this.downstream.onComplete();
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this.upstream, bVar);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            f.a.e.a.b.dispose(this.other);
            this.downstream.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.downstream.onNext(f.a.e.b.b.a(this.combiner.a(t, obj), "The combiner returned a null value"));
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    dispose();
                    this.downstream.onError(th);
                }
            }
        }

        a(z<? super R> zVar, c<? super T, ? super U, ? extends R> cVar) {
            this.downstream = zVar;
            this.combiner = cVar;
        }
    }

    final class b implements z<U> {

        /* renamed from: b  reason: collision with root package name */
        private final a<T, U, R> f157582b;

        static {
            Covode.recordClassIndex(104698);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onNext(U u) {
            this.f157582b.lazySet(u);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this.f157582b.other, bVar);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            a<T, U, R> aVar = this.f157582b;
            f.a.e.a.b.dispose(aVar.upstream);
            aVar.downstream.onError(th);
        }

        b(a<T, U, R> aVar) {
            this.f157582b = aVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super R> zVar) {
        f.a.g.c cVar = new f.a.g.c(zVar);
        a aVar = new a(cVar, this.f157579b);
        cVar.onSubscribe(aVar);
        this.f157580c.b(new b(aVar));
        this.f157412a.b(aVar);
    }

    public bo(x<T> xVar, c<? super T, ? super U, ? extends R> cVar, x<? extends U> xVar2) {
        super(xVar);
        this.f157579b = cVar;
        this.f157580c = xVar2;
    }
}
