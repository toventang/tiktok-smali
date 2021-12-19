package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b;
import f.a.d;
import f.a.f;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends b {

    /* renamed from: a  reason: collision with root package name */
    final f f157245a;

    /* renamed from: b  reason: collision with root package name */
    final aa f157246b;

    static {
        Covode.recordClassIndex(104466);
    }

    static final class a extends AtomicReference<f.a.b.b> implements f.a.b.b, d, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final d downstream;
        Throwable error;
        final aa scheduler;

        static {
            Covode.recordClassIndex(104467);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((f.a.b.b) get());
        }

        @Override // f.a.d
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
            this.downstream.onComplete();
        }

        @Override // f.a.d
        public final void onError(Throwable th) {
            this.error = th;
            f.a.e.a.b.replace(this, this.scheduler.a(this));
        }

        @Override // f.a.d
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        a(d dVar, aa aaVar) {
            this.downstream = dVar;
            this.scheduler = aaVar;
        }
    }

    @Override // f.a.b
    public final void b(d dVar) {
        this.f157245a.a(new a(dVar, this.f157246b));
    }

    public h(f fVar, aa aaVar) {
        this.f157245a = fVar;
        this.f157246b = aaVar;
    }
}
