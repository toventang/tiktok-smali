package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.b.b;
import f.a.x;
import f.a.z;
import java.util.NoSuchElementException;

public final class ba<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final x<? extends T> f157517a;

    /* renamed from: b  reason: collision with root package name */
    final T f157518b = null;

    static {
        Covode.recordClassIndex(104661);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super T> f157519a;

        /* renamed from: b  reason: collision with root package name */
        final T f157520b;

        /* renamed from: c  reason: collision with root package name */
        b f157521c;

        /* renamed from: d  reason: collision with root package name */
        T f157522d;

        /* renamed from: e  reason: collision with root package name */
        boolean f157523e;

        static {
            Covode.recordClassIndex(104662);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157521c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157521c.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157523e) {
                this.f157523e = true;
                T t = this.f157522d;
                this.f157522d = null;
                if (t == null && (t = this.f157520b) == null) {
                    this.f157519a.onError(new NoSuchElementException());
                } else {
                    this.f157519a.onSuccess(t);
                }
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157521c, bVar)) {
                this.f157521c = bVar;
                this.f157519a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157523e) {
                f.a.h.a.a(th);
                return;
            }
            this.f157523e = true;
            this.f157519a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157523e) {
                if (this.f157522d != null) {
                    this.f157523e = true;
                    this.f157521c.dispose();
                    this.f157519a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f157522d = t;
            }
        }

        a(ae<? super T> aeVar, T t) {
            this.f157519a = aeVar;
            this.f157520b = t;
        }
    }

    public ba(x<? extends T> xVar) {
        this.f157517a = xVar;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157517a.b(new a(aeVar, this.f157518b));
    }
}
