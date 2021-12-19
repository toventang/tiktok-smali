package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.z;

public final class t extends cb<JobSupport> implements s {

    /* renamed from: a  reason: collision with root package name */
    public final u f159216a;

    static {
        Covode.recordClassIndex(105710);
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "ChildHandle[" + this.f159216a + ']';
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
        this.f159216a.a((cm) this.f159084c);
    }

    @Override // kotlinx.coroutines.s
    public final boolean b(Throwable th) {
        return ((JobSupport) this.f159084c).c(th);
    }

    public t(JobSupport jobSupport, u uVar) {
        super(jobSupport);
        this.f159216a = uVar;
    }
}
