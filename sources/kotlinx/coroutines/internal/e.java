package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.c.f;
import kotlinx.coroutines.am;

public final class e implements am {

    /* renamed from: a  reason: collision with root package name */
    private final f f159122a;

    static {
        Covode.recordClassIndex(105647);
    }

    @Override // kotlinx.coroutines.am
    public final f a() {
        return this.f159122a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f159122a + ')';
    }

    public e(f fVar) {
        this.f159122a = fVar;
    }
}
