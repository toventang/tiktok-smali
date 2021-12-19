package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.b.b;
import f.a.h.a;
import java.util.concurrent.atomic.AtomicReference;

public final class d<T> extends AtomicReference<b> implements ae<T>, b {
    private static final long serialVersionUID = 4943102778943297569L;
    final f.a.d.b<? super T, ? super Throwable> onCallback;

    static {
        Covode.recordClassIndex(104440);
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.e.a.b.dispose(this);
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

    public d(f.a.d.b<? super T, ? super Throwable> bVar) {
        this.onCallback = bVar;
    }

    @Override // f.a.ae
    public final void onSuccess(T t) {
        try {
            lazySet(f.a.e.a.b.DISPOSED);
            this.onCallback.a(t, null);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            a.a(th);
        }
    }

    @Override // f.a.ae
    public final void onError(Throwable th) {
        try {
            lazySet(f.a.e.a.b.DISPOSED);
            this.onCallback.a(null, th);
        } catch (Throwable th2) {
            f.a.c.b.a(th2);
            a.a(new f.a.c.a(th, th2));
        }
    }
}
