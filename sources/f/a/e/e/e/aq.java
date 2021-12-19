package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.x;
import f.a.z;

public final class aq<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super Throwable, ? extends T> f157469b;

    static {
        Covode.recordClassIndex(104627);
    }

    static final class a<T> implements b, z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157470a;

        /* renamed from: b  reason: collision with root package name */
        final g<? super Throwable, ? extends T> f157471b;

        /* renamed from: c  reason: collision with root package name */
        b f157472c;

        static {
            Covode.recordClassIndex(104628);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157472c.dispose();
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157472c.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f157470a.onComplete();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.f157470a.onNext(t);
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157472c, bVar)) {
                this.f157472c = bVar;
                this.f157470a.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            try {
                Object apply = this.f157471b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f157470a.onError(nullPointerException);
                    return;
                }
                this.f157470a.onNext(apply);
                this.f157470a.onComplete();
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.f157470a.onError(new f.a.c.a(th, th2));
            }
        }

        a(z<? super T> zVar, g<? super Throwable, ? extends T> gVar) {
            this.f157470a = zVar;
            this.f157471b = gVar;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157412a.b(new a(zVar, this.f157469b));
    }

    public aq(x<T> xVar, g<? super Throwable, ? extends T> gVar) {
        super(xVar);
        this.f157469b = gVar;
    }
}
