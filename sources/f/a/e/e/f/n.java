package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;

public final class n<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<? extends T> f157789a;

    static {
        Covode.recordClassIndex(104782);
    }

    static final class a<T> implements ae<T>, b {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super T> f157790a;

        /* renamed from: b  reason: collision with root package name */
        b f157791b;

        static {
            Covode.recordClassIndex(104783);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157791b.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157791b.isDisposed();
        }

        a(ae<? super T> aeVar) {
            this.f157790a = aeVar;
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.f157790a.onError(th);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.f157790a.onSuccess(t);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157791b, bVar)) {
                this.f157791b = bVar;
                this.f157790a.onSubscribe(this);
            }
        }
    }

    public n(ag<? extends T> agVar) {
        this.f157789a = agVar;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157789a.a_(new a(aeVar));
    }
}
