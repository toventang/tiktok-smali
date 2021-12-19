package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d;
import f.a.h.a;
import java.util.concurrent.atomic.AtomicReference;

public final class l extends AtomicReference<b> implements b, d {
    private static final long serialVersionUID = -7545121636549663526L;

    static {
        Covode.recordClassIndex(104448);
    }

    public final boolean hasCustomOnError() {
        return false;
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.e.a.b.dispose(this);
    }

    @Override // f.a.d
    public final void onComplete() {
        lazySet(f.a.e.a.b.DISPOSED);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (get() == f.a.e.a.b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // f.a.d
    public final void onSubscribe(b bVar) {
        f.a.e.a.b.setOnce(this, bVar);
    }

    @Override // f.a.d
    public final void onError(Throwable th) {
        lazySet(f.a.e.a.b.DISPOSED);
        a.a(new f.a.c.d(th));
    }
}
