package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.a.c;
import f.a.e.b.b;
import f.a.t;
import f.a.z;
import java.util.concurrent.Callable;

public final class w<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends Throwable> f157741a;

    static {
        Covode.recordClassIndex(104751);
    }

    public w(Callable<? extends Throwable> callable) {
        this.f157741a = callable;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        Throwable th;
        try {
            th = (Throwable) b.a(this.f157741a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            f.a.c.b.a(th);
        }
        c.error(th, zVar);
    }
}
