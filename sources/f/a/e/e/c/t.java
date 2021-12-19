package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.p;
import f.a.r;
import java.util.concurrent.atomic.AtomicReference;

public final class t<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final r<T> f157399a;

    /* renamed from: b  reason: collision with root package name */
    final ag<? extends T> f157400b;

    static {
        Covode.recordClassIndex(104580);
    }

    static final class a<T> extends AtomicReference<b> implements b, p<T> {
        private static final long serialVersionUID = 4603919676453758899L;
        final ae<? super T> downstream;
        final ag<? extends T> other;

        static {
            Covode.recordClassIndex(104581);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        @Override // f.a.p
        public final void onComplete() {
            Object obj = get();
            if (obj != f.a.e.a.b.DISPOSED && compareAndSet(obj, null)) {
                this.other.a_(new C4161a(this.downstream, this));
            }
        }

        /* renamed from: f.a.e.e.c.t$a$a  reason: collision with other inner class name */
        static final class C4161a<T> implements ae<T> {

            /* renamed from: a  reason: collision with root package name */
            final ae<? super T> f157401a;

            /* renamed from: b  reason: collision with root package name */
            final AtomicReference<b> f157402b;

            static {
                Covode.recordClassIndex(104582);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                this.f157401a.onError(th);
            }

            @Override // f.a.ae
            public final void onSubscribe(b bVar) {
                f.a.e.a.b.setOnce(this.f157402b, bVar);
            }

            @Override // f.a.ae
            public final void onSuccess(T t) {
                this.f157401a.onSuccess(t);
            }

            C4161a(ae<? super T> aeVar, AtomicReference<b> atomicReference) {
                this.f157401a = aeVar;
                this.f157402b = atomicReference;
            }
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        a(ae<? super T> aeVar, ag<? extends T> agVar) {
            this.downstream = aeVar;
            this.other = agVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157399a.a(new a(aeVar, this.f157400b));
    }

    public t(r<T> rVar, ag<? extends T> agVar) {
        this.f157399a = rVar;
        this.f157400b = agVar;
    }
}
