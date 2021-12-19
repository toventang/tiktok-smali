package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.e.a.c;
import f.a.e.c.g;
import f.a.n;
import f.a.p;

public final class m<T> extends n<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    final T f157373a;

    static {
        Covode.recordClassIndex(104566);
    }

    @Override // f.a.e.c.g, java.util.concurrent.Callable
    public final T call() {
        return this.f157373a;
    }

    public m(T t) {
        this.f157373a = t;
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        pVar.onSubscribe(c.INSTANCE);
        pVar.onSuccess(this.f157373a);
    }
}
