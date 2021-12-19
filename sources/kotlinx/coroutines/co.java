package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.q;
import h.r;
import h.z;

final class co<T> extends ce<JobSupport> {

    /* renamed from: a  reason: collision with root package name */
    private final n<T> f159096a;

    static {
        Covode.recordClassIndex(105606);
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "ResumeAwaitOnCompletion[" + this.f159096a + ']';
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
        Object p = ((JobSupport) this.f159084c).p();
        if (ar.f159021a && !(!(p instanceof bu))) {
            throw new AssertionError();
        } else if (p instanceof CompletedExceptionally) {
            this.f159096a.resumeWith(q.m223constructorimpl(r.a(((CompletedExceptionally) p).cause)));
        } else {
            this.f159096a.resumeWith(q.m223constructorimpl(cf.b(p)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.n<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public co(JobSupport jobSupport, n<? super T> nVar) {
        super(jobSupport);
        this.f159096a = nVar;
    }
}
