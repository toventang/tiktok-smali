package f.a.b;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    static {
        Covode.recordClassIndex(104374);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.b.d<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.b.b
    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            a(andSet);
        }
    }

    d(T t) {
        super(b.a((Object) t, "value is null"));
    }
}
