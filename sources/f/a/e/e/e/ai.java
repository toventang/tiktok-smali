package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b;
import f.a.d;
import f.a.e.c.c;
import f.a.t;
import f.a.x;
import f.a.z;

public final class ai<T> extends b implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    final x<T> f157441a;

    static {
        Covode.recordClassIndex(104613);
    }

    static final class a<T> implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final d f157442a;

        /* renamed from: b  reason: collision with root package name */
        f.a.b.b f157443b;

        static {
            Covode.recordClassIndex(104614);
        }

        @Override // f.a.z
        public final void onNext(T t) {
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157443b.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157443b.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157442a.onComplete();
        }

        a(d dVar) {
            this.f157442a = dVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157442a.onError(th);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            this.f157443b = bVar;
            this.f157442a.onSubscribe(this);
        }
    }

    @Override // f.a.e.c.c
    public final t<T> a() {
        return f.a.h.a.a(new ah(this.f157441a));
    }

    public ai(x<T> xVar) {
        this.f157441a = xVar;
    }

    @Override // f.a.b
    public final void b(d dVar) {
        this.f157441a.b(new a(dVar));
    }
}
