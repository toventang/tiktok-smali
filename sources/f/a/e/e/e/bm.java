package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.a.c;
import f.a.x;
import f.a.z;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class bm<T, U extends Collection<? super T>> extends a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<U> f157570b;

    static {
        Covode.recordClassIndex(104692);
    }

    static final class a<T, U extends Collection<? super T>> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super U> f157571a;

        /* renamed from: b  reason: collision with root package name */
        b f157572b;

        /* renamed from: c  reason: collision with root package name */
        U f157573c;

        static {
            Covode.recordClassIndex(104693);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157572b.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157572b.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            U u = this.f157573c;
            this.f157573c = null;
            this.f157571a.onNext(u);
            this.f157571a.onComplete();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157573c.add(t);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157573c = null;
            this.f157571a.onError(th);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157572b, bVar)) {
                this.f157572b = bVar;
                this.f157571a.onSubscribe(this);
            }
        }

        a(z<? super U> zVar, U u) {
            this.f157571a = zVar;
            this.f157573c = u;
        }
    }

    @Override // f.a.t
    public final void a(z<? super U> zVar) {
        try {
            this.f157412a.b(new a(zVar, (Collection) f.a.e.b.b.a((Object) this.f157570b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            f.a.c.b.a(th);
            c.error(th, zVar);
        }
    }

    public bm(x<T> xVar, Callable<U> callable) {
        super(xVar);
        this.f157570b = callable;
    }
}
