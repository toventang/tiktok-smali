package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;

final class bg implements bh {

    /* renamed from: a  reason: collision with root package name */
    private final Future<?> f159044a;

    static {
        Covode.recordClassIndex(105560);
    }

    @Override // kotlinx.coroutines.bh
    public final void cJ_() {
        this.f159044a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f159044a + ']';
    }

    public bg(Future<?> future) {
        this.f159044a = future;
    }
}
