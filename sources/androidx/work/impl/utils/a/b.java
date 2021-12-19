package androidx.work.impl.utils.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public enum b implements Executor {
    INSTANCE;

    public final String toString() {
        return "DirectExecutor";
    }

    static {
        Covode.recordClassIndex(1871);
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
