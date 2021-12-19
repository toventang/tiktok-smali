package f.a.g;

import com.bytedance.covode.number.Covode;
import f.a.e.j.f;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b<T> implements f.a.b.b, z<T> {

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<f.a.b.b> f157954d = new AtomicReference<>();

    static {
        Covode.recordClassIndex(104883);
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.e.a.b.dispose(this.f157954d);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (this.f157954d.get() == f.a.e.a.b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // f.a.z
    public final void onSubscribe(f.a.b.b bVar) {
        f.a(this.f157954d, bVar, getClass());
    }
}
