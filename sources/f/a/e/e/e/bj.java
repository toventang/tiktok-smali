package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.g.c;
import f.a.x;
import f.a.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class bj<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f157556b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157557c;

    /* renamed from: d  reason: collision with root package name */
    final aa f157558d;

    static {
        Covode.recordClassIndex(104682);
    }

    static final class a<T> extends AtomicReference<b> implements b, z<T>, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        boolean done;
        final z<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        b upstream;
        final aa.c worker;

        static {
            Covode.recordClassIndex(104683);
        }

        public final void run() {
            this.gate = false;
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.worker.isDisposed();
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.done) {
                f.a.h.a.a(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.gate && !this.done) {
                this.gate = true;
                this.downstream.onNext(t);
                b bVar = (b) get();
                if (bVar != null) {
                    bVar.dispose();
                }
                f.a.e.a.b.replace(this, this.worker.a(this, this.timeout, this.unit));
            }
        }

        a(z<? super T> zVar, long j2, TimeUnit timeUnit, aa.c cVar) {
            this.downstream = zVar;
            this.timeout = j2;
            this.unit = timeUnit;
            this.worker = cVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(new c(zVar), this.f157556b, this.f157557c, this.f157558d.a()));
    }

    public bj(x<T> xVar, long j2, TimeUnit timeUnit, aa aaVar) {
        super(xVar);
        this.f157556b = j2;
        this.f157557c = timeUnit;
        this.f157558d = aaVar;
    }
}
