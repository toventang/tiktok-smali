package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.z;
import kotlinx.coroutines.internal.l;

public final class cn extends k {

    /* renamed from: a  reason: collision with root package name */
    private final l f159095a;

    static {
        Covode.recordClassIndex(105605);
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.f159095a + ']';
    }

    public cn(l lVar) {
        this.f159095a = lVar;
    }

    @Override // kotlinx.coroutines.l
    public final void a(Throwable th) {
        this.f159095a.cK_();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Throwable th) {
        a(th);
        return z.f158842a;
    }
}
