package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.g;
import java.util.concurrent.atomic.AtomicReference;

public final class k<T, R> extends ab<R> {

    /* renamed from: a  reason: collision with root package name */
    final ag<? extends T> f157783a;

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends ag<? extends R>> f157784b;

    static {
        Covode.recordClassIndex(104777);
    }

    static final class a<T, R> extends AtomicReference<b> implements ae<T>, b {
        private static final long serialVersionUID = 3258103020495908596L;
        final ae<? super R> downstream;
        final g<? super T, ? extends ag<? extends R>> mapper;

        static {
            Covode.recordClassIndex(104778);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        /* renamed from: f.a.e.e.f.k$a$a  reason: collision with other inner class name */
        static final class C4170a<R> implements ae<R> {

            /* renamed from: a  reason: collision with root package name */
            final AtomicReference<b> f157785a;

            /* renamed from: b  reason: collision with root package name */
            final ae<? super R> f157786b;

            static {
                Covode.recordClassIndex(104779);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                this.f157786b.onError(th);
            }

            @Override // f.a.ae
            public final void onSubscribe(b bVar) {
                f.a.e.a.b.replace(this.f157785a, bVar);
            }

            @Override // f.a.ae
            public final void onSuccess(R r) {
                this.f157786b.onSuccess(r);
            }

            C4170a(AtomicReference<b> atomicReference, ae<? super R> aeVar) {
                this.f157785a = atomicReference;
                this.f157786b = aeVar;
            }
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            try {
                ag agVar = (ag) f.a.e.b.b.a(this.mapper.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    agVar.a_(new C4170a(this, this.downstream));
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.downstream.onError(th);
            }
        }

        a(ae<? super R> aeVar, g<? super T, ? extends ag<? extends R>> gVar) {
            this.downstream = aeVar;
            this.mapper = gVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super R> aeVar) {
        this.f157783a.a_(new a(aeVar, this.f157784b));
    }

    public k(ag<? extends T> agVar, g<? super T, ? extends ag<? extends R>> gVar) {
        this.f157784b = gVar;
        this.f157783a = agVar;
    }
}
