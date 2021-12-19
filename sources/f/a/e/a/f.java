package f.a.e.a;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends AtomicReference<b> implements b {
    private static final long serialVersionUID = -754898800686245608L;

    static {
        Covode.recordClassIndex(104405);
    }

    public f() {
    }

    @Override // f.a.b.b
    public final void dispose() {
        b.dispose(this);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return b.isDisposed((b) get());
    }

    public f(b bVar) {
        lazySet(bVar);
    }

    public final boolean replace(b bVar) {
        return b.replace(this, bVar);
    }

    public final boolean update(b bVar) {
        return b.set(this, bVar);
    }
}
