package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.p;
import f.a.r;
import java.util.concurrent.atomic.AtomicReference;

public final class o<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final aa f157378b;

    static {
        Covode.recordClassIndex(104569);
    }

    static final class a<T> extends AtomicReference<b> implements b, p<T>, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final p<? super T> downstream;
        Throwable error;
        final aa scheduler;
        T value;

        static {
            Covode.recordClassIndex(104570);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        @Override // f.a.p
        public final void onComplete() {
            f.a.e.a.b.replace(this, this.scheduler.a(this));
        }

        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.value = null;
                this.downstream.onSuccess(t);
                return;
            }
            this.downstream.onComplete();
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.error = th;
            f.a.e.a.b.replace(this, this.scheduler.a(this));
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.value = t;
            f.a.e.a.b.replace(this, this.scheduler.a(this));
        }

        a(p<? super T> pVar, aa aaVar) {
            this.downstream = pVar;
            this.scheduler = aaVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157348a.a(new a(pVar, this.f157378b));
    }

    public o(r<T> rVar, aa aaVar) {
        super(rVar);
        this.f157378b = aaVar;
    }
}
