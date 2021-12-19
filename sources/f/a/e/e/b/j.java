package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import f.a.h;
import f.a.h.a;
import java.util.concurrent.Callable;
import org.a.c;

public final class j<T> extends h<T> implements Callable<T> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends T> f157318b;

    static {
        Covode.recordClassIndex(104509);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) b.a(this.f157318b.call(), "The callable returned a null value");
    }

    public j(Callable<? extends T> callable) {
        this.f157318b = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.e.i.b */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        f.a.e.i.b bVar = new f.a.e.i.b(cVar);
        cVar.onSubscribe(bVar);
        try {
            bVar.complete(b.a(this.f157318b.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            f.a.c.b.a(th);
            if (bVar.isCancelled()) {
                a.a(th);
            } else {
                cVar.onError(th);
            }
        }
    }
}
