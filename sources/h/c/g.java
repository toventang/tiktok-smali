package h.c;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import java.io.Serializable;

public final class g implements f, Serializable {
    public static final g INSTANCE = new g();
    private static final long serialVersionUID = 0;

    @Override // h.c.f
    public final <R> R fold(R r, m<? super R, ? super f.b, ? extends R> mVar) {
        l.d(mVar, "");
        return r;
    }

    @Override // h.c.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        l.d(cVar, "");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // h.c.f
    public final f plus(f fVar) {
        l.d(fVar, "");
        return fVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    private g() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    static {
        Covode.recordClassIndex(105137);
    }

    @Override // h.c.f
    public final f minusKey(f.c<?> cVar) {
        l.d(cVar, "");
        return this;
    }
}
