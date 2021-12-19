package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.x;
import f.a.z;

public final class ah<T> extends a<T, T> {
    static {
        Covode.recordClassIndex(104611);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157439a;

        /* renamed from: b  reason: collision with root package name */
        b f157440b;

        static {
            Covode.recordClassIndex(104612);
        }

        @Override // f.a.z
        public final void onNext(T t) {
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157440b.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157440b.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157439a.onComplete();
        }

        a(z<? super T> zVar) {
            this.f157439a = zVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157439a.onError(th);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            this.f157440b = bVar;
            this.f157439a.onSubscribe(this);
        }
    }

    public ah(x<T> xVar) {
        super(xVar);
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar));
    }
}
