package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class m<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f159138a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    static {
        Covode.recordClassIndex(105663);
    }

    public final int a() {
        long j2 = ((n) this._cur)._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final void b() {
        while (true) {
            n nVar = (n) this._cur;
            if (!nVar.b()) {
                f159138a.compareAndSet(this, nVar, nVar.d());
            } else {
                return;
            }
        }
    }

    public final E c() {
        while (true) {
            n nVar = (n) this._cur;
            E e2 = (E) nVar.c();
            if (e2 != n.f159139a) {
                return e2;
            }
            f159138a.compareAndSet(this, nVar, nVar.d());
        }
    }

    public final boolean a(E e2) {
        while (true) {
            n nVar = (n) this._cur;
            int a2 = nVar.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                f159138a.compareAndSet(this, nVar, nVar.d());
            } else if (a2 == 2) {
                return false;
            }
        }
    }
}
