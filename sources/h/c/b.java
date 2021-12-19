package h.c;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.c.f.b;
import h.f.b.l;

public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: a  reason: collision with root package name */
    private final f.c<?> f158660a;

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.b<f.b, E> f158661b;

    static {
        Covode.recordClassIndex(105110);
    }

    public final E a(f.b bVar) {
        l.d(bVar, "");
        return this.f158661b.invoke(bVar);
    }

    public final boolean a(f.c<?> cVar) {
        l.d(cVar, "");
        if (cVar == this || this.f158660a == cVar) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: h.c.f$c<?> */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.f.a.b<h.c.f$b, E extends B>, h.f.a.b<? super h.c.f$b, ? extends E extends B>, java.lang.Object] */
    public b(f.c<B> cVar, h.f.a.b<? super f.b, ? extends E> bVar) {
        l.d(cVar, "");
        l.d(bVar, "");
        this.f158661b = bVar;
        this.f158660a = cVar instanceof b ? (f.c<B>) ((b) cVar).f158660a : cVar;
    }
}
