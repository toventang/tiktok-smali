package f.a.g;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d;
import f.a.e.j.f;
import java.util.concurrent.atomic.AtomicReference;

public abstract class a implements b, d {

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<b> f157953b = new AtomicReference<>();

    static {
        Covode.recordClassIndex(104882);
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.e.a.b.dispose(this.f157953b);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (this.f157953b.get() == f.a.e.a.b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // f.a.d
    public final void onSubscribe(b bVar) {
        f.a(this.f157953b, bVar, getClass());
    }
}
