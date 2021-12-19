package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.b.b;
import f.a.e.b.a;
import f.a.e.c.c;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class bn<T, U extends Collection<? super T>> extends ab<U> implements c<U> {

    /* renamed from: a  reason: collision with root package name */
    final x<T> f157574a;

    /* renamed from: b  reason: collision with root package name */
    final Callable<U> f157575b = new a.c(16);

    static {
        Covode.recordClassIndex(104694);
    }

    static final class a<T, U extends Collection<? super T>> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super U> f157576a;

        /* renamed from: b  reason: collision with root package name */
        U f157577b;

        /* renamed from: c  reason: collision with root package name */
        b f157578c;

        static {
            Covode.recordClassIndex(104695);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157578c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157578c.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            U u = this.f157577b;
            this.f157577b = null;
            this.f157576a.onSuccess(u);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157577b.add(t);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157577b = null;
            this.f157576a.onError(th);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157578c, bVar)) {
                this.f157578c = bVar;
                this.f157576a.onSubscribe(this);
            }
        }

        a(ae<? super U> aeVar, U u) {
            this.f157576a = aeVar;
            this.f157577b = u;
        }
    }

    @Override // f.a.e.c.c
    public final t<U> a() {
        return f.a.h.a.a(new bm(this.f157574a, this.f157575b));
    }

    public bn(x<T> xVar) {
        this.f157574a = xVar;
    }

    @Override // f.a.ab
    public final void a(ae<? super U> aeVar) {
        try {
            this.f157574a.b(new a(aeVar, (Collection) f.a.e.b.b.a((Object) this.f157575b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.e.a.c.error(th, aeVar);
        }
    }
}
