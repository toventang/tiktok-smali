package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.b.b;
import f.a.d;
import f.a.e.j.e;
import f.a.e.j.h;
import f.a.p;
import java.util.concurrent.CountDownLatch;

public final class g<T> extends CountDownLatch implements ae<T>, d, p<T> {

    /* renamed from: a  reason: collision with root package name */
    T f157218a;

    /* renamed from: b  reason: collision with root package name */
    Throwable f157219b;

    /* renamed from: c  reason: collision with root package name */
    b f157220c;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f157221d;

    static {
        Covode.recordClassIndex(104443);
    }

    @Override // f.a.p, f.a.d
    public final void onComplete() {
        countDown();
    }

    public g() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                e.a();
                await();
            } catch (InterruptedException e2) {
                this.f157221d = true;
                b bVar = this.f157220c;
                if (bVar != null) {
                    bVar.dispose();
                }
                throw h.a(e2);
            }
        }
        Throwable th = this.f157219b;
        if (th == null) {
            return this.f157218a;
        }
        throw h.a(th);
    }

    @Override // f.a.p, f.a.ae, f.a.d
    public final void onError(Throwable th) {
        this.f157219b = th;
        countDown();
    }

    @Override // f.a.p, f.a.ae
    public final void onSuccess(T t) {
        this.f157218a = t;
        countDown();
    }

    @Override // f.a.p, f.a.ae, f.a.d
    public final void onSubscribe(b bVar) {
        this.f157220c = bVar;
        if (this.f157221d) {
            bVar.dispose();
        }
    }
}
