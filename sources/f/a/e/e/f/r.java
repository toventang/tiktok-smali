package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicReference;

public final class r<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157798a;

    /* renamed from: b  reason: collision with root package name */
    final aa f157799b;

    static {
        Covode.recordClassIndex(104788);
    }

    static final class a<T> extends AtomicReference<b> implements ae<T>, b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final ae<? super T> downstream;
        Throwable error;
        final aa scheduler;
        T value;

        static {
            Covode.recordClassIndex(104789);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            this.error = th;
            f.a.e.a.b.replace(this, this.scheduler.a(this));
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            this.value = t;
            f.a.e.a.b.replace(this, this.scheduler.a(this));
        }

        a(ae<? super T> aeVar, aa aaVar) {
            this.downstream = aeVar;
            this.scheduler = aaVar;
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157798a.a_(new a(aeVar, this.f157799b));
    }

    public r(ag<T> agVar, aa aaVar) {
        this.f157798a = agVar;
        this.f157799b = aaVar;
    }
}
