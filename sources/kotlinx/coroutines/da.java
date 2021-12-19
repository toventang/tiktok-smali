package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import kotlinx.coroutines.internal.t;

public final class da<U, T extends U> extends t<T> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final long f159103b = 3000;

    static {
        Covode.recordClassIndex(105620);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.a
    public final String h() {
        return super.h() + "(timeMillis=" + this.f159103b + ')';
    }

    public final void run() {
        d((Throwable) new cz("Timed out waiting for " + this.f159103b + " ms", this));
    }

    public da(d<? super U> dVar) {
        super(dVar.getContext(), dVar);
    }
}
