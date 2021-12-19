package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.d.b;
import f.a.e.c.c;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.concurrent.Callable;

public final class f<T, U> extends ab<U> implements c<U> {

    /* renamed from: a  reason: collision with root package name */
    final x<T> f157645a;

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends U> f157646b;

    /* renamed from: c  reason: collision with root package name */
    final b<? super U, ? super T> f157647c;

    static {
        Covode.recordClassIndex(104713);
    }

    static final class a<T, U> implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super U> f157648a;

        /* renamed from: b  reason: collision with root package name */
        final b<? super U, ? super T> f157649b;

        /* renamed from: c  reason: collision with root package name */
        final U f157650c;

        /* renamed from: d  reason: collision with root package name */
        f.a.b.b f157651d;

        /* renamed from: e  reason: collision with root package name */
        boolean f157652e;

        static {
            Covode.recordClassIndex(104714);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157651d.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157651d.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157652e) {
                this.f157652e = true;
                this.f157648a.onSuccess(this.f157650c);
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.f157651d, bVar)) {
                this.f157651d = bVar;
                this.f157648a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157652e) {
                f.a.h.a.a(th);
                return;
            }
            this.f157652e = true;
            this.f157648a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157652e) {
                try {
                    this.f157649b.a(this.f157650c, t);
                } catch (Throwable th) {
                    this.f157651d.dispose();
                    onError(th);
                }
            }
        }

        a(ae<? super U> aeVar, U u, b<? super U, ? super T> bVar) {
            this.f157648a = aeVar;
            this.f157649b = bVar;
            this.f157650c = u;
        }
    }

    @Override // f.a.e.c.c
    public final t<U> a() {
        return f.a.h.a.a(new e(this.f157645a, this.f157646b, this.f157647c));
    }

    @Override // f.a.ab
    public final void a(ae<? super U> aeVar) {
        try {
            this.f157645a.b(new a(aeVar, f.a.e.b.b.a(this.f157646b.call(), "The initialSupplier returned a null value"), this.f157647c));
        } catch (Throwable th) {
            f.a.e.a.c.error(th, aeVar);
        }
    }

    public f(x<T> xVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        this.f157645a = xVar;
        this.f157646b = callable;
        this.f157647c = bVar;
    }
}
