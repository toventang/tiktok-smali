package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.z;

/* access modifiers changed from: package-private */
public final class bi extends k {

    /* renamed from: a  reason: collision with root package name */
    private final bh f159045a;

    static {
        Covode.recordClassIndex(105562);
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f159045a + ']';
    }

    public bi(bh bhVar) {
        this.f159045a = bhVar;
    }

    @Override // kotlinx.coroutines.l
    public final void a(Throwable th) {
        this.f159045a.cJ_();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Throwable th) {
        a(th);
        return z.f158842a;
    }
}
