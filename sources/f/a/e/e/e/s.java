package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.x;
import f.a.z;
import java.util.NoSuchElementException;

public final class s<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f157714b;

    /* renamed from: c  reason: collision with root package name */
    final T f157715c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f157716d;

    static {
        Covode.recordClassIndex(104744);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157717a;

        /* renamed from: b  reason: collision with root package name */
        final long f157718b;

        /* renamed from: c  reason: collision with root package name */
        final T f157719c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f157720d;

        /* renamed from: e  reason: collision with root package name */
        b f157721e;

        /* renamed from: f  reason: collision with root package name */
        long f157722f;

        /* renamed from: g  reason: collision with root package name */
        boolean f157723g;

        static {
            Covode.recordClassIndex(104745);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157721e.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157721e.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157723g) {
                this.f157723g = true;
                T t = this.f157719c;
                if (t != null) {
                    this.f157717a.onNext(t);
                } else if (this.f157720d) {
                    this.f157717a.onError(new NoSuchElementException());
                    return;
                }
                this.f157717a.onComplete();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157721e, bVar)) {
                this.f157721e = bVar;
                this.f157717a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157723g) {
                f.a.h.a.a(th);
                return;
            }
            this.f157723g = true;
            this.f157717a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157723g) {
                long j2 = this.f157722f;
                if (j2 == this.f157718b) {
                    this.f157723g = true;
                    this.f157721e.dispose();
                    this.f157717a.onNext(t);
                    this.f157717a.onComplete();
                    return;
                }
                this.f157722f = j2 + 1;
            }
        }

        a(z<? super T> zVar, long j2, T t, boolean z) {
            this.f157717a = zVar;
            this.f157718b = j2;
            this.f157719c = t;
            this.f157720d = z;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157714b, this.f157715c, this.f157716d));
    }

    public s(x<T> xVar, long j2, T t, boolean z) {
        super(xVar);
        this.f157714b = j2;
        this.f157715c = t;
        this.f157716d = z;
    }
}
