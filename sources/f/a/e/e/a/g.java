package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.b;
import f.a.b.c;
import f.a.d;
import f.a.e.b.a;
import java.util.concurrent.Callable;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    final Callable<?> f157244a;

    static {
        Covode.recordClassIndex(104465);
    }

    public g(Callable<?> callable) {
        this.f157244a = callable;
    }

    @Override // f.a.b
    public final void b(d dVar) {
        f.a.b.b a2 = c.a(a.f157189b);
        dVar.onSubscribe(a2);
        try {
            this.f157244a.call();
            if (!a2.isDisposed()) {
                dVar.onComplete();
            }
        } catch (Throwable th) {
            f.a.c.b.a(th);
            if (!a2.isDisposed()) {
                dVar.onError(th);
            } else {
                f.a.h.a.a(th);
            }
        }
    }
}
