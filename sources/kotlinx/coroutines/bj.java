package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.z;

public final class bj extends ce<bz> {

    /* renamed from: a  reason: collision with root package name */
    private final bh f159046a;

    static {
        Covode.recordClassIndex(105563);
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "DisposeOnCompletion[" + this.f159046a + ']';
    }

    @Override // kotlinx.coroutines.ad
    public final void a(Throwable th) {
        this.f159046a.cJ_();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Throwable th) {
        a(th);
        return z.f158842a;
    }

    public bj(bz bzVar, bh bhVar) {
        super(bzVar);
        this.f159046a = bhVar;
    }
}
