package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.b.b;
import f.a.d.f;
import f.a.e.b.a;
import java.util.concurrent.atomic.AtomicReference;

public final class i<T> extends AtomicReference<b> implements ae<T>, b {
    private static final long serialVersionUID = -7012088219455310787L;
    final f<? super Throwable> onError;
    final f<? super T> onSuccess;

    static {
        Covode.recordClassIndex(104445);
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.e.a.b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.onError != a.f157193f) {
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

    @Override // f.a.ae
    public final void onSubscribe(b bVar) {
        f.a.e.a.b.setOnce(this, bVar);
    }

    @Override // f.a.ae
    public final void onSuccess(T t) {
        lazySet(f.a.e.a.b.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.h.a.a(th);
        }
    }

    @Override // f.a.ae
    public final void onError(Throwable th) {
        lazySet(f.a.e.a.b.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            f.a.c.b.a(th2);
            f.a.h.a.a(new f.a.c.a(th, th2));
        }
    }

    public i(f<? super T> fVar, f<? super Throwable> fVar2) {
        this.onSuccess = fVar;
        this.onError = fVar2;
    }
}
