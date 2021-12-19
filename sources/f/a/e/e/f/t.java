package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.d.g;
import java.util.concurrent.atomic.AtomicReference;

public final class t<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<? extends T> f157805a;

    /* renamed from: b  reason: collision with root package name */
    final g<? super Throwable, ? extends ag<? extends T>> f157806b;

    static {
        Covode.recordClassIndex(104792);
    }

    static final class a<T> extends AtomicReference<b> implements ae<T>, b {
        private static final long serialVersionUID = -5314538511045349925L;
        final ae<? super T> downstream;
        final g<? super Throwable, ? extends ag<? extends T>> nextFunction;

        static {
            Covode.recordClassIndex(104793);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            try {
                ((ag) f.a.e.b.b.a(this.nextFunction.apply(th), "The nextFunction returned a null SingleSource.")).a_(new f.a.e.d.t(this, this.downstream));
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.downstream.onError(new f.a.c.a(th, th2));
            }
        }

        a(ae<? super T> aeVar, g<? super Throwable, ? extends ag<? extends T>> gVar) {
            this.downstream = aeVar;
            this.nextFunction = gVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157805a.a_(new a(aeVar, this.f157806b));
    }

    public t(ag<? extends T> agVar, g<? super Throwable, ? extends ag<? extends T>> gVar) {
        this.f157805a = agVar;
        this.f157806b = gVar;
    }
}
