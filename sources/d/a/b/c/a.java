package d.a.b.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f156548a;

    static {
        Covode.recordClassIndex(103942);
    }

    public final boolean a() {
        b bVar = this.f156548a;
        l.c(bVar, "");
        if (bVar.f156549a.get() != 0) {
            return true;
        }
        return false;
    }

    public a(boolean z) {
        this.f156548a = new b(z ? 1 : 0);
    }

    public final void a(boolean z) {
        b bVar = this.f156548a;
        l.c(bVar, "");
        bVar.f156549a.set(z ? 1 : 0);
    }
}
