package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.b;
import f.a.d;
import f.a.e.a.c;
import f.a.f;

public final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    final f f157251a;

    /* renamed from: b  reason: collision with root package name */
    final f.a.d.f<? super f.a.b.b> f157252b;

    /* renamed from: c  reason: collision with root package name */
    final f.a.d.f<? super Throwable> f157253c;

    /* renamed from: d  reason: collision with root package name */
    final f.a.d.a f157254d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.d.a f157255e;

    /* renamed from: f  reason: collision with root package name */
    final f.a.d.a f157256f;

    /* renamed from: g  reason: collision with root package name */
    final f.a.d.a f157257g;

    static {
        Covode.recordClassIndex(104470);
    }

    final class a implements f.a.b.b, d {

        /* renamed from: a  reason: collision with root package name */
        final d f157258a;

        /* renamed from: b  reason: collision with root package name */
        f.a.b.b f157259b;

        static {
            Covode.recordClassIndex(104471);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157259b.isDisposed();
        }

        private void a() {
            try {
                j.this.f157256f.a();
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            try {
                j.this.f157257g.a();
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
            this.f157259b.dispose();
        }

        @Override // f.a.d
        public final void onComplete() {
            if (this.f157259b != f.a.e.a.b.DISPOSED) {
                try {
                    j.this.f157254d.a();
                    j.this.f157255e.a();
                    this.f157258a.onComplete();
                    a();
                } catch (Throwable th) {
                    f.a.c.b.a(th);
                    this.f157258a.onError(th);
                }
            }
        }

        @Override // f.a.d
        public final void onError(Throwable th) {
            if (this.f157259b == f.a.e.a.b.DISPOSED) {
                f.a.h.a.a(th);
                return;
            }
            try {
                j.this.f157253c.accept(th);
                j.this.f157255e.a();
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                th = new f.a.c.a(th, th2);
            }
            this.f157258a.onError(th);
            a();
        }

        @Override // f.a.d
        public final void onSubscribe(f.a.b.b bVar) {
            try {
                j.this.f157252b.accept(bVar);
                if (f.a.e.a.b.validate(this.f157259b, bVar)) {
                    this.f157259b = bVar;
                    this.f157258a.onSubscribe(this);
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                bVar.dispose();
                this.f157259b = f.a.e.a.b.DISPOSED;
                c.error(th, this.f157258a);
            }
        }

        a(d dVar) {
            this.f157258a = dVar;
        }
    }

    @Override // f.a.b
    public final void b(d dVar) {
        this.f157251a.a(new a(dVar));
    }

    public j(f fVar, f.a.d.f<? super f.a.b.b> fVar2, f.a.d.f<? super Throwable> fVar3, f.a.d.a aVar, f.a.d.a aVar2, f.a.d.a aVar3, f.a.d.a aVar4) {
        this.f157251a = fVar;
        this.f157252b = fVar2;
        this.f157253c = fVar3;
        this.f157254d = aVar;
        this.f157255e = aVar2;
        this.f157256f = aVar3;
        this.f157257g = aVar4;
    }
}
