package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.g;

public final class s<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<? extends T> f157800a;

    /* renamed from: b  reason: collision with root package name */
    final g<? super Throwable, ? extends T> f157801b = null;

    /* renamed from: c  reason: collision with root package name */
    final T f157802c;

    static {
        Covode.recordClassIndex(104790);
    }

    final class a implements ae<T> {

        /* renamed from: b  reason: collision with root package name */
        private final ae<? super T> f157804b;

        static {
            Covode.recordClassIndex(104791);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            this.f157804b.onSubscribe(bVar);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.f157804b.onSuccess(t);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            T t;
            if (s.this.f157801b != null) {
                try {
                    t = (Object) s.this.f157801b.apply(th);
                } catch (Throwable th2) {
                    f.a.c.b.a(th2);
                    this.f157804b.onError(new f.a.c.a(th, th2));
                    return;
                }
            } else {
                t = s.this.f157802c;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f157804b.onError(nullPointerException);
                return;
            }
            this.f157804b.onSuccess(t);
        }

        a(ae<? super T> aeVar) {
            this.f157804b = aeVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157800a.a_(new a(aeVar));
    }

    public s(ag<? extends T> agVar, T t) {
        this.f157800a = agVar;
        this.f157802c = t;
    }
}
