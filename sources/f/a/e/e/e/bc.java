package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.k;
import f.a.x;
import f.a.z;

public final class bc<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final k<? super T> f157528b;

    static {
        Covode.recordClassIndex(104665);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157529a;

        /* renamed from: b  reason: collision with root package name */
        final k<? super T> f157530b;

        /* renamed from: c  reason: collision with root package name */
        b f157531c;

        /* renamed from: d  reason: collision with root package name */
        boolean f157532d;

        static {
            Covode.recordClassIndex(104666);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157531c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157531c.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157529a.onComplete();
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157529a.onError(th);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157531c, bVar)) {
                this.f157531c = bVar;
                this.f157529a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (this.f157532d) {
                this.f157529a.onNext(t);
                return;
            }
            try {
                if (!this.f157530b.a(t)) {
                    this.f157532d = true;
                    this.f157529a.onNext(t);
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.f157531c.dispose();
                this.f157529a.onError(th);
            }
        }

        a(z<? super T> zVar, k<? super T> kVar) {
            this.f157529a = zVar;
            this.f157530b = kVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157528b));
    }

    public bc(x<T> xVar, k<? super T> kVar) {
        super(xVar);
        this.f157528b = kVar;
    }
}
