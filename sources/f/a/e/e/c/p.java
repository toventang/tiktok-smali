package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.k;
import f.a.r;

public final class p<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final k<? super Throwable> f157379b;

    static {
        Covode.recordClassIndex(104571);
    }

    static final class a<T> implements b, f.a.p<T> {

        /* renamed from: a  reason: collision with root package name */
        final f.a.p<? super T> f157380a;

        /* renamed from: b  reason: collision with root package name */
        final k<? super Throwable> f157381b;

        /* renamed from: c  reason: collision with root package name */
        b f157382c;

        static {
            Covode.recordClassIndex(104572);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157382c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157382c.isDisposed();
        }

        @Override // f.a.p
        public final void onComplete() {
            this.f157380a.onComplete();
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.f157380a.onSuccess(t);
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157382c, bVar)) {
                this.f157382c = bVar;
                this.f157380a.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            try {
                if (this.f157381b.a(th)) {
                    this.f157380a.onComplete();
                } else {
                    this.f157380a.onError(th);
                }
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.f157380a.onError(new f.a.c.a(th, th2));
            }
        }

        a(f.a.p<? super T> pVar, k<? super Throwable> kVar) {
            this.f157380a = pVar;
            this.f157381b = kVar;
        }
    }

    @Override // f.a.n
    public final void b(f.a.p<? super T> pVar) {
        this.f157348a.a(new a(pVar, this.f157379b));
    }

    public p(r<T> rVar, k<? super Throwable> kVar) {
        super(rVar);
        this.f157379b = kVar;
    }
}
