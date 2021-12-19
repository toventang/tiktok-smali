package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.p;
import f.a.r;

public final class q<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super Throwable, ? extends T> f157383b;

    static {
        Covode.recordClassIndex(104573);
    }

    static final class a<T> implements b, p<T> {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157384a;

        /* renamed from: b  reason: collision with root package name */
        final g<? super Throwable, ? extends T> f157385b;

        /* renamed from: c  reason: collision with root package name */
        b f157386c;

        static {
            Covode.recordClassIndex(104574);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157386c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157386c.isDisposed();
        }

        @Override // f.a.p
        public final void onComplete() {
            this.f157384a.onComplete();
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.f157384a.onSuccess(t);
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157386c, bVar)) {
                this.f157386c = bVar;
                this.f157384a.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            try {
                this.f157384a.onSuccess(f.a.e.b.b.a(this.f157385b.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.f157384a.onError(new f.a.c.a(th, th2));
            }
        }

        a(p<? super T> pVar, g<? super Throwable, ? extends T> gVar) {
            this.f157384a = pVar;
            this.f157385b = gVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157348a.a(new a(pVar, this.f157383b));
    }

    public q(r<T> rVar, g<? super Throwable, ? extends T> gVar) {
        super(rVar);
        this.f157383b = gVar;
    }
}
