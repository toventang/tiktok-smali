package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.x;

public final class z<T, R> extends a<T, R> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends Iterable<? extends R>> f157750b;

    static {
        Covode.recordClassIndex(104757);
    }

    static final class a<T, R> implements b, f.a.z<T> {

        /* renamed from: a  reason: collision with root package name */
        final f.a.z<? super R> f157751a;

        /* renamed from: b  reason: collision with root package name */
        final g<? super T, ? extends Iterable<? extends R>> f157752b;

        /* renamed from: c  reason: collision with root package name */
        b f157753c;

        static {
            Covode.recordClassIndex(104758);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157753c.isDisposed();
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157753c.dispose();
            this.f157753c = f.a.e.a.b.DISPOSED;
        }

        @Override // f.a.z
        public final void onComplete() {
            if (this.f157753c != f.a.e.a.b.DISPOSED) {
                this.f157753c = f.a.e.a.b.DISPOSED;
                this.f157751a.onComplete();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157753c, bVar)) {
                this.f157753c = bVar;
                this.f157751a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157753c == f.a.e.a.b.DISPOSED) {
                f.a.h.a.a(th);
                return;
            }
            this.f157753c = f.a.e.a.b.DISPOSED;
            this.f157751a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (this.f157753c != f.a.e.a.b.DISPOSED) {
                try {
                    f.a.z<? super R> zVar = this.f157751a;
                    for (T t2 : (Iterable) this.f157752b.apply(t)) {
                        try {
                            try {
                                zVar.onNext((Object) f.a.e.b.b.a((Object) t2, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                f.a.c.b.a(th);
                                this.f157753c.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            f.a.c.b.a(th2);
                            this.f157753c.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    f.a.c.b.a(th3);
                    this.f157753c.dispose();
                    onError(th3);
                }
            }
        }

        a(f.a.z<? super R> zVar, g<? super T, ? extends Iterable<? extends R>> gVar) {
            this.f157751a = zVar;
            this.f157752b = gVar;
        }
    }

    @Override // f.a.t
    public final void a(f.a.z<? super R> zVar) {
        this.f157412a.b(new a(zVar, this.f157750b));
    }

    public z(x<T> xVar, g<? super T, ? extends Iterable<? extends R>> gVar) {
        super(xVar);
        this.f157750b = gVar;
    }
}
