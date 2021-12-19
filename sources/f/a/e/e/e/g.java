package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.c.d;
import f.a.e.c.i;
import f.a.e.j.c;
import f.a.x;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class g<T, U> extends a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final f.a.d.g<? super T, ? extends x<? extends U>> f157653b;

    /* renamed from: c  reason: collision with root package name */
    final int f157654c;

    /* renamed from: d  reason: collision with root package name */
    final f.a.e.j.g f157655d;

    static {
        Covode.recordClassIndex(104715);
    }

    static final class a<T, R> extends AtomicInteger implements f.a.b.b, z<T> {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final z<? super R> downstream;
        final c error = new c();
        final f.a.d.g<? super T, ? extends x<? extends R>> mapper;
        final C4167a<R> observer;
        i<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        f.a.b.b upstream;

        static {
            Covode.recordClassIndex(104716);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // f.a.z
        public final void onComplete() {
            this.done = true;
            a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f.a.e.e.e.g$a$a  reason: collision with other inner class name */
        public static final class C4167a<R> extends AtomicReference<f.a.b.b> implements z<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final z<? super R> downstream;
            final a<?, R> parent;

            static {
                Covode.recordClassIndex(104717);
            }

            @Override // f.a.z
            public final void onComplete() {
                a<?, R> aVar = this.parent;
                aVar.active = false;
                aVar.a();
            }

            @Override // f.a.z
            public final void onSubscribe(f.a.b.b bVar) {
                f.a.e.a.b.replace(this, bVar);
            }

            @Override // f.a.z
            public final void onNext(R r) {
                this.downstream.onNext(r);
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                a<?, R> aVar = this.parent;
                if (aVar.error.addThrowable(th)) {
                    if (!aVar.tillTheEnd) {
                        aVar.upstream.dispose();
                    }
                    aVar.active = false;
                    aVar.a();
                    return;
                }
                f.a.h.a.a(th);
            }

            C4167a(z<? super R> zVar, a<?, R> aVar) {
                this.downstream = zVar;
                this.parent = aVar;
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            f.a.e.a.b.dispose(this.observer);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
            if (r0 == false) goto L_0x004f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 186
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.g.a.a():void");
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.offer(t);
            }
            a();
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                this.done = true;
                a();
                return;
            }
            f.a.h.a.a(th);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = dVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        a();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = dVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new f.a.e.f.c(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        a(z<? super R> zVar, f.a.d.g<? super T, ? extends x<? extends R>> gVar, int i2, boolean z) {
            this.downstream = zVar;
            this.mapper = gVar;
            this.bufferSize = i2;
            this.tillTheEnd = z;
            this.observer = new C4167a<>(zVar, this);
        }
    }

    static final class b<T, U> extends AtomicInteger implements f.a.b.b, z<T> {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final z<? super U> downstream;
        int fusionMode;
        final a<U> inner;
        final f.a.d.g<? super T, ? extends x<? extends U>> mapper;
        i<T> queue;
        f.a.b.b upstream;

        static {
            Covode.recordClassIndex(104718);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.disposed;
        }

        /* access modifiers changed from: package-private */
        public static final class a<U> extends AtomicReference<f.a.b.b> implements z<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final z<? super U> downstream;
            final b<?, ?> parent;

            static {
                Covode.recordClassIndex(104719);
            }

            @Override // f.a.z
            public final void onComplete() {
                b<?, ?> bVar = this.parent;
                bVar.active = false;
                bVar.a();
            }

            @Override // f.a.z
            public final void onSubscribe(f.a.b.b bVar) {
                f.a.e.a.b.replace(this, bVar);
            }

            @Override // f.a.z
            public final void onNext(U u) {
                this.downstream.onNext(u);
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            a(z<? super U> zVar, b<?, ?> bVar) {
                this.downstream = zVar;
                this.parent = bVar;
            }
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                a();
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.disposed = true;
            f.a.e.a.b.dispose(this.inner);
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
            if (r0 == false) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.g.b.a():void");
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.done) {
                f.a.h.a.a(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode == 0) {
                    this.queue.offer(t);
                }
                a();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = dVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        a();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = dVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new f.a.e.f.c(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        b(z<? super U> zVar, f.a.d.g<? super T, ? extends x<? extends U>> gVar, int i2) {
            this.downstream = zVar;
            this.mapper = gVar;
            this.bufferSize = i2;
            this.inner = new a<>(zVar, this);
        }
    }

    @Override // f.a.t
    public final void a(z<? super U> zVar) {
        boolean z;
        if (!ay.a(this.f157412a, zVar, this.f157653b)) {
            if (this.f157655d == f.a.e.j.g.IMMEDIATE) {
                this.f157412a.b(new b(new f.a.g.c(zVar), this.f157653b, this.f157654c));
                return;
            }
            x xVar = this.f157412a;
            f.a.d.g<? super T, ? extends x<? extends U>> gVar = this.f157653b;
            int i2 = this.f157654c;
            if (this.f157655d == f.a.e.j.g.END) {
                z = true;
            } else {
                z = false;
            }
            xVar.b(new a(zVar, gVar, i2, z));
        }
    }

    public g(x<T> xVar, f.a.d.g<? super T, ? extends x<? extends U>> gVar, int i2, f.a.e.j.g gVar2) {
        super(xVar);
        this.f157653b = gVar;
        this.f157655d = gVar2;
        this.f157654c = Math.max(8, i2);
    }
}
