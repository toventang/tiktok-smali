package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b;
import f.a.d;
import f.a.p;
import f.a.r;

public final class l<T> extends b {

    /* renamed from: a  reason: collision with root package name */
    final r<T> f157370a;

    static {
        Covode.recordClassIndex(104564);
    }

    static final class a<T> implements f.a.b.b, p<T> {

        /* renamed from: a  reason: collision with root package name */
        final d f157371a;

        /* renamed from: b  reason: collision with root package name */
        f.a.b.b f157372b;

        static {
            Covode.recordClassIndex(104565);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157372b.isDisposed();
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157372b.dispose();
            this.f157372b = f.a.e.a.b.DISPOSED;
        }

        @Override // f.a.p
        public final void onComplete() {
            this.f157372b = f.a.e.a.b.DISPOSED;
            this.f157371a.onComplete();
        }

        a(d dVar) {
            this.f157371a = dVar;
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.f157372b = f.a.e.a.b.DISPOSED;
            this.f157371a.onError(th);
        }

        @Override // f.a.p
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.f157372b, bVar)) {
                this.f157372b = bVar;
                this.f157371a.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.f157372b = f.a.e.a.b.DISPOSED;
            this.f157371a.onComplete();
        }
    }

    public l(r<T> rVar) {
        this.f157370a = rVar;
    }

    @Override // f.a.b
    public final void b(d dVar) {
        this.f157370a.a(new a(dVar));
    }
}
