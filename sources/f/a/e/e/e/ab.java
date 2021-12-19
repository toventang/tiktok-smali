package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import f.a.e.d.j;
import f.a.h.a;
import f.a.t;
import f.a.z;
import java.util.concurrent.Callable;

public final class ab<T> extends t<T> implements Callable<T> {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends T> f157419a;

    static {
        Covode.recordClassIndex(104600);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) b.a(this.f157419a.call(), "The callable returned a null value");
    }

    public ab(Callable<? extends T> callable) {
        this.f157419a = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.e.d.j */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        j jVar = new j(zVar);
        zVar.onSubscribe(jVar);
        if (!jVar.isDisposed()) {
            try {
                jVar.complete(b.a(this.f157419a.call(), "Callable returned null"));
            } catch (Throwable th) {
                f.a.c.b.a(th);
                if (!jVar.isDisposed()) {
                    zVar.onError(th);
                } else {
                    a.a(th);
                }
            }
        }
    }
}
