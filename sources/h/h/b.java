package h.h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.k.i;

/* access modifiers changed from: package-private */
public final class b<T> implements e<Object, T> {

    /* renamed from: a  reason: collision with root package name */
    private T f158736a;

    static {
        Covode.recordClassIndex(105250);
    }

    @Override // h.h.e
    public final void a(i<?> iVar, T t) {
        l.d(iVar, "");
        l.d(t, "");
        this.f158736a = t;
    }

    @Override // h.h.d, h.h.e
    public final T a(Object obj, i<?> iVar) {
        l.d(iVar, "");
        T t = this.f158736a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + iVar.getName() + " should be initialized before get.");
    }
}
