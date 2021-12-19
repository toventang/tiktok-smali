package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.e.c.b;
import f.a.e.i.f;
import f.a.h;
import f.a.l;
import java.util.NoSuchElementException;
import org.a.d;

public final class ab<T> extends f.a.ab<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    final h<T> f157269a;

    /* renamed from: b  reason: collision with root package name */
    final T f157270b = null;

    static {
        Covode.recordClassIndex(104477);
    }

    static final class a<T> implements f.a.b.b, l<T> {

        /* renamed from: a  reason: collision with root package name */
        final ae<? super T> f157271a;

        /* renamed from: b  reason: collision with root package name */
        final T f157272b;

        /* renamed from: c  reason: collision with root package name */
        d f157273c;

        /* renamed from: d  reason: collision with root package name */
        boolean f157274d;

        /* renamed from: e  reason: collision with root package name */
        T f157275e;

        static {
            Covode.recordClassIndex(104478);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157273c.cancel();
            this.f157273c = f.CANCELLED;
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            if (this.f157273c == f.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.a.c
        public final void onComplete() {
            if (!this.f157274d) {
                this.f157274d = true;
                this.f157273c = f.CANCELLED;
                T t = this.f157275e;
                this.f157275e = null;
                if (t == null && (t = this.f157272b) == null) {
                    this.f157271a.onError(new NoSuchElementException());
                } else {
                    this.f157271a.onSuccess(t);
                }
            }
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            if (this.f157274d) {
                f.a.h.a.a(th);
                return;
            }
            this.f157274d = true;
            this.f157273c = f.CANCELLED;
            this.f157271a.onError(th);
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.validate(this.f157273c, dVar)) {
                this.f157273c = dVar;
                this.f157271a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.f157274d) {
                if (this.f157275e != null) {
                    this.f157274d = true;
                    this.f157273c.cancel();
                    this.f157273c = f.CANCELLED;
                    this.f157271a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f157275e = t;
            }
        }

        a(ae<? super T> aeVar, T t) {
            this.f157271a = aeVar;
            this.f157272b = t;
        }
    }

    @Override // f.a.e.c.b
    public final h<T> a() {
        return f.a.h.a.a(new z(this.f157269a, this.f157270b, true));
    }

    public ab(h<T> hVar) {
        this.f157269a = hVar;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        this.f157269a.a((l) new a(aeVar, this.f157270b));
    }
}
