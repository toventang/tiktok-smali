package f.a.e.h;

import com.bytedance.covode.number.Covode;
import f.a.e.i.f;
import f.a.h.a;
import f.a.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;

public final class d<T> extends AtomicInteger implements l<T>, org.a.d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final c<? super T> downstream;
    final f.a.e.j.c error = new f.a.e.j.c();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<org.a.d> upstream = new AtomicReference<>();

    static {
        Covode.recordClassIndex(104852);
    }

    @Override // org.a.d
    public final void cancel() {
        if (!this.done) {
            f.cancel(this.upstream);
        }
    }

    @Override // org.a.c
    public final void onComplete() {
        this.done = true;
        c<? super T> cVar = this.downstream;
        f.a.e.j.c cVar2 = this.error;
        if (getAndIncrement() == 0) {
            Throwable terminate = cVar2.terminate();
            if (terminate != null) {
                cVar.onError(terminate);
            } else {
                cVar.onComplete();
            }
        }
    }

    @Override // org.a.c
    public final void onError(Throwable th) {
        this.done = true;
        c<? super T> cVar = this.downstream;
        f.a.e.j.c cVar2 = this.error;
        if (!cVar2.addThrowable(th)) {
            a.a(th);
        } else if (getAndIncrement() == 0) {
            cVar.onError(cVar2.terminate());
        }
    }

    public d(c<? super T> cVar) {
        this.downstream = cVar;
    }

    @Override // org.a.c
    public final void onNext(T t) {
        c<? super T> cVar = this.downstream;
        f.a.e.j.c cVar2 = this.error;
        if (get() == 0 && compareAndSet(0, 1)) {
            cVar.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable terminate = cVar2.terminate();
                if (terminate != null) {
                    cVar.onError(terminate);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(org.a.d dVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            f.deferredSetOnce(this.upstream, this.requested, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // org.a.d
    public final void request(long j2) {
        if (j2 <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was ".concat(String.valueOf(j2))));
            return;
        }
        f.deferredRequest(this.upstream, this.requested, j2);
    }
}
