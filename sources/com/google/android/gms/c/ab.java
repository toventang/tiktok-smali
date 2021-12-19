package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final class ab implements Executor {
    static {
        Covode.recordClassIndex(31144);
    }

    ab() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
