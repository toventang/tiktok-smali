package com.google.android.play.core.d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class c implements ThreadFactory {
    static {
        Covode.recordClassIndex(32877);
    }

    c() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
