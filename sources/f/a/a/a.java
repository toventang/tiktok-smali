package f.a.a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f157152a = new AtomicBoolean();

    static {
        Covode.recordClassIndex(104349);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return this.f157152a.get();
    }

    @Override // f.a.b.b
    public final void dispose() {
        if (!this.f157152a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a();
        } else {
            f.a.a.a.a.a(f.a.a.b.a.f157156a).a(new Runnable() {
                /* class f.a.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(104350);
                }

                public final void run() {
                    a.this.a();
                }
            });
        }
    }
}
