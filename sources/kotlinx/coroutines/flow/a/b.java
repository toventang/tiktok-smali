package kotlinx.coroutines.flow.a;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.z;
import kotlinx.coroutines.a.y;
import kotlinx.coroutines.flow.a;

public final class b<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final y<T> f159110a;

    static {
        Covode.recordClassIndex(105633);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.a.y<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(y<? super T> yVar) {
        this.f159110a = yVar;
    }

    @Override // kotlinx.coroutines.flow.a
    public final Object a(T t, d<? super z> dVar) {
        Object a2 = this.f159110a.a(t, dVar);
        if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            return a2;
        }
        return z.f158842a;
    }
}
