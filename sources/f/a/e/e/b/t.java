package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.e.i.f;
import f.a.h;
import f.a.l;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class t<T> extends a<T, T> {
    static {
        Covode.recordClassIndex(104529);
    }

    static final class a<T> extends AtomicLong implements l<T>, d {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final c<? super T> downstream;
        d upstream;

        static {
            Covode.recordClassIndex(104530);
        }

        @Override // org.a.d
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // org.a.c
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        a(c<? super T> cVar) {
            this.downstream = cVar;
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.validate(j2)) {
                f.a.e.j.d.a(this, j2);
            }
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            if (this.done) {
                f.a.h.a.a(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.done) {
                if (get() != 0) {
                    this.downstream.onNext(t);
                    f.a.e.j.d.b(this, 1);
                    return;
                }
                onError(new f.a.c.c("could not emit value due to lack of requests"));
            }
        }
    }

    public t(h<T> hVar) {
        super(hVar);
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157263b.a((l) new a(cVar));
    }
}
