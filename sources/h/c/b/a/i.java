package h.c.b.a;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import h.c.g;

public abstract class i extends a {
    static {
        Covode.recordClassIndex(105120);
    }

    @Override // h.c.d
    public f getContext() {
        return g.INSTANCE;
    }

    public i(d<Object> dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != g.INSTANCE) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }
}
