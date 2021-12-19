package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.f;
import f.a.e.a.c;

public final class h<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157773a;

    /* renamed from: b  reason: collision with root package name */
    final f<? super b> f157774b;

    static {
        Covode.recordClassIndex(104772);
    }

    static final class a<T> implements ae<T> {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super T> f157775a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super b> f157776b;

        /* renamed from: c  reason: collision with root package name */
        boolean f157777c;

        static {
            Covode.recordClassIndex(104773);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            if (this.f157777c) {
                f.a.h.a.a(th);
            } else {
                this.f157775a.onError(th);
            }
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            if (!this.f157777c) {
                this.f157775a.onSuccess(t);
            }
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            try {
                this.f157776b.accept(bVar);
                this.f157775a.onSubscribe(bVar);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                this.f157777c = true;
                bVar.dispose();
                c.error(th, this.f157775a);
            }
        }

        a(ae<? super T> aeVar, f<? super b> fVar) {
            this.f157775a = aeVar;
            this.f157776b = fVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157773a.a_(new a(aeVar, this.f157774b));
    }

    public h(ag<T> agVar, f<? super b> fVar) {
        this.f157773a = agVar;
        this.f157774b = fVar;
    }
}
