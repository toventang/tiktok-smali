package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.e.i.b;
import f.a.e.i.f;
import f.a.h;
import f.a.l;
import java.util.NoSuchElementException;
import org.a.c;
import org.a.d;

public final class z<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final T f157346c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f157347d;

    static {
        Covode.recordClassIndex(104543);
    }

    static final class a<T> extends b<T> implements l<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;
        d upstream;

        static {
            Covode.recordClassIndex(104544);
        }

        @Override // org.a.d, f.a.e.i.b
        public final void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // org.a.c
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                T t = (T) this.value;
                this.value = null;
                if (t != null || (t = this.defaultValue) != null) {
                    complete(t);
                } else if (this.failOnEmpty) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.onComplete();
                }
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
                if (this.value != null) {
                    this.done = true;
                    this.upstream.cancel();
                    this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
            }
        }

        a(c<? super T> cVar, T t, boolean z) {
            super(cVar);
            this.defaultValue = t;
            this.failOnEmpty = z;
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157263b.a((l) new a(cVar, this.f157346c, this.f157347d));
    }

    public z(h<T> hVar, T t, boolean z) {
        super(hVar);
        this.f157346c = t;
        this.f157347d = z;
    }
}
