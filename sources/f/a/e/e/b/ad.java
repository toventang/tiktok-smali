package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.b.b;
import f.a.e.i.f;
import f.a.h;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class ad extends h<Long> {

    /* renamed from: b  reason: collision with root package name */
    final aa f157280b;

    /* renamed from: c  reason: collision with root package name */
    final long f157281c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f157282d;

    static {
        Covode.recordClassIndex(104482);
    }

    static final class a extends AtomicReference<b> implements Runnable, d {
        private static final long serialVersionUID = -2809475196591179431L;
        final c<? super Long> downstream;
        volatile boolean requested;

        static {
            Covode.recordClassIndex(104483);
        }

        @Override // org.a.d
        public final void cancel() {
            f.a.e.a.b.dispose(this);
        }

        public final void run() {
            if (get() == f.a.e.a.b.DISPOSED) {
                return;
            }
            if (this.requested) {
                this.downstream.onNext(0L);
                lazySet(f.a.e.a.c.INSTANCE);
                this.downstream.onComplete();
                return;
            }
            lazySet(f.a.e.a.c.INSTANCE);
            this.downstream.onError(new f.a.c.c("Can't deliver value due to lack of requests"));
        }

        a(c<? super Long> cVar) {
            this.downstream = cVar;
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.validate(j2)) {
                this.requested = true;
            }
        }
    }

    @Override // f.a.h
    public final void a(c<? super Long> cVar) {
        a aVar = new a(cVar);
        cVar.onSubscribe(aVar);
        f.a.e.a.b.trySet(aVar, this.f157280b.a(aVar, this.f157281c, this.f157282d));
    }

    public ad(long j2, TimeUnit timeUnit, aa aaVar) {
        this.f157281c = j2;
        this.f157282d = timeUnit;
        this.f157280b = aaVar;
    }
}
