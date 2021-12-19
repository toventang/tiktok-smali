package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.p;
import f.a.r;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class v<T, U> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final r<U> f157404b;

    /* renamed from: c  reason: collision with root package name */
    final r<? extends T> f157405c = null;

    static {
        Covode.recordClassIndex(104586);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> extends AtomicReference<f.a.b.b> implements p<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final p<? super T> downstream;

        static {
            Covode.recordClassIndex(104587);
        }

        @Override // f.a.p
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // f.a.p
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        a(p<? super T> pVar) {
            this.downstream = pVar;
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    static final class c<T, U> extends AtomicReference<f.a.b.b> implements p<Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final b<T, U> parent;

        static {
            Covode.recordClassIndex(104589);
        }

        @Override // f.a.p
        public final void onComplete() {
            this.parent.a();
        }

        @Override // f.a.p
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        c(b<T, U> bVar) {
            this.parent = bVar;
        }

        @Override // f.a.p
        public final void onSuccess(Object obj) {
            this.parent.a();
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            b<T, U> bVar = this.parent;
            if (f.a.e.a.b.dispose(bVar)) {
                bVar.downstream.onError(th);
            } else {
                f.a.h.a.a(th);
            }
        }
    }

    static final class b<T, U> extends AtomicReference<f.a.b.b> implements f.a.b.b, p<T> {
        private static final long serialVersionUID = -5955289211445418871L;
        final p<? super T> downstream;
        final r<? extends T> fallback;
        final c<T, U> other = new c<>(this);
        final a<T> otherObserver;

        static {
            Covode.recordClassIndex(104588);
        }

        @Override // f.a.b.b
        public final void dispose() {
            f.a.e.a.b.dispose(this);
            f.a.e.a.b.dispose(this.other);
            a<T> aVar = this.otherObserver;
            if (aVar != null) {
                f.a.e.a.b.dispose(aVar);
            }
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return f.a.e.a.b.isDisposed((f.a.b.b) get());
        }

        public final void a() {
            if (f.a.e.a.b.dispose(this)) {
                r<? extends T> rVar = this.fallback;
                if (rVar == null) {
                    this.downstream.onError(new TimeoutException());
                } else {
                    rVar.a(this.otherObserver);
                }
            }
        }

        @Override // f.a.p
        public final void onComplete() {
            f.a.e.a.b.dispose(this.other);
            if (getAndSet(f.a.e.a.b.DISPOSED) != f.a.e.a.b.DISPOSED) {
                this.downstream.onComplete();
            }
        }

        @Override // f.a.p
        public final void onSubscribe(f.a.b.b bVar) {
            f.a.e.a.b.setOnce(this, bVar);
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            f.a.e.a.b.dispose(this.other);
            if (getAndSet(f.a.e.a.b.DISPOSED) != f.a.e.a.b.DISPOSED) {
                this.downstream.onError(th);
            } else {
                f.a.h.a.a(th);
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            f.a.e.a.b.dispose(this.other);
            if (getAndSet(f.a.e.a.b.DISPOSED) != f.a.e.a.b.DISPOSED) {
                this.downstream.onSuccess(t);
            }
        }

        b(p<? super T> pVar, r<? extends T> rVar) {
            a<T> aVar;
            this.downstream = pVar;
            this.fallback = rVar;
            if (rVar != null) {
                aVar = new a<>(pVar);
            } else {
                aVar = null;
            }
            this.otherObserver = aVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        b bVar = new b(pVar, this.f157405c);
        pVar.onSubscribe(bVar);
        this.f157404b.a(bVar.other);
        this.f157348a.a(bVar);
    }

    public v(r<T> rVar, r<U> rVar2) {
        super(rVar);
        this.f157404b = rVar2;
    }
}
