package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.g;

public final class p<T, R> extends ab<R> {

    /* renamed from: a  reason: collision with root package name */
    final ag<? extends T> f157793a;

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends R> f157794b;

    static {
        Covode.recordClassIndex(104785);
    }

    static final class a<T, R> implements ae<T> {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super R> f157795a;

        /* renamed from: b  reason: collision with root package name */
        final g<? super T, ? extends R> f157796b;

        static {
            Covode.recordClassIndex(104786);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.f157795a.onError(th);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            this.f157795a.onSubscribe(bVar);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            try {
                this.f157795a.onSuccess(f.a.e.b.b.a(this.f157796b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                f.a.c.b.a(th);
                onError(th);
            }
        }

        a(ae<? super R> aeVar, g<? super T, ? extends R> gVar) {
            this.f157795a = aeVar;
            this.f157796b = gVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super R> aeVar) {
        this.f157793a.a_(new a(aeVar, this.f157794b));
    }

    public p(ag<? extends T> agVar, g<? super T, ? extends R> gVar) {
        this.f157793a = agVar;
        this.f157794b = gVar;
    }
}
