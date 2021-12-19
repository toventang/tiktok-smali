package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.a;
import f.a.d.f;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;

public final class o<T> extends AtomicReference<b> implements b, z<T> {
    private static final long serialVersionUID = -7251123623727029452L;
    final a onComplete;
    final f<? super Throwable> onError;
    final f<? super T> onNext;
    final f<? super b> onSubscribe;

    static {
        Covode.recordClassIndex(104451);
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
        if (get() == f.a.e.a.b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // f.a.z
    public final void onComplete() {
        if (!isDisposed()) {
            lazySet(f.a.e.a.b.DISPOSED);
            try {
                this.onComplete.a();
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                ((b) get()).dispose();
                onError(th);
            }
        }
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        if (f.a.e.a.b.setOnce(this, bVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                bVar.dispose();
                onError(th);
            }
        }
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(f.a.e.a.b.DISPOSED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                f.a.h.a.a(new f.a.c.a(th, th2));
            }
        } else {
            f.a.h.a.a(th);
        }
    }

    public o(f<? super T> fVar, f<? super Throwable> fVar2, a aVar, f<? super b> fVar3) {
        this.onNext = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
        this.onSubscribe = fVar3;
    }
}
