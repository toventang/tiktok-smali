package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.d;
import f.a.e.a.c;
import f.a.f;
import java.util.concurrent.Callable;

public final class b extends f.a.b {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends f> f157235a;

    static {
        Covode.recordClassIndex(104459);
    }

    public b(Callable<? extends f> callable) {
        this.f157235a = callable;
    }

    @Override // f.a.b
    public final void b(d dVar) {
        try {
            ((f) f.a.e.b.b.a(this.f157235a.call(), "The completableSupplier returned a null CompletableSource")).a(dVar);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            c.error(th, dVar);
        }
    }
}
