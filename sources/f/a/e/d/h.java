package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d;
import f.a.d.a;
import f.a.d.f;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends AtomicReference<b> implements b, d, f<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final a onComplete;
    final f<? super Throwable> onError;

    static {
        Covode.recordClassIndex(104444);
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.e.a.b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.onError != this) {
            return true;
        }
        return false;
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (get() == f.a.e.a.b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // f.a.d
    public final void onComplete() {
        try {
            this.onComplete.a();
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.h.a.a(th);
        }
        lazySet(f.a.e.a.b.DISPOSED);
    }

    @Override // f.a.d
    public final void onSubscribe(b bVar) {
        f.a.e.a.b.setOnce(this, bVar);
    }

    public h(a aVar) {
        this.onError = this;
        this.onComplete = aVar;
    }

    public final void accept(Throwable th) {
        f.a.h.a.a(new f.a.c.d(th));
    }

    @Override // f.a.d
    public final void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            f.a.c.b.a(th2);
            f.a.h.a.a(th2);
        }
        lazySet(f.a.e.a.b.DISPOSED);
    }

    public h(f<? super Throwable> fVar, a aVar) {
        this.onError = fVar;
        this.onComplete = aVar;
    }
}
