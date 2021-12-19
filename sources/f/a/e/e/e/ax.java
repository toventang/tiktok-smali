package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.x;
import f.a.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ax<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f157502b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157503c;

    /* renamed from: d  reason: collision with root package name */
    final aa f157504d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f157505e = false;

    static {
        Covode.recordClassIndex(104651);
    }

    static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        static {
            Covode.recordClassIndex(104653);
        }

        public final void run() {
            b();
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.e.ax.c
        public final void a() {
            this.downstream.onComplete();
        }

        b(z<? super T> zVar, long j2, TimeUnit timeUnit, aa aaVar) {
            super(zVar, j2, timeUnit, aaVar);
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements f.a.b.b, z<T>, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final z<? super T> downstream;
        final long period;
        final aa scheduler;
        final AtomicReference<f.a.b.b> timer = new AtomicReference<>();
        final TimeUnit unit;
        f.a.b.b upstream;

        static {
            Covode.recordClassIndex(104654);
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        private void c() {
            f.a.e.a.b.dispose(this.timer);
        }

        @Override // f.a.b.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // f.a.z
        public void onComplete() {
            c();
            a();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        @Override // f.a.b.b
        public void dispose() {
            c();
            this.upstream.dispose();
        }

        @Override // f.a.z
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // f.a.z
        public void onError(Throwable th) {
            c();
            this.downstream.onError(th);
        }

        @Override // f.a.z
        public void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
                aa aaVar = this.scheduler;
                long j2 = this.period;
                f.a.e.a.b.replace(this.timer, aaVar.a(this, j2, j2, this.unit));
            }
        }

        c(z<? super T> zVar, long j2, TimeUnit timeUnit, aa aaVar) {
            this.downstream = zVar;
            this.period = j2;
            this.unit = timeUnit;
            this.scheduler = aaVar;
        }
    }

    static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(104652);
        }

        /* access modifiers changed from: package-private */
        @Override // f.a.e.e.e.ax.c
        public final void a() {
            b();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        public final void run() {
            if (this.wip.incrementAndGet() == 2) {
                b();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }

        a(z<? super T> zVar, long j2, TimeUnit timeUnit, aa aaVar) {
            super(zVar, j2, timeUnit, aaVar);
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        f.a.g.c cVar = new f.a.g.c(zVar);
        if (this.f157505e) {
            this.f157412a.b(new a(cVar, this.f157502b, this.f157503c, this.f157504d));
        } else {
            this.f157412a.b(new b(cVar, this.f157502b, this.f157503c, this.f157504d));
        }
    }

    public ax(x<T> xVar, long j2, TimeUnit timeUnit, aa aaVar) {
        super(xVar);
        this.f157502b = j2;
        this.f157503c = timeUnit;
        this.f157504d = aaVar;
    }
}
