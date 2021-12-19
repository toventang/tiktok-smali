package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.e.c.f;
import f.a.h;
import f.a.l;
import org.a.d;

public final class c<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final f.a.d.a f157286c;

    static {
        Covode.recordClassIndex(104493);
    }

    static final class a<T> extends f.a.e.i.a<T> implements f.a.e.c.a<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final f.a.e.c.a<? super T> downstream;
        final f.a.d.a onFinally;
        f<T> qs;
        boolean syncFused;
        d upstream;

        static {
            Covode.recordClassIndex(104494);
        }

        @Override // f.a.e.c.i
        public final void clear() {
            this.qs.clear();
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // org.a.d
        public final void cancel() {
            this.upstream.cancel();
            a();
        }

        @Override // org.a.c
        public final void onComplete() {
            this.downstream.onComplete();
            a();
        }

        @Override // f.a.e.c.i
        public final T poll() {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                a();
            }
            return poll;
        }

        private void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.a();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    f.a.h.a.a(th);
                }
            }
        }

        @Override // f.a.e.c.a
        public final boolean a(T t) {
            return this.downstream.a(t);
        }

        @Override // org.a.c
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.a.d
        public final void request(long j2) {
            this.upstream.request(j2);
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.a.e.i.f.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof f) {
                    this.qs = (f) dVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            f<T> fVar = this.qs;
            boolean z = false;
            if (fVar == null || (i2 & 4) != 0) {
                return 0;
            }
            int requestFusion = fVar.requestFusion(i2);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        a(f.a.e.c.a<? super T> aVar, f.a.d.a aVar2) {
            this.downstream = aVar;
            this.onFinally = aVar2;
        }
    }

    static final class b<T> extends f.a.e.i.a<T> implements l<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final org.a.c<? super T> downstream;
        final f.a.d.a onFinally;
        f<T> qs;
        boolean syncFused;
        d upstream;

        static {
            Covode.recordClassIndex(104495);
        }

        @Override // f.a.e.c.i
        public final void clear() {
            this.qs.clear();
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // org.a.d
        public final void cancel() {
            this.upstream.cancel();
            a();
        }

        @Override // org.a.c
        public final void onComplete() {
            this.downstream.onComplete();
            a();
        }

        @Override // f.a.e.c.i
        public final T poll() {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                a();
            }
            return poll;
        }

        private void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.a();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    f.a.h.a.a(th);
                }
            }
        }

        @Override // org.a.c
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.a.d
        public final void request(long j2) {
            this.upstream.request(j2);
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.a.e.i.f.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof f) {
                    this.qs = (f) dVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            f<T> fVar = this.qs;
            boolean z = false;
            if (fVar == null || (i2 & 4) != 0) {
                return 0;
            }
            int requestFusion = fVar.requestFusion(i2);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        b(org.a.c<? super T> cVar, f.a.d.a aVar) {
            this.downstream = cVar;
            this.onFinally = aVar;
        }
    }

    @Override // f.a.h
    public final void a(org.a.c<? super T> cVar) {
        if (cVar instanceof f.a.e.c.a) {
            this.f157263b.a((l) new a((f.a.e.c.a) cVar, this.f157286c));
        } else {
            this.f157263b.a((l) new b(cVar, this.f157286c));
        }
    }

    public c(h<T> hVar, f.a.d.a aVar) {
        super(hVar);
        this.f157286c = aVar;
    }
}
