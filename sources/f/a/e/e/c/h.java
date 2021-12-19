package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.k;
import f.a.n;
import f.a.p;

public final class h<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157360a;

    /* renamed from: b  reason: collision with root package name */
    final k<? super T> f157361b;

    static {
        Covode.recordClassIndex(104556);
    }

    static final class a<T> implements ae<T>, b {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157362a;

        /* renamed from: b  reason: collision with root package name */
        final k<? super T> f157363b;

        /* renamed from: c  reason: collision with root package name */
        b f157364c;

        static {
            Covode.recordClassIndex(104557);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157364c.isDisposed();
        }

        @Override // f.a.b.b
        public final void dispose() {
            b bVar = this.f157364c;
            this.f157364c = f.a.e.a.b.DISPOSED;
            bVar.dispose();
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.f157362a.onError(th);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157364c, bVar)) {
                this.f157364c = bVar;
                this.f157362a.onSubscribe(this);
            }
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            try {
                if (this.f157363b.a(t)) {
                    this.f157362a.onSuccess(t);
                } else {
                    this.f157362a.onComplete();
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.f157362a.onError(th);
            }
        }

        a(p<? super T> pVar, k<? super T> kVar) {
            this.f157362a = pVar;
            this.f157363b = kVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157360a.a_(new a(pVar, this.f157361b));
    }

    public h(ag<T> agVar, k<? super T> kVar) {
        this.f157360a = agVar;
        this.f157361b = kVar;
    }
}
