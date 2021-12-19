package h.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class a extends h.d.a {
    static {
        Covode.recordClassIndex(105143);
    }

    @Override // h.d.a
    public final void a(Throwable th, Throwable th2) {
        l.d(th, "");
        l.d(th2, "");
        th.addSuppressed(th2);
    }
}
