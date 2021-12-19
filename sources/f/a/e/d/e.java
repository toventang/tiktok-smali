package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.j.h;
import f.a.z;
import java.util.concurrent.CountDownLatch;

public abstract class e<T> extends CountDownLatch implements b, z<T> {

    /* renamed from: a  reason: collision with root package name */
    T f157214a;

    /* renamed from: b  reason: collision with root package name */
    Throwable f157215b;

    /* renamed from: c  reason: collision with root package name */
    b f157216c;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f157217d;

    static {
        Covode.recordClassIndex(104441);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return this.f157217d;
    }

    @Override // f.a.z
    public final void onComplete() {
        countDown();
    }

    public e() {
        super(1);
    }

    @Override // f.a.b.b
    public final void dispose() {
        this.f157217d = true;
        b bVar = this.f157216c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                f.a.e.j.e.a();
                await();
            } catch (InterruptedException e2) {
                dispose();
                throw h.a(e2);
            }
        }
        Throwable th = this.f157215b;
        if (th == null) {
            return this.f157214a;
        }
        throw h.a(th);
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        this.f157216c = bVar;
        if (this.f157217d) {
            bVar.dispose();
        }
    }
}
