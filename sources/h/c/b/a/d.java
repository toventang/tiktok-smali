package h.c.b.a;

import com.bytedance.covode.number.Covode;
import h.c.e;
import h.c.f;
import h.f.b.l;

public abstract class d extends a {
    private final f _context;
    private transient h.c.d<Object> intercepted;

    static {
        Covode.recordClassIndex(105114);
    }

    @Override // h.c.d
    public f getContext() {
        f fVar = this._context;
        if (fVar == null) {
            l.b();
        }
        return fVar;
    }

    public final h.c.d<Object> intercepted() {
        h.c.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().get(e.f158671b);
            if (eVar == null || (dVar = eVar.interceptContinuation(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    @Override // h.c.b.a.a
    public void releaseIntercepted() {
        h.c.d<?> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            f.b bVar = getContext().get(e.f158671b);
            if (bVar == null) {
                l.b();
            }
            ((e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = c.f158662a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(h.c.d<java.lang.Object> r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            h.c.f r0 = r2.getContext()
        L_0x0006:
            r1.<init>(r2, r0)
            return
        L_0x000a:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.b.a.d.<init>(h.c.d):void");
    }

    public d(h.c.d<Object> dVar, f fVar) {
        super(dVar);
        this._context = fVar;
    }
}
