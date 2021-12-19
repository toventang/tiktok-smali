package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.f;
import f.a.p;
import f.a.r;

public final class d<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final f<? super T> f157350b;

    static {
        Covode.recordClassIndex(104549);
    }

    static final class a<T> implements b, p<T> {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157351a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super T> f157352b;

        /* renamed from: c  reason: collision with root package name */
        b f157353c;

        static {
            Covode.recordClassIndex(104550);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157353c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157353c.isDisposed();
        }

        @Override // f.a.p
        public final void onComplete() {
            this.f157351a.onComplete();
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.f157351a.onError(th);
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157353c, bVar)) {
                this.f157353c = bVar;
                this.f157351a.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.f157351a.onSuccess(t);
            try {
                this.f157352b.accept(t);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
        }

        a(p<? super T> pVar, f<? super T> fVar) {
            this.f157351a = pVar;
            this.f157352b = fVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157348a.a(new a(pVar, this.f157350b));
    }

    public d(r<T> rVar, f<? super T> fVar) {
        super(rVar);
        this.f157350b = fVar;
    }
}
