package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.f;
import f.a.x;
import f.a.z;

public final class q<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final f<? super T> f157701b;

    /* renamed from: c  reason: collision with root package name */
    final f<? super Throwable> f157702c;

    /* renamed from: d  reason: collision with root package name */
    final f.a.d.a f157703d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.d.a f157704e;

    static {
        Covode.recordClassIndex(104741);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157705a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super T> f157706b;

        /* renamed from: c  reason: collision with root package name */
        final f<? super Throwable> f157707c;

        /* renamed from: d  reason: collision with root package name */
        final f.a.d.a f157708d;

        /* renamed from: e  reason: collision with root package name */
        final f.a.d.a f157709e;

        /* renamed from: f  reason: collision with root package name */
        b f157710f;

        /* renamed from: g  reason: collision with root package name */
        boolean f157711g;

        static {
            Covode.recordClassIndex(104742);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157710f.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157710f.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157711g) {
                try {
                    this.f157708d.a();
                    this.f157711g = true;
                    this.f157705a.onComplete();
                    try {
                        this.f157709e.a();
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        f.a.h.a.a(th);
                    }
                } catch (Throwable th2) {
                    f.a.c.b.a(th2);
                    onError(th2);
                }
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157710f, bVar)) {
                this.f157710f = bVar;
                this.f157705a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157711g) {
                try {
                    this.f157706b.accept(t);
                    this.f157705a.onNext(t);
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    this.f157710f.dispose();
                    onError(th);
                }
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157711g) {
                f.a.h.a.a(th);
                return;
            }
            this.f157711g = true;
            try {
                this.f157707c.accept(th);
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                th = new f.a.c.a(th, th2);
            }
            this.f157705a.onError(th);
            try {
                this.f157709e.a();
            } catch (Throwable th3) {
                f.a.c.b.a(th3);
                f.a.h.a.a(th3);
            }
        }

        a(z<? super T> zVar, f<? super T> fVar, f<? super Throwable> fVar2, f.a.d.a aVar, f.a.d.a aVar2) {
            this.f157705a = zVar;
            this.f157706b = fVar;
            this.f157707c = fVar2;
            this.f157708d = aVar;
            this.f157709e = aVar2;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157701b, this.f157702c, this.f157703d, this.f157704e));
    }

    public q(x<T> xVar, f<? super T> fVar, f<? super Throwable> fVar2, f.a.d.a aVar, f.a.d.a aVar2) {
        super(xVar);
        this.f157701b = fVar;
        this.f157702c = fVar2;
        this.f157703d = aVar;
        this.f157704e = aVar2;
    }
}
