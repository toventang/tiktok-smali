package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.b.b;
import f.a.e.c.c;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.NoSuchElementException;

public final class u<T> extends ab<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    final x<T> f157731a;

    /* renamed from: b  reason: collision with root package name */
    final long f157732b = 0;

    /* renamed from: c  reason: collision with root package name */
    final T f157733c = null;

    static {
        Covode.recordClassIndex(104748);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super T> f157734a;

        /* renamed from: b  reason: collision with root package name */
        final long f157735b;

        /* renamed from: c  reason: collision with root package name */
        final T f157736c;

        /* renamed from: d  reason: collision with root package name */
        b f157737d;

        /* renamed from: e  reason: collision with root package name */
        long f157738e;

        /* renamed from: f  reason: collision with root package name */
        boolean f157739f;

        static {
            Covode.recordClassIndex(104749);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157737d.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157737d.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157739f) {
                this.f157739f = true;
                T t = this.f157736c;
                if (t != null) {
                    this.f157734a.onSuccess(t);
                } else {
                    this.f157734a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157737d, bVar)) {
                this.f157737d = bVar;
                this.f157734a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157739f) {
                f.a.h.a.a(th);
                return;
            }
            this.f157739f = true;
            this.f157734a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157739f) {
                long j2 = this.f157738e;
                if (j2 == this.f157735b) {
                    this.f157739f = true;
                    this.f157737d.dispose();
                    this.f157734a.onSuccess(t);
                    return;
                }
                this.f157738e = j2 + 1;
            }
        }

        a(ae<? super T> aeVar, long j2, T t) {
            this.f157734a = aeVar;
            this.f157735b = j2;
            this.f157736c = t;
        }
    }

    @Override // f.a.e.c.c
    public final t<T> a() {
        return f.a.h.a.a(new s(this.f157731a, this.f157732b, this.f157733c, true));
    }

    public u(x<T> xVar) {
        this.f157731a = xVar;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157731a.b(new a(aeVar, this.f157732b, this.f157733c));
    }
}
