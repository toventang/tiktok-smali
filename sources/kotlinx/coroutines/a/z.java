package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.q;
import h.r;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.m;
import kotlinx.coroutines.o;

public final class z extends x {

    /* renamed from: a  reason: collision with root package name */
    public final m<h.z> f158996a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f158997b;

    static {
        Covode.recordClassIndex(105510);
    }

    @Override // kotlinx.coroutines.a.x
    public final Object a() {
        return this.f158997b;
    }

    @Override // kotlinx.coroutines.a.x
    public final void c() {
        this.f158996a.b(o.f159174a);
    }

    @Override // kotlinx.coroutines.a.x
    public final v b() {
        Object a2 = this.f158996a.a(h.z.f158842a);
        if (a2 == null) {
            return null;
        }
        if (!ar.f159021a || a2 == o.f159174a) {
            return o.f159174a;
        }
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "SendElement@" + Integer.toHexString(System.identityHashCode(this)) + '(' + this.f158997b + ')';
    }

    @Override // kotlinx.coroutines.a.x
    public final void a(k<?> kVar) {
        this.f158996a.resumeWith(q.m223constructorimpl(r.a(kVar.d())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.m<? super h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public z(Object obj, m<? super h.z> mVar) {
        this.f158997b = obj;
        this.f158996a = mVar;
    }
}
