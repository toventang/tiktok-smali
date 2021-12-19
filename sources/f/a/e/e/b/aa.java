package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.e.c.b;
import f.a.e.i.f;
import f.a.h;
import f.a.l;
import f.a.n;
import f.a.p;
import org.a.d;

public final class aa<T> extends n<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    final h<T> f157264a;

    static {
        Covode.recordClassIndex(104475);
    }

    static final class a<T> implements f.a.b.b, l<T> {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157265a;

        /* renamed from: b  reason: collision with root package name */
        d f157266b;

        /* renamed from: c  reason: collision with root package name */
        boolean f157267c;

        /* renamed from: d  reason: collision with root package name */
        T f157268d;

        static {
            Covode.recordClassIndex(104476);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157266b.cancel();
            this.f157266b = f.CANCELLED;
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (this.f157266b == f.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.a.c
        public final void onComplete() {
            if (!this.f157267c) {
                this.f157267c = true;
                this.f157266b = f.CANCELLED;
                T t = this.f157268d;
                this.f157268d = null;
                if (t == null) {
                    this.f157265a.onComplete();
                } else {
                    this.f157265a.onSuccess(t);
                }
            }
        }

        a(p<? super T> pVar) {
            this.f157265a = pVar;
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            if (this.f157267c) {
                f.a.h.a.a(th);
                return;
            }
            this.f157267c = true;
            this.f157266b = f.CANCELLED;
            this.f157265a.onError(th);
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.validate(this.f157266b, dVar)) {
                this.f157266b = dVar;
                this.f157265a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.f157267c) {
                if (this.f157268d != null) {
                    this.f157267c = true;
                    this.f157266b.cancel();
                    this.f157266b = f.CANCELLED;
                    this.f157265a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f157268d = t;
            }
        }
    }

    @Override // f.a.e.c.b
    public final h<T> a() {
        return f.a.h.a.a(new z(this.f157264a, null, false));
    }

    public aa(h<T> hVar) {
        this.f157264a = hVar;
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157264a.a((l) new a(pVar));
    }
}
