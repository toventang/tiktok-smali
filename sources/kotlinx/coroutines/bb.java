package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.a.b;
import h.c.d;
import h.c.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.t;

/* access modifiers changed from: package-private */
public final class bb<T> extends t<T> {

    /* renamed from: b  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater f159037b = AtomicIntegerFieldUpdater.newUpdater(bb.class, "_decision");
    volatile int _decision;

    static {
        Covode.recordClassIndex(105555);
    }

    private final boolean j() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f159037b.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.JobSupport
    public final void c(Object obj) {
        b(obj);
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.a
    public final void b(Object obj) {
        if (!j()) {
            ba.a(b.a(this.f159155e), aa.a(obj, this.f159155e));
        }
    }

    public bb(f fVar, d<? super T> dVar) {
        super(fVar, dVar);
    }
}
