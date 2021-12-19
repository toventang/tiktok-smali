package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.a;
import f.a.d.f;
import f.a.e.a.c;
import f.a.z;

public final class k<T> implements b, z<T> {

    /* renamed from: a  reason: collision with root package name */
    final z<? super T> f157222a;

    /* renamed from: b  reason: collision with root package name */
    final f<? super b> f157223b;

    /* renamed from: c  reason: collision with root package name */
    final a f157224c;

    /* renamed from: d  reason: collision with root package name */
    b f157225d;

    static {
        Covode.recordClassIndex(104447);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return this.f157225d.isDisposed();
    }

    @Override // f.a.z
    public final void onComplete() {
        if (this.f157225d != f.a.e.a.b.DISPOSED) {
            this.f157225d = f.a.e.a.b.DISPOSED;
            this.f157222a.onComplete();
        }
    }

    @Override // f.a.b.b
    public final void dispose() {
        b bVar = this.f157225d;
        if (bVar != f.a.e.a.b.DISPOSED) {
            this.f157225d = f.a.e.a.b.DISPOSED;
            try {
                this.f157224c.a();
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
            bVar.dispose();
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        this.f157222a.onNext(t);
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        if (this.f157225d != f.a.e.a.b.DISPOSED) {
            this.f157225d = f.a.e.a.b.DISPOSED;
            this.f157222a.onError(th);
            return;
        }
        f.a.h.a.a(th);
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        try {
            this.f157223b.accept(bVar);
            if (f.a.e.a.b.validate(this.f157225d, bVar)) {
                this.f157225d = bVar;
                this.f157222a.onSubscribe(this);
            }
        } catch (Throwable th) {
            f.a.c.b.a(th);
            bVar.dispose();
            this.f157225d = f.a.e.a.b.DISPOSED;
            c.error(th, this.f157222a);
        }
    }

    public k(z<? super T> zVar, f<? super b> fVar, a aVar) {
        this.f157222a = zVar;
        this.f157223b = fVar;
        this.f157224c = aVar;
    }
}
