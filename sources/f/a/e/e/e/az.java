package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.n;
import f.a.p;
import f.a.x;
import f.a.z;

public final class az<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    final x<T> f157508a;

    static {
        Covode.recordClassIndex(104658);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157509a;

        /* renamed from: b  reason: collision with root package name */
        b f157510b;

        /* renamed from: c  reason: collision with root package name */
        T f157511c;

        /* renamed from: d  reason: collision with root package name */
        boolean f157512d;

        static {
            Covode.recordClassIndex(104659);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157510b.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157510b.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157512d) {
                this.f157512d = true;
                T t = this.f157511c;
                this.f157511c = null;
                if (t == null) {
                    this.f157509a.onComplete();
                } else {
                    this.f157509a.onSuccess(t);
                }
            }
        }

        a(p<? super T> pVar) {
            this.f157509a = pVar;
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157510b, bVar)) {
                this.f157510b = bVar;
                this.f157509a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157512d) {
                f.a.h.a.a(th);
                return;
            }
            this.f157512d = true;
            this.f157509a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157512d) {
                if (this.f157511c != null) {
                    this.f157512d = true;
                    this.f157510b.dispose();
                    this.f157509a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f157511c = t;
            }
        }
    }

    public az(x<T> xVar) {
        this.f157508a = xVar;
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157508a.b(new a(pVar));
    }
}
