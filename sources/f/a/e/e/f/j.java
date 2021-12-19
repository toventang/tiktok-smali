package f.a.e.e.f;

import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.ae;
import f.a.e.a.c;
import f.a.e.b.b;
import java.util.concurrent.Callable;

public final class j<T> extends ab<T> {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends Throwable> f157782a;

    static {
        Covode.recordClassIndex(104776);
    }

    public j(Callable<? extends Throwable> callable) {
        this.f157782a = callable;
    }

    @Override // f.a.ab
    public final void a(ae<? super T> aeVar) {
        Throwable th;
        try {
            th = (Throwable) b.a(this.f157782a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            f.a.c.b.a(th);
        }
        c.error(th, aeVar);
    }
}
