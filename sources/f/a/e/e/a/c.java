package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b;
import f.a.d;
import f.a.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    final f f157236a;

    /* renamed from: b  reason: collision with root package name */
    final long f157237b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157238c;

    /* renamed from: d  reason: collision with root package name */
    final aa f157239d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f157240e = false;

    static {
        Covode.recordClassIndex(104460);
    }

    static final class a extends AtomicReference<f.a.b.b> implements f.a.b.b, d, Runnable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final d downstream;
        Throwable error;
        final aa scheduler;
        final TimeUnit unit;

        static {
            Covode.recordClassIndex(104461);
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
            f.a.e.a.b.replace(this, this.scheduler.a(this, this.delay, this.unit));
        }

        public final void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // f.a.d
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.d
        public final void onError(Throwable th) {
            long j2;
            this.error = th;
            aa aaVar = this.scheduler;
            if (this.delayError) {
                j2 = this.delay;
            } else {
                j2 = 0;
            }
            f.a.e.a.b.replace(this, aaVar.a(this, j2, this.unit));
        }

        a(d dVar, long j2, TimeUnit timeUnit, aa aaVar, boolean z) {
            this.downstream = dVar;
            this.delay = j2;
            this.unit = timeUnit;
            this.scheduler = aaVar;
            this.delayError = z;
        }
    }

    @Override // f.a.b
    public final void b(d dVar) {
        this.f157236a.a(new a(dVar, this.f157237b, this.f157238c, this.f157239d, this.f157240e));
    }

    public c(f fVar, long j2, TimeUnit timeUnit, aa aaVar) {
        this.f157236a = fVar;
        this.f157237b = j2;
        this.f157238c = timeUnit;
        this.f157239d = aaVar;
    }
}
