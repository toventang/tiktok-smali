package h.c;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.a.m;
import h.f.b.l;

public abstract class a implements f.b {
    private final f.c<?> key;

    static {
        Covode.recordClassIndex(105101);
    }

    @Override // h.c.f.b
    public f.c<?> getKey() {
        return this.key;
    }

    public a(f.c<?> cVar) {
        l.d(cVar, "");
        this.key = cVar;
    }

    @Override // h.c.f.b, h.c.f
    public <E extends f.b> E get(f.c<E> cVar) {
        l.d(cVar, "");
        return (E) f.b.a.a(this, cVar);
    }

    @Override // h.c.f
    public f minusKey(f.c<?> cVar) {
        l.d(cVar, "");
        return f.b.a.b(this, cVar);
    }

    @Override // h.c.f
    public f plus(f fVar) {
        l.d(fVar, "");
        return f.b.a.a(this, fVar);
    }

    @Override // h.c.f
    public <R> R fold(R r, m<? super R, ? super f.b, ? extends R> mVar) {
        l.d(mVar, "");
        return (R) f.b.a.a(this, r, mVar);
    }
}
