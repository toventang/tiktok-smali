package f.a.e.e.d;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.g;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T, R> extends t<R> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157410a;

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends x<? extends R>> f157411b;

    static {
        Covode.recordClassIndex(104595);
    }

    /* renamed from: f.a.e.e.d.a$a  reason: collision with other inner class name */
    static final class C4163a<T, R> extends AtomicReference<b> implements ae<T>, b, z<R> {
        private static final long serialVersionUID = -8948264376121066672L;
        final z<? super R> downstream;
        final g<? super T, ? extends x<? extends R>> mapper;

        static {
            Covode.recordClassIndex(104596);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        @Override // f.a.z, f.a.ae
        public final void onSubscribe(b bVar) {
            f.a.e.a.b.replace(this, bVar);
        }

        @Override // f.a.z, f.a.ae
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.z
        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            try {
                ((x) f.a.e.b.b.a(this.mapper.apply(t), "The mapper returned a null Publisher")).b(this);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.downstream.onError(th);
            }
        }

        C4163a(z<? super R> zVar, g<? super T, ? extends x<? extends R>> gVar) {
            this.downstream = zVar;
            this.mapper = gVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super R> zVar) {
        C4163a aVar = new C4163a(zVar, this.f157411b);
        zVar.onSubscribe(aVar);
        this.f157410a.a_(aVar);
    }

    public a(ag<T> agVar, g<? super T, ? extends x<? extends R>> gVar) {
        this.f157410a = agVar;
        this.f157411b = gVar;
    }
}
