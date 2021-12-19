package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.z;
import java.util.concurrent.Future;

final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    private final Future<?> f159169a;

    static {
        Covode.recordClassIndex(105683);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f159169a + ']';
    }

    public j(Future<?> future) {
        this.f159169a = future;
    }

    @Override // kotlinx.coroutines.l
    public final void a(Throwable th) {
        this.f159169a.cancel(false);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* synthetic */ z invoke(Throwable th) {
        a(th);
        return z.f158842a;
    }
}
