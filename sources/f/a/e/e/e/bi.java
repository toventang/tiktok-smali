package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.k;
import f.a.x;
import f.a.z;

public final class bi<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final k<? super T> f157551b;

    static {
        Covode.recordClassIndex(104680);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157552a;

        /* renamed from: b  reason: collision with root package name */
        final k<? super T> f157553b;

        /* renamed from: c  reason: collision with root package name */
        b f157554c;

        /* renamed from: d  reason: collision with root package name */
        boolean f157555d;

        static {
            Covode.recordClassIndex(104681);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157554c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157554c.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157555d) {
                this.f157555d = true;
                this.f157552a.onComplete();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157554c, bVar)) {
                this.f157554c = bVar;
                this.f157552a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (!this.f157555d) {
                this.f157555d = true;
                this.f157552a.onError(th);
                return;
            }
            f.a.h.a.a(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157555d) {
                this.f157552a.onNext(t);
                try {
                    if (this.f157553b.a(t)) {
                        this.f157555d = true;
                        this.f157554c.dispose();
                        this.f157552a.onComplete();
                    }
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    this.f157554c.dispose();
                    onError(th);
                }
            }
        }

        a(z<? super T> zVar, k<? super T> kVar) {
            this.f157552a = zVar;
            this.f157553b = kVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157551b));
    }

    public bi(x<T> xVar, k<? super T> kVar) {
        super(xVar);
        this.f157551b = kVar;
    }
}
