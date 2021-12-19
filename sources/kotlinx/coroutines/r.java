package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.f.b.l;
import h.z;

public final class r extends cb<bz> {

    /* renamed from: a  reason: collision with root package name */
    public final n<?> f159176a;

    static {
        Covode.recordClassIndex(105691);
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "ChildContinuation[" + this.f159176a + ']';
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Throwable th) {
        a(th);
        return z.f158842a;
    }

    @Override // kotlinx.coroutines.ad
    public final void a(Throwable th) {
        n<?> nVar = this.f159176a;
        Throwable a2 = nVar.a(this.f159084c);
        if (nVar.f159038f == 0) {
            d<T> dVar = nVar.f159172a;
            if (!(dVar instanceof az)) {
                dVar = null;
            }
            az azVar = (az) dVar;
            if (azVar != null) {
                while (true) {
                    Object obj = azVar._reusableCancellableContinuation;
                    if (l.a(obj, ba.f159036b)) {
                        if (az.f159028c.compareAndSet(azVar, ba.f159036b, a2)) {
                            return;
                        }
                    } else if (!(obj instanceof Throwable)) {
                        if (az.f159028c.compareAndSet(azVar, obj, null)) {
                            break;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        nVar.b(a2);
        nVar.f();
    }

    public r(bz bzVar, n<?> nVar) {
        super(bzVar);
        this.f159176a = nVar;
    }
}
