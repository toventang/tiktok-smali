package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final class o implements Executor {
    static {
        Covode.recordClassIndex(32977);
    }

    o() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
