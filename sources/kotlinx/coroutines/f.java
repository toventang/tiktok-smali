package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

public final class f extends EventLoopImplBase {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f159109a;

    static {
        Covode.recordClassIndex(105627);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.bm
    public final Thread getThread() {
        return this.f159109a;
    }

    public f(Thread thread) {
        this.f159109a = thread;
    }
}
