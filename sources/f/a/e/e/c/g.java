package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.k;
import f.a.p;
import f.a.r;

public final class g<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final k<? super T> f157356b;

    static {
        Covode.recordClassIndex(104554);
    }

    static final class a<T> implements b, p<T> {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157357a;

        /* renamed from: b  reason: collision with root package name */
        final k<? super T> f157358b;

        /* renamed from: c  reason: collision with root package name */
        b f157359c;

        static {
            Covode.recordClassIndex(104555);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157359c.isDisposed();
        }

        @Override // f.a.p
        public final void onComplete() {
            this.f157357a.onComplete();
        }

        @Override // f.a.b.b
        public final void dispose() {
            b bVar = this.f157359c;
            this.f157359c = f.a.e.a.b.DISPOSED;
            bVar.dispose();
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.f157357a.onError(th);
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157359c, bVar)) {
                this.f157359c = bVar;
                this.f157357a.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            try {
                if (this.f157358b.a(t)) {
                    this.f157357a.onSuccess(t);
                } else {
                    this.f157357a.onComplete();
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.f157357a.onError(th);
            }
        }

        a(p<? super T> pVar, k<? super T> kVar) {
            this.f157357a = pVar;
            this.f157358b = kVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157348a.a(new a(pVar, this.f157356b));
    }

    public g(r<T> rVar, k<? super T> kVar) {
        super(rVar);
        this.f157356b = kVar;
    }
}
