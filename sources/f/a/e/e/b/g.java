package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import f.a.h;
import java.util.concurrent.Callable;
import org.a.c;

public final class g<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<? extends Throwable> f157308b;

    static {
        Covode.recordClassIndex(104502);
    }

    public g(Callable<? extends Throwable> callable) {
        this.f157308b = callable;
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        Throwable th;
        try {
            th = (Throwable) b.a(this.f157308b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            f.a.c.b.a(th);
        }
        f.a.e.i.c.error(th, cVar);
    }
}
