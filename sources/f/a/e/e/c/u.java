package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.e.i.f;
import f.a.l;
import f.a.p;
import f.a.r;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.d;

public final class u<T, U> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final b<U> f157403b;

    static {
        Covode.recordClassIndex(104583);
    }

    static final class a<T, U> extends AtomicReference<f.a.b.b> implements f.a.b.b, p<T> {
        private static final long serialVersionUID = -2187421758664251153L;
        final p<? super T> downstream;
        final C4162a<U> other = new C4162a<>(this);

        static {
            Covode.recordClassIndex(104584);
        }

        /* renamed from: f.a.e.e.c.u$a$a  reason: collision with other inner class name */
        static final class C4162a<U> extends AtomicReference<d> implements l<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final a<?, U> parent;

            static {
                Covode.recordClassIndex(104585);
            }

            @Override // org.a.c
            public final void onComplete() {
                this.parent.a();
            }

            C4162a(a<?, U> aVar) {
                this.parent = aVar;
            }

            @Override // org.a.c
            public final void onNext(Object obj) {
                f.cancel(this);
                this.parent.a();
            }

            @Override // org.a.c, f.a.l
            public final void onSubscribe(d dVar) {
                f.setOnce(this, dVar, Long.MAX_VALUE);
            }

            @Override // org.a.c
            public final void onError(Throwable th) {
                a<?, U> aVar = this.parent;
                if (f.a.e.a.b.dispose(aVar)) {
                    aVar.downstream.onError(th);
                } else {
                    f.a.h.a.a(th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (f.a.e.a.b.dispose(this)) {
                this.downstream.onComplete();
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
            f.cancel(this.other);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((f.a.b.b) get());
        }

        @Override // f.a.p
        public final void onComplete() {
            f.cancel(this.other);
            if (getAndSet(f.a.e.a.b.DISPOSED) != f.a.e.a.b.DISPOSED) {
                this.downstream.onComplete();
            }
        }

        @Override // f.a.p
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        a(p<? super T> pVar) {
            this.downstream = pVar;
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            f.cancel(this.other);
            if (getAndSet(f.a.e.a.b.DISPOSED) != f.a.e.a.b.DISPOSED) {
                this.downstream.onError(th);
            } else {
                f.a.h.a.a(th);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            f.cancel(this.other);
            if (getAndSet(f.a.e.a.b.DISPOSED) != f.a.e.a.b.DISPOSED) {
                this.downstream.onSuccess(t);
            }
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.onSubscribe(aVar);
        this.f157403b.a_(aVar.other);
        this.f157348a.a(aVar);
    }

    public u(r<T> rVar, b<U> bVar) {
        super(rVar);
        this.f157403b = bVar;
    }
}
