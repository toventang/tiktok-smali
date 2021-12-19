package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.c.b;
import f.a.d.f;
import f.a.h;
import f.a.l;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class s<T> extends a<T, T> implements f<T> {

    /* renamed from: c  reason: collision with root package name */
    final f<? super T> f157339c = this;

    static {
        Covode.recordClassIndex(104527);
    }

    @Override // f.a.d.f
    public final void accept(T t) {
    }

    static final class a<T> extends AtomicLong implements l<T>, d {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final c<? super T> downstream;
        final f<? super T> onDrop;
        d upstream;

        static {
            Covode.recordClassIndex(104528);
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

        @Override // org.a.d
        public final void request(long j2) {
            if (f.a.e.i.f.validate(j2)) {
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
            if (f.a.e.i.f.validate(this.upstream, dVar)) {
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
                try {
                    this.onDrop.accept(t);
                } catch (Throwable th) {
                    b.a(th);
                    cancel();
                    onError(th);
                }
            }
        }

        a(c<? super T> cVar, f<? super T> fVar) {
            this.downstream = cVar;
            this.onDrop = fVar;
        }
    }

    public s(h<T> hVar) {
        super(hVar);
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157263b.a((l) new a(cVar, this.f157339c));
    }
}
