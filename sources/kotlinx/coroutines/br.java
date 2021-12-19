package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class br extends bq {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f159053a;

    static {
        Covode.recordClassIndex(105573);
    }

    @Override // kotlinx.coroutines.bp
    public final Executor a() {
        return this.f159053a;
    }

    public br(Executor executor) {
        this.f159053a = executor;
        b();
    }
}
