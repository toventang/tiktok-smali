package f.a.m;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.i.f;
import f.a.l;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public abstract class a<T> implements b, l<T> {

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<d> f158056c = new AtomicReference<>();

    static {
        Covode.recordClassIndex(104932);
    }

    @Override // f.a.b.b
    public final void dispose() {
        f.cancel(this.f158056c);
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (this.f158056c.get() == f.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(d dVar) {
        AtomicReference<d> atomicReference = this.f158056c;
        Class<?> cls = getClass();
        f.a.e.b.b.a((Object) dVar, "next is null");
        if (!atomicReference.compareAndSet(null, dVar)) {
            dVar.cancel();
            if (atomicReference.get() != f.CANCELLED) {
                f.a.e.j.f.a(cls);
                return;
            }
            return;
        }
        this.f158056c.get().request(Long.MAX_VALUE);
    }
}
