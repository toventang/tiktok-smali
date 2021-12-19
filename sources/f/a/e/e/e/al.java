package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.c.g;
import f.a.e.e.e.ay;
import f.a.t;
import f.a.z;

public final class al<T> extends t<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f157454a;

    static {
        Covode.recordClassIndex(104619);
    }

    @Override // f.a.e.c.g, java.util.concurrent.Callable
    public final T call() {
        return this.f157454a;
    }

    public al(T t) {
        this.f157454a = t;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        ay.a aVar = new ay.a(zVar, this.f157454a);
        zVar.onSubscribe(aVar);
        aVar.run();
    }
}
