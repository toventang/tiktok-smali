package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.e.a.f;
import f.a.x;
import f.a.z;

public final class ap<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final g<? super Throwable, ? extends x<? extends T>> f157461b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f157462c;

    static {
        Covode.recordClassIndex(104625);
    }

    static final class a<T> implements z<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157463a;

        /* renamed from: b  reason: collision with root package name */
        final g<? super Throwable, ? extends x<? extends T>> f157464b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f157465c;

        /* renamed from: d  reason: collision with root package name */
        final f f157466d = new f();

        /* renamed from: e  reason: collision with root package name */
        boolean f157467e;

        /* renamed from: f  reason: collision with root package name */
        boolean f157468f;

        static {
            Covode.recordClassIndex(104626);
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.f157468f) {
                this.f157468f = true;
                this.f157467e = true;
                this.f157463a.onComplete();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            this.f157466d.replace(bVar);
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.f157468f) {
                this.f157463a.onNext(t);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (!this.f157467e) {
                this.f157467e = true;
                if (!this.f157465c || (th instanceof Exception)) {
                    try {
                        x xVar = (x) this.f157464b.apply(th);
                        if (xVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f157463a.onError(nullPointerException);
                            return;
                        }
                        xVar.b(this);
                    } catch (Throwable th2) {
                        f.a.c.b.a(th2);
                        this.f157463a.onError(new f.a.c.a(th, th2));
                    }
                } else {
                    this.f157463a.onError(th);
                }
            } else if (this.f157468f) {
                f.a.h.a.a(th);
            } else {
                this.f157463a.onError(th);
            }
        }

        a(z<? super T> zVar, g<? super Throwable, ? extends x<? extends T>> gVar, boolean z) {
            this.f157463a = zVar;
            this.f157464b = gVar;
            this.f157465c = z;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a aVar = new a(zVar, this.f157461b, this.f157462c);
        zVar.onSubscribe(aVar.f157466d);
        this.f157412a.b(aVar);
    }

    public ap(x<T> xVar, g<? super Throwable, ? extends x<? extends T>> gVar, boolean z) {
        super(xVar);
        this.f157461b = gVar;
        this.f157462c = z;
    }
}
