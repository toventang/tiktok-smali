package f.a.e.e.a;

import com.bytedance.covode.number.Covode;
import f.a.b;
import f.a.b.c;
import f.a.d;
import f.a.d.a;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    final a f157243a;

    static {
        Covode.recordClassIndex(104464);
    }

    public f(a aVar) {
        this.f157243a = aVar;
    }

    @Override // f.a.b
    public final void b(d dVar) {
        f.a.b.b a2 = c.a(f.a.e.b.a.f157189b);
        dVar.onSubscribe(a2);
        try {
            this.f157243a.a();
            if (!a2.isDisposed()) {
                dVar.onComplete();
            }
        } catch (Throwable th) {
            f.a.c.b.a(th);
            if (!a2.isDisposed()) {
                dVar.onError(th);
            }
        }
    }
}
