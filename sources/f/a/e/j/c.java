package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.c.a;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    static {
        Covode.recordClassIndex(104862);
    }

    public final boolean isTerminated() {
        if (get() == h.f157944a) {
            return true;
        }
        return false;
    }

    public final Throwable terminate() {
        Throwable th = (Throwable) get();
        if (th != h.f157944a) {
            return (Throwable) getAndSet(h.f157944a);
        }
        return th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Throwable[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addThrowable(Throwable th) {
        Object obj;
        Throwable aVar;
        do {
            obj = get();
            if (obj == h.f157944a) {
                return false;
            }
            if (obj == null) {
                aVar = th;
            } else {
                aVar = new a(obj, th);
            }
        } while (!compareAndSet(obj, aVar));
        return true;
    }
}
