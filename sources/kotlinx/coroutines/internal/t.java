package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.c.a.b;
import h.c.b.a.e;
import h.c.d;
import h.c.f;
import kotlinx.coroutines.a;
import kotlinx.coroutines.aa;
import kotlinx.coroutines.ba;

public class t<T> extends a<T> implements e {

    /* renamed from: e  reason: collision with root package name */
    public final d<T> f159155e;

    static {
        Covode.recordClassIndex(105672);
    }

    @Override // h.c.b.a.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean i() {
        return true;
    }

    @Override // h.c.b.a.e
    public final e getCallerFrame() {
        return (e) this.f159155e;
    }

    @Override // kotlinx.coroutines.a
    public void b(Object obj) {
        d<T> dVar = this.f159155e;
        dVar.resumeWith(aa.a(obj, dVar));
    }

    @Override // kotlinx.coroutines.JobSupport
    public void c(Object obj) {
        ba.a(b.a(this.f159155e), aa.a(obj, this.f159155e));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public t(f fVar, d<? super T> dVar) {
        super(fVar, true);
        this.f159155e = dVar;
    }
}
