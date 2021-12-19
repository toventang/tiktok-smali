package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.f;

public final class i<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157778a;

    /* renamed from: b  reason: collision with root package name */
    final f<? super T> f157779b;

    static {
        Covode.recordClassIndex(104774);
    }

    final class a implements ae<T> {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super T> f157780a;

        static {
            Covode.recordClassIndex(104775);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.f157780a.onError(th);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            this.f157780a.onSubscribe(bVar);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            try {
                i.this.f157779b.accept(t);
                this.f157780a.onSuccess(t);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.f157780a.onError(th);
            }
        }

        a(ae<? super T> aeVar) {
            this.f157780a = aeVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157778a.a_(new a(aeVar));
    }

    public i(ag<T> agVar, f<? super T> fVar) {
        this.f157778a = agVar;
        this.f157779b = fVar;
    }
}
