package f.a.e.e.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.b.c;
import f.a.e.b.a;
import f.a.n;
import f.a.p;
import java.util.concurrent.Callable;

public final class k<T> extends n<T> implements Callable<T> {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends T> f157369a;

    static {
        Covode.recordClassIndex(104563);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.f157369a.call();
    }

    public k(Callable<? extends T> callable) {
        this.f157369a = callable;
    }

    @Override // f.a.n
    public final void b(p<? super T> pVar) {
        b a2 = c.a(a.f157189b);
        pVar.onSubscribe(a2);
        if (!a2.isDisposed()) {
            try {
                Object obj = (Object) this.f157369a.call();
                if (a2.isDisposed()) {
                    return;
                }
                if (obj == 0) {
                    pVar.onComplete();
                } else {
                    pVar.onSuccess(obj);
                }
            } catch (Throwable th) {
                f.a.c.b.a(th);
                if (!a2.isDisposed()) {
                    pVar.onError(th);
                } else {
                    f.a.h.a.a(th);
                }
            }
        }
    }
}
