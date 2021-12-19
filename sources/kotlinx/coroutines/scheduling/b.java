package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import h.j.h;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final ah f159187a;

    /* renamed from: d  reason: collision with root package name */
    public static final b f159188d;

    @Override // kotlinx.coroutines.scheduling.c, kotlinx.coroutines.ah
    public final String toString() {
        return "DefaultDispatcher";
    }

    private b() {
    }

    @Override // kotlinx.coroutines.scheduling.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    static {
        Covode.recordClassIndex(105698);
        b bVar = new b();
        f159188d = bVar;
        int a2 = w.a("kotlinx.coroutines.io.parallelism", h.b(64, x.f159159a), 0, 0, 12);
        if (a2 > 0) {
            f159187a = new e(bVar, a2);
            return;
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but have ".concat(String.valueOf(a2)).toString());
    }
}
