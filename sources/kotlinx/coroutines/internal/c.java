package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.ar;

public abstract class c<T> extends r {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f159120a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    volatile Object _consensus = b.f159118a;

    static {
        Covode.recordClassIndex(105645);
    }

    public abstract Object a();

    public abstract void a(T t, Object obj);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.r
    public final Object a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == b.f159118a) {
            obj2 = a();
            if (!ar.f159021a || obj2 != b.f159118a) {
                Object obj3 = this._consensus;
                if (obj3 != b.f159118a) {
                    obj2 = obj3;
                } else if (!f159120a.compareAndSet(this, b.f159118a, obj2)) {
                    obj2 = this._consensus;
                }
            } else {
                throw new AssertionError();
            }
        }
        a(obj, obj2);
        return obj2;
    }
}
