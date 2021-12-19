package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.i.e;
import f.a.e.i.f;
import f.a.h;
import f.a.l;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class v<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final g<? super h<Object>, ? extends org.a.b<?>> f157340c;

    static {
        Covode.recordClassIndex(104533);
    }

    static final class b<T, U> extends AtomicInteger implements l<Object>, d {
        private static final long serialVersionUID = 2827772011130406689L;
        final AtomicLong requested = new AtomicLong();
        final org.a.b<T> source;
        c<T, U> subscriber;
        final AtomicReference<d> upstream = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104535);
        }

        @Override // org.a.d
        public final void cancel() {
            f.cancel(this.upstream);
        }

        @Override // org.a.c
        public final void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            f.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        @Override // org.a.d
        public final void request(long j2) {
            f.deferredRequest(this.upstream, this.requested, j2);
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        b(org.a.b<T> bVar) {
            this.source = bVar;
        }

        @Override // org.a.c
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != f.CANCELLED) {
                    this.source.a_(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    static final class a<T> extends c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        static {
            Covode.recordClassIndex(104534);
        }

        @Override // org.a.c
        public final void onComplete() {
            a(0);
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }

        a(org.a.c<? super T> cVar, f.a.i.a<Object> aVar, d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c<T, U> extends e implements l<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final org.a.c<? super T> downstream;
        protected final f.a.i.a<U> processor;
        private long produced;
        protected final d receiver;

        static {
            Covode.recordClassIndex(104536);
        }

        @Override // org.a.d, f.a.e.i.e
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            setSubscription(dVar);
        }

        @Override // org.a.c
        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        /* access modifiers changed from: protected */
        public final void a(U u) {
            setSubscription(f.a.e.i.c.INSTANCE);
            long j2 = this.produced;
            if (j2 != 0) {
                this.produced = 0;
                produced(j2);
            }
            this.receiver.request(1);
            this.processor.onNext(u);
        }

        c(org.a.c<? super T> cVar, f.a.i.a<U> aVar, d dVar) {
            super(false);
            this.downstream = cVar;
            this.processor = aVar;
            this.receiver = dVar;
        }
    }

    @Override // f.a.h
    public final void a(org.a.c<? super T> cVar) {
        f.a.m.b bVar = new f.a.m.b(cVar);
        f.a.i.a<T> f2 = new f.a.i.d().f();
        try {
            org.a.b bVar2 = (org.a.b) f.a.e.b.b.a(this.f157340c.apply(f2), "handler returned a null Publisher");
            b bVar3 = new b(this.f157263b);
            a aVar = new a(bVar, f2, bVar3);
            bVar3.subscriber = aVar;
            cVar.onSubscribe(aVar);
            bVar2.a_(bVar3);
            bVar3.onNext(0);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.e.i.c.error(th, cVar);
        }
    }
}
