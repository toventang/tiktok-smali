package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.d.a;
import f.a.d.f;
import f.a.p;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T> extends AtomicReference<f.a.b.b> implements f.a.b.b, p<T> {
    private static final long serialVersionUID = -6076952298809384986L;
    final a onComplete;
    final f<? super Throwable> onError;
    final f<? super T> onSuccess;

    static {
        Covode.recordClassIndex(104546);
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.e.a.b.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.onError != f.a.e.b.a.f157193f) {
            return true;
        }
        return false;
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return f.a.e.a.b.isDisposed((f.a.b.b) get());
    }

    @Override // f.a.p
    public final void onComplete() {
        lazySet(f.a.e.a.b.DISPOSED);
        try {
            this.onComplete.a();
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.h.a.a(th);
        }
    }

    @Override // f.a.p
    public final void onSubscribe(f.a.b.b bVar) {
        f.a.e.a.b.setOnce(this, bVar);
    }

    @Override // f.a.p
    public final void onSuccess(T t) {
        lazySet(f.a.e.a.b.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            f.a.h.a.a(th);
        }
    }

    @Override // f.a.p
    public final void onError(Throwable th) {
        lazySet(f.a.e.a.b.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            f.a.c.b.a(th2);
            f.a.h.a.a(new f.a.c.a(th, th2));
        }
    }

    public b(f<? super T> fVar, f<? super Throwable> fVar2, a aVar) {
        this.onSuccess = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
    }
}
