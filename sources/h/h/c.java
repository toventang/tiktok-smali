package h.h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.k.i;

public abstract class c<V> implements e<Object, V> {

    /* renamed from: a  reason: collision with root package name */
    private V f158737a;

    static {
        Covode.recordClassIndex(105251);
    }

    /* access modifiers changed from: protected */
    public void a(i<?> iVar, V v, V v2) {
        l.d(iVar, "");
    }

    public c(V v) {
        this.f158737a = v;
    }

    @Override // h.h.d, h.h.e
    public final V a(Object obj, i<?> iVar) {
        l.d(iVar, "");
        return this.f158737a;
    }

    @Override // h.h.e
    public final void a(i<?> iVar, V v) {
        l.d(iVar, "");
        V v2 = this.f158737a;
        l.d(iVar, "");
        this.f158737a = v;
        a(iVar, v2, v);
    }
}
