package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;

public final class f<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157765a;

    /* renamed from: b  reason: collision with root package name */
    final f.a.d.f<? super Throwable> f157766b;

    static {
        Covode.recordClassIndex(104768);
    }

    final class a implements ae<T> {

        /* renamed from: b  reason: collision with root package name */
        private final ae<? super T> f157768b;

        static {
            Covode.recordClassIndex(104769);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            this.f157768b.onSubscribe(bVar);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.f157768b.onSuccess(t);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            try {
                f.this.f157766b.accept(th);
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                th = new f.a.c.a(th, th2);
            }
            this.f157768b.onError(th);
        }

        a(ae<? super T> aeVar) {
            this.f157768b = aeVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157765a.a_(new a(aeVar));
    }

    public f(ag<T> agVar, f.a.d.f<? super Throwable> fVar) {
        this.f157765a = agVar;
        this.f157766b = fVar;
    }
}
