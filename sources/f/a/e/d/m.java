package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.c.d;
import f.a.e.c.i;
import f.a.e.f.c;
import f.a.z;
import java.util.concurrent.atomic.AtomicReference;

public final class m<T> extends AtomicReference<b> implements b, z<T> {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final n<T> parent;
    final int prefetch;
    i<T> queue;

    static {
        Covode.recordClassIndex(104449);
    }

    public final void setDone() {
        this.done = true;
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.a.e.a.b.dispose(this);
    }

    public final int fusionMode() {
        return this.fusionMode;
    }

    public final boolean isDone() {
        return this.done;
    }

    public final i<T> queue() {
        return this.queue;
    }

    @Override // f.a.z
    public final void onComplete() {
        this.parent.a(this);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        return f.a.e.a.b.isDisposed((b) get());
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        this.parent.a((m) this, th);
    }

    @Override // f.a.z
    public final void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.a((m) this, (Object) t);
        } else {
            this.parent.a();
        }
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        i<T> bVar2;
        if (f.a.e.a.b.setOnce(this, bVar)) {
            if (bVar instanceof d) {
                d dVar = (d) bVar;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    this.done = true;
                    this.parent.a(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    return;
                }
            }
            int i2 = -this.prefetch;
            if (i2 < 0) {
                bVar2 = new c<>(-i2);
            } else {
                bVar2 = new f.a.e.f.b<>(i2);
            }
            this.queue = bVar2;
        }
    }

    public m(n<T> nVar, int i2) {
        this.parent = nVar;
        this.prefetch = i2;
    }
}
