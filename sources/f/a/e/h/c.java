package f.a.e.h;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.a;
import f.a.d.f;
import f.a.l;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public final class c<T> extends AtomicReference<d> implements b, l<T>, d {
    private static final long serialVersionUID = -7251123623727029452L;
    final a onComplete;
    final f<? super Throwable> onError;
    final f<? super T> onNext;
    final f<? super d> onSubscribe;

    static {
        Covode.recordClassIndex(104851);
    }

    @Override // org.a.d
    public final void cancel() {
        f.a.e.i.f.cancel(this);
    }

    @Override // f.a.b.b
    public final void dispose() {
        cancel();
    }

    public final boolean hasCustomOnError() {
        if (this.onError != f.a.e.b.a.f157193f) {
            return true;
        }
        return false;
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (get() == f.a.e.i.f.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.a.c
    public final void onComplete() {
        if (get() != f.a.e.i.f.CANCELLED) {
            lazySet(f.a.e.i.f.CANCELLED);
            try {
                this.onComplete.a();
            } catch (Throwable th) {
                f.a.c.b.a(th);
                f.a.h.a.a(th);
            }
        }
    }

    @Override // org.a.d
    public final void request(long j2) {
        ((d) get()).request(j2);
    }

    @Override // org.a.c
    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                ((d) get()).cancel();
                onError(th);
            }
        }
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(d dVar) {
        if (f.a.e.i.f.setOnce(this, dVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                f.a.c.b.a(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    @Override // org.a.c
    public final void onError(Throwable th) {
        if (get() != f.a.e.i.f.CANCELLED) {
            lazySet(f.a.e.i.f.CANCELLED);
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

    public c(f<? super T> fVar, f<? super Throwable> fVar2, a aVar, f<? super d> fVar3) {
        this.onNext = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
        this.onSubscribe = fVar3;
    }
}
