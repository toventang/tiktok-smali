package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.e.c.d;
import f.a.e.c.i;
import f.a.e.d.m;
import f.a.e.d.n;
import f.a.e.j.c;
import f.a.x;
import f.a.z;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

public final class h<T, R> extends a<T, R> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super T, ? extends x<? extends R>> f157656b;

    /* renamed from: c  reason: collision with root package name */
    final f.a.e.j.g f157657c;

    /* renamed from: d  reason: collision with root package name */
    final int f157658d;

    /* renamed from: e  reason: collision with root package name */
    final int f157659e;

    static {
        Covode.recordClassIndex(104720);
    }

    static final class a<T, R> extends AtomicInteger implements b, n<R>, z<T> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        volatile boolean cancelled;
        m<R> current;
        volatile boolean done;
        final z<? super R> downstream;
        final c error = new c();
        final f.a.e.j.g errorMode;
        final g<? super T, ? extends x<? extends R>> mapper;
        final int maxConcurrency;
        final ArrayDeque<m<R>> observers = new ArrayDeque<>();
        final int prefetch;
        i<T> queue;
        int sourceMode;
        b upstream;

        static {
            Covode.recordClassIndex(104721);
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

        private void b() {
            m<R> mVar = this.current;
            if (mVar != null) {
                mVar.dispose();
            }
            while (true) {
                m<R> poll = this.observers.poll();
                if (poll != null) {
                    poll.dispose();
                } else {
                    return;
                }
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.cancelled = true;
            if (getAndIncrement() == 0) {
                this.queue.clear();
                b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
            if (r0 == false) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
            if (r10 != null) goto L_0x00dc;
         */
        @Override // f.a.e.d.n
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 357
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.h.a.a():void");
        }

        @Override // f.a.e.d.n
        public final void a(m<R> mVar) {
            mVar.setDone();
            a();
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
        public final void onSubscribe(b bVar) {
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
                this.queue = new f.a.e.f.c(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.e.d.n
        public final void a(m<R> mVar, R r) {
            mVar.queue().offer(r);
            a();
        }

        @Override // f.a.e.d.n
        public final void a(m<R> mVar, Throwable th) {
            if (this.error.addThrowable(th)) {
                if (this.errorMode == f.a.e.j.g.IMMEDIATE) {
                    this.upstream.dispose();
                }
                mVar.setDone();
                a();
                return;
            }
            f.a.h.a.a(th);
        }

        a(z<? super R> zVar, g<? super T, ? extends x<? extends R>> gVar, int i2, int i3, f.a.e.j.g gVar2) {
            this.downstream = zVar;
            this.mapper = gVar;
            this.maxConcurrency = i2;
            this.prefetch = i3;
            this.errorMode = gVar2;
        }
    }

    @Override // f.a.t
    public final void a(z<? super R> zVar) {
        this.f157412a.b(new a(zVar, this.f157656b, this.f157658d, this.f157659e, this.f157657c));
    }

    public h(x<T> xVar, g<? super T, ? extends x<? extends R>> gVar, f.a.e.j.g gVar2, int i2, int i3) {
        super(xVar);
        this.f157656b = gVar;
        this.f157657c = gVar2;
        this.f157658d = i2;
        this.f157659e = i3;
    }
}
