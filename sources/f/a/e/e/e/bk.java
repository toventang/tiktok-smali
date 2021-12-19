package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.a.f;
import f.a.e.j.h;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class bk<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f157559b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157560c;

    /* renamed from: d  reason: collision with root package name */
    final aa f157561d;

    /* renamed from: e  reason: collision with root package name */
    final x<? extends T> f157562e;

    /* access modifiers changed from: package-private */
    public interface d {
        static {
            Covode.recordClassIndex(104688);
        }

        void b(long j2);
    }

    static {
        Covode.recordClassIndex(104684);
    }

    static final class a<T> implements z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157563a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReference<f.a.b.b> f157564b;

        static {
            Covode.recordClassIndex(104685);
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157563a.onComplete();
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            this.f157563a.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157563a.onNext(t);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.replace(this.f157564b, bVar);
        }

        a(z<? super T> zVar, AtomicReference<f.a.b.b> atomicReference) {
            this.f157563a = zVar;
            this.f157564b = atomicReference;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final d f157565a;

        /* renamed from: b  reason: collision with root package name */
        final long f157566b;

        static {
            Covode.recordClassIndex(104689);
        }

        public final void run() {
            this.f157565a.b(this.f157566b);
        }

        e(long j2, d dVar) {
            this.f157566b = j2;
            this.f157565a = dVar;
        }
    }

    static final class b<T> extends AtomicReference<f.a.b.b> implements f.a.b.b, d, z<T> {
        private static final long serialVersionUID = 3764492702657003550L;
        final z<? super T> downstream;
        x<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final f task = new f();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<f.a.b.b> upstream = new AtomicReference<>();
        final aa.c worker;

        static {
            Covode.recordClassIndex(104686);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this.upstream);
            f.a.e.a.b.dispose(this);
            this.worker.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((f.a.b.b) get());
        }

        @Override // f.a.z
        public final void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this.upstream, bVar);
        }

        /* access modifiers changed from: package-private */
        public final void a(long j2) {
            this.task.replace(this.worker.a(new e(j2, this), this.timeout, this.unit));
        }

        @Override // f.a.e.e.e.bk.d
        public final void b(long j2) {
            if (this.index.compareAndSet(j2, Long.MAX_VALUE)) {
                f.a.e.a.b.dispose(this.upstream);
                x<? extends T> xVar = this.fallback;
                this.fallback = null;
                xVar.b(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            f.a.h.a.a(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            long j2 = this.index.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (this.index.compareAndSet(j2, j3)) {
                    ((f.a.b.b) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    a(j3);
                }
            }
        }

        b(z<? super T> zVar, long j2, TimeUnit timeUnit, aa.c cVar, x<? extends T> xVar) {
            this.downstream = zVar;
            this.timeout = j2;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = xVar;
        }
    }

    static final class c<T> extends AtomicLong implements f.a.b.b, d, z<T> {
        private static final long serialVersionUID = 3764492702657003550L;
        final z<? super T> downstream;
        final f task = new f();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<f.a.b.b> upstream = new AtomicReference<>();
        final aa.c worker;

        static {
            Covode.recordClassIndex(104687);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this.upstream);
            this.worker.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed(this.upstream.get());
        }

        @Override // f.a.z
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this.upstream, bVar);
        }

        /* access modifiers changed from: package-private */
        public final void a(long j2) {
            this.task.replace(this.worker.a(new e(j2, this), this.timeout, this.unit));
        }

        @Override // f.a.e.e.e.bk.d
        public final void b(long j2) {
            if (compareAndSet(j2, Long.MAX_VALUE)) {
                f.a.e.a.b.dispose(this.upstream);
                this.downstream.onError(new TimeoutException(h.a(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            f.a.h.a.a(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            long j2 = get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (compareAndSet(j2, j3)) {
                    ((f.a.b.b) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    a(j3);
                }
            }
        }

        c(z<? super T> zVar, long j2, TimeUnit timeUnit, aa.c cVar) {
            this.downstream = zVar;
            this.timeout = j2;
            this.unit = timeUnit;
            this.worker = cVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        if (this.f157562e == null) {
            c cVar = new c(zVar, this.f157559b, this.f157560c, this.f157561d.a());
            zVar.onSubscribe(cVar);
            cVar.a(0);
            this.f157412a.b(cVar);
            return;
        }
        b bVar = new b(zVar, this.f157559b, this.f157560c, this.f157561d.a(), this.f157562e);
        zVar.onSubscribe(bVar);
        bVar.a(0);
        this.f157412a.b(bVar);
    }

    public bk(t<T> tVar, long j2, TimeUnit timeUnit, aa aaVar, x<? extends T> xVar) {
        super(tVar);
        this.f157559b = j2;
        this.f157560c = timeUnit;
        this.f157561d = aaVar;
        this.f157562e = xVar;
    }
}
