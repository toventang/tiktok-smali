package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import f.a.e.d.j;
import f.a.t;
import f.a.z;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ac<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final Future<? extends T> f157420a;

    /* renamed from: b  reason: collision with root package name */
    final long f157421b = 0;

    /* renamed from: c  reason: collision with root package name */
    final TimeUnit f157422c = null;

    static {
        Covode.recordClassIndex(104601);
    }

    public ac(Future<? extends T> future) {
        this.f157420a = future;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.e.d.j */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        Object obj;
        j jVar = new j(zVar);
        zVar.onSubscribe(jVar);
        if (!jVar.isDisposed()) {
            try {
                TimeUnit timeUnit = this.f157422c;
                if (timeUnit != null) {
                    obj = this.f157420a.get(this.f157421b, timeUnit);
                } else {
                    obj = this.f157420a.get();
                }
                jVar.complete(b.a(obj, "Future returned null"));
            } catch (Throwable th) {
                f.a.c.b.a(th);
                if (!jVar.isDisposed()) {
                    zVar.onError(th);
                }
            }
        }
    }
}
