package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.x;
import f.a.z;

public final class ag<T> extends a<T, T> {
    static {
        Covode.recordClassIndex(104609);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157437a;

        /* renamed from: b  reason: collision with root package name */
        b f157438b;

        static {
            Covode.recordClassIndex(104610);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157438b.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157438b.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157437a.onComplete();
        }

        a(z<? super T> zVar) {
            this.f157437a = zVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157437a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157437a.onNext(t);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157438b, bVar)) {
                this.f157438b = bVar;
                this.f157437a.onSubscribe(this);
            }
        }
    }

    public ag(x<T> xVar) {
        super(xVar);
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar));
    }
}
