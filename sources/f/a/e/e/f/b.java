package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.ag;
import f.a.e.a.c;
import java.util.concurrent.Callable;

public final class b<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends ag<? extends T>> f157755a;

    static {
        Covode.recordClassIndex(104761);
    }

    public b(Callable<? extends ag<? extends T>> callable) {
        this.f157755a = callable;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        try {
            ((ag) f.a.e.b.b.a(this.f157755a.call(), "The singleSupplier returned a null SingleSource")).a_(aeVar);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            c.error(th, aeVar);
        }
    }
}
