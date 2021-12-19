package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.g.c;
import f.a.x;
import f.a.z;
import java.util.concurrent.TimeUnit;

public final class l<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final long f157673b;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157674c;

    /* renamed from: d  reason: collision with root package name */
    final aa f157675d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f157676e = false;

    static {
        Covode.recordClassIndex(104728);
    }

    static final class a<T> implements f.a.b.b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157677a;

        /* renamed from: b  reason: collision with root package name */
        final long f157678b;

        /* renamed from: c  reason: collision with root package name */
        final TimeUnit f157679c;

        /* renamed from: d  reason: collision with root package name */
        final aa.c f157680d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f157681e;

        /* renamed from: f  reason: collision with root package name */
        f.a.b.b f157682f;

        static {
            Covode.recordClassIndex(104729);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157680d.isDisposed();
        }

        final class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final T f157687b;

            static {
                Covode.recordClassIndex(104732);
            }

            public final void run() {
                a.this.f157677a.onNext(this.f157687b);
            }

            c(T t) {
                this.f157687b = t;
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157682f.dispose();
            this.f157680d.dispose();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157680d.a(new RunnableC4168a(), this.f157678b, this.f157679c);
        }

        /* renamed from: f.a.e.e.e.l$a$a  reason: collision with other inner class name */
        final class RunnableC4168a implements Runnable {
            static {
                Covode.recordClassIndex(104730);
            }

            public final void run() {
                try {
                    a.this.f157677a.onComplete();
                } finally {
                    a.this.f157680d.dispose();
                }
            }

            RunnableC4168a() {
            }
        }

        final class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final Throwable f157685b;

            static {
                Covode.recordClassIndex(104731);
            }

            public final void run() {
                try {
                    a.this.f157677a.onError(this.f157685b);
                } finally {
                    a.this.f157680d.dispose();
                }
            }

            b(Throwable th) {
                this.f157685b = th;
            }
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157680d.a(new c(t), this.f157678b, this.f157679c);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.f157682f, bVar)) {
                this.f157682f = bVar;
                this.f157677a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            long j2;
            aa.c cVar = this.f157680d;
            b bVar = new b(th);
            if (this.f157681e) {
                j2 = this.f157678b;
            } else {
                j2 = 0;
            }
            cVar.a(bVar, j2, this.f157679c);
        }

        a(z<? super T> zVar, long j2, TimeUnit timeUnit, aa.c cVar, boolean z) {
            this.f157677a = zVar;
            this.f157678b = j2;
            this.f157679c = timeUnit;
            this.f157680d = cVar;
            this.f157681e = z;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        z<? super T> zVar2;
        if (!this.f157676e) {
            zVar2 = new c<>(zVar);
        } else {
            zVar2 = zVar;
        }
        this.f157412a.b(new a(zVar2, this.f157673b, this.f157674c, this.f157675d.a(), this.f157676e));
    }

    public l(x<T> xVar, long j2, TimeUnit timeUnit, aa aaVar) {
        super(xVar);
        this.f157673b = j2;
        this.f157674c = timeUnit;
        this.f157675d = aaVar;
    }
}
