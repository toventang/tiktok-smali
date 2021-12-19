package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.a.c;
import f.a.e.b.b;
import f.a.t;
import f.a.x;
import f.a.z;
import java.util.concurrent.Callable;

public final class k<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final Callable<? extends x<? extends T>> f157672a;

    static {
        Covode.recordClassIndex(104727);
    }

    public k(Callable<? extends x<? extends T>> callable) {
        this.f157672a = callable;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        try {
            ((x) b.a(this.f157672a.call(), "null ObservableSource supplied")).b(zVar);
        } catch (Throwable th) {
            f.a.c.b.a(th);
            c.error(th, zVar);
        }
    }
}
