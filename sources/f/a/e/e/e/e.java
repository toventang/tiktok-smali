package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.b;
import f.a.e.a.c;
import f.a.x;
import f.a.z;
import java.util.concurrent.Callable;

public final class e<T, U> extends a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends U> f157638b;

    /* renamed from: c  reason: collision with root package name */
    final b<? super U, ? super T> f157639c;

    static {
        Covode.recordClassIndex(104711);
    }

    static final class a<T, U> implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super U> f157640a;

        /* renamed from: b  reason: collision with root package name */
        final b<? super U, ? super T> f157641b;

        /* renamed from: c  reason: collision with root package name */
        final U f157642c;

        /* renamed from: d  reason: collision with root package name */
        f.a.b.b f157643d;

        /* renamed from: e  reason: collision with root package name */
        boolean f157644e;

        static {
            Covode.recordClassIndex(104712);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157643d.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157643d.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157644e) {
                this.f157644e = true;
                this.f157640a.onNext(this.f157642c);
                this.f157640a.onComplete();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.f157643d, bVar)) {
                this.f157643d = bVar;
                this.f157640a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157644e) {
                f.a.h.a.a(th);
                return;
            }
            this.f157644e = true;
            this.f157640a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157644e) {
                try {
                    this.f157641b.a(this.f157642c, t);
                } catch (Throwable th) {
                    this.f157643d.dispose();
                    onError(th);
                }
            }
        }

        a(z<? super U> zVar, U u, b<? super U, ? super T> bVar) {
            this.f157640a = zVar;
            this.f157641b = bVar;
            this.f157642c = u;
        }
    }

    @Override // f.a.t
    public final void a(z<? super U> zVar) {
        try {
            this.f157412a.b(new a(zVar, f.a.e.b.b.a(this.f157638b.call(), "The initialSupplier returned a null value"), this.f157639c));
        } catch (Throwable th) {
            c.error(th, zVar);
        }
    }

    public e(x<T> xVar, Callable<? extends U> callable, b<? super U, ? super T> bVar) {
        super(xVar);
        this.f157638b = callable;
        this.f157639c = bVar;
    }
}
