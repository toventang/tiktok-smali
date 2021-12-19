package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.g.c;
import f.a.x;
import f.a.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class j<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f157661b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157662c;

    /* renamed from: d  reason: collision with root package name */
    final aa f157663d;

    static {
        Covode.recordClassIndex(104724);
    }

    static final class a<T> extends AtomicReference<f.a.b.b> implements f.a.b.b, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final b<T> parent;
        final T value;

        static {
            Covode.recordClassIndex(104725);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (get() == f.a.e.a.b.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void run() {
            if (this.once.compareAndSet(false, true)) {
                b<T> bVar = this.parent;
                long j2 = this.idx;
                T t = this.value;
                if (j2 == bVar.f157670g) {
                    bVar.f157664a.onNext(t);
                    dispose();
                }
            }
        }

        a(T t, long j2, b<T> bVar) {
            this.value = t;
            this.idx = j2;
            this.parent = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157664a;

        /* renamed from: b  reason: collision with root package name */
        final long f157665b;

        /* renamed from: c  reason: collision with root package name */
        final TimeUnit f157666c;

        /* renamed from: d  reason: collision with root package name */
        final aa.c f157667d;

        /* renamed from: e  reason: collision with root package name */
        f.a.b.b f157668e;

        /* renamed from: f  reason: collision with root package name */
        f.a.b.b f157669f;

        /* renamed from: g  reason: collision with root package name */
        volatile long f157670g;

        /* renamed from: h  reason: collision with root package name */
        boolean f157671h;

        static {
            Covode.recordClassIndex(104726);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157667d.isDisposed();
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157668e.dispose();
            this.f157667d.dispose();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157671h) {
                this.f157671h = true;
                f.a.b.b bVar = this.f157669f;
                if (bVar != null) {
                    bVar.dispose();
                }
                a aVar = (a) bVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f157664a.onComplete();
                this.f157667d.dispose();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.f157668e, bVar)) {
                this.f157668e = bVar;
                this.f157664a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.f157671h) {
                f.a.h.a.a(th);
                return;
            }
            f.a.b.b bVar = this.f157669f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f157671h = true;
            this.f157664a.onError(th);
            this.f157667d.dispose();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157671h) {
                long j2 = this.f157670g + 1;
                this.f157670g = j2;
                f.a.b.b bVar = this.f157669f;
                if (bVar != null) {
                    bVar.dispose();
                }
                a aVar = new a(t, j2, this);
                this.f157669f = aVar;
                f.a.e.a.b.replace(aVar, this.f157667d.a(aVar, this.f157665b, this.f157666c));
            }
        }

        b(z<? super T> zVar, long j2, TimeUnit timeUnit, aa.c cVar) {
            this.f157664a = zVar;
            this.f157665b = j2;
            this.f157666c = timeUnit;
            this.f157667d = cVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new b(new c(zVar), this.f157661b, this.f157662c, this.f157663d.a()));
    }

    public j(x<T> xVar, long j2, TimeUnit timeUnit, aa aaVar) {
        super(xVar);
        this.f157661b = j2;
        this.f157662c = timeUnit;
        this.f157663d = aaVar;
    }
}
