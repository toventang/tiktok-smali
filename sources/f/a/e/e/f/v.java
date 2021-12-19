package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.b.b;
import f.a.e.j.h;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class v<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final ag<T> f157809a;

    /* renamed from: b  reason: collision with root package name */
    final long f157810b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157811c;

    /* renamed from: d  reason: collision with root package name */
    final aa f157812d;

    /* renamed from: e  reason: collision with root package name */
    final ag<? extends T> f157813e;

    static {
        Covode.recordClassIndex(104796);
    }

    static final class a<T> extends AtomicReference<b> implements ae<T>, b, Runnable {
        private static final long serialVersionUID = 37497744973048446L;
        final ae<? super T> downstream;
        final C4171a<T> fallback;
        ag<? extends T> other;
        final AtomicReference<b> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        static {
            Covode.recordClassIndex(104797);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
            f.a.e.a.b.dispose(this.task);
            C4171a<T> aVar = this.fallback;
            if (aVar != null) {
                f.a.e.a.b.dispose(aVar);
            }
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((b) get());
        }

        public final void run() {
            b bVar = (b) get();
            if (bVar != f.a.e.a.b.DISPOSED && compareAndSet(bVar, f.a.e.a.b.DISPOSED)) {
                if (bVar != null) {
                    bVar.dispose();
                }
                ag<? extends T> agVar = this.other;
                if (agVar == null) {
                    this.downstream.onError(new TimeoutException(h.a(this.timeout, this.unit)));
                    return;
                }
                this.other = null;
                agVar.a_(this.fallback);
            }
        }

        /* renamed from: f.a.e.e.f.v$a$a  reason: collision with other inner class name */
        static final class C4171a<T> extends AtomicReference<b> implements ae<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final ae<? super T> downstream;

            static {
                Covode.recordClassIndex(104798);
            }

            @Override // f.a.ae
            public final void onSubscribe(b bVar) {
                f.a.e.a.b.setOnce(this, bVar);
            }

            C4171a(ae<? super T> aeVar) {
                this.downstream = aeVar;
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                this.downstream.onError(th);
            }

            @Override // f.a.ae
            public final void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            Object obj = get();
            if (obj == f.a.e.a.b.DISPOSED || !compareAndSet(obj, f.a.e.a.b.DISPOSED)) {
                f.a.h.a.a(th);
                return;
            }
            f.a.e.a.b.dispose(this.task);
            this.downstream.onError(th);
        }

        @Override // f.a.ae
        public final void onSuccess(T t) {
            Object obj = get();
            if (obj != f.a.e.a.b.DISPOSED && compareAndSet(obj, f.a.e.a.b.DISPOSED)) {
                f.a.e.a.b.dispose(this.task);
                this.downstream.onSuccess(t);
            }
        }

        a(ae<? super T> aeVar, ag<? extends T> agVar, long j2, TimeUnit timeUnit) {
            this.downstream = aeVar;
            this.other = agVar;
            this.timeout = j2;
            this.unit = timeUnit;
            if (agVar != null) {
                this.fallback = new C4171a<>(aeVar);
            } else {
                this.fallback = null;
            }
        }
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        a aVar = new a(aeVar, this.f157813e, this.f157810b, this.f157811c);
        aeVar.onSubscribe(aVar);
        f.a.e.a.b.replace(aVar.task, this.f157812d.a(aVar, this.f157810b, this.f157811c));
        this.f157809a.a_(aVar);
    }

    public v(ag<T> agVar, long j2, TimeUnit timeUnit, aa aaVar, ag<? extends T> agVar2) {
        this.f157809a = agVar;
        this.f157810b = j2;
        this.f157811c = timeUnit;
        this.f157812d = aaVar;
        this.f157813e = agVar2;
    }
}
