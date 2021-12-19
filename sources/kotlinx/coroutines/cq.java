package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.z;

final class cq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ah f159098a;

    /* renamed from: b  reason: collision with root package name */
    private final m<z> f159099b;

    static {
        Covode.recordClassIndex(105608);
    }

    public final void run() {
        this.f159099b.a(this.f159098a, z.f158842a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.m<? super h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public cq(ah ahVar, m<? super z> mVar) {
        this.f159098a = ahVar;
        this.f159099b = mVar;
    }
}
