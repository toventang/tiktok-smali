package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.f;
import f.a.e.a.c;
import f.a.p;

public final class r<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final f<? super b> f157387b;

    /* renamed from: c  reason: collision with root package name */
    final f<? super T> f157388c;

    /* renamed from: d  reason: collision with root package name */
    final f<? super Throwable> f157389d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.d.a f157390e;

    /* renamed from: f  reason: collision with root package name */
    final f.a.d.a f157391f;

    /* renamed from: g  reason: collision with root package name */
    final f.a.d.a f157392g;

    static {
        Covode.recordClassIndex(104575);
    }

    static final class a<T> implements b, p<T> {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f157393a;

        /* renamed from: b  reason: collision with root package name */
        final r<T> f157394b;

        /* renamed from: c  reason: collision with root package name */
        b f157395c;

        static {
            Covode.recordClassIndex(104576);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157395c.isDisposed();
        }

        private void a() {
            try {
                this.f157394b.f157391f.a();
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            try {
                this.f157394b.f157392g.a();
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
            this.f157395c.dispose();
            this.f157395c = f.a.e.a.b.DISPOSED;
        }

        @Override // f.a.p
        public final void onComplete() {
            if (this.f157395c != f.a.e.a.b.DISPOSED) {
                try {
                    this.f157394b.f157390e.a();
                    this.f157395c = f.a.e.a.b.DISPOSED;
                    this.f157393a.onComplete();
                    a();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    a(th);
                }
            }
        }

        @Override // f.a.p
        public final void onError(Throwable th) {
            if (this.f157395c == f.a.e.a.b.DISPOSED) {
                f.a.h.a.a(th);
            } else {
                a(th);
            }
        }

        private void a(Throwable th) {
            try {
                this.f157394b.f157389d.accept(th);
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                th = new f.a.c.a(th, th2);
            }
            this.f157395c = f.a.e.a.b.DISPOSED;
            this.f157393a.onError(th);
            a();
        }

        @Override // f.a.p
        public final void onSubscribe(b bVar) {
            if (f.a.e.a.b.validate(this.f157395c, bVar)) {
                try {
                    this.f157394b.f157387b.accept(bVar);
                    this.f157395c = bVar;
                    this.f157393a.onSubscribe(this);
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    bVar.dispose();
                    this.f157395c = f.a.e.a.b.DISPOSED;
                    c.error(th, this.f157393a);
                }
            }
        }

        @Override // f.a.p
        public final void onSuccess(T t) {
            if (this.f157395c != f.a.e.a.b.DISPOSED) {
                try {
                    this.f157394b.f157388c.accept(t);
                    this.f157395c = f.a.e.a.b.DISPOSED;
                    this.f157393a.onSuccess(t);
                    a();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    a(th);
                }
            }
        }

        a(p<? super T> pVar, r<T> rVar) {
            this.f157393a = pVar;
            this.f157394b = rVar;
        }
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        this.f157348a.a(new a(pVar, this));
    }

    public r(f.a.r<T> rVar, f<? super b> fVar, f<? super T> fVar2, f<? super Throwable> fVar3, f.a.d.a aVar, f.a.d.a aVar2, f.a.d.a aVar3) {
        super(rVar);
        this.f157387b = fVar;
        this.f157388c = fVar2;
        this.f157389d = fVar3;
        this.f157390e = aVar;
        this.f157391f = aVar2;
        this.f157392g = aVar3;
    }
}
