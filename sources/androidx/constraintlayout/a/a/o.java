package androidx.constraintlayout.a.a;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;

public class o {

    /* renamed from: h  reason: collision with root package name */
    HashSet<o> f1966h = new HashSet<>(2);

    /* renamed from: i  reason: collision with root package name */
    public int f1967i = 0;

    static {
        Covode.recordClassIndex(599);
    }

    public void a() {
    }

    public final boolean e() {
        if (this.f1967i == 1) {
            return true;
        }
        return false;
    }

    public void b() {
        this.f1967i = 0;
        this.f1966h.clear();
    }

    public final void c() {
        this.f1967i = 0;
        Iterator<o> it = this.f1966h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public final void d() {
        this.f1967i = 1;
        Iterator<o> it = this.f1966h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void a(o oVar) {
        this.f1966h.add(oVar);
    }
}
