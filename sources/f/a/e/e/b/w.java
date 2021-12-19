package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.k;
import f.a.e.i.e;
import f.a.h;
import f.a.l;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.b;
import org.a.c;
import org.a.d;

public final class w<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final k<? super Throwable> f157341c;

    /* renamed from: d  reason: collision with root package name */
    final long f157342d;

    static {
        Covode.recordClassIndex(104537);
    }

    static final class a<T> extends AtomicInteger implements l<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c<? super T> downstream;
        final k<? super Throwable> predicate;
        long produced;
        long remaining;
        final e sa;
        final b<? extends T> source;

        static {
            Covode.recordClassIndex(104538);
        }

        @Override // org.a.c
        public final void onComplete() {
            this.downstream.onComplete();
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.sa.isCancelled()) {
                    long j2 = this.produced;
                    if (j2 != 0) {
                        this.produced = 0;
                        this.sa.produced(j2);
                    }
                    this.source.a_(this);
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            this.sa.setSubscription(dVar);
        }

        @Override // org.a.c
        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            long j2 = this.remaining;
            if (j2 != Long.MAX_VALUE) {
                this.remaining = j2 - 1;
            }
            if (j2 == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.a(th)) {
                    this.downstream.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.downstream.onError(new f.a.c.a(th, th2));
            }
        }

        a(c<? super T> cVar, long j2, k<? super Throwable> kVar, e eVar, b<? extends T> bVar) {
            this.downstream = cVar;
            this.sa = eVar;
            this.source = bVar;
            this.predicate = kVar;
            this.remaining = j2;
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        e eVar = new e(false);
        cVar.onSubscribe(eVar);
        new a(cVar, this.f157342d, this.f157341c, eVar, this.f157263b).a();
    }

    public w(h<T> hVar, long j2, k<? super Throwable> kVar) {
        super(hVar);
        this.f157341c = kVar;
        this.f157342d = j2;
    }
}
