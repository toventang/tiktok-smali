package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.x;
import f.a.z;

public final class bb<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f157524b = 1;

    static {
        Covode.recordClassIndex(104663);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157525a;

        /* renamed from: b  reason: collision with root package name */
        long f157526b;

        /* renamed from: c  reason: collision with root package name */
        b f157527c;

        static {
            Covode.recordClassIndex(104664);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157527c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157527c.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157525a.onComplete();
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157525a.onError(th);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157527c, bVar)) {
                this.f157527c = bVar;
                this.f157525a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onNext(T t) {
            long j2 = this.f157526b;
            if (j2 != 0) {
                this.f157526b = j2 - 1;
            } else {
                this.f157525a.onNext(t);
            }
        }

        a(z<? super T> zVar, long j2) {
            this.f157525a = zVar;
            this.f157526b = j2;
        }
    }

    public bb(x<T> xVar) {
        super(xVar);
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157524b));
    }
}
