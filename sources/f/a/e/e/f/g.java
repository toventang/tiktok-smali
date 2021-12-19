package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.d.b;

public final class g<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157769a;

    /* renamed from: b  reason: collision with root package name */
    final b<? super T, ? super Throwable> f157770b;

    static {
        Covode.recordClassIndex(104770);
    }

    final class a implements ae<T> {

        /* renamed from: b  reason: collision with root package name */
        private final ae<? super T> f157772b;

        static {
            Covode.recordClassIndex(104771);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            this.f157772b.onSubscribe(bVar);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            try {
                g.this.f157770b.a(t, null);
                this.f157772b.onSuccess(t);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.f157772b.onError(th);
            }
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            try {
                g.this.f157770b.a(null, th);
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                th = new f.a.c.a(th, th2);
            }
            this.f157772b.onError(th);
        }

        a(ae<? super T> aeVar) {
            this.f157772b = aeVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157769a.a_(new a(aeVar));
    }

    public g(ag<T> agVar, b<? super T, ? super Throwable> bVar) {
        this.f157769a = agVar;
        this.f157770b = bVar;
    }
}
