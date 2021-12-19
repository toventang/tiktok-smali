package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.g;
import java.util.concurrent.Executor;

public final class be implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final ah f159039a;

    static {
        Covode.recordClassIndex(105558);
    }

    public final String toString() {
        return this.f159039a.toString();
    }

    public final void execute(Runnable runnable) {
        this.f159039a.dispatch(g.INSTANCE, runnable);
    }
}
