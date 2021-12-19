package b;

import com.bytedance.covode.number.Covode;

public final class h extends RuntimeException {
    static {
        Covode.recordClassIndex(1899);
    }

    public h(Exception exc) {
        super("An exception was thrown by an Executor", exc);
    }
}
