package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.i.f;
import f.a.h;
import f.a.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.b;
import org.a.c;
import org.a.d;

public final class ac<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final aa f157276c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f157277d;

    static {
        Covode.recordClassIndex(104479);
    }

    static final class a<T> extends AtomicReference<Thread> implements l<T>, Runnable, d {
        private static final long serialVersionUID = 8094547886072529208L;
        final c<? super T> downstream;
        final boolean nonScheduledRequests;
        final AtomicLong requested = new AtomicLong();
        b<T> source;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final aa.c worker;

        static {
            Covode.recordClassIndex(104480);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f.a.e.e.b.ac$a$a  reason: collision with other inner class name */
        public static final class RunnableC4158a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final d f157278a;

            /* renamed from: b  reason: collision with root package name */
            final long f157279b;

            static {
                Covode.recordClassIndex(104481);
            }

            public final void run() {
                this.f157278a.request(this.f157279b);
            }

            RunnableC4158a(d dVar, long j2) {
                this.f157278a = dVar;
                this.f157279b = j2;
            }
        }

        @Override // org.a.d
        public final void cancel() {
            f.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // org.a.c
        public final void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        public final void run() {
            lazySet(Thread.currentThread());
            b<T> bVar = this.source;
            this.source = null;
            bVar.a_(this);
        }

        @Override // org.a.c
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.setOnce(this.upstream, dVar)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, dVar);
                }
            }
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.validate(j2)) {
                d dVar = this.upstream.get();
                if (dVar != null) {
                    a(j2, dVar);
                    return;
                }
                f.a.e.j.d.a(this.requested, j2);
                d dVar2 = this.upstream.get();
                if (dVar2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        a(andSet, dVar2);
                    }
                }
            }
        }

        private void a(long j2, d dVar) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                dVar.request(j2);
            } else {
                this.worker.a(new RunnableC4158a(dVar, j2));
            }
        }

        a(c<? super T> cVar, aa.c cVar2, b<T> bVar, boolean z) {
            this.downstream = cVar;
            this.worker = cVar2;
            this.source = bVar;
            this.nonScheduledRequests = !z;
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        aa.c a2 = this.f157276c.a();
        a aVar = new a(cVar, a2, this.f157263b, this.f157277d);
        cVar.onSubscribe(aVar);
        a2.a(aVar);
    }

    public ac(h<T> hVar, aa aaVar, boolean z) {
        super(hVar);
        this.f157276c = aaVar;
        this.f157277d = z;
    }
}
