package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.q;
import h.z;

final class cp extends ce<bz> {

    /* renamed from: a  reason: collision with root package name */
    private final d<z> f159097a;

    static {
        Covode.recordClassIndex(105607);
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "ResumeOnCompletion[" + this.f159097a + ']';
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
        this.f159097a.resumeWith(q.m223constructorimpl(z.f158842a));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.c.d<? super h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public cp(bz bzVar, d<? super z> dVar) {
        super(bzVar);
        this.f159097a = dVar;
    }
}
