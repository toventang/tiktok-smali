package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.p;
import f.a.r;

public final class n<T, R> extends a<T, R> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends R> f157374b;

    static {
        Covode.recordClassIndex(104567);
    }

    static final class a<T, R> implements b, p<T> {

        /* renamed from: a  reason: collision with root package name */
        final p<? super R> f157375a;

        /* renamed from: b  reason: collision with root package name */
        final g<? super T, ? extends R> f157376b;

        /* renamed from: c  reason: collision with root package name */
        b f157377c;

        static {
            Covode.recordClassIndex(104568);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157377c.isDisposed();
        }

        @Override // f.a.p
        public final void onComplete() {
            this.f157375a.onComplete();
        }

        @Override // f.a.b.b
        public final void dispose() {
            b bVar = this.f157377c;
            this.f157377c = f.a.e.a.b.DISPOSED;
            bVar.dispose();
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.f157375a.onError(th);
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157377c, bVar)) {
                this.f157377c = bVar;
                this.f157375a.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            try {
                this.f157375a.onSuccess(f.a.e.b.b.a(this.f157376b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.f157375a.onError(th);
            }
        }

        a(p<? super R> pVar, g<? super T, ? extends R> gVar) {
            this.f157375a = pVar;
            this.f157376b = gVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super R> pVar) {
        this.f157348a.a(new a(pVar, this.f157374b));
    }

    public n(r<T> rVar, g<? super T, ? extends R> gVar) {
        super(rVar);
        this.f157374b = gVar;
    }
}
